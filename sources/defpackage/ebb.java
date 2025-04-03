package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ebb extends ffkk implements ffji {
    final /* synthetic */ ebc a;
    final /* synthetic */ iqk b;
    final /* synthetic */ ipq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebb(ebc ebcVar, iqk iqkVar, ipq ipqVar) {
        super(1);
        this.a = ebcVar;
        this.b = iqkVar;
        this.c = ipqVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        ebc ebcVar = this.a;
        if (ebcVar.e) {
            iqj.m(iqjVar, this.b, this.c.eo(ebcVar.a), this.c.eo(this.a.b));
        } else {
            iqjVar.e(this.b, this.c.eo(ebcVar.a), this.c.eo(this.a.b), 0.0f);
        }
        return ffcu.a;
    }
}
