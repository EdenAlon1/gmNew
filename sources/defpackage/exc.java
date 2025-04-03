package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class exc extends ffkk implements ffji {
    final /* synthetic */ exk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exc(exk exkVar) {
        super(1);
        this.a = exkVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        float b = this.a.b() + floatValue;
        if (b > this.a.a()) {
            exk exkVar = this.a;
            floatValue = exkVar.a() - exkVar.b();
        } else if (b < 0.0f) {
            floatValue = -this.a.b();
        }
        exk exkVar2 = this.a;
        exkVar2.d(exkVar2.b() + floatValue);
        return Float.valueOf(floatValue);
    }
}
