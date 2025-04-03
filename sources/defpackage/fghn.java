package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fghn {
    private static final StackTraceElement a;
    private static final String b;
    private static final String c;

    static {
        Object a2;
        Object a3;
        Exception exc = new Exception();
        String simpleName = a.class.getSimpleName();
        simpleName.getClass();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        a = new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            a2 = Class.forName("ffhp").getCanonicalName();
        } catch (Throwable th) {
            a2 = ffci.a(th);
        }
        if (ffch.c(a2) != null) {
            a2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) a2;
        try {
            a3 = Class.forName("fghn").getCanonicalName();
        } catch (Throwable th2) {
            a3 = ffci.a(th2);
        }
        if (ffch.c(a3) != null) {
            a3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String) a3;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Throwable a(java.lang.Throwable r10, defpackage.ffhs r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fghn.a(java.lang.Throwable, ffhs):java.lang.Throwable");
    }

    public static final Throwable b(Throwable th) {
        Throwable a2;
        if (!ffso.b || (a2 = fggt.a(th)) == null) {
            return th;
        }
        StackTraceElement[] stackTrace = a2.getStackTrace();
        int length = stackTrace.length;
        int i = length - 1;
        if (i >= 0) {
            while (true) {
                int i2 = i - 1;
                if (ffkj.e(c, stackTrace[i].getClassName())) {
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                i = i2;
            }
        }
        i = -1;
        int e = e(stackTrace, b);
        int i3 = 0;
        int i4 = (length - i) - (e == -1 ? 0 : length - e);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? a : stackTrace[((i + 1) + i3) - 1];
            i3++;
        }
        a2.setStackTrace(stackTraceElementArr);
        return a2;
    }

    public static final Throwable c(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            if (ffkj.e(cause.getClass(), th.getClass())) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (d(stackTraceElement)) {
                        return cause;
                    }
                }
            }
        }
        return th;
    }

    public static final boolean d(StackTraceElement stackTraceElement) {
        return ffpc.t(stackTraceElement.getClassName(), "_COROUTINE");
    }

    private static final int e(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (ffkj.e(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}
