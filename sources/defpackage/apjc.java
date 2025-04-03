package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apjc implements ctbj {
    final /* synthetic */ apjf a;

    public apjc(apjf apjfVar) {
        this.a = apjfVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final apjf apjfVar = this.a;
        aqgd aqgdVar = new aqgd() { // from class: apjb
            @Override // defpackage.aqgd
            public final elfl a() {
                elfl c;
                apjf apjfVar2 = apjf.this;
                c = axol.c(apjfVar2.a, ffhe.a, ffsm.a, new apje(apjfVar2, null));
                return c;
            }
        };
        final apjf apjfVar2 = this.a;
        apjfVar.d = ctbt.a(ffdx.g(apjfVar.b.a(aqgdVar), apjfVar2.c.a(new aqgd() { // from class: apjb
            @Override // defpackage.aqgd
            public final elfl a() {
                elfl c;
                apjf apjfVar22 = apjf.this;
                c = axol.c(apjfVar22.a, ffhe.a, ffsm.a, new apje(apjfVar22, null));
                return c;
            }
        })));
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.a.d;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        this.a.d = null;
    }
}
