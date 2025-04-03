package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lez {
    private int a = 1;
    private final lfg b;
    private lfg c;
    private lfg d;
    private int e;
    private int f;
    private final boolean g;
    private final int[] h;

    public lez(lfg lfgVar, boolean z, int[] iArr) {
        this.b = lfgVar;
        this.c = lfgVar;
        this.g = z;
        this.h = iArr;
    }

    private static boolean e(int i) {
        return i == 65039;
    }

    private final boolean f() {
        ozb d = this.c.a.d();
        int b = d.b(6);
        if ((b != 0 && d.b.get(b + d.a) != 0) || e(this.e)) {
            return true;
        }
        if (this.g) {
            if (this.h == null) {
                return true;
            }
            if (Arrays.binarySearch(this.h, this.c.a.a(0)) < 0) {
                return true;
            }
        }
        return false;
    }

    private final void g() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    final int a(int i) {
        lfg a = this.c.a(i);
        int i2 = 1;
        int i3 = 2;
        if (this.a == 2) {
            if (a != null) {
                this.c = a;
                this.f++;
            } else if (i == 65038) {
                g();
            } else if (!e(i)) {
                lfg lfgVar = this.c;
                if (lfgVar.a != null) {
                    i3 = 3;
                    if (this.f != 1) {
                        this.d = lfgVar;
                        g();
                    } else if (f()) {
                        this.d = this.c;
                        g();
                    } else {
                        g();
                    }
                } else {
                    g();
                }
            }
            i2 = i3;
        } else if (a == null) {
            g();
        } else {
            this.a = 2;
            this.c = a;
            this.f = 1;
            i2 = i3;
        }
        this.e = i;
        return i2;
    }

    final lex b() {
        return this.c.a;
    }

    final lex c() {
        return this.d.a;
    }

    final boolean d() {
        if (this.a != 2 || this.c.a == null) {
            return false;
        }
        return this.f > 1 || f();
    }
}
