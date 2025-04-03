package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class edq extends ffkk implements ffjm {
    final /* synthetic */ edr a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public edq(edr edrVar, int i) {
        super(2);
        this.a = edrVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            edr edrVar = this.a;
            int i2 = this.b;
            ehv a = edrVar.a.a.a(i2);
            ((edl) a.c).a.a(edrVar.b, Integer.valueOf(i2 - a.a), hfdVar, 0);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
