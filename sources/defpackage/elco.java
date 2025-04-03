package defpackage;

import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elco implements elci, ekwg {
    public static final enru a = enru.c("com/google/apps/tiktok/tracing/TraceManagerImpl");
    public final dlpw b;
    public final ffbr c;
    public final ConcurrentMap d = new ConcurrentHashMap(2, 0.75f, 1);
    public final AtomicLong e;
    public final int f;
    public final int g;
    private final ekzi h;
    private final ffbr i;
    private final ekyj j;

    public elco(ekzi ekziVar, dlpw dlpwVar, ffbr ffbrVar, ffbr ffbrVar2, ekyj ekyjVar, Map map, Map map2) {
        this.h = ekziVar;
        this.b = dlpwVar;
        this.c = ffbrVar;
        this.i = ffbrVar2;
        this.j = ekyjVar;
        Boolean bool = false;
        bool.getClass();
        if (map.isEmpty()) {
            this.f = 500;
        } else {
            emxf.b(((enoz) map).d == 1, "Please only specify the max number of spans once.");
            ((ekyu) enjk.l(((enhk) map).keySet())).a();
            this.f = 1500;
        }
        if (map2.isEmpty()) {
            this.g = 900000;
        } else {
            emxf.b(((enoz) map2).d == 1, "Please only specify the trace deadline limit once.");
            this.g = ((elca) enjk.l(((enhk) map2).keySet())).a();
        }
        this.e = new AtomicLong(this.g);
    }

    private static final void f(elat elatVar, String str) {
        ekxn ekxnVar;
        if (elatVar == null || elatVar == ekzt.a || (elatVar instanceof ekzj) || ekxm.a == 1) {
            return;
        }
        if (elatVar instanceof ekxr) {
            String o = ekyf.o(elatVar);
            if (!"".equals(o)) {
                o = ": ".concat(String.valueOf(o));
            }
            ekxnVar = new ekxn(o, str, ((ekxr) elatVar).g());
        } else {
            ekxnVar = new ekxn(str);
        }
        ekxn ekxnVar2 = ekxnVar;
        ekxnVar2.addSuppressed(eldx.c());
        if (ekxm.a != 3) {
            throw ekxnVar2;
        }
        ensk i = elch.a.i();
        i.Y(ente.a, "TraceManager");
        ((enrr) ((enrr) ((enrr) i).g(ekxnVar2)).h("com/google/apps/tiktok/tracing/TraceManager", "reportDuplicateTraceException", 'j', "TraceManager.java")).q("Duplicate trace");
    }

    private final elat g(String str, elae elaeVar, long j, long j2, int i, int i2) {
        UUID b = this.j.b();
        boolean a2 = eldt.a(b.getLeastSignificantBits(), 0.0f);
        eldn eldnVar = (eldn) eldq.a.createBuilder();
        long leastSignificantBits = b.getLeastSignificantBits();
        eldnVar.copyOnWrite();
        eldq eldqVar = (eldq) eldnVar.instance;
        eldqVar.b |= 2;
        eldqVar.d = leastSignificantBits;
        long mostSignificantBits = b.getMostSignificantBits();
        eldnVar.copyOnWrite();
        eldq eldqVar2 = (eldq) eldnVar.instance;
        eldqVar2.b |= 1;
        eldqVar2.c = mostSignificantBits;
        eldnVar.copyOnWrite();
        eldq eldqVar3 = (eldq) eldnVar.instance;
        eldqVar3.b |= 4;
        eldqVar3.f = j;
        eldnVar.copyOnWrite();
        eldq eldqVar4 = (eldq) eldnVar.instance;
        eldqVar4.b |= 8;
        eldqVar4.g = j2 / 1000000;
        eldnVar.copyOnWrite();
        eldq eldqVar5 = (eldq) eldnVar.instance;
        if (i2 == 0) {
            throw null;
        }
        eldqVar5.j = i2 - 1;
        eldqVar5.b |= 64;
        eldq eldqVar6 = (eldq) eldnVar.build();
        long millis = i2 == 2 ? j2 : this.b.e().toMillis() * 1000000;
        elem elemVar = new elem(str, elaeVar, i);
        eleo eleoVar = new eleo(this, b, eldqVar6, elemVar, millis, a2, false, this.b);
        elao b2 = ekyf.b();
        ekzl ekzlVar = new ekzl(elemVar, eleoVar, b2);
        ekzi ekziVar = this.h;
        if (ekziVar.d.compareAndSet(false, true)) {
            ekziVar.c.execute(new ekzf(ekziVar));
        }
        ekzh ekzhVar = new ekzh(ekzlVar, ekziVar.b);
        ekzi.a.put(ekzhVar, Boolean.TRUE);
        ekzg ekzgVar = ekzhVar.a;
        Executor executor = (Executor) this.c.b();
        eleoVar.f = ekzgVar;
        ekzgVar.b(eleoVar, executor);
        this.d.put(b, eleoVar);
        ekyf.h(b2, ekzlVar);
        return ekzlVar;
    }

    @Override // defpackage.ekwg
    public final /* bridge */ /* synthetic */ List a() {
        int i = engw.d;
        engr engrVar = new engr();
        Iterator it = this.d.entrySet().iterator();
        while (it.hasNext()) {
            engrVar.h(((eleo) ((Map.Entry) it.next()).getValue()).b());
        }
        return engrVar.g();
    }

    @Override // defpackage.elci
    public final ekzm b(String str, elae elaeVar, int i) {
        final elat c = ekyf.c();
        f(c, str);
        final elat g = g(str, elaeVar, this.b.f().toEpochMilli(), this.b.b(), 1, i);
        return c == ((ekzl) g).a ? g : new ekzm() { // from class: elcj
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                elat.this.close();
                ekyf.g(c);
            }
        };
    }

    @Override // defpackage.elci
    public final ekzm c(elae elaeVar, long j, long j2, int i) {
        final elat c = ekyf.c();
        f(c, "Application creation");
        final elat g = g("Application creation", elaeVar, j, j2, 1, i);
        return c == ((ekzl) g).a ? g : new ekzm() { // from class: elck
            @Override // defpackage.elav, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                elat.this.close();
                ekyf.g(c);
            }
        };
    }

    @Override // defpackage.elci
    public final elas d(String str, elae elaeVar, int i) {
        elat c = ekyf.c();
        f(c, str);
        return new elcn(new ekzz(g(str, elaeVar, this.b.f().toEpochMilli(), this.b.b(), 2, i), false), c);
    }

    public final void e(eldq eldqVar, SparseArray sparseArray, String str) {
        elao b = ekyf.b();
        elat elatVar = b.c;
        ekyf.g(new ekza(str, ekza.a, elad.a, b));
        try {
            Iterator it = ((Set) this.i.b()).iterator();
            RuntimeException runtimeException = null;
            while (it.hasNext()) {
                try {
                    ((elcg) it.next()).b(eldqVar, sparseArray);
                } catch (RuntimeException e) {
                    if (runtimeException != null) {
                        runtimeException.addSuppressed(e);
                    } else {
                        runtimeException = e;
                    }
                }
            }
            if (runtimeException == null) {
            } else {
                throw runtimeException;
            }
        } finally {
            ekyf.h(b, elatVar);
        }
    }
}
