package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccue {
    public static int a(int i) {
        return i - 1;
    }

    static String b(int i) {
        int i2 = i - 1;
        return i2 == a(5) ? "r" : i2 == a(3) ? "f" : i2 == a(9) ? "d" : i2 == a(17) ? "i" : i2 == a(33) ? "u" : i2 != a(65) ? "" : "a";
    }
}
