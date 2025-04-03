package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class enr extends ffkk implements ffjm {
    final /* synthetic */ ens a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enr(ens ensVar, int i) {
        super(2);
        this.a = ensVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            ens ensVar = this.a;
            int i2 = this.b;
            ehv a = ((enq) ensVar.a).a.a(i2);
            ((enc) a.c).a.a(ensVar.b, Integer.valueOf(i2 - a.a), hfdVar, 0);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
