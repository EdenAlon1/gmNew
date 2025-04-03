package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkk extends ffkk implements ffix {
    final /* synthetic */ ffix a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkk(ffix ffixVar) {
        super(0);
        this.a = ffixVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        float floatValue = ((Number) this.a.invoke()).floatValue();
        if (floatValue < 0.0f) {
            floatValue = 0.0f;
        }
        if (floatValue > 1.0f) {
            floatValue = 1.0f;
        }
        return Float.valueOf(floatValue);
    }
}
