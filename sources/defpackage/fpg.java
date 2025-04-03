package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fpg extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fpg(ffjm ffjmVar, long j) {
        super(2);
        this.a = ffjmVar;
        this.b = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            hfdVar.v(-1177696538);
            hfz.a(fiz.a.c(Float.valueOf(ibw.a(this.b))), this.a, hfdVar, 8);
            hfdVar.o();
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
