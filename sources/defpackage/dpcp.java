package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpcp extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public dpcp(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dpcp dpcpVar = new dpcp((ffgu) obj3);
        dpcpVar.c = (ffxy) obj;
        dpcpVar.b = obj2;
        return dpcpVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            obj2 = this.c;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ffxy ffxyVar = (ffxy) this.c;
            Object obj3 = this.b;
            this.c = obj3;
            this.a = 1;
            if (ffxyVar.fQ(obj3, this) == ffhhVar) {
                return ffhhVar;
            }
            obj2 = obj3;
        }
        return Boolean.valueOf(!(((dpdf) obj2) instanceof dpdd));
    }
}
