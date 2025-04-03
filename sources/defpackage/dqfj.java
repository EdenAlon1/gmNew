package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqfj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dpnn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqfj(dpnn dpnnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dpnnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqfj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dpnn dpnnVar = this.b;
            this.a = 1;
            if (dpnnVar.C(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqfj(this.b, ffguVar);
    }
}
