package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eda extends ffkk implements ffji {
    final /* synthetic */ edb a;
    final /* synthetic */ int b;
    final /* synthetic */ iqk c;
    final /* synthetic */ int d;
    final /* synthetic */ ipq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eda(edb edbVar, int i, iqk iqkVar, int i2, ipq ipqVar) {
        super(1);
        this.a = edbVar;
        this.b = i;
        this.c = iqkVar;
        this.d = i2;
        this.e = ipqVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i = this.b;
        ((iqj) obj).f(this.c, ((kaa) this.a.a.a(new kaf(((this.d - r2.b) & 4294967295L) | ((i - this.c.a) << 32)), this.e.q())).a, 0.0f);
        return ffcu.a;
    }
}
