package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzmr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bznk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzmr(bznk bznkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bznkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzmr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        comc n = this.b.n();
        ffji ffjiVar = new ffji() { // from class: bzmq
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                bzma bzmaVar = (bzma) obj2;
                bzmaVar.getClass();
                bzly bzlyVar = (bzly) bzmaVar.toBuilder();
                bzlyVar.getClass();
                bzmb.d(false, bzlyVar);
                return bzmb.b(bzlyVar);
            }
        };
        this.a = 1;
        Object d = n.d(ffjiVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzmr(this.b, ffguVar);
    }
}
