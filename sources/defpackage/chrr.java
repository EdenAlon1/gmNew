package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chrr {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/ditto/DittoResponseRebuilder");
    public final errl b;
    public final errl c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    private final ffbr h;

    public chrr(errl errlVar, errl errlVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.b = errlVar;
        this.c = errlVar2;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
    }

    public final elfl a(final eruy eruyVar) {
        final ArrayList arrayList = new ArrayList();
        Iterator<E> it = eruyVar.b.iterator();
        while (it.hasNext()) {
            arrayList.add(d((erur) it.next(), 2));
        }
        return elfo.l(arrayList).a(new Callable() { // from class: chqw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                erux eruxVar = (erux) eruy.this.toBuilder();
                eruxVar.copyOnWrite();
                ((eruy) eruxVar.instance).b = eruy.emptyProtobufList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    eruxVar.b((erur) erqt.q((elfl) it2.next()));
                }
                return (eruy) eruxVar.build();
            }
        }, this.b);
    }

    public final elfl b(final erym erymVar) {
        final ArrayList arrayList = new ArrayList();
        Iterator<E> it = erymVar.c.iterator();
        while (it.hasNext()) {
            arrayList.add(d((erur) it.next(), 2));
        }
        return elfo.l(arrayList).a(new Callable() { // from class: chrh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eryl erylVar = (eryl) erym.this.toBuilder();
                erylVar.copyOnWrite();
                ((erym) erylVar.instance).c = erym.emptyProtobufList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    erylVar.a((erur) erqt.q((elfl) it2.next()));
                }
                return (erym) erylVar.build();
            }
        }, this.b);
    }

    public final engw c(final boolean z, List list, final enip enipVar, final enip enipVar2, final enhk enhkVar) {
        Stream map = Collection.EL.stream(list).map(new Function() { // from class: chrf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                esal esalVar = (esal) obj;
                esao esaoVar = esalVar.c;
                if (esaoVar == null) {
                    esaoVar = esao.a;
                }
                enhk enhkVar2 = enhkVar;
                chrr chrrVar = chrr.this;
                aoku aokuVar = (aoku) enhkVar2.get(esaoVar);
                esak esakVar = (esak) esalVar.toBuilder();
                if (esalVar.g && z) {
                    esakVar.copyOnWrite();
                    ((esal) esakVar.instance).r = ervt.a(4);
                    esakVar.copyOnWrite();
                    ((esal) esakVar.instance).q = ervt.a(4);
                    if (((bzqa) chrrVar.g.b()).k()) {
                        esakVar.copyOnWrite();
                        ((esal) esakVar.instance).r = ervt.a(3);
                    }
                    if (((bzqa) chrrVar.g.b()).i()) {
                        esakVar.copyOnWrite();
                        ((esal) esakVar.instance).q = ervt.a(3);
                    }
                    return (esal) esakVar.build();
                }
                if (aokuVar == null || aokuVar.e().isEmpty()) {
                    return esalVar;
                }
                awui awuiVar = (awui) aokuVar.e().get();
                esakVar.copyOnWrite();
                ((esal) esakVar.instance).r = ervt.a(4);
                esakVar.copyOnWrite();
                ((esal) esakVar.instance).q = ervt.a(4);
                if (((bzqa) chrrVar.g.b()).k() && enipVar.contains(awuiVar)) {
                    esakVar.copyOnWrite();
                    ((esal) esakVar.instance).r = ervt.a(3);
                }
                if (enipVar2.contains(awuiVar)) {
                    esakVar.copyOnWrite();
                    ((esal) esakVar.instance).q = ervt.a(3);
                }
                return (esal) esakVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return (engw) map.collect(endq.a);
    }

    public final elfl d(final erur erurVar, final int i) {
        SelfIdentityId c = aqvf.c(erurVar.j);
        return (c == null ? elfo.e(Optional.empty()) : ((aqvh) this.h.b()).d(c).h(new emwl() { // from class: chqt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((Optional) obj).flatMap(new Function() { // from class: chre
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((aqux) obj2).m();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).flatMap(new Function() { // from class: chri
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((aoku) obj2).e();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, this.b)).h(new emwl() { // from class: chrb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isPresent()) {
                    chrr chrrVar = chrr.this;
                    if (((bzqa) chrrVar.g.b()).i() || ((bzqa) chrrVar.g.b()).k()) {
                        return new chqa(optional, ((bzqc) chrrVar.f.b()).e(((awui) optional.get()).d));
                    }
                }
                return new chqa(optional, elfo.e(false));
            }
        }, this.b).i(new eroh() { // from class: chrp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final chrq chrqVar = (chrq) obj;
                elfl a2 = chrqVar.a();
                final erur erurVar2 = erurVar;
                final chrr chrrVar = chrr.this;
                final int i2 = i;
                return a2.i(new eroh() { // from class: chrn
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        final Optional b = chrqVar.b();
                        final boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final erur erurVar3 = erurVar2;
                        final eygr eygrVar = erurVar3.r;
                        final chrr chrrVar2 = chrr.this;
                        elfl g = elfo.g(new Callable() { // from class: chqu
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                enhd enhdVar = new enhd();
                                for (esal esalVar : eygrVar) {
                                    esao esaoVar = esalVar.c;
                                    if (esaoVar == null) {
                                        esaoVar = esao.a;
                                    }
                                    aolr aolrVar = (aolr) chrr.this.e.b();
                                    esao esaoVar2 = esalVar.c;
                                    if (esaoVar2 == null) {
                                        esaoVar2 = esao.a;
                                    }
                                    String str = esaoVar2.c;
                                    escu escuVar = esalVar.h;
                                    if (escuVar == null) {
                                        escuVar = escu.a;
                                    }
                                    enhdVar.k(esaoVar, aolrVar.u(str, escuVar.c));
                                }
                                return enhdVar.b();
                            }
                        }, chrrVar2.c);
                        final int i3 = i2;
                        return g.i(new eroh() { // from class: chrg
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj3) {
                                final enhk enhkVar = (enhk) obj3;
                                Stream map = Collection.EL.stream(enhkVar.values()).filter(new Predicate() { // from class: chrj
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
                                    public final boolean test(Object obj4) {
                                        return ((aoku) obj4).e().isPresent();
                                    }
                                }).map(new Function() { // from class: chrk
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        return (awui) ((aoku) obj4).e().get();
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i4 = engw.d;
                                engw engwVar = (engw) map.collect(endq.a);
                                final chrr chrrVar3 = chrr.this;
                                final boolean z = booleanValue;
                                int i5 = i3;
                                final List list = eygrVar;
                                if (i5 - 1 != 0) {
                                    return ((capp) chrrVar3.d.b()).c(engwVar).h(new emwl() { // from class: chrl
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj4) {
                                            enip enipVar;
                                            Map map2 = (Map) obj4;
                                            chrr chrrVar4 = chrr.this;
                                            if (((bzqa) chrrVar4.g.b()).k()) {
                                                map2.getClass();
                                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                for (Map.Entry entry : map2.entrySet()) {
                                                    if (((E2eeInfo) entry.getValue()).a.contains(capm.b)) {
                                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                                    }
                                                }
                                                enipVar = enip.o(linkedHashMap.keySet());
                                            } else {
                                                enipVar = enpd.a;
                                            }
                                            enip enipVar2 = enipVar;
                                            map2.getClass();
                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                            for (Map.Entry entry2 : map2.entrySet()) {
                                                if (((E2eeInfo) entry2.getValue()).a.containsAll(ffdx.g(capm.b, capm.c))) {
                                                    linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                                }
                                            }
                                            return chrrVar4.c(z, list, enipVar2, enip.o(linkedHashMap2.keySet()), enhkVar);
                                        }
                                    }, chrrVar3.c);
                                }
                                Optional optional = b;
                                final capw capwVar = (capw) capz.a.createBuilder();
                                eozn eoznVar = eozn.DITTO_SYNC;
                                capwVar.copyOnWrite();
                                capz capzVar = (capz) capwVar.instance;
                                capzVar.e = eoznVar.m;
                                capzVar.b |= 1;
                                capx capxVar = (capx) capy.a.createBuilder();
                                capxVar.copyOnWrite();
                                capy capyVar = (capy) capxVar.instance;
                                capyVar.a();
                                eydl.addAll(engwVar, capyVar.b);
                                capy capyVar2 = (capy) capxVar.build();
                                capwVar.copyOnWrite();
                                capz capzVar2 = (capz) capwVar.instance;
                                capyVar2.getClass();
                                capzVar2.d = capyVar2;
                                capzVar2.c = 1;
                                return (elfl) optional.map(new Function() { // from class: chrc
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        capw capwVar2 = capwVar;
                                        awui awuiVar = (awui) obj4;
                                        capwVar2.copyOnWrite();
                                        capz capzVar3 = (capz) capwVar2.instance;
                                        capz capzVar4 = capz.a;
                                        awuiVar.getClass();
                                        capzVar3.f = awuiVar;
                                        capzVar3.b |= 2;
                                        capz capzVar5 = (capz) capwVar2.build();
                                        final chrr chrrVar4 = chrr.this;
                                        elfl b2 = ((capp) chrrVar4.d.b()).b(capzVar5);
                                        final boolean z2 = z;
                                        final List list2 = list;
                                        final enhk enhkVar2 = enhkVar;
                                        return b2.h(new emwl() { // from class: chro
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj5) {
                                                caqb caqbVar = (caqb) obj5;
                                                chrr chrrVar5 = chrr.this;
                                                return chrrVar5.c(z2, list2, ((bzqa) chrrVar5.g.b()).k() ? caqbVar == null ? enpd.a : (enip) Collection.EL.stream(caqbVar.b).filter(new Predicate() { // from class: chqy
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
                                                    public final boolean test(Object obj6) {
                                                        return new eygk(((capv) obj6).e, capv.a).contains(capu.ONE_ON_ONE_ENCRYPTION);
                                                    }
                                                }).map(new Function() { // from class: chqz
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj6) {
                                                        awui awuiVar2 = ((capv) obj6).d;
                                                        return awuiVar2 == null ? awui.a : awuiVar2;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }).collect(endq.b) : enpd.a, caqbVar == null ? enpd.a : (enip) Collection.EL.stream(caqbVar.b).filter(new Predicate() { // from class: chra
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
                                                    public final boolean test(Object obj6) {
                                                        capv capvVar = (capv) obj6;
                                                        return new eygk(capvVar.e, capv.a).contains(capu.ONE_ON_ONE_ENCRYPTION) && new eygk(capvVar.e, capv.a).contains(capu.GROUP_ENCRYPTION);
                                                    }
                                                }).map(new Function() { // from class: chqz
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj6) {
                                                        awui awuiVar2 = ((capv) obj6).d;
                                                        return awuiVar2 == null ? awui.a : awuiVar2;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }).collect(endq.b), enhkVar2);
                                            }
                                        }, chrrVar4.c);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).orElseGet(new Supplier() { // from class: chrd
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        ensk j = chrr.a.j();
                                        j.Y(ente.a, "BugleDitto");
                                        ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/net/ditto/DittoResponseRebuilder", "getE2eeCapabilitiesAndSetForParticipants", 321, "DittoResponseRebuilder.java")).q("Self identity must be provided when fetching e2ee capabilities for RCS group participants.");
                                        return elfo.e(list);
                                    }
                                });
                            }
                        }, chrrVar2.b).h(new emwl() { // from class: chqx
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                eruo eruoVar = (eruo) erur.this.toBuilder();
                                eruoVar.copyOnWrite();
                                ((erur) eruoVar.instance).r = erur.emptyProtobufList();
                                Iterator it = ((List) obj3).iterator();
                                while (it.hasNext()) {
                                    eruoVar.b((esal) it.next());
                                }
                                return (erur) eruoVar.build();
                            }
                        }, chrrVar2.b);
                    }
                }, chrrVar.b);
            }
        }, this.b);
    }
}
