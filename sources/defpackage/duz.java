package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class duz extends ffkk implements ffji {
    final /* synthetic */ dva a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duz(dva dvaVar, ffji ffjiVar) {
        super(1);
        this.a = dvaVar;
        this.b = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((Number) obj).longValue();
        dva dvaVar = this.a;
        float f = dvaVar.e;
        dvaVar.e = 0.0f;
        this.b.invoke(Float.valueOf(f));
        return ffcu.a;
    }
}
