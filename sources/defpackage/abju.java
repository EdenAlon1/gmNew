package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abju extends ffhv implements ffjm {
    int a;
    final /* synthetic */ abjx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abju(abjx abjxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = abjxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abju) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            abjx abjxVar = this.b;
            ffxx e = abjxVar.a.e();
            abjt abjtVar = new abjt(abjxVar);
            this.a = 1;
            if (e.a(abjtVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abju(this.b, ffguVar);
    }
}
