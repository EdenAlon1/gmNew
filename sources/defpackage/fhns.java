package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhns extends fhmx {
    public final transient byte[][] e;
    public final transient int[] f;

    public fhns(byte[][] bArr, int[] iArr) {
        super(fhmx.a.b);
        this.e = bArr;
        this.f = iArr;
    }

    private final fhmx n() {
        return new fhmx(k());
    }

    private final Object writeReplace() {
        return n();
    }

    @Override // defpackage.fhmx
    public final byte a(int i) {
        fhmm.b(this.f[this.e.length - 1], i, 1L);
        int a = fhob.a(this, i);
        int i2 = a == 0 ? 0 : this.f[a - 1];
        int[] iArr = this.f;
        byte[][] bArr = this.e;
        return bArr[a][(i - i2) + iArr[bArr.length + a]];
    }

    @Override // defpackage.fhmx
    public final int b() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.fhmx
    public final String d() {
        return n().d();
    }

    @Override // defpackage.fhmx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fhmx) {
            fhmx fhmxVar = (fhmx) obj;
            return fhmxVar.b() == b() && l(fhmxVar, b());
        }
        return false;
    }

    @Override // defpackage.fhmx
    public final fhmx g() {
        return n().g();
    }

    @Override // defpackage.fhmx
    public final boolean h(int i, byte[] bArr, int i2, int i3) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > b() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int a = fhob.a(this, i);
        while (i < i5) {
            if (a == 0) {
                a = 0;
                i4 = 0;
            } else {
                i4 = this.f[a - 1];
            }
            int[] iArr = this.f;
            int i6 = iArr[a] - i4;
            int i7 = iArr[this.e.length + a];
            int min = Math.min(i5, i6 + i4) - i;
            if (!fhmm.c(this.e[a], i7 + (i - i4), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            a++;
        }
        return true;
    }

    @Override // defpackage.fhmx
    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (true) {
            int length = bArr.length;
            if (i2 >= length) {
                this.c = i3;
                return i3;
            }
            int[] iArr = this.f;
            byte[][] bArr2 = this.e;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            byte[] bArr3 = bArr2[i2];
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr3[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
    }

    @Override // defpackage.fhmx
    public final byte[] j() {
        return k();
    }

    @Override // defpackage.fhmx
    public final byte[] k() {
        byte[] bArr = new byte[b()];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte[][] bArr2 = this.e;
            int length = bArr2.length;
            if (i >= length) {
                return bArr;
            }
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ffdo.i(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
    }

    @Override // defpackage.fhmx
    public final boolean l(fhmx fhmxVar, int i) {
        int i2;
        fhmxVar.getClass();
        if (b() - i < 0) {
            return false;
        }
        int a = fhob.a(this, 0);
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (a == 0) {
                a = 0;
                i2 = 0;
            } else {
                i2 = this.f[a - 1];
            }
            int[] iArr = this.f;
            int i5 = iArr[a] - i2;
            int i6 = iArr[this.e.length + a];
            int min = Math.min(i, i5 + i2) - i3;
            if (!fhmxVar.h(i4, this.e[a], i6 + (i3 - i2), min)) {
                return false;
            }
            i4 += min;
            i3 += min;
            a++;
        }
        return true;
    }

    @Override // defpackage.fhmx
    public final void m(fhmt fhmtVar, int i) {
        int i2;
        int a = fhob.a(this, 0);
        int i3 = 0;
        while (i3 < i) {
            if (a == 0) {
                a = 0;
                i2 = 0;
            } else {
                i2 = this.f[a - 1];
            }
            int[] iArr = this.f;
            int i4 = iArr[a] - i2;
            int i5 = iArr[this.e.length + a];
            int min = Math.min(i, i4 + i2) - i3;
            int i6 = i5 + (i3 - i2);
            fhnq fhnqVar = new fhnq(this.e[a], i6, i6 + min, true);
            fhnq fhnqVar2 = fhmtVar.a;
            if (fhnqVar2 == null) {
                fhnqVar.g = fhnqVar;
                fhnqVar.f = fhnqVar.g;
                fhmtVar.a = fhnqVar.f;
            } else {
                fhnq fhnqVar3 = fhnqVar2.g;
                fhnqVar3.getClass();
                fhnqVar3.d(fhnqVar);
            }
            i3 += min;
            a++;
        }
        fhmtVar.b += i;
    }

    @Override // defpackage.fhmx
    public final String toString() {
        return n().toString();
    }
}
