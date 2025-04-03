package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mqv extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public long i;
    public boolean j;
    public IllegalStateException k;
    private MediaFormat l;
    private MediaCodec.CodecException m;
    private MediaCodec.CryptoException n;
    public final Object a = new Object();
    public final cmm d = new cmm();
    public final cmm e = new cmm();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public mqv(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    private final void d(MediaFormat mediaFormat) {
        this.e.b(-2);
        this.g.add(mediaFormat);
    }

    public final void a() {
        if (!this.g.isEmpty()) {
            this.l = (MediaFormat) this.g.getLast();
        }
        this.d.c();
        this.e.c();
        this.f.clear();
        this.g.clear();
    }

    public final void b() {
        IllegalStateException illegalStateException = this.k;
        if (illegalStateException != null) {
            this.k = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.m;
        if (codecException != null) {
            this.m = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.n;
        if (cryptoException == null) {
            return;
        }
        this.n = null;
        throw cryptoException;
    }

    public final boolean c() {
        return this.i > 0 || this.j;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.a) {
            this.n = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.a) {
            this.m = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.a) {
            this.d.b(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.a) {
            MediaFormat mediaFormat = this.l;
            if (mediaFormat != null) {
                d(mediaFormat);
                this.l = null;
            }
            this.e.b(i);
            this.f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.a) {
            d(mediaFormat);
            this.l = null;
        }
    }
}
