package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cphn implements avrk, avtc {
    public static final entd a = entd.c("BugleTachygram");
    public final errl b;
    public final cqoh c;
    public final cpsu d;
    public final chbx e;
    private final cphm f;
    private final errl g;
    private final azei h;
    private final ffbr i;

    public cphn(cphm cphmVar, errl errlVar, errl errlVar2, azei azeiVar, cqoh cqohVar, ffbr ffbrVar, cpsu cpsuVar, chbx chbxVar) {
        this.f = cphmVar;
        this.b = errlVar;
        this.g = errlVar2;
        this.h = azeiVar;
        this.c = cqohVar;
        this.i = ffbrVar;
        this.d = cpsuVar;
        this.e = chbxVar;
    }

    private final elfl f() {
        final enhk enhkVar = (enhk) Collection.EL.stream(((crgh) this.i.b()).f(crgf.c)).collect(endq.a(Function$CC.identity(), new Function() { // from class: cpgz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = ((awui) obj).d;
                cphn cphnVar = cphn.this;
                return cphnVar.e.d(str, 16).i(new eroh() { // from class: cpgs
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return ((chbu) obj2).u();
                    }
                }, cphnVar.b);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        return elfo.j(enhkVar.values()).a(eldl.m(new Callable() { // from class: cphe
            @Override // java.util.concurrent.Callable
            public final Object call() {
                enqu listIterator = enhkVar.entrySet().listIterator();
                while (listIterator.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator.next();
                    if (((Boolean) erqt.q((Future) entry.getValue())).booleanValue()) {
                        cphn cphnVar = cphn.this;
                        return cphnVar.d.a((awui) entry.getKey());
                    }
                }
                espw espwVar = espw.a;
                fedn fednVar = new fedn(Status.d);
                Status status = fednVar.a;
                status.getClass();
                throw new estd("No registered Tachygram transport", espwVar, fednVar, status);
            }
        }), this.b);
    }

    @Override // defpackage.avrk
    public final elfl a(Iterable iterable) {
        final HashSet hashSet = new HashSet();
        final HashMap hashMap = new HashMap();
        Iterable$EL.forEach(iterable, new Consumer() { // from class: cpgw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                awui awuiVar = (awui) obj;
                entd entdVar = cphn.a;
                fcek b = cpta.b(awuiVar);
                hashSet.add(b);
                hashMap.put(b.c, awuiVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return f().i(new eroh() { // from class: cpgx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl c;
                cpsz cpszVar = (cpsz) obj;
                entd entdVar = cphn.a;
                c = axol.c(cpszVar.b, ffhe.a, ffsm.a, new cpsx(cpszVar, hashSet, null));
                return c;
            }
        }, this.g).h(new emwl() { // from class: cpgy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                List list = (List) obj;
                ((ensz) ((ensz) cphn.a.h()).h("com/google/android/apps/messaging/shared/tachygram/capabilities/TachygramNetworkCapabilitiesProvider", "getBatchCapabilities", 141, "TachygramNetworkCapabilitiesProvider.java")).u("[Tachygram] %d registrations were fetched from the network for %d requested users", list.size(), hashSet.size());
                Stream stream = Collection.EL.stream(list);
                final Map map = hashMap;
                Stream filter = stream.filter(new Predicate() { // from class: cphb
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
                        entd entdVar = cphn.a;
                        return map.containsKey(((esuu) obj2).a.c);
                    }
                });
                Function function = new Function() { // from class: cphc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        entd entdVar = cphn.a;
                        awui awuiVar = (awui) map.get(((esuu) obj2).a.c);
                        awuiVar.getClass();
                        return awuiVar;
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                final cphn cphnVar = cphn.this;
                return (Map) filter.collect(endq.a(function, new Function() { // from class: cphd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return cphn.this.d((esuu) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }));
            }
        }, this.b).f(estd.class, new eroh() { // from class: cpha
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                estd estdVar = (estd) obj;
                espv espvVar = estdVar.a.c;
                entd entdVar = cphn.a;
                return elfo.d(new avlo("[Tachygram] Failed to fetch batched RCS capabilities from Tachyon", estdVar, espvVar.equals(espv.b)));
            }
        }, this.b);
    }

    @Override // defpackage.avrk
    public final elfl b(awui awuiVar) {
        final fcek b = cpta.b(awuiVar);
        return f().i(new eroh() { // from class: cphk
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl c;
                cpsz cpszVar = (cpsz) obj;
                entd entdVar = cphn.a;
                fcek fcekVar = fcek.this;
                fcekVar.getClass();
                c = axol.c(cpszVar.b, ffhe.a, ffsm.a, new cpsw(cpszVar, fcekVar, null));
                return c;
            }
        }, this.g).h(new emwl() { // from class: cphl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                esuu esuuVar = (esuu) obj;
                ((ensz) ((ensz) cphn.a.h()).h("com/google/android/apps/messaging/shared/tachygram/capabilities/TachygramNetworkCapabilitiesProvider", "getCapabilities", 105, "TachygramNetworkCapabilitiesProvider.java")).r("[Tachygram] Capabilities are fetched from the network. Size: %d", esuuVar.a().size());
                return cphn.this.d(esuuVar);
            }
        }, this.b).f(estd.class, new eroh() { // from class: cpgp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                estd estdVar = (estd) obj;
                espv espvVar = estdVar.a.c;
                entd entdVar = cphn.a;
                return elfo.d(new avlo("[Tachygram] Failed to fetch RCS capabilities from Tachyon", estdVar, espv.b.equals(espvVar)));
            }
        }, this.b);
    }

    @Override // defpackage.avtc
    public final elfl c(final awui awuiVar) {
        final fcek b = cpta.b(awuiVar);
        elfl i = f().i(new eroh() { // from class: cphf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                elfl c;
                cpsz cpszVar = (cpsz) obj;
                entd entdVar = cphn.a;
                fcek fcekVar = fcek.this;
                fcekVar.getClass();
                c = axol.c(cpszVar.b, ffhe.a, ffsm.a, new cpsv(cpszVar, fcekVar, null));
                return c;
            }
        }, this.g);
        final cphm cphmVar = this.f;
        return i.h(new emwl() { // from class: cphg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (avtb) cphm.this.fP((esut) obj);
            }
        }, this.b).i(new eroh() { // from class: cphh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final avtb avtbVar = (avtb) obj;
                boolean equals = avtb.NOT_RCS.equals(avtbVar);
                final cphn cphnVar = cphn.this;
                final awui awuiVar2 = awuiVar;
                if (equals) {
                    ((ensz) ((ensz) cphn.a.h()).h("com/google/android/apps/messaging/shared/tachygram/capabilities/TachygramNetworkCapabilitiesProvider", "getOnlineStatus", 180, "TachygramNetworkCapabilitiesProvider.java")).q("Online status NOT_RCS returned from TachygramUserTransport. Invalidating cached capabilities, if there are any.");
                    return cphnVar.e(awuiVar2, avmz.e(cphnVar.c.f())).h(new emwl() { // from class: cpgq
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = cphn.a;
                            return avtb.this;
                        }
                    }, erpp.a);
                }
                if (avtb.ONLINE.equals(avtbVar)) {
                    axnw.e(cphnVar.b(awuiVar2).i(new eroh() { // from class: cpgr
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return cphn.this.e(awuiVar2, (avmz) obj2);
                        }
                    }, cphnVar.b));
                }
                return elfo.e(avtbVar);
            }
        }, this.b).f(estd.class, new eroh() { // from class: cphi
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                entd entdVar = cphn.a;
                return elfo.d(new avta("[Tachygram] Failed to fetch online status from Tachyon", (estd) obj));
            }
        }, this.b).f(esps.class, new eroh() { // from class: cphj
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                entd entdVar = cphn.a;
                return elfo.d(new avta("[Tachygram] Failed to get an auth token during online status request", (esps) obj));
            }
        }, this.b);
    }

    public final avmz d(esuu esuuVar) {
        final avoh avohVar = (avoh) avoi.a.createBuilder();
        for (esur esurVar : esuuVar.a()) {
            final avoj avojVar = (avoj) avok.a.createBuilder();
            String str = esurVar.a;
            avojVar.copyOnWrite();
            avok avokVar = (avok) avojVar.instance;
            avokVar.b |= 1;
            avokVar.c = str;
            Optional ofNullable = Optional.ofNullable(esurVar.b);
            avojVar.getClass();
            ofNullable.ifPresent(new Consumer() { // from class: cpgt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    avoj avojVar2 = avoj.this;
                    String str2 = (String) obj;
                    avojVar2.copyOnWrite();
                    avok avokVar2 = (avok) avojVar2.instance;
                    avok avokVar3 = avok.a;
                    str2.getClass();
                    avokVar2.b |= 2;
                    avokVar2.d = str2;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            avohVar.a((avok) avojVar.build());
        }
        enin eninVar = new enin();
        Iterator it = esuuVar.b.iterator();
        while (it.hasNext()) {
            eninVar.j(((esus) it.next()).b);
        }
        enqu listIterator = eninVar.g().listIterator();
        while (listIterator.hasNext()) {
            final int intValue = ((Integer) listIterator.next()).intValue();
            Optional map = ((cgye) Collection.EL.stream(cgye.g).filter(new Predicate() { // from class: cgyd
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
                    cgye cgyeVar = cgye.NONE;
                    return ((cgye) obj).h == intValue;
                }
            }).findAny().orElse(cgye.NONE)).b().map(new Function() { // from class: cpgu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str2 = (String) obj;
                    entd entdVar = cphn.a;
                    avoj avojVar2 = (avoj) avok.a.createBuilder();
                    avojVar2.copyOnWrite();
                    avok avokVar2 = (avok) avojVar2.instance;
                    str2.getClass();
                    avokVar2.b |= 1;
                    avokVar2.c = str2;
                    return (avok) avojVar2.build();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            avohVar.getClass();
            map.ifPresent(new Consumer() { // from class: cpgv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    avoh.this.a((avok) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        int i = avmz.b;
        avml avmlVar = new avml();
        avmlVar.c((avoi) avohVar.build());
        avmlVar.b(this.c.f());
        return avmlVar.a();
    }

    public final elfl e(final awui awuiVar, final avmz avmzVar) {
        return this.h.a(new Function() { // from class: cpgo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = cphn.a;
                return ((avpe) obj).b(awui.this, avmzVar);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
