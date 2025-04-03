package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emzf {
    static final emyl a = new emyr(new emza());
    static final emyv b;
    enan g;
    enan h;
    emwj k;
    emwj l;
    emyv m;
    emze o;
    emzd p;
    boolean c = true;
    int d = -1;
    long e = -1;
    long f = -1;
    long i = -1;
    long j = -1;
    final emyl n = a;

    static {
        new emzj();
        b = new emzb();
    }

    private final void g() {
        if (this.o == null) {
            emxf.m(this.f == -1, "maximumWeight requires weigher");
        } else if (this.c) {
            emxf.m(this.f != -1, "weigher requires maximumWeight");
        } else if (this.f == -1) {
            emzc.a.logp(Level.WARNING, "com.google.common.cache.CacheBuilder", "checkWeightWithWeigher", "ignoring weigher specified without maximumWeight");
        }
    }

    public final emyz a() {
        g();
        emxf.m(true, "refreshAfterWrite requires a LoadingCache");
        return new enai(new enbf(this, null));
    }

    public final emzl b(emzi emziVar) {
        g();
        return new enah(this, emziVar);
    }

    final enan c() {
        return (enan) emxa.c(this.g, enan.STRONG);
    }

    final enan d() {
        return (enan) emxa.c(this.h, enan.STRONG);
    }

    public final void e(long j, TimeUnit timeUnit) {
        long j2 = this.i;
        emxf.o(j2 == -1, "expireAfterWrite was already set to %s ns", j2);
        emxf.u(j >= 0, j, timeUnit);
        this.i = timeUnit.toNanos(j);
    }

    public final void f(long j) {
        long j2 = this.e;
        emxf.o(j2 == -1, "maximum size was already set to %s", j2);
        long j3 = this.f;
        emxf.o(j3 == -1, "maximum weight was already set to %s", j3);
        emxf.m(this.o == null, "maximum size can not be combined with weigher");
        emxf.b(j >= 0, "maximum size must not be negative");
        this.e = j;
    }

    public final String toString() {
        emwz b2 = emxa.b(this);
        int i = this.d;
        if (i != -1) {
            b2.f("concurrencyLevel", i);
        }
        long j = this.e;
        if (j != -1) {
            b2.g("maximumSize", j);
        }
        long j2 = this.f;
        if (j2 != -1) {
            b2.g("maximumWeight", j2);
        }
        long j3 = this.i;
        if (j3 != -1) {
            b2.b("expireAfterWrite", j3 + "ns");
        }
        long j4 = this.j;
        if (j4 != -1) {
            b2.b("expireAfterAccess", j4 + "ns");
        }
        enan enanVar = this.g;
        if (enanVar != null) {
            b2.b("keyStrength", emuz.c(enanVar.toString()));
        }
        enan enanVar2 = this.h;
        if (enanVar2 != null) {
            b2.b("valueStrength", emuz.c(enanVar2.toString()));
        }
        if (this.k != null) {
            b2.a("keyEquivalence");
        }
        if (this.l != null) {
            b2.a("valueEquivalence");
        }
        if (this.p != null) {
            b2.a("removalListener");
        }
        return b2.toString();
    }
}
