package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enxa {
    private static final String[] a = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final enxe b;

    static {
        enxe enxgVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                enxgVar = new enxg();
                break;
            }
            try {
                enxgVar = (enxe) Class.forName(a[i]).asSubclass(enxe.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused) {
                enxgVar = null;
            }
            if (enxgVar != null) {
                break;
            } else {
                i++;
            }
        }
        b = enxgVar;
    }

    public static StackTraceElement a(Class cls, int i) {
        cls.getClass();
        if (i < 0) {
            throw new IllegalArgumentException(a.h(i, "skip count cannot be negative: "));
        }
        return b.a(cls, i + 1);
    }

    public static StackTraceElement[] b(Class cls, int i, int i2) {
        if (i <= 0 && i != -1) {
            throw new IllegalArgumentException("invalid maximum depth: 0");
        }
        return b.b(cls, i, i2 + 1);
    }
}
