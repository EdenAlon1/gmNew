package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doyp implements dpas, dpao {
    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ doxr a(eyhs eyhsVar) {
        doyl doylVar = (doyl) eyhsVar;
        doylVar.getClass();
        doyi doyiVar = doylVar.c;
        if (doyiVar == null) {
            doyiVar = doyi.a;
        }
        doyiVar.getClass();
        return doyo.a(doyiVar);
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ dpal b() {
        return new doym();
    }

    @Override // defpackage.dpao
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        doyl doylVar = (doyl) eyfy.parseFrom(doyl.a, eyeeVar);
        doylVar.getClass();
        return doylVar;
    }

    @Override // defpackage.dpas
    public final /* bridge */ /* synthetic */ eyhs d(doxs doxsVar) {
        doyk doykVar = (doyk) doyl.a.createBuilder();
        doykVar.getClass();
        doyi b = doyo.b((doyd) doxsVar);
        doykVar.copyOnWrite();
        doyl doylVar = (doyl) doykVar.instance;
        doylVar.c = b;
        doylVar.b |= 1;
        eyfy build = doykVar.build();
        build.getClass();
        return (doyl) build;
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
        doym doymVar = (doym) dpalVar;
        doyi doyiVar = ((doyl) eyhsVar).c;
        if (doyiVar == null) {
            doyiVar = doyi.a;
        }
        doyiVar.getClass();
        doyo.d(doymVar, doyiVar);
        return ffcu.a;
    }
}
