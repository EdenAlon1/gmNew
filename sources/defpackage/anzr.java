package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anzr implements ctbj {
    final /* synthetic */ anzu a;

    public anzr(anzu anzuVar) {
        this.a = anzuVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        anzu anzuVar = this.a;
        axol.k(anzuVar.a, null, new anzq(anzuVar, null), 3);
    }

    @Override // defpackage.ctbj
    public final void fO() {
        this.a.f.set(false);
        anzu anzuVar = this.a;
        synchronized (anzuVar.e) {
            ctbx ctbxVar = anzuVar.c;
            if (ctbxVar != null) {
                ctbxVar.a();
            }
            anzuVar.c = null;
        }
    }
}
