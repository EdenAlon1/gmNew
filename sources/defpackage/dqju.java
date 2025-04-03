package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqju extends ffhv implements ffji {
    final /* synthetic */ dqjz a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqju(dqjz dqjzVar, int i, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = dqjzVar;
        this.b = i;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        efkj efkjVar = dqjm.a;
        efko efkoVar = new efko();
        efkoVar.b("\n      SELECT `value`, `context`, `time`, `search_term`\n      FROM `usages`\n      WHERE `type` = ?\n      ORDER BY `_ROWID_` DESC LIMIT ?\n      ");
        efkoVar.d(this.a.f);
        efkoVar.c(Long.valueOf(this.b));
        efkn a = efkoVar.a();
        dqjz dqjzVar = this.a;
        return new ffxs(new dqjt(dqjzVar, a, null, dqjzVar));
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dqju(this.a, this.b, (ffgu) obj).b(ffcu.a);
    }
}
