package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emxf {
    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(emyk.a(str, Character.valueOf(c)));
        }
    }

    public static void d(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(emyk.a(str, Integer.valueOf(i)));
        }
    }

    public static void e(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(emyk.a(str, Long.valueOf(j)));
        }
    }

    public static void f(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(emyk.a(str, obj));
        }
    }

    public static void g(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(emyk.a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void h(boolean z, String str, Object obj, int i) {
        if (!z) {
            throw new IllegalArgumentException(emyk.a(str, obj, Integer.valueOf(i)));
        }
    }

    public static void i(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(emyk.a(str, obj, obj2));
        }
    }

    public static void j(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalArgumentException(emyk.a(str, obj, obj2, obj3));
        }
    }

    public static void k(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? y(i, i3, "start index") : (i2 < 0 || i2 > i3) ? y(i2, i3, "end index") : emyk.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void l(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void n(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(emyk.a(str, Integer.valueOf(i)));
        }
    }

    public static void o(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(emyk.a(str, Long.valueOf(j)));
        }
    }

    public static void p(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(emyk.a(str, obj));
        }
    }

    public static void q(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalStateException(emyk.a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static void r(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(emyk.a(str, obj, obj2));
        }
    }

    public static void s(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalStateException(emyk.a(str, obj, obj2, obj3));
        }
    }

    public static void t(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(emyk.a(str, 4800, obj));
        }
    }

    public static void u(boolean z, long j, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(emyk.a("duration cannot be negative: %s %s", Long.valueOf(j), obj));
        }
    }

    public static void v(int i, int i2) {
        w(i, i2, "index");
    }

    public static void w(int i, int i2, String str) {
        String a;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                a = emyk.a("%s (%s) must not be negative", str, Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(a.h(i2, "negative size: "));
                }
                a = emyk.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(a);
        }
    }

    public static void x(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(y(i, i2, "index"));
        }
    }

    private static String y(int i, int i2, String str) {
        if (i < 0) {
            return emyk.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return emyk.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(a.h(i2, "negative size: "));
    }
}
