package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwul extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwuo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwul(cwuo cwuoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cwuoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwul) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cwuo cwuoVar = this.b;
        this.a = 1;
        Object a = cwuoVar.a(this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwul(this.b, ffguVar);
    }
}
