package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eyr extends ffkk implements ffji {
    final /* synthetic */ ipq a;
    final /* synthetic */ eys b;
    final /* synthetic */ iqk c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyr(ipq ipqVar, eys eysVar, iqk iqkVar, int i) {
        super(1);
        this.a = ipqVar;
        this.b = eysVar;
        this.c = iqkVar;
        this.d = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        eys eysVar = this.b;
        exq exqVar = (exq) eysVar.d.invoke();
        jpg jpgVar = exqVar != null ? exqVar.a : null;
        jwk jwkVar = eysVar.c;
        this.b.a.e(dqs.a, exh.a(this.a, eysVar.b, jwkVar, jpgVar, false, this.c.a), this.d, this.c.b);
        iqj.m(iqjVar, this.c, 0, Math.round(-this.b.a.b()));
        return ffcu.a;
    }
}
