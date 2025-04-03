package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dhu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dhw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhu(dhw dhwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dhwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dhu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx a = hkt.a(new dhs(this.b));
            dht dhtVar = new dht(this.b, null);
            this.a = 1;
            if (ffyk.b(a, dhtVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dhu(this.b, ffguVar);
    }
}
