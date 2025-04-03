package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Collection;
import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ektp implements eksc {
    public static final enru a = enru.c("com/google/apps/tiktok/sync/impl/SyncManagerImpl");
    public final dlpw b;
    public final errm c;
    public final errl d;
    public final ejjz e;
    public final eksm f;
    public final Map g;
    public final ListenableFuture h;
    public final Object i = new Object();
    public final cmh j;
    public final Map k;
    public final Map l;
    private final Context m;
    private final edyp n;
    private final emxc o;
    private final ffbr p;
    private final ektx q;
    private final AtomicReference r;
    private final ekvt s;

    /* compiled from: PG */
    interface a {
        Map gA();
    }

    /* compiled from: PG */
    interface b {
        ekvt hm();
    }

    public ektp(dlpw dlpwVar, Context context, errm errmVar, errl errlVar, edyp edypVar, ejjz ejjzVar, emxc emxcVar, eksm eksmVar, Map map, Map map2, Map map3, ekvt ekvtVar, ektx ektxVar, ffbr ffbrVar) {
        cmh cmhVar = new cmh();
        this.j = cmhVar;
        this.k = new cmh();
        this.l = new cmh();
        this.r = new AtomicReference();
        this.b = dlpwVar;
        this.m = context;
        this.c = errmVar;
        this.d = errlVar;
        this.n = edypVar;
        this.e = ejjzVar;
        this.o = emxcVar;
        Boolean bool = false;
        bool.getClass();
        this.f = eksmVar;
        this.g = map3;
        this.s = ekvtVar;
        this.p = ffbrVar;
        bool.getClass();
        emxf.m(map2.isEmpty(), "SyncletBindings cannot be bound outside of account scope without @ApplicationSynclet.");
        this.h = eksmVar.c();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : ((enhk) map).entrySet()) {
            ekrl a2 = ekrl.a((String) entry.getKey());
            ekwd ekwdVar = (ekwd) ekwe.a.createBuilder();
            ekwc ekwcVar = a2.a;
            ekwdVar.copyOnWrite();
            ekwe ekweVar = (ekwe) ekwdVar.instance;
            ekwcVar.getClass();
            ekweVar.c = ekwcVar;
            ekweVar.b |= 1;
            r(new ektu((ekwe) ekwdVar.build()), entry, hashMap);
        }
        cmhVar.putAll(hashMap);
        this.q = ektxVar;
        String a3 = edyn.a(context);
        int indexOf = a3.indexOf(58);
        if (indexOf == -1) {
            return;
        }
        a3.substring(indexOf + 1);
    }

    static /* synthetic */ void l(ListenableFuture listenableFuture) {
        try {
            erqt.q(listenableFuture);
        } catch (CancellationException e) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", (char) 685, "SyncManagerImpl.java")).q("The sync scheduling future was cancelled. This should never happen.");
        } catch (ExecutionException e2) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e2)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "finishScheduleListener", (char) 683, "SyncManagerImpl.java")).q("Error scheduling next sync wakeup");
        }
    }

    static /* synthetic */ void m(ListenableFuture listenableFuture) {
        try {
            erqt.q(listenableFuture);
        } catch (CancellationException | ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", (char) 787, "SyncManagerImpl.java")).q("Timeout updating accounts in sync. Some accounts may not sync correctly.");
            } else {
                ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", (char) 791, "SyncManagerImpl.java")).q("Updating sync accounts failed. Some accounts may not sync correctly.");
            }
        }
    }

    private final ListenableFuture p() {
        return elfr.j(((eiyk) ((emxn) this.o).a).g(), new emwl() { // from class: ektg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                HashSet hashSet = new HashSet();
                for (eixn eixnVar : (List) obj) {
                    if (!eixnVar.b().k.equals("incognito")) {
                        hashSet.add(eixnVar.a());
                    }
                }
                return hashSet;
            }
        }, this.c);
    }

    private final ListenableFuture q() {
        SettableFuture create = SettableFuture.create();
        while (true) {
            AtomicReference atomicReference = this.r;
            if (atomicReference.compareAndSet(null, create)) {
                create.m(elfr.j(p(), new emwl() { // from class: ektn
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ektp.this.k((Set) obj);
                        return null;
                    }
                }, this.c));
                break;
            }
            if (atomicReference.get() != null) {
                break;
            }
        }
        return erqt.j((ListenableFuture) this.r.get());
    }

    private static final void r(ektu ektuVar, Map.Entry entry, Map map) {
        try {
            ekrp ekrpVar = (ekrp) ((ffbr) entry.getValue()).b();
            ekrpVar.d();
            map.put(ektuVar, ekrpVar);
        } catch (RuntimeException e) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "safePutBindingEntry", 902, "SyncManagerImpl.java")).t("Error accessing SyncletBinding for key %s. Its Synclet will be skipped", new evhq(evhp.NO_USER_DATA, entry.getKey()));
        }
    }

    @Override // defpackage.eksc
    public final ListenableFuture a() {
        ((enrr) ((enrr) a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "poke", 587, "SyncManagerImpl.java")).q("#poke(). Scheduling workers.");
        return this.s.a(g(erqt.i(enpd.a)), new eroh() { // from class: ekvo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((ekvv) obj).a();
            }
        });
    }

    @Override // defpackage.eksc
    public final ListenableFuture b() {
        ((enrr) ((enrr) a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "sync", 199, "SyncManagerImpl.java")).q("#sync(). Running Synclets and scheduling next sync.");
        final long epochMilli = this.b.f().toEpochMilli();
        final eksm eksmVar = this.f;
        ListenableFuture a2 = this.s.a(elfp.b(eksmVar.d.submit(eldl.m(new Callable() { // from class: eksk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekwa ekwaVar = ekwa.a;
                eksm eksmVar2 = eksm.this;
                eksmVar2.b.writeLock().lock();
                long j = epochMilli;
                try {
                    try {
                        ekwa a3 = eksmVar2.a();
                        ekvz ekvzVar = (ekvz) a3.toBuilder();
                        ekvzVar.copyOnWrite();
                        ekwa ekwaVar2 = (ekwa) ekvzVar.instance;
                        ekwaVar2.b |= 2;
                        ekwaVar2.e = j;
                        try {
                            eksmVar2.e((ekwa) ekvzVar.build());
                        } catch (IOException e) {
                            ((enrr) ((enrr) ((enrr) eksm.a.j()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "getLastWakeupAndSetNewWakeup", (char) 539, "SyncManagerDataStore.java")).q("Error writing sync data file. Cannot update last wakeup.");
                        }
                        eksmVar2.b.writeLock().unlock();
                        int i = a3.b;
                        if ((i & 2) != 0) {
                            return Long.valueOf(a3.e);
                        }
                        if ((i & 1) != 0) {
                            return Long.valueOf(a3.c);
                        }
                        return -1L;
                    } catch (IOException e2) {
                        emyt.e(e2);
                        throw new RuntimeException(e2);
                    }
                } catch (Throwable th) {
                    eksmVar2.b.writeLock().unlock();
                    throw th;
                }
            }
        })), new erog() { // from class: eksu
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final ektp ektpVar = ektp.this;
                return ektpVar.g(elfr.k(ektpVar.h, new eroh() { // from class: eksz
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final long longValue = ((Long) obj).longValue();
                        final cmh cmhVar = new cmh();
                        final cmh cmhVar2 = new cmh();
                        final ektp ektpVar2 = ektp.this;
                        final long epochMilli2 = ektpVar2.b.f().toEpochMilli();
                        return elfr.k(elfr.j(ektpVar2.j(ektpVar2.f.b()), new emwl() { // from class: ekst
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                Object obj3;
                                ekst ekstVar = this;
                                ektp ektpVar3 = ektp.this;
                                Object obj4 = ektpVar3.i;
                                Map map = (Map) obj2;
                                Map map2 = cmhVar2;
                                long j = longValue;
                                synchronized (obj4) {
                                    try {
                                        Iterator it = ektpVar3.j.entrySet().iterator();
                                        while (true) {
                                            boolean hasNext = it.hasNext();
                                            Map map3 = cmhVar;
                                            if (!hasNext) {
                                                return map3;
                                            }
                                            Map.Entry entry = (Map.Entry) it.next();
                                            ektu ektuVar = (ektu) entry.getKey();
                                            if (!ektpVar3.k.containsKey(ektuVar)) {
                                                if (ektpVar3.o()) {
                                                    Map map4 = ektpVar3.l;
                                                    Long valueOf = Long.valueOf(j);
                                                    long max = Math.max(((Long) Map.EL.getOrDefault(map4, ektuVar, valueOf)).longValue(), ((Long) Map.EL.getOrDefault(map, ektuVar, valueOf)).longValue());
                                                    ekrl ekrlVar = ((ektu) entry.getKey()).b;
                                                    ekrh e = ((ekrp) entry.getValue()).e();
                                                    long j2 = ((ekrd) e).a;
                                                    long j3 = j;
                                                    long j4 = epochMilli2;
                                                    if (j2 + max <= j4) {
                                                        Iterator<E> it2 = ((enhk) ((ekrd) e).c).entrySet().iterator();
                                                        while (true) {
                                                            if (!it2.hasNext()) {
                                                                obj3 = obj4;
                                                                SettableFuture create = SettableFuture.create();
                                                                ektpVar3.k.put(ektuVar, create);
                                                                map3.put(ektuVar, create);
                                                                break;
                                                            }
                                                            Map.Entry entry2 = (Map.Entry) it2.next();
                                                            ekrj ekrjVar = (ekrj) entry2.getValue();
                                                            long a3 = ekrjVar.a();
                                                            long j5 = j4 - max;
                                                            long a4 = ekrjVar.a();
                                                            obj3 = obj4;
                                                            try {
                                                                long j6 = a4 + ((ekrd) e).a;
                                                                if (a3 != -1 && j5 > j6) {
                                                                    obj4 = obj3;
                                                                }
                                                                ekrk ekrkVar = (ekrk) entry2.getKey();
                                                                if (!map2.containsKey(ekrkVar)) {
                                                                    map2.put(ekrkVar, Boolean.valueOf(((ekrq) ((ffbr) ektpVar3.g.get(ekrkVar)).b()).a()));
                                                                }
                                                                if (!((Boolean) map2.get(ekrkVar)).booleanValue()) {
                                                                    ((enrr) ((enrr) ektp.a.f()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "shouldSync", 573, "SyncManagerImpl.java")).t("Skipping synclet %s due to unsatisfied constraint", ekrlVar);
                                                                    break;
                                                                }
                                                                obj4 = obj3;
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                throw th;
                                                            }
                                                        }
                                                        ekstVar = this;
                                                        j = j3;
                                                        obj4 = obj3;
                                                    } else {
                                                        ekstVar = this;
                                                        j = j3;
                                                    }
                                                }
                                            }
                                            ekstVar = this;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        obj3 = obj4;
                                    }
                                }
                            }
                        }, ektpVar2.c), new eroh() { // from class: eksy
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return ektp.this.i((java.util.Map) obj2);
                            }
                        }, ektpVar2.c);
                    }
                }, ektpVar.c));
            }
        }, this.c), new eroh() { // from class: ekvq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((ekvv) obj).b();
            }
        });
        a2.b(new Runnable() { // from class: eksw
            @Override // java.lang.Runnable
            public final void run() {
                ((enrr) ((enrr) ektp.a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "sync", 210, "SyncManagerImpl.java")).q("#sync() complete");
            }
        }, erpp.a);
        return a2;
    }

    final ListenableFuture c() {
        return elfr.k(j(this.h), new eroh() { // from class: ekte
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ektp ektpVar = ektp.this;
                final Long l = (Long) obj;
                return elfr.j(ektpVar.f.b(), new emwl() { // from class: eksv
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        Long l2 = l;
                        java.util.Map map = (java.util.Map) obj2;
                        ektp ektpVar2 = ektp.this;
                        synchronized (ektpVar2.i) {
                            for (ektu ektuVar : ektpVar2.j.keySet()) {
                                if (!map.containsKey(ektuVar)) {
                                    map.put(ektuVar, l2);
                                }
                            }
                        }
                        return map;
                    }
                }, ektpVar.c);
            }
        }, this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ ListenableFuture d(ListenableFuture listenableFuture, final java.util.Map map) {
        Throwable th;
        boolean z;
        final ekrp ekrpVar;
        try {
            z = ((Boolean) erqt.q(listenableFuture)).booleanValue();
            th = null;
        } catch (CancellationException | ExecutionException e) {
            th = e;
            z = false;
        }
        if (!z) {
            ((enrr) ((enrr) ((enrr) a.j()).g(th)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "syncInternal", (char) 339, "SyncManagerImpl.java")).q("Failed preparing sync datastore for sync. Aborting sync attempt.");
            long epochMilli = this.b.f().toEpochMilli();
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(this.f.d((ektu) it.next(), epochMilli, false));
            }
            return elfp.a(erqt.e(arrayList), new Callable() { // from class: ekss
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    java.util.Map map2 = map;
                    ektp ektpVar = ektp.this;
                    synchronized (ektpVar.i) {
                        Iterator it2 = map2.keySet().iterator();
                        while (it2.hasNext()) {
                        }
                    }
                    return null;
                }
            }, this.c);
        }
        emxf.l(q().isDone());
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            final ektu ektuVar = (ektu) entry.getKey();
            final SettableFuture settableFuture = (SettableFuture) entry.getValue();
            StringBuilder sb = new StringBuilder("Synclet: ");
            sb.append(ektuVar.b.b());
            if (ektuVar.a()) {
                sb.append(" ");
                sb.append(((eisz) ektuVar.c).a);
            }
            elae elaeVar = elad.a;
            if (ektuVar.a()) {
                elac c = elaeVar.c();
                eisy.a(c, ektuVar.c);
                elaeVar = ((elae) c).f();
            }
            ekzz g = eleg.g(sb.toString(), elaeVar);
            try {
                synchronized (this.i) {
                    ekrpVar = (ekrp) this.j.get(ektuVar);
                }
                if (ekrpVar == null) {
                    settableFuture.cancel(false);
                } else {
                    erog erogVar = new erog() { // from class: eksx
                        @Override // defpackage.erog
                        public final ListenableFuture a() {
                            final ekrp ekrpVar2 = ekrpVar;
                            erog erogVar2 = new erog() { // from class: ektc
                                @Override // defpackage.erog
                                public final ListenableFuture a() {
                                    evhp evhpVar = evhp.NO_USER_DATA;
                                    emxf.m(true, "Synclet binding must be enabled to have a SyncKey");
                                    ekrp ekrpVar3 = ekrp.this;
                                    ekrl b2 = ekrpVar3.b();
                                    b2.getClass();
                                    ((enrr) ((enrr) ektp.a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "runSynclet", 419, "SyncManagerImpl.java")).t("Starting synclet: %s", new evhq(evhpVar, b2.b()));
                                    emxf.m(true, "Synclet binding must be enabled to have a Synclet");
                                    emxf.m(true, "Synclet binding must be enabled to have a SyncletProvider");
                                    ffbr c2 = ekrpVar3.c();
                                    c2.getClass();
                                    ekrm ekrmVar = (ekrm) c2.b();
                                    ekrmVar.getClass();
                                    return ekrmVar.a();
                                }
                            };
                            ektp ektpVar = ektp.this;
                            return erqt.p(erny.f(elfr.i(erogVar2, ektpVar.d), new emwn(null), erpp.a), ((ekrd) ekrpVar2.e()).b, TimeUnit.MILLISECONDS, ektpVar.c);
                        }
                    };
                    ekvt hm = ektuVar.a() ? ((b) ekhv.a(this.m, b.class, ektuVar.c)).hm() : this.s;
                    ekrl ekrlVar = ektuVar.b;
                    Set set = (Set) hm.b.b();
                    enin i = enip.i(set.size());
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        i.c(new ekvs((ekvw) it2.next(), ekrlVar));
                    }
                    ListenableFuture a2 = hm.a.a(erogVar, i.g());
                    ejjz.c(a2, "Synclet sync() failed for synckey: %s", new evhq(evhp.NO_USER_DATA, ekrlVar));
                    settableFuture.m(a2);
                }
                final ListenableFuture b2 = elfp.b(settableFuture, new erog() { // from class: ektf
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        return ektp.this.e(settableFuture, ektuVar);
                    }
                }, this.c);
                b2.b(new Runnable() { // from class: eksr
                    @Override // java.lang.Runnable
                    public final void run() {
                        ektp.this.n(ektuVar, b2);
                    }
                }, this.c);
                g.b(b2);
                g.close();
                arrayList2.add(b2);
            } finally {
            }
        }
        return erny.f(erqt.o(arrayList2), new emwn(null), erpp.a);
    }

    public final /* synthetic */ ListenableFuture e(ListenableFuture listenableFuture, ektu ektuVar) {
        boolean z = false;
        try {
            erqt.q(listenableFuture);
            z = true;
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            if (e.getCause() instanceof TimeoutException) {
                ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "writeResultToDatabase", 471, "SyncManagerImpl.java")).t("Sync cancelled from timeout and will be retried later: %s", ektuVar.b.b());
            }
        }
        final long epochMilli = this.b.f().toEpochMilli();
        return elfp.a(this.f.d(ektuVar, epochMilli, z), new Callable() { // from class: ekth
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(epochMilli);
            }
        }, this.c);
    }

    public final ListenableFuture f() {
        ((enrr) ((enrr) a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 727, "SyncManagerImpl.java")).q("onAccountsChanged: Checking and maybe rescheduling synclet bindings");
        emxf.m(true, "onAccountsChanged called without an AccountManager bound");
        final ListenableFuture j = j(p());
        final eksm eksmVar = this.f;
        final ListenableFuture submit = eksmVar.d.submit(eldl.m(new Callable() { // from class: eksg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                enin eninVar = new enin();
                eksm eksmVar2 = eksm.this;
                try {
                    Iterator<E> it = eksmVar2.a().f.iterator();
                    while (it.hasNext()) {
                        eninVar.c(eisx.b(((Integer) it.next()).intValue()));
                    }
                    return eninVar.g();
                } catch (IOException e) {
                    eksmVar2.f(e);
                    return eninVar.g();
                }
            }
        }));
        ListenableFuture b2 = elfr.d(j, submit).b(new erog() { // from class: ekti
            @Override // defpackage.erog
            public final ListenableFuture a() {
                Set set = (Set) erqt.q(j);
                Set set2 = (Set) erqt.q(submit);
                enpv b3 = enpw.b(set, set2);
                enpv b4 = enpw.b(set2, set);
                ektp ektpVar = ektp.this;
                ektpVar.k(b3);
                final HashSet hashSet = new HashSet();
                synchronized (ektpVar.i) {
                    for (ektu ektuVar : ektpVar.j.keySet()) {
                        if (b4.contains(ektuVar.c)) {
                            hashSet.add(ektuVar);
                        }
                    }
                    synchronized (ektpVar.i) {
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ListenableFuture listenableFuture = (ListenableFuture) ektpVar.k.get((ektu) it.next());
                            if (listenableFuture != null) {
                                listenableFuture.cancel(false);
                            }
                        }
                    }
                    ektpVar.j.keySet().removeAll(hashSet);
                    ejjz ejjzVar = ektpVar.e;
                    final eksm eksmVar2 = ektpVar.f;
                    ListenableFuture submit2 = eksmVar2.d.submit(new Callable() { // from class: eksi
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            eksm eksmVar3 = eksm.this;
                            eksmVar3.b.writeLock().lock();
                            Set set3 = hashSet;
                            try {
                                ekwa ekwaVar = ekwa.a;
                                try {
                                    ekwaVar = eksmVar3.a();
                                } catch (IOException e) {
                                    if (!eksmVar3.f(e)) {
                                        ((enrr) ((enrr) ((enrr) eksm.a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", (char) 485, "SyncManagerDataStore.java")).q("Unable to read or clear store. Cannot remove account.");
                                    }
                                }
                                ekvz ekvzVar = (ekvz) ekwa.a.createBuilder();
                                ekvzVar.mergeFrom((ekvz) ekwaVar);
                                ekvzVar.copyOnWrite();
                                ((ekwa) ekvzVar.instance).d = ekwa.emptyProtobufList();
                                for (ekvy ekvyVar : ekwaVar.d) {
                                    ekwe ekweVar = ekvyVar.c;
                                    if (ekweVar == null) {
                                        ekweVar = ekwe.a;
                                    }
                                    if (!set3.contains(new ektu(ekweVar))) {
                                        ekvzVar.a(ekvyVar);
                                    }
                                }
                                try {
                                    eksmVar3.e((ekwa) ekvzVar.build());
                                } catch (IOException e2) {
                                    ((enrr) ((enrr) ((enrr) eksm.a.i()).g(e2)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", (char) 505, "SyncManagerDataStore.java")).q("Error writing sync data file. Cannot remove account.");
                                }
                                eksmVar3.b.writeLock().unlock();
                                return null;
                            } catch (Throwable th) {
                                eksmVar3.b.writeLock().unlock();
                                throw th;
                            }
                        }
                    });
                    ejjzVar.g(submit2);
                    ejjz.c(submit2, "Error removing accounts from sync. IDs: %s", b4);
                }
                if (b3.isEmpty() && b4.isEmpty()) {
                    return erre.a;
                }
                ((enrr) ((enrr) ektp.a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "onAccountsChanged", 752, "SyncManagerImpl.java")).q("Accounts did change. Rescheduling synclets.");
                return elfr.j(ektpVar.g(erqt.i(enpd.a)), new emwn(null), erpp.a);
            }
        }, this.c);
        this.r.set(b2);
        final ListenableFuture p = erqt.p(b2, 10L, TimeUnit.SECONDS, this.c);
        errj errjVar = new errj(eldl.l(new Runnable() { // from class: ektj
            @Override // java.lang.Runnable
            public final void run() {
                ektp.m(ListenableFuture.this);
            }
        }));
        p.b(errjVar, erpp.a);
        return errjVar;
    }

    public final ListenableFuture g(final ListenableFuture listenableFuture) {
        final ListenableFuture j = erqt.j(elfr.k(this.h, new eroh() { // from class: ektk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ektp ektpVar = ektp.this;
                final ListenableFuture listenableFuture2 = listenableFuture;
                final Long l = (Long) obj;
                return elfp.b(ektpVar.j(listenableFuture2), new erog() { // from class: eksq
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        ((enrr) ((enrr) ektp.a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInParallel", 645, "SyncManagerImpl.java")).q("Completed sync. Scheduling next wakeup");
                        return ektp.this.h(listenableFuture2, l.longValue());
                    }
                }, ektpVar.c);
            }
        }, this.c));
        this.e.g(j);
        j.b(new Runnable() { // from class: ekto
            @Override // java.lang.Runnable
            public final void run() {
                ektp.l(ListenableFuture.this);
            }
        }, this.c);
        return erny.f(listenableFuture, eldl.a(new emwl() { // from class: ektl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }), erpp.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v9, types: [java.util.Set] */
    public final ListenableFuture h(ListenableFuture listenableFuture, long j) {
        final HashMap hashMap;
        enpd enpdVar = enpd.a;
        try {
            enpdVar = (Set) erqt.q(listenableFuture);
        } catch (CancellationException | ExecutionException e) {
            ((enrr) ((enrr) ((enrr) a.j()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInner", (char) 668, "SyncManagerImpl.java")).q("Unable to determine attempted syncs. They will not be used to schedule the next sync.");
        }
        synchronized (this.i) {
            hashMap = new HashMap(this.j);
        }
        Collection.EL.removeIf(hashMap.entrySet(), new Predicate() { // from class: ekta
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !ektp.this.o();
            }
        });
        return elfr.k(this.q.a(enpdVar, j, hashMap), new eroh() { // from class: ektb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ektp ektpVar = ektp.this;
                final Set keySet = hashMap.keySet();
                final eksm eksmVar = ektpVar.f;
                return eksmVar.d.submit(new Callable() { // from class: eksh
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eksm eksmVar2 = eksm.this;
                        eksmVar2.b.writeLock().lock();
                        Set<ektu> set = keySet;
                        try {
                            ekwa ekwaVar = ekwa.a;
                            try {
                                ekwaVar = eksmVar2.a();
                            } catch (IOException e2) {
                                if (!eksmVar2.f(e2)) {
                                    ((enrr) ((enrr) ((enrr) eksm.a.i()).g(e2)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", (char) 444, "SyncManagerDataStore.java")).q("Unable to read or clear store, will not update scheduled account ids. ");
                                }
                            }
                            ekvz ekvzVar = (ekvz) ekwaVar.toBuilder();
                            ekvzVar.copyOnWrite();
                            ((ekwa) ekvzVar.instance).f = ekwa.emptyIntList();
                            TreeSet treeSet = new TreeSet();
                            for (ektu ektuVar : set) {
                                if (ektuVar.a()) {
                                    treeSet.add(Integer.valueOf(((eisz) ektuVar.c).a));
                                }
                            }
                            ekvzVar.copyOnWrite();
                            ekwa ekwaVar2 = (ekwa) ekvzVar.instance;
                            eygi eygiVar = ekwaVar2.f;
                            if (!eygiVar.c()) {
                                ekwaVar2.f = eyfy.mutableCopy(eygiVar);
                            }
                            eydl.addAll(treeSet, ekwaVar2.f);
                            try {
                                eksmVar2.e((ekwa) ekvzVar.build());
                            } catch (IOException e3) {
                                ((enrr) ((enrr) ((enrr) eksm.a.i()).g(e3)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", (char) 465, "SyncManagerDataStore.java")).q("Error writing scheduled account ids");
                            }
                            eksmVar2.b.writeLock().unlock();
                            return null;
                        } catch (Throwable th) {
                            eksmVar2.b.writeLock().unlock();
                            throw th;
                        }
                    }
                });
            }
        }, erpp.a);
    }

    public final ListenableFuture i(final java.util.Map map) {
        ((enrr) ((enrr) a.h()).h("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "syncInternal", 306, "SyncManagerImpl.java")).t("Running synclets: %s", Collection.EL.stream(map.keySet()).map(new Function() { // from class: eksn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ektu) obj).b.b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).toArray());
        emxc emxcVar = (emxc) ((fbbb) this.p).a;
        if (emxcVar.g()) {
        }
        if (map.isEmpty()) {
            return erqt.i(enpd.a);
        }
        final eksm eksmVar = this.f;
        final Set keySet = map.keySet();
        final ListenableFuture h = elfr.h(new Callable() { // from class: ekse
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z;
                java.util.Collection<ektu> collection;
                eksm eksmVar2 = eksm.this;
                eksmVar2.b.writeLock().lock();
                try {
                    ekwa ekwaVar = ekwa.a;
                    boolean z2 = false;
                    try {
                        ekwaVar = eksmVar2.a();
                    } catch (IOException e) {
                        if (!eksmVar2.f(e)) {
                            ((enrr) ((enrr) ((enrr) eksm.a.i()).g(e)).h("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "prepareForSync", (char) 276, "SyncManagerDataStore.java")).q("Error, could not read or clear store. Aborting sync attempt.");
                            z = false;
                        }
                    }
                    ekvz ekvzVar = (ekvz) ekwa.a.createBuilder();
                    ekvzVar.mergeFrom((ekvz) ekwaVar);
                    ekvzVar.copyOnWrite();
                    ((ekwa) ekvzVar.instance).d = ekwa.emptyProtobufList();
                    long epochMilli = eksmVar2.e.f().toEpochMilli();
                    HashSet hashSet = new HashSet();
                    Iterator<E> it = ekwaVar.d.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        collection = keySet;
                        if (!hasNext) {
                            break;
                        }
                        ekvy ekvyVar = (ekvy) it.next();
                        ekwe ekweVar = ekvyVar.c;
                        if (ekweVar == null) {
                            ekweVar = ekwe.a;
                        }
                        if (collection.contains(new ektu(ekweVar))) {
                            ekwe ekweVar2 = ekvyVar.c;
                            if (ekweVar2 == null) {
                                ekweVar2 = ekwe.a;
                            }
                            hashSet.add(new ektu(ekweVar2));
                            ekvx ekvxVar = (ekvx) ekvyVar.toBuilder();
                            ekvxVar.copyOnWrite();
                            ekvy ekvyVar2 = (ekvy) ekvxVar.instance;
                            ekvyVar2.b |= 4;
                            ekvyVar2.e = epochMilli;
                            ekvzVar.a((ekvy) ekvxVar.build());
                        } else {
                            ekvzVar.a(ekvyVar);
                        }
                    }
                    for (ektu ektuVar : collection) {
                        if (!hashSet.contains(ektuVar)) {
                            ekvx ekvxVar2 = (ekvx) ekvy.a.createBuilder();
                            ekwe ekweVar3 = ektuVar.a;
                            ekvxVar2.copyOnWrite();
                            ekvy ekvyVar3 = (ekvy) ekvxVar2.instance;
                            ekweVar3.getClass();
                            ekvyVar3.c = ekweVar3;
                            ekvyVar3.b |= 1;
                            long j = eksmVar2.g;
                            ekvxVar2.copyOnWrite();
                            ekvy ekvyVar4 = (ekvy) ekvxVar2.instance;
                            ekvyVar4.b |= 2;
                            ekvyVar4.d = j;
                            ekvxVar2.copyOnWrite();
                            ekvy ekvyVar5 = (ekvy) ekvxVar2.instance;
                            ekvyVar5.b |= 4;
                            ekvyVar5.e = epochMilli;
                            ekvxVar2.copyOnWrite();
                            ekvy ekvyVar6 = (ekvy) ekvxVar2.instance;
                            ekvyVar6.b |= 8;
                            ekvyVar6.f = 0;
                            ekvzVar.a((ekvy) ekvxVar2.build());
                        }
                    }
                    if (ekwaVar.c < 0) {
                        long j2 = eksmVar2.g;
                        if (j2 < 0) {
                            j2 = eksmVar2.e.f().toEpochMilli();
                            eksmVar2.g = j2;
                        }
                        ekvzVar.copyOnWrite();
                        ekwa ekwaVar2 = (ekwa) ekvzVar.instance;
                        ekwaVar2.b |= 1;
                        ekwaVar2.c = j2;
                    }
                    try {
                        eksmVar2.e((ekwa) ekvzVar.build());
                        eksmVar2.f.set(true);
                        z2 = true;
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        eksmVar2.f.set(true);
                        throw th;
                    }
                    z = Boolean.valueOf(z2);
                    return z;
                } finally {
                    eksmVar2.b.writeLock().unlock();
                }
            }
        }, eksmVar.d);
        ListenableFuture b2 = elfp.b(j(h), new erog() { // from class: ekso
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return ektp.this.d(h, map);
            }
        }, this.c);
        ejjz ejjzVar = this.e;
        map.getClass();
        ListenableFuture a2 = elfp.a(b2, new Callable() { // from class: eksp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return map.keySet();
            }
        }, this.c);
        ejjzVar.g(a2);
        return a2;
    }

    public final ListenableFuture j(final ListenableFuture listenableFuture) {
        return elfr.k(q(), new eroh() { // from class: ektd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ListenableFuture.this;
            }
        }, erpp.a);
    }

    public final void k(Set set) {
        synchronized (this.i) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                eisx eisxVar = (eisx) it.next();
                cmh cmhVar = this.j;
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((enhk) ((a) ekhv.a(this.m, a.class, eisxVar)).gA()).entrySet()) {
                    ekrl a2 = ekrl.a((String) entry.getKey());
                    int a3 = eisxVar.a();
                    ekwd ekwdVar = (ekwd) ekwe.a.createBuilder();
                    ekwc ekwcVar = a2.a;
                    ekwdVar.copyOnWrite();
                    ekwe ekweVar = (ekwe) ekwdVar.instance;
                    ekwcVar.getClass();
                    ekweVar.c = ekwcVar;
                    ekweVar.b |= 1;
                    ekwdVar.copyOnWrite();
                    ekwe ekweVar2 = (ekwe) ekwdVar.instance;
                    ekweVar2.b |= 2;
                    ekweVar2.d = a3;
                    r(new ektu((ekwe) ekwdVar.build()), entry, hashMap);
                }
                cmhVar.putAll(hashMap);
            }
        }
    }

    public final /* synthetic */ void n(ektu ektuVar, ListenableFuture listenableFuture) {
        synchronized (this.i) {
            try {
                this.l.put(ektuVar, (Long) erqt.q(listenableFuture));
            } catch (CancellationException | ExecutionException unused) {
            }
        }
    }

    public final boolean o() {
        return this.n.a();
    }
}
