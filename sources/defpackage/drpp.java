package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drpp implements dpas, dpao {
    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ doxr a(eyhs eyhsVar) {
        drou drouVar = (drou) eyhsVar;
        drouVar.getClass();
        droo drooVar = drouVar.d;
        if (drooVar == null) {
            drooVar = droo.a;
        }
        drooVar.getClass();
        return drpn.a(drooVar);
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ dpal b() {
        return new drpg();
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        drou drouVar = (drou) eyfy.parseFrom(drou.a, eyeeVar);
        drouVar.getClass();
        return drouVar;
    }

    @Override // defpackage.dpas
    public final /* bridge */ /* synthetic */ eyhs d(doxs doxsVar) {
        drnl drnlVar = (drnl) doxsVar;
        drot drotVar = (drot) drou.a.createBuilder();
        drotVar.getClass();
        eyev a = eykn.a(drnlVar.g);
        drotVar.copyOnWrite();
        drou drouVar = (drou) drotVar.instance;
        drouVar.c = a;
        drouVar.b |= 1;
        droo b = drpn.b(drnlVar);
        drotVar.copyOnWrite();
        drou drouVar2 = (drou) drotVar.instance;
        drouVar2.d = b;
        drouVar2.b |= 2;
        eyfy build = drotVar.build();
        build.getClass();
        return (drou) build;
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
        drpg drpgVar = (drpg) dpalVar;
        drou drouVar = (drou) eyhsVar;
        eyev eyevVar = drouVar.c;
        if (eyevVar == null) {
            eyevVar = eyev.a;
        }
        eyevVar.getClass();
        drpgVar.i(eykn.c(eyevVar));
        droo drooVar = drouVar.d;
        if (drooVar == null) {
            drooVar = droo.a;
        }
        drqs drqsVar = drooVar.g;
        if (drqsVar == null) {
            drqsVar = drqs.a;
        }
        drqsVar.getClass();
        drqt.c(drpgVar, drqsVar, new ffjm() { // from class: drpo
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                drpg drpgVar2 = (drpg) obj;
                drqr drqrVar = (drqr) obj2;
                drpgVar2.getClass();
                drqrVar.getClass();
                drqt.d(drpgVar2, drqrVar);
                return drpgVar2;
            }
        });
        droo drooVar2 = drouVar.d;
        if (drooVar2 == null) {
            drooVar2 = droo.a;
        }
        doyi doyiVar = drooVar2.f;
        if (doyiVar == null) {
            doyiVar = doyi.a;
        }
        doyiVar.getClass();
        doyo.d(drpgVar, doyiVar);
        return ffcu.a;
    }
}
