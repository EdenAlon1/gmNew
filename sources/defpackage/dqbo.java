package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqbo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fvn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqbo(fvn fvnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fvnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqbo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fvn fvnVar = this.b;
            this.a = 1;
            if (fvnVar.a.g(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqbo(this.b, ffguVar);
    }
}
