package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nop {
    private final List a;
    private final String b = "video/mp2t";
    private final ndu[] c;

    public nop(List list) {
        this.a = list;
        this.c = new ndu[list.size()];
    }

    public final void a(long j, luv luvVar) {
        if (luvVar.b() < 9) {
            return;
        }
        int e = luvVar.e();
        int e2 = luvVar.e();
        int j2 = luvVar.j();
        if (e == 434 && e2 == 1195456820 && j2 == 3) {
            ncb.b(j, luvVar, this.c);
        }
    }

    public final void b(ncr ncrVar, nom nomVar) {
        for (int i = 0; i < this.c.length; i++) {
            nomVar.c();
            ndu p = ncrVar.p(nomVar.a(), 3);
            lqc lqcVar = (lqc) this.a.get(i);
            String str = lqcVar.o;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            lti.b(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            lqb lqbVar = new lqb();
            lqbVar.a = nomVar.b();
            lqbVar.a(this.b);
            lqbVar.c(str);
            lqbVar.e = lqcVar.e;
            lqbVar.d = lqcVar.d;
            lqbVar.H = lqcVar.J;
            lqbVar.p = lqcVar.r;
            p.i(new lqc(lqbVar));
            this.c[i] = p;
        }
    }
}
