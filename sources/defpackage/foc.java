package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class foc extends ffkk implements ffjm {
    final /* synthetic */ fnv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foc(fnv fnvVar) {
        super(2);
        this.a = fnvVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            fqi.b(this.a.a, null, 0L, 0L, 0L, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131070);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
