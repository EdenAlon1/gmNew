package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import java.util.EnumSet;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfwy implements cfvy {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/fcm/impl/GaiaTachyonTickleHandler");
    public final Map b;
    public final cfyo c;
    public final fazb d;
    public final cgcu e;
    public final Optional f;
    private final akzt g;
    private final cetc h;
    private final errl i;

    public cfwy(Map map, cfyo cfyoVar, akzt akztVar, fazb fazbVar, Optional optional, cetc cetcVar, cgcu cgcuVar, errl errlVar) {
        this.b = map;
        this.c = cfyoVar;
        this.g = akztVar;
        this.d = fazbVar;
        this.f = optional;
        this.h = cetcVar;
        this.e = cgcuVar;
        this.i = errlVar;
    }

    @Override // defpackage.cfvy
    public final elfl a() {
        return elfo.e(null);
    }

    @Override // defpackage.cfvy
    public final void b(long j) {
        this.g.e("Bugle.Fcm.Tickle.Downgrade.Counts", cfvw.a(4));
    }

    @Override // defpackage.cfvy
    public final void c(final fcek fcekVar, final String str, final int i, final int i2) {
        elfl c;
        this.f.isPresent();
        ensk e = a.e();
        e.Y(ente.a, "BugleGaia");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/fcm/impl/GaiaTachyonTickleHandler", "handleTickleOverride", 83, "GaiaTachyonTickleHandler.java")).q("GAIA Tachyon Tickle: Received Tickle");
        ackh ackhVar = (ackh) this.f.get();
        Object b = ackhVar.c.b();
        b.getClass();
        c = axol.c((ffsk) b, ffhe.a, ffsm.a, new ackg(ackhVar, null));
        elfl h = c.h(new emwl() { // from class: cfwv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final String str2 = str;
                final cfwy cfwyVar = cfwy.this;
                final fcek fcekVar2 = fcekVar;
                int i3 = i2;
                int i4 = i;
                if (booleanValue) {
                    ensk e2 = cfwy.a.e();
                    e2.Y(ente.a, "BugleGaia");
                    ((enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/fcm/impl/GaiaTachyonTickleHandler", "handleTickleOverride", 91, "GaiaTachyonTickleHandler.java")).q("Gaia Tachyon Tickle: Handled by override");
                    Object obj2 = cfwyVar.f.get();
                    ensk h2 = ackh.a.h();
                    h2.Y(ente.a, "DittoSatellite");
                    ((enrr) h2.h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteGaiaTachyonTickleHandlerOverride", "handleTickle", 60, "SatelliteGaiaTachyonTickleHandlerOverride.kt")).q("Satellite override handling Gaia Tachyon FCM Tickle");
                    ((ackh) obj2).b.c(fcekVar2, str2, i4, i3);
                    return null;
                }
                ensk e3 = cfwy.a.e();
                e3.Y(ente.a, "BugleGaia");
                ((enrr) ((enrr) e3).h("com/google/android/apps/messaging/shared/fcm/impl/GaiaTachyonTickleHandler", "handleTickleOverride", 96, "GaiaTachyonTickleHandler.java")).q("Gaia Tachyon Tickle: Default handling");
                if (!cfwyVar.e.a() || !fcekVar2.d.equals("GDitto")) {
                    cfwyVar.c.b(str2, fcekVar2, new emwl() { // from class: cfwt
                        @Override // defpackage.emwl
                        public final Object apply(Object obj3) {
                            return cfwy.this.d((fcek) obj3, "");
                        }
                    }, new emwl() { // from class: cfwu
                        @Override // defpackage.emwl
                        public final Object apply(Object obj3) {
                            fcek fcekVar3 = (fcek) obj3;
                            ciap ciapVar = (ciap) cfwy.this.b.get(fcekVar3.d);
                            return ciapVar == null ? elfo.d(new cfwx(fcekVar3.d)) : ciapVar.a(fcekVar3);
                        }
                    }, "GAIA", cfyo.c(i4, i3), false, false, false, false);
                    return null;
                }
                final cfwr cfwrVar = (cfwr) cfwyVar.d.b();
                final BiFunction biFunction = new BiFunction() { // from class: cfws
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return cfwy.this.d((fcek) obj3, (String) obj4);
                    }
                };
                chhj chhjVar = (chhj) cfwrVar.f.b();
                ((bzea) cfwrVar.c.b()).e(str2, i3, i4);
                if (cfwrVar.d.isEmpty()) {
                    cfwr.a.r("Ditto tickle is not supported on this device");
                    return null;
                }
                if (!((Boolean) cgcv.a.e()).booleanValue()) {
                    ((chhm) cfwrVar.d.get()).g(chhjVar);
                } else if (((bzgd) cfwrVar.g.b()).q(Optional.of(fcekVar2.c))) {
                    ((chhm) cfwrVar.d.get()).g(chhjVar);
                }
                csjb c2 = cfwr.a.c();
                c2.I("Handling firebase tickle for Ditto, ID:");
                c2.I(str2);
                c2.r();
                cfwrVar.b.c("Bugle.Ditto.FcmPush");
                elfl i5 = elfo.h(new erog() { // from class: cfwn
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        ((bzef) cfwr.this.e.b()).s();
                        return elfo.e(null);
                    }
                }, cfwrVar.h).i(new eroh() { // from class: cfwo
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj3) {
                        Object apply;
                        apply = BiFunction.this.apply(fcekVar2, str2);
                        return (ListenableFuture) apply;
                    }
                }, erpp.a);
                elfr.l(i5, new csvw(new Consumer() { // from class: cfwp
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        csjb c3 = cfwr.a.c();
                        c3.I("Successfully handled tickle with ID:");
                        c3.I(str2);
                        c3.r();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: cfwq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        csjb e4 = cfwr.a.e();
                        e4.I("Failed to handle tickle with ID:");
                        e4.I(str2);
                        e4.s((Throwable) obj3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }), erpp.a);
                elfr.l(i5, chhjVar, erpp.a);
                return null;
            }
        }, this.i);
        this.h.d(EnumSet.of(cetb.WAKELOCK), h, new Supplier() { // from class: cfww
            @Override // java.util.function.Supplier
            public final Object get() {
                return null;
            }
        });
    }

    public final elfl d(fcek fcekVar, String str) {
        ciap ciapVar = (ciap) this.b.get(fcekVar.d);
        return ciapVar == null ? elfo.d(new cfwx(fcekVar.d)) : ciapVar.f(fcekVar, str);
    }
}
