package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nnr {
    public static int a(luu luuVar, int i, int i2, int i3) {
        lti.a(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        erla.a(erla.a(i4, i5), 1 << i3);
        if (luuVar.a() < i) {
            return -1;
        }
        int d = luuVar.d(i);
        if (d != i4) {
            return d;
        }
        if (luuVar.a() < i2) {
            return -1;
        }
        int d2 = luuVar.d(i2);
        int i6 = d + d2;
        if (d2 != i5) {
            return i6;
        }
        if (luuVar.a() < i3) {
            return -1;
        }
        return i6 + luuVar.d(i3);
    }

    public static void b(luu luuVar) {
        luuVar.n(3);
        luuVar.n(8);
        boolean p = luuVar.p();
        boolean p2 = luuVar.p();
        if (p) {
            luuVar.n(5);
        }
        if (p2) {
            luuVar.n(6);
        }
    }

    public static void c(luu luuVar) {
        int d;
        int d2 = luuVar.d(2);
        if (d2 == 0) {
            luuVar.n(6);
            return;
        }
        int a = a(luuVar, 5, 8, 16) + 1;
        if (d2 == 1) {
            luuVar.n(a * 7);
            return;
        }
        if (d2 == 2) {
            boolean p = luuVar.p();
            int i = true != p ? 5 : 1;
            int i2 = true == p ? 7 : 5;
            int i3 = true == p ? 8 : 6;
            int i4 = 0;
            while (i4 < a) {
                if (luuVar.p()) {
                    luuVar.n(7);
                    d = 0;
                } else {
                    if (luuVar.d(2) == 3 && luuVar.d(i2) * i != 0) {
                        luuVar.m();
                    }
                    d = luuVar.d(i3) * i;
                    if (d != 0 && d != 180) {
                        luuVar.m();
                    }
                    luuVar.m();
                }
                if (d != 0 && d != 180 && luuVar.p()) {
                    i4++;
                }
                i4++;
            }
        }
    }

    public static boolean d(luu luuVar) {
        luuVar.n(3);
        boolean p = luuVar.p();
        if (p) {
            luuVar.n(13);
        }
        return p;
    }
}
