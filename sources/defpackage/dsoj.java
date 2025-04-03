package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsoj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsol b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsoj(dsol dsolVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsolVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsoj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl g = elfl.g(this.b.b.a());
        g.getClass();
        this.a = 1;
        Object c = fgfz.c(g, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsoj(this.b, ffguVar);
    }
}
