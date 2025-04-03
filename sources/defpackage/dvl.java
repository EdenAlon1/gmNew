package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dvl extends ffkk implements ffji {
    final /* synthetic */ ffky a;
    final /* synthetic */ ffji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvl(ffky ffkyVar, ffji ffjiVar) {
        super(1);
        this.a = ffkyVar;
        this.b = ffjiVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        ffky ffkyVar = this.a;
        float f = ffkyVar.a - floatValue;
        ffkyVar.a = f;
        this.b.invoke(Float.valueOf(f));
        return ffcu.a;
    }
}
