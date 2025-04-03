package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnsk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnsm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnsk(cnsm cnsmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cnsmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnsk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cnsm cnsmVar = this.b;
        this.a = 1;
        Object m = cnsmVar.m(this);
        return m == ffhhVar ? ffhhVar : m;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cnsk(this.b, ffguVar);
    }
}
