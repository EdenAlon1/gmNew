package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnnc {
    public static final cfup a = cfvl.f(cfvl.b, "report_issue_global_backoff_time_ms", 604800000);
    public final cqoh b;
    public final cnmv c;
    public final errl d;

    public cnnc(cqoh cqohVar, cnmv cnmvVar, errl errlVar) {
        this.b = cqohVar;
        this.c = cnmvVar;
        this.d = errlVar;
    }

    public final boolean a(Long l, long j) {
        return j + (l != null ? l.longValue() : 0L) <= this.b.f().toEpochMilli();
    }
}
