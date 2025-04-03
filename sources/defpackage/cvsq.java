package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvsq extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ cvsy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvsq(cvsy cvsyVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = cvsyVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        cvsq cvsqVar = new cvsq(this.c, (ffgu) obj3);
        cvsqVar.a = (cwir) obj;
        cvsqVar.b = (cvxm) obj2;
        return cvsqVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        if (this.b != null) {
            return null;
        }
        return this.c.b((cwir) obj2);
    }
}
