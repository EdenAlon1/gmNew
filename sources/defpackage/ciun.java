package defpackage;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciun extends ceuj {
    public static final entd a = entd.c("BugleNotifications");
    public final kno b;
    public final errl c;
    public final errl d;
    public final civj e;
    public final cixm f;
    public final ciwb g;
    public final Map h;
    public final Optional i;
    public final Optional j;
    public final ffbr k;
    public final ecrj l;
    public final cqoh m;
    public final ctvs n;
    private final Map o;
    private final cius p;
    private final ffbr q;
    private final ffbr r;

    public ciun(Map map, Context context, errl errlVar, errl errlVar2, civj civjVar, cixm cixmVar, ciwb ciwbVar, Map map2, Optional optional, Optional optional2, cius ciusVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ecrj ecrjVar, cqoh cqohVar, ctvs ctvsVar) {
        this.b = new kno(context);
        this.o = map;
        this.c = errlVar;
        this.d = errlVar2;
        this.e = civjVar;
        this.f = cixmVar;
        this.g = ciwbVar;
        this.h = map2;
        this.i = optional;
        this.j = optional2;
        this.p = ciusVar;
        this.q = ffbrVar;
        this.r = ffbrVar2;
        this.k = ffbrVar3;
        this.l = ecrjVar;
        this.m = cqohVar;
        this.n = ctvsVar;
    }

    public static ceyt k(List list) {
        ceyt i = ceyt.i();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ceyt ceytVar = (ceyt) it.next();
            if (ceytVar == ceyt.m()) {
                return ceyt.m();
            }
            if (ceytVar == ceyt.k()) {
                i = ceyt.k();
            }
        }
        return i;
    }

    @Override // defpackage.ceuj, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        Long l2 = (Long) this.q.b();
        l2.getClass();
        l.c(l2.intValue());
        Long l3 = (Long) this.r.b();
        l3.getClass();
        l.d(l3.intValue());
        if (this.b.h()) {
            ciwb ciwbVar = this.g;
            if (!ciwbVar.k(ciwbVar.f())) {
                l.b(cevc.FOREGROUND_SERVICE);
                ((ceti) l).b = this.p.a();
                return l.h();
            }
        }
        l.b(cevc.WAKELOCK);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("CreateNotificationHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ciwl.a.getParserForType();
    }

    @Override // defpackage.ceuj, defpackage.ceve
    public final String f() {
        return "shared_notification_queue_name";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ceuj
    public final elfl j(ceuw ceuwVar, engw engwVar) {
        EnumMap enumMap = new EnumMap(cixf.class);
        for (int i = 0; i < ((enou) engwVar).c; i++) {
            ciwl ciwlVar = (ciwl) engwVar.get(i);
            cixf b = cixf.b(ciwlVar.e);
            if (b == null) {
                b = cixf.NT_UNKNOWN;
            }
            List list = (List) enumMap.get(b);
            if (list == null) {
                list = new ArrayList();
            }
            list.add(ciwlVar);
            enumMap.put((EnumMap) b, (cixf) list);
        }
        engr engrVar = new engr();
        for (Map.Entry entry : enumMap.entrySet()) {
            final cixf cixfVar = (cixf) entry.getKey();
            if (this.o.containsKey(cixfVar)) {
                List list2 = (List) entry.getValue();
                if (list2.isEmpty()) {
                    ensz enszVar = (ensz) a.j();
                    enszVar.Y(cird.n, cixfVar);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "createAllNotifications", 216, "CreateNotificationHandler.java")).q("Missing inputs for notification type, not creating notification");
                } else {
                    final civa civaVar = (civa) this.o.get(cixfVar);
                    civaVar.getClass();
                    engw b2 = civaVar.c().b(engw.n(list2));
                    this.l.e(ecda.c("CreateNotificationLatency_", cixfVar));
                    elfl e = elfo.e(ceyt.i());
                    final ArrayList arrayList = new ArrayList();
                    int size = b2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        final ciwl ciwlVar2 = (ciwl) b2.get(i2);
                        e = e.i(new eroh() { // from class: citu
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj) {
                                arrayList.add((ceyt) obj);
                                final ciun ciunVar = ciun.this;
                                final cixf cixfVar2 = cixfVar;
                                final civa civaVar2 = civaVar;
                                final ciwl ciwlVar3 = ciwlVar2;
                                return ciunVar.l(civaVar2).i(new eroh() { // from class: cits
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj2) {
                                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                                        cixf cixfVar3 = cixfVar2;
                                        if (!booleanValue) {
                                            ensz enszVar2 = (ensz) ciun.a.h();
                                            enszVar2.Y(cird.n, cixfVar3);
                                            ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "createNotificationFromInputData", 296, "CreateNotificationHandler.java")).q("shouldShow=false, so not creating notification");
                                            return elfo.e(ceyt.k());
                                        }
                                        ciwl ciwlVar4 = ciwlVar3;
                                        final civa civaVar3 = civaVar2;
                                        final ciun ciunVar2 = ciun.this;
                                        elfl a2 = civaVar3.a((List) Collection.EL.stream((List) Collection.EL.stream(ciunVar2.f.c(cixfVar3)).filter(new ciuk()).collect(Collectors.toCollection(new ciuj()))).map(new Function() { // from class: citz
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                entd entdVar = ciun.a;
                                                return ((StatusBarNotification) obj3).getNotification().extras;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).collect(Collectors.toCollection(new ciuj())), civaVar3.c().c(ciwlVar4));
                                        final boolean z = ciwlVar4.f;
                                        return a2.i(new eroh() { // from class: ciuh
                                            /* JADX WARN: Code restructure failed: missing block: B:50:0x02ae, code lost:
                                            
                                                if (r3.contains(r0.get()) == false) goto L50;
                                             */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Removed duplicated region for block: B:14:0x0102  */
                                            /* JADX WARN: Removed duplicated region for block: B:17:0x0136  */
                                            @Override // defpackage.eroh
                                            /*
                                                Code decompiled incorrectly, please refer to instructions dump.
                                                To view partially-correct add '--show-bad-code' argument
                                            */
                                            public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r29) {
                                                /*
                                                    Method dump skipped, instructions count: 899
                                                    To view this dump add '--comments-level debug' option
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.ciuh.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                                            }
                                        }, ciunVar2.d);
                                    }
                                }, ciunVar.c).e(Exception.class, new emwl() { // from class: ciud
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        ((ensz) ((ensz) ((ensz) ciun.a.j()).g((Exception) obj2)).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "createNotificationFromInputData", 320, "CreateNotificationHandler.java")).q("createNotification call failed finished");
                                        cixv cixvVar = (cixv) ciun.this.k.b();
                                        cixf d = civaVar2.d();
                                        d.getClass();
                                        ((akzt) cixvVar.a.b()).e("Bugle.Notifications2o.FailedToPost.Count", d.j);
                                        return ceyt.m();
                                    }
                                }, ciunVar.c);
                            }
                        }, this.c);
                    }
                    engrVar.h(e.h(new emwl() { // from class: citv
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            List list3 = arrayList;
                            list3.add((ceyt) obj);
                            ecrj ecrjVar = ciun.this.l;
                            cixf cixfVar2 = cixfVar;
                            ceyt k = ciun.k(list3);
                            ecrjVar.g(ecda.c("CreateNotificationLatency_", cixfVar2), null, null, ecrh.SUCCESS);
                            return k;
                        }
                    }, this.c));
                }
            } else {
                ensz enszVar2 = (ensz) a.j();
                enszVar2.Y(cird.n, cixfVar);
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "createAllNotifications", 207, "CreateNotificationHandler.java")).q("No blueprint for notification type, not creating notification");
            }
        }
        final engw g = engrVar.g();
        return elfo.l(g).a(new Callable() { // from class: citw
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                entd entdVar = ciun.a;
                ArrayList arrayList2 = new ArrayList();
                int i3 = 0;
                while (true) {
                    engw engwVar2 = engw.this;
                    if (i3 >= ((enou) engwVar2).c) {
                        return ciun.k(arrayList2);
                    }
                    arrayList2.add((ceyt) erqt.q((elfl) engwVar2.get(i3)));
                    i3++;
                }
            }
        }, this.c);
    }

    public final elfl l(final civa civaVar) {
        return elfo.g(new Callable() { // from class: ciuf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ciun ciunVar = ciun.this;
                if (ciunVar.i.isPresent() && ((cvjh) ((ffbr) ciunVar.i.get()).b()).a() == 1) {
                    ((ensz) ((ensz) ciun.a.h()).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "shouldShowNotification", 661, "CreateNotificationHandler.java")).q("Notification disabled for TMO Digits-enabled wear device");
                    return false;
                }
                if (ciunVar.j.isPresent() && !((cviv) ((ffbr) ciunVar.j.get()).b()).a()) {
                    ((ensz) ((ensz) ciun.a.h()).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "shouldShowNotification", 671, "CreateNotificationHandler.java")).q("Notification disabled for wear device");
                    return false;
                }
                if (ciunVar.n.d()) {
                    return Boolean.valueOf(ciunVar.b.h());
                }
                ((ensz) ((ensz) ciun.a.h()).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "shouldShowNotification", 677, "CreateNotificationHandler.java")).q("Notification disabled as it's not default sms app");
                return false;
            }
        }, this.d).i(new eroh() { // from class: ciug
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                entd entdVar = ciun.a;
                return !((Boolean) obj).booleanValue() ? elfo.e(false) : civa.this.e();
            }
        }, erpp.a);
    }
}
