package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmpp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmpq b;
    final /* synthetic */ cmps c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmpp(cmpq cmpqVar, cmps cmpsVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmpqVar;
        this.c = cmpsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmpp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cmpq cmpqVar = this.b;
        cmps cmpsVar = this.c;
        this.a = 1;
        Object k = cmpqVar.k(cmpsVar, this);
        return k == ffhhVar ? ffhhVar : k;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmpp(this.b, this.c, ffguVar);
    }
}
