package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ixz extends ffkk implements ffjm {
    final /* synthetic */ iya a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ixz(iya iyaVar) {
        super(2);
        this.a = iyaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            this.a.d(hfdVar);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
