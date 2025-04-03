package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abbj extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ffbz c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abbj(ffgu ffguVar, ffbz ffbzVar) {
        super(3, ffguVar);
        this.c = ffbzVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        abbj abbjVar = new abbj((ffgu) obj3, this.c);
        abbjVar.d = (ffxy) obj;
        abbjVar.b = obj2;
        return abbjVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r4 = this.d;
            ffxx ffygVar = ((Boolean) this.b).booleanValue() ? (fgcq) this.c.a() : new ffyg(null);
            this.a = 1;
            if (ffyk.c(r4, ffygVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
