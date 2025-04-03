package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbiz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbja b;
    final /* synthetic */ boolean c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbiz(ffgu ffguVar, dbja dbjaVar, boolean z) {
        super(2, ffguVar);
        this.b = dbjaVar;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbiz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl g = elfl.g(((acer) this.b.b.b.b()).b(this.c).t());
        g.getClass();
        this.a = 1;
        Object c = fgfz.c(g, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbiz dbizVar = new dbiz(ffguVar, this.b, this.c);
        dbizVar.d = obj;
        return dbizVar;
    }
}
