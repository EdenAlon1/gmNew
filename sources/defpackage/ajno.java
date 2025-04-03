package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajno implements avlp {
    public static final cfup a = cfvl.i(cfvl.b, "always_send_single_reg_capability_exchange_over_network", false);
    public static final cskc b = cskc.g("Bugle", "SingleRegistrationRcsContactsAdapter");
    public final ajng c;
    public final ajnh d;
    private final diij e;
    private final dkpp f;
    private final csjk g;
    private final errl h;
    private final errl i;

    public ajno(diij diijVar, dkpp dkppVar, csjk csjkVar, errl errlVar, errl errlVar2, ajng ajngVar, ajnh ajnhVar) {
        this.e = diijVar;
        this.f = dkppVar;
        this.g = csjkVar;
        this.h = errlVar;
        this.i = errlVar2;
        this.c = ajngVar;
        this.d = ajnhVar;
    }

    private final boolean d() {
        return ((ckge) this.g.a()).d() != eqwf.AVAILABLE;
    }

    @Override // defpackage.avlp
    public final ephj a(aoku aokuVar) {
        int i = 0;
        if (d()) {
            b.r("Failed to get cached last known rcs state because rcs is disabled.");
            ephh ephhVar = (ephh) ephj.a.createBuilder();
            ephhVar.copyOnWrite();
            ephj ephjVar = (ephj) ephhVar.instance;
            ephjVar.c = 1;
            ephjVar.d = 0;
            return (ephj) ephhVar.build();
        }
        try {
            i = ((Integer) this.e.a(this.f.b(), aolm.a(aokuVar)).map(new Function() { // from class: ajni
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Integer.valueOf(((dkht) obj).g);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).orElse(0)).intValue();
        } catch (diii | IllegalArgumentException e) {
            csjb e2 = b.e();
            e2.I("Error getting cached capabilities from UceProvider for getLastKnownState(). Logging error and recovering by returning a default response code for the last known state.");
            e2.y("httpResponseCode", 0);
            e2.s(e);
        }
        ephh ephhVar2 = (ephh) ephj.a.createBuilder();
        ephhVar2.copyOnWrite();
        ephj ephjVar2 = (ephj) ephhVar2.instance;
        ephjVar2.c = 1;
        ephjVar2.d = Integer.valueOf(i);
        return (ephj) ephhVar2.build();
    }

    public final Optional b(final aoku aokuVar) {
        try {
            Optional map = this.e.a(this.f.b(), aolm.a(aokuVar)).map(new Function() { // from class: ajnm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return avlk.c(ajno.this.d.a(((dkht) obj).i));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            map.ifPresent(new Consumer() { // from class: ajnn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    avlk avlkVar = (avlk) obj;
                    avlkVar.getClass();
                    ajng ajngVar = ajno.this.c;
                    Instant f = ajngVar.b.f();
                    f.getClass();
                    ajngVar.a.put(aokuVar, new ajnf(avlkVar, f));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return map;
        } catch (diii e) {
            throw new avlo("Unable to get cached capabilities from the uce provider", e);
        }
    }

    @Override // defpackage.avlp
    public final Optional c(final aoku aokuVar) {
        if (d()) {
            b.r("Failed to get cached capabilities because rcs is disabled.");
            return Optional.empty();
        }
        final ajng ajngVar = this.c;
        Optional ofNullable = Optional.ofNullable(ajngVar.a.get(aokuVar));
        final ffji ffjiVar = new ffji() { // from class: ajnc
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ajnf ajnfVar = (ajnf) obj;
                avlk avlkVar = ajnfVar.a;
                Instant instant = ajnfVar.b;
                ajng ajngVar2 = ajng.this;
                Instant f = ajngVar2.b.f();
                Object e = ajngVar2.c.e();
                e.getClass();
                return new ajne(avlkVar, f.isAfter(instant.plusSeconds(((Number) e).longValue())));
            }
        };
        Optional map = ofNullable.map(new Function() { // from class: ajnd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        map.getClass();
        if (map.isEmpty()) {
            return b(aokuVar);
        }
        if (((ajne) map.get()).b) {
            elfo.g(new Callable() { // from class: ajnj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return ajno.this.b(aokuVar);
                }
            }, this.h).e(avlo.class, new emwl() { // from class: ajnk
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ajno.b.s("Capabilities fetch from UceProvider failed", (avlo) obj);
                    return Optional.empty();
                }
            }, this.i).k(axnw.b(), erpp.a);
        }
        return map.map(new Function() { // from class: ajnl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ajne) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
