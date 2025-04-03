package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class foa extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foa(ffjm ffjmVar) {
        super(2);
        this.a = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            hfz.a(fiz.a.c(Float.valueOf(fix.b(hfdVar))), hpx.d(1939362236, new fnz(this.a), hfdVar), hfdVar, 56);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
