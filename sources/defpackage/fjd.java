package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ fkk b;
    final /* synthetic */ fjh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjd(fkk fkkVar, fjh fjhVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = fkkVar;
        this.c = fjhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fjd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            fkk fkkVar = this.b;
            this.a = 1;
            fkkVar.a = 6.0f;
            fkkVar.b = 12.0f;
            fkkVar.c = 8.0f;
            fkkVar.d = 8.0f;
            Object b = fkkVar.b(this);
            if (b != ffhh.a) {
                b = ffcu.a;
            }
            if (b == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new fjd(this.b, this.c, ffguVar);
    }
}
