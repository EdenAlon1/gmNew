package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hag extends ffhv implements ffjm {
    int a;
    final /* synthetic */ gvi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hag(gvi gviVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = gviVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hag) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            gvi gviVar = this.b;
            dhy dhyVar = dhy.b;
            this.a = 1;
            if (gviVar.a(dhyVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new hag(this.b, ffguVar);
    }
}
