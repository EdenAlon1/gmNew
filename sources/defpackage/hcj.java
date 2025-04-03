package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcj extends ffkk implements ffjm {
    final /* synthetic */ ffjn a;
    final /* synthetic */ hcp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcj(ffjn ffjnVar, hcp hcpVar) {
        super(2);
        this.a = ffjnVar;
        this.b = hcpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.a(this.b, hfdVar, 6);
        }
        return ffcu.a;
    }
}
