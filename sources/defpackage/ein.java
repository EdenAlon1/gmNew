package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ein extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eiq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ein(eiq eiqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eiqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ein) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            eiq eiqVar = this.b;
            this.a = 1;
            if (eiqVar.e.f(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ein(this.b, ffguVar);
    }
}
