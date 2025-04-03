package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoaf implements ctbj {
    final /* synthetic */ aoai a;

    public aoaf(aoai aoaiVar) {
        this.a = aoaiVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        aoai aoaiVar = this.a;
        axol.k(aoaiVar.a, null, new aoae(aoaiVar, null), 3);
    }

    @Override // defpackage.ctbj
    public final void fO() {
        this.a.f.set(false);
        aoai aoaiVar = this.a;
        synchronized (aoaiVar.e) {
            ctbx ctbxVar = aoaiVar.c;
            if (ctbxVar != null) {
                ctbxVar.a();
            }
            aoaiVar.c = null;
        }
    }
}
