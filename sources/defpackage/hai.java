package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hai extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ild b;
    final /* synthetic */ gvi c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hai(ild ildVar, gvi gviVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ildVar;
        this.c = gviVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((hai) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffsk ffskVar = (ffsk) this.d;
            ild ildVar = this.b;
            hah hahVar = new hah(ffskVar, this.c, null);
            this.a = 1;
            if (ildVar.p(hahVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        hai haiVar = new hai(this.b, this.c, ffguVar);
        haiVar.d = obj;
        return haiVar;
    }
}
