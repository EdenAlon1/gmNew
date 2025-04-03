package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkp extends ffkk implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ djw b;
    final /* synthetic */ hvi c;
    final /* synthetic */ ffix d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkp(String str, djw djwVar, hvi hviVar, ffix ffixVar, int i) {
        super(2);
        this.a = str;
        this.b = djwVar;
        this.c = hviVar;
        this.d = ffixVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dku.d(this.a, this.b, this.c, this.d, (hfd) obj, hip.a(this.e | 1));
        return ffcu.a;
    }
}
