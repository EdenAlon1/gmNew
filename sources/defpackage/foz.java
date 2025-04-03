package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class foz extends ffkk implements ffjm {
    final /* synthetic */ float a;
    final /* synthetic */ long b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ boolean d;
    final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public foz(float f, long j, ffjm ffjmVar, boolean z, long j2) {
        super(2);
        this.a = f;
        this.b = j;
        this.c = ffjmVar;
        this.d = z;
        this.e = j2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        int intValue = ((Number) obj2).intValue();
        int i = intValue & 3;
        if (hfdVar.J(i != 2, intValue & 1)) {
            jpo a = jpp.a(fla.c(hfdVar).a, fla.c(hfdVar).d, this.a);
            boolean z = this.d;
            long j = this.e;
            if (z) {
                a = jpo.y(a, j, 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777214);
            }
            fpi.d(this.b, a, this.c, hfdVar, 384, 0);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
