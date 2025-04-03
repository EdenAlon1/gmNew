package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pld extends ffkk implements ffji {
    final /* synthetic */ float a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pld(float f) {
        super(1);
        this.a = f;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((Number) obj).floatValue();
        double d = this.a;
        boolean z = false;
        if (d >= eobe.a && d <= 1.0d && !ffdo.P(new Float[]{Float.valueOf(0.0f), Float.valueOf(1.0f)}, Float.valueOf(this.a))) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
