package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fghr {
    public static final int a(String str, int i, int i2, int i3) {
        return (int) b(str, i, i2, i3);
    }

    public static final long b(String str, long j, long j2, long j3) {
        String a = fghq.a(str);
        if (a == null) {
            return j;
        }
        Long h = ffpc.h(a);
        if (h == null) {
            throw new IllegalStateException(a.d(a, str, "System property '", "' has unrecognized value '", "'"));
        }
        long longValue = h.longValue();
        if (j2 <= longValue && longValue <= j3) {
            return longValue;
        }
        throw new IllegalStateException("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + "'");
    }

    public static final boolean c(String str, boolean z) {
        String a = fghq.a(str);
        return a != null ? Boolean.parseBoolean(a) : z;
    }
}
