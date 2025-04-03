package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aelm implements ctbj {
    final /* synthetic */ aelp a;

    public aelm(aelp aelpVar) {
        this.a = aelpVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final aelp aelpVar = this.a;
        aelpVar.f = ctbt.b(aelpVar.b.a(new awth() { // from class: aell
            @Override // defpackage.ctbf
            public final elfl a(Object obj) {
                elfl c;
                aelp aelpVar2 = aelp.this;
                c = axol.c(aelpVar2.a, ffhe.a, ffsm.a, new aelo(aelpVar2, null));
                return c;
            }
        }));
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.a.f;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        this.a.f = null;
    }
}
