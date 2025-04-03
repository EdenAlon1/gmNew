package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogx extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ohc c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ogx(ffgu ffguVar, ohc ohcVar) {
        super(3, ffguVar);
        this.c = ohcVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ogx ogxVar = new ogx((ffgu) obj3, this.c);
        ogxVar.d = (ffxy) obj;
        ogxVar.b = obj2;
        return ogxVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r7 = this.d;
            ogp ogpVar = (ogp) this.b;
            oia oiaVar = ogpVar.a;
            ffud ffudVar = ogpVar.c;
            ojf ojfVar = new ojf(new fgbt(oiaVar.j, new ogv(null)), new ogr(this.c), new ogq(ogpVar.a));
            this.a = 1;
            if (r7.fQ(ojfVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
