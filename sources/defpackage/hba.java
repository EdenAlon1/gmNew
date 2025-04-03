package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hba extends ffkk implements ffji {
    final /* synthetic */ ipq a;
    final /* synthetic */ hbb b;
    final /* synthetic */ iqk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hba(ipq ipqVar, hbb hbbVar, iqk iqkVar) {
        super(1);
        this.a = ipqVar;
        this.b = hbbVar;
        this.c = iqkVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        float b = this.a.eu() ? this.b.a.p().b(this.b.a.j()) : this.b.a.d();
        dqs dqsVar = this.b.c;
        float f = dqsVar == dqs.b ? b : 0.0f;
        if (dqsVar != dqs.a) {
            b = 0.0f;
        }
        iqjVar.j(new haz(this.c, f, b));
        return ffcu.a;
    }
}
