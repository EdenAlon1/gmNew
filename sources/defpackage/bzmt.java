package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzmt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bznk b;
    final /* synthetic */ bzlq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzmt(bznk bznkVar, bzlq bzlqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = bznkVar;
        this.c = bzlqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzmt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        bznk.b.n().q("Update attemptPairingClientInfo");
        bznk bznkVar = this.b;
        final bzlq bzlqVar = this.c;
        comc n = bznkVar.n();
        ffji ffjiVar = new ffji() { // from class: bzms
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                bzma bzmaVar = (bzma) obj2;
                bzmaVar.getClass();
                bzly bzlyVar = (bzly) bzmaVar.toBuilder();
                bzlyVar.getClass();
                bzlyVar.copyOnWrite();
                bzma bzmaVar2 = (bzma) bzlyVar.instance;
                bzmaVar2.k = bzlq.this;
                bzmaVar2.b |= 4;
                return bzmb.b(bzlyVar);
            }
        };
        this.a = 1;
        Object d = n.d(ffjiVar, this);
        return d == ffhhVar ? ffhhVar : d;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzmt(this.b, this.c, ffguVar);
    }
}
