package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duxu implements duof {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager");
    public static final duvz b;
    public final ConcurrentHashMap c;
    public final ArrayDeque d;
    public volatile boolean e;
    public eocf f;
    private final errl g;
    private volatile errl h;
    private final duxv i;
    private volatile List j;
    private final AtomicInteger k;
    private volatile boolean l;
    private volatile int m;
    private final duwa n;
    private volatile duxd o;

    static {
        b = duwb.a("timer_default_sample_rate", true != dvab.a ? 500L : 1000L);
    }

    public duxu(errl errlVar) {
        new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.j = null;
        this.d = new ArrayDeque();
        this.f = null;
        this.k = new AtomicInteger(0);
        duwa duwaVar = new duwa() { // from class: duxm
        };
        this.n = duwaVar;
        this.o = new duxe();
        duxv duxvVar = new duxv();
        this.i = duxvVar;
        duxvVar.b = new duxp();
        duvz duvzVar = b;
        this.m = ((Long) duvzVar.b()).intValue();
        duwb.c(duwaVar, duvzVar);
        duoe.a.a(this);
        this.g = errlVar;
    }

    public final errl a() {
        return this.g;
    }

    public final void b(duxi duxiVar, Object... objArr) {
        duxk duxkVar = this.i.a;
        if (duxiVar == duxl.BEGIN_SESSION || duxiVar == duxl.END_SESSION) {
            throw new IllegalArgumentException(String.format("Metrics type [%s] should not be used by developers.", duxiVar));
        }
        Instant.now().toEpochMilli();
        SystemClock.elapsedRealtime();
        duxiVar.a();
        duxiVar.b();
        if (this.k.get() > 0 || this.c.get(duxiVar) != null) {
            final duxt duxtVar = new duxt(duxiVar, objArr);
            erqt.r(erqt.l(new Runnable() { // from class: duxn
                @Override // java.lang.Runnable
                public final void run() {
                    eocf eocfVar;
                    boolean z;
                    emyx emyxVar;
                    duxu duxuVar = duxu.this;
                    duxuVar.d.add(duxtVar);
                    if (duzy.a) {
                        duxuVar.f = new eocf(new eobx());
                    }
                    while (!duxuVar.d.isEmpty()) {
                        duxt duxtVar2 = (duxt) duxuVar.d.poll();
                        if (duxtVar2 != null) {
                            ConcurrentHashMap concurrentHashMap = duxuVar.c;
                            duxi duxiVar2 = duxtVar2.a;
                            final duxh[] duxhVarArr = (duxh[]) concurrentHashMap.get(duxiVar2);
                            if (duxhVarArr == null || duxiVar2 == duxf.a) {
                                ((enrr) ((enrr) duxu.a.g()).h("com/google/android/libraries/inputmethod/metrics/manager/MetricsManager", "processMetricsImpl", 799, "MetricsManager.java")).D("Metrics are not logged: MetricsType=%s, IMetricsProcessor=%s", duxiVar2, new enrw() { // from class: duxo
                                    @Override // defpackage.enrw
                                    public final Object a() {
                                        enru enruVar = duxu.a;
                                        duxh[] duxhVarArr2 = duxhVarArr;
                                        return duxhVarArr2 != null ? Arrays.toString(duxhVarArr2) : "null";
                                    }
                                });
                            } else {
                                int length = duxhVarArr.length;
                                for (int i = 0; i < length; i++) {
                                    duxh duxhVar = duxhVarArr[i];
                                    try {
                                        boolean z2 = duxuVar.e;
                                        if (!duxhVar.a()) {
                                            duxhVar.b();
                                        }
                                    } finally {
                                        if (!z) {
                                        }
                                    }
                                }
                            }
                            for (Object obj : duxtVar2.b) {
                                if (obj != null && !(obj instanceof Integer) && !(obj instanceof Boolean) && !(obj instanceof Long) && !(obj instanceof String) && !(obj instanceof Double) && !(obj instanceof Float)) {
                                    if (obj instanceof dumd) {
                                        ((dumd) obj).a();
                                    } else if (obj instanceof MotionEvent) {
                                        ((MotionEvent) obj).recycle();
                                    }
                                }
                            }
                            if (duzy.a && (eocfVar = duxuVar.f) != null && new eobi(eocfVar).size() != 0) {
                                HashMap h = ennc.h(eocfVar.d().size());
                                for (Object obj2 : eocfVar.d()) {
                                    ArrayDeque arrayDeque = new ArrayDeque();
                                    arrayDeque.addLast(new eobz(obj2));
                                    while (!arrayDeque.isEmpty()) {
                                        eobz eobzVar = (eobz) arrayDeque.removeLast();
                                        arrayDeque.addLast(eobzVar);
                                        Object obj3 = eobzVar.a;
                                        if (eobzVar.b == null) {
                                            eoca eocaVar = (eoca) h.get(obj3);
                                            if (eocaVar == eoca.COMPLETE) {
                                                arrayDeque.removeLast();
                                            } else {
                                                eoca eocaVar2 = eoca.PENDING;
                                                if (eocaVar == eocaVar2) {
                                                    throw new IllegalStateException(String.format(Locale.getDefault(), "Cycle detected while processing metrics type: %s", duxtVar2.a));
                                                }
                                                h.put(obj3, eocaVar2);
                                                eobzVar.b = new ArrayDeque(eocfVar.e(obj3));
                                            }
                                        }
                                        if (eobzVar.b.isEmpty()) {
                                            arrayDeque.removeLast();
                                            h.put(obj3, eoca.COMPLETE);
                                        } else {
                                            arrayDeque.addLast(new eobz(eobzVar.b.remove()));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (duzy.a) {
                        duxuVar.f = null;
                    }
                }
            }, a()), new duxr(this), erpp.a);
        }
    }
}
