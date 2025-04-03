package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drae extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drag b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drae(drag dragVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dragVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drae) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        efiv b = this.b.b();
        efkj efkjVar = dqzp.a;
        efko efkoVar = new efko();
        efkoVar.b("\n      SELECT COUNT(*)\n      FROM `emotify`\n      ");
        erph a = b.a(efkoVar.a());
        drag dragVar = this.b;
        drad dradVar = new drad(null);
        this.a = 1;
        Object a2 = dqkp.a(a, dragVar.b, dradVar, this);
        return a2 == ffhhVar ? ffhhVar : a2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drae(this.b, ffguVar);
    }
}
