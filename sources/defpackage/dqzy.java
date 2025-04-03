package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqzy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drag b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqzy(drag dragVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dragVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqzy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        String str = this.c;
        str.getClass();
        efko efkoVar = new efko();
        efkoVar.b("\n      SELECT *\n      FROM `emotify`\n      WHERE `id` = ?\n      ");
        efkoVar.d(str);
        erph a = b.a(efkoVar.a());
        drag dragVar = this.b;
        dqzx dqzxVar = new dqzx(dragVar, null);
        this.a = 1;
        Object a2 = dqkp.a(a, dragVar.b, dqzxVar, this);
        return a2 == ffhhVar ? ffhhVar : a2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dqzy(this.b, this.c, ffguVar);
    }
}
