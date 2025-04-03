package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yyp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yyu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yyp(yyu yyuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yyuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yyp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            yyu yyuVar = this.b;
            aimz aimzVar = new aimz(ctuf.LOCATION_PERMISSIONS);
            this.a = 1;
            if (yyuVar.c.f(aimzVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yyp(this.b, ffguVar);
    }
}
