package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nex extends AbstractC0191new {
    private final luv a;
    private final luv b;
    private int c;
    private boolean e;
    private boolean f;
    private int g;

    public nex(ndu nduVar) {
        super(nduVar);
        this.a = new luv(lwa.a);
        this.b = new luv(4);
    }

    @Override // defpackage.AbstractC0191new
    protected final boolean a(luv luvVar) {
        int j = luvVar.j();
        int i = j >> 4;
        int i2 = j & 15;
        if (i2 != 7) {
            throw new nev(a.h(i2, "Video format not supported: "));
        }
        this.g = i;
        return i != 5;
    }

    @Override // defpackage.AbstractC0191new
    protected final boolean b(luv luvVar, long j) {
        int i;
        int j2 = luvVar.j();
        byte[] bArr = luvVar.a;
        int i2 = luvVar.b;
        int i3 = i2 + 1;
        luvVar.b = i3;
        int i4 = bArr[i2] & 255;
        int i5 = i2 + 2;
        luvVar.b = i5;
        int i6 = bArr[i3] & 255;
        luvVar.b = i2 + 3;
        int i7 = bArr[i5] & 255;
        if (j2 == 0) {
            if (!this.e) {
                luv luvVar2 = new luv(new byte[luvVar.b()]);
                luvVar.F(luvVar2.a, 0, luvVar.b());
                nbt a = nbt.a(luvVar2);
                this.c = a.b;
                lqb lqbVar = new lqb();
                lqbVar.a("video/x-flv");
                lqbVar.c("video/avc");
                lqbVar.j = a.l;
                lqbVar.t = a.c;
                lqbVar.u = a.d;
                lqbVar.x = a.k;
                lqbVar.p = a.a;
                this.d.i(new lqc(lqbVar));
                this.e = true;
                return false;
            }
        } else if (j2 == 1 && this.e) {
            int i8 = this.g == 1 ? 1 : 0;
            if (this.f) {
                i = i8;
            } else if (i8 != 0) {
                i = 1;
            }
            byte[] bArr2 = this.b.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i9 = 4 - this.c;
            int i10 = 0;
            while (luvVar.b() > 0) {
                luvVar.F(this.b.a, i9, this.c);
                this.b.K(0);
                luv luvVar3 = this.b;
                luv luvVar4 = this.a;
                int m = luvVar3.m();
                luvVar4.K(0);
                this.d.m(this.a, 4);
                this.d.m(luvVar, m);
                i10 = i10 + 4 + m;
            }
            this.d.o(j + ((((i4 << 24) >> 8) | (i6 << 8) | i7) * 1000), i, i10, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }
}
