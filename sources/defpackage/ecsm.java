package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecsm extends ecsg implements ecje, ecsa {
    public final ecjc a;
    public final fazb b;
    public final fazb c;
    public final ecst d;
    public final ecsv e;
    public final AtomicReference f;
    private final errm g;

    public ecsm(ecjd ecjdVar, errm errmVar, final fazb fazbVar, fazb fazbVar2, ffbr ffbrVar, ecst ecstVar) {
        AtomicReference atomicReference = new AtomicReference();
        this.f = atomicReference;
        this.g = errmVar;
        this.b = fazbVar;
        this.c = fazbVar2;
        this.d = ecstVar;
        this.a = ecjdVar.a(errmVar, new fazb() { // from class: ecsk
            @Override // defpackage.fazb
            public final Object b() {
                return ecsc.f().c(true).d();
            }
        }, ffbrVar);
        this.e = new ecsv(new ffbr() { // from class: ecsl
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                fazb fazbVar3 = fazb.this;
                return Integer.valueOf(((ecrz) fazbVar3.b()).c() ? ((ecrz) fazbVar3.b()).a() : 10);
            }
        });
        atomicReference.set(ecstVar.a(1.0f));
    }

    private final void g(final String str, final boolean z, final long j, final eciu eciuVar) {
        erqt.n(new erog() { // from class: ecsh
            @Override // defpackage.erog
            public final ListenableFuture a() {
                String str2 = str;
                eciu eciuVar2 = eciuVar;
                boolean z2 = z;
                ecsm ecsmVar = ecsm.this;
                if (z2) {
                    eciuVar2.d(true);
                } else {
                    ((ecrz) ecsmVar.b.b()).f();
                    long a = ecsmVar.a.a(str2);
                    if (a == -1) {
                        return erre.a;
                    }
                    ((ecim) eciuVar2).d = Long.valueOf(a);
                }
                if (!((ecrz) ecsmVar.b.b()).c()) {
                    return erre.a;
                }
                if (ecsmVar.e.c()) {
                    return erre.a;
                }
                long j2 = j;
                ecsmVar.e.b();
                ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "recordTrace", 312, "TraceMetricServiceImpl.java")).A("Recording trace %d: %s", j2, str2);
                return ecsmVar.a.b(eciuVar2.a());
            }
        }, this.g);
    }

    @Override // defpackage.ecsa
    public final ListenableFuture a(String str, String str2) {
        if (true != TextUtils.isEmpty(str2)) {
            str = str2;
        }
        int i = ecsn.a;
        emxf.l(!TextUtils.isEmpty(str));
        final ecsf ecsfVar = (ecsf) ecsn.c.getAndSet(null);
        if (ecsfVar != null) {
            ecsfVar.b.b = str;
        }
        return ecsfVar == null ? erre.a : erqt.n(new erog() { // from class: ecsj
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.erog
            public final ListenableFuture a() {
                List unmodifiableList;
                ecsm ecsmVar = ecsm.this;
                if (!((ecsc) ecsmVar.c.b()).c()) {
                    return erre.a;
                }
                if (((ecrz) ecsmVar.b.b()).c()) {
                    ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "endTracingIfStarted", 153, "TraceMetricServiceImpl.java")).q("Primes Tracing is not supported if TikTok tracing is enabled");
                    return erre.a;
                }
                if (ecsmVar.e.c()) {
                    return erre.a;
                }
                ecsf ecsfVar2 = ecsfVar;
                ecsmVar.e.b();
                int i2 = ecsn.a;
                efbd.b();
                if (ecsfVar2.a() != 0) {
                    Comparator comparator = new Comparator() { // from class: ecsd
                        @Override // java.util.Comparator
                        public final int compare(Object obj, Object obj2) {
                            return (int) (((ecrv) obj).c - ((ecrv) obj2).c);
                        }
                    };
                    synchronized (ecsfVar2.d) {
                        Collections.sort(ecsfVar2.d, comparator);
                        ecsfVar2.b.b(ecsfVar2.d);
                    }
                    ArrayList arrayList = new ArrayList(ecsfVar2.c.keySet());
                    Collections.sort(arrayList, comparator);
                    ecsfVar2.b.b(arrayList);
                    ecrw ecrwVar = new ecrw(ecsfVar2.b);
                    ArrayList arrayList2 = new ArrayList();
                    ecrwVar.a(ecrwVar.a, 0L, arrayList2);
                    if (arrayList2.size() != 1) {
                        unmodifiableList = DesugarCollections.unmodifiableList(arrayList2);
                        if (unmodifiableList != null || unmodifiableList.isEmpty()) {
                            return erre.a;
                        }
                        fgnn fgnnVar = (fgnn) fgnp.a.createBuilder();
                        long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                        fgnnVar.copyOnWrite();
                        fgnp fgnpVar = (fgnp) fgnnVar.instance;
                        fgnpVar.b = 1 | fgnpVar.b;
                        fgnpVar.c = leastSignificantBits;
                        fgnnVar.copyOnWrite();
                        fgnp fgnpVar2 = (fgnp) fgnnVar.instance;
                        fgnpVar2.a();
                        eydl.addAll(unmodifiableList, fgnpVar2.e);
                        fgnp fgnpVar3 = (fgnp) fgnnVar.build();
                        String str3 = fgnpVar3.e.size() > 0 ? ((fgns) fgnpVar3.e.get(0)).c : null;
                        long a = ecsmVar.a.a(str3);
                        if (a == -1) {
                            return erre.a;
                        }
                        fgqw fgqwVar = (fgqw) fgqx.a.createBuilder();
                        fgqwVar.copyOnWrite();
                        fgqx fgqxVar = (fgqx) fgqwVar.instance;
                        fgnpVar3.getClass();
                        fgqxVar.m = fgnpVar3;
                        fgqxVar.b |= 2048;
                        fgqx fgqxVar2 = (fgqx) fgqwVar.build();
                        ((enrr) ((enrr) ecdj.a.f()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "endTracingIfStarted", 186, "TraceMetricServiceImpl.java")).A("Recording trace %d: %s", fgnpVar3.c, str3);
                        ecjc ecjcVar = ecsmVar.a;
                        eciu m = eciv.m();
                        m.f(fgqxVar2);
                        ((ecim) m).d = Long.valueOf(a);
                        return ecjcVar.b(m.a());
                    }
                    ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/trace/SpanProtoGenerator", "generate", 71, "SpanProtoGenerator.java")).q("No other span except for root span. Dropping trace...");
                }
                unmodifiableList = null;
                if (unmodifiableList != null) {
                }
                return erre.a;
            }
        }, this.g);
    }

    @Override // defpackage.ecsa
    public final void b() {
        ecsf ecsfVar = (ecsf) ecsn.c.getAndSet(null);
        if (ecsfVar != null) {
            ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/metrics/trace/Tracer", "cancel", 102, "Tracer.java")).t("Cancel trace: %s", ecsfVar.b.b);
        }
    }

    @Override // defpackage.ecsa
    public final void c(String str, long j, long j2) {
        ecsf ecsfVar;
        if (TextUtils.isEmpty(str) || j2 <= 0 || (ecsfVar = (ecsf) ecsn.c.get()) == null || ecsfVar.b.c > j) {
            return;
        }
        ((enrr) ((enrr) ecdj.a.g()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceData", "sideLoadSpan", 115, "TraceData.java")).J("Sideload span: %s. startMs: %d, durationMs: %d", str, Long.valueOf(j), Long.valueOf(j2));
        ecrv ecrvVar = new ecrv(str, j, j + j2, Thread.currentThread().getId(), 4);
        synchronized (ecsfVar.d) {
            ecsfVar.d.add(ecrvVar);
        }
        ecsfVar.b();
    }

    @Override // defpackage.ecsa
    public final boolean d(String str) {
        if (!((ecss) this.f.get()).a()) {
            return false;
        }
        int i = ecsn.a;
        str.getClass();
        if (ecsn.c.get() == null) {
            AtomicReference atomicReference = ecsn.c;
            ecsf ecsfVar = new ecsf(str);
            while (!atomicReference.compareAndSet(null, ecsfVar)) {
                if (atomicReference.get() != null) {
                }
            }
            ecsn.a = 5;
            ecsn.b = 1000;
            return true;
        }
        ((enrr) ((enrr) ecdj.a.g()).h("com/google/android/libraries/performance/primes/metrics/trace/Tracer", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 67, "Tracer.java")).q("Ignore Tracer.start(), current active trace...");
        return false;
    }

    @Override // defpackage.ecsg
    public final void e(fgom fgomVar, fgrg fgrgVar, fgmh fgmhVar) {
        if (fgomVar.k.size() == 0) {
            ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "recordAsFuture", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "TraceMetricServiceImpl.java")).q("Invalid traces were logged.");
            ListenableFuture listenableFuture = erre.a;
            return;
        }
        eciu m = eciv.m();
        fgqw fgqwVar = (fgqw) fgqx.a.createBuilder();
        fgqwVar.copyOnWrite();
        fgqx fgqxVar = (fgqx) fgqwVar.instance;
        fgqxVar.o = fgomVar;
        fgqxVar.b |= 8192;
        fgqwVar.copyOnWrite();
        fgqx fgqxVar2 = (fgqx) fgqwVar.instance;
        fgqxVar2.p = fgrgVar;
        fgqxVar2.b |= 16384;
        m.f((fgqx) fgqwVar.build());
        if (fgmhVar != null) {
            ((ecim) m).b = fgmhVar;
        }
        g(fgomVar.d, fgomVar.f.size() > 0, fgomVar.c, m);
    }

    @Override // defpackage.ecsg
    public final void f(fgrq fgrqVar, String str, fgmh fgmhVar) {
        boolean z;
        if (fgrqVar.d.size() == 0) {
            ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/trace/TraceMetricServiceImpl", "recordAsFuture", 218, "TraceMetricServiceImpl.java")).q("Invalid traces were logged.");
            ListenableFuture listenableFuture = erre.a;
            return;
        }
        eciu m = eciv.m();
        fgqw fgqwVar = (fgqw) fgqx.a.createBuilder();
        fgqwVar.copyOnWrite();
        fgqx fgqxVar = (fgqx) fgqwVar.instance;
        fgqxVar.n = fgrqVar;
        fgqxVar.b |= 4096;
        m.f((fgqx) fgqwVar.build());
        if (fgmhVar != null) {
            ((ecim) m).b = fgmhVar;
        }
        Iterator<E> it = fgrqVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if ((((fgrn) it.next()).b & 2048) != 0) {
                z = true;
                break;
            }
        }
        g(str, z, fgrqVar.c, m);
    }

    @Override // defpackage.ecje
    public final void n() {
        this.g.execute(new Runnable() { // from class: ecsi
            @Override // java.lang.Runnable
            public final void run() {
                ecsm ecsmVar = ecsm.this;
                try {
                    ecsmVar.f.set(ecsmVar.d.a(((ecsc) ecsmVar.c.b()).c() ? ((ecsc) ecsmVar.c.b()).d() : 0.0f));
                } catch (Throwable unused) {
                    ecsmVar.f.set(ecsmVar.d.a(0.0f));
                }
            }
        });
    }
}
