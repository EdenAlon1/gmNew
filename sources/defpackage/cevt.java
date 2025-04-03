package defpackage;

import android.content.IntentFilter;
import android.text.TextUtils;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cevt implements cevh {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueBatchingImpl");
    public final ceyw b;
    public final cqoh c;
    public final cfjc d;
    private final ffbr e;
    private final dtuu f;
    private final ffsk g;
    private final ffsk h;
    private final errl i;
    private final cewv j;
    private final Optional k;
    private final cfbt l;
    private final fazb m;

    public cevt(ffbr ffbrVar, dtuu dtuuVar, ffsk ffskVar, ffsk ffskVar2, errl errlVar, ceyw ceywVar, cqoh cqohVar, cewv cewvVar, Optional optional, cfjc cfjcVar, cfbt cfbtVar, fazb fazbVar) {
        ffbrVar.getClass();
        dtuuVar.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        errlVar.getClass();
        ceywVar.getClass();
        cqohVar.getClass();
        cfjcVar.getClass();
        cfbtVar.getClass();
        fazbVar.getClass();
        this.e = ffbrVar;
        this.f = dtuuVar;
        this.g = ffskVar;
        this.h = ffskVar2;
        this.i = errlVar;
        this.b = ceywVar;
        this.c = cqohVar;
        this.j = cewvVar;
        this.k = optional;
        this.d = cfjcVar;
        this.l = cfbtVar;
        this.m = fazbVar;
        if (((cssv) cewvVar.f.b()).a()) {
            koa.h(cewvVar.b, new cewu(cewvVar), new IntentFilter("messaging.workqueue.WorkQueueDebugger"), "android.permission.DUMP");
        }
    }

    @Override // defpackage.cevh
    public final cevg a(ceyr ceyrVar) {
        ceyrVar.getClass();
        ekzz f = eleg.f("WorkQueueBatchingImpl#queueWorkItem");
        try {
            engw r = engw.r(ceyrVar);
            r.getClass();
            Object obj = d(r).get(ceyrVar);
            obj.getClass();
            cevg cevgVar = (cevg) obj;
            ffig.a(f, null);
            return cevgVar;
        } finally {
        }
    }

    @Override // defpackage.cevh
    public final elfl b(ceyr ceyrVar) {
        elfl c;
        c = axol.c(this.g, ffhe.a, ffsm.a, new cevs(this, ceyrVar, null));
        return c;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [eyhs, java.lang.Object] */
    @Override // defpackage.cevh
    public final engw c(String str) {
        cewf cewfVar = (cewf) this.m.b();
        engw<ceze> b = cewfVar.b(str, true);
        ArrayList arrayList = new ArrayList(ffdx.n(b, 10));
        for (ceze cezeVar : b) {
            ?? h = cewfVar.c.c(str).d().h(cezeVar.t());
            h.getClass();
            arrayList.add(new cetr(h, cezeVar.n(), cezeVar.o()));
        }
        return engq.a(arrayList);
    }

    @Override // defpackage.cevh
    public final enhk d(engw engwVar) {
        int i;
        Object next;
        engwVar.getClass();
        ekzz f = eleg.f("WorkQueueBatchingImpl#queueWorkItems");
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : engwVar) {
                ceyr ceyrVar = (ceyr) obj;
                ceyrVar.getClass();
                if (!this.k.isEmpty()) {
                    Object obj2 = this.k.get();
                    String d = ceyrVar.d();
                    byte[] byteArray = ceyrVar.c().toByteArray();
                    ceve b = ((ceww) ((ceyq) obj2).c.b()).b(d);
                    if (b == null) {
                        ensk j = ceyq.a.j();
                        j.Y(ente.a, "BugleWorkQueue");
                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", 71, "WorkQueuePreflightImpl.java")).t("no handler found for type %s", d);
                        throw new cfkm("no handler found for type ".concat(d));
                    }
                    if (d.contains("-")) {
                        ensk j2 = ceyq.a.j();
                        j2.Y(ente.a, "BugleWorkQueue");
                        ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", 76, "WorkQueuePreflightImpl.java")).t("key cannot contain the character - %s", d);
                        throw new cfkn("key cannot contain the character - ".concat(d));
                    }
                    try {
                        int length = byteArray.length;
                        if (length > ((Integer) ceyq.b.e()).intValue()) {
                            ensk i2 = ceyq.a.i();
                            i2.Y(ente.a, "BugleWorkQueue");
                            ((enrr) ((enrr) i2).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", 82, "WorkQueuePreflightImpl.java")).w("protobuf too big %d vs %d", length, ceyq.b.e());
                            throw new cfkq("protobuf too big " + length + " vs " + String.valueOf(ceyq.b.e()));
                        }
                        if (!ceyrVar.c().equals(b.d().h(byteArray))) {
                            ensk j3 = ceyq.a.j();
                            j3.Y(ente.a, "BugleWorkQueue");
                            ((enrr) ((enrr) j3).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", 88, "WorkQueuePreflightImpl.java")).q("failed equality reparsing protobuf (wrong protobuf type?)");
                            throw new cfkp();
                        }
                        if (!b.i(byteArray)) {
                            ensk g = ceyq.a.g();
                            g.Y(ente.a, "BugleWorkQueue");
                            ((enrr) ((enrr) g).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "check", 58, "WorkQueuePreflightImpl.java")).t("preflightRaw for %s returned false", ceyrVar.d());
                            arrayList2.add(obj);
                        }
                    } catch (eygu e) {
                        ensk j4 = ceyq.a.j();
                        j4.Y(ente.a, "BugleWorkQueue");
                        ((enrr) ((enrr) ((enrr) j4).g(e)).h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueuePreflightImpl", "preflightStrictChecks", ']', "WorkQueuePreflightImpl.java")).q("got InvalidProtocolBufferException re-parsing protobuf (wrong protobuf type?)");
                        throw new cfko(e);
                    }
                }
                arrayList.add(obj);
            }
            ffcf ffcfVar = new ffcf(arrayList, arrayList2);
            List list = (List) ffcfVar.a;
            List list2 = (List) ffcfVar.b;
            int i3 = 10;
            LinkedHashMap linkedHashMap = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(list2, 10)), 16));
            for (Object obj3 : list2) {
                linkedHashMap.put(obj3, cevp.a());
            }
            if (list.isEmpty()) {
                enhk e2 = engq.e(linkedHashMap);
                ffig.a(f, null);
                return e2;
            }
            ceww cewwVar = (ceww) this.e.b();
            ArrayList arrayList3 = new ArrayList(ffdx.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList3.add(((ceyr) it.next()).d());
            }
            Set<String> ar = ffdx.ar(arrayList3);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(ar, 10)), 16));
            for (String str : ar) {
                ffcf ffcfVar2 = new ffcf(str, cewwVar.c(str).f());
                linkedHashMap2.put(ffcfVar2.a, ffcfVar2.b);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj4 : list) {
                ceyr ceyrVar2 = (ceyr) obj4;
                String str2 = (String) linkedHashMap2.get(ceyrVar2.d());
                String str3 = ((cetq) ceyrVar2.a()).a;
                if (TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
                    if (str2 == null) {
                        str2 = ceyrVar2.d();
                    }
                    str2 = TextUtils.isEmpty(str3) ? str2.concat("-") : a.w(str3, str2, "-");
                }
                Object obj5 = linkedHashMap3.get(str2);
                if (obj5 == null) {
                    obj5 = new ArrayList();
                    linkedHashMap3.put(str2, obj5);
                }
                ((List) obj5).add(obj4);
            }
            ArrayList arrayList4 = new ArrayList(linkedHashMap3.size());
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                final String str4 = (String) entry.getKey();
                final List list3 = (List) entry.getValue();
                str4.getClass();
                Optional optional = this.k;
                final ffji ffjiVar = new ffji() { // from class: cevj
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj6) {
                        ceyp ceypVar = (ceyp) obj6;
                        ceypVar.getClass();
                        ceypVar.a();
                        return ffcu.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: cevk
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj6) {
                        ffji.this.invoke(obj6);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ArrayList arrayList5 = new ArrayList();
                for (Object obj6 : list3) {
                    if (((cetq) ((ceyr) obj6).a()).b != null) {
                        arrayList5.add(obj6);
                    }
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Object obj7 : arrayList5) {
                    String str5 = ((cetq) ((ceyr) obj7).a()).b;
                    str5.getClass();
                    Object obj8 = linkedHashMap4.get(str5);
                    if (obj8 == null) {
                        obj8 = new ArrayList();
                        linkedHashMap4.put(str5, obj8);
                    }
                    ((List) obj8).add(obj7);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(ffew.a(linkedHashMap4.size()));
                Iterator it2 = linkedHashMap4.entrySet().iterator();
                while (true) {
                    i = 0;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    linkedHashMap5.put(entry2.getKey(), (ceyr) ((List) entry2.getValue()).get(0));
                }
                Collection<List> values = linkedHashMap4.values();
                ArrayList arrayList6 = new ArrayList();
                for (List list4 : values) {
                    List Y = ffdx.Y(list4, 1);
                    ArrayList arrayList7 = new ArrayList(ffdx.n(Y, i3));
                    Iterator it3 = Y.iterator();
                    while (it3.hasNext()) {
                        arrayList7.add(new ffcf((ceyr) it3.next(), list4.get(i)));
                        i = 0;
                    }
                    ffdx.w(arrayList6, arrayList7);
                    i3 = 10;
                    i = 0;
                }
                cevo cevoVar = new cevo(linkedHashMap5, ffew.k(arrayList6));
                final Map map = cevoVar.a;
                final Map map2 = cevoVar.b;
                cevq cevqVar = (cevq) this.f.c("WorkQueueBatchingImpl#queueWorkItemAndReturnFuture", new emyl() { // from class: cevl
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.emyl
                    public final Object get() {
                        Map map3;
                        Object obj9;
                        Iterator it4;
                        ekzz f2 = eleg.f("WorkQueueBatchingImpl#duplicateRows");
                        Map map4 = map2;
                        Map map5 = map;
                        try {
                            boolean isEmpty = map5.isEmpty();
                            final List list5 = list3;
                            final String str6 = str4;
                            final cevt cevtVar = this;
                            if (isEmpty) {
                                map3 = ffem.a;
                            } else {
                                cfba a2 = cfbf.a();
                                a2.z("WorkQueueBatchingImpl#findExistingDuplicateRows");
                                a2.e(new Function() { // from class: cevm
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj10) {
                                        cfip a3;
                                        cfbe cfbeVar = (cfbe) obj10;
                                        String str7 = str6;
                                        cfbeVar.g(str7);
                                        ArrayList arrayList8 = new ArrayList();
                                        Iterator it5 = list5.iterator();
                                        while (it5.hasNext()) {
                                            String str8 = ((cetq) ((ceyr) it5.next()).a()).b;
                                            if (str8 != null) {
                                                arrayList8.add(str8);
                                            }
                                        }
                                        Set ar2 = ffdx.ar(arrayList8);
                                        int intValue = cfbf.c().intValue();
                                        if (intValue < 42050) {
                                            dtub.w("deduplication_tag", intValue);
                                        }
                                        cevt cevtVar2 = cevtVar;
                                        cfbeVar.aq(new dtrw("work_queue.deduplication_tag", 3, cfbe.at(ar2), false));
                                        cfir cfirVar = (cfir) ((Map) cevtVar2.d.d.c()).get(str7);
                                        cfbeVar.aq(new dtrw("work_queue._id", 4, cfbe.at((cfirVar == null || (a3 = cfirVar.a()) == null) ? ffel.a : a3.b), true));
                                        return cfbeVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                engw y = a2.b().y();
                                y.getClass();
                                LinkedHashMap linkedHashMap6 = new LinkedHashMap(ffmk.f(ffew.a(ffdx.n(y, 10)), 16));
                                enqv it5 = y.iterator();
                                while (it5.hasNext()) {
                                    E next2 = it5.next();
                                    String o = ((ceze) next2).o();
                                    ceyr ceyrVar3 = (ceyr) map5.get(o);
                                    if (ceyrVar3 == null) {
                                        throw new IllegalStateException("Could not find request for deduplication tag ".concat(String.valueOf(o)));
                                    }
                                    linkedHashMap6.put(ceyrVar3, next2);
                                }
                                ensk g2 = cevt.a.g();
                                g2.Y(ente.a, "BugleWorkQueue");
                                enrr enrrVar = (enrr) g2;
                                enrrVar.Y(cflu.a, Integer.valueOf(linkedHashMap6.size()));
                                enrrVar.Y(cflu.b, str6);
                                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueBatchingImpl", "getExistingRowsThatDuplicateRequests", 269, "WorkQueueBatchingImpl.kt")).q("Deduping pwq items");
                                map3 = linkedHashMap6;
                            }
                            ffig.a(f2, null);
                            f2 = eleg.f("WorkQueueBatchingImpl#scheduleNewRows");
                            try {
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj10 : list5) {
                                    ceyr ceyrVar4 = (ceyr) obj10;
                                    if (!map3.keySet().contains(ceyrVar4) && !map4.keySet().contains(ceyrVar4)) {
                                        arrayList8.add(obj10);
                                    }
                                }
                                long epochMilli = cevtVar.c.f().toEpochMilli();
                                ArrayList arrayList9 = new ArrayList(ffdx.n(arrayList8, 10));
                                Iterator it6 = arrayList8.iterator();
                                while (it6.hasNext()) {
                                    ceyr ceyrVar5 = (ceyr) it6.next();
                                    ceyrVar5.getClass();
                                    String[] strArr = cfbf.a;
                                    cezh cezhVar = new cezh();
                                    cezhVar.h(ceyrVar5.d());
                                    cezhVar.g(epochMilli);
                                    cezhVar.f(ceyrVar5.c().toByteArray());
                                    cezhVar.e(str6);
                                    cezhVar.c(((cetq) ceyrVar5.a()).b);
                                    cezhVar.b(((cetq) ceyrVar5.a()).d);
                                    Duration duration = ((cetq) ceyrVar5.a()).c;
                                    if (duration != null) {
                                        it4 = it6;
                                        cezhVar.d(new Date(epochMilli + duration.toMillis()));
                                    } else {
                                        it4 = it6;
                                    }
                                    arrayList9.add(cezhVar.a());
                                    it6 = it4;
                                }
                                ceze[] cezeVarArr = (ceze[]) arrayList9.toArray(new ceze[0]);
                                long[] A = dtub.A(cfbf.b(), 0, true, new BiConsumer() { // from class: cezb
                                    @Override // java.util.function.BiConsumer
                                    public final void accept(Object obj11, Object obj12) {
                                        ceze cezeVar = (ceze) obj11;
                                        Long l = (Long) obj12;
                                        String[] strArr2 = cfbf.a;
                                        if (l.longValue() >= 0) {
                                            cezeVar.a = new cezd(l).a.longValue();
                                            cezeVar.fY(0);
                                        }
                                    }

                                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                                    }
                                }, (ceze[]) Arrays.copyOf(cezeVarArr, cezeVarArr.length));
                                A.getClass();
                                final ffdr ffdrVar = new ffdr(A);
                                cfba a3 = cfbf.a();
                                a3.z("WorkQueueBatchingImpl#loadInsertedRows");
                                a3.e(new Function() { // from class: cevn
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj11) {
                                        cfbe cfbeVar = (cfbe) obj11;
                                        cfbeVar.d(ffdrVar);
                                        return cfbeVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                a3.d(new cfax(cfbf.c.a));
                                engw y2 = a3.b().y();
                                ensk g3 = cevt.a.g();
                                g3.Y(ente.a, "BugleWorkQueue");
                                enrr enrrVar2 = (enrr) g3;
                                enrrVar2.Y(cflu.b, str6);
                                enrrVar2.Y(cflu.a, Integer.valueOf(arrayList8.size()));
                                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueBatchingImpl", "addNewRequestsToQueue", 243, "WorkQueueBatchingImpl.kt")).q("Queued");
                                y2.getClass();
                                Map k = ffew.k(ffdx.an(arrayList8, y2));
                                ffig.a(f2, null);
                                f2 = eleg.f("WorkQueueBatchingImpl#maybeSchedulingDeferred");
                                try {
                                    Iterator it7 = k.values().iterator();
                                    if (it7.hasNext()) {
                                        Object next3 = it7.next();
                                        if (it7.hasNext()) {
                                            long l = ((ceze) next3).l();
                                            do {
                                                Object next4 = it7.next();
                                                long l2 = ((ceze) next4).l();
                                                if (l > l2) {
                                                    l = l2;
                                                }
                                                if (l > l2) {
                                                    next3 = next4;
                                                }
                                            } while (it7.hasNext());
                                        }
                                        obj9 = next3;
                                    } else {
                                        obj9 = null;
                                    }
                                    ceze cezeVar = (ceze) obj9;
                                    Optional c = cezeVar != null ? cevtVar.b.c(cezeVar) : Optional.empty();
                                    ffig.a(f2, null);
                                    return new cevq(map3, k, c);
                                } finally {
                                }
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } finally {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                });
                Map map3 = cevqVar.a;
                Map map4 = cevqVar.b;
                ffss ffssVar = (ffss) fflm.b(cevqVar.c);
                if (ffssVar == null) {
                    Iterator it4 = map4.values().iterator();
                    if (it4.hasNext()) {
                        next = it4.next();
                        if (it4.hasNext()) {
                            long l = ((ceze) next).l();
                            do {
                                Object next2 = it4.next();
                                long l2 = ((ceze) next2).l();
                                if (l > l2) {
                                    l = l2;
                                }
                                if (l > l2) {
                                    next = next2;
                                }
                            } while (it4.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    ceze cezeVar = (ceze) next;
                    ffssVar = cezeVar != null ? ffra.b(this.h, ekxi.a(ffhe.a), ffsm.b, new cevr(null, this, cezeVar)) : null;
                    if (ffssVar == null) {
                        ffssVar = new ffrq();
                        ffssVar.t(null);
                    }
                }
                f = eleg.f("WorkQueueBatchingImpl#finish");
                try {
                    LinkedHashMap linkedHashMap6 = new LinkedHashMap(ffew.a(map4.size()));
                    for (Map.Entry entry3 : map4.entrySet()) {
                        Object key = entry3.getKey();
                        cfbt cfbtVar = this.l;
                        long l3 = ((ceze) entry3.getValue()).l();
                        cfbs cfbsVar = new cfbs(ffssVar, cfbtVar.a);
                        cfbtVar.b.putIfAbsent(Long.valueOf(l3), cfbsVar);
                        linkedHashMap6.put(key, cfbsVar);
                        map3 = map3;
                    }
                    Map map5 = map3;
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap(ffew.a(map5.size()));
                    for (Map.Entry entry4 : map5.entrySet()) {
                        Object key2 = entry4.getKey();
                        Object obj9 = (cevg) this.l.b.get(Long.valueOf(((ceze) entry4.getValue()).l()));
                        if (obj9 == null) {
                            obj9 = cevp.a();
                        }
                        linkedHashMap7.put(key2, obj9);
                    }
                    ffssVar.z();
                    Set g2 = fffi.g(map5.keySet(), map2.keySet());
                    f = eleg.f("WorkQueueBatchingImpl#runWorkRequestExtrasCallbacks");
                    try {
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it5 = g2.iterator();
                        while (it5.hasNext()) {
                            cevu cevuVar = ((cetq) ((ceyr) it5.next()).a()).f;
                            if (cevuVar != null) {
                                arrayList8.add(cevuVar);
                            }
                        }
                        Iterator it6 = arrayList8.iterator();
                        while (it6.hasNext()) {
                            ((cevu) it6.next()).a();
                        }
                        Set keySet = linkedHashMap6.keySet();
                        ArrayList arrayList9 = new ArrayList();
                        Iterator it7 = keySet.iterator();
                        while (it7.hasNext()) {
                            cevu cevuVar2 = ((cetq) ((ceyr) it7.next()).a()).f;
                            if (cevuVar2 != null) {
                                arrayList9.add(cevuVar2);
                            }
                        }
                        Iterator it8 = arrayList9.iterator();
                        while (it8.hasNext()) {
                            ((cevu) it8.next()).b();
                        }
                        for (Map.Entry entry5 : linkedHashMap6.entrySet()) {
                            ceyr ceyrVar3 = (ceyr) entry5.getKey();
                            cevg cevgVar = (cevg) entry5.getValue();
                            erqj erqjVar = ((cetq) ceyrVar3.a()).e;
                            if (erqjVar != null) {
                                cevgVar.a().k(erqjVar, this.i);
                            }
                        }
                        ffig.a(f, null);
                        Map j5 = ffew.j(linkedHashMap6, linkedHashMap7);
                        LinkedHashMap linkedHashMap8 = new LinkedHashMap(ffew.a(map2.size()));
                        for (Map.Entry entry6 : map2.entrySet()) {
                            Object key3 = entry6.getKey();
                            Object obj10 = j5.get(entry6.getValue());
                            obj10.getClass();
                            linkedHashMap8.put(key3, (cevg) obj10);
                        }
                        Map j6 = ffew.j(j5, linkedHashMap8);
                        ffig.a(f, null);
                        arrayList4.add(j6);
                        i3 = 10;
                    } finally {
                    }
                } finally {
                }
            }
            Iterator it9 = arrayList4.iterator();
            if (!it9.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object next3 = it9.next();
            while (it9.hasNext()) {
                next3 = ffew.j((Map) next3, (Map) it9.next());
            }
            enhk e3 = engq.e(ffew.j((Map) next3, linkedHashMap));
            ffig.a(f, null);
            return e3;
        } finally {
        }
    }

    @Override // defpackage.cevh
    public final void e(String str, String str2) {
        cewf cewfVar = (cewf) this.m.b();
        str2.getClass();
        if (Integer.valueOf(cewfVar.a(str, str2)).equals(0)) {
            ((enrr) cewf.a.i().h("com/google/android/apps/messaging/shared/datamodel/workqueue/WorkQueueBatchingImpl", "cancel", 301, "WorkQueueBatchingImpl.kt")).D("Attempted to cancel work, but no work found %s %s", str, str2);
            throw new IndexOutOfBoundsException("Attempted to cancel work, but no work found");
        }
    }

    @Override // defpackage.cevh
    public final void f(String str) {
        ((cewf) this.m.b()).b(str, false);
    }

    @Override // defpackage.cevh
    public final /* synthetic */ void g(ceyr ceyrVar) {
        b(ceyrVar);
    }

    @Override // defpackage.cevh
    public final void h(String str) {
        cewf cewfVar = (cewf) this.m.b();
        str.getClass();
        cewfVar.a("fi_multi_sync_grpc", str);
    }

    @Override // defpackage.cevh
    public final elfl i(cetu cetuVar, EnumSet enumSet) {
        return this.j.a(cetuVar, enumSet, true, null, null);
    }
}
