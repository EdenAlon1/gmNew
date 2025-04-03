package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgyo {
    public static String a(int i) {
        if (i == 0) {
            return "GRANULARITY_PERMISSION_LEVEL";
        }
        if (i == 1) {
            return "GRANULARITY_COARSE";
        }
        if (i == 2) {
            return "GRANULARITY_FINE";
        }
        throw new IllegalArgumentException();
    }

    public static void b(int i) {
        boolean z;
        if (i != 0 && i != 1) {
            if (i != 2) {
                z = false;
                dfwv.c(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i));
            }
            i = 2;
        }
        z = true;
        dfwv.c(z, "granularity %d must be a Granularity.GRANULARITY_* constant", Integer.valueOf(i));
    }
}
