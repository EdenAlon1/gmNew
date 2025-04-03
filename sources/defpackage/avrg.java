package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avrg implements avrk {
    public static final entd a = entd.c("BugleRcsCapabilities");
    public final avrk b;
    public final avth c;
    public final azei d;
    public final errl e;
    private final avrk f;

    public avrg(avrk avrkVar, avrk avrkVar2, azei azeiVar, errl errlVar, avth avthVar) {
        this.b = avrkVar2;
        this.f = avrkVar;
        this.d = azeiVar;
        this.e = errlVar;
        this.c = avthVar;
    }

    @Override // defpackage.avrk
    public final elfl a(Iterable iterable) {
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getBatchCapabilities", 172, "RcsCapabilitiesBackgroundUpdater.java")).r("RcsCapabilitiesBackgroundUpdater: start getBatchCapabilities for %d chatEndpoints", enjk.b(iterable));
        elfl a2 = this.f.a(iterable);
        axnw.e(a2.i(new eroh() { // from class: avqw
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Map map = (Map) obj;
                Stream stream = Collection.EL.stream(map.entrySet());
                final avrg avrgVar = avrg.this;
                final enhk enhkVar = (enhk) stream.filter(new Predicate() { // from class: avqz
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
                        return !avrg.this.c.a((avmz) ((Map.Entry) obj2).getValue());
                    }
                }).collect(enhk.v());
                if (enhkVar.isEmpty()) {
                    return elfo.e(null);
                }
                ((ensz) avrg.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "fetchCapabilitiesInBackgroundIfInvalid", 209, "RcsCapabilitiesBackgroundUpdater.java")).u("RcsCapabilitiesBackgroundUpdater: %d of %d capabilities in batch are invalid. Starting backgroundProvider.getBatchCapabilities", enhkVar.size(), map.size());
                return avrgVar.b.a(enhkVar.keySet()).i(new eroh() { // from class: avra
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        Stream stream2 = Collection.EL.stream(((Map) obj2).entrySet());
                        final enhk enhkVar2 = enhkVar;
                        final enhk enhkVar3 = (enhk) stream2.filter(new Predicate() { // from class: avrd
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
                            public final boolean test(Object obj3) {
                                Map.Entry entry = (Map.Entry) obj3;
                                entd entdVar = avrg.a;
                                avmz avmzVar = (avmz) enhk.this.get(entry.getKey());
                                return avmzVar != null && ((avmz) entry.getValue()).b().isAfter(avmzVar.b());
                            }
                        }).collect(enhk.v());
                        ((ensz) avrg.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "fetchCapabilitiesInBackgroundIfInvalid", 231, "RcsCapabilitiesBackgroundUpdater.java")).u("RcsCapabilitiesBackgroundUpdater: %d of %d background fetch capabilities are fresher.", enhkVar3.size(), map.size());
                        if (enhkVar3.isEmpty()) {
                            return elfo.e(null);
                        }
                        avrg avrgVar2 = avrg.this;
                        return avrgVar2.d.a(new Function() { // from class: avre
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                entd entdVar = avrg.a;
                                return ((avpe) obj3).a(enhk.this);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                }, avrgVar.e);
            }
        }, this.e).e(avlo.class, new emwl() { // from class: avqx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                avlo avloVar = (avlo) obj;
                ((ensz) ((ensz) ((ensz) avrg.a.j()).g(avloVar)).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getBatchCapabilities", 186, "RcsCapabilitiesBackgroundUpdater.java")).x("Batched background capability fetch failed. Error Code '%d'. Retryable '%b'.", avloVar.b, avloVar.a);
                return null;
            }
        }, erpp.a));
        return a2;
    }

    @Override // defpackage.avrk
    public final elfl b(final awui awuiVar) {
        ((ensz) a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 84, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: start getCapabilities with chatEndpoint %s ", cskt.b(awuiVar.d));
        elfl b = this.f.b(awuiVar);
        axnw.e(b.i(new eroh() { // from class: avrb
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final avrg avrgVar = avrg.this;
                final avmz avmzVar = (avmz) obj;
                if (avrgVar.c.a(avmzVar)) {
                    ((ensz) avrg.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 96, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: valid getCapabilities %s", avmzVar);
                    return elfo.e(null);
                }
                final awui awuiVar2 = awuiVar;
                ((ensz) avrg.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 100, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: not valid capabilities %s", avmzVar);
                ((ensz) avrg.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 102, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: start backgroundProvider.getCapabilities for chatEndpoint %s", cskt.b(awuiVar2.d));
                return avrgVar.b.b(awuiVar2).i(new eroh() { // from class: avqy
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final avmz avmzVar2 = (avmz) obj2;
                        if (!avmzVar2.b().isAfter(avmzVar.b())) {
                            ((ensz) avrg.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 122, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: not valid backgroundCapabilities %s", avmzVar2);
                            return elfo.e(null);
                        }
                        final awui awuiVar3 = awuiVar2;
                        avrg avrgVar2 = avrg.this;
                        ((ensz) avrg.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 113, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: valid backgroundCapabilities %s", avmzVar2);
                        return avrgVar2.d.a(new Function() { // from class: avrf
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                entd entdVar = avrg.a;
                                return ((avpe) obj3).b(awui.this, avmzVar2);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                }, avrgVar.e);
            }
        }, this.e).e(avlo.class, new emwl() { // from class: avrc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                avlo avloVar = (avlo) obj;
                ensz enszVar = (ensz) ((ensz) ((ensz) avrg.a.j()).g(avloVar)).h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 135, "RcsCapabilitiesBackgroundUpdater.java");
                awui awuiVar2 = awui.this;
                enszVar.J("Background capability fetch for endpoint %s failed. Error Code '%d'. Retryable '%b'.", cskt.b(awuiVar2.d), Integer.valueOf(avloVar.b), Boolean.valueOf(avloVar.a));
                ((ensz) avrg.a.n().h("com/google/android/apps/messaging/shared/chatapi/capabilities/provider/RcsCapabilitiesBackgroundUpdater", "getCapabilities", 141, "RcsCapabilitiesBackgroundUpdater.java")).t("RcsCapabilitiesBackgroundUpdater: failed backgroundProvider.getCapabilities for chatEndpoint %s", cskt.b(awuiVar2.d));
                return null;
            }
        }, erpp.a));
        return b;
    }
}
