package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecoh implements erqj {
    final /* synthetic */ ecoi a;

    public ecoh(ecoi ecoiVar) {
        this.a = ecoiVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ecnp ecnpVar = (ecnp) obj;
        synchronized (this.a.g) {
            this.a.g.set(ecnpVar);
            this.a.k = null;
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(th)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl$1", "onFailure", (char) 219, "MemoryMetricServiceImpl.java")).q("Memory snapshot failed");
        synchronized (this.a.g) {
            this.a.g.set(ecnp.a);
            this.a.k = null;
        }
    }
}
