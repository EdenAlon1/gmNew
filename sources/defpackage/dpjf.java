package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpjf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dplw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpjf(dplw dplwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dplwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpjf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffji b = this.b.b();
            this.a = 1;
            if (b.invoke(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpjf(this.b, ffguVar);
    }
}
