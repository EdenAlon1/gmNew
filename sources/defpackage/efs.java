package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class efs extends ffkk implements ffjm {
    final /* synthetic */ eft a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efs(eft eftVar, int i) {
        super(2);
        this.a = eftVar;
        this.b = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            eft eftVar = this.a;
            int i2 = this.b;
            ehv a = eftVar.a.c.a(i2);
            ((efp) a.c).b.a(efx.a, Integer.valueOf(i2 - a.a), hfdVar, 6);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
