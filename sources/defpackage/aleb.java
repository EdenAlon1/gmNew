package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aleb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aled b;
    final /* synthetic */ epts c;
    final /* synthetic */ eptm d;
    final /* synthetic */ Integer e;
    final /* synthetic */ Duration f;
    final /* synthetic */ Long g;
    final /* synthetic */ epto h;
    final /* synthetic */ eptu i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aleb(aled aledVar, epts eptsVar, eptm eptmVar, Integer num, Duration duration, Long l, epto eptoVar, eptu eptuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aledVar;
        this.c = eptsVar;
        this.d = eptmVar;
        this.e = num;
        this.f = duration;
        this.g = l;
        this.h = eptoVar;
        this.i = eptuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aleb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            final aled aledVar = this.b;
            final Integer num = this.e;
            final Duration duration = this.f;
            final Long l = this.g;
            final eptm eptmVar = this.d;
            final epto eptoVar = this.h;
            final epts eptsVar = this.c;
            final eptu eptuVar = this.i;
            elfl l2 = aledVar.l(new Supplier() { // from class: alea
                @Override // java.util.function.Supplier
                public final Object get() {
                    Integer b;
                    epti eptiVar = (epti) eptp.a.createBuilder();
                    eptiVar.getClass();
                    eptq eptqVar = (eptq) eptv.a.createBuilder();
                    eptqVar.getClass();
                    eqni.b(eptsVar, eptqVar);
                    eqni.c(eptuVar, eptqVar);
                    eqnh.c(eqni.a(eptqVar), eptiVar);
                    Integer num2 = num;
                    if (num2 != null) {
                        eqnh.d(num2.intValue(), eptiVar);
                    }
                    Duration duration2 = duration;
                    if (duration2 != null && (b = aledVar.b(duration2)) != null) {
                        eqnh.b(b.intValue(), eptiVar);
                    }
                    Long l3 = l;
                    if (l3 != null) {
                        eqav eqavVar = (eqav) eqaw.a.createBuilder();
                        eqavVar.getClass();
                        equa.b(l3.longValue(), eqavVar);
                        eqnh.e(equa.a(eqavVar), eptiVar);
                    }
                    epto eptoVar2 = eptoVar;
                    eptm eptmVar2 = eptmVar;
                    eptiVar.copyOnWrite();
                    eptp eptpVar = (eptp) eptiVar.instance;
                    eptpVar.d = Integer.valueOf(eptmVar2.r);
                    eptpVar.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
                    eptiVar.copyOnWrite();
                    eptp eptpVar2 = (eptp) eptiVar.instance;
                    eptpVar2.f = Integer.valueOf(eptoVar2.f);
                    eptpVar2.e = BasePaymentResult.ERROR_REQUEST_TIMEOUT;
                    return eqnh.a(eptiVar);
                }
            });
            l2.getClass();
            this.a = 1;
            obj = fgfz.c(l2, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            ensk j = aled.a.j();
            j.Y(ente.a, "BugleComposeRow2");
            ((enrr) j.h("com/google/android/apps/messaging/shared/analytics/compose/navigation/ComposeNavigationEventLogger$logScreenOpened$1", "invokeSuspend", 79, "ComposeNavigationEventLogger.kt")).D("Failed to log opening ComposeNavigationEvent for %s, %s", this.c, this.d);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aleb(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, ffguVar);
    }
}
