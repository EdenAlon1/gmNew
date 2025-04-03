package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqb extends ffkk implements ffjn {
    final /* synthetic */ gpz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqb(gpz gpzVar) {
        super(3);
        this.a = gpzVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi d;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-1541271084);
        hkx b = cxo.b(this.a.b, gjb.a(1, hfdVar), hfdVar, 0, 12);
        hkx b2 = cxo.b(this.a.a, gjb.a(1, hfdVar), hfdVar, 0, 12);
        d = ebs.d((hvi) obj, 1.0f);
        int i = huo.a;
        hvi z = ebs.z(d, hum.g, 2);
        boolean D = hfdVar.D(b2);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = new gqa(b2);
            hfdVar.y(f);
        }
        hvi o = ebs.o(eau.a(z, (ffji) f), ((jzq) b.a()).a);
        hfdVar.o();
        return o;
    }
}
