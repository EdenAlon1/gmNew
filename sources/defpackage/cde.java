package defpackage;

import android.graphics.SurfaceTexture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cde implements bjt {
    final /* synthetic */ SurfaceTexture a;
    final /* synthetic */ cdf b;

    public cde(cdf cdfVar, SurfaceTexture surfaceTexture) {
        this.b = cdfVar;
        this.a = surfaceTexture;
    }

    @Override // defpackage.bjt
    public final void a(Throwable th) {
        throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
    }

    @Override // defpackage.bjt
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ksw.d(((axq) obj).a() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
        avw.a("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
        this.a.release();
        cdg cdgVar = this.b.a;
        if (cdgVar.i != null) {
            cdgVar.i = null;
        }
    }
}
