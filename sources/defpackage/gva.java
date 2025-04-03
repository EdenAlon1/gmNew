package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gva extends ffkk implements ffjn {
    final /* synthetic */ dbe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gva(dbe dbeVar) {
        super(3);
        this.a = dbeVar;
    }

    private static final float b(hkx hkxVar) {
        return ((Number) hkxVar.a()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [cyq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [cyq, java.lang.Object] */
    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hfdVar.v(-1498516085);
        cyq a = gjb.a(2, hfdVar);
        cyq a2 = gjb.a(5, hfdVar);
        guz guzVar = new guz(a);
        dbe dbeVar = this.a;
        dbv dbvVar = dcp.a;
        boolean booleanValue = ((Boolean) dbeVar.e()).booleanValue();
        hfdVar.v(-1553362193);
        float f = true != booleanValue ? 0.8f : 1.0f;
        hfdVar.o();
        Float valueOf = Float.valueOf(f);
        boolean booleanValue2 = ((Boolean) dbeVar.f()).booleanValue();
        hfdVar.v(-1553362193);
        float f2 = true == booleanValue2 ? 1.0f : 0.8f;
        hfdVar.o();
        hkx f3 = dbs.f(dbeVar, valueOf, Float.valueOf(f2), guzVar.a(dbeVar.d(), hfdVar, 0), dbvVar, hfdVar, 196608);
        guy guyVar = new guy(a2);
        dbe dbeVar2 = this.a;
        dbv dbvVar2 = dcp.a;
        boolean booleanValue3 = ((Boolean) dbeVar2.e()).booleanValue();
        hfdVar.v(2073045083);
        float f4 = true != booleanValue3 ? 0.0f : 1.0f;
        hfdVar.o();
        Float valueOf2 = Float.valueOf(f4);
        boolean booleanValue4 = ((Boolean) dbeVar2.f()).booleanValue();
        hfdVar.v(2073045083);
        float f5 = true != booleanValue4 ? 0.0f : 1.0f;
        hfdVar.o();
        hvi b = icf.b(hviVar, b(f3), b(f3), ((Number) dbs.f(dbeVar2, valueOf2, Float.valueOf(f5), guyVar.a(dbeVar2.d(), hfdVar, 0), dbvVar2, hfdVar, 196608).a()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, 0, 131064);
        hfdVar.o();
        return b;
    }
}
