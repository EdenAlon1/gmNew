package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nna implements nnb {
    private final List a;
    private final ndu[] c;
    private boolean d;
    private int e;
    private int f;
    private final String b = "video/mp2t";
    private long g = -9223372036854775807L;

    public nna(List list) {
        this.a = list;
        this.c = new ndu[list.size()];
    }

    private final boolean f(luv luvVar, int i) {
        if (luvVar.b() == 0) {
            return false;
        }
        if (luvVar.j() != i) {
            this.d = false;
        }
        this.e--;
        return this.d;
    }

    @Override // defpackage.nnb
    public final void a(luv luvVar) {
        if (this.d) {
            if (this.e != 2 || f(luvVar, 32)) {
                if (this.e != 1 || f(luvVar, 0)) {
                    int i = luvVar.b;
                    int b = luvVar.b();
                    for (ndu nduVar : this.c) {
                        luvVar.K(i);
                        nduVar.m(luvVar, b);
                    }
                    this.f += b;
                }
            }
        }
    }

    @Override // defpackage.nnb
    public final void b(ncr ncrVar, nom nomVar) {
        for (int i = 0; i < this.c.length; i++) {
            nok nokVar = (nok) this.a.get(i);
            nomVar.c();
            ndu p = ncrVar.p(nomVar.a(), 3);
            lqb lqbVar = new lqb();
            lqbVar.a = nomVar.b();
            lqbVar.a(this.b);
            lqbVar.c("application/dvbsubs");
            lqbVar.p = Collections.singletonList(nokVar.b);
            lqbVar.d = nokVar.a;
            p.i(new lqc(lqbVar));
            this.c[i] = p;
        }
    }

    @Override // defpackage.nnb
    public final void c(boolean z) {
        if (this.d) {
            lti.c(this.g != -9223372036854775807L);
            for (ndu nduVar : this.c) {
                nduVar.o(this.g, 1, this.f, 0, null);
            }
            this.d = false;
        }
    }

    @Override // defpackage.nnb
    public final void d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.d = true;
        this.g = j;
        this.f = 0;
        this.e = 2;
    }

    @Override // defpackage.nnb
    public final void e() {
        this.d = false;
        this.g = -9223372036854775807L;
    }
}
