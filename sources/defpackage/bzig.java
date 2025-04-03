package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzig extends ffhv implements ffjm {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ bzid c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzig(String str, bzid bzidVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = str;
        this.c = bzidVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzig) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        String str = this.b;
        bzid bzidVar = this.c;
        bzku bzkuVar = bzkv.a;
        bzif bzifVar = new bzif(bzidVar, null);
        this.a = 1;
        Object a = bzkuVar.a(str, 7, bzifVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzig(this.b, this.c, ffguVar);
    }
}
