package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dran implements dpas, dpao {
    public static final draj h(dqzc dqzcVar) {
        dqzcVar.getClass();
        drai draiVar = (drai) draj.a.createBuilder();
        draiVar.getClass();
        draiVar.copyOnWrite();
        draj drajVar = (draj) draiVar.instance;
        drajVar.b |= 1;
        drajVar.c = dqzcVar.a;
        String str = dqzcVar.c;
        if (str != null) {
            draiVar.copyOnWrite();
            draj drajVar2 = (draj) draiVar.instance;
            drajVar2.b |= 4;
            drajVar2.e = str;
        }
        drak.b(drpn.b(dqzcVar), draiVar);
        boolean z = dqzcVar.d;
        draiVar.copyOnWrite();
        draj drajVar3 = (draj) draiVar.instance;
        drajVar3.b |= 8;
        drajVar3.f = z;
        return drak.a(draiVar);
    }

    public static final dqzc i(draj drajVar) {
        dral dralVar = new dral();
        j(dralVar, drajVar);
        return dralVar.b();
    }

    private static final void j(dral dralVar, draj drajVar) {
        if ((drajVar.b & 2) != 0) {
            String str = drajVar.c;
            str.getClass();
            dralVar.m(str);
            if ((drajVar.b & 4) != 0) {
                String str2 = drajVar.e;
                str2.getClass();
                dralVar.n(str2);
            }
            String str3 = drajVar.d;
            str3.getClass();
            dralVar.t(str3);
            return;
        }
        String str4 = drajVar.c;
        str4.getClass();
        dralVar.m(str4);
        if ((drajVar.b & 4) != 0) {
            String str5 = drajVar.e;
            str5.getClass();
            dralVar.n(str5);
        }
        droo drooVar = drajVar.g;
        if (drooVar == null) {
            drooVar = droo.a;
        }
        drqs drqsVar = drooVar.g;
        if (drqsVar == null) {
            drqsVar = drqs.a;
        }
        drqsVar.getClass();
        drqt.c(dralVar, drqsVar, new ffjm() { // from class: dram
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                dral dralVar2 = (dral) obj;
                drqr drqrVar = (drqr) obj2;
                dralVar2.getClass();
                drqrVar.getClass();
                drqt.d(dralVar2, drqrVar);
                return dralVar2;
            }
        });
        droo drooVar2 = drajVar.g;
        if (drooVar2 == null) {
            drooVar2 = droo.a;
        }
        doyi doyiVar = drooVar2.f;
        if (doyiVar == null) {
            doyiVar = doyi.a;
        }
        doyiVar.getClass();
        doyo.d(dralVar, doyiVar);
        dralVar.p(drajVar.f);
    }

    @Override // defpackage.dpao
    public final /* synthetic */ doxr a(eyhs eyhsVar) {
        draj drajVar = (draj) eyhsVar;
        drajVar.getClass();
        if ((drajVar.b & 2) == 0) {
            droo drooVar = drajVar.g;
            if (drooVar == null) {
                drooVar = droo.a;
            }
            drooVar.getClass();
            return drpn.a(drooVar);
        }
        drnx drnxVar = (drnx) droa.a.createBuilder();
        drnxVar.getClass();
        drnv drnvVar = (drnv) drnw.a.createBuilder();
        drnvVar.getClass();
        droq.b(drop.a(drnvVar), drnxVar);
        return new dqzn(droq.a(drnxVar));
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ dpal b() {
        return new dral();
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        draj drajVar = (draj) eyfy.parseFrom(draj.a, eyeeVar);
        drajVar.getClass();
        return drajVar;
    }

    @Override // defpackage.dpas
    public final /* bridge */ /* synthetic */ eyhs d(doxs doxsVar) {
        return h((dqzc) doxsVar);
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
        j((dral) dpalVar, (draj) eyhsVar);
        return ffcu.a;
    }
}
