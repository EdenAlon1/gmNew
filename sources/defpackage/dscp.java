package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dscp implements dpas, dpao {
    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ doxr a(eyhs eyhsVar) {
        dscn dscnVar = (dscn) eyhsVar;
        dscnVar.getClass();
        if (dscnVar.c == 200) {
            return dsch.a;
        }
        drer drerVar = dscnVar.e;
        if (drerVar == null) {
            drerVar = drer.a;
        }
        drerVar.getClass();
        return dreu.a(drerVar);
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ dpal b() {
        return new dsco();
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        dscn dscnVar = (dscn) eyfy.parseFrom(dscn.a, eyeeVar);
        dscnVar.getClass();
        return dscnVar;
    }

    @Override // defpackage.dpas
    public final /* bridge */ /* synthetic */ eyhs d(doxs doxsVar) {
        dsci dsciVar = (dsci) doxsVar;
        dsck dsckVar = (dsck) dscn.a.createBuilder();
        dsckVar.getClass();
        drer b = dreu.b(dsciVar);
        dsckVar.copyOnWrite();
        dscn dscnVar = (dscn) dsckVar.instance;
        dscnVar.e = b;
        dscnVar.b |= 1;
        boolean z = dsciVar.b instanceof dsch;
        if (z && z) {
            dscl dsclVar = (dscl) dscm.a.createBuilder();
            dsclVar.getClass();
            eyfy build = dsclVar.build();
            build.getClass();
            dsckVar.copyOnWrite();
            dscn dscnVar2 = (dscn) dsckVar.instance;
            dscnVar2.d = (dscm) build;
            dscnVar2.c = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        eyfy build2 = dsckVar.build();
        build2.getClass();
        return (dscn) build2;
    }

    @Override // defpackage.dpao
    public final /* synthetic */ Object e(eyee eyeeVar, ffgu ffguVar) {
        Object f;
        f = f(c(eyeeVar), ffguVar);
        return f;
    }

    @Override // defpackage.dpao
    public final /* synthetic */ Object f(eyhs eyhsVar, ffgu ffguVar) {
        return dpam.b(this, eyhsVar, ffguVar);
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ Object g(dpal dpalVar, eyhs eyhsVar) {
        dsco dscoVar = (dsco) dpalVar;
        drer drerVar = ((dscn) eyhsVar).e;
        if (drerVar == null) {
            drerVar = drer.a;
        }
        drerVar.getClass();
        dreu.c(dscoVar, drerVar);
        return ffcu.a;
    }
}
