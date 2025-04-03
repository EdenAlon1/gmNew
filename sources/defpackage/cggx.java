package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cggx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cghg b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cggx(ffgu ffguVar, cghg cghgVar) {
        super(2, ffguVar);
        this.b = cghgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cggx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cghg cghgVar = this.b;
        cggy cggyVar = cggy.a;
        this.a = 1;
        Object d = cghgVar.b.d(cggyVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cggx cggxVar = new cggx(ffguVar, this.b);
        cggxVar.c = obj;
        return cggxVar;
    }
}
