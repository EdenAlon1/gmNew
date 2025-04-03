package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqjy extends ffhv implements ffji {
    final /* synthetic */ String a;
    final /* synthetic */ dqjz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqjy(String str, dqjz dqjzVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = str;
        this.b = dqjzVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        efkn a;
        ffci.b(obj);
        String str = this.a;
        if (str == null || ffpc.J(str)) {
            str = null;
        }
        if (str == null) {
            efkj efkjVar = dqjm.a;
            dqjz dqjzVar = this.b;
            efko efkoVar = new efko();
            efkoVar.b("\n      SELECT `context`, `time`, `search_term`\n      FROM `usages`\n      WHERE `search_term` IS NOT NULL\n      AND `type` = ?\n      ORDER BY `_ROWID_` DESC LIMIT ?\n      ");
            efkoVar.d(dqjzVar.f);
            efkoVar.c(100L);
            a = efkoVar.a();
        } else {
            efkj efkjVar2 = dqjm.a;
            dqjz dqjzVar2 = this.b;
            String str2 = this.a;
            str2.getClass();
            efko efkoVar2 = new efko();
            efkoVar2.b("\n      SELECT `context`, `time`, `search_term`\n      FROM `usages`\n      WHERE `type` = ?\n      AND `search_term` LIKE ?\n      ORDER BY `_ROWID_` DESC LIMIT ?\n      ");
            efkoVar2.d(dqjzVar2.f);
            efkoVar2.d(dqjm.a(str2).concat("%"));
            efkoVar2.c(100L);
            a = efkoVar2.a();
        }
        dqjz dqjzVar3 = this.b;
        return new ffxs(new dqjx(dqjzVar3, a, null, dqjzVar3));
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqjy(this.a, this.b, (ffgu) obj).b(ffcu.a);
    }
}
