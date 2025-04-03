package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.ims.rcs.singleregistration.SingleRegistrationVendorImsServiceResult;
import com.google.android.rcs.client.provisioning.singleregistration.SingleRegistrationVendorImsService;
import java.util.concurrent.TimeoutException;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajov extends ceut {
    static final cfva a = cfvl.e(cfvl.b, "vendor_ims_service_call_retry_delay_seconds", 10);
    public final djri b;
    private final errm c;
    private final ctzw d;
    private final BiFunction e;

    public ajov(errm errmVar, BiFunction biFunction, ctzw ctzwVar, djri djriVar) {
        this.c = errmVar;
        this.e = biFunction;
        this.d = ctzwVar;
        this.b = djriVar;
    }

    public static ceyt k(Exception exc) {
        dkty.i(exc, "[SR]: %s was raised while waiting to connect to SingleRegistrationVendorImsService.", exc.getClass().getSimpleName());
        return ceyt.m();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.WAKELOCK);
        l.c(Alert.DURATION_SHOW_INDEFINITELY);
        l.f(poa.LINEAR);
        l.g(((Integer) a.e()).intValue());
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("VendorImsCallWorkItemHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return ajom.a.getParserForType();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        ajom ajomVar = (ajom) eyhsVar;
        eyxc b = eyxc.b(ajomVar.d);
        if (b == null) {
            b = eyxc.OPERATION_TYPE_UNKNOWN;
        }
        final ajou ajouVar = eyxc.OPERATION_TYPE_SETUP_VENDOR_IMS.equals(b) ? new ajou() { // from class: ajoo
            @Override // defpackage.ajou
            public final SingleRegistrationVendorImsServiceResult a(SingleRegistrationVendorImsService singleRegistrationVendorImsService, int i) {
                return singleRegistrationVendorImsService.setupVendorIms(i);
            }
        } : new ajou() { // from class: ajop
            @Override // defpackage.ajou
            public final SingleRegistrationVendorImsServiceResult a(SingleRegistrationVendorImsService singleRegistrationVendorImsService, int i) {
                return singleRegistrationVendorImsService.terminateVendorIms(i);
            }
        };
        final int i = ((cetk) ceuwVar.a()).c;
        Integer valueOf = Integer.valueOf(ajomVar.c);
        eyxc b2 = eyxc.b(ajomVar.d);
        if (b2 == null) {
            b2 = eyxc.OPERATION_TYPE_UNKNOWN;
        }
        dkty.c("[SR] Executing Vendor IMS call. subId: %d, operation: %s, runAttemptCount: %d", valueOf, b2, Integer.valueOf(i));
        final int i2 = ajomVar.c;
        eyxc b3 = eyxc.b(ajomVar.d);
        if (b3 == null) {
            b3 = eyxc.OPERATION_TYPE_UNKNOWN;
        }
        final eyxc eyxcVar = b3;
        eyxa b4 = eyxa.b(ajomVar.e);
        if (b4 == null) {
            b4 = eyxa.TRIGGER_UNKNOWN;
        }
        final eyxa eyxaVar = b4;
        if (i2 >= 0) {
            return this.d.a(this.e, SingleRegistrationVendorImsService.class).h(new emwl() { // from class: ajoq
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ajou ajouVar2 = ajouVar;
                    eyxc eyxcVar2 = eyxcVar;
                    ajov ajovVar = ajov.this;
                    SingleRegistrationVendorImsService singleRegistrationVendorImsService = (SingleRegistrationVendorImsService) obj;
                    int i3 = i2;
                    eyxa eyxaVar2 = eyxaVar;
                    int i4 = i;
                    try {
                        SingleRegistrationVendorImsServiceResult a2 = ajouVar2.a(singleRegistrationVendorImsService, i3);
                        if (a2 == null) {
                            ajovVar.b.i(eyxcVar2, eyxaVar2, eywy.FAILURE_REASON_UNKNOWN, i4);
                        } else if (a2.succeeded()) {
                            djri djriVar = ajovVar.b;
                            eyvu eyvuVar = (eyvu) eyvv.a.createBuilder();
                            eyvuVar.copyOnWrite();
                            eyvv eyvvVar = (eyvv) eyvuVar.instance;
                            eyvvVar.f = 3;
                            eyvvVar.b |= 2;
                            eyvuVar.copyOnWrite();
                            eyvv eyvvVar2 = (eyvv) eyvuVar.instance;
                            eyvvVar2.g = 2;
                            eyvvVar2.b |= 4;
                            eyuv eyuvVar = (eyuv) eyuw.a.createBuilder();
                            eyww eywwVar = (eyww) eyxd.a.createBuilder();
                            eywwVar.copyOnWrite();
                            eyxd eyxdVar = (eyxd) eywwVar.instance;
                            eyxdVar.c = eyxcVar2.d;
                            eyxdVar.b |= 1;
                            eywwVar.copyOnWrite();
                            eyxd eyxdVar2 = (eyxd) eywwVar.instance;
                            eyxdVar2.b |= 16;
                            eyxdVar2.g = i4;
                            eywwVar.copyOnWrite();
                            eyxd eyxdVar3 = (eyxd) eywwVar.instance;
                            eyxdVar3.b |= 2;
                            eyxdVar3.d = true;
                            eywwVar.copyOnWrite();
                            eyxd eyxdVar4 = (eyxd) eywwVar.instance;
                            eyxdVar4.h = eyxaVar2.l;
                            eyxdVar4.b |= 32;
                            eyuvVar.copyOnWrite();
                            eyuw eyuwVar = (eyuw) eyuvVar.instance;
                            eyxd eyxdVar5 = (eyxd) eywwVar.build();
                            eyxdVar5.getClass();
                            eyuwVar.e = eyxdVar5;
                            eyuwVar.b |= 8;
                            eyvuVar.copyOnWrite();
                            eyvv eyvvVar3 = (eyvv) eyvuVar.instance;
                            eyuw eyuwVar2 = (eyuw) eyuvVar.build();
                            eyuwVar2.getClass();
                            eyvvVar3.d = eyuwVar2;
                            eyvvVar3.c = 9;
                            ((djrf) djriVar).h((eyvv) eyvuVar.build());
                        } else if (a2.getCode() == 28) {
                            ajovVar.b.i(eyxcVar2, eyxaVar2, eywy.FAILURE_REASON_SIM_NOT_FOUND, i4);
                        } else if (a2.b.equals(eywy.FAILURE_REASON_IMS_EXCEPTION)) {
                            djri djriVar2 = ajovVar.b;
                            eyul eyulVar = a2.a;
                            eyvu eyvuVar2 = (eyvu) eyvv.a.createBuilder();
                            eyvuVar2.copyOnWrite();
                            eyvv eyvvVar4 = (eyvv) eyvuVar2.instance;
                            eyvvVar4.f = 3;
                            eyvvVar4.b |= 2;
                            eyvuVar2.copyOnWrite();
                            eyvv eyvvVar5 = (eyvv) eyvuVar2.instance;
                            eyvvVar5.g = 3;
                            eyvvVar5.b |= 4;
                            eyuv eyuvVar2 = (eyuv) eyuw.a.createBuilder();
                            eyww eywwVar2 = (eyww) eyxd.a.createBuilder();
                            eywwVar2.copyOnWrite();
                            eyxd eyxdVar6 = (eyxd) eywwVar2.instance;
                            eyxdVar6.c = eyxcVar2.d;
                            eyxdVar6.b |= 1;
                            eywwVar2.copyOnWrite();
                            eyxd eyxdVar7 = (eyxd) eywwVar2.instance;
                            eyxdVar7.b |= 16;
                            eyxdVar7.g = i4;
                            eywwVar2.copyOnWrite();
                            eyxd eyxdVar8 = (eyxd) eywwVar2.instance;
                            eyxdVar8.b |= 2;
                            eyxdVar8.d = false;
                            eywy eywyVar = eywy.FAILURE_REASON_IMS_EXCEPTION;
                            eywwVar2.copyOnWrite();
                            eyxd eyxdVar9 = (eyxd) eywwVar2.instance;
                            eyxdVar9.e = eywyVar.j;
                            eyxdVar9.b |= 4;
                            eywwVar2.copyOnWrite();
                            eyxd eyxdVar10 = (eyxd) eywwVar2.instance;
                            eyxdVar10.f = eyulVar.e;
                            eyxdVar10.b |= 8;
                            eywwVar2.copyOnWrite();
                            eyxd eyxdVar11 = (eyxd) eywwVar2.instance;
                            eyxdVar11.h = eyxaVar2.l;
                            eyxdVar11.b |= 32;
                            eyuvVar2.copyOnWrite();
                            eyuw eyuwVar3 = (eyuw) eyuvVar2.instance;
                            eyxd eyxdVar12 = (eyxd) eywwVar2.build();
                            eyxdVar12.getClass();
                            eyuwVar3.e = eyxdVar12;
                            eyuwVar3.b |= 8;
                            eyvuVar2.copyOnWrite();
                            eyvv eyvvVar6 = (eyvv) eyvuVar2.instance;
                            eyuw eyuwVar4 = (eyuw) eyuvVar2.build();
                            eyuwVar4.getClass();
                            eyvvVar6.d = eyuwVar4;
                            eyvvVar6.c = 9;
                            ((djrf) djriVar2).h((eyvv) eyvuVar2.build());
                        } else {
                            ajovVar.b.i(eyxcVar2, eyxaVar2, a2.b, i4);
                        }
                        if (a2 == null) {
                            dkty.g("[SR] task failed (result: null). retry expected in %d seconds", Integer.valueOf(((Integer) ajov.a.e()).intValue() * i4));
                            return ceyt.m();
                        }
                        if (a2.succeeded()) {
                            dkty.k("[SR]: task completed. no retry expected", new Object[0]);
                            return ceyt.i();
                        }
                        if (a2.getCode() == 28) {
                            dkty.g("[SR]: task failed. SIM is missing - no retry expected", new Object[0]);
                            return ceyt.k();
                        }
                        dkty.g("[SR]: task failed. retry expected in %d seconds", Integer.valueOf(((Integer) ajov.a.e()).intValue() * i4));
                        return ceyt.m();
                    } catch (ehxg e) {
                        ajovVar.b.j(eyxcVar2, eyxaVar2, eywy.FAILURE_REASON_JIBE_SERVICE_EXCEPTION, e.getMessage(), i4);
                        return ajov.k(e);
                    }
                }
            }, this.c).e(SecurityException.class, new emwl() { // from class: ajor
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    SecurityException securityException = (SecurityException) obj;
                    ajov.this.b.j(eyxcVar, eyxaVar, eywy.FAILURE_REASON_SECURITY_EXCEPTION, securityException.getMessage(), i);
                    return ajov.k(securityException);
                }
            }, this.c).e(TimeoutException.class, new emwl() { // from class: ajos
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    TimeoutException timeoutException = (TimeoutException) obj;
                    ajov.this.b.j(eyxcVar, eyxaVar, eywy.FAILURE_REASON_TIMEOUT_EXCEPTION, timeoutException.getMessage(), i);
                    return ajov.k(timeoutException);
                }
            }, this.c).e(cual.class, new emwl() { // from class: ajot
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    cual cualVar = (cual) obj;
                    ajov.this.b.j(eyxcVar, eyxaVar, eywy.FAILURE_REASON_RCS_SERVICE_CONNECTION_EXCEPTION, cualVar.getMessage(), i);
                    return ajov.k(cualVar);
                }
            }, this.c);
        }
        dkty.g("[SR]: invalid subscriptionId value. No retry expected.", new Object[0]);
        this.b.i(eyxcVar, eyxaVar, eywy.FAILURE_REASON_INVALID_SUBSCRIPTION_ID, i);
        return elfo.e(ceyt.k());
    }
}
