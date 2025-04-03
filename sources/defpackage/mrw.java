package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrw implements mrc {
    private final MediaCodec a;
    private final mqz b;

    public mrw(MediaCodec mediaCodec, mqz mqzVar) {
        this.a = mediaCodec;
        this.b = mqzVar;
        if (lvf.a < 35 || mqzVar == null) {
            return;
        }
        mqzVar.a(mediaCodec);
    }

    @Override // defpackage.mrc
    public final int a() {
        return this.a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.mrc
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.mrc
    public final MediaFormat c() {
        return this.a.getOutputFormat();
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
        this.a.flush();
    }

    @Override // defpackage.mrc
    public final void i() {
        mqz mqzVar;
        mqz mqzVar2;
        try {
            if (lvf.a >= 30 && lvf.a < 33) {
                this.a.stop();
            }
            if (lvf.a >= 35 && (mqzVar2 = this.b) != null) {
                mqzVar2.b(this.a);
            }
            this.a.release();
        } catch (Throwable th) {
            if (lvf.a >= 35 && (mqzVar = this.b) != null) {
                mqzVar.b(this.a);
            }
            this.a.release();
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
        this.a.setParameters(bundle);
    }

    @Override // defpackage.mrc
    public final void m(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.mrc
    public final void n(int i, int i2, long j, int i3) {
        this.a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.mrc
    public final void o(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.mrc
    public final void p(int i, lxv lxvVar, long j) {
        this.a.queueSecureInputBuffer(i, 0, lxvVar.i, j, 0);
    }

    @Override // defpackage.mrc
    public final /* synthetic */ void q() {
    }
}
