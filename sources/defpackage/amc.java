package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amc implements bjt {
    final /* synthetic */ Surface a;
    final /* synthetic */ SurfaceTexture b;

    public amc(Surface surface, SurfaceTexture surfaceTexture) {
        this.a = surface;
        this.b = surfaceTexture;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.release();
        this.b.release();
    }
}
