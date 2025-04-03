package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ndg {
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public ndg() {
    }

    public final boolean a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!ndh.c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i6 = i4 - 1;
        this.a = i2;
        this.b = ndh.a[3 - i3];
        int i7 = ndh.b[i5];
        this.d = i7;
        if (i2 == 2) {
            i7 /= 2;
            this.d = i7;
        } else if (i2 == 0) {
            i7 /= 4;
            this.d = i7;
        }
        int i8 = (i >>> 9) & 1;
        this.g = ndh.b(i2, i3);
        if (i3 == 3) {
            int i9 = i2 == 3 ? ndh.c[i6] : ndh.d[i6];
            this.f = i9;
            this.c = (((i9 * 12) / i7) + i8) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? ndh.e[i6] : ndh.f[i6];
                this.f = i10;
                this.c = ((i10 * 144) / i7) + i8;
            } else {
                int i11 = ndh.g[i6];
                this.f = i11;
                this.c = (((i3 == 1 ? 72 : 144) * i11) / i7) + i8;
            }
        }
        this.e = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public ndg(ndg ndgVar) {
        this.a = ndgVar.a;
        this.b = ndgVar.b;
        this.c = ndgVar.c;
        this.d = ndgVar.d;
        this.e = ndgVar.e;
        this.f = ndgVar.f;
        this.g = ndgVar.g;
    }
}
