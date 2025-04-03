package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nob implements non {
    private final noa a;
    private final luv b = new luv(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public nob(noa noaVar) {
        this.a = noaVar;
    }

    @Override // defpackage.non
    public final void a(luv luvVar, int i) {
        int i2 = i & 1;
        int j = i2 != 0 ? luvVar.b + luvVar.j() : -1;
        if (this.f) {
            if (i2 == 0) {
                return;
            }
            this.f = false;
            luvVar.K(j);
            this.d = 0;
        }
        while (luvVar.b() > 0) {
            int i3 = this.d;
            if (i3 < 3) {
                if (i3 == 0) {
                    int j2 = luvVar.j();
                    luvVar.K(luvVar.b - 1);
                    if (j2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(luvVar.b(), 3 - this.d);
                luvVar.F(this.b.a, this.d, min);
                int i4 = this.d + min;
                this.d = i4;
                if (i4 == 3) {
                    this.b.K(0);
                    this.b.J(3);
                    this.b.L(1);
                    luv luvVar2 = this.b;
                    int j3 = luvVar2.j();
                    boolean z = (j3 & 128) != 0;
                    int j4 = luvVar2.j();
                    this.e = z;
                    this.c = (j4 | ((j3 & 15) << 8)) + 3;
                    int c = this.b.c();
                    int i5 = this.c;
                    if (c < i5) {
                        int c2 = this.b.c();
                        this.b.D(Math.min(4098, Math.max(i5, c2 + c2)));
                    }
                }
            } else {
                int min2 = Math.min(luvVar.b(), this.c - i3);
                luvVar.F(this.b.a, this.d, min2);
                int i6 = this.d + min2;
                this.d = i6;
                int i7 = this.c;
                if (i6 != i7) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.J(i7);
                    } else {
                        if (lvf.f(this.b.a, 0, i7, -1) != 0) {
                            this.f = true;
                            return;
                        }
                        this.b.J(this.c - 4);
                    }
                    this.b.K(0);
                    this.a.a(this.b);
                    this.d = 0;
                }
            }
        }
    }

    @Override // defpackage.non
    public final void b(lvc lvcVar, ncr ncrVar, nom nomVar) {
        this.a.b(lvcVar, ncrVar, nomVar);
        this.f = true;
    }

    @Override // defpackage.non
    public final void c() {
        this.f = true;
    }
}
