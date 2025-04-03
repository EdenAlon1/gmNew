package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dptq extends lml {
    public final ffsk a;
    public final fgcl b;
    public final fgcq c;
    public final fgcl d;
    public final fgcq e;
    public final ffxx f;

    public dptq(dptc dptcVar, ffsk ffskVar) {
        dptcVar.getClass();
        ffskVar.getClass();
        this.a = ffskVar;
        fgcl e = fgcu.e(0, 0, 0, 7);
        this.b = e;
        this.c = new fgcn(e);
        fgcl e2 = fgcu.e(0, 0, 0, 7);
        this.d = e2;
        this.e = new fgcn(e2);
        this.f = dptcVar.a(ffskVar, new ffji() { // from class: dptm
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                drnn drnnVar = (drnn) obj;
                drnnVar.getClass();
                dptq dptqVar = dptq.this;
                ffqy.d(dptqVar.a, null, null, new dpto(dptqVar, drnnVar, null), 3);
                return ffcu.a;
            }
        }, new ffji() { // from class: dptn
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                dpse dpseVar = (dpse) obj;
                dpseVar.getClass();
                dptq dptqVar = dptq.this;
                ffqy.d(dptqVar.a, null, null, new dptp(dptqVar, dpseVar, null), 3);
                return ffcu.a;
            }
        }, 1).a();
    }
}
