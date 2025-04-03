package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evgp implements evew {
    private static final entd a = entd.c("xRPC");
    private dlpw b;
    private febr c;
    private long d;
    private evgk e;

    @Override // defpackage.evew
    public final /* synthetic */ evgb a(eves evesVar) {
        return evgb.a;
    }

    @Override // defpackage.evew
    public final evgb b(eves evesVar) {
        this.c = evesVar.c.a;
        evgk evgkVar = (evgk) evesVar.b.h(evgk.b);
        evgkVar.getClass();
        this.e = evgkVar;
        dlpw e = ((euzw) evesVar.b.h(euzx.a)).e();
        this.b = e;
        this.d = e.a();
        return evgb.a;
    }

    @Override // defpackage.evew
    public final /* synthetic */ evgb c() {
        return evgb.a;
    }

    @Override // defpackage.evew
    public final void d(ever everVar) {
        try {
            if (everVar.a.f()) {
                long a2 = this.b.a() - this.d;
                boolean z = true;
                if (!this.c.equals(febr.UNARY)) {
                    evgk evgkVar = this.e;
                    emxf.b(a2 >= 0, "Cannot record negative stream duration.");
                    if (evgkVar.l.getAndSet(a2) != -1) {
                        z = false;
                    }
                    emxf.m(z, "Already recorded stream duration.");
                } else if (a2 <= 2147483647L) {
                    evgk evgkVar2 = this.e;
                    int i = (int) a2;
                    emxf.b(i >= 0, "Cannot record negative latency.");
                    if (evgkVar2.i.getAndSet(i) != -1) {
                        z = false;
                    }
                    emxf.m(z, "Already recorded latency.");
                } else {
                    ((ensz) ((ensz) a.j()).h("com/google/frameworks/client/data/android/metrics/NetworkLatencyInterceptor", "startOnCompleteProcessing", 52, "NetworkLatencyInterceptor.java")).q("Recorded latency overflows Integer.MAX_VALUE, cannot be recorded");
                }
            }
            this.e.f.incrementAndGet();
        } catch (Throwable th) {
            ((ensz) ((ensz) ((ensz) a.i()).g(th)).h("com/google/frameworks/client/data/android/metrics/NetworkLatencyInterceptor", "startOnCompleteProcessing", '>', "NetworkLatencyInterceptor.java")).q("Failed to record network latency");
        }
    }

    @Override // defpackage.evew
    public final /* synthetic */ evgb e() {
        return evgb.a;
    }

    @Override // defpackage.evew
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.evew
    public final /* synthetic */ void g() {
    }
}
