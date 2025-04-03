package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acku implements cfvy {
    public static final entd a = entd.c("BugleSatelliteBg");
    public final akzt b;
    public final actk c;
    public final acuq d;
    public final errl e;
    public final acjc f;
    public final ffbr g;
    private final cfvu h;
    private final ffbr i;

    public acku(akzt akztVar, cfvu cfvuVar, ffbr ffbrVar, actk actkVar, acuq acuqVar, errl errlVar, acjc acjcVar, ffbr ffbrVar2) {
        this.b = akztVar;
        this.h = cfvuVar;
        this.i = ffbrVar;
        this.c = actkVar;
        this.d = acuqVar;
        this.e = errlVar;
        this.f = acjcVar;
        this.g = ffbrVar2;
    }

    private final elfl d(final acua acuaVar) {
        if (!this.d.h(acuaVar)) {
            return elfo.e(esms.UNKNOWN);
        }
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "checkDittoHealthForHostType", 223, "SatelliteTachyonTickleHandler.java")).t("Querying %s Ditto for Health Status", acuaVar);
        actj a2 = this.c.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a2.b = 500L;
        a2.c = timeUnit;
        a2.d = false;
        esni esniVar = (esni) esnk.a.createBuilder();
        eyex eyexVar = eyex.a;
        esniVar.copyOnWrite();
        esnk esnkVar = (esnk) esniVar.instance;
        eyexVar.getClass();
        esnkVar.c = eyexVar;
        esnkVar.b = 209;
        return a2.b(acuaVar, (esnk) esniVar.build()).h(new emwl() { // from class: ackl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                esnn esnnVar = (esnn) obj;
                entd entdVar = acku.a;
                int i = (esnnVar.b == 209 ? (esmt) esnnVar.c : esmt.a).b;
                esms esmsVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : esms.INCOMING_CHANNEL_DISCONNECTED : esms.INCOMING_CHANNEL_CONNECTED : esms.NOT_AUTHENTICATED : esms.UNKNOWN;
                return esmsVar == null ? esms.UNRECOGNIZED : esmsVar;
            }
        }, this.e).e(acvb.class, new emwl() { // from class: ackm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) ((ensz) acku.a.j()).g((acvb) obj)).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "checkDittoHealthForHostType", 241, "SatelliteTachyonTickleHandler.java")).t("Could not query %s ditto health; channel not open", acua.this);
                return esms.UNKNOWN;
            }
        }, this.e).e(acth.class, new emwl() { // from class: ackn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) ((ensz) acku.a.j()).g((acth) obj)).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "checkDittoHealthForHostType", 249, "SatelliteTachyonTickleHandler.java")).t("Could not query %s ditto health; did not receive any response", acua.this);
                return esms.INCOMING_CHANNEL_DISCONNECTED;
            }
        }, this.e);
    }

    @Override // defpackage.cfvy
    public final elfl a() {
        if (((acpf) this.i.b()).a()) {
            return this.h.a().i(new eroh() { // from class: acki
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    String str = (String) obj;
                    if (str == null) {
                        return elfo.e(null);
                    }
                    acku ackuVar = acku.this;
                    if (!ackuVar.d.g()) {
                        return ackuVar.f.b().h(new emwl() { // from class: ackk
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                entd entdVar = acku.a;
                                return null;
                            }
                        }, ackuVar.e);
                    }
                    actj a2 = ackuVar.c.a();
                    a2.d = false;
                    acua acuaVar = acua.AGNOSTIC;
                    esni esniVar = (esni) esnk.a.createBuilder();
                    esoc esocVar = (esoc) esod.a.createBuilder();
                    esocVar.copyOnWrite();
                    ((esod) esocVar.instance).b = str;
                    esniVar.copyOnWrite();
                    esnk esnkVar = (esnk) esniVar.instance;
                    esod esodVar = (esod) esocVar.build();
                    esodVar.getClass();
                    esnkVar.c = esodVar;
                    esnkVar.b = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
                    return a2.a(acuaVar, (esnk) esniVar.build()).h(new emwl() { // from class: ackj
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            entd entdVar = acku.a;
                            return null;
                        }
                    }, ackuVar.e);
                }
            }, this.e);
        }
        ((ensz) a.n().h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "refreshToken", 169, "SatelliteTachyonTickleHandler.java")).q("Skipped token refreshing. Ditto satellite is not enabled.");
        return elfo.e(null);
    }

    @Override // defpackage.cfvy
    public final void b(long j) {
        this.b.e("Bugle.Fcm.Tickle.Downgrade.Counts", cfvw.a(5));
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "onFirebaseMessagePriorityDowngraded", 163, "SatelliteTachyonTickleHandler.java")).q("Satellite FCM message priority downgraded.");
    }

    @Override // defpackage.cfvy
    public final void c(fcek fcekVar, final String str, int i, int i2) {
        if (!((acpf) this.i.b()).a()) {
            ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "onTickleReceived", 78, "SatelliteTachyonTickleHandler.java")).q("Skipped tickle. Ditto satellite is not enabled.");
            return;
        }
        ((acip) this.g.b()).b(str, i2, i);
        final elfl d = d(acua.FOREGROUND);
        final elfl d2 = d(acua.BACKGROUND);
        elfo.m(d, d2).a(new Callable() { // from class: acko
            @Override // java.util.concurrent.Callable
            public final Object call() {
                entd entdVar = acku.a;
                return enhk.m(acua.FOREGROUND, (esms) erqt.q(elfl.this), acua.BACKGROUND, (esms) erqt.q(d2));
            }
        }, this.e).i(new eroh() { // from class: ackq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Map map = (Map) obj;
                esms esmsVar = (esms) map.get(acua.BACKGROUND);
                esmsVar.getClass();
                boolean z = true;
                if (!esmsVar.equals(esms.INCOMING_CHANNEL_DISCONNECTED) && !esmsVar.equals(esms.NOT_AUTHENTICATED)) {
                    z = false;
                }
                Boolean.valueOf(z).getClass();
                if (!z) {
                    return elfo.e(map);
                }
                acku ackuVar = acku.this;
                return ackuVar.f.c().h(new emwl() { // from class: ackt
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = acku.a;
                        return map;
                    }
                }, ackuVar.e);
            }
        }, this.e).h(new emwl() { // from class: ackr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Map map = (Map) obj;
                esms esmsVar = (esms) map.get(acua.FOREGROUND);
                esmsVar.getClass();
                esms esmsVar2 = (esms) map.get(acua.BACKGROUND);
                esmsVar2.getClass();
                if (esmsVar2.equals(esms.NOT_AUTHENTICATED)) {
                    ((ensz) ((ensz) acku.a.j()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "checkIfExistingDittoCanHandleRequest", 120, "SatelliteTachyonTickleHandler.java")).q("Background worker was open but not authenticated");
                }
                String str2 = str;
                acku ackuVar = acku.this;
                if (esmsVar.equals(esms.INCOMING_CHANNEL_CONNECTED)) {
                    ((acip) ackuVar.g.b()).l(str2);
                    return true;
                }
                if (esmsVar2.equals(esms.INCOMING_CHANNEL_CONNECTED)) {
                    ((acip) ackuVar.g.b()).k(str2);
                    return true;
                }
                if (map.containsValue(esms.INCOMING_CHANNEL_DISCONNECTED)) {
                    ((acip) ackuVar.g.b()).c(str2);
                }
                return false;
            }
        }, this.e).h(new emwl() { // from class: acks
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                String str2 = str;
                final acku ackuVar = acku.this;
                ((ensz) ((ensz) acku.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "startNewBackgroundHandler", 138, "SatelliteTachyonTickleHandler.java")).q("Starting the background script in response to an FCM tickle.");
                ((acip) ackuVar.g.b()).a(str2);
                ackuVar.f.d().h(new emwl() { // from class: ackp
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        if (((Boolean) obj2).booleanValue()) {
                            return null;
                        }
                        acku.this.b.c("Bugle.Satellite.Tickle.CouldNotStartBackgroundHandler");
                        ((ensz) ((ensz) acku.a.j()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteTachyonTickleHandler", "startNewBackgroundHandler", 147, "SatelliteTachyonTickleHandler.java")).q("Could not start the background handler in response to an FCM tickle. This may result in missing messages.");
                        return null;
                    }
                }, ackuVar.e).k(axnw.b(), ackuVar.e);
                return null;
            }
        }, this.e).k(axnw.b(), this.e);
    }
}
