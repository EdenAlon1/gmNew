package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceyj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceyo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceyj(ceyo ceyoVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ceyoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceyj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object e = ceyo.a.e();
            e.getClass();
            long longValue = ((Number) e).longValue();
            this.a = 1;
            if (ffsw.c(longValue, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        this.b.d.h(ffcu.a);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ceyj(this.b, ffguVar);
    }
}
