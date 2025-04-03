package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class enx extends ffkk implements ffji {
    final /* synthetic */ ejq a;
    final /* synthetic */ long b;
    final /* synthetic */ ens c;
    final /* synthetic */ long d;
    final /* synthetic */ dqs e;
    final /* synthetic */ hun f;
    final /* synthetic */ hus g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enx(ejq ejqVar, long j, ens ensVar, long j2, dqs dqsVar, hun hunVar, hus husVar) {
        super(1);
        this.a = ejqVar;
        this.b = j;
        this.c = ensVar;
        this.d = j2;
        this.e = dqsVar;
        this.f = hunVar;
        this.g = husVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        long j = this.b;
        ens ensVar = this.c;
        long j2 = this.d;
        dqs dqsVar = this.e;
        hun hunVar = this.f;
        hus husVar = this.g;
        ejq ejqVar = this.a;
        return eny.a(ejqVar, intValue, j, ensVar, j2, dqsVar, hunVar, husVar, ejqVar.q());
    }
}
