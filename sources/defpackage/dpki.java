package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpki extends ffhv implements ffji {
    int a;
    final /* synthetic */ dplw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpki(dplw dplwVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dplwVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dplc dplcVar = ((dplq) this.b).b;
            this.a = 1;
            if (dplcVar.e(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dpki(this.b, (ffgu) obj).b(ffcu.a);
    }
}
