package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djyn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ djyt b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djyn(djyt djytVar, Object obj, Object obj2, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = djytVar;
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((djyn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        djyt djytVar = this.b;
        Object obj2 = this.c;
        Object obj3 = this.d;
        this.a = 1;
        if (djytVar.f(obj2, obj3, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new djyn(this.b, this.c, this.d, ffguVar);
    }
}
