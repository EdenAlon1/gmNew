package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drcv implements dpas, dpao {
    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ doxr a(eyhs eyhsVar) {
        drct drctVar = (drct) eyhsVar;
        drctVar.getClass();
        drer drerVar = drctVar.c;
        if (drerVar == null) {
            drerVar = drer.a;
        }
        drerVar.getClass();
        return dreu.a(drerVar);
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ dpal b() {
        return new drcu();
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        drct drctVar = (drct) eyfy.parseFrom(drct.a, eyeeVar);
        drctVar.getClass();
        return drctVar;
    }

    @Override // defpackage.dpas
    public final /* bridge */ /* synthetic */ eyhs d(doxs doxsVar) {
        drcs drcsVar = (drcs) drct.a.createBuilder();
        drcsVar.getClass();
        drer b = dreu.b((drcr) doxsVar);
        drcsVar.copyOnWrite();
        drct drctVar = (drct) drcsVar.instance;
        drctVar.c = b;
        drctVar.b |= 1;
        eyfy build = drcsVar.build();
        build.getClass();
        return (drct) build;
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
        drcu drcuVar = (drcu) dpalVar;
        drer drerVar = ((drct) eyhsVar).c;
        if (drerVar == null) {
            drerVar = drer.a;
        }
        drerVar.getClass();
        dreu.c(drcuVar, drerVar);
        return ffcu.a;
    }
}
