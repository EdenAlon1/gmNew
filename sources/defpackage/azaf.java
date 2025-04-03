package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azaf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjm b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azaf(ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azaf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffsk ffskVar = (ffsk) this.c;
        ffjm ffjmVar = this.b;
        this.a = 1;
        Object a = ffjmVar.a(ffskVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azaf azafVar = new azaf(this.b, ffguVar);
        azafVar.c = obj;
        return azafVar;
    }
}
