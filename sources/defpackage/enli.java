package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enli implements enlc {
    public static final enli a = new enli();

    public static final enlk g(Object obj, int i, enlk enlkVar) {
        return enlkVar == null ? new enlk(obj, i) : new enlj(obj, i, enlkVar);
    }

    @Override // defpackage.enlc
    public final /* bridge */ /* synthetic */ enlb a(enlf enlfVar, enlb enlbVar, enlb enlbVar2) {
        enlk enlkVar = (enlk) enlbVar;
        enlk g = g(enlkVar.a, enlkVar.b, (enlk) enlbVar2);
        g.c = enlkVar.c;
        return g;
    }

    @Override // defpackage.enlc
    public final /* bridge */ /* synthetic */ enlb b(enlf enlfVar, Object obj, int i, enlb enlbVar) {
        return g(obj, i, (enlk) enlbVar);
    }

    @Override // defpackage.enlc
    public final /* synthetic */ enlf c(enme enmeVar, int i) {
        return new enll(enmeVar, i);
    }

    @Override // defpackage.enlc
    public final enlh d() {
        return enlh.STRONG;
    }

    @Override // defpackage.enlc
    public final enlh e() {
        return enlh.STRONG;
    }

    @Override // defpackage.enlc
    public final /* synthetic */ void f(enlf enlfVar, enlb enlbVar, Object obj) {
        ((enlk) enlbVar).c = obj;
    }
}
