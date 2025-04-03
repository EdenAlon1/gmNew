package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fli extends ffkk implements ffjm {
    final /* synthetic */ ffjn a;
    final /* synthetic */ ebq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fli(ffjn ffjnVar, ebq ebqVar) {
        super(2);
        this.a = ffjnVar;
        this.b = ebqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            hfdVar.v(-186854702);
            float b = fix.b(hfdVar);
            hfdVar.o();
            hfz.a(fiz.a.c(Float.valueOf(b)), hpx.d(-1705995688, new flh(this.a, this.b), hfdVar), hfdVar, 56);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
