package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wyi extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ wyk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyi(wyk wykVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wykVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wyi) c((aaxe) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        aaxe aaxeVar = (aaxe) this.a;
        if (aaxeVar.a.size() != 1) {
            return new ffyg(null);
        }
        Object T = ffdx.T(aaxeVar.a);
        wyk wykVar = this.b;
        alxr alxrVar = (alxr) T;
        ffxx b = wykVar.e.b(alxrVar);
        int i = fgcz.a;
        return new wyh(fgbn.b(b, wykVar.b, fgcy.a, false), wykVar, alxrVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        wyi wyiVar = new wyi(this.b, ffguVar);
        wyiVar.a = obj;
        return wyiVar;
    }
}
