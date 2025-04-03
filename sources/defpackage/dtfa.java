package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtfa {
    public static int a(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }

    public static String b(int i) {
        if (i != 1) {
            return Integer.toString(i - 2);
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
