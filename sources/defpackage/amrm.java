package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amrm implements ctbj {
    final /* synthetic */ amrp a;
    private ctbx b;

    public amrm(amrp amrpVar) {
        this.a = amrpVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final amrp amrpVar = this.a;
        this.b = amrpVar.b.n().a(new aqgd() { // from class: amrl
            @Override // defpackage.aqgd
            public final elfl a() {
                elfl c;
                amrp amrpVar2 = amrp.this;
                c = axol.c(amrpVar2.a, ffhe.a, ffsm.a, new amro(amrpVar2, null));
                return c;
            }
        });
    }

    @Override // defpackage.ctbj
    public final void fO() {
        ctbx ctbxVar = this.b;
        if (ctbxVar != null) {
            ctbxVar.a();
        }
        this.b = null;
    }
}
