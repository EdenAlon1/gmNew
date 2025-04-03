package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hrp extends hrq {
    public hrp(long j, hsd hsdVar) {
        super(j, hsdVar, null, hrm.a);
    }

    @Override // defpackage.hrq
    public final hrq a(ffji ffjiVar, ffji ffjiVar2) {
        return (hrq) hsj.c(new hrn(ffjiVar, ffjiVar2));
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final hrw b(ffji ffjiVar) {
        return (hrt) hsj.c(new hro(ffjiVar));
    }

    @Override // defpackage.hrq
    public final hrz c() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final void d() {
        synchronized (hsj.c) {
            z();
        }
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final void e() {
        hsj.r();
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final /* bridge */ /* synthetic */ void f() {
        hsw.a();
        throw new ffbx();
    }

    @Override // defpackage.hrq, defpackage.hrw
    public final /* bridge */ /* synthetic */ void g() {
        hsw.a();
        throw new ffbx();
    }
}
