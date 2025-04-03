package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dogt implements ffjn {
    final /* synthetic */ dogf a;
    final /* synthetic */ dogf b;

    public dogt(dogf dogfVar, dogf dogfVar2) {
        this.a = dogfVar;
        this.b = dogfVar2;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((eag) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dogf dogfVar = this.a;
            hfdVar.v(1121454856);
            dogw.j(dogfVar, hfdVar, 0);
            hfdVar.o();
            hfdVar.v(1121455949);
            ebv.a(ebs.o(hvi.e, 8.0f), hfdVar);
            hfdVar.o();
            dogw.i(this.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}
