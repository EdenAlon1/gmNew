package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enlm implements enlc {
    public static final enlm a = new enlm();

    public static final enlo g(Object obj, int i, enlo enloVar) {
        return enloVar == null ? new enlo(obj, i) : new enln(obj, i, enloVar);
    }

    @Override // defpackage.enlc
    public final /* bridge */ /* synthetic */ enlb a(enlf enlfVar, enlb enlbVar, enlb enlbVar2) {
        enlp enlpVar = (enlp) enlfVar;
        enlo enloVar = (enlo) enlbVar;
        enlo enloVar2 = (enlo) enlbVar2;
        if (enlf.m(enloVar)) {
            return null;
        }
        enlo g = g(enloVar.a, enloVar.b, enloVar2);
        g.c = enloVar.c.b(enlpVar.g, g);
        return g;
    }

    @Override // defpackage.enlc
    public final /* bridge */ /* synthetic */ enlb b(enlf enlfVar, Object obj, int i, enlb enlbVar) {
        return g(obj, i, (enlo) enlbVar);
    }

    @Override // defpackage.enlc
    public final /* synthetic */ enlf c(enme enmeVar, int i) {
        return new enlp(enmeVar, i);
    }

    @Override // defpackage.enlc
    public final enlh d() {
        return enlh.STRONG;
    }

    @Override // defpackage.enlc
    public final enlh e() {
        return enlh.WEAK;
    }

    @Override // defpackage.enlc
    public final /* bridge */ /* synthetic */ void f(enlf enlfVar, enlb enlbVar, Object obj) {
        enlo enloVar = (enlo) enlbVar;
        enmb enmbVar = enloVar.c;
        enloVar.c = new enmc(((enlp) enlfVar).g, obj, enloVar);
        enmbVar.clear();
    }
}
