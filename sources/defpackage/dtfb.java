package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtfb {
    public static int a(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }

    public static String b(int i) {
        if (i != 1) {
            return Integer.toString(i - 2);
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
