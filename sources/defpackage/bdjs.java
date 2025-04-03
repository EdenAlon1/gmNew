package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdjs {
    public static final engw a = engw.t(14, 15, 1);
    public static final engw b = engw.v(10, 4, 5, 6, 7);
    public final csrv c;
    private final cqoh d;

    public bdjs(csrv csrvVar, cqoh cqohVar) {
        this.c = csrvVar;
        this.d = cqohVar;
    }

    public static boolean A(int i) {
        return i > 0 && i <= 25;
    }

    public static boolean B(int i) {
        return i == 9 || i == 13 || i == 18 || i == 24;
    }

    public static boolean C(int i) {
        return i == 3;
    }

    public static boolean D(int i) {
        return i == 0;
    }

    public static boolean a(int i) {
        return (z(i) || D(i)) ? false : true;
    }

    public static boolean f(int i) {
        return A(i) && i != 11;
    }

    public static boolean g(int i) {
        return i == 214 || i == 215 || i == 216 || i == 219 || i == 235 || i == 236 || i == 237 || i == 238;
    }

    public static boolean h(int i) {
        return i >= 100 && i <= 117;
    }

    public static boolean i(int i) {
        return i == 107 || i == 111;
    }

    public static boolean j(int i) {
        return i == 207 || i == 206 || i == 213 || i == 264;
    }

    public static boolean k(int i) {
        return i == 100 || i == 108 || i == 109;
    }

    public static boolean l(int i) {
        return i == 105 || i == 103 || i == 104 || i == 102;
    }

    public static boolean m(int i) {
        return i == 1;
    }

    public static boolean n(int i) {
        return i == 2;
    }

    public static boolean o(int i) {
        return i == 2 || i == 11;
    }

    public static boolean p(int i) {
        return i == 11;
    }

    public static boolean q(int i) {
        return i == 8 || i == 19;
    }

    public static boolean r(int i) {
        return i(i) || B(i);
    }

    public static boolean s(int i) {
        return b.contains(Integer.valueOf(i));
    }

    public static boolean t(int i) {
        return a.contains(Integer.valueOf(i));
    }

    public static boolean u(int i) {
        return i == 17;
    }

    public static boolean v(int i) {
        return i == 19;
    }

    public static boolean w(int i) {
        return i == 22;
    }

    public static boolean x(int i) {
        return i == 21;
    }

    public static boolean y(int i) {
        return i == 1 || i == 2 || i == 11 || i == 15 || i == 14;
    }

    public static boolean z(int i) {
        return i == 1 || i == 2;
    }

    public final boolean b(Context context, int i) {
        if (ctid.h(context)) {
            return false;
        }
        if (i == 106 || i == 101 || i == 110 || i == 112 || i == 115) {
            return true;
        }
        return i(i) && this.c.q();
    }

    public final boolean c(int i, int i2, long j, boolean z) {
        return C(i) && t(i2) && j <= this.d.f().toEpochMilli() - ((Long) aqgk.b.e()).longValue() && z;
    }

    public final boolean d(int i, int i2, long j) {
        return C(i) && s(i2) && j <= this.d.f().toEpochMilli() - ((Long) aqgk.a.e()).longValue();
    }

    public final boolean e(Context context, int i) {
        if (ctid.h(context) || i == 16 || k(i) || y(i)) {
            return false;
        }
        return !r(i) || this.c.q();
    }
}
