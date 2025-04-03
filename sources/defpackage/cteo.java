package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cteo implements SurfaceTexture.OnFrameAvailableListener {
    public static final int a = (int) TimeUnit.SECONDS.toMillis(5);
    public SurfaceTexture b;
    public Surface c;
    public final Object d = new Object();
    public final ctep e;
    public volatile boolean f;

    /* JADX WARN: Removed duplicated region for block: B:35:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private cteo(float r8, float r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cteo.<init>(float, float, boolean):void");
    }

    public static cteo a(float f, float f2, boolean z) {
        cteo cteoVar = new cteo(f, f2, z);
        SurfaceTexture surfaceTexture = new SurfaceTexture(cteoVar.e.e);
        cteoVar.b = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(cteoVar);
        cteoVar.c = new Surface(cteoVar.b);
        return cteoVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this.d) {
            if (this.f) {
                throw new RuntimeException("frameAvailable already set, frame could be dropped");
            }
            this.f = true;
            this.d.notifyAll();
        }
    }
}
