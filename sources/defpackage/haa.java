package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class haa extends ffhu implements ffjm {
    int a;
    final /* synthetic */ ikk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public haa(ikk ikkVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ikkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((haa) c((iju) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        iju ijuVar = (iju) this.c;
        ikk ikkVar = this.b;
        this.a = 1;
        Object f = dtr.f(ijuVar, ikkVar, this);
        return f == ffhhVar ? ffhhVar : f;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        haa haaVar = new haa(this.b, ffguVar);
        haaVar.c = obj;
        return haaVar;
    }
}
