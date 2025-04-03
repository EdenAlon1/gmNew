package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drpk implements dpas, dpao {
    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ doxr a(eyhs eyhsVar) {
        drnt drntVar = (drnt) eyhsVar;
        drntVar.getClass();
        droo drooVar = drntVar.c;
        if (drooVar == null) {
            drooVar = droo.a;
        }
        drooVar.getClass();
        return drpn.a(drooVar);
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ dpal b() {
        return new drpf();
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        drnt drntVar = (drnt) eyfy.parseFrom(drnt.a, eyeeVar);
        drntVar.getClass();
        return drntVar;
    }

    @Override // defpackage.dpas
    public final /* bridge */ /* synthetic */ eyhs d(doxs doxsVar) {
        drns drnsVar = (drns) drnt.a.createBuilder();
        drnsVar.getClass();
        droo b = drpn.b((drni) doxsVar);
        drnsVar.copyOnWrite();
        drnt drntVar = (drnt) drnsVar.instance;
        drntVar.c = b;
        drntVar.b |= 1;
        eyfy build = drnsVar.build();
        build.getClass();
        return (drnt) build;
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
        drpf drpfVar = (drpf) dpalVar;
        drnt drntVar = (drnt) eyhsVar;
        droo drooVar = drntVar.c;
        if (drooVar == null) {
            drooVar = droo.a;
        }
        drqs drqsVar = drooVar.g;
        if (drqsVar == null) {
            drqsVar = drqs.a;
        }
        drqsVar.getClass();
        drqt.c(drpfVar, drqsVar, new ffjm() { // from class: drpj
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                drpf drpfVar2 = (drpf) obj;
                drqr drqrVar = (drqr) obj2;
                drpfVar2.getClass();
                drqrVar.getClass();
                drqt.d(drpfVar2, drqrVar);
                return drpfVar2;
            }
        });
        droo drooVar2 = drntVar.c;
        if (drooVar2 == null) {
            drooVar2 = droo.a;
        }
        doyi doyiVar = drooVar2.f;
        if (doyiVar == null) {
            doyiVar = doyi.a;
        }
        doyiVar.getClass();
        doyo.d(drpfVar, doyiVar);
        return ffcu.a;
    }
}
