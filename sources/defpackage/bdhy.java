package defpackage;

import android.content.ContentValues;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdhy extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/data/dataupgrade/DataUpgradeHandler");
    public final ffbr b;
    public final errl c;
    public final errl d;
    public final ffbr e;
    public final ffbr f;
    private final ffbr g;

    public bdhy(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errl errlVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.b = ffbrVar;
        this.g = ffbrVar2;
        this.c = errlVar;
        this.d = errlVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.f(poa.EXPONENTIAL);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("DataUpgradeHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return cetw.a.getParserForType();
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        ffbr ffbrVar = this.g;
        elfl e = elfo.e(null);
        ArrayList arrayList = new ArrayList(((Map) ffbrVar.b()).values());
        Collections.shuffle(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            final bdil bdilVar = (bdil) arrayList.get(i);
            e = e.i(new eroh() { // from class: bdhx
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final bdil bdilVar2 = bdilVar;
                    elfl b = bdilVar2.b();
                    final bdhy bdhyVar = bdhy.this;
                    return b.i(new eroh() { // from class: bdhw
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final bdhm bdhmVar = (bdhm) obj2;
                            if (bdhmVar == bdhm.DISABLED) {
                                return elfo.e(null);
                            }
                            final bdil bdilVar3 = bdilVar2;
                            final bdhy bdhyVar2 = bdhy.this;
                            return elfo.g(new Callable() { // from class: bdht
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return Optional.ofNullable(bsqp.a(bdil.this.a()));
                                }
                            }, bdhyVar2.d).i(new eroh() { // from class: bdhu
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    final Optional optional = (Optional) obj3;
                                    boolean isEmpty = optional.isEmpty();
                                    final bdil bdilVar4 = bdilVar3;
                                    boolean z = true;
                                    if (!isEmpty) {
                                        long k = ((bspr) optional.get()).k();
                                        bdilVar4.f();
                                        if (k >= 2) {
                                            z = false;
                                        }
                                    }
                                    bdhm bdhmVar2 = bdhmVar;
                                    final bdhy bdhyVar3 = bdhy.this;
                                    if (bdhmVar2 == bdhm.EXECUTE_UPGRADE && z) {
                                        ensk h = bdhy.a.h();
                                        h.Y(ente.a, "BugleDataModel");
                                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/data/dataupgrade/DataUpgradeHandler", "doUpgrade", 162, "DataUpgradeHandler.java")).t("doUpgrade for %s", bdilVar4.a());
                                        return bdilVar4.d(optional.map(new Function() { // from class: bdhr
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj4) {
                                                return Long.valueOf(((bspr) obj4).k());
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        })).i(new eroh() { // from class: bdhs
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj4) {
                                                bdil bdilVar5 = bdilVar4;
                                                if (optional.isEmpty()) {
                                                    String[] strArr = bsqp.a;
                                                    bspu bspuVar = new bspu();
                                                    bspuVar.b(bdilVar5.a());
                                                    bdilVar5.f();
                                                    bspuVar.c(2L);
                                                    bspr a2 = bspuVar.a();
                                                    final dtve b2 = bsqp.b();
                                                    dtub.b(bsqp.b(), "data_upgrade_workers", a2, new Function() { // from class: bspp
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj5) {
                                                            return Long.valueOf(dtve.this.S("data_upgrade_workers", (ContentValues) obj5));
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    }, new Consumer() { // from class: bspq
                                                        @Override // java.util.function.Consumer
                                                        /* renamed from: accept */
                                                        public final void o(Object obj5) {
                                                        }

                                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                            return Consumer$CC.$default$andThen(this, consumer);
                                                        }
                                                    });
                                                } else {
                                                    String[] strArr2 = bsqp.a;
                                                    bsqm bsqmVar = new bsqm();
                                                    bsqmVar.ap("DataUpgradeHandler#doUpgrade");
                                                    bdilVar5.f();
                                                    bsqmVar.a.put("last_update_version", (Long) 2L);
                                                    byys a3 = bdilVar5.a();
                                                    bsqo bsqoVar = new bsqo();
                                                    bsqoVar.b(a3);
                                                    if (!bsqmVar.aj(new bsqn(bsqoVar), "data_upgrade_workers-buildAndUpdateForId")) {
                                                        throw new IllegalStateException("failed to mark DataUpgrader " + bdilVar5.a().a() + " as updated");
                                                    }
                                                }
                                                bdhy bdhyVar4 = bdhy.this;
                                                ensk h2 = bdhy.a.h();
                                                h2.Y(ente.a, "BugleDataModel");
                                                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/data/dataupgrade/DataUpgradeHandler", "doUpgrade", 188, "DataUpgradeHandler.java")).t("Upgrade complete for %s", bdilVar5.a());
                                                return ((bdii) bdhyVar4.f.b()).a(bdilVar5.a(), new eroh() { // from class: bdib
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj5) {
                                                        return ((bdih) obj5).a();
                                                    }
                                                });
                                            }
                                        }, bdhyVar3.d);
                                    }
                                    if (bdhmVar2 == bdhm.EXECUTE_DOWNGRADE && optional.isPresent()) {
                                        final long k2 = ((bspr) optional.get()).k();
                                        ensk h2 = bdhy.a.h();
                                        h2.Y(ente.a, "BugleDataModel");
                                        ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/data/dataupgrade/DataUpgradeHandler", "doDowngrade", 196, "DataUpgradeHandler.java")).t("doDowngrade for %s", bdilVar4.a());
                                        return elfo.h(new erog() { // from class: bdhn
                                            @Override // defpackage.erog
                                            public final ListenableFuture a() {
                                                return ((bdii) bdhy.this.f.b()).a(bdilVar4.a(), new eroh() { // from class: bdie
                                                    @Override // defpackage.eroh
                                                    public final ListenableFuture a(Object obj4) {
                                                        return ((bdih) obj4).b();
                                                    }
                                                });
                                            }
                                        }, bdhyVar3.c).i(new eroh() { // from class: bdhp
                                            @Override // defpackage.eroh
                                            public final ListenableFuture a(Object obj4) {
                                                return bdil.this.c(k2);
                                            }
                                        }, bdhyVar3.c).h(new emwl() { // from class: bdhq
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj4) {
                                                Object apply;
                                                String[] strArr = bsqp.a;
                                                bsqg bsqgVar = new bsqg();
                                                bsqgVar.f("DataUpgradeHandler#doDowngrade");
                                                final bdil bdilVar5 = bdil.this;
                                                apply = new Function() { // from class: bdhv
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj5) {
                                                        bsqo bsqoVar = (bsqo) obj5;
                                                        bsqoVar.b(bdil.this.a());
                                                        return bsqoVar;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }.apply(new bsqo());
                                                bsqgVar.b = new bsqn((bsqo) apply);
                                                if (bsqgVar.d() != 0) {
                                                    return null;
                                                }
                                                throw new IllegalStateException("failed to delete DataUpgrader " + bdilVar5.a().a() + " after downgrade");
                                            }
                                        }, bdhyVar3.d);
                                    }
                                    if (bdhmVar2 != bdhm.WIPE_APP_DATA || !optional.isPresent()) {
                                        ensk h3 = bdhy.a.h();
                                        h3.Y(ente.a, "BugleDataModel");
                                        enrr enrrVar = (enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/datamodel/data/dataupgrade/DataUpgradeHandler", "runDataUpgradeOrDowngradeInner", 151, "DataUpgradeHandler.java");
                                        byys a2 = bdilVar4.a();
                                        String name = bdhmVar2.name();
                                        bdilVar4.f();
                                        enrrVar.J("%s not running because already up to date, upgradeCommand: %s, version: %s", a2, name, 2L);
                                        return elfo.e(null);
                                    }
                                    long k3 = ((bspr) optional.get()).k();
                                    ensk h4 = bdhy.a.h();
                                    h4.Y(ente.a, "BugleDataModel");
                                    ((enrr) ((enrr) h4).h("com/google/android/apps/messaging/shared/datamodel/data/dataupgrade/DataUpgradeHandler", "doWipe", 220, "DataUpgradeHandler.java")).t("doWipe for %s", bdilVar4.a());
                                    bdilVar4.f();
                                    ((cauy) bdhyVar3.e.b()).H(new beba(k3, 2L, k3, "upgrader " + bdilVar4.a().a() + " is WIPE_APP_DATA", null), "bugle_db");
                                    ((akxl) bdhyVar3.b.b()).f("Bugle.Datamodel.DataUpgradeHandlerWipeData.Counts", bdilVar4.a().a());
                                    return elfo.e(null);
                                }
                            }, bdhyVar2.c);
                        }
                    }, bdhyVar.c);
                }
            }, this.c);
        }
        return e.h(new emwl() { // from class: bdho
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ceyt.i();
            }
        }, this.c);
    }
}
