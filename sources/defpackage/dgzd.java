package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgzd {
    public static String a(int i) {
        if (i == 100) {
            return "HIGH_ACCURACY";
        }
        if (i == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i == 104) {
            return "LOW_POWER";
        }
        if (i == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }

    public static void b(int i) {
        boolean z;
        if (i != 100 && i != 102 && i != 104) {
            if (i != 105) {
                z = false;
                dfwv.c(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
            }
            i = 105;
        }
        z = true;
        dfwv.c(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i));
    }
}
