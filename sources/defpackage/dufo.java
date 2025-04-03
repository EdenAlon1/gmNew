package defpackage;

import android.content.Context;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dufo implements dufd {
    public static final enru a = enru.c("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl");
    public static final enip b = enip.r(ezib.GELLER_CONFIG, ezib.PRIVACY_SETTINGS);
    public final emxc c;
    public final Geller d;
    public final eyom e;
    public final emwl f;
    public final duev g;
    public final Context h;
    public final ExecutorService j;
    private final emyv p;
    private final ExecutorService q;
    public final Object k = new Object();
    public boolean i = false;
    final Map l = new HashMap();
    final Map m = new HashMap();
    final Map n = new HashMap();
    final Map o = new HashMap();

    public dufo(emxc emxcVar, Geller geller, dybe dybeVar, String str, emwl emwlVar, Set set, emwl emwlVar2, eyev eyevVar, Boolean bool, dudi dudiVar, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, Map map, emyv emyvVar, emxc emxcVar2, emxc emxcVar3, Context context) {
        this.c = emxcVar;
        this.d = geller;
        this.e = geller.e;
        this.f = emwlVar2;
        this.p = emyvVar;
        this.j = executorService;
        this.q = executorService2;
        this.h = context;
        this.g = new duev(emxcVar, geller, str, emwlVar, set, emwlVar2, eyevVar, bool, dudiVar, executorService, executorService2, executorService3, map, emyvVar);
    }

    public static enip b(enip enipVar, dubz dubzVar) {
        enin eninVar = new enin();
        enqu listIterator = enipVar.listIterator();
        while (listIterator.hasNext()) {
            ezib ezibVar = (ezib) listIterator.next();
            if (dubzVar.a(ezibVar)) {
                eninVar.c(ezibVar);
            } else {
                ((enrr) ((enrr) a.j()).h("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "filterEnabled", 811, "GellerSyncSchedulerImpl.java")).t("Corpus: %s is disabled", ezibVar.name());
            }
        }
        return eninVar.g();
    }

    private final synchronized ListenableFuture d(final String str, final String str2, final String str3, emxc emxcVar) {
        if (this.i) {
            return erqt.i(true);
        }
        enhd enhdVar = new enhd();
        enqu listIterator = b.listIterator();
        while (listIterator.hasNext()) {
            ezib ezibVar = (ezib) listIterator.next();
            Geller geller = this.d;
            String b2 = dufy.b(this.c);
            ezwl ezwlVar = ezwl.a;
            ezvp a2 = duca.a();
            eyot eyotVar = (eyot) eyoy.a.createBuilder();
            eyotVar.copyOnWrite();
            eyoy eyoyVar = (eyoy) eyotVar.instance;
            eyoyVar.b |= 1;
            eyoyVar.e = 1;
            enhdVar.k(ezibVar, elfr.k(geller.d(b2, ezibVar, (eyoy) eyotVar.build(), ezwlVar, a2), new eroh() { // from class: dufi
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    enru enruVar = dufo.a;
                    return erqt.i(Boolean.valueOf(((eypa) obj).b.size() > 0));
                }
            }, this.j));
        }
        final enhk c = enhdVar.c();
        return elfr.k(elfr.k(elfr.c(c.values()).a(new Callable() { // from class: dufu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                enhd enhdVar2 = new enhd();
                for (Map.Entry entry : ((enhk) c).entrySet()) {
                    enhdVar2.k(entry.getKey(), erqt.q((Future) entry.getValue()));
                }
                return enhdVar2.b();
            }
        }, this.q), new eroh() { // from class: duff
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                enru enruVar = dufo.a;
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (!((Boolean) entry.getValue()).booleanValue()) {
                        ((enrr) ((enrr) dufo.a.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "checkRequiredCorporaExist", 449, "GellerSyncSchedulerImpl.java")).t("Required corpus %s missing", ((ezib) entry.getKey()).name());
                        return erqt.i(false);
                    }
                }
                return erqt.i(true);
            }
        }, this.j), new eroh() { // from class: dufh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final dufo dufoVar = dufo.this;
                if (booleanValue) {
                    dufoVar.i = true;
                    return erqt.i(true);
                }
                String str4 = str3;
                return elfr.k(dufoVar.c(str, str2, str4, "geller_internal", dufo.b, 8, 4, 2, false), new eroh() { // from class: dufg
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        enqu listIterator2 = ((enhk) obj2).entrySet().listIterator();
                        while (listIterator2.hasNext()) {
                            Map.Entry entry = (Map.Entry) listIterator2.next();
                            dufs dufsVar = (dufs) entry.getValue();
                            if (!dufsVar.b().isEmpty()) {
                                ((enrr) ((enrr) dufo.a.j()).h("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "checkAndSyncRequiredCorpora", 409, "GellerSyncSchedulerImpl.java")).D("Failed to download required corpus: %s with failures %s", ((ezib) entry.getKey()).name(), dufsVar.b());
                                return erqt.i(false);
                            }
                        }
                        dufo.this.i = true;
                        return erqt.i(true);
                    }
                }, dufoVar.j);
            }
        }, this.j);
    }

    private final ListenableFuture e(final ezhr ezhrVar) {
        ListenableFuture a2;
        ListenableFuture listenableFuture;
        ArrayList arrayList = new ArrayList();
        synchronized (this.k) {
            engr engrVar = new engr();
            for (ezib ezibVar : new eygk(ezhrVar.d, ezhr.a)) {
                synchronized (this.k) {
                    if (!this.l.containsKey(ezibVar) && !this.n.containsKey(ezibVar) && !this.o.containsKey(ezibVar)) {
                        listenableFuture = erre.a;
                    } else if (this.o.containsKey(ezibVar)) {
                        listenableFuture = (ListenableFuture) this.o.get(ezibVar);
                    } else if (this.l.containsKey(ezibVar) && !this.n.containsKey(ezibVar)) {
                        listenableFuture = (ListenableFuture) this.l.get(ezibVar);
                    } else if (this.l.containsKey(ezibVar) || !this.n.containsKey(ezibVar)) {
                        ((enrr) ((enrr) a.j()).h("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "getExistingGellerSyncForBatchSync", 903, "GellerSyncSchedulerImpl.java")).r("There was a scheduling bug where 2 syncs ran concurrently for corpus: %s", ezibVar.dA);
                        listenableFuture = erre.a;
                    } else {
                        listenableFuture = (ListenableFuture) this.n.get(ezibVar);
                    }
                }
                engrVar.h(listenableFuture);
            }
            final ListenableFuture b2 = erqt.b(erqt.e(engrVar.g()), erqt.e(arrayList)).b(eldl.c(new erog() { // from class: dufl
                /* JADX WARN: Code restructure failed: missing block: B:65:0x0109, code lost:
                
                    if (r14.iterator().hasNext() == false) goto L39;
                 */
                /* JADX WARN: Type inference failed for: r10v12, types: [dwqy, java.lang.Object] */
                @Override // defpackage.erog
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        Method dump skipped, instructions count: 671
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dufl.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }), this.j);
            a2 = erqt.b(b2).a(eldl.m(new Callable() { // from class: dufm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ezhr ezhrVar2 = ezhrVar;
                    dufo dufoVar = dufo.this;
                    synchronized (dufoVar.k) {
                        dufoVar.l.keySet().removeAll(new eygk(ezhrVar2.d, ezhr.a));
                    }
                    return (Map) erqt.q(b2);
                }
            }), this.j);
        }
        return a2;
    }

    @Override // defpackage.dufd
    public final ListenableFuture a(final String str, final String str2, final String str3, final enip enipVar, final int i, emxc emxcVar) {
        return (this.e.k.size() == 0 || !enipVar.equals(enip.r(ezib.GELLER_CONFIG, ezib.PRIVACY_SETTINGS))) ? this.e.f ? elfr.k(d(str, str2, str3, emxcVar), new eroh() { // from class: dufe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return erqt.h(new GellerException(10, "Unable to download Geller required corpora.", (byte[]) null));
                }
                int i2 = i;
                enip enipVar2 = enipVar;
                String str4 = str3;
                String str5 = str2;
                String str6 = str;
                dufo dufoVar = dufo.this;
                return dufoVar.c(str6, str5, str4, null, dufo.b(enipVar2, dufy.a(dufoVar.f, null)), 2, i2, 4, true);
            }
        }, this.j) : c(str, str2, str3, null, b(enipVar, dufy.a(this.f, null)), 2, i, 4, true) : elfr.k(c(str, str2, str3, null, enipVar, 2, i, 4, true), new eroh() { // from class: dufn
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0092 A[LOOP:0: B:10:0x008c->B:12:0x0092, LOOP_END] */
            /* JADX WARN: Removed duplicated region for block: B:172:0x032a A[Catch: eygu -> 0x0333, eygu | ExecutionException -> 0x0335, TRY_ENTER, TryCatch #5 {eygu | ExecutionException -> 0x0335, blocks: (B:16:0x00ab, B:18:0x00ca, B:20:0x00d7, B:21:0x00d9, B:172:0x032a, B:173:0x0332), top: B:15:0x00ab }] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x00ca A[Catch: eygu -> 0x0333, eygu | ExecutionException -> 0x0335, TryCatch #5 {eygu | ExecutionException -> 0x0335, blocks: (B:16:0x00ab, B:18:0x00ca, B:20:0x00d7, B:21:0x00d9, B:172:0x032a, B:173:0x0332), top: B:15:0x00ab }] */
            /* JADX WARN: Removed duplicated region for block: B:99:0x02f8 A[SYNTHETIC] */
            @Override // defpackage.eroh
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r27) {
                /*
                    Method dump skipped, instructions count: 952
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dufn.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
            }
        }, this.j);
    }

    public final ListenableFuture c(String str, String str2, String str3, String str4, final enip enipVar, int i, int i2, int i3, boolean z) {
        ListenableFuture f;
        final HashMap hashMap = new HashMap();
        enqu listIterator = enipVar.listIterator();
        while (listIterator.hasNext()) {
            hashMap.put((ezib) listIterator.next(), emyg.c(this.p));
        }
        if (this.c.g() && emxe.c(str)) {
            return erqt.h(new IllegalArgumentException("Empty auth token"));
        }
        if (!this.c.g() && emxe.c(str3)) {
            return erqt.h(new IllegalArgumentException("Empty api key"));
        }
        if (enipVar.isEmpty()) {
            return erqt.i(enoz.a);
        }
        HashSet hashSet = new HashSet();
        synchronized (this.k) {
            TreeSet treeSet = new TreeSet();
            enqu listIterator2 = enipVar.listIterator();
            while (listIterator2.hasNext()) {
                ezib ezibVar = (ezib) listIterator2.next();
                if (this.m.containsKey(ezibVar)) {
                    ((enrr) ((enrr) a.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "scheduleSyncInternal", 500, "GellerSyncSchedulerImpl.java")).t("Returning existing pending sync for corpus: %s", ezibVar.name());
                    hashSet.add((ListenableFuture) this.m.get(ezibVar));
                } else if (this.l.containsKey(ezibVar)) {
                    ((enrr) ((enrr) a.h()).h("com/google/android/libraries/geller/gellersync/GellerSyncSchedulerImpl", "scheduleSyncInternal", 506, "GellerSyncSchedulerImpl.java")).t("Scheduling a pending batch sync for corpus: %s", ezibVar.name());
                    ezhq ezhqVar = (ezhq) ezhr.b.createBuilder();
                    ezhqVar.copyOnWrite();
                    ezhr ezhrVar = (ezhr) ezhqVar.instance;
                    ezibVar.getClass();
                    ezhrVar.a();
                    ezhrVar.d.h(ezibVar.dA);
                    ezhqVar.copyOnWrite();
                    ezhr ezhrVar2 = (ezhr) ezhqVar.instance;
                    ezhrVar2.f = i - 1;
                    ezhrVar2.c |= 2;
                    ezhqVar.copyOnWrite();
                    ezhr ezhrVar3 = (ezhr) ezhqVar.instance;
                    ezhrVar3.g = i2 - 1;
                    ezhrVar3.c |= 4;
                    ezhqVar.copyOnWrite();
                    ezhr ezhrVar4 = (ezhr) ezhqVar.instance;
                    ezhrVar4.h = i3 - 1;
                    ezhrVar4.c |= 8;
                    ezhqVar.copyOnWrite();
                    ezhr ezhrVar5 = (ezhr) ezhqVar.instance;
                    ezhrVar5.c |= 16;
                    ezhrVar5.i = z;
                    String b2 = emxe.b(str);
                    ezhqVar.copyOnWrite();
                    ezhr ezhrVar6 = (ezhr) ezhqVar.instance;
                    ezhrVar6.c |= 32;
                    ezhrVar6.j = b2;
                    String b3 = emxe.b(str2);
                    ezhqVar.copyOnWrite();
                    ezhr ezhrVar7 = (ezhr) ezhqVar.instance;
                    ezhrVar7.c |= 64;
                    ezhrVar7.k = b3;
                    String b4 = emxe.b(str3);
                    ezhqVar.copyOnWrite();
                    ezhr ezhrVar8 = (ezhr) ezhqVar.instance;
                    ezhrVar8.c |= 128;
                    ezhrVar8.l = b4;
                    if (str4 != null) {
                        ezhqVar.copyOnWrite();
                        ezhr ezhrVar9 = (ezhr) ezhqVar.instance;
                        ezhrVar9.c |= 1;
                        ezhrVar9.e = str4;
                    }
                    ListenableFuture e = e((ezhr) ezhqVar.build());
                    this.m.put(ezibVar, e);
                    hashSet.add(e);
                } else {
                    treeSet.add(ezibVar);
                }
            }
            if (!treeSet.isEmpty()) {
                ezhq ezhqVar2 = (ezhq) ezhr.b.createBuilder();
                ezhqVar2.copyOnWrite();
                ezhr ezhrVar10 = (ezhr) ezhqVar2.instance;
                ezhrVar10.a();
                Iterator it = treeSet.iterator();
                while (it.hasNext()) {
                    ezhrVar10.d.h(((ezib) it.next()).dA);
                }
                ezhqVar2.copyOnWrite();
                ezhr ezhrVar11 = (ezhr) ezhqVar2.instance;
                ezhrVar11.f = i - 1;
                ezhrVar11.c |= 2;
                ezhqVar2.copyOnWrite();
                ezhr ezhrVar12 = (ezhr) ezhqVar2.instance;
                ezhrVar12.g = i2 - 1;
                ezhrVar12.c |= 4;
                ezhqVar2.copyOnWrite();
                ezhr ezhrVar13 = (ezhr) ezhqVar2.instance;
                ezhrVar13.h = i3 - 1;
                ezhrVar13.c |= 8;
                ezhqVar2.copyOnWrite();
                ezhr ezhrVar14 = (ezhr) ezhqVar2.instance;
                ezhrVar14.c |= 16;
                ezhrVar14.i = z;
                String b5 = emxe.b(str);
                ezhqVar2.copyOnWrite();
                ezhr ezhrVar15 = (ezhr) ezhqVar2.instance;
                ezhrVar15.c |= 32;
                ezhrVar15.j = b5;
                String b6 = emxe.b(str2);
                ezhqVar2.copyOnWrite();
                ezhr ezhrVar16 = (ezhr) ezhqVar2.instance;
                ezhrVar16.c |= 64;
                ezhrVar16.k = b6;
                String b7 = emxe.b(str3);
                ezhqVar2.copyOnWrite();
                ezhr ezhrVar17 = (ezhr) ezhqVar2.instance;
                ezhrVar17.c |= 128;
                ezhrVar17.l = b7;
                if (str4 != null) {
                    ezhqVar2.copyOnWrite();
                    ezhr ezhrVar18 = (ezhr) ezhqVar2.instance;
                    ezhrVar18.c |= 1;
                    ezhrVar18.e = str4;
                }
                hashSet.add(e((ezhr) ezhqVar2.build()));
            }
            f = erny.f(erqt.e(hashSet), eldl.a(new emwl() { // from class: dufk
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    enhd enhdVar = new enhd();
                    for (Map map : (List) obj) {
                        for (ezib ezibVar2 : map.keySet()) {
                            enip enipVar2 = enip.this;
                            if (enipVar2.contains(ezibVar2)) {
                                Map map2 = hashMap;
                                enhdVar.k(ezibVar2, (dufs) map.get(ezibVar2));
                                emyg emygVar = (emyg) map2.get(ezibVar2);
                                if (emygVar != null) {
                                    emygVar.a(TimeUnit.MILLISECONDS);
                                }
                            }
                        }
                    }
                    return enhdVar.c();
                }
            }), this.j);
        }
        return f;
    }
}
