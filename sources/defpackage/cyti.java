package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyti implements ffjm {
    final /* synthetic */ dmzz a;
    final /* synthetic */ String b;
    final /* synthetic */ boolean c;

    public cyti(dmzz dmzzVar, String str, boolean z) {
        this.a = dmzzVar;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        long j;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            igq a = dnaa.a(this.a, hfdVar);
            String str = this.b;
            if (this.c) {
                hfdVar.v(1153546367);
                j = gft.a(hfdVar).d;
                hfdVar.o();
            } else {
                hfdVar.v(1153621480);
                j = gft.a(hfdVar).q;
                hfdVar.o();
            }
            dwho.a(a, str, null, j, hfdVar, 0, 4);
        }
        return ffcu.a;
    }
}
