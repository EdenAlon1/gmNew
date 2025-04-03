package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khd extends kgx {
    public int f;
    final khc g;
    private khe[] h;
    private khe[] i;

    public khd(kgy kgyVar) {
        super(kgyVar);
        this.h = new khe[128];
        this.i = new khe[128];
        this.f = 0;
        this.g = new khc(this);
    }

    @Override // defpackage.kgx
    public final void d(kgz kgzVar, kgx kgxVar, boolean z) {
        khe kheVar = kgxVar.a;
        if (kheVar == null) {
            return;
        }
        kgw kgwVar = kgxVar.e;
        int i = kgwVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            khe d = kgwVar.d(i2);
            float b = kgwVar.b(i2);
            khc khcVar = this.g;
            khcVar.a = d;
            if (khcVar.a.b) {
                boolean z2 = true;
                for (int i3 = 0; i3 < 9; i3++) {
                    float[] fArr = khcVar.a.i;
                    float f = fArr[i3] + (kheVar.i[i3] * b);
                    fArr[i3] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        khcVar.a.i[i3] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    khcVar.b.n(khcVar.a);
                }
            } else {
                for (int i4 = 0; i4 < 9; i4++) {
                    float f2 = kheVar.i[i4];
                    if (f2 != 0.0f) {
                        float f3 = f2 * b;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        khcVar.a.i[i4] = f3;
                    } else {
                        khcVar.a.i[i4] = 0.0f;
                    }
                }
                m(d);
            }
            this.b += kgxVar.b * b;
        }
        n(kheVar);
    }

    @Override // defpackage.kgx
    public final boolean e() {
        return this.f == 0;
    }

    @Override // defpackage.kgx
    public final khe k(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f; i2++) {
            khe[] kheVarArr = this.h;
            khe kheVar = kheVarArr[i2];
            if (!zArr[kheVar.c]) {
                khc khcVar = this.g;
                khcVar.a = kheVar;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = khcVar.a.i[i3];
                        if (f > 0.0f) {
                            break;
                        }
                        if (f < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                    i = -1;
                } else {
                    khe kheVar2 = kheVarArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = kheVar2.i[i3];
                            float f3 = khcVar.a.i[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 >= f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    public final void m(khe kheVar) {
        int i;
        int i2 = this.f + 1;
        khe[] kheVarArr = this.h;
        int length = kheVarArr.length;
        if (i2 > length) {
            khe[] kheVarArr2 = (khe[]) Arrays.copyOf(kheVarArr, length + length);
            this.h = kheVarArr2;
            int length2 = kheVarArr2.length;
            this.i = (khe[]) Arrays.copyOf(kheVarArr2, length2 + length2);
        }
        khe[] kheVarArr3 = this.h;
        int i3 = this.f;
        kheVarArr3[i3] = kheVar;
        int i4 = i3 + 1;
        this.f = i4;
        if (i4 > 1 && kheVarArr3[i3].c > kheVar.c) {
            int i5 = 0;
            while (true) {
                i = this.f;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new khb());
            for (int i6 = 0; i6 < this.f; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        kheVar.b = true;
        kheVar.a(this);
    }

    public final void n(khe kheVar) {
        int i = 0;
        while (i < this.f) {
            if (this.h[i] == kheVar) {
                while (true) {
                    int i2 = this.f - 1;
                    if (i >= i2) {
                        this.f = i2;
                        kheVar.b = false;
                        return;
                    } else {
                        khe[] kheVarArr = this.h;
                        int i3 = i + 1;
                        kheVarArr[i] = kheVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.kgx
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.f; i++) {
            this.g.a = this.h[i];
            str = str + this.g + " ";
        }
        return str;
    }
}
