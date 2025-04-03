package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciwe {
    public static final cfup a = cfvl.e(cfvl.b, "notification_silent_interval_seconds", 1);
    private final cqoh b;
    private long c;

    public ciwe(cqoh cqohVar) {
        this.b = cqohVar;
    }

    public final synchronized void a() {
        this.c = this.b.a();
    }

    public final synchronized boolean b() {
        return this.b.a() - this.c > ((long) (((Integer) a.e()).intValue() * 1000));
    }
}
