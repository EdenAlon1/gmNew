package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nno implements nnb {
    private final luv a;
    private final ndg b;
    private final String c;
    private final int d;
    private final String e;
    private ndu f;
    private String g;
    private int h = 0;
    private int i;
    private boolean j;
    private boolean k;
    private long l;
    private int m;
    private long n;

    public nno(String str, int i, String str2) {
        luv luvVar = new luv(4);
        this.a = luvVar;
        luvVar.a[0] = -1;
        this.b = new ndg();
        this.n = -9223372036854775807L;
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    @Override // defpackage.nnb
    public final void a(luv luvVar) {
        lti.g(this.f);
        while (luvVar.b() > 0) {
            int i = this.h;
            if (i == 0) {
                byte[] bArr = luvVar.a;
                int i2 = luvVar.b;
                int i3 = luvVar.c;
                while (true) {
                    if (i2 >= i3) {
                        luvVar.K(i3);
                        break;
                    }
                    int i4 = i2 + 1;
                    byte b = bArr[i2];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.k && (b & 224) == 224;
                    this.k = z;
                    if (z2) {
                        luvVar.K(i4);
                        this.k = false;
                        this.a.a[1] = bArr[i2];
                        this.i = 2;
                        this.h = 1;
                        break;
                    }
                    i2 = i4;
                }
            } else if (i != 1) {
                int min = Math.min(luvVar.b(), this.m - this.i);
                this.f.m(luvVar, min);
                int i5 = this.i + min;
                this.i = i5;
                if (i5 >= this.m) {
                    lti.c(this.n != -9223372036854775807L);
                    this.f.o(this.n, 1, this.m, 0, null);
                    this.n += this.l;
                    this.i = 0;
                    this.h = 0;
                }
            } else {
                int min2 = Math.min(luvVar.b(), 4 - this.i);
                luvVar.F(this.a.a, this.i, min2);
                int i6 = this.i + min2;
                this.i = i6;
                if (i6 >= 4) {
                    this.a.K(0);
                    if (this.b.a(this.a.e())) {
                        this.m = this.b.c;
                        if (!this.j) {
                            this.l = (r0.g * 1000000) / r0.d;
                            lqb lqbVar = new lqb();
                            lqbVar.a = this.g;
                            lqbVar.a(this.e);
                            lqbVar.c(this.b.b);
                            lqbVar.n = 4096;
                            ndg ndgVar = this.b;
                            lqbVar.C = ndgVar.e;
                            lqbVar.D = ndgVar.d;
                            lqbVar.d = this.c;
                            lqbVar.f = this.d;
                            this.f.i(new lqc(lqbVar));
                            this.j = true;
                        }
                        this.a.K(0);
                        this.f.m(this.a, 4);
                        this.h = 2;
                    } else {
                        this.i = 0;
                        this.h = 1;
                    }
                }
            }
        }
    }

    @Override // defpackage.nnb
    public final void b(ncr ncrVar, nom nomVar) {
        nomVar.c();
        this.g = nomVar.b();
        this.f = ncrVar.p(nomVar.a(), 1);
    }

    @Override // defpackage.nnb
    public final void d(long j, int i) {
        this.n = j;
    }

    @Override // defpackage.nnb
    public final void e() {
        this.h = 0;
        this.i = 0;
        this.k = false;
        this.n = -9223372036854775807L;
    }

    @Override // defpackage.nnb
    public final void c(boolean z) {
    }
}
