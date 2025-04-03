package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epog {
    public final eppq a;

    public epog(eppq eppqVar) {
        this.a = eppqVar;
    }

    public final /* synthetic */ eppr a() {
        eyfy build = this.a.build();
        build.getClass();
        return (eppr) build;
    }

    public final void b(eppw eppwVar) {
        eppq eppqVar = this.a;
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eppr epprVar2 = eppr.a;
        epprVar.f = eppwVar;
        epprVar.e = 206;
    }

    public final void c(epqn epqnVar) {
        eppq eppqVar = this.a;
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eppr epprVar2 = eppr.a;
        epprVar.d = epqnVar;
        epprVar.c = 102;
    }

    public final void d(eprl eprlVar) {
        eppq eppqVar = this.a;
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eppr epprVar2 = eppr.a;
        epprVar.f = eprlVar;
        epprVar.e = BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED;
    }

    public final void e(eptv eptvVar) {
        eppq eppqVar = this.a;
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eppr epprVar2 = eppr.a;
        epprVar.d = eptvVar;
        epprVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
    }

    public final void f(eprw eprwVar) {
        eppq eppqVar = this.a;
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eppr epprVar2 = eppr.a;
        epprVar.f = eprwVar;
        epprVar.e = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
    }
}
