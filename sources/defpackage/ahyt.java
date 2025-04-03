package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahyt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ahzb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyt(ahzb ahzbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ahzbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahyt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffxx a = ffyy.a(new ahys(new ahyp(this.b.c.a)));
            ahym ahymVar = new ahym(this.b);
            this.a = 1;
            if (a.a(ahymVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahyt(this.b, ffguVar);
    }
}
