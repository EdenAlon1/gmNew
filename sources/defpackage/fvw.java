package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvw extends ffkk implements ffjm {
    final /* synthetic */ long a;
    final /* synthetic */ ebe b;
    final /* synthetic */ ffjn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvw(long j, ebe ebeVar, ffjn ffjnVar) {
        super(2);
        this.a = j;
        this.b = ebeVar;
        this.c = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hca.a(this.a, gft.d(hfdVar).m, hpx.d(1327513942, new fvv(this.b, this.c), hfdVar), hfdVar, 384);
        }
        return ffcu.a;
    }
}
