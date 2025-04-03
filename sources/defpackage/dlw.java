package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlw extends ffkk implements ffix {
    final /* synthetic */ dly a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlw(dly dlyVar) {
        super(0);
        this.a = dlyVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        dly dlyVar = this.a;
        float a = dlyVar.k().a(dlyVar.f());
        dly dlyVar2 = this.a;
        float a2 = dlyVar2.k().a(dlyVar2.g()) - a;
        float abs = Math.abs(a2);
        float f = 1.0f;
        if (!Float.isNaN(abs) && abs > 1.0E-6f) {
            float c = (this.a.c() - a) / a2;
            if (c < 1.0E-6f) {
                f = 0.0f;
            } else if (c <= 0.999999f) {
                f = c;
            }
        }
        return Float.valueOf(f);
    }
}
