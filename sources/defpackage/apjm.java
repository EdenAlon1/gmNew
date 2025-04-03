package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apjm implements ctbj {
    final /* synthetic */ apjp a;

    public apjm(apjp apjpVar) {
        this.a = apjpVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final apjp apjpVar = this.a;
        apjpVar.d = apjpVar.b.a(new aqgd() { // from class: apjl
            @Override // defpackage.aqgd
            public final elfl a() {
                elfl c;
                apjp apjpVar2 = apjp.this;
                c = axol.c(apjpVar2.a, ffhe.a, ffsm.a, new apjo(apjpVar2, null));
                return c;
            }
        });
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
