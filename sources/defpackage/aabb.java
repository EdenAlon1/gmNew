package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aabb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aabi b;
    final /* synthetic */ alxr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aabb(aabi aabiVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aabiVar;
        this.c = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aabb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aabi aabiVar = this.b;
            alxr alxrVar = this.c;
            this.a = 1;
            if (aabiVar.c(alxrVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aabb(this.b, this.c, ffguVar);
    }
}
