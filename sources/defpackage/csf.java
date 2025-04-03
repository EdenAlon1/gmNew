package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class csf extends ffkk implements ffji {
    final /* synthetic */ idy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csf(idy idyVar) {
        super(1);
        this.a = idyVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        cya cyaVar = (cya) obj;
        float f = cyaVar.b;
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = cyaVar.c;
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        float f3 = cyaVar.d;
        float f4 = f3 >= -0.5f ? f3 : -0.5f;
        float f5 = cyaVar.a;
        float f6 = f5 >= 0.0f ? f5 : 0.0f;
        float[] fArr = ieg.a;
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        if (f4 > 0.5f) {
            f4 = 0.5f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        return new ibw(ibw.e(iby.f(f, f2, f4, f6, ieg.x), this.a));
    }
}
