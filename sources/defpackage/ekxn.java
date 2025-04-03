package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekxn extends IllegalStateException {
    public ekxn(String str) {
        super(a(null, str));
    }

    private static String a(String str, String str2) {
        return a.d(str == null ? "" : ": ".concat(str), str2, "Starting new trace ", " when already associated with a trace", ". For more help, see http://go/tiktok-tracing#fixing-duplicate-trace-issues");
    }

    public ekxn(String str, String str2, Throwable th) {
        super(a(str, str2), th);
    }
}
