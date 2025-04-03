package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzsa extends ffhv implements ffji {
    int a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzsa(ffji ffjiVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = ffjiVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffji ffjiVar = this.b;
            this.a = 1;
            if (ffjiVar.invoke(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new bzsa(this.b, (ffgu) obj).b(ffcu.a);
    }
}
