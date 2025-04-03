package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aphd implements ctbj {
    final /* synthetic */ aphg a;

    public aphd(aphg aphgVar) {
        this.a = aphgVar;
    }

    @Override // defpackage.ctbj
    public final void fN() {
        final aphg aphgVar = this.a;
        aqgd aqgdVar = new aqgd() { // from class: aphc
            @Override // defpackage.aqgd
            public final elfl a() {
                elfl c;
                aphg aphgVar2 = aphg.this;
                c = axol.c(aphgVar2.b, ffhe.a, ffsm.a, new aphf(aphgVar2, null));
                return c;
            }
        };
        final aphg aphgVar2 = this.a;
        aqgd aqgdVar2 = new aqgd() { // from class: aphc
            @Override // defpackage.aqgd
            public final elfl a() {
                elfl c;
                aphg aphgVar22 = aphg.this;
                c = axol.c(aphgVar22.b, ffhe.a, ffsm.a, new aphf(aphgVar22, null));
                return c;
            }
        };
        final aphg aphgVar3 = this.a;
        aphgVar.f = ctbt.b(aphgVar.c.a(aqgdVar), aphgVar2.d.a(aqgdVar2), aphgVar3.e.a(new aqgd() { // from class: aphc
            @Override // defpackage.aqgd
            public final elfl a() {
                elfl c;
                aphg aphgVar22 = aphg.this;
                c = axol.c(aphgVar22.b, ffhe.a, ffsm.a, new aphf(aphgVar22, null));
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
