package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class euj extends ffkk implements ffji {
    final /* synthetic */ ipq a;
    final /* synthetic */ euk b;
    final /* synthetic */ iqk c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public euj(ipq ipqVar, euk eukVar, iqk iqkVar, int i) {
        super(1);
        this.a = ipqVar;
        this.b = eukVar;
        this.c = iqkVar;
        this.d = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        euk eukVar = this.b;
        exq exqVar = (exq) eukVar.d.invoke();
        jpg jpgVar = exqVar != null ? exqVar.a : null;
        jwk jwkVar = eukVar.c;
        int i = eukVar.b;
        ipq ipqVar = this.a;
        this.b.a.e(dqs.b, exh.a(ipqVar, i, jwkVar, jpgVar, ipqVar.q() == kah.b, this.c.a), this.d, this.c.a);
        iqj.m(iqjVar, this.c, Math.round(-this.b.a.b()), 0);
        return ffcu.a;
    }
}
