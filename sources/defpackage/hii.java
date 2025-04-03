package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class hii {
    public static final int a(cnv cnvVar) {
        int a;
        int a2 = cnvVar.a(0);
        while (cnvVar.b != 0 && cnvVar.a(0) == a2) {
            cnvVar.f(0, cnvVar.b());
            cnvVar.c(cnvVar.b - 1);
            int i = cnvVar.b;
            int i2 = i >>> 1;
            int i3 = 0;
            while (i3 < i2) {
                int a3 = cnvVar.a(i3);
                int i4 = i3 + 1;
                int i5 = i4 + i4;
                int i6 = i5 - 1;
                int a4 = cnvVar.a(i6);
                if (i5 >= i || (a = cnvVar.a(i5)) <= a4) {
                    if (a4 > a3) {
                        cnvVar.f(i3, a4);
                        cnvVar.f(i6, a3);
                        i3 = i6;
                    }
                } else if (a > a3) {
                    cnvVar.f(i3, a);
                    cnvVar.f(i5, a3);
                    i3 = i5;
                }
            }
        }
        return a2;
    }

    public static final void b(cnv cnvVar, int i) {
        if (cnvVar.b == 0 || !(cnvVar.a(0) == i || cnvVar.a(cnvVar.b - 1) == i)) {
            int i2 = cnvVar.b;
            cnvVar.e(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int a = cnvVar.a(i3);
                if (i <= a) {
                    break;
                }
                cnvVar.f(i2, a);
                i2 = i3;
            }
            cnvVar.f(i2, i);
        }
    }

    public static final boolean c(cnv cnvVar) {
        return cnvVar.b != 0;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
