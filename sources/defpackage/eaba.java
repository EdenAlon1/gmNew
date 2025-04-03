package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaba implements eaaw {
    public final dzwu a;
    public final dzwu b;
    public dzzo d = null;
    public dzzp e = null;
    public eaav c = new eaav() { // from class: eaay
    };

    public eaba(dzpt dzptVar, emxc emxcVar, dzja dzjaVar, dyim dyimVar, eaax eaaxVar) {
        eaaxVar.a(this);
        dzwu a = dyimVar.a(dzjaVar, dzptVar);
        this.a = a;
        if (emxcVar.g()) {
            this.b = dzwn.d((dzwu) emxcVar.c(), new emwl() { // from class: eaaz
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return engw.r((dzpb) obj);
                }
            });
        } else {
            this.b = ((dyol) dyimVar).l(dzjaVar).ai(dzptVar);
        }
        new dzwy(a, this.b);
    }

    @Override // defpackage.eaaw
    public final void a() {
        dzzp dzzpVar = this.e;
        if (dzzpVar != null) {
            eaar eaarVar = dzzpVar.a;
            eaarVar.B.c(eaarVar.b);
            eaarVar.j.a();
        }
    }

    @Override // defpackage.eaaw
    public final void b() {
        dzzo dzzoVar = this.d;
        if (dzzoVar != null) {
            eaar eaarVar = dzzoVar.a;
            dzyk.c(eaarVar.a);
            eaarVar.B.c(eaarVar.b);
            eaarVar.i.a();
        }
    }
}
