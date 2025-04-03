package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpja extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dplw b;
    final /* synthetic */ lkr c;
    final /* synthetic */ ixm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpja(dplw dplwVar, lkr lkrVar, ixm ixmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dplwVar;
        this.c = lkrVar;
        this.d = ixmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpja) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dplw dplwVar = this.b;
            lkr lkrVar = this.c;
            ixm ixmVar = this.d;
            ffjn d = dplwVar.d();
            this.a = 1;
            if (d.a(lkrVar, ixmVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dpja(this.b, this.c, this.d, ffguVar);
    }
}
