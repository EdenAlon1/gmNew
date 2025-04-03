package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class elj extends ffkk implements ffjm {
    final /* synthetic */ ffjn a;
    final /* synthetic */ eli b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public elj(ffjn ffjnVar, eli eliVar) {
        super(2);
        this.a = ffjnVar;
        this.b = eliVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            this.a.a(this.b, hfdVar, 0);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
