package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkp extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fkp(ffjm ffjmVar) {
        super(2);
        this.a = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            fqi.a(fla.c(hfdVar).c, hpx.d(-1567914264, new fko(this.a), hfdVar), hfdVar, 48);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
