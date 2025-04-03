package com.google.android.apps.messaging.shared.datamodel.database.upgrade;

import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.a;
import defpackage.aixc;
import defpackage.aixn;
import defpackage.ausg;
import defpackage.axkl;
import defpackage.azyd;
import defpackage.azye;
import defpackage.bczy;
import defpackage.beaz;
import defpackage.beba;
import defpackage.bebb;
import defpackage.bebv;
import defpackage.becb;
import defpackage.becc;
import defpackage.brwj;
import defpackage.brww;
import defpackage.bsdi;
import defpackage.bsdr;
import defpackage.bskp;
import defpackage.bskq;
import defpackage.bskr;
import defpackage.bsnt;
import defpackage.bsob;
import defpackage.bsol;
import defpackage.bsom;
import defpackage.buxh;
import defpackage.bvar;
import defpackage.bvcy;
import defpackage.bwcy;
import defpackage.byyt;
import defpackage.cctr;
import defpackage.cfup;
import defpackage.cno;
import defpackage.coxg;
import defpackage.cpxv;
import defpackage.cqdh;
import defpackage.cqdi;
import defpackage.csgj;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.dtqv;
import defpackage.dtqy;
import defpackage.dtrx;
import defpackage.dttz;
import defpackage.dtub;
import defpackage.dtuv;
import defpackage.dtuw;
import defpackage.dtux;
import defpackage.dtve;
import defpackage.dtwe;
import defpackage.dtzz;
import defpackage.emxf;
import defpackage.emyl;
import defpackage.emyw;
import defpackage.engw;
import defpackage.enin;
import defpackage.enop;
import defpackage.enou;
import defpackage.enqu;
import defpackage.eqqh;
import defpackage.eygu;
import defpackage.ffbr;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class OnDeviceDatabaseUpgradeHandler implements bebb {
    static final int ODD_EVEN_SEMANTICS_START_POINT = 42000;
    private static final cskc log = cskc.g("BugleDataModel", "OnDeviceDatabaseUpgradeHandler");
    private final cqdi conversationCustomizer;
    private final ffbr<bczy> conversationDatabaseOperations;
    private final CustomUpgradeSteps customUpgradeSteps;
    private final dtve database;
    private final azyd databaseHelperUtils;
    private final int newVersion;
    private final int oldVersion;
    private final ffbr<coxg> syncManager;
    private final Map<dtuv, dtzz> triggerProvider;
    PriorityQueue<dtux> upgradeSteps = makeQueue();
    private final engw<Method> allManualUpgradesSteps = getAllCustomUpgradeSteps();

    public OnDeviceDatabaseUpgradeHandler(CustomUpgradeSteps customUpgradeSteps, ffbr<coxg> ffbrVar, Map<String, dtux> map, ffbr<bczy> ffbrVar2, azye azyeVar, cqdi cqdiVar, Map<dtuv, dtzz> map2, dtve dtveVar, dttz dttzVar, int i, int i2) {
        this.customUpgradeSteps = customUpgradeSteps;
        this.syncManager = ffbrVar;
        this.conversationDatabaseOperations = ffbrVar2;
        this.triggerProvider = map2;
        this.databaseHelperUtils = azyeVar.a(dttzVar);
        this.conversationCustomizer = cqdiVar;
        this.database = dtveVar;
        this.oldVersion = i;
        this.newVersion = i2;
        filterUpgradesForDatabase(map, dttzVar.f()).filter(new Predicate() { // from class: bebs
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
                boolean e;
                e = ((dtux) obj).e();
                return e;
            }
        }).forEach(new Consumer() { // from class: bebt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                OnDeviceDatabaseUpgradeHandler.this.lambda$new$1((dtux) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    private static int checkAndUpdateVersion(int i, int i2) {
        if (i >= i2) {
            return i2;
        }
        throw new beba(-1L, i2, i, "missing upgrade handler", null);
    }

    public static Stream<dtux> filterUpgradesForDatabase(Map<String, dtux> map, final String str) {
        return Collection.EL.stream(map.entrySet()).filter(new Predicate() { // from class: bebc
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
                boolean startsWith;
                startsWith = ((String) ((Map.Entry) obj).getKey()).startsWith(String.valueOf(str).concat("+"));
                return startsWith;
            }
        }).map(new Function() { // from class: bebn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return OnDeviceDatabaseUpgradeHandler.lambda$filterUpgradesForDatabase$1((Map.Entry) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    private static List<Method> getAfterGeneratedUpgradeMethods(engw<Method> engwVar) {
        return (List) Collection.EL.stream(engwVar).filter(new Predicate() { // from class: bebu
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
                boolean a;
                a = ((beaz) OnDeviceDatabaseUpgradeHandler.getAnnotationOrThrow((Method) obj, beaz.class)).a();
                return a;
            }
        }).collect(Collectors.toCollection(new bebv()));
    }

    private static engw<Method> getAllCustomUpgradeSteps() {
        ArrayList arrayList = new ArrayList();
        for (Method method : CustomUpgradeSteps.class.getDeclaredMethods()) {
            if (method.getName().startsWith("upgradeToVersion")) {
                if (method.getReturnType() != Void.TYPE) {
                    throw new IllegalStateException("method " + method.getName() + " should return void");
                }
                if (method.getParameterTypes().length != 1) {
                    throw new IllegalStateException("method " + method.getName() + " should take a single DatabaseWrapper parameter");
                }
                if (method.getParameterTypes()[0] != dtve.class) {
                    throw new IllegalStateException("method " + method.getName() + " should take a single DatabaseInterface parameter");
                }
                if (Modifier.isStatic(method.getModifiers())) {
                    throw new IllegalStateException("method " + method.getName() + " should not be static");
                }
                emyw.e((beaz) getAnnotationOrThrow(method, beaz.class));
                arrayList.add(method);
            }
        }
        emxf.m(arrayList.size() > 0, "didn't find any upgrade methods; check proguard config");
        return engw.E(new Comparator() { // from class: bebw
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return OnDeviceDatabaseUpgradeHandler.lambda$getAllCustomUpgradeSteps$0((Method) obj, (Method) obj2);
            }
        }, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends Annotation> T getAnnotationOrThrow(Method method, Class<T> cls) {
        T t = (T) method.getAnnotation(cls);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("expected annotation of type ".concat(String.valueOf(String.valueOf(cls))));
    }

    private static List<Method> getUpgradeMethods(engw<Method> engwVar) {
        return (List) Collection.EL.stream(engwVar).filter(new Predicate() { // from class: bebx
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
                return OnDeviceDatabaseUpgradeHandler.lambda$getUpgradeMethods$0((Method) obj);
            }
        }).collect(Collectors.toCollection(new bebv()));
    }

    private Runnable getUpgradeRunnable(final int i, final List<dtuw> list, final boolean z) {
        return new Runnable() { // from class: bebr
            @Override // java.lang.Runnable
            public final void run() {
                OnDeviceDatabaseUpgradeHandler.this.lambda$getUpgradeRunnable$0(z, i, list);
            }
        };
    }

    private boolean isCurrentThreadInTransaction() {
        return this.database.I();
    }

    public static /* synthetic */ dtux lambda$filterUpgradesForDatabase$1(Map.Entry entry) {
        return (dtux) entry.getValue();
    }

    public static /* synthetic */ int lambda$getAllCustomUpgradeSteps$0(Method method, Method method2) {
        return versionForMethod(method) - versionForMethod(method2);
    }

    public static /* synthetic */ boolean lambda$getUpgradeMethods$0(Method method) {
        return !((beaz) getAnnotationOrThrow(method, beaz.class)).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getUpgradeRunnable$0(boolean z, int i, List list) {
        if (z) {
            emxf.l(!azyd.i(this.database));
        }
        try {
            this.database.j().setVersion(i);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dtuw) it.next()).a().run();
            }
        } catch (Exception e) {
            throw new beba(a.h(i, "failed upgrade step "), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getUpgradeSteps$0(List list, int i) {
        boolean anyMatch = Collection.EL.stream(list).anyMatch(new Predicate() { // from class: bebg
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
                return ((dtuw) obj).b();
            }
        });
        emxf.m(!isCurrentThreadInTransaction(), "cannot modify foreign keys enabled while in a transaction");
        if (anyMatch) {
            this.database.y("PRAGMA FOREIGN_KEYS = 0");
            emxf.l(!azyd.i(this.database));
        }
        final Runnable upgradeRunnable = getUpgradeRunnable(i, list, anyMatch);
        try {
            final int version = this.database.j().getVersion();
            this.database.A("OnDeviceDatabaseUpgradeHandler#getUpgradeSteps", new Runnable() { // from class: bebh
                @Override // java.lang.Runnable
                public final void run() {
                    OnDeviceDatabaseUpgradeHandler.this.lambda$getUpgradeSteps$1(version, upgradeRunnable);
                }
            });
            emxf.m(!isCurrentThreadInTransaction(), "cannot modify foreign keys enabled while in a transaction");
            if (anyMatch) {
                this.database.y("PRAGMA FOREIGN_KEYS = 1");
            }
        } catch (Throwable th) {
            emxf.m(!isCurrentThreadInTransaction(), "cannot modify foreign keys enabled while in a transaction");
            if (anyMatch) {
                this.database.y("PRAGMA FOREIGN_KEYS = 1");
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getUpgradeSteps$1(int i, Runnable runnable) {
        if (i != this.database.j().getVersion()) {
            throw new becc("current version changed after entering transaction -- check for a second process running upgrade steps");
        }
        runnable.run();
    }

    public static /* synthetic */ bskq[] lambda$loadConversationCustomization$0(bskp bskpVar) {
        return new bskq[]{bskpVar.b, bskpVar.q, bskpVar.E, bskpVar.G, bskpVar.F, bskpVar.N, bskpVar.M};
    }

    public static /* synthetic */ bsol lambda$loadConversationCustomization$1(bsol bsolVar) {
        bsolVar.b(new Function() { // from class: bebk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar2 = (bsol) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$2(bsolVar2);
                return bsolVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bebl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar2 = (bsol) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$3(bsolVar2);
                return bsolVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bebm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar2 = (bsol) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$4(bsolVar2);
                return bsolVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bebo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar2 = (bsol) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$5(bsolVar2);
                return bsolVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: bebp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar2 = (bsol) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$6(bsolVar2);
                return bsolVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bsolVar;
    }

    public static /* synthetic */ bsol lambda$loadConversationCustomization$2(bsol bsolVar) {
        bsolVar.d(byyt.UNARCHIVED);
        return bsolVar;
    }

    public static /* synthetic */ bsol lambda$loadConversationCustomization$3(bsol bsolVar) {
        bsolVar.aq(new dtwe("conversations.notification_enabled", 1, 0));
        return bsolVar;
    }

    public static /* synthetic */ bsol lambda$loadConversationCustomization$4(bsol bsolVar) {
        bsolVar.aq(new dtwe("conversations.notification_vibration", 1, 0));
        return bsolVar;
    }

    public static /* synthetic */ bsol lambda$loadConversationCustomization$5(bsol bsolVar) {
        bsolVar.aq(new dtrx("conversations.notification_sound_uri", 6));
        return bsolVar;
    }

    public static /* synthetic */ bsol lambda$loadConversationCustomization$6(bsol bsolVar) {
        bsolVar.j(2);
        return bsolVar;
    }

    public static /* synthetic */ int lambda$makeQueue$0(dtux dtuxVar, dtux dtuxVar2) {
        int a = dtuxVar.a();
        int a2 = dtuxVar2.a();
        return a != a2 ? a - a2 : dtuxVar.b() != dtuxVar2.b() ? dtuxVar.b() - dtuxVar2.b() : TextUtils.equals(dtuxVar.d(), dtuxVar2.d()) ? dtuxVar.d().compareTo(dtuxVar2.d()) : dtuxVar.hashCode() - dtuxVar2.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(dtux dtuxVar) {
        this.upgradeSteps.offer(dtuxVar);
    }

    public static /* synthetic */ void lambda$rebuildTriggers$1(dtve dtveVar, Map.Entry entry) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$rebuildViewsUpgradeStep$0(int i, int i2) {
        if (i == azyd.b(this.database.l())) {
            emxf.l(this.database.j().getVersion() == i2);
            if (((dtqy) this.database.l()).b.equals("$primary")) {
                rebuildViews(this.database);
                rebuildTriggers(this.database);
            }
            this.database.j().setVersion(i);
        } else {
            this.database.j().setVersion(i2);
        }
        return Integer.valueOf(i);
    }

    private static cno<cqdh> loadConversationCustomization() {
        cno<cqdh> cnoVar = new cno<>();
        bsob e = bsom.e();
        e.z("loadConversationCustomization");
        e.f(new Function() { // from class: bebi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$0((bskp) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.i(new Function() { // from class: bebj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                OnDeviceDatabaseUpgradeHandler.lambda$loadConversationCustomization$1(bsolVar);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bskr bskrVar = (bskr) e.b().o();
        while (bskrVar.moveToNext()) {
            try {
                cnoVar.f(cpxv.a(bskrVar.k()), new cqdh(bskrVar.j(), !bskrVar.w(), !bskrVar.x(), bskrVar.r(), bskrVar.e(), bskrVar.f()));
            } finally {
            }
        }
        bskrVar.close();
        return cnoVar;
    }

    static PriorityQueue<dtux> makeQueue() {
        return new PriorityQueue<>(50, new Comparator() { // from class: beby
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return OnDeviceDatabaseUpgradeHandler.lambda$makeQueue$0((dtux) obj, (dtux) obj2);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void precheck(int i, int i2, dtve dtveVar) {
        engw engwVar = ((dtqy) dtveVar.l()).f;
        int i3 = ((enou) engwVar).c;
        int i4 = 0;
        while (i4 < i3) {
            enop enopVar = (enop) engwVar.get(i4);
            i4++;
            if (enopVar.a(Integer.valueOf(i))) {
                long j = i;
                throw new beba(j, i2, j, "oldVersion is in invalid range:" + enopVar.b.b().toString() + ":" + enopVar.c.b().toString(), null);
            }
        }
    }

    private void rebuildAvatars() {
        cskc cskcVar = log;
        cskcVar.p("begin rebuildAvatars.");
        ((bczy) this.conversationDatabaseOperations.b()).O();
        cskcVar.p("completed rebuildAvatars.");
    }

    private void rebuildTriggers(final dtve dtveVar) {
        azyd.d(dtveVar.j());
        if (((dtqy) dtveVar.l()).b.equals("$primary")) {
            int i = 0;
            if (ausg.a()) {
                String[] strArr = azyd.f;
                int length = strArr.length;
                while (i < 13) {
                    dtveVar.y(strArr[i]);
                    i++;
                }
            } else {
                String[] strArr2 = azyd.e;
                int length2 = strArr2.length;
                while (i < 16) {
                    dtveVar.y(strArr2[i]);
                    i++;
                }
            }
        }
        azyd.g(dtveVar);
        azyd azydVar = this.databaseHelperUtils;
        try {
            if (csgj.a() ? axkl.g(azydVar.r.c()) : azydVar.r.ak()) {
                enin eninVar = new enin();
                Iterator it = ((Set) azydVar.q.b()).iterator();
                while (it.hasNext()) {
                    eninVar.j(((cctr) it.next()).a());
                }
                enqu listIterator = eninVar.g().listIterator();
                while (listIterator.hasNext()) {
                    dtveVar.y((String) listIterator.next());
                }
            }
        } catch (eygu e) {
            azyd.l.s("Can't process(rebuild/skip) CMS triggers: unable to decide CMS status", e);
        }
        if (((Boolean) aixc.a.e()).booleanValue()) {
            String[] strArr3 = bvar.a;
            dtveVar.y(aixn.a("smarts_personalization_decayed_feature_values", bvar.c.b.toString()));
            String[] strArr4 = bvcy.a;
            dtveVar.y(aixn.a("smarts_personalization_normalized_feature_values", bvcy.b.a.toString()));
        }
        Collection.EL.stream(this.triggerProvider.entrySet()).filter(new Predicate() { // from class: bebe
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
                boolean equals;
                equals = ((dtuv) ((Map.Entry) obj).getKey()).b().equals(((dtqy) dtve.this.l()).b);
                return equals;
            }
        }).forEach(new Consumer() { // from class: bebf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                OnDeviceDatabaseUpgradeHandler.lambda$rebuildTriggers$1(dtve.this, (Map.Entry) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    static void rebuildViews(dtve dtveVar) {
        azyd.e(dtveVar.j());
        azyd.f(dtveVar);
    }

    private emyl<Integer> rebuildViewsUpgradeStep(final int i, final int i2) {
        return new emyl() { // from class: bebd
            @Override // defpackage.emyl
            public final Object get() {
                Integer lambda$rebuildViewsUpgradeStep$0;
                lambda$rebuildViewsUpgradeStep$0 = OnDeviceDatabaseUpgradeHandler.this.lambda$rebuildViewsUpgradeStep$0(i, i2);
                return lambda$rebuildViewsUpgradeStep$0;
            }
        };
    }

    private void startSafeResync() {
        cskc cskcVar = log;
        cskcVar.p("begin startSafeResync.");
        cno<cqdh> loadConversationCustomization = loadConversationCustomization();
        String[] strArr = PartsTable.a;
        new bwcy().d();
        String[] strArr2 = MessagesTable.a;
        new buxh().d();
        String[] strArr3 = brww.a;
        new brwj().d();
        String[] strArr4 = bsdr.a;
        new bsdi().d();
        String[] strArr5 = bsom.a;
        new bsnt().d();
        if (((Boolean) ((cfup) coxg.a.get()).e()).booleanValue()) {
            this.conversationCustomizer.a = loadConversationCustomization;
        } else {
            ((coxg) this.syncManager.b()).o(loadConversationCustomization);
        }
        if (((Boolean) ((cfup) coxg.a.get()).e()).booleanValue()) {
            ((coxg) this.syncManager.b()).k(eqqh.DATABASE_UPGRADE_RESYNC);
        } else {
            ((coxg) this.syncManager.b()).n();
        }
        cskcVar.p("completed startSafeResync.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int versionForMethod(Method method) {
        try {
            return Integer.parseInt(method.getName().substring(16));
        } catch (NumberFormatException e) {
            csjb b = log.b();
            b.I("invalid upgrade method: ");
            b.I(method.getName());
            b.r();
            throw new beba("invalid upgrade method: ".concat(String.valueOf(String.valueOf(method))), e);
        }
    }

    int applyUpdatesCurrentVersion(int i, PriorityQueue<dtux> priorityQueue) {
        return applyUpdatesCurrentVersion(i, priorityQueue, Alert.DURATION_SHOW_INDEFINITELY);
    }

    public int applyUpgrades(int i, int i2) {
        becb becbVar = new becb(this, false, getUpgradeMethods(this.allManualUpgradesSteps));
        becb becbVar2 = new becb(this, true, getAfterGeneratedUpgradeMethods(this.allManualUpgradesSteps));
        this.upgradeSteps.offer(becbVar);
        this.upgradeSteps.offer(becbVar2);
        try {
            int applyUpdatesCurrentVersion = applyUpdatesCurrentVersion(i, this.upgradeSteps, i2);
            this.upgradeSteps.remove(becbVar);
            this.upgradeSteps.remove(becbVar2);
            checkAndUpdateVersion(applyUpdatesCurrentVersion, i2);
            return i2;
        } catch (Throwable th) {
            this.upgradeSteps.remove(becbVar);
            this.upgradeSteps.remove(becbVar2);
            throw th;
        }
    }

    public void doFinalDataUpgradeWithExceptions(int i, int i2) {
        if (i != 20055) {
            if (enop.d(20000, 21000).a(Integer.valueOf(i)) || (i >= 21000 && i <= 21010)) {
                startSafeResync();
                log.p("Applying startSafeResync to fix foreign keys.");
            }
            if (i == 22000) {
                rebuildAvatars();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[Catch: all -> 0x006f, TryCatch #2 {all -> 0x006f, blocks: (B:13:0x003c, B:16:0x004c, B:20:0x0047), top: B:12:0x003c, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void doSchemaUpgradeWithExceptions() {
        /*
            r7 = this;
            int r0 = r7.oldVersion
            int r1 = r7.newVersion
            dtve r2 = r7.database
            dtzf r3 = r2.P()
            precheck(r0, r1, r2)
            int r1 = r7.oldVersion
            int r2 = r7.newVersion
            if (r1 != r2) goto L14
            return
        L14:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.io.IOException -> L79
            java.util.concurrent.atomic.AtomicReference r2 = r3.a     // Catch: java.io.IOException -> L79
            java.lang.Object r2 = r2.get()     // Catch: java.io.IOException -> L79
            java.lang.Thread r2 = (java.lang.Thread) r2     // Catch: java.io.IOException -> L79
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L29
            if (r2 != r1) goto L27
            goto L29
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = r5
        L2a:
            defpackage.emxf.l(r2)     // Catch: java.io.IOException -> L79
            java.util.concurrent.atomic.AtomicReference r2 = r3.a     // Catch: java.io.IOException -> L79
            r2.set(r1)     // Catch: java.io.IOException -> L79
            java.util.concurrent.atomic.AtomicInteger r1 = r3.b     // Catch: java.io.IOException -> L79
            r1.incrementAndGet()     // Catch: java.io.IOException -> L79
            dtze r1 = new dtze     // Catch: java.io.IOException -> L79
            r1.<init>()     // Catch: java.io.IOException -> L79
            int r2 = r7.newVersion     // Catch: java.lang.Throwable -> L6f
            int r3 = r2 + (-1)
            r6 = 42000(0xa410, float:5.8855E-41)
            if (r2 >= r6) goto L47
        L45:
            r4 = r5
            goto L4c
        L47:
            int r2 = r3 % 2
            if (r2 != 0) goto L4c
            goto L45
        L4c:
            defpackage.emxf.l(r4)     // Catch: java.lang.Throwable -> L6f
            r7.applyUpgrades(r0, r3)     // Catch: java.lang.Throwable -> L6f
            int r0 = r7.newVersion     // Catch: java.lang.Throwable -> L6f
            emyl r0 = r7.rebuildViewsUpgradeStep(r0, r3)     // Catch: java.lang.Throwable -> L6f
            dtve r2 = r7.database     // Catch: java.lang.Throwable -> L6f
            java.lang.String r3 = "OnDeviceDatabaseUpgradeHandler#doSchemaUpgradeWithExceptions"
            java.lang.Object r0 = r2.r(r3, r0)     // Catch: java.lang.Throwable -> L6f
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L6f
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L6f
            int r2 = r7.newVersion     // Catch: java.lang.Throwable -> L6f
            checkAndUpdateVersion(r0, r2)     // Catch: java.lang.Throwable -> L6f
            r1.close()     // Catch: java.io.IOException -> L79
            return
        L6f:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L74
            goto L78
        L74:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> L79
        L78:
            throw r0     // Catch: java.io.IOException -> L79
        L79:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.database.upgrade.OnDeviceDatabaseUpgradeHandler.doSchemaUpgradeWithExceptions():void");
    }

    public void doUpgradeWithExceptions() {
        cskc cskcVar = log;
        csjb c = cskcVar.c();
        c.I("Beginning schema upgrade.");
        c.y("oldVersion", this.oldVersion);
        c.y("newVersion", this.newVersion);
        c.r();
        doSchemaUpgradeWithExceptions();
        csjb c2 = cskcVar.c();
        c2.I("Beginning data upgrade.");
        c2.y("oldVersion", this.oldVersion);
        c2.y("newVersion", this.newVersion);
        c2.r();
        doFinalDataUpgradeWithExceptions(this.oldVersion, this.newVersion);
    }

    public PriorityQueue<dtux> getUpgradeSteps() {
        return this.upgradeSteps;
    }

    @Override // defpackage.bebb
    public void onDowngrade() {
        try {
            if (((dtqy) this.database.l()).e) {
                csjb e = log.e();
                e.I("Ignoring database downgrade");
                e.A("db handle", ((dtqy) this.database.l()).b);
                e.y("oldVersion", this.oldVersion);
                e.y("newVersion", this.newVersion);
                e.r();
                return;
            }
        } catch (Throwable th) {
            log.s("Failed to ignore DB downgrade", th);
        }
        csjb b = log.b();
        b.I("Database downgrade requested forcing db rebuild!");
        b.y("oldVersion", this.oldVersion);
        b.y("newVersion", this.newVersion);
        b.r();
        throw new beba(this.oldVersion, this.newVersion, -1L, "onDowngrade not supported", null);
    }

    @Override // defpackage.bebb
    public void onUpgrade() {
        cskc cskcVar = log;
        csjb c = cskcVar.c();
        c.I("Database upgrade started.");
        c.y("oldVersion", this.oldVersion);
        c.y("newVersion", this.newVersion);
        c.r();
        if (this.oldVersion != this.newVersion) {
            try {
                if (!((dtqv) dtub.c).k) {
                    throw new becc("not primary process");
                }
                doUpgradeWithExceptions();
                cskcVar.p("Finished database upgrade");
            } catch (Exception e) {
                if (e instanceof becc) {
                    throw e;
                }
                csjb b = log.b();
                b.I("Failed to perform db upgrade.");
                b.y("oldVersion", this.oldVersion);
                b.y("newVersion", this.newVersion);
                b.s(e);
                throw new beba(this.oldVersion, this.newVersion, this.database.j().getVersion(), "failed in doUpgradeWithExceptions", e);
            }
        }
    }

    private Runnable getUpgradeSteps(final int i, PriorityQueue<dtux> priorityQueue) {
        dtux peek;
        final ArrayList arrayList = new ArrayList();
        do {
            peek = priorityQueue.peek();
            if (peek == null || peek.a() != i) {
                break;
            }
            arrayList.add(peek.c(this.database));
            priorityQueue.poll();
            if (peek.e()) {
                priorityQueue.offer(peek);
            }
        } while (!peek.f());
        return new Runnable() { // from class: bebq
            @Override // java.lang.Runnable
            public final void run() {
                OnDeviceDatabaseUpgradeHandler.this.lambda$getUpgradeSteps$0(arrayList, i);
            }
        };
    }

    public int applyUpdatesCurrentVersion(int i, PriorityQueue<dtux> priorityQueue, int i2) {
        int a;
        while (true) {
            dtux peek = priorityQueue.peek();
            if (peek != null && (a = peek.a()) <= i2) {
                Runnable upgradeSteps = getUpgradeSteps(a, priorityQueue);
                if (a <= i) {
                    log.p(a.h(i, "Ignoring upgrade database to version (already past that) "));
                } else {
                    cskc cskcVar = log;
                    cskcVar.p(a.h(a, "Upgrading database to version "));
                    upgradeSteps.run();
                    cskcVar.p(a.h(a, "Upgraded database to version "));
                    i = a;
                }
            }
        }
        return i;
    }
}
