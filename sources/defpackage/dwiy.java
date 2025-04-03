package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwiy implements ffjn {
    final /* synthetic */ gmm a;
    final /* synthetic */ boolean b;
    final /* synthetic */ dwn c;

    public dwiy(dwn dwnVar, gmm gmmVar, boolean z) {
        this.c = dwnVar;
        this.a = gmmVar;
        this.b = z;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((gnn) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwiv.a.b(this.c, null, this.a, this.b, 0L, hfdVar, 196608, 18);
        }
        return ffcu.a;
    }
}
