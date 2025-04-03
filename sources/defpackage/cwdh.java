package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwdh extends ffhv implements ffji {
    int a;
    final /* synthetic */ cwdp b;
    final /* synthetic */ aoku c;
    final /* synthetic */ aqux d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwdh(cwdp cwdpVar, aoku aokuVar, aqux aquxVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cwdpVar;
        this.c = aokuVar;
        this.d = aquxVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cwdp cwdpVar = this.b;
            aoku aokuVar = this.c;
            aqux aquxVar = this.d;
            this.a = 1;
            ((ecrj) cwdpVar.d.b()).e(alrv.t);
            Object a = ffra.a(ekxi.a(cwdpVar.b), new cwdi(null, cwdpVar, aokuVar, aquxVar, new cwdj(cwdpVar)), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cwdh(this.b, this.c, this.d, (ffgu) obj).b(ffcu.a);
    }
}
