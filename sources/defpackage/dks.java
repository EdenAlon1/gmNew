package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dks extends ffkk implements ffjm {
    final /* synthetic */ djw a;
    final /* synthetic */ hvi b;
    final /* synthetic */ ffji c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dks(djw djwVar, hvi hviVar, ffji ffjiVar) {
        super(2);
        this.a = djwVar;
        this.b = hviVar;
        this.c = ffjiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            djw djwVar = this.a;
            dku.a(djwVar, this.b, hpx.d(1156688164, new dkr(this.c, djwVar), hfdVar), hfdVar, 384);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
