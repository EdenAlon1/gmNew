package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xjq extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ xle c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xjq(ffgu ffguVar, xle xleVar) {
        super(3, ffguVar);
        this.c = xleVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xjq xjqVar = new xjq((ffgu) obj3, this.c);
        xjqVar.d = (ffxy) obj;
        xjqVar.b = obj2;
        return xjqVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r4 = this.d;
            ffxx b = xle.b((xlp) this.b, this.c.k);
            this.a = 1;
            if (ffyk.c(r4, b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
