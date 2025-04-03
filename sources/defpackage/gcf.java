package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcf extends ffkk implements ffji {
    final /* synthetic */ cyq a;
    final /* synthetic */ cyq b;
    final /* synthetic */ cyq c;
    final /* synthetic */ int d;
    final /* synthetic */ cyq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcf(cyq cyqVar, cyq cyqVar2, cyq cyqVar3, int i, cyq cyqVar4) {
        super(1);
        this.a = cyqVar;
        this.b = cyqVar2;
        this.c = cyqVar3;
        this.d = i;
        this.e = cyqVar4;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        csi csiVar = gdj.a(((gdj) ((cqw) obj).b()).a, 1) ? new csi(ctt.e(this.a, gca.a).a(ctt.l(this.b, 2)), ctt.m(this.c, 2).a(ctt.h(this.a, new gcb(this.d)))) : new csi(ctt.e(this.a, new gcc(this.d)).a(ctt.l(this.b, 2)), ctt.h(this.a, gcd.a).a(ctt.m(this.c, 2)));
        csiVar.d = new cwt(true, new gce(this.e));
        return csiVar;
    }
}
