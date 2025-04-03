package defpackage;

import android.media.MediaCodec;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxv implements bxt {
    public final MediaCodec.BufferInfo a;
    private final MediaCodec b;
    private final int c;
    private final ByteBuffer d;
    private final ListenableFuture e;
    private final kfb f;
    private final AtomicBoolean g = new AtomicBoolean(false);

    public bxv(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        ksw.h(mediaCodec);
        this.b = mediaCodec;
        this.c = i;
        this.d = mediaCodec.getOutputBuffer(i);
        ksw.h(bufferInfo);
        this.a = bufferInfo;
        final AtomicReference atomicReference = new AtomicReference();
        this.e = kfg.a(new kfd() { // from class: bxu
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                atomicReference.set(kfbVar);
                return "Data closed";
            }
        });
        kfb kfbVar = (kfb) atomicReference.get();
        ksw.h(kfbVar);
        this.f = kfbVar;
    }

    @Override // defpackage.bxt
    public final long a() {
        return this.a.presentationTimeUs;
    }

    @Override // defpackage.bxt
    public final long b() {
        return this.a.size;
    }

    @Override // defpackage.bxt
    public final MediaCodec.BufferInfo c() {
        return this.a;
    }

    @Override // defpackage.bxt, java.lang.AutoCloseable
    public final void close() {
        if (this.g.getAndSet(true)) {
            return;
        }
        try {
            this.b.releaseOutputBuffer(this.c, false);
            this.f.b(null);
        } catch (IllegalStateException e) {
            this.f.c(e);
        }
    }

    @Override // defpackage.bxt
    public final ByteBuffer d() {
        if (this.g.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
        this.d.position(this.a.offset);
        ByteBuffer byteBuffer = this.d;
        MediaCodec.BufferInfo bufferInfo = this.a;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.d;
    }

    @Override // defpackage.bxt
    public final boolean e() {
        return (this.a.flags & 1) != 0;
    }

    public final ListenableFuture f() {
        return bkj.d(this.e);
    }
}
