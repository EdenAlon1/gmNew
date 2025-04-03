package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwv extends ffkk implements ffji {
    final /* synthetic */ cww a;
    final /* synthetic */ iqk b;
    final /* synthetic */ long c;
    final /* synthetic */ ipq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwv(cww cwwVar, iqk iqkVar, long j, ipq ipqVar) {
        super(1);
        this.a = cwwVar;
        this.b = iqkVar;
        this.c = j;
        this.d = ipqVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long floatToRawIntBits;
        iqj iqjVar = (iqj) obj;
        cuq cuqVar = (cuq) this.a.a.a();
        if (!((Boolean) ((ffix) this.a.b.a()).invoke()).booleanValue() || cuqVar == null) {
            iqjVar.e(this.b, 0, 0, 0.0f);
        } else {
            long j = this.a.c;
            if (((int) (j >> 32)) == 0 || ((int) (j & 4294967295L)) == 0) {
                long floatToRawIntBits2 = Float.floatToRawIntBits(1.0f);
                int i = iqu.a;
                floatToRawIntBits = (Float.floatToRawIntBits(1.0f) & 4294967295L) | (floatToRawIntBits2 << 32);
            } else {
                floatToRawIntBits = cuqVar.a.a(kag.d(j), kag.d(this.c));
            }
            huo huoVar = cuqVar.b;
            float intBitsToFloat = ((int) (this.a.c >> 32)) * Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            cww cwwVar = this.a;
            long a = huoVar.a((ffln.b(intBitsToFloat) << 32) | (4294967295L & ffln.b(((int) (cwwVar.c & 4294967295L)) * Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)))), this.c, this.d.q());
            iqj.p(iqjVar, this.b, kaa.a(a), kaa.b(a), new cwu(floatToRawIntBits), 4);
        }
        return ffcu.a;
    }
}
