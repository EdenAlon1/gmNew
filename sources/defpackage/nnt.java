package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnt implements noa {
    private lqc a;
    private lvc b;
    private ndu c;

    public nnt(String str) {
        lqb lqbVar = new lqb();
        lqbVar.a("video/mp2t");
        lqbVar.c(str);
        this.a = new lqc(lqbVar);
    }

    @Override // defpackage.noa
    public final void a(luv luvVar) {
        lti.g(this.b);
        int i = lvf.a;
        long e = this.b.e();
        long f = this.b.f();
        if (e == -9223372036854775807L || f == -9223372036854775807L) {
            return;
        }
        lqc lqcVar = this.a;
        if (f != lqcVar.t) {
            lqb lqbVar = new lqb(lqcVar);
            lqbVar.r = f;
            lqc lqcVar2 = new lqc(lqbVar);
            this.a = lqcVar2;
            this.c.i(lqcVar2);
        }
        int b = luvVar.b();
        this.c.m(luvVar, b);
        this.c.o(e, 1, b, 0, null);
    }

    @Override // defpackage.noa
    public final void b(lvc lvcVar, ncr ncrVar, nom nomVar) {
        this.b = lvcVar;
        nomVar.c();
        ndu p = ncrVar.p(nomVar.a(), 5);
        this.c = p;
        p.i(this.a);
    }
}
