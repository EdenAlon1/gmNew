package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcg extends ffkk implements ffjo {
    final /* synthetic */ Long a;
    final /* synthetic */ long b;
    final /* synthetic */ ffji c;
    final /* synthetic */ ffji d;
    final /* synthetic */ ham e;
    final /* synthetic */ ffmj f;
    final /* synthetic */ fzr g;
    final /* synthetic */ boolean h;
    final /* synthetic */ gae i;
    final /* synthetic */ dmug j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcg(Long l, long j, ffji ffjiVar, ffji ffjiVar2, ham hamVar, ffmj ffmjVar, gae gaeVar, dmug dmugVar, fzr fzrVar, boolean z) {
        super(4);
        this.a = l;
        this.b = j;
        this.c = ffjiVar;
        this.d = ffjiVar2;
        this.e = hamVar;
        this.f = ffmjVar;
        this.i = gaeVar;
        this.j = dmugVar;
        this.g = fzrVar;
        this.h = z;
    }

    @Override // defpackage.ffjo
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = ((gdj) obj2).a;
        hfd hfdVar = (hfd) obj3;
        ((Number) obj4).intValue();
        if (gdj.a(i, 0)) {
            hfdVar.v(-1869892773);
            gcy.l(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.j, this.g, hfdVar, 0);
            hfdVar.o();
        } else if (gdj.a(i, 1)) {
            hfdVar.v(-1869874171);
            fzp.b(this.a, this.c, this.e, this.f, this.i, this.j, this.g, this.h, hfdVar, 0);
            hfdVar.o();
        } else {
            hfdVar.v(-2131084003);
            hfdVar.o();
        }
        return ffcu.a;
    }
}
