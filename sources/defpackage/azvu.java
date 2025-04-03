package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azvu {
    public static final entd a = entd.c("BugleDataModel");
    public static final cskc b = cskc.g("BugleDataModel", "SubscriptionsTracker");
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final azzp f;
    public final ffbr g;
    public final auig h;
    private final ffbr k;
    private final ffbr l;
    private volatile engw m;
    public final ReentrantLock j = new ReentrantLock();
    public final cmh i = new cmh();

    public azvu(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, azzp azzpVar, ffbr ffbrVar6, auig auigVar) {
        this.c = ffbrVar;
        this.k = ffbrVar2;
        this.d = ffbrVar3;
        this.l = ffbrVar4;
        this.e = ffbrVar5;
        this.f = azzpVar;
        this.g = ffbrVar6;
        this.h = auigVar;
    }

    static enip h() {
        enin eninVar = new enin();
        bvvn e = ParticipantsTable.e();
        e.z("SelfIdentitiesTracker#getExistingSelfSubIds");
        e.h(new Function() { // from class: azvf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                entd entdVar = azvu.a;
                bvvwVar.x(-2);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        eninVar.j(e.b().g());
        enip g = eninVar.g();
        ((ensz) a.o().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "getExistingSelfSubIds", 943, "SubscriptionsTracker.java")).t("SelfIdentitiesTracker getExistingSelfSubIds returning %s", g);
        return g;
    }

    public static String i(ctwi ctwiVar) {
        return ctwiVar.w();
    }

    public static boolean n(bvpo bvpoVar) {
        return bvpoVar.d != -2;
    }

    private final aztg o(final int i) {
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ((dtuu) this.k.b()).c("SelfParticipantsData#insertInactiveSelfParticipant", new emyl() { // from class: azvj
            @Override // defpackage.emyl
            public final Object get() {
                bvvn e = ParticipantsTable.e();
                e.z("insertInactiveSelfParticipant2");
                e.r();
                final int i2 = i;
                e.h(new Function() { // from class: azvi
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bvvw bvvwVar = (bvvw) obj;
                        entd entdVar = azvu.a;
                        bvvwVar.w(i2);
                        return bvvwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bvti bvtiVar = (bvti) e.b().o();
                try {
                    if (bvtiVar.getCount() > 0 && bvtiVar.moveToFirst()) {
                        ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) bvtiVar.cO();
                        ((ensz) azvu.a.o().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "insertInactiveSelfParticipant", 356, "SubscriptionsTracker.java")).B("SelfIdentitiesTracker insertInactiveSelfParticipant quick return participant=%s for subId=%s", bindData2.S(), i2);
                        bvtiVar.close();
                        return bindData2;
                    }
                    azvu azvuVar = azvu.this;
                    bvtiVar.close();
                    bvpp bvppVar = new bvpp();
                    bvppVar.T(i2);
                    bvppVar.S(-1);
                    bvppVar.U(0);
                    bvppVar.l(-1L);
                    azvuVar.f.e(bvppVar);
                    ParticipantsTable.BindData a2 = bvppVar.a();
                    long b2 = azvuVar.f.b(a2);
                    String[] strArr = bxth.a;
                    bxrt bxrtVar = new bxrt();
                    bxrtVar.h(i2);
                    bxrtVar.d(String.valueOf(b2));
                    bxrtVar.f(-1);
                    long a3 = azzp.a(bxrtVar.a());
                    csjb c = azvu.b.c();
                    c.I("insert inactive self participant.");
                    c.z("participantId", b2);
                    c.z("selfParticipantId", a3);
                    c.y("subId", i2);
                    c.r();
                    return a2;
                } catch (Throwable th) {
                    try {
                        bvtiVar.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        this.j.lock();
        try {
            String S = bindData.S();
            aztg aztgVar = (aztg) this.i.get(S);
            if (aztgVar == null) {
                azlb azlbVar = new azlb(bindData, ((aolr) this.l.b()).A(bindData));
                this.i.put(S, azlbVar);
                ((ensz) a.o().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "putSubscriptionIfAbsent", 406, "SubscriptionsTracker.java")).B("SelfIdentitiesTracker putSubscriptionIfAbsent adding participant=%s for subId=%s", S, azlbVar.e());
                aztgVar = azlbVar;
            }
            return aztgVar;
        } finally {
            this.j.unlock();
        }
    }

    private final void p() {
        bvvn e = ParticipantsTable.e();
        e.z("SelfIdentitiesTracker#repopulateCaches");
        e.h(new Function() { // from class: azvr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                entd entdVar = azvu.a;
                bvvwVar.x(-2);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvtg bvtgVar = ParticipantsTable.c;
        e.d(new bvvk(bvtgVar.e, false), new bvvk(bvtgVar.a, false));
        engw y = e.b().y();
        k(y);
        Stream map = Collection.EL.stream(y).filter(new Predicate() { // from class: azvs
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
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                return azvu.this.h.a() ? bindData.B() != null : bindData.A() != null;
            }
        }).map(new Function() { // from class: azvd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                return new azlc(bindData.S(), azvu.this.h.a() ? bindData.B() : bindData.A());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        this.m = (engw) map.collect(endq.a);
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "repopulateCaches", 652, "SubscriptionsTracker.java")).t("set orderedRowIdAndTokenPairs: %s", Collection.EL.stream(y).map(new Function() { // from class: azve
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                return "rowId=" + bindData.S() + " subId= " + bindData.r() + " token=" + String.valueOf(azvu.this.h.a() ? bindData.B() : bindData.A());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a));
    }

    public final aztg a(SelfIdentityId selfIdentityId) {
        aztg aztgVar;
        this.j.lock();
        if (selfIdentityId != null) {
            try {
                aztgVar = (aztg) this.i.get(selfIdentityId.b());
            } catch (Throwable th) {
                this.j.unlock();
                throw th;
            }
        } else {
            aztgVar = null;
        }
        ((ensz) a.o().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "getSubscriptionBySelfParticipantId", 253, "SubscriptionsTracker.java")).D("SelfIdentitiesTracker getSubscriptionBySelfParticipantId returning subId=%s for selfId=%s", aztgVar != null ? Integer.valueOf(aztgVar.e()) : "(null)", selfIdentityId);
        this.j.unlock();
        return aztgVar;
    }

    public final aztg b(int i) {
        aztg aztgVar;
        this.j.lock();
        try {
            int i2 = this.i.d;
            do {
                i2--;
                if (i2 < 0) {
                    this.j.unlock();
                    ((ensz) a.o().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "getSubscriptionBySubId", 278, "SubscriptionsTracker.java")).r("SubscriptionsTracker getSubscriptionBySubId did not find subId=%s in cache", i);
                    return null;
                }
                aztgVar = (aztg) this.i.g(i2);
            } while (aztgVar.e() != i);
            return aztgVar;
        } finally {
            this.j.unlock();
        }
    }

    public final aztg c() {
        ekzz f = eleg.f("loadDefaultSubscription");
        try {
            aztg e = e(((ctwb) this.c.b()).c());
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final aztg d(SelfIdentityId selfIdentityId) {
        ekzz f = eleg.f("loadSubscriptionBySelfParticipantId");
        try {
            aztg a2 = a(selfIdentityId);
            if (a2 != null) {
                f.close();
                return a2;
            }
            ((ensz) a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "loadSubscriptionBySelfParticipantId", 297, "SubscriptionsTracker.java")).t("SubscriptionsTracker#loadSubscriptionBySelfParticipantId had cache miss for self %s. Refreshing self participants", selfIdentityId);
            l();
            aztg a3 = a(selfIdentityId);
            if (a3 == null) {
                csjb e = b.e();
                e.I("Subscription does not exist.");
                e.A("selfId", selfIdentityId);
                e.r();
            }
            f.close();
            return a3;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final aztg e(int i) {
        aztg aztgVar;
        ekzz f = eleg.f("loadSubscriptionBySubId");
        try {
            aztg b2 = b(i);
            if (b2 != null) {
                f.close();
                return b2;
            }
            ((ensz) a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "loadSubscriptionBySubId", 316, "SubscriptionsTracker.java")).r("SelfParticipantsData#loadSubscriptionBySubId miss for subId=%s", i);
            if (i == -1 || ((ctwb) this.c.b()).h(i).d() != -1) {
                l();
                aztg b3 = b(i);
                if (b3 == null) {
                    csjb e = b.e();
                    e.I("Subscription is not active after refresh.");
                    e.y("subId", i);
                    e.r();
                    aztgVar = o(i);
                } else {
                    aztgVar = b3;
                }
            } else {
                csjb a2 = b.a();
                a2.I("Subscription is not active.");
                a2.y("subId", i);
                a2.r();
                aztgVar = o(i);
            }
            f.close();
            return aztgVar;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw f() {
        ekzz f = eleg.f("getActiveSubscriptions");
        try {
            this.j.lock();
            try {
                int i = this.i.d;
                SparseArray sparseArray = new SparseArray(i);
                for (int i2 = 0; i2 < i; i2++) {
                    aztg aztgVar = (aztg) this.i.g(i2);
                    if (aztgVar.i() && !aztgVar.j()) {
                        sparseArray.put(aztgVar.d(), aztgVar);
                    }
                }
                int size = sparseArray.size();
                engr d = engw.d(size + 1);
                aztg b2 = b(-1);
                if (b2 == null) {
                    b.r("cannot find subscription with DEFAULT_SELF_SUB_ID.");
                } else if (b2.i()) {
                    d.h(b2);
                }
                for (int i3 = 0; i3 < size; i3++) {
                    d.h((aztg) sparseArray.valueAt(i3));
                }
                engw g = d.g();
                ((ensz) a.o().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "getActiveSubscriptions", 233, "SubscriptionsTracker.java")).w("SelfIdentitiesTracker getActiveSelfIdentities found %s activeSubscriptions and is returning %s", sparseArray.size(), Collection.EL.stream(g).map(new Function() { // from class: azvh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Integer.valueOf(((aztg) obj).e());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.a));
                f.close();
                return g;
            } finally {
                this.j.unlock();
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final engw g() {
        if (this.m == null) {
            p();
        }
        engw engwVar = this.m;
        engwVar.getClass();
        return engwVar;
    }

    public final void j(int i) {
        emxf.l(((dtuu) this.k.b()).i());
        int i2 = 1073741824;
        do {
            i2++;
        } while (h().contains(Integer.valueOf(i2)));
        bvvr f = ParticipantsTable.f();
        f.ap("allocateNewVirtualSubId-participants");
        f.Q(i2);
        f.P(-1);
        f.am();
        if (f.a(i) > 0) {
            String[] strArr = bxth.a;
            bxte bxteVar = new bxte();
            bxteVar.ap("allocateNewVirtualSubId-selfParticipants");
            bxteVar.e(i2);
            bxteVar.d(-1);
            bxteVar.am();
            bxteVar.a(i);
            csjb c = b.c();
            c.I("Successfully allocated new virtual subId.");
            c.m(i);
            c.y("virtualSubId", i2);
            c.r();
        }
    }

    public final void k(List list) {
        this.j.lock();
        try {
            this.i.clear();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                this.i.put(bindData.S(), new azlb(bindData, ((aolr) this.l.b()).A(bindData)));
            }
            ensz enszVar = (ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "bindToTrackingMap", 135, "SubscriptionsTracker.java");
            Stream map = Collection.EL.stream(this.i.entrySet()).map(new Function() { // from class: azvg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Map.Entry entry = (Map.Entry) obj;
                    entd entdVar = azvu.a;
                    return "ParticipantId=" + ((String) entry.getKey()) + " subId=" + ((aztg) entry.getValue()).e();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            enszVar.t("SubscriptionsTracker bindToTrackingMap bound participants: %s", map.collect(endq.a));
        } finally {
            this.j.unlock();
        }
    }

    @Deprecated
    public final void l() {
        m(((ctwb) this.c.b()).m());
    }

    public final void m(final List list) {
        ekzz f = eleg.f("refreshSelfParticipantList");
        try {
            csjb a2 = b.a();
            a2.I("refreshSelfParticipantList.");
            a2.L("count", list);
            a2.r();
            ensz enszVar = (ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "refreshSelfParticipantListInternal", 500, "SubscriptionsTracker.java");
            Stream map = Collection.EL.stream(list).map(new Function() { // from class: azvm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((ctwi) obj).a());
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = engw.d;
            enszVar.t("SubscriptionsTracker#refreshSelfParticipantList(%s)", map.collect(endq.a));
            ((dtuu) this.k.b()).d("SelfParticipantsData#refreshSelfParticipantList", new Runnable() { // from class: azvn
                /* JADX WARN: Type inference failed for: r13v26, types: [aoku, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r13v28, types: [aoku, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    azvu azvuVar;
                    bxro bxroVar;
                    Object apply;
                    int e;
                    bxso bxsoVar;
                    bxro bxroVar2;
                    SparseArray sparseArray = new SparseArray();
                    enip h = azvu.h();
                    Iterator it = list.iterator();
                    while (true) {
                        azvuVar = azvu.this;
                        bxroVar = null;
                        if (!it.hasNext()) {
                            break;
                        }
                        ctwi ctwiVar = (ctwi) it.next();
                        int a3 = ctwiVar.a();
                        sparseArray.put(a3, ctwiVar);
                        if (a3 == ((ctwb) azvuVar.c.b()).c()) {
                            sparseArray.put(-1, ctwiVar);
                        }
                        final String i2 = azvu.i(ctwiVar);
                        if (TextUtils.isEmpty(i2)) {
                            ((ensz) azvu.a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "findSelfParticipantForSim", 676, "SubscriptionsTracker.java")).r("SelfIdentitiesTracker findSelfParticipantForSim cannot find SelfParticipant for subId=%s because no serial number", ctwiVar.a());
                        } else {
                            bxtc a4 = bxth.a();
                            a4.z("findSelfParticipantForSim2");
                            a4.c(new Function() { // from class: azvo
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bxtg bxtgVar = (bxtg) obj;
                                    entd entdVar = azvu.a;
                                    bxtgVar.aq(new dtrt("self_participants.sim_serial_number", 1, String.valueOf(i2)));
                                    bxtgVar.aq(new dtwe("self_participants.sub_id", 2, -1));
                                    return bxtgVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bxsoVar = (bxso) a4.b().o();
                            try {
                                if (bxsoVar.moveToFirst()) {
                                    int a5 = ctwiVar.a();
                                    while (true) {
                                        bxroVar2 = (bxro) bxsoVar.cO();
                                        if (bxroVar2.l() == a5) {
                                            break;
                                        } else if (!bxsoVar.moveToNext()) {
                                            if (bxroVar2 == null) {
                                                ((ensz) ((ensz) azvu.a.h()).h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "findSelfParticipantForSim", 711, "SubscriptionsTracker.java")).r("SelfIdentitiesTracker findSelfParticipantForSim cannot find SelfParticipant for subId=%s because no Selfs have that subId", a5);
                                            }
                                        }
                                    }
                                    bxsoVar.close();
                                    bxroVar = bxroVar2;
                                } else {
                                    ((ensz) azvu.a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "findSelfParticipantForSim", 692, "SubscriptionsTracker.java")).r("SelfIdentitiesTracker findSelfParticipantForSim cannot find SelfParticipant for subId=%s because none found in db", ctwiVar.a());
                                    bxsoVar.close();
                                }
                            } finally {
                            }
                        }
                        if (bxroVar != null) {
                            int l = bxroVar.l();
                            int a6 = ctwiVar.a();
                            if (l == a6) {
                                ((ensz) azvu.a.o().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "updateSubIdForKnownSim", 753, "SubscriptionsTracker.java")).B("SelfIdentitiesTracker updateSubIdForKnownSim no-op for SelfParticipant=%s and subId=%s because they already match", bxroVar.m(), a6);
                            } else {
                                azvuVar.j(a6);
                                csjb a7 = azvu.b.a();
                                a7.I("update subId for known SIM.");
                                a7.y("newSubId", a6);
                                a7.y("oldSubId", l);
                                a7.y("slotId", ctwiVar.d());
                                a7.A("serialNumber", bxroVar.n());
                                a7.r();
                                String[] strArr = bxth.a;
                                bxte bxteVar = new bxte();
                                bxteVar.ap("SelfIdentitiesTracker#updateSubIdForKnownSim-selfParticipants");
                                bxtg bxtgVar = new bxtg();
                                bxtgVar.aq(new dtrt("self_participants._id", 1, String.valueOf(bxroVar.m())));
                                bxteVar.g(bxtgVar);
                                bxteVar.e(a6);
                                bxteVar.am();
                                bxteVar.b().e();
                                bxroVar.az(7, "participant_id");
                                String str = bxroVar.h;
                                if (str != null) {
                                    bvvr f2 = ParticipantsTable.f();
                                    f2.ap("SelfIdentitiesTracker#updateSubIdForKnownSim-participants");
                                    bvvw bvvwVar = new bvvw();
                                    bvvwVar.k(str);
                                    f2.U(bvvwVar);
                                    f2.Q(a6);
                                    f2.am();
                                    f2.b().e();
                                    ((ensz) azvu.a.o().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "updateSubIdForKnownSim", 793, "SubscriptionsTracker.java")).B("SelfIdentitiesTracker#updateSubIdForKnownSim updated Participant=%s with subId=%s", str, a6);
                                } else {
                                    azvu.b.r("Skipped update because null self participantId.");
                                }
                            }
                        } else if (h.contains(Integer.valueOf(a3))) {
                            bxtc a8 = bxth.a();
                            a8.z("resolveSubIdConflict2");
                            bxtg bxtgVar2 = new bxtg();
                            bxtgVar2.b(a3);
                            a8.k(new bxtf(bxtgVar2));
                            bxsoVar = (bxso) a8.b().o();
                            try {
                                if (!bxsoVar.moveToFirst()) {
                                    ((ensz) ((ensz) azvu.a.h()).h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "resolveSubIdConflict", 728, "SubscriptionsTracker.java")).r("SelfIdentitiesTracker resolveSubIdConflict cannot resolve for subId=%s because no Selfs have that subId", a3);
                                } else if (!TextUtils.isEmpty(((bxro) bxsoVar.cO()).n())) {
                                    azvuVar.j(a3);
                                }
                                bxsoVar.close();
                            } finally {
                            }
                        } else {
                            continue;
                        }
                    }
                    enip h2 = azvu.h();
                    int size = sparseArray.size();
                    boolean z = false;
                    int i3 = 0;
                    while (i3 < size) {
                        int keyAt = sparseArray.keyAt(i3);
                        if (!h2.contains(Integer.valueOf(keyAt))) {
                            ctwi ctwiVar2 = (ctwi) sparseArray.valueAt(i3);
                            String i4 = azvu.i(ctwiVar2);
                            Optional empty = emxe.c(i4) ? Optional.empty() : ctwiVar2.k(z);
                            azzp azzpVar = azvuVar.f;
                            String[] strArr2 = ParticipantsTable.a;
                            bvpp bvppVar = new bvpp();
                            bvppVar.T(keyAt);
                            azsu g = ((azpl) azzpVar.c.b()).g(bvppVar.d, i4, (aoku) empty.orElse(bxroVar));
                            bvppVar.E(g);
                            ParticipantsTable.BindData c = bvppVar.c();
                            ensk h3 = azzp.a.h();
                            h3.Y(ente.a, "BugleDataModel");
                            enrr enrrVar = (enrr) h3;
                            enrrVar.Y(csux.t, Integer.valueOf(bvppVar.d));
                            enrrVar.Y(csux.u, i4);
                            enrrVar.Y(csux.w, g);
                            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/datamodel/ParticipantsColumnSetter", "buildAndInsertSelf", 132, "ParticipantsColumnSetter.java")).q("set token for new self participant");
                            String S = c.S();
                            String[] strArr3 = bxth.a;
                            bxrt bxrtVar = new bxrt();
                            bxrtVar.h(keyAt);
                            bxrtVar.d(String.valueOf(S));
                            String m = bxrtVar.c().m();
                            csjb c2 = azvu.b.c();
                            c2.I("insertSelfParticipant.");
                            c2.A("participantId", S);
                            c2.A("selfParticipantId", m);
                            c2.y("subId", keyAt);
                            c2.r();
                            ((bdsy) azvuVar.d.b()).a(4, 2);
                        }
                        i3++;
                        z = false;
                        bxroVar = null;
                    }
                    final int[] iArr = new int[size];
                    int i5 = 0;
                    while (i5 < size) {
                        int keyAt2 = sparseArray.keyAt(i5);
                        iArr[i5] = keyAt2;
                        ctwi ctwiVar3 = (ctwi) sparseArray.valueAt(i5);
                        int d = ctwiVar3.d();
                        int b2 = ctwiVar3.b();
                        String r = ctwiVar3.r();
                        bvvr f3 = ParticipantsTable.f();
                        f3.ap("updateSelfParticipantSubscriptionInfo-participants");
                        f3.ak();
                        bvvw bvvwVar2 = new bvvw();
                        bvvwVar2.w(keyAt2);
                        f3.U(bvvwVar2);
                        f3.P(d);
                        f3.R(b2);
                        f3.S(r);
                        Optional i6 = ctwiVar3.i(true);
                        if (i6.isPresent()) {
                            String l2 = i6.get().l();
                            f3.O(l2);
                            f3.H(l2);
                            f3.r(i6.get().G().a);
                        }
                        if (((Boolean) ((cfup) bdrs.b.get()).e()).booleanValue()) {
                            bdrv bdrvVar = (bdrv) azvuVar.e.b();
                            f3.am();
                            e = bdrvVar.b(f3, bdsp.d);
                        } else if (((Boolean) ((cfup) bdrs.a.get()).e()).booleanValue()) {
                            bdrv bdrvVar2 = (bdrv) azvuVar.e.b();
                            f3.am();
                            e = bdrvVar2.a(f3.b());
                        } else {
                            f3.am();
                            e = f3.b().e();
                        }
                        Optional map2 = ctwiVar3.k(true).map(new Function() { // from class: azvk
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                aoku aokuVar = (aoku) obj;
                                entd entdVar = azvu.a;
                                cfva cfvaVar = aoqm.a;
                                return ((Boolean) new emyl() { // from class: aopm
                                    @Override // defpackage.emyl
                                    public final Object get() {
                                        return Boolean.valueOf(ersy.a("bugle.enable_mi_as_self_number", "bugle"));
                                    }
                                }.get()).booleanValue() ? (String) aokuVar.c().orElse(aokuVar.j()) : aokuVar.j();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        String[] strArr4 = bxth.a;
                        bxte bxteVar2 = new bxte();
                        SparseArray sparseArray2 = sparseArray;
                        bxteVar2.ap("updateSelfParticipantSubscriptionInfo-selfParticipants");
                        bxtg bxtgVar3 = new bxtg();
                        bxtgVar3.b(keyAt2);
                        bxteVar2.g(bxtgVar3);
                        bxteVar2.d(d);
                        bxteVar2.f(b2);
                        dtub.u(bxteVar2.a, "subscription_name", r);
                        dtub.u(bxteVar2.a, "sim_serial_number", ctwiVar3.w());
                        dtub.u(bxteVar2.a, "phone_number", (String) map2.orElse(""));
                        bxteVar2.am();
                        bxteVar2.b().e();
                        if (e == 1) {
                            csjb d2 = azvu.b.d();
                            d2.I("Successfully updated self participants' subscription info for");
                            d2.y("subId", keyAt2);
                            d2.r();
                            ((bdsy) azvuVar.d.b()).a(4, 2);
                        } else {
                            csjb a9 = azvu.b.a();
                            a9.I("Didn't update self participants' subscription info for");
                            a9.y("subId", keyAt2);
                            a9.y("updateCount", e);
                            a9.r();
                            ((bdsy) azvuVar.d.b()).a(4, 3);
                        }
                        i5++;
                        sparseArray = sparseArray2;
                    }
                    bvvr f4 = ParticipantsTable.f();
                    f4.ap("SelfIdentitiesTracker#clearSelfParticipantInactiveSubscriptionInfo-participants");
                    f4.ak();
                    f4.V(new Function() { // from class: azvp
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bvvw bvvwVar3 = (bvvw) obj;
                            entd entdVar = azvu.a;
                            bvvwVar3.aq(new dtrw("participants.sub_id", 4, bvvw.au(iArr), true));
                            return bvvwVar3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    f4.P(-1);
                    f4.R(0);
                    f4.am();
                    f4.b().e();
                    String[] strArr5 = bxth.a;
                    bxte bxteVar3 = new bxte();
                    bxteVar3.ap("SelfIdentitiesTracker#clearSelfParticipantInactiveSubscriptionInfo-selfParticipants");
                    bxteVar3.ak();
                    apply = new Function() { // from class: azvq
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bxtg bxtgVar4 = (bxtg) obj;
                            entd entdVar = azvu.a;
                            bxtgVar4.aq(new dtrw("self_participants.sub_id", 4, bxtg.au(iArr), true));
                            return bxtgVar4;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }.apply(new bxtg());
                    bxteVar3.af(new bxtf((bxtg) apply));
                    bxteVar3.d(-1);
                    bxteVar3.f(0);
                    bxteVar3.am();
                    bxteVar3.b().e();
                    ((ensz) azvu.a.n().h("com/google/android/apps/messaging/shared/core/myidentity/SubscriptionsTracker", "clearSelfParticipantInactiveSubscriptionInfo", 616, "SubscriptionsTracker.java")).t("SelfIdentitiesTracker#clearSelfParticipantInactiveSubscriptionInfo cleared out subs not in %s", iArr);
                }
            });
            p();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
