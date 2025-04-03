package defpackage;

import j$.time.Duration;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aldz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aled b;
    final /* synthetic */ epts c;
    final /* synthetic */ eptk d;
    final /* synthetic */ Integer e;
    final /* synthetic */ Duration f;
    final /* synthetic */ Long g;
    final /* synthetic */ eptu h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aldz(aled aledVar, epts eptsVar, eptk eptkVar, Integer num, Duration duration, Long l, eptu eptuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aledVar;
        this.c = eptsVar;
        this.d = eptkVar;
        this.e = num;
        this.f = duration;
        this.g = l;
        this.h = eptuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aldz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            final eptk eptkVar = this.d;
            final epts eptsVar = this.c;
            final eptu eptuVar = this.h;
            elfl l2 = aledVar.l(new Supplier() { // from class: aldy
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
                    eqnh.d(num.intValue(), eptiVar);
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
                    eptk eptkVar2 = eptkVar;
                    eptiVar.copyOnWrite();
                    eptp eptpVar = (eptp) eptiVar.instance;
                    eptpVar.d = Integer.valueOf(eptkVar2.h);
                    eptpVar.c = 102;
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
            ((enrr) j.h("com/google/android/apps/messaging/shared/analytics/compose/navigation/ComposeNavigationEventLogger$logScreenClosed$1", "invokeSuspend", 114, "ComposeNavigationEventLogger.kt")).D("Failed to log closing ComposeNavigationEvent for %s, %s", this.c, this.d);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aldz(this.b, this.c, this.d, this.e, this.f, this.g, this.h, ffguVar);
    }
}
