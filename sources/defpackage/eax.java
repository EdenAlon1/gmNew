package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eax extends ffkk implements ffji {
    final /* synthetic */ eay a;
    final /* synthetic */ ipq b;
    final /* synthetic */ iqk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eax(eay eayVar, ipq ipqVar, iqk iqkVar) {
        super(1);
        this.a = eayVar;
        this.b = ipqVar;
        this.c = iqkVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        long j = ((kaa) this.a.a.invoke(this.b)).a;
        if (this.a.b) {
            iqj.n(iqjVar, this.c, kaa.a(j), kaa.b(j));
        } else {
            iqj.p(iqjVar, this.c, kaa.a(j), kaa.b(j), null, 12);
        }
        return ffcu.a;
    }
}
