package defpackage;

import android.os.SystemClock;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecrv implements Closeable {
    static final ecrv a = new ecrv("", SystemClock.elapsedRealtime(), -1, Thread.currentThread().getId(), 3);
    String b;
    final long c;
    long d;
    final long e;
    public volatile List f;
    final int g;
    final int h;

    public ecrv(String str, long j, long j2, long j3, int i) {
        this.b = str;
        this.g = 1;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.h = i;
        if (i == 1) {
            this.f = DesugarCollections.synchronizedList(new ArrayList());
        } else {
            this.f = Collections.EMPTY_LIST;
        }
    }

    public final long a() {
        long j = this.d;
        if (j == -1) {
            return -1L;
        }
        return j - this.c;
    }

    final void b(List list) {
        if (this.f == Collections.EMPTY_LIST) {
            this.f = new ArrayList();
        }
        if (this.f != null) {
            this.f.addAll(list);
        }
    }

    final boolean c() {
        return this.h == 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = ecsn.a;
        if (equals(a)) {
            return;
        }
        if (this.d < 0) {
            this.d = SystemClock.elapsedRealtime();
        }
        ecsf ecsfVar = (ecsf) ecsn.c.get();
        if (ecsfVar != null) {
            if (this != ((ecrv) ecsfVar.c().poll())) {
                ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "endSpan", 189, "Tracer.java")).q("Incorrect Span passed. Ignore...");
                return;
            }
            if (a() >= ecsn.a) {
                if (ecsfVar.b() >= ecsn.b) {
                    ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "endSpan", 198, "Tracer.java")).r("Dropping trace as max buffer size is hit. Size: %d", ecsfVar.a());
                    ecsn.c.set(null);
                    return;
                }
                ecrv ecrvVar = (ecrv) ecsfVar.c().peek();
                if (ecrvVar == null) {
                    ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceData", "linkToParent", 108, "TraceData.java")).t("null Parent for Span: %s", this.b);
                    return;
                }
                if (ecrvVar.f == Collections.EMPTY_LIST) {
                    ecrvVar.f = new ArrayList();
                }
                if (ecrvVar.f != null) {
                    ecrvVar.f.add(this);
                }
            }
        }
    }

    public ecrv(String str, long j, int i) {
        this(str, SystemClock.elapsedRealtime(), -1L, j, i);
    }
}
