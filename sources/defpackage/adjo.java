package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adjo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adjr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adjo(adjr adjrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = adjrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adjo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        adjr adjrVar = this.b;
        ejwa ejwaVar = ejwa.SAME_DAY;
        this.a = 1;
        Object d = adjrVar.d(ejwaVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adjo(this.b, ffguVar);
    }
}
