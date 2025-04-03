package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nod {
    public final ndu[] a;
    private final List b;
    private final String c = "video/mp2t";
    private final lwe d = new lwe(new lwd() { // from class: noc
        @Override // defpackage.lwd
        public final void a(long j, luv luvVar) {
            ncb.a(j, luvVar, nod.this.a);
        }
    });

    public nod(List list) {
        this.b = list;
        this.a = new ndu[list.size()];
    }

    public final void a() {
        this.d.b();
    }

    public final void b(long j, luv luvVar) {
        this.d.a(j, luvVar);
    }

    public final void c(ncr ncrVar, nom nomVar) {
        for (int i = 0; i < this.a.length; i++) {
            nomVar.c();
            ndu p = ncrVar.p(nomVar.a(), 3);
            lqc lqcVar = (lqc) this.b.get(i);
            String str = lqcVar.o;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            lti.b(z, "Invalid closed caption MIME type provided: ".concat(String.valueOf(str)));
            String str2 = lqcVar.a;
            if (str2 == null) {
                str2 = nomVar.b();
            }
            lqb lqbVar = new lqb();
            lqbVar.a = str2;
            lqbVar.a(this.c);
            lqbVar.c(str);
            lqbVar.e = lqcVar.e;
            lqbVar.d = lqcVar.d;
            lqbVar.H = lqcVar.J;
            lqbVar.p = lqcVar.r;
            p.i(new lqc(lqbVar));
            this.a[i] = p;
        }
    }

    public final void d() {
        this.d.b();
    }

    public final void e(int i) {
        this.d.c(i);
    }
}
