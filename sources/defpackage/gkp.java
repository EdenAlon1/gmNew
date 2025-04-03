package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gkp extends ffkk implements ffji {
    final /* synthetic */ hkx a;
    final /* synthetic */ hkx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkp(hkx hkxVar, hkx hkxVar2) {
        super(1);
        this.a = hkxVar;
        this.b = hkxVar2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ifr ifrVar = (ifr) obj;
        float em = ifrVar.em(2.0f);
        float f = em / 2.0f;
        ifq.e(ifrVar, ((ibw) this.a.a()).i, ifrVar.em(10.0f) - f, 0L, new ifv(em, 0.0f, 0, 0, 30), 0, 108);
        if (Float.compare(((jzq) this.b.a()).a, 0.0f) > 0) {
            ifq.e(ifrVar, ((ibw) this.a.a()).i, ifrVar.em(((jzq) this.b.a()).a) - f, 0L, ifu.a, 0, 108);
        }
        return ffcu.a;
    }
}
