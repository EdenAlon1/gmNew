package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ewa extends ffkk implements ffji {
    final /* synthetic */ ezy a;
    final /* synthetic */ jvj b;
    final /* synthetic */ jvu c;
    final /* synthetic */ eva d;
    final /* synthetic */ ibq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ewa(ezy ezyVar, jvj jvjVar, jvu jvuVar, eva evaVar, ibq ibqVar) {
        super(1);
        this.a = ezyVar;
        this.b = jvjVar;
        this.c = jvuVar;
        this.d = evaVar;
        this.e = ibqVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jpg jpgVar;
        ifo ifoVar = (ifo) obj;
        ifoVar.p();
        float c = this.a.c.c();
        if (c != 0.0f) {
            jvj jvjVar = this.b;
            int e = jpm.e(this.c.c);
            eva evaVar = this.d;
            int a = jvjVar.a(e);
            exq d = evaVar.d();
            iam iamVar = (d == null || (jpgVar = d.a) == null) ? new iam(0.0f, 0.0f, 0.0f, 0.0f) : jpgVar.n(a);
            float floor = (float) Math.floor(ifoVar.em(2.0f));
            float intBitsToFloat = Float.intBitsToFloat((int) (ifoVar.b() >> 32));
            float c2 = ffmk.c(floor, 1.0f);
            float f = c2 / 2.0f;
            int i = ((int) c2) % 2;
            double c3 = ffmk.c(ffmk.d(iamVar.b + f, intBitsToFloat - f), f);
            float floor2 = i == 1 ? ((float) Math.floor(c3)) + 0.5f : (float) Math.rint(c3);
            ifq.g(ifoVar, this.e, (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(iamVar.c) & 4294967295L), (Float.floatToRawIntBits(floor2) << 32) | (Float.floatToRawIntBits(iamVar.e) & 4294967295L), c2, c, 432);
        }
        return ffcu.a;
    }
}
