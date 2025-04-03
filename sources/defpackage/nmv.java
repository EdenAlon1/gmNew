package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nmv implements nnb {
    public long a;
    private final luu b;
    private final luv c;
    private final String d;
    private final int e;
    private final String f;
    private String g;
    private ndu h;
    private int i;
    private int j;
    private boolean k;
    private long l;
    private lqc m;
    private int n;

    public nmv(String str, int i, String str2) {
        luu luuVar = new luu(new byte[16]);
        this.b = luuVar;
        this.c = new luv(luuVar.a);
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.a = -9223372036854775807L;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    @Override // defpackage.nnb
    public final void a(luv luvVar) {
        lti.g(this.h);
        while (luvVar.b() > 0) {
            int i = this.i;
            if (i == 0) {
                while (luvVar.b() > 0) {
                    if (this.k) {
                        int j = luvVar.j();
                        this.k = j == 172;
                        if (j != 64) {
                            if (j == 65) {
                                j = 65;
                            }
                        }
                        this.i = 1;
                        byte[] bArr = this.c.a;
                        bArr[0] = -84;
                        bArr[1] = j == 65 ? (byte) 65 : (byte) 64;
                        this.j = 2;
                    } else {
                        this.k = luvVar.j() == 172;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(luvVar.b(), this.n - this.j);
                this.h.m(luvVar, min);
                int i2 = this.j + min;
                this.j = i2;
                if (i2 == this.n) {
                    lti.c(this.a != -9223372036854775807L);
                    this.h.o(this.a, 1, this.n, 0, null);
                    this.a += this.l;
                    this.i = 0;
                }
            } else {
                byte[] bArr2 = this.c.a;
                int min2 = Math.min(luvVar.b(), 16 - this.j);
                luvVar.F(bArr2, this.j, min2);
                int i3 = this.j + min2;
                this.j = i3;
                if (i3 == 16) {
                    this.b.l(0);
                    nbr a = nbs.a(this.b);
                    lqc lqcVar = this.m;
                    if (lqcVar == null || lqcVar.E != 2 || a.a != lqcVar.F || !"audio/ac4".equals(lqcVar.o)) {
                        lqb lqbVar = new lqb();
                        lqbVar.a = this.g;
                        lqbVar.a(this.f);
                        lqbVar.c("audio/ac4");
                        lqbVar.C = 2;
                        lqbVar.D = a.a;
                        lqbVar.d = this.d;
                        lqbVar.f = this.e;
                        lqc lqcVar2 = new lqc(lqbVar);
                        this.m = lqcVar2;
                        this.h.i(lqcVar2);
                    }
                    this.n = a.b;
                    this.l = (a.c * 1000000) / this.m.F;
                    this.c.K(0);
                    this.h.m(this.c, 16);
                    this.i = 2;
                }
            }
        }
    }

    @Override // defpackage.nnb
    public final void b(ncr ncrVar, nom nomVar) {
        nomVar.c();
        this.g = nomVar.b();
        this.h = ncrVar.p(nomVar.a(), 1);
    }

    @Override // defpackage.nnb
    public final void d(long j, int i) {
        this.a = j;
    }

    @Override // defpackage.nnb
    public final void e() {
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.a = -9223372036854775807L;
    }

    @Override // defpackage.nnb
    public final void c(boolean z) {
    }
}
