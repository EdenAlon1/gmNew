package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fie extends ffkk implements ffix {
    final /* synthetic */ fig a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fie(fig figVar) {
        super(0);
        this.a = figVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        fig figVar = this.a;
        figVar.d();
        figVar.b();
        fig figVar2 = this.a;
        figVar2.d();
        figVar2.b.a();
        float abs = Math.abs(Float.NaN);
        float f = 1.0f;
        if (!Float.isNaN(abs) && abs > 1.0E-6f) {
            fig figVar3 = this.a;
            if (Float.isNaN(figVar3.a())) {
                throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
            }
            float a = (figVar3.a() + Float.NaN) / Float.NaN;
            if (a < 1.0E-6f) {
                f = 0.0f;
            } else if (a <= 0.999999f) {
                f = a;
            }
        }
        return Float.valueOf(f);
    }
}
