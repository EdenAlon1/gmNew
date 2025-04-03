package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsy extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ahtb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahsy(ahtb ahtbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ahtbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahsy) c((alxr) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        alxr alxrVar = (alxr) this.b;
        ahtb ahtbVar = this.c;
        ffhd a = ekxi.a(ahtbVar.e);
        ahsx ahsxVar = new ahsx(null, ahtbVar, alxrVar);
        this.a = 1;
        Object a2 = ffra.a(a, ahsxVar, this);
        return a2 == ffhhVar ? ffhhVar : a2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ahsy ahsyVar = new ahsy(this.c, ffguVar);
        ahsyVar.b = obj;
        return ahsyVar;
    }
}
