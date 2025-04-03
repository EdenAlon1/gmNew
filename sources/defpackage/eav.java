package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eav extends ffkk implements ffji {
    final /* synthetic */ eaw a;
    final /* synthetic */ iqk b;
    final /* synthetic */ ipq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eav(eaw eawVar, iqk iqkVar, ipq ipqVar) {
        super(1);
        this.a = eawVar;
        this.b = iqkVar;
        this.c = ipqVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        eaw eawVar = this.a;
        if (eawVar.c) {
            iqj.m(iqjVar, this.b, this.c.eo(eawVar.a), this.c.eo(this.a.b));
        } else {
            iqjVar.e(this.b, this.c.eo(eawVar.a), this.c.eo(this.a.b), 0.0f);
        }
        return ffcu.a;
    }
}
