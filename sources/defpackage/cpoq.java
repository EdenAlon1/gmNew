package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpoq {
    private static final cfup a = cfvl.e(cfvl.b, "tachygram_work_handler_retries", 6);
    private static final cfup b = cfvl.f(cfvl.b, "tachygram_work_handler_retry_delay_milliseconds", 10000);

    static cetx a() {
        cetx l = cety.l();
        l.c(((Integer) a.e()).intValue());
        l.f(poa.EXPONENTIAL);
        l.g(((Long) b.e()).longValue());
        l.b(cevc.BACKGROUND_SERVICE_FALLBACK_TO_FOREGROUND_SERVICE);
        return l;
    }
}
