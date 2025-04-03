package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmz extends ffkk implements ffjm {
    final /* synthetic */ fke a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmz(fke fkeVar, ffjm ffjmVar) {
        super(2);
        this.a = fkeVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            hfz.a(fnd.a.c(this.a), this.b, hfdVar, 8);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
