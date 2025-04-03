package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agzf {
    public static dtzj a(boolean z) {
        return new dtzq("CAST(IFNULL($V, 0) AS INT) = $V", new Object[]{ahgi.c.d, Integer.valueOf(d(z))});
    }

    static dtzj b(boolean z) {
        return new dtzq("CAST(IFNULL($V, 0) AS INT) > $V", new Object[]{ahgi.c.d, Integer.valueOf(d(z))});
    }

    public static dtzj c(boolean z) {
        return new dtzq("CAST(IFNULL($V, 0) AS INT) < $V", new Object[]{ahgi.c.d, Integer.valueOf(d(z))});
    }

    private static int d(boolean z) {
        return z ? 1 : 0;
    }
}
