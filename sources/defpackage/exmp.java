package defpackage;

import android.media.MediaCodec;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exmp extends exmo {
    private static final String p = "exmp";
    public Surface n;
    public boolean o;

    public exmp(exmn exmnVar, int i, int i2, int i3) {
        super(exmnVar, 100000L, 500000L, 33333L);
        this.o = false;
        try {
            a(exmnVar.d, i, i2, i3);
        } catch (MediaCodec.CodecException | NullPointerException unused) {
            throw new RuntimeException("Unable to create video encoder");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(android.media.MediaMuxer r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exmp.a(android.media.MediaMuxer, int, int, int):void");
    }

    @Override // defpackage.exmo
    public final void c() {
        emxf.a(this.j);
        emxf.a(!this.l);
        if (this.o) {
            this.g.signalEndOfInputStream();
        } else {
            super.c();
        }
    }

    @Override // defpackage.exmo
    public final void d() {
        super.d();
        Surface surface = this.n;
        if (surface != null) {
            surface.release();
            this.n = null;
        }
    }
}
