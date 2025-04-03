package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dva b;
    final /* synthetic */ dmt c;
    final /* synthetic */ dmk d;
    final /* synthetic */ ffud e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmr(dva dvaVar, dmt dmtVar, dmk dmkVar, ffud ffudVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dvaVar;
        this.c = dmtVar;
        this.d = dmkVar;
        this.e = ffudVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmr) c((dsl) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dsl dslVar = (dsl) this.f;
            this.b.e = this.c.a(this.d);
            dva dvaVar = this.b;
            dmt dmtVar = this.c;
            dmp dmpVar = new dmp(dmtVar, this.e, dslVar);
            dmq dmqVar = new dmq(dmtVar, dvaVar, this.d);
            this.a = 1;
            if (dvaVar.a(dmpVar, dmqVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dmr dmrVar = new dmr(this.b, this.c, this.d, this.e, ffguVar);
        dmrVar.f = obj;
        return dmrVar;
    }
}
