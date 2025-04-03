package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnwf implements ffjm {
    final /* synthetic */ dmzz a;
    final /* synthetic */ boolean b;
    final /* synthetic */ boolean c;
    final /* synthetic */ long d;
    final /* synthetic */ String e;

    public dnwf(dmzz dmzzVar, boolean z, boolean z2, long j, String str) {
        this.a = dmzzVar;
        this.b = z;
        this.c = z2;
        this.d = j;
        this.e = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dnwg.g(this.a, this.b, this.c, this.d, this.e, hfdVar, 0);
        }
        return ffcu.a;
    }
}
