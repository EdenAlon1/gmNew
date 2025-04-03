package defpackage;

import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvib implements dvhq {
    public static final entd a = entd.c("GnpSdk");
    public final fazb b;
    public final String c;
    private final dvhm d;
    private final dlpw e;
    private final erqa f = new erqa();

    public dvib(dvix dvixVar, dlpw dlpwVar, fazb fazbVar, String str) {
        this.d = dvixVar;
        this.e = dlpwVar;
        this.b = fazbVar;
        this.c = str;
    }

    @Override // defpackage.dvhq
    public final ListenableFuture a(evwj evwjVar) {
        dvds dvdsVar = (dvds) dvdt.a.createBuilder();
        dvdsVar.copyOnWrite();
        dvdt dvdtVar = (dvdt) dvdsVar.instance;
        evwjVar.getClass();
        dvdtVar.c = evwjVar;
        dvdtVar.b = 1;
        final dvdt dvdtVar2 = (dvdt) dvdsVar.build();
        dlpw dlpwVar = this.e;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        final dvhj dvhjVar = new dvhj(dvdtVar2, dlpwVar.f().toEpochMilli());
        final dvhm dvhmVar = this.d;
        return this.f.b(eldl.c(new erog() { // from class: dvia
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ListenableFuture b;
                dvdt dvdtVar3 = dvdtVar2;
                if (dvdtVar3.b == 1) {
                    ((ensz) dvib.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "logReportedEvent", 141, "PromotionsManagerImpl.java")).J("Processing CC event. Code [%d] Source [%d] Package [%s].", Integer.valueOf((dvdtVar3.b == 1 ? (evwj) dvdtVar3.c : evwj.a).d), Integer.valueOf((dvdtVar3.b == 1 ? (evwj) dvdtVar3.c : evwj.a).c), (dvdtVar3.b == 1 ? (evwj) dvdtVar3.c : evwj.a).e);
                }
                if (dvdtVar3.b == 2 && dvib.a.o().R()) {
                    dvdx dvdxVar = dvdtVar3.b == 2 ? (dvdx) dvdtVar3.c : dvdx.a;
                    ensz enszVar = (ensz) dvib.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "logReportedEvent", 153, "PromotionsManagerImpl.java");
                    int size = dvdxVar.c.size();
                    ewal b2 = ewal.b(dvdxVar.b);
                    if (b2 == null) {
                        b2 = ewal.UNKNOWN;
                    }
                    enszVar.w("Processing VE event. Nodes [%d], Action [%s].", size, b2.name());
                    int i = 0;
                    while (i < dvdxVar.c.size()) {
                        int i2 = i + 1;
                        ((ensz) dvib.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "logReportedEvent", 160, "PromotionsManagerImpl.java")).w("  Node[%d]: [%s]", i2, TextUtils.join(",", ((dvdw) dvdxVar.c.get(i)).b));
                        i = i2;
                    }
                }
                dvhm dvhmVar2 = dvhmVar;
                final long elapsedRealtime2 = SystemClock.elapsedRealtime();
                final dvix dvixVar = (dvix) dvhmVar2;
                final ListenableFuture f = erny.f(((dvmt) dvixVar.d.a(null)).c(), eldl.a(new emwl() { // from class: dvie
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Map map = (Map) obj;
                        entd entdVar = dvix.a;
                        if (map == null) {
                            return new ArrayList();
                        }
                        ArrayList arrayList = new ArrayList(map.values());
                        Collections.sort(arrayList, new Comparator() { // from class: dvir
                            @Override // java.util.Comparator
                            public final int compare(Object obj2, Object obj3) {
                                entd entdVar2 = dvix.a;
                                return ((evts) obj2).g - ((evts) obj3).g;
                            }
                        });
                        return arrayList;
                    }
                }), erpp.a);
                final HashSet hashSet = new HashSet();
                Iterator it = dvixVar.m.a().iterator();
                while (it.hasNext()) {
                    hashSet.add(((dvmt) dvixVar.i.a((String) it.next())).c());
                }
                hashSet.add(((dvmt) dvixVar.i.a(null)).c());
                final ListenableFuture a2 = erqt.c(hashSet).a(eldl.m(new Callable() { // from class: dviu
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        entd entdVar = dvix.a;
                        Iterator it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            if (!((Map) ((ListenableFuture) it2.next()).get()).isEmpty()) {
                                return true;
                            }
                        }
                        return false;
                    }
                }), erpp.a);
                final ListenableFuture c = ((dvmt) dvixVar.j.a(null)).c();
                final ListenableFuture f2 = TextUtils.isEmpty(null) ? erny.f(dvixVar.B.a(), new emwl() { // from class: dvii
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        String str = ((PseudonymousIdToken) obj).a;
                        entd entdVar = dvix.a;
                        return emxc.i(str);
                    }
                }, erpp.a) : erqt.i(emux.a);
                final long j = elapsedRealtime;
                final dvhl dvhlVar = dvhjVar;
                final dvib dvibVar = dvib.this;
                ListenableFuture g = erny.g(erqt.d(f, a2, c, f2).a(eldl.m(new Callable() { // from class: dvij
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0094  */
                    /* JADX WARN: Removed duplicated region for block: B:83:0x0295  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() {
                        /*
                            Method dump skipped, instructions count: 730
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.dvij.call():java.lang.Object");
                    }
                }), erpp.a), eldl.d(new eroh() { // from class: dvil
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        int i3;
                        dviw a3;
                        int i4;
                        ListenableFuture g2;
                        ListenableFuture f3;
                        final List list = (List) obj;
                        if (list.isEmpty()) {
                            int i5 = engw.d;
                            return erqt.i(enou.a);
                        }
                        final dvix dvixVar2 = dvix.this;
                        dvhu dvhuVar = new dvhu();
                        int i6 = 3;
                        if (list == null) {
                            a3 = dvhuVar.a();
                            i3 = 3;
                        } else {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                evwq evwqVar = ((dvdp) it2.next()).c().d;
                                if (evwqVar == null) {
                                    evwqVar = evwq.a;
                                }
                                Iterator<E> it3 = evwqVar.b.iterator();
                                while (it3.hasNext()) {
                                    for (evwp evwpVar : ((evwm) it3.next()).b) {
                                        int i7 = evwpVar.c;
                                        int a4 = evwo.a(i7);
                                        if (a4 == 0) {
                                            throw null;
                                        }
                                        int i8 = a4 - 1;
                                        if (i8 == 0) {
                                            for (evwt evwtVar : (i7 == 2 ? (evxa) evwpVar.d : evxa.a).c) {
                                                int i9 = evwtVar.b;
                                                int a5 = evws.a(i9);
                                                int i10 = a5 - 1;
                                                if (a5 == 0) {
                                                    throw null;
                                                }
                                                if (i10 == 0) {
                                                    i4 = i6;
                                                    evwj evwjVar2 = i9 == 1 ? (evwj) evwtVar.c : evwj.a;
                                                    if (dvhuVar.a == null) {
                                                        dvhuVar.a = new enin();
                                                    }
                                                    dvhuVar.a.c(evwjVar2);
                                                } else if (i10 != 1) {
                                                    i4 = i6;
                                                    ((ensz) dvix.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor", "getTargetingData", 757, "TriggeringEventProcessor.java")).q("Received an unknown targeting term, ignoring.");
                                                } else {
                                                    i4 = i6;
                                                    ewan ewanVar = i9 == 2 ? (ewan) evwtVar.c : ewan.a;
                                                    if (dvhuVar.b == null) {
                                                        dvhuVar.b = new enin();
                                                    }
                                                    dvhuVar.b.c(ewanVar);
                                                }
                                                i6 = i4;
                                            }
                                        } else if (i8 == 1) {
                                            String str = (i7 == i6 ? (evwh) evwpVar.d : evwh.a).e;
                                            if (dvhuVar.c == null) {
                                                dvhuVar.c = new enin();
                                            }
                                            dvhuVar.c.c(str);
                                        } else if (i8 == i6) {
                                            evsn b3 = evsn.b((i7 == 5 ? (evwb) evwpVar.d : evwb.a).c);
                                            if (b3 == null) {
                                                b3 = evsn.ANDROID_PERMISSION_TYPE_UNSPECIFIED;
                                            }
                                            if (b3 != evsn.ANDROID_POST_NOTIFICATIONS || (easb.e(dvixVar2.b) && b3 == evsn.ANDROID_POST_NOTIFICATIONS)) {
                                                String a6 = dvdm.a(b3);
                                                if (!dvhuVar.b().g().contains(a6)) {
                                                    dvhuVar.b().c(a6);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            i3 = i6;
                            a3 = dvhuVar.a();
                        }
                        dvhv dvhvVar = (dvhv) a3;
                        ListenableFuture i11 = dvhvVar.a.isEmpty() ? erqt.i(enoz.a) : dvixVar2.e.f(dvhvVar.a);
                        ListenableFuture i12 = dvhvVar.b.isEmpty() ? erqt.i(enoz.a) : dvixVar2.f.e(dvhvVar.b);
                        if (dvhvVar.c.isEmpty()) {
                            g2 = erqt.i(enoz.a);
                        } else {
                            final dvht dvhtVar = dvixVar2.p;
                            ListenableFuture i13 = erqt.i(dvhvVar.c);
                            eafz eafzVar = dvhtVar.d;
                            g2 = erny.g(i13, eldl.d(new eroh() { // from class: dvhr
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    ArrayList arrayList = new ArrayList();
                                    dvht dvhtVar2 = dvht.this;
                                    dvuy dvuyVar = (dvuy) dvhtVar2.b.b();
                                    enqu listIterator = ((enip) obj2).listIterator();
                                    while (listIterator.hasNext()) {
                                        String str2 = (String) listIterator.next();
                                        dvuq dvuqVar = (dvuq) dvhtVar2.a.get(str2);
                                        if (dvuqVar != null) {
                                            arrayList.add(eldl.d(dvuqVar).a(null));
                                        } else if (dvuyVar != null) {
                                            arrayList.add(dvuyVar.c(str2));
                                        }
                                    }
                                    return arrayList.isEmpty() ? erqt.i(enoz.a) : erny.f(erqt.e(arrayList), new emwl() { // from class: dvhs
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj3) {
                                            enhd enhdVar = new enhd();
                                            for (dvus dvusVar : (List) obj3) {
                                                dvuu dvuuVar = dvusVar.b;
                                                if (dvuuVar.b() != 3) {
                                                    enhdVar.k(dvusVar.a, dvuuVar);
                                                }
                                            }
                                            return enhdVar.c();
                                        }
                                    }, dvhtVar2.c);
                                }
                            }), dvhtVar.c);
                        }
                        if (dvhvVar.d.isEmpty()) {
                            f3 = erqt.i(enoz.a);
                        } else {
                            ListenableFuture a7 = dvixVar2.g.a.a();
                            final ffji ffjiVar = new ffji() { // from class: dvpd
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj2) {
                                    return DesugarCollections.unmodifiableMap(((dvpa) obj2).b);
                                }
                            };
                            f3 = erny.f(a7, new emwl() { // from class: dvpe
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    return ffji.this.invoke(obj2);
                                }
                            }, erpp.a);
                        }
                        ListenableFuture[] listenableFutureArr = new ListenableFuture[4];
                        listenableFutureArr[0] = i11;
                        listenableFutureArr[1] = i12;
                        listenableFutureArr[2] = g2;
                        listenableFutureArr[i3] = f3;
                        final ListenableFuture listenableFuture = i11;
                        final ListenableFuture listenableFuture2 = i12;
                        final ListenableFuture listenableFuture3 = f3;
                        final ListenableFuture listenableFuture4 = g2;
                        return erqt.d(listenableFutureArr).a(eldl.m(new Callable() { // from class: dvid
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                dvid dvidVar = this;
                                Map map = (Map) listenableFuture.get();
                                Map map2 = (Map) listenableFuture2.get();
                                enhk enhkVar = (enhk) listenableFuture4.get();
                                Map map3 = (Map) listenableFuture3.get();
                                ensz enszVar2 = (ensz) dvix.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor", "filterPromotionsBasedOnTargeting", 442, "TriggeringEventProcessor.java");
                                List<dvdp> list2 = list;
                                enszVar2.w("Checking targeting for [%d] triggered promotions for account [%s].", list2.size(), null);
                                ArrayList arrayList = new ArrayList();
                                for (dvdp dvdpVar : list2) {
                                    dvix dvixVar3 = dvix.this;
                                    evts c2 = dvdpVar.c();
                                    evwq evwqVar2 = c2.d;
                                    if (evwqVar2 == null) {
                                        evwqVar2 = evwq.a;
                                    }
                                    evub evubVar = c2.c;
                                    if (evubVar == null) {
                                        evubVar = evub.a;
                                    }
                                    if (dvixVar3.z.b(evwqVar2, new dvgh(evubVar, dvdpVar, enhk.j(map), enhk.j(map2), enhk.j(enhkVar), enhk.j(map3)))) {
                                        ((efkw) ((ears) dvixVar3.r.b()).l.get()).a(dvixVar3.s);
                                        arrayList.add(dvdpVar);
                                    } else {
                                        dvixVar3.u.c(dvdpVar, "Failed Targeting.", new Object[0]);
                                    }
                                    dvidVar = this;
                                }
                                return arrayList;
                            }
                        }), erpp.a);
                    }
                }), erpp.a);
                dvby dvbyVar = dvixVar.h;
                b = fgfz.b(dvbyVar.b, ffhe.a, ffsm.a, new dvbx(dvbyVar, g, null));
                return ernq.f(erny.f(erqc.o(erny.g(b, eldl.d(new eroh() { // from class: dvih
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r17v1 */
                    /* JADX WARN: Type inference failed for: r17v3 */
                    /* JADX WARN: Type inference failed for: r17v4 */
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        ?? r17;
                        final ListenableFuture a3;
                        List arrayList;
                        emxc emxcVar = (emxc) obj;
                        boolean z = false;
                        if (!emxcVar.g()) {
                            return erqt.i(false);
                        }
                        final dvdp dvdpVar = (dvdp) emxcVar.c();
                        final evts c2 = dvdpVar.c();
                        evtl evtlVar = (evtl) evto.a.createBuilder();
                        evub evubVar = c2.c;
                        if (evubVar == null) {
                            evubVar = evub.a;
                        }
                        evtlVar.copyOnWrite();
                        evto evtoVar = (evto) evtlVar.instance;
                        evubVar.getClass();
                        evtoVar.c = evubVar;
                        evtoVar.b |= 1;
                        evzd evzdVar = c2.f;
                        if (evzdVar == null) {
                            evzdVar = evzd.a;
                        }
                        evvt evvtVar = evzdVar.f ? evvt.CONTROL_NOT_SEEN : dvhk.a;
                        dvhl dvhlVar2 = dvhlVar;
                        final dvix dvixVar2 = dvix.this;
                        evtlVar.copyOnWrite();
                        ((evto) evtlVar.instance).d = evvtVar.a();
                        eyiz eyizVar = (eyiz) eyja.a.createBuilder();
                        long seconds = TimeUnit.MILLISECONDS.toSeconds(((dvhj) dvhlVar2).b);
                        eyizVar.copyOnWrite();
                        ((eyja) eyizVar.instance).b = seconds;
                        evtlVar.copyOnWrite();
                        evto evtoVar2 = (evto) evtlVar.instance;
                        eyja eyjaVar = (eyja) eyizVar.build();
                        eyjaVar.getClass();
                        evtoVar2.e = eyjaVar;
                        evtoVar2.b |= 2;
                        final evto evtoVar3 = (evto) evtlVar.build();
                        ListenableFuture d = ((dvmt) dvixVar2.i.a(null)).d(dvmu.a(c2), evtoVar3);
                        evzd evzdVar2 = c2.f;
                        if (evzdVar2 == null) {
                            evzdVar2 = evzd.a;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        int i3 = evzdVar2.c;
                        int a4 = evyy.a(i3);
                        if (a4 == 0) {
                            throw null;
                        }
                        if (a4 - 1 != 0) {
                            a3 = erqt.i(enoz.a);
                            r17 = 0;
                        } else {
                            arrayList2.addAll((i3 == 2 ? (evxu) evzdVar2.d : evxu.a).h);
                            final HashMap h = ennc.h(arrayList2.size());
                            int size2 = arrayList2.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                evxi evxiVar = (evxi) arrayList2.get(i4);
                                boolean z2 = z;
                                h.put(evxiVar, dvixVar2.t.e(evxiVar.c == 8 ? (evvx) evxiVar.d : evvx.a, evxiVar));
                                i4++;
                                z = z2;
                            }
                            r17 = z;
                            a3 = erqt.c(h.values()).a(eldl.m(new Callable() { // from class: dvif
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    entd entdVar = dvix.a;
                                    Map map = h;
                                    HashMap h2 = ennc.h(map.size());
                                    for (Map.Entry entry : map.entrySet()) {
                                        try {
                                            Intent intent = (Intent) ((ListenableFuture) entry.getValue()).get();
                                            if (intent != null) {
                                                evxg b3 = evxg.b(((evxi) entry.getKey()).e);
                                                if (b3 == null) {
                                                    b3 = evxg.ACTION_UNKNOWN;
                                                }
                                                h2.put(b3, intent);
                                            }
                                        } catch (InterruptedException | ExecutionException e) {
                                            ensz enszVar2 = (ensz) ((ensz) ((ensz) dvix.a.j()).g(e)).h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/TriggeringEventProcessor", "getActionIntentMapFuture", 604, "TriggeringEventProcessor.java");
                                            evxg b4 = evxg.b(((evxi) entry.getKey()).e);
                                            if (b4 == null) {
                                                b4 = evxg.ACTION_UNKNOWN;
                                            }
                                            enszVar2.D("Failed to add intent for action of type [%s] and text [%s]", b4.name(), ((evxi) entry.getKey()).f);
                                        }
                                    }
                                    return h2;
                                }
                            }), erpp.a);
                        }
                        Map map = dvixVar2.v;
                        evzd evzdVar3 = c2.f;
                        if (evzdVar3 == null) {
                            evzdVar3 = evzd.a;
                        }
                        evzc b3 = evzc.b(evzdVar3.e);
                        if (b3 == null) {
                            b3 = evzc.UITYPE_NONE;
                        }
                        ffbr ffbrVar = (ffbr) map.get(b3);
                        if (ffbrVar != null) {
                            dvsf dvsfVar = (dvsf) ffbrVar.b();
                            evzd evzdVar4 = c2.f;
                            if (evzdVar4 == null) {
                                evzdVar4 = evzd.a;
                            }
                            arrayList = dvsfVar.b(evzdVar4.c == 2 ? (evxu) evzdVar4.d : evxu.a);
                            dvsf dvsfVar2 = (dvsf) ffbrVar.b();
                            evzd evzdVar5 = c2.f;
                            if (evzdVar5 == null) {
                                evzdVar5 = evzd.a;
                            }
                            evxu evxuVar = (evzdVar5.c == 6 ? (evyu) evzdVar5.d : evyu.a).d;
                            if (evxuVar == null) {
                                evxuVar = evxu.a;
                            }
                            arrayList.addAll(dvsfVar2.b(evxuVar));
                        } else {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(a3);
                        arrayList.add(d);
                        ListenableFuture a5 = erqt.c(arrayList).a(eldl.m(new Callable() { // from class: dvis
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                entd entdVar = dvix.a;
                                dvdi dvdiVar = new dvdi();
                                dvdp dvdpVar2 = dvdp.this;
                                dvdiVar.b(dvdpVar2.b());
                                dvdiVar.a = dvdpVar2.e();
                                dvdiVar.c(dvdpVar2.c());
                                dvdiVar.d(dvdpVar2.a());
                                dvdiVar.b = dvdpVar2.d();
                                dvdiVar.c = dvdpVar2.f();
                                dvdiVar.b((Map) a3.get());
                                return dvdiVar.a();
                            }
                        }), erpp.a);
                        final dvhp dvhpVar = dvixVar2.A;
                        final ListenableFuture g2 = erny.g(a5, eldl.d(new eroh() { // from class: dvit
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                ListenableFuture b4;
                                dvdp dvdpVar2 = (dvdp) obj2;
                                dvdpVar2.getClass();
                                dvhp dvhpVar2 = dvhp.this;
                                b4 = fgfz.b(dvhpVar2.b, ffhe.a, ffsm.a, new dvho(dvhpVar2, dvdpVar2, null));
                                return b4;
                            }
                        }), erpp.a);
                        ListenableFuture g3 = erny.g(g2, eldl.d(new eroh() { // from class: dvig
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                if (((Boolean) obj2).booleanValue()) {
                                    return erre.a;
                                }
                                return erny.f(((dvmt) dvix.this.i.a(null)).e(dvmu.a(c2)), new emwl() { // from class: dvim
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        entd entdVar = dvix.a;
                                        return null;
                                    }
                                }, erpp.a);
                            }
                        }), erpp.a);
                        ListenableFuture g4 = erny.g(g2, eldl.d(new eroh() { // from class: dvik
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                if (!((Boolean) obj2).booleanValue()) {
                                    return erqt.i(null);
                                }
                                evts evtsVar = c2;
                                dvix dvixVar3 = dvix.this;
                                evtz evtzVar = evtsVar.j;
                                if (evtzVar == null) {
                                    evtzVar = evtz.a;
                                }
                                return dvixVar3.y.a(evtoVar3, evtzVar);
                            }
                        }), erpp.a);
                        ListenableFuture g5 = erny.g(g2, eldl.d(new eroh() { // from class: dvin
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                return ((Boolean) obj2).booleanValue() ? dvix.this.o.a(12) : erqt.i(null);
                            }
                        }), erpp.a);
                        ListenableFuture[] listenableFutureArr = new ListenableFuture[3];
                        listenableFutureArr[r17] = g3;
                        listenableFutureArr[1] = g4;
                        listenableFutureArr[2] = g5;
                        return erqt.b(listenableFutureArr).a(eldl.m(new Callable() { // from class: dvio
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return (Boolean) ListenableFuture.this.get();
                            }
                        }), erpp.a);
                    }
                }), erpp.a)), eldl.a(new emwl() { // from class: dvhy
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        ((ensz) dvib.a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "instrumentProcessResult", 102, "PromotionsManagerImpl.java")).t("Promo shown: %s\n====", bool);
                        long elapsedRealtime3 = SystemClock.elapsedRealtime();
                        long j2 = elapsedRealtime2;
                        dvib dvibVar2 = dvib.this;
                        ears earsVar = (ears) dvibVar2.b.b();
                        bool.booleanValue();
                        ((efky) earsVar.s.get()).b(elapsedRealtime3 - j2, dvibVar2.c, true, true, bool);
                        ears earsVar2 = (ears) dvibVar2.b.b();
                        bool.booleanValue();
                        ((efky) earsVar2.t.get()).b(j2 - j, dvibVar2.c, true, true, bool);
                        return bool;
                    }
                }), erpp.a), Throwable.class, eldl.a(new emwl() { // from class: dvhz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        ((ensz) ((ensz) ((ensz) dvib.a.j()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/internal/promotions/impl/PromotionsManagerImpl", "instrumentProcessResult", 131, "PromotionsManagerImpl.java")).q("Failed to process event");
                        return false;
                    }
                }), erpp.a);
            }
        }), erpp.a);
    }
}
