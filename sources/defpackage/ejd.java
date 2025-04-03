package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ejd extends ffkk implements ffjm {
    final /* synthetic */ ejg a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejd(ejg ejgVar, int i, Object obj) {
        super(2);
        this.a = ejgVar;
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            this.a.e(this.b, this.c, hfdVar);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
