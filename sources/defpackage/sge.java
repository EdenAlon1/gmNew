package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sge extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ sgn c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sge(sgn sgnVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = sgnVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        sge sgeVar = new sge(this.c, (ffgu) obj3);
        sgeVar.d = (sgr) obj;
        sgeVar.b = (ceuw) obj2;
        return sgeVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ceuw, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.d;
        ?? r1 = this.b;
        sgn sgnVar = this.c;
        obj2.getClass();
        this.d = null;
        this.a = 1;
        Object a = ffra.a(ekxi.a(sgnVar.a), new sgm(null, sgnVar, r1, (sgr) obj2), this);
        return a == ffhhVar ? ffhhVar : a;
    }
}
