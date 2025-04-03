package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class njc {
    public final njd a = new njd();
    public final luv b = new luv(new byte[65025], 0);
    public int c = -1;
    public boolean d;
    private int e;

    private final int b(int i) {
        int i2;
        int i3 = 0;
        this.e = 0;
        do {
            int i4 = this.e;
            int i5 = i + i4;
            njd njdVar = this.a;
            if (i5 >= njdVar.c) {
                break;
            }
            this.e = i4 + 1;
            i2 = njdVar.f[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean a(ncp ncpVar) {
        lti.c(true);
        if (this.d) {
            this.d = false;
            this.b.G(0);
        }
        while (!this.d) {
            int i = this.c;
            if (i < 0) {
                if (!this.a.c(ncpVar) || !this.a.b(ncpVar, true)) {
                    return false;
                }
                njd njdVar = this.a;
                int i2 = njdVar.d;
                if ((njdVar.a & 1) == 1 && this.b.c == 0) {
                    i2 += b(0);
                    i = this.e;
                } else {
                    i = 0;
                }
                if (!ncs.d(ncpVar, i2)) {
                    return false;
                }
                this.c = i;
            }
            int b = b(i);
            int i3 = this.c + this.e;
            if (b > 0) {
                luv luvVar = this.b;
                luvVar.D(luvVar.c + b);
                luv luvVar2 = this.b;
                if (!ncs.c(ncpVar, luvVar2.a, luvVar2.c, b)) {
                    return false;
                }
                luv luvVar3 = this.b;
                luvVar3.J(luvVar3.c + b);
                this.d = this.a.f[i3 + (-1)] != 255;
            }
            if (i3 == this.a.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }
}
