package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amlh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amli b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amlh(amli amliVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amliVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amlh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        amli amliVar = this.b;
        bsol d = amliVar.d();
        this.a = 1;
        Object a = amliVar.a.a(d, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amlh(this.b, ffguVar);
    }
}
