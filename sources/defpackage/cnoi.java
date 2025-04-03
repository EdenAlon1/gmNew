package defpackage;

import android.content.Context;
import android.telephony.satellite.wrapper.CarrierRoamingNtnModeListenerWrapper;
import android.telephony.satellite.wrapper.SatelliteManagerWrapper;
import android.telephony.satellite.wrapper.SatelliteModemStateCallbackWrapper;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnoi implements cnoc {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl");
    public final elbx b;
    public final cnnh c;
    private final Context d;
    private final errl e;
    private final ffsk f;
    private final ausa g;

    public cnoi(Context context, errl errlVar, ffsk ffskVar, elbx elbxVar, cnnh cnnhVar, ausa ausaVar) {
        context.getClass();
        errlVar.getClass();
        ffskVar.getClass();
        elbxVar.getClass();
        cnnhVar.getClass();
        ausaVar.getClass();
        this.d = context;
        this.e = errlVar;
        this.f = ffskVar;
        this.b = elbxVar;
        this.c = cnnhVar;
        this.g = ausaVar;
    }

    private final void f(final int i, final cnoa cnoaVar) {
        try {
            SatelliteManagerWrapper.getInstance(this.d).registerForCarrierRoamingNtnModeChanged(i, this.e, new CarrierRoamingNtnModeListenerWrapper() { // from class: cnof
                public final void onCarrierRoamingNtnModeChanged(boolean z) {
                    cnoa cnoaVar2 = cnoaVar;
                    int i2 = i;
                    ekzm b = cnoi.this.b.b("CarrierRoamingNtnModeListenerWrapper onCarrierRoamingNtnModeChangedEvent");
                    try {
                        cnoaVar2.b(z, i2);
                        ffig.a(b, null);
                    } finally {
                    }
                }
            });
        } catch (Exception e) {
            ensk j = a.j();
            j.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChangedV1", 138, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForCarrierRoamingNtnModeChanged with v1 interface");
        } catch (LinkageError e2) {
            ensk e3 = a.e();
            e3.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) e3).g(e2).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChangedV1", 133, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForCarrierRoamingNtnModeChanged with v1 interface");
        }
    }

    @Override // defpackage.cnoc
    public final void a(int i, cnoa cnoaVar) {
        if (!ctid.h) {
            ensk e = a.e();
            e.Y(ente.a, "BugleSatellite");
            ((enrr) e.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChanged", 63, "BugleSatelliteManagerWrapperImpl.kt")).q("Does not meet minimum OS for satellite support");
            return;
        }
        try {
            ensk h = a.h();
            h.Y(ente.a, "BugleSatellite");
            ((enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChanged", 68, "BugleSatelliteManagerWrapperImpl.kt")).q("Attempting to register registerForCarrierRoamingNtnModeChanged listener");
            SatelliteManagerWrapper.getInstance(this.d).registerForCarrierRoamingNtnModeChanged(i, this.e, new cnog(this, cnoaVar, i));
        } catch (ClassCastException e2) {
            ensk e3 = a.e();
            e3.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) e3).g(e2).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChanged", 80, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForCarrierRoamingNtnModeChanged. Retrying with v1 interface");
            f(i, cnoaVar);
        } catch (Exception e4) {
            ensk j = a.j();
            j.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) j).g(e4).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChanged", 83, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call isUsingNonTerrestrialNetwork.");
            f(i, cnoaVar);
        } catch (LinkageError e5) {
            ensk e6 = a.e();
            e6.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) e6).g(e5).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForCarrierRoamingNtnModeChanged", 74, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForCarrierRoamingNtnModeChanged. Retrying with v1 interface");
            f(i, cnoaVar);
        }
    }

    @Override // defpackage.cnoc
    public final void b(cnob cnobVar) {
        if (!ctid.h) {
            ensk e = a.e();
            e.Y(ente.a, "BugleSatellite");
            ((enrr) e.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "requestSatelliteConnection", 177, "BugleSatelliteManagerWrapperImpl.kt")).q("Does not meet minimum OS for satellite support");
        } else {
            if (this.g.a()) {
                axol.k(this.f, null, new cnoh(this, cnobVar, null), 3);
                return;
            }
            try {
                SatelliteManagerWrapper.getInstance(this.d).requestEnabled(true, false, false, this.e, new Consumer() { // from class: cnoe
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Integer num = (Integer) obj;
                        ensk h = cnoi.a.h();
                        h.Y(ente.a, "BugleSatellite");
                        enrr enrrVar = (enrr) h.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "requestSatelliteConnection$lambda$4", BasePaymentResult.ERROR_REQUEST_FAILED, "BugleSatelliteManagerWrapperImpl.kt");
                        num.getClass();
                        enrrVar.r("Satellite request enabled result: %d", num.intValue());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } catch (Exception e2) {
                ensk j = a.j();
                j.Y(ente.a, "BugleSatellite");
                ((enrr) ((enrr) j).g(e2).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "requestSatelliteConnection", 205, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForCarrierRoamingNtnModeChanged");
            } catch (LinkageError e3) {
                ensk e4 = a.e();
                e4.Y(ente.a, "BugleSatellite");
                ((enrr) ((enrr) e4).g(e3).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "requestSatelliteConnection", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForCarrierRoamingNtnModeChanged");
            }
        }
    }

    @Override // defpackage.cnoc
    public final void c(boolean z) {
        if (!ctid.h) {
            ensk e = a.e();
            e.Y(ente.a, "BugleSatellite");
            ((enrr) e.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "setNtnSmsSupported", 212, "BugleSatelliteManagerWrapperImpl.kt")).q("Does not meet minimum OS for satellite support");
            return;
        }
        try {
            SatelliteManagerWrapper.getInstance(this.d).setNtnSmsSupported(z);
        } catch (Exception e2) {
            ensk j = a.j();
            j.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) j).g(e2).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "setNtnSmsSupported", 221, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call setNtnSmsSupported");
        } catch (LinkageError e3) {
            ensk e4 = a.e();
            e4.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) e4).g(e3).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "setNtnSmsSupported", 219, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call setNtnSmsSupported");
        }
    }

    @Override // defpackage.cnoc
    public final boolean d(int i) {
        if (!ctid.h) {
            ensk e = a.e();
            e.Y(ente.a, "BugleSatellite");
            ((enrr) e.h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "isUsingNonTerrestrialNetwork", 44, "BugleSatelliteManagerWrapperImpl.kt")).q("Does not meet minimum OS for satellite support");
            return false;
        }
        try {
            return SatelliteManagerWrapper.getInstance(this.d).isUsingNonTerrestrialNetwork(i);
        } catch (Exception e2) {
            ensk j = a.j();
            j.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) j).g(e2).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "isUsingNonTerrestrialNetwork", 53, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call isUsingNonTerrestrialNetwork.");
            return false;
        } catch (LinkageError e3) {
            ensk e4 = a.e();
            e4.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) e4).g(e3).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "isUsingNonTerrestrialNetwork", 50, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call isUsingNonTerrestrialNetwork");
            return false;
        }
    }

    @Override // defpackage.cnoc
    public final void e(final csnv csnvVar) {
        try {
            SatelliteManagerWrapper.getInstance(this.d).registerForModemStateChanged(this.e, new SatelliteModemStateCallbackWrapper() { // from class: cnod
                public final void onSatelliteModemStateChanged(int i) {
                    csnv csnvVar2 = csnvVar;
                    ekzm b = cnoi.this.b.b("SatelliteModemStateCallbackWrapper#onSatelliteModemStateChanged");
                    try {
                        csoa csoaVar = csnvVar2.a;
                        csoaVar.t.set(i);
                        csoaVar.D(a.f(i, "onSatelliteModemStateChanged (", ")"));
                        if (csoaVar.H()) {
                            if (i == 8) {
                                ensk h = csoa.c.h();
                                h.Y(ente.a, "BugleConnectivity");
                                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer", "<init>", 1222, "ConnectivityUtilImpl.java")).q("Manual satellite eligible, modem is now in ENABLING state. Notifying listeners.");
                                csoaVar.E(cnol.e, "registerForModemStateChanged");
                            } else if (csoaVar.q.get() == cnok.e && !csoaVar.s.get() && (i == -1 || i == 4 || i == 5)) {
                                ensk h2 = csoa.c.h();
                                h2.Y(ente.a, "BugleConnectivity");
                                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl$DefaultDataRegisterer", "<init>", 1235, "ConnectivityUtilImpl.java")).q("Manual satellite eligible, modem is now OFF. Notifying listeners about manual satellite eligibility.");
                                csoaVar.E(cnol.a, "registerForModemStateChanged");
                            }
                        }
                        ffig.a(b, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            ffig.a(b, th);
                            throw th2;
                        }
                    }
                }
            });
        } catch (Exception e) {
            ensk j = a.j();
            j.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForModemStateChanged", 106, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForModemStateChanged");
        } catch (LinkageError e2) {
            ensk e3 = a.e();
            e3.Y(ente.a, "BugleSatellite");
            ((enrr) ((enrr) e3).g(e2).h("com/google/android/apps/messaging/shared/satelliteapi/dunestar/BugleSatelliteManagerWrapperImpl", "registerForModemStateChanged", 104, "BugleSatelliteManagerWrapperImpl.kt")).q("Cannot call registerForModemStateChanged");
        }
    }
}
