package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class defk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ defp b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public defk(ffgu ffguVar, defp defpVar, int i) {
        super(2, ffguVar);
        this.b = defpVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((defk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        defp defpVar = this.b;
        agkk g = defpVar.a().g(deff.a(this.c), (cqoh) defpVar.b.b());
        this.a = 1;
        Object c = defpVar.c(g, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        defk defkVar = new defk(ffguVar, this.b, this.c);
        defkVar.d = obj;
        return defkVar;
    }
}
