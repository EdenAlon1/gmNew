package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cqj extends ffkk implements ffjn {
    final /* synthetic */ hss a;
    final /* synthetic */ Object b;
    final /* synthetic */ cqw c;
    final /* synthetic */ ffjo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqj(hss hssVar, Object obj, cqw cqwVar, ffjo ffjoVar) {
        super(3);
        this.a = hssVar;
        this.b = obj;
        this.c = cqwVar;
        this.d = ffjoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        crw crwVar = (crw) obj;
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= true != ((intValue & 8) == 0 ? hfdVar.D(crwVar) : hfdVar.F(crwVar)) ? 2 : 4;
        }
        if (hfdVar.J((intValue & 19) != 18, intValue & 1)) {
            boolean D = hfdVar.D(this.a) | hfdVar.F(this.b) | hfdVar.F(this.c);
            hss hssVar = this.a;
            Object obj4 = this.b;
            cqw cqwVar = this.c;
            Object f = hfdVar.f();
            if (D || f == hfc.a) {
                f = new cqi(hssVar, obj4, cqwVar);
                hfdVar.y(f);
            }
            hgs.c(crwVar, (ffji) f, hfdVar);
            cqw cqwVar2 = this.c;
            Object obj5 = this.b;
            crwVar.getClass();
            cqwVar2.d.e(obj5, ((crx) crwVar).b);
            Object f2 = hfdVar.f();
            if (f2 == hfc.a) {
                f2 = new cqq(crwVar);
                hfdVar.y(f2);
            }
            this.d.a((cqq) f2, this.b, hfdVar, 0);
        } else {
            hfdVar.s();
        }
        return ffcu.a;
    }
}
