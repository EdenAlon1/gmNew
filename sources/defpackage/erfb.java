package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erfb {
    public static int a(int i) {
        if (i != 1) {
            return i - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static String b(int i) {
        return Integer.toString(a(i));
    }

    public static /* synthetic */ void c(int i) {
        if (i == 0) {
            throw null;
        }
    }
}
