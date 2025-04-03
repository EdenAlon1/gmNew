package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fes extends ffkk implements ffji {
    public static final fes a = new fes();

    public fes() {
        super(1);
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        cxy cxyVar = (cxy) obj;
        float f = cxyVar.a;
        float f2 = cxyVar.b;
        return new iak((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
    }
}
