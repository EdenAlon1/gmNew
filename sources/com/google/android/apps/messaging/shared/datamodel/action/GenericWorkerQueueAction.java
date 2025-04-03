package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.axos;
import defpackage.bafg;
import defpackage.bafh;
import defpackage.bafi;
import defpackage.bbex;
import defpackage.btih;
import defpackage.btjj;
import defpackage.btka;
import defpackage.btkd;
import defpackage.btkg;
import defpackage.btkh;
import defpackage.btki;
import defpackage.cbyk;
import defpackage.cbyl;
import defpackage.cbym;
import defpackage.cbze;
import defpackage.cfva;
import defpackage.cfvl;
import defpackage.cmi;
import defpackage.cmj;
import defpackage.cqoh;
import defpackage.csix;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.efbd;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.elfo;
import defpackage.elfr;
import defpackage.emwl;
import defpackage.emyl;
import defpackage.engw;
import defpackage.enou;
import defpackage.eogt;
import defpackage.erog;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.errl;
import defpackage.fazb;
import defpackage.ffbr;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class GenericWorkerQueueAction extends ThrottledAction {
    public final Context i;
    public final ffbr j;
    public final ffbr k;
    public final errl l;
    public final fazb m;
    public final cqoh n;
    public final engw o;
    private Collection p;
    private Collection q;
    public static final Object a = new Object();
    public static final Set b = new cmj();
    public static final Map c = new ArrayMap();
    public static final cskc d = cskc.g("BugleJobs", "GenericWorkerQueueAction");
    static final cfva e = cfvl.q(144800135);
    static final cfva f = cfvl.q(150235497);
    static final cfva g = cfvl.o(153002503);
    static final cfva h = cfvl.r(162272678, "enable_propagating_async_work_future");
    public static final Parcelable.Creator<ThrottledAction> CREATOR = new bafh();

    /* compiled from: PG */
    public interface a {
        bafi hN();
    }

    public GenericWorkerQueueAction(Context context, ffbr ffbrVar, ffbr ffbrVar2, cbym cbymVar, errl errlVar, fazb fazbVar, cqoh cqohVar) {
        super(eogt.GENERIC_WORKER_QUEUE_ACTION);
        this.i = context;
        this.j = ffbrVar;
        this.k = ffbrVar2;
        this.l = errlVar;
        this.m = fazbVar;
        this.n = cqohVar;
        this.o = cbymVar.a();
        O();
    }

    private final Executor N() {
        return ((Boolean) g.e()).booleanValue() ? (Executor) this.m.b() : this.l;
    }

    private final void O() {
        this.p = new ArrayList();
        this.q = new ArrayList();
        engw engwVar = this.o;
        if (engwVar == null || engwVar.isEmpty()) {
            return;
        }
        engw engwVar2 = this.o;
        for (int i = 0; i < ((enou) engwVar2).c; i++) {
            cbyl cbylVar = (cbyl) engwVar2.get(i);
            if (cbylVar instanceof cbyk) {
                this.q.add((cbyk) cbylVar);
            } else {
                this.p.add(cbylVar);
            }
        }
    }

    public static void m(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!b.add(((btih) it.next()).r())) {
                it.remove();
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("GenericWorkerQueueAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.GenericWorkerQueueAction.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 302;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return 50L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "GenericWorkerQueueAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final elfl k() {
        final ArrayList arrayList;
        btkg btkgVar;
        efbd.b();
        synchronized (a) {
            ((cbze) this.k.b()).b();
            final cbze cbzeVar = (cbze) this.k.b();
            final int a2 = bbex.a();
            csix.h();
            arrayList = new ArrayList((List) cbzeVar.c.c("WorkerDatabaseOperations#getNextGenericWorkerQueueBatch", new emyl() { // from class: cbyt
                @Override // defpackage.emyl
                public final Object get() {
                    btkd a3 = btki.a();
                    a3.z("+getNextGenericWorkerQueueBatch");
                    cbze cbzeVar2 = cbze.this;
                    btkh a4 = cbzeVar2.a(a2);
                    a4.f(cbzeVar2.b.f().toEpochMilli());
                    a3.k(new btkg(a4));
                    a3.c(new btka(btki.c.g));
                    a3.x(10);
                    final engw y = a3.b().y();
                    if (!y.isEmpty()) {
                        btkf btkfVar = new btkf();
                        btkfVar.ap("getNextGenericWorkerQueueBatch");
                        btkfVar.ak();
                        btkfVar.c(true);
                        btkfVar.d(new Function() { // from class: cbyp
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                btkh btkhVar = (btkh) obj;
                                cskc cskcVar = cbze.a;
                                btkhVar.c((String[]) Collection.EL.stream(engw.this).map(new cbyo()).toArray(new IntFunction() { // from class: cbyv
                                    @Override // java.util.function.IntFunction
                                    public final Object apply(int i) {
                                        cskc cskcVar2 = cbze.a;
                                        return new String[i];
                                    }
                                }));
                                return btkhVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        btkfVar.a().e();
                    }
                    return y;
                }
            }));
            m(arrayList);
        }
        if (!arrayList.isEmpty()) {
            csjb c2 = d.c();
            c2.I("Work found");
            c2.r();
            if (((Boolean) h.e()).booleanValue()) {
                return elfo.h(new erog() { // from class: bafa
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        return GenericWorkerQueueAction.this.l(arrayList);
                    }
                }, N()).h(new emwl() { // from class: bafb
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        csjb d2 = GenericWorkerQueueAction.d.d();
                        d2.I("Work done");
                        d2.r();
                        return null;
                    }
                }, erpp.a);
            }
            axos.a(new Runnable() { // from class: bafc
                @Override // java.lang.Runnable
                public final void run() {
                    GenericWorkerQueueAction.this.l(arrayList).k(axnw.c(new Consumer() { // from class: baey
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            csjb d2 = GenericWorkerQueueAction.d.d();
                            d2.I("Work done");
                            d2.r();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    }), erpp.a);
                }
            }, N());
        } else if (((Boolean) e.e()).booleanValue()) {
            if (((Boolean) f.e()).booleanValue()) {
                btkh a3 = ((cbze) this.k.b()).a(bbex.a());
                a3.e();
                btkgVar = new btkg(a3);
            } else {
                String[] strArr = btki.a;
                btkh btkhVar = new btkh();
                btkhVar.e();
                btkhVar.d(false);
                btkhVar.i(bbex.a());
                btkgVar = new btkg(btkhVar);
            }
            btkd a4 = btki.a();
            a4.z("+scheduleFutureWorkItemsIfAny");
            a4.k(btkgVar);
            a4.c(new btka(btki.c.i));
            a4.x(1);
            btjj btjjVar = (btjj) a4.b().o();
            try {
                if (btjjVar.moveToFirst()) {
                    btih btihVar = (btih) btjjVar.cO();
                    btihVar.az(8, "next_execute_timestamp");
                    long j = btihVar.i;
                    long epochMilli = (j - this.n.f().toEpochMilli()) + 10;
                    d.p(String.format(Locale.US, "Found next future work at timestamp %d, scheduling in %d", Long.valueOf(j), Long.valueOf(epochMilli)));
                    new GenericWorkerQueueAction(this.i, this.j, this.k, new cbym() { // from class: baew
                        @Override // defpackage.cbym
                        public final engw a() {
                            return GenericWorkerQueueAction.this.o;
                        }
                    }, this.l, this.m, this.n).x(Math.max(epochMilli, 0L));
                } else {
                    csjb c3 = d.c();
                    c3.I("Bailing early, no work found, no failed work found");
                    c3.r();
                }
                btjjVar.close();
            } finally {
            }
        }
        return elfo.e(null);
    }

    public final elfl l(final List list) {
        Map map;
        efbd.b();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap.put(((btih) it.next()).r(), elfo.e(true));
        }
        for (cbyk cbykVar : this.q) {
            Set c2 = cbykVar.c(list);
            if (!c2.isEmpty()) {
                try {
                    map = cbykVar.b(list);
                } catch (Exception e2) {
                    d.s("Couldn't process batch.", e2);
                    map = null;
                }
                if (map != null) {
                    for (final Map.Entry entry : map.entrySet()) {
                        final String str = (String) entry.getKey();
                        hashMap.put(str, ((elfl) hashMap.get(str)).i(new eroh() { // from class: bafd
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                Object obj2 = GenericWorkerQueueAction.a;
                                return ((Boolean) obj).booleanValue() ? (ListenableFuture) entry.getValue() : elfo.e(false);
                            }
                        }, erpp.a).e(Exception.class, new emwl() { // from class: bafe
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                csjb e3 = GenericWorkerQueueAction.d.e();
                                e3.I("BatchWorker failed to process workItem: ");
                                e3.I(str);
                                e3.s((Exception) obj);
                                return false;
                            }
                        }, erpp.a));
                    }
                } else {
                    cmi cmiVar = new cmi((cmj) c2);
                    while (cmiVar.hasNext()) {
                        hashMap.put((String) cmiVar.next(), elfo.e(false));
                    }
                }
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final btih btihVar = (btih) it2.next();
            elfl elflVar = (elfl) hashMap.get(btihVar.r());
            csjb d2 = d.d();
            d2.I("Processing workitem for ");
            d2.I(btihVar.s());
            d2.I(" - ");
            d2.G(btihVar.m());
            d2.I(" in generic worker queue.");
            d2.r();
            for (final cbyl cbylVar : this.p) {
                elflVar = elflVar.i(new eroh() { // from class: baff
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        Object obj2 = GenericWorkerQueueAction.a;
                        if (bool.booleanValue()) {
                            btih btihVar2 = btihVar;
                            cbyl cbylVar2 = cbyl.this;
                            if (cbylVar2.d(btihVar2)) {
                                return cbylVar2.a(btihVar2);
                            }
                        }
                        return elfo.e(bool);
                    }
                }, N());
            }
            hashMap.put(btihVar.r(), elflVar.e(Exception.class, new emwl() { // from class: baes
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    csjb e3 = GenericWorkerQueueAction.d.e();
                    e3.I("Couldn't process item: ");
                    e3.I(btih.this.r());
                    e3.s((Exception) obj);
                    return false;
                }
            }, erpp.a).h(new emwl() { // from class: baet
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    btih btihVar2 = btihVar;
                    GenericWorkerQueueAction genericWorkerQueueAction = GenericWorkerQueueAction.this;
                    boolean z = false;
                    if (booleanValue) {
                        csjb d3 = GenericWorkerQueueAction.d.d();
                        d3.I("Deleting processed workitem for ");
                        d3.I(btihVar2.s());
                        d3.I(" - ");
                        d3.G(btihVar2.m());
                        d3.I(" in generic worker queue.");
                        d3.r();
                        final String r = btihVar2.r();
                        ekzz f2 = eleg.f("WorkerDatabaseOperations#deleteGenericWorkerQueue");
                        try {
                            csix.h();
                            if (TextUtils.isEmpty(r)) {
                                f2.close();
                            } else {
                                String[] strArr = btki.a;
                                btjx btjxVar = new btjx();
                                btjxVar.f("deleteGenericWorkerQueue");
                                btjxVar.a(new Function() { // from class: cbyq
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        btkh btkhVar = (btkh) obj2;
                                        cskc cskcVar = cbze.a;
                                        btkhVar.b(r);
                                        return btkhVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                r3 = btjxVar.d() > 0;
                                f2.close();
                                z = r3;
                            }
                            return Boolean.valueOf(z);
                        } catch (Throwable th) {
                            try {
                                f2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                    csjb c3 = GenericWorkerQueueAction.d.c();
                    c3.I("Re-enqueue work item");
                    c3.A("ItemId", btihVar2.s());
                    c3.y("table type", btihVar2.m());
                    c3.y("retry count", btihVar2.n());
                    c3.y("worker type", btihVar2.o());
                    c3.r();
                    final String r2 = btihVar2.r();
                    int n = btihVar2.n();
                    long epochMilli = genericWorkerQueueAction.n.f().toEpochMilli();
                    long max = Math.max(epochMilli, Math.round(Math.pow(2.0d, n) * 1000.0d) + epochMilli);
                    final int a2 = bbex.a();
                    ekzz f3 = eleg.f("WorkerDatabaseOperations#reEnqueueWorkItemAndIncreaseRetryCount");
                    try {
                        csix.h();
                        if (TextUtils.isEmpty(r2)) {
                            f3.close();
                            r3 = false;
                        } else {
                            String[] strArr2 = btki.a;
                            btkf btkfVar = new btkf();
                            btkfVar.ap("reEnqueueWorkItemAndIncreaseRetryCount");
                            btkfVar.ag("retry_count", new dtzq("$V + 1", new Object[]{btki.c.g}));
                            btkfVar.c(false);
                            int intValue = btki.c().intValue();
                            int intValue2 = btki.c().intValue();
                            if (intValue2 < 34000) {
                                dtub.w("next_execute_timestamp", intValue2);
                            }
                            if (intValue >= 34000) {
                                btkfVar.a.put("next_execute_timestamp", Long.valueOf(max));
                            }
                            btkfVar.d(new Function() { // from class: cbyw
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    btkh btkhVar = (btkh) obj2;
                                    cskc cskcVar = cbze.a;
                                    btkhVar.b(r2);
                                    btkhVar.h(a2);
                                    return btkhVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            int e3 = btkfVar.a().e();
                            if (e3 <= 0) {
                                cbze.a.m(a.t(r2, "reEnqueue did not update: "));
                                btjx btjxVar2 = new btjx();
                                btjxVar2.f("reEnqueueWorkItemAndIncreaseRetryCount");
                                btjxVar2.a(new Function() { // from class: cbyx
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        btkh btkhVar = (btkh) obj2;
                                        cskc cskcVar = cbze.a;
                                        btkhVar.b(r2);
                                        btkhVar.aq(new dtrw("generic_worker_queue.worker_type", 4, btkh.au(new int[]{32, 64, 128}), true));
                                        btkhVar.g(a2);
                                        return btkhVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                e3 = btjxVar2.d();
                                if (e3 <= 0) {
                                    cbze.a.m(a.t(r2, "reEnqueue did not delete max retried work item: "));
                                    f3.close();
                                }
                            }
                            if (e3 <= 0) {
                                r3 = false;
                            }
                            f3.close();
                        }
                        return Boolean.valueOf(r3);
                    } catch (Throwable th3) {
                        try {
                            f3.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                }
            }, N()).e(Exception.class, new emwl() { // from class: baeu
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    csjb e3 = GenericWorkerQueueAction.d.e();
                    e3.I("Couldn't re-enqueue or delete item: ");
                    e3.I(btih.this.r());
                    e3.s((Exception) obj);
                    return false;
                }
            }, erpp.a));
        }
        return elfo.l(hashMap.values()).a(new Callable() { // from class: baev
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List list2 = list;
                synchronized (GenericWorkerQueueAction.a) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        GenericWorkerQueueAction.b.remove(((btih) it3.next()).r());
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                final GenericWorkerQueueAction genericWorkerQueueAction = GenericWorkerQueueAction.this;
                csjb c3 = GenericWorkerQueueAction.d.c();
                c3.I("Rescheduling immediately to continue processing since we didn't yet reach the end.");
                c3.r();
                cbym cbymVar = new cbym() { // from class: baez
                    @Override // defpackage.cbym
                    public final engw a() {
                        return GenericWorkerQueueAction.this.o;
                    }
                };
                Context context = genericWorkerQueueAction.i;
                errl errlVar = genericWorkerQueueAction.l;
                new GenericWorkerQueueAction(context, genericWorkerQueueAction.j, genericWorkerQueueAction.k, cbymVar, errlVar, genericWorkerQueueAction.m, genericWorkerQueueAction.n).x(1L);
                return null;
            }
        }, N());
    }

    public final ListenableFuture n(final int i) {
        String format = String.format(Locale.US, "%d-%d-%d", 1, Integer.valueOf(i), 3);
        synchronized (a) {
            Map map = c;
            ListenableFuture listenableFuture = (ListenableFuture) map.get(format);
            if (listenableFuture != null) {
                return listenableFuture;
            }
            elfl i2 = elfo.g(new Callable() { // from class: baer
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ArrayList arrayList;
                    efbd.b();
                    GenericWorkerQueueAction genericWorkerQueueAction = GenericWorkerQueueAction.this;
                    final int i3 = i;
                    synchronized (GenericWorkerQueueAction.a) {
                        ((cbze) genericWorkerQueueAction.k.b()).b();
                        final cbze cbzeVar = (cbze) genericWorkerQueueAction.k.b();
                        csix.h();
                        arrayList = new ArrayList((engw) cbzeVar.c.c("WorkerDatabaseOperations#getNextGenericWorkerQueueBatchForSpecificItem", new emyl() { // from class: cbyu
                            @Override // defpackage.emyl
                            public final Object get() {
                                btkd a2 = btki.a();
                                a2.z("getNextGenericWorkerQueueBatchForSpecificItem1");
                                final cbze cbzeVar2 = cbze.this;
                                final int i4 = i3;
                                a2.d(new Function() { // from class: cbzc
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        btkh btkhVar = (btkh) obj;
                                        btkhVar.f(cbze.this.b.f().toEpochMilli());
                                        btkhVar.aq(new dtwe("generic_worker_queue.item_table_type", 1, 1));
                                        btkhVar.aq(new dtrt("generic_worker_queue.item_id", 1, String.valueOf(String.valueOf(i4))));
                                        btkhVar.j(3);
                                        return btkhVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                a2.c(new btka(btki.c.g));
                                final engw y = a2.b().y();
                                if (!y.isEmpty()) {
                                    btkf btkfVar = new btkf();
                                    btkfVar.ap("getNextGenericWorkerQueueBatchForSpecificItem2");
                                    btkfVar.ak();
                                    btkfVar.c(true);
                                    btkfVar.d(new Function() { // from class: cbzd
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj) {
                                            btkh btkhVar = (btkh) obj;
                                            cskc cskcVar = cbze.a;
                                            btkhVar.c((String[]) Collection.EL.stream(engw.this).map(new cbyo()).toArray(new IntFunction() { // from class: cbyz
                                                @Override // java.util.function.IntFunction
                                                public final Object apply(int i5) {
                                                    cskc cskcVar2 = cbze.a;
                                                    return new String[i5];
                                                }
                                            }));
                                            return btkhVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    btkfVar.a().e();
                                }
                                return y;
                            }
                        }));
                        GenericWorkerQueueAction.m(arrayList);
                    }
                    return arrayList;
                }
            }, N()).i(new eroh() { // from class: baex
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return GenericWorkerQueueAction.this.l((ArrayList) obj);
                }
            }, N());
            map.put(format, i2);
            elfr.l(i2, new bafg(format), erpp.a);
            return i2;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public GenericWorkerQueueAction(Context context, ffbr ffbrVar, ffbr ffbrVar2, cbym cbymVar, errl errlVar, fazb fazbVar, cqoh cqohVar, Parcel parcel) {
        super(parcel, eogt.GENERIC_WORKER_QUEUE_ACTION);
        this.i = context;
        this.j = ffbrVar;
        this.k = ffbrVar2;
        this.l = errlVar;
        this.m = fazbVar;
        this.n = cqohVar;
        this.o = cbymVar.a();
        O();
    }
}
