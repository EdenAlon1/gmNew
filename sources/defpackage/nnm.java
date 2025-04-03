package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nnm implements nnb {
    private ndu c;
    private boolean d;
    private int f;
    private int g;
    private final String a = "video/mp2t";
    private final luv b = new luv(10);
    private long e = -9223372036854775807L;

    @Override // defpackage.nnb
    public final void a(luv luvVar) {
        lti.g(this.c);
        if (this.d) {
            int b = luvVar.b();
            int i = this.g;
            if (i < 10) {
                int min = Math.min(b, 10 - i);
                System.arraycopy(luvVar.a, luvVar.b, this.b.a, this.g, min);
                if (this.g + min == 10) {
                    this.b.K(0);
                    if (this.b.j() != 73 || this.b.j() != 68 || this.b.j() != 51) {
                        luj.f("Id3Reader", "Discarding invalid ID3 tag");
                        this.d = false;
                        return;
                    } else {
                        this.b.L(3);
                        this.f = this.b.i() + 10;
                    }
                }
            }
            int min2 = Math.min(b, this.f - this.g);
            this.c.m(luvVar, min2);
            this.g += min2;
        }
    }

    @Override // defpackage.nnb
    public final void b(ncr ncrVar, nom nomVar) {
        nomVar.c();
        ndu p = ncrVar.p(nomVar.a(), 5);
        this.c = p;
        lqb lqbVar = new lqb();
        lqbVar.a = nomVar.b();
        lqbVar.a(this.a);
        lqbVar.c("application/id3");
        p.i(new lqc(lqbVar));
    }

    @Override // defpackage.nnb
    public final void c(boolean z) {
        int i;
        lti.g(this.c);
        if (this.d && (i = this.f) != 0 && this.g == i) {
            lti.c(this.e != -9223372036854775807L);
            this.c.o(this.e, 1, this.f, 0, null);
            this.d = false;
        }
    }

    @Override // defpackage.nnb
    public final void d(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.d = true;
        this.e = j;
        this.f = 0;
        this.g = 0;
    }

    @Override // defpackage.nnb
    public final void e() {
        this.d = false;
        this.e = -9223372036854775807L;
    }
}
