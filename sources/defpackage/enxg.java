package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enxg implements enxe {
    private static final int c(StackTraceElement[] stackTraceElementArr, Class cls, int i) {
        String name = cls.getName();
        boolean z = false;
        while (i < stackTraceElementArr.length) {
            if (stackTraceElementArr[i].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // defpackage.enxe
    public final StackTraceElement a(Class cls, int i) {
        enxb.a(i >= 0, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int c = c(stackTrace, cls, i + 1);
        if (c != -1) {
            return stackTrace[c];
        }
        return null;
    }

    @Override // defpackage.enxe
    public final StackTraceElement[] b(Class cls, int i, int i2) {
        enxb.a(i == -1 || i > 0, "maxDepth must be > 0 or -1");
        enxb.a(true, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int c = c(stackTrace, cls, i2 + 1);
        if (c == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - c;
        if (i <= 0 || i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, c, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
