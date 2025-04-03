package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tzr extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ tzs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tzr(tzs tzsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = tzsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tzr) c((bfki) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            bfki bfkiVar = (bfki) this.b;
            ffhd a = ekxi.a(this.c.a);
            tzq tzqVar = new tzq(null, bfkiVar);
            this.a = 1;
            obj = ffra.a(a, tzqVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        obj.getClass();
        return obj;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        tzr tzrVar = new tzr(this.c, ffguVar);
        tzrVar.b = obj;
        return tzrVar;
    }
}
