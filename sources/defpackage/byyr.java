package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byyr {
    public static String a(int i) {
        if (i == 0) {
            return "one on one";
        }
        if (i == 1) {
            return "group xms";
        }
        if (i == 2) {
            return "group rcs";
        }
        throw new IllegalArgumentException(a.f(i, "invalid conversation type (", ")"));
    }

    public static boolean b(int i) {
        return i == 2 || i == 1;
    }

    public static boolean c(int i) {
        return i == 0;
    }

    public static boolean d(int i) {
        return i == 2;
    }

    public static boolean e(int i) {
        return i == 1;
    }
}
