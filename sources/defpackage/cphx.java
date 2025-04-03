package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
abstract class cphx extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        espr esprVar = (espr) obj;
        awun awunVar = (awun) awup.a.createBuilder();
        String c = esprVar.c();
        awunVar.copyOnWrite();
        awup awupVar = (awup) awunVar.instance;
        awupVar.b |= 1;
        awupVar.c = c;
        String b = esprVar.b();
        awunVar.copyOnWrite();
        awup awupVar2 = (awup) awunVar.instance;
        awupVar2.b |= 2;
        awupVar2.d = b;
        awunVar.a(enhk.j(esprVar.a()));
        return (awup) awunVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        awup awupVar = (awup) obj;
        espl esplVar = new espl();
        if ((awupVar.b & 1) != 0) {
            esplVar.f(awupVar.c);
        }
        if ((awupVar.b & 2) != 0) {
            esplVar.e(awupVar.d);
        }
        c(awupVar, esplVar);
        return esplVar.g();
    }

    public abstract void c(awup awupVar, espq espqVar);
}
