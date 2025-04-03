package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dkf extends ffkk implements ffjn {
    final /* synthetic */ ffjm a;
    final /* synthetic */ hvi b;
    final /* synthetic */ ffix c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkf(ffjm ffjmVar, hvi hviVar, ffix ffixVar) {
        super(3);
        this.a = ffjmVar;
        this.b = hviVar;
        this.c = ffixVar;
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        djw djwVar = (djw) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != hfdVar.D(djwVar) ? 2 : 4;
        }
        if (hfdVar.J((intValue & 19) != 18, intValue & 1)) {
            ?? a = this.a.a(hfdVar, 0);
            if (ffpc.J(a)) {
                dwv.d("Label must not be blank");
            }
            dku.d((String) a, djwVar, this.b, this.c, hfdVar, (intValue << 6) & 896);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
