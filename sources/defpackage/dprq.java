package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dprq implements ljv {
    final /* synthetic */ dprt a;
    private axz b;

    public dprq(dprt dprtVar) {
        this.a = dprtVar;
    }

    @Override // defpackage.ljv
    public final void c(lkr lkrVar) {
        this.b = (axz) this.a.l.c();
        enrr enrrVar = (enrr) dprt.a.h().h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraManagerImpl$stateRestorer$1", "onPause", 138, "CameraManagerImpl.kt");
        axz axzVar = this.b;
        enrrVar.t("Camera pausing, saving zoom ratio %.2f", axzVar != null ? Float.valueOf(axzVar.c()) : null);
    }

    @Override // defpackage.ljv
    public final void d(lkr lkrVar) {
        axz axzVar = this.b;
        Float valueOf = axzVar != null ? Float.valueOf(axzVar.c()) : null;
        if (valueOf != null) {
            ((enrr) dprt.a.h().h("com/google/android/libraries/compose/cameragallery/ui/camera/inapp/CameraManagerImpl$stateRestorer$1", "onResume", 131, "CameraManagerImpl.kt")).t("Camera resumed, restoring zoom ratio %.2f", valueOf);
            this.a.p(valueOf.floatValue());
        }
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ff(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
