package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evgi implements evew {
    private static final entd a = entd.c("xRPC");
    private evgk b;
    private febr c;
    private evgj d;

    @Override // defpackage.evew
    public final /* synthetic */ evgb a(eves evesVar) {
        return evgb.a;
    }

    @Override // defpackage.evew
    public final evgb b(eves evesVar) {
        this.c = evesVar.c.a;
        fdxj fdxjVar = evesVar.b;
        euzw euzwVar = (euzw) fdxjVar.h(euzx.a);
        emyl h = euzwVar.h();
        euzwVar.r();
        this.d = new evgj(h);
        emxf.f(fdxjVar.h(evgk.b) == null, "Unexpected option %s already set.", evgk.b);
        emxf.f(fdxjVar.h(evgh.a) == null, "Unexpected option %s already set.", evgh.a);
        this.b = new evgk((evbk) fdxjVar.h(evbk.a));
        return new evgb(1, null, null, fdxjVar.f(evgk.b, this.b).f(evgh.a, this.b));
    }

    @Override // defpackage.evew
    public final /* synthetic */ evgb c() {
        return evgb.a;
    }

    @Override // defpackage.evew
    public final void d(ever everVar) {
        try {
            emxf.m(this.b.m.getAndSet(everVar.a.getCode()) == null, "Already recorded result.");
            evgj evgjVar = this.d;
            evgk evgkVar = this.b;
            if (((Boolean) ((emyr) evgjVar.a).a).booleanValue() && evgkVar.e.get()) {
                ecdc a2 = ecdc.a();
                ecou a3 = ecou.a(null, evgkVar.c.a());
                boolean z = evgkVar.d.get();
                emxf.a(true);
                emxf.a(true);
                a3.q = 1;
                a3.r = z ? 1 : 0;
                a2.g(a3);
            }
            evbn evbnVar = evgjVar.b;
        } catch (Throwable th) {
            ((ensz) ((ensz) ((ensz) a.i()).g(th)).h("com/google/frameworks/client/data/android/metrics/MetricsRecordingInterceptor", "startOnCompleteProcessing", 'R', "MetricsRecordingInterceptor.java")).q("Failed to record RPC metrics");
        }
    }

    @Override // defpackage.evew
    public final evgb e() {
        if (this.c.equals(febr.CLIENT_STREAMING) || this.c.equals(febr.BIDI_STREAMING)) {
            this.b.h.incrementAndGet();
        }
        return evgb.a;
    }

    @Override // defpackage.evew
    public final void g() {
        if (this.c.equals(febr.SERVER_STREAMING) || this.c.equals(febr.BIDI_STREAMING)) {
            this.b.g.incrementAndGet();
        }
    }

    @Override // defpackage.evew
    public final /* synthetic */ void f() {
    }
}
