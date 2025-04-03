package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kgx {
    khe a = null;
    public float b = 0.0f;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public kgw e;

    public kgx() {
    }

    public static final boolean l(khe kheVar) {
        return kheVar.l <= 1;
    }

    public final khe a(boolean[] zArr, khe kheVar) {
        int i;
        int i2 = this.e.a;
        khe kheVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float b = this.e.b(i3);
            if (b < 0.0f) {
                khe d = this.e.d(i3);
                if ((zArr == null || !zArr[d.c]) && d != kheVar && (((i = d.n) == 3 || i == 4) && b < f)) {
                    f = b;
                    kheVar2 = d;
                }
            }
        }
        return kheVar2;
    }

    final void b(khe kheVar) {
        khe kheVar2 = this.a;
        if (kheVar2 != null) {
            this.e.g(kheVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(kheVar, true);
        this.a = kheVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        kgw kgwVar = this.e;
        int i = kgwVar.f;
        for (int i2 = 0; i != -1 && i2 < kgwVar.a; i2++) {
            float[] fArr = kgwVar.e;
            fArr[i] = fArr[i] / f;
            i = kgwVar.d[i];
        }
    }

    public final void c(kgz kgzVar, khe kheVar, boolean z) {
        if (kheVar == null || !kheVar.g) {
            return;
        }
        this.b += kheVar.f * this.e.a(kheVar);
        this.e.c(kheVar, z);
        if (z) {
            kheVar.b(this);
        }
        if (this.e.a == 0) {
            this.d = true;
            kgzVar.c = true;
        }
    }

    public void d(kgz kgzVar, kgx kgxVar, boolean z) {
        kgw kgwVar = this.e;
        float a = kgwVar.a(kgxVar.a);
        kgwVar.c(kgxVar.a, z);
        kgw kgwVar2 = kgxVar.e;
        int i = kgwVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            khe d = kgwVar2.d(i2);
            kgwVar.e(d, kgwVar2.a(d) * a, z);
        }
        this.b += kgxVar.b * a;
        if (z) {
            kgxVar.a.b(this);
        }
        if (this.a == null || this.e.a != 0) {
            return;
        }
        this.d = true;
        kgzVar.c = true;
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(kgz kgzVar, int i) {
        this.e.g(kgzVar.p(i), 1.0f);
        this.e.g(kgzVar.p(i), -1.0f);
    }

    public final void g(khe kheVar, khe kheVar2, khe kheVar3, khe kheVar4, float f) {
        this.e.g(kheVar, -1.0f);
        this.e.g(kheVar2, 1.0f);
        this.e.g(kheVar3, f);
        this.e.g(kheVar4, -f);
    }

    public final void h(khe kheVar, khe kheVar2, khe kheVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(kheVar, 1.0f);
                this.e.g(kheVar2, -1.0f);
                this.e.g(kheVar3, -1.0f);
                return;
            }
        }
        this.e.g(kheVar, -1.0f);
        this.e.g(kheVar2, 1.0f);
        this.e.g(kheVar3, 1.0f);
    }

    public final void i(khe kheVar, khe kheVar2, khe kheVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(kheVar, 1.0f);
                this.e.g(kheVar2, -1.0f);
                this.e.g(kheVar3, 1.0f);
                return;
            }
        }
        this.e.g(kheVar, -1.0f);
        this.e.g(kheVar2, 1.0f);
        this.e.g(kheVar3, -1.0f);
    }

    public final void j(khe kheVar, khe kheVar2, khe kheVar3, khe kheVar4, float f) {
        this.e.g(kheVar3, 0.5f);
        this.e.g(kheVar4, 0.5f);
        this.e.g(kheVar, -0.5f);
        this.e.g(kheVar2, -0.5f);
        this.b = -f;
    }

    public khe k(boolean[] zArr) {
        return a(zArr, null);
    }

    public String toString() {
        String concat;
        boolean z;
        String str;
        if (this.a == null) {
            concat = "0";
        } else {
            khe kheVar = this.a;
            Objects.toString(kheVar);
            concat = "".concat(String.valueOf(kheVar));
        }
        float f = this.b;
        String concat2 = concat.concat(" = ");
        if (f != 0.0f) {
            concat2 = concat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        int i = this.e.a;
        for (int i2 = 0; i2 < i; i2++) {
            khe d = this.e.d(i2);
            if (d != null) {
                float b = this.e.b(i2);
                if (b != 0.0f) {
                    String kheVar2 = d.toString();
                    if (z) {
                        if (b > 0.0f) {
                            str = " + ";
                        } else {
                            b = -b;
                            str = " - ";
                        }
                        concat2 = concat2.concat(str);
                    } else if (b < 0.0f) {
                        b = -b;
                        concat2 = concat2.concat("- ");
                    }
                    concat2 = b == 1.0f ? concat2.concat(kheVar2) : concat2 + b + " " + kheVar2;
                    z = true;
                }
            }
        }
        return !z ? concat2.concat("0.0") : concat2;
    }

    public kgx(kgy kgyVar) {
        this.e = new kgw(this, kgyVar);
    }
}
