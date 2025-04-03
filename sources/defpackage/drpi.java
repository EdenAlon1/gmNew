package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drpi implements dpas, dpao {
    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ doxr a(eyhs eyhsVar) {
        drnr drnrVar = (drnr) eyhsVar;
        drnrVar.getClass();
        if (drnrVar.c == 200) {
            return dtem.a;
        }
        droo drooVar = drnrVar.g;
        if (drooVar == null) {
            drooVar = droo.a;
        }
        drooVar.getClass();
        return drpn.a(drooVar);
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ dpal b() {
        return new drpe();
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        drnr drnrVar = (drnr) eyfy.parseFrom(drnr.a, eyeeVar);
        drnrVar.getClass();
        return drnrVar;
    }

    @Override // defpackage.dpas
    public final /* bridge */ /* synthetic */ eyhs d(doxs doxsVar) {
        drng drngVar = (drng) doxsVar;
        drno drnoVar = (drno) drnr.a.createBuilder();
        drnoVar.getClass();
        eyev a = eykn.a(drngVar.e);
        drnoVar.copyOnWrite();
        drnr drnrVar = (drnr) drnoVar.instance;
        drnrVar.e = a;
        drnrVar.b |= 1;
        dteh dtehVar = drngVar.f;
        drnoVar.copyOnWrite();
        drnr drnrVar2 = (drnr) drnoVar.instance;
        drnrVar2.f = dtehVar;
        drnrVar2.b |= 2;
        droo b = drpn.b(drngVar);
        drnoVar.copyOnWrite();
        drnr drnrVar3 = (drnr) drnoVar.instance;
        drnrVar3.g = b;
        drnrVar3.b |= 4;
        if (drngVar.d instanceof dtem) {
            drnp drnpVar = (drnp) drnq.a.createBuilder();
            drnpVar.getClass();
            eyfy build = drnpVar.build();
            build.getClass();
            drnoVar.copyOnWrite();
            drnr drnrVar4 = (drnr) drnoVar.instance;
            drnrVar4.d = (drnq) build;
            drnrVar4.c = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        eyfy build2 = drnoVar.build();
        build2.getClass();
        return (drnr) build2;
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
        drpe drpeVar = (drpe) dpalVar;
        drnr drnrVar = (drnr) eyhsVar;
        eyev eyevVar = drnrVar.e;
        if (eyevVar == null) {
            eyevVar = eyev.a;
        }
        eyevVar.getClass();
        drpeVar.i(eykn.c(eyevVar));
        dteh dtehVar = drnrVar.f;
        if (dtehVar == null) {
            dtehVar = dteh.a;
        }
        dtehVar.getClass();
        drpeVar.n(dtehVar);
        droo drooVar = drnrVar.g;
        if (drooVar == null) {
            drooVar = droo.a;
        }
        drqs drqsVar = drooVar.g;
        if (drqsVar == null) {
            drqsVar = drqs.a;
        }
        drqsVar.getClass();
        drqt.c(drpeVar, drqsVar, new ffjm() { // from class: drph
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                drpe drpeVar2 = (drpe) obj;
                drqr drqrVar = (drqr) obj2;
                drpeVar2.getClass();
                drqrVar.getClass();
                drqt.b(drpeVar2, drqrVar);
                return drpeVar2;
            }
        });
        droo drooVar2 = drnrVar.g;
        if (drooVar2 == null) {
            drooVar2 = droo.a;
        }
        doyi doyiVar = drooVar2.f;
        if (doyiVar == null) {
            doyiVar = doyi.a;
        }
        doyiVar.getClass();
        doyo.d(drpeVar, doyiVar);
        return ffcu.a;
    }
}
