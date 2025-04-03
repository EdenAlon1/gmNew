package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avpy implements avrk {
    public static final entd a = entd.c("BugleRcsCapabilities");
    public final avmb b;
    public final avrk c;
    public final avth d;
    public final Executor e;

    public avpy(avmb avmbVar, avrk avrkVar, avth avthVar, Executor executor) {
        this.b = avmbVar;
        this.c = avrkVar;
        this.d = avthVar;
        this.e = executor;
    }

    @Override // defpackage.avrk
    public final elfl a(final Iterable iterable) {
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilities", 107, "CachedCapabilitiesProvider.java")).r("CachedCapabilitiesProvider: start getBatchCapabilities for %d chatEndpoints", enjk.b(iterable));
        return this.b.b(iterable).i(new eroh() { // from class: avps
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Map map = (Map) obj;
                Stream stream = Collection.EL.stream(map.entrySet());
                final avpy avpyVar = avpy.this;
                final Map map2 = (Map) stream.filter(new Predicate() { // from class: avpu
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
                    public final boolean test(Object obj2) {
                        return avpy.this.d.a((avmz) ((Map.Entry) obj2).getValue());
                    }
                }).collect(Collectors.toMap(new Function() { // from class: avpv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (awui) ((Map.Entry) obj2).getKey();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: avpw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (avmz) ((Map.Entry) obj2).getValue();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new BinaryOperator() { // from class: avpx
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj2, Object obj3) {
                        avmz avmzVar = (avmz) obj2;
                        entd entdVar = avpy.a;
                        return avmzVar;
                    }
                }, new Supplier() { // from class: avpi
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new HashMap();
                    }
                }));
                ((ensz) avpy.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilities", 125, "CachedCapabilitiesProvider.java")).u("CachedCapabilitiesProvider: getBatchCapabilities retrieved valid capabilities for %d of %d requested users", map2.size(), map.size());
                HashSet e = enpw.e(iterable);
                e.removeAll(map2.keySet());
                if (e.isEmpty()) {
                    return elfo.e(map2);
                }
                ((ensz) avpy.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilitiesFromDelegate", 148, "CachedCapabilitiesProvider.java")).r("CachedCapabilitiesProvider: start getBatchCapabilitiesFromDelegate for %d chatEndpoints", e.size());
                return avpyVar.c.a(e).i(new eroh() { // from class: avpk
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final Map map3 = (Map) obj2;
                        ((ensz) avpy.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilitiesFromDelegate", 155, "CachedCapabilitiesProvider.java")).r("CachedCapabilitiesProvider: getCapabilitiesFromDelegate returned delegateCapabilities for %d chatEndpoints", map3.size());
                        avpy avpyVar2 = avpy.this;
                        return avpyVar2.b.c(map3).h(new emwl() { // from class: avpm
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                entd entdVar = avpy.a;
                                return map3;
                            }
                        }, avpyVar2.e);
                    }
                }, avpyVar.e).h(new emwl() { // from class: avpl
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        Map map3 = (Map) obj2;
                        ((ensz) avpy.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getBatchCapabilitiesFromDelegate", 167, "CachedCapabilitiesProvider.java")).q("CachedCapabilitiesProvider: finished inserting batch of capabilities into the cache");
                        return map3;
                    }
                }, avpyVar.e).h(new emwl() { // from class: avpj
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        Map map3 = (Map) obj2;
                        entd entdVar = avpy.a;
                        map3.putAll(map2);
                        return map3;
                    }
                }, avpyVar.e);
            }
        }, this.e);
    }

    @Override // defpackage.avrk
    public final elfl b(final awui awuiVar) {
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilities", 54, "CachedCapabilitiesProvider.java")).t("CachedCapabilitiesProvider: start getCapabilities for chatEndpoint %s", cskt.b(awuiVar.d));
        return this.b.a(awuiVar).i(new eroh() { // from class: avph
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                ((ensz) avpy.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilities", 61, "CachedCapabilitiesProvider.java")).t("CachedCapabilitiesProvider: getCapabilities result capabilitiesOptional %s", optional);
                final avpy avpyVar = avpy.this;
                final avth avthVar = avpyVar.d;
                Optional map = optional.filter(new Predicate() { // from class: avpp
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
                    public final boolean test(Object obj2) {
                        return avth.this.a((avmz) obj2);
                    }
                }).map(new Function() { // from class: avpq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return elfo.e((avmz) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final awui awuiVar2 = awuiVar;
                return (ListenableFuture) map.orElseGet(new Supplier() { // from class: avpr
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        ensz enszVar = (ensz) avpy.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilitiesFromDelegate", 76, "CachedCapabilitiesProvider.java");
                        final awui awuiVar3 = awuiVar2;
                        enszVar.t("CachedCapabilitiesProvider: start getCapabilitiesFromDelegate for chatEndpoint %s", cskt.b(awuiVar3.d));
                        final avpy avpyVar2 = avpy.this;
                        return avpyVar2.c.b(awuiVar3).i(new eroh() { // from class: avpn
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                final avmz avmzVar = (avmz) obj2;
                                ((ensz) avpy.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilitiesFromDelegate", 83, "CachedCapabilitiesProvider.java")).t("CachedCapabilitiesProvider: finish getCapabilitiesFromDelegate return delegateCapabilities %s", avmzVar);
                                avpy avpyVar3 = avpy.this;
                                return avpyVar3.b.d(awuiVar3, avmzVar).h(new emwl() { // from class: avpt
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        entd entdVar = avpy.a;
                                        return avmz.this;
                                    }
                                }, avpyVar3.e);
                            }
                        }, avpyVar2.e).h(new emwl() { // from class: avpo
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                avmz avmzVar = (avmz) obj2;
                                ((ensz) avpy.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/CachedCapabilitiesProvider", "getCapabilitiesFromDelegate", 95, "CachedCapabilitiesProvider.java")).t("CachedCapabilitiesProvider: finish inserting capabilities into the cache %s", avmzVar);
                                return avmzVar;
                            }
                        }, avpyVar2.e);
                    }
                });
            }
        }, this.e);
    }
}
