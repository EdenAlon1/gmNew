package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.telephony.CarrierConfigManager;
import j$.time.Duration;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnph implements cnpd {
    private static final enru e = enru.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl");
    public final Context a;
    public final ffsk b;
    public final ausa c;
    public final Set d;
    private final csjk f;
    private final Duration g;
    private final fgcm h;
    private final ffbz i;
    private fgdj j;

    public cnph(Context context, ffsk ffskVar, csjk csjkVar, Duration duration, ausa ausaVar, Set set) {
        context.getClass();
        ffskVar.getClass();
        csjkVar.getClass();
        ausaVar.getClass();
        set.getClass();
        this.a = context;
        this.b = ffskVar;
        this.f = csjkVar;
        this.g = duration;
        this.c = ausaVar;
        this.d = set;
        fgcm a = fgdm.a(cnpk.a);
        this.h = a;
        this.i = ffca.a(new ffix() { // from class: cnpe
            @Override // defpackage.ffix
            public final Object invoke() {
                return (CarrierConfigManager) cnph.this.a.getSystemService(CarrierConfigManager.class);
            }
        });
        final long a2 = ffsw.a(ffpw.j(ffpy.e(duration.getSeconds(), ffpz.d), ffpy.d(duration.getNano(), ffpz.a)));
        if (a2 < 0) {
            throw new IllegalArgumentException("Debounce timeout should not be negative");
        }
        fgbt fgbtVar = new fgbt(a2 != 0 ? new fgey(new ffyv(new ffji() { // from class: ffyp
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return Long.valueOf(a2);
            }
        }, a, null)) : a, new cnpg(this, null));
        int i = fgcz.a;
        this.j = fgbn.b(fgbtVar, ffskVar, fgcy.a, cnpk.a);
    }

    private final CarrierConfigManager j() {
        return (CarrierConfigManager) this.i.a();
    }

    private final cnpk k() {
        PersistableBundle config;
        enru enruVar = e;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "getSatelliteConnectionType", 152, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("Detecting satellite connection type.");
        if (!this.c.a() || j() == null) {
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "BugleSatellite");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "getSatelliteConnectionType", 179, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("Flag is off. Using non granular connection type");
            return cnpk.b;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            CarrierConfigManager j = j();
            j.getClass();
            config = j.getConfig("carrier_roaming_ntn_connect_type_int");
        } else {
            CarrierConfigManager j2 = j();
            j2.getClass();
            config = j2.getConfig();
        }
        Integer valueOf = config != null ? Integer.valueOf(config.getInt("carrier_roaming_ntn_connect_type_int")) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            ensk h3 = enruVar.h();
            h3.Y(ente.a, "BugleSatellite");
            ((enrr) h3.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "getSatelliteConnectionType", 166, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("New satellite connection type: automatic");
            return cnpk.b;
        }
        if (valueOf != null && valueOf.intValue() == 1) {
            ensk h4 = enruVar.h();
            h4.Y(ente.a, "BugleSatellite");
            ((enrr) h4.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "getSatelliteConnectionType", 170, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("New satellite connection type: manual");
            return cnpk.c;
        }
        ensk h5 = enruVar.h();
        h5.Y(ente.a, "BugleSatellite");
        ((enrr) h5.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "getSatelliteConnectionType", 174, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("New satellite connection type: unknown");
        return cnpk.a;
    }

    @Override // defpackage.cnoz
    public final void a(azsu azsuVar) {
        ensk e2 = e.e();
        e2.Y(ente.a, "BugleSatellite");
        ((enrr) e2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "offSatellite", 140, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("offSatellite");
        this.h.f(cnpk.e);
    }

    @Override // defpackage.cnoz
    public final void d(azsu azsuVar) {
        enru enruVar = e;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onSatelliteManualConnectEligible", 100, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("onSatelliteManualConnectEligible");
        if (!this.c.a()) {
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "BugleSatellite");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onSatelliteManualConnectEligible", 115, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("Ignored the update because the flag is off");
        } else {
            ensk h3 = enruVar.h();
            h3.Y(ente.a, "BugleSatellite");
            ((enrr) h3.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onSatelliteManualConnectEligible", 103, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("Updating the state: eligible for manual satellite connection");
            this.h.f(cnpk.d);
        }
    }

    @Override // defpackage.cnoz
    public final void e() {
        ensk e2 = e.e();
        e2.Y(ente.a, "BugleSatellite");
        ((enrr) e2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "offDefaultDataSatelliteToTerrestrial", 135, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("offDefaultDataSatelliteToTerrestrial");
        this.h.f(cnpk.e);
    }

    @Override // defpackage.cnoz
    public final void f() {
        ensk e2 = e.e();
        e2.Y(ente.a, "BugleSatellite");
        ((enrr) e2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onDefaultDataSatelliteEvent", 120, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("onDefaultDataSatelliteEvent: updating the state");
        this.h.f(k());
    }

    @Override // defpackage.cnoz
    public final void g() {
        enru enruVar = e;
        ensk e2 = enruVar.e();
        e2.Y(ente.a, "BugleSatellite");
        ((enrr) e2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onSmsSatelliteEvent", 125, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("onSmsSatelliteEvent");
        if (((csmz) this.f.a()).w()) {
            ensk h = enruVar.h();
            h.Y(ente.a, "BugleSatellite");
            ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onSmsSatelliteEvent", 130, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("onSmsSatelliteEvent: wifi available, ignoring the update.");
        } else {
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "BugleSatellite");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "onSmsSatelliteEvent", 127, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("onSmsSatelliteEvent: no wifi available, updating the state.");
            this.h.f(k());
        }
    }

    @Override // defpackage.cnpd
    public final fgdj h() {
        return this.j;
    }

    @Override // defpackage.cnpd
    public final void i() {
        enru enruVar = e;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleSatellite");
        ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "notifyInteractive", 84, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("notifyInteractive");
        if (this.h.c() != cnpk.a) {
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "BugleSatellite");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "notifyInteractive", 86, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("Connection state is not UNKNOWN, ignoring");
        } else {
            if (((csmz) this.f.a()).w() || !(((csmz) this.f.a()).s() || ((csmz) this.f.a()).q())) {
                ensk h3 = enruVar.h();
                h3.Y(ente.a, "BugleSatellite");
                ((enrr) h3.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "notifyInteractive", 94, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("Updating the state: no satellite connection.");
                this.h.f(cnpk.e);
                return;
            }
            ensk h4 = enruVar.h();
            h4.Y(ente.a, "BugleSatellite");
            ((enrr) h4.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/conversation/ConversationSatelliteConnectionChangeListenerImpl", "notifyInteractive", 91, "ConversationSatelliteConnectionChangeListenerImpl.kt")).q("Updating the state: has satellite connection.");
            this.h.f(k());
        }
    }

    @Override // defpackage.cnoz
    public final /* synthetic */ void b(azsu azsuVar) {
    }

    @Override // defpackage.cnoz
    public final /* synthetic */ void c(azsu azsuVar) {
    }
}
