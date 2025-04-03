package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mqp implements mrc {
    public final MediaCodec a;
    public final mqv b;
    public final mrd c;
    public final mqz d;
    public int e = 0;
    private boolean f;

    public mqp(MediaCodec mediaCodec, HandlerThread handlerThread, mrd mrdVar, mqz mqzVar) {
        this.a = mediaCodec;
        this.b = new mqv(handlerThread);
        this.c = mrdVar;
        this.d = mqzVar;
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.mrc
    public final int a() {
        this.c.c();
        mqv mqvVar = this.b;
        synchronized (mqvVar.a) {
            mqvVar.b();
            int i = -1;
            if (mqvVar.c()) {
                return -1;
            }
            if (!mqvVar.d.d()) {
                i = mqvVar.d.a();
            }
            return i;
        }
    }

    @Override // defpackage.mrc
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        this.c.c();
        mqv mqvVar = this.b;
        synchronized (mqvVar.a) {
            mqvVar.b();
            if (mqvVar.c()) {
                return -1;
            }
            if (mqvVar.e.d()) {
                return -1;
            }
            int a = mqvVar.e.a();
            if (a >= 0) {
                lti.g(mqvVar.h);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) mqvVar.f.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (a == -2) {
                mqvVar.h = (MediaFormat) mqvVar.g.remove();
                a = -2;
            }
            return a;
        }
    }

    @Override // defpackage.mrc
    public final MediaFormat c() {
        MediaFormat mediaFormat;
        mqv mqvVar = this.b;
        synchronized (mqvVar.a) {
            mediaFormat = mqvVar.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.mrc
    public final ByteBuffer e(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.mrc
    public final ByteBuffer f(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.mrc
    public final void g() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.mrc
    public final void h() {
        this.c.b();
        this.a.flush();
        final mqv mqvVar = this.b;
        synchronized (mqvVar.a) {
            mqvVar.i++;
            Handler handler = mqvVar.c;
            int i = lvf.a;
            handler.post(new Runnable() { // from class: mqu
                @Override // java.lang.Runnable
                public final void run() {
                    mqv mqvVar2 = mqv.this;
                    synchronized (mqvVar2.a) {
                        if (mqvVar2.j) {
                            return;
                        }
                        long j = mqvVar2.i - 1;
                        mqvVar2.i = j;
                        if (j > 0) {
                            return;
                        }
                        if (j >= 0) {
                            mqvVar2.a();
                            return;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException();
                        synchronized (mqvVar2.a) {
                            mqvVar2.k = illegalStateException;
                        }
                    }
                }
            });
        }
        this.a.start();
    }

    @Override // defpackage.mrc
    public final void i() {
        mqz mqzVar;
        mqz mqzVar2;
        try {
            try {
                if (this.e == 1) {
                    mrd mrdVar = this.c;
                    if (((mqt) mrdVar).h) {
                        ((mqt) mrdVar).b();
                        ((mqt) mrdVar).d.quit();
                    }
                    ((mqt) mrdVar).h = false;
                    mqv mqvVar = this.b;
                    synchronized (mqvVar.a) {
                        mqvVar.j = true;
                        mqvVar.b.quit();
                        mqvVar.a();
                    }
                }
                this.e = 2;
            } finally {
                if (!this.f) {
                    if (lvf.a >= 30 && lvf.a < 33) {
                        this.a.stop();
                    }
                    if (lvf.a >= 35 && (mqzVar = this.d) != null) {
                        mqzVar.b(this.a);
                    }
                    this.a.release();
                    this.f = true;
                }
            }
        } catch (Throwable th) {
            if (lvf.a >= 35 && (mqzVar2 = this.d) != null) {
                mqzVar2.b(this.a);
            }
            this.a.release();
            this.f = true;
            throw th;
        }
    }

    @Override // defpackage.mrc
    public final void j(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.mrc
    public final void k(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.mrc
    public final void l(Bundle bundle) {
        mqt mqtVar = (mqt) this.c;
        mqtVar.c();
        Handler handler = mqtVar.e;
        int i = lvf.a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.mrc
    public final void m(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.mrc
    public final void n(int i, int i2, long j, int i3) {
        mqt mqtVar = (mqt) this.c;
        mqtVar.c();
        mqs a = mqt.a();
        a.a(i, i2, j, i3);
        Handler handler = mqtVar.e;
        int i4 = lvf.a;
        handler.obtainMessage(1, a).sendToTarget();
    }

    @Override // defpackage.mrc
    public final void o(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.mrc
    public final void p(int i, lxv lxvVar, long j) {
        mqt mqtVar = (mqt) this.c;
        mqtVar.c();
        mqs a = mqt.a();
        a.a(i, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = a.d;
        cryptoInfo.numSubSamples = lxvVar.f;
        cryptoInfo.numBytesOfClearData = mqt.e(lxvVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = mqt.e(lxvVar.e, cryptoInfo.numBytesOfEncryptedData);
        byte[] d = mqt.d(lxvVar.b, cryptoInfo.key);
        lti.f(d);
        cryptoInfo.key = d;
        byte[] d2 = mqt.d(lxvVar.a, cryptoInfo.iv);
        lti.f(d2);
        cryptoInfo.iv = d2;
        cryptoInfo.mode = lxvVar.c;
        int i2 = lvf.a;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(lxvVar.g, lxvVar.h));
        mqtVar.e.obtainMessage(2, a).sendToTarget();
    }

    @Override // defpackage.mrc
    public final void q() {
        synchronized (this.b.a) {
        }
    }
}
