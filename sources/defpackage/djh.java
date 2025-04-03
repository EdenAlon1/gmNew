package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class djh extends ffkk implements ffji {
    final /* synthetic */ dji a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djh(dji djiVar) {
        super(1);
        this.a = djiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        dji djiVar = this.a;
        float c = this.a.c() + floatValue + djiVar.b;
        float b = djiVar.b();
        dji djiVar2 = this.a;
        float e = ffmk.e(c, 0.0f, b);
        float c2 = e - djiVar2.c();
        int round = Math.round(c2);
        dji djiVar3 = this.a;
        djiVar3.f(djiVar3.c() + round);
        this.a.b = c2 - round;
        if (c != e) {
            floatValue = c2;
        }
        return Float.valueOf(floatValue);
    }
}
