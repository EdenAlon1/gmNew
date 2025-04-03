package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnhe implements ffjm {
    final /* synthetic */ dmzz a;
    final /* synthetic */ dnhh b;

    public dnhe(dmzz dmzzVar, dnhh dnhhVar) {
        this.a = dmzzVar;
        this.b = dnhhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmzz dmzzVar = this.a;
            dnhh dnhhVar = this.b;
            dnhg.b(dmzzVar, dnhhVar.e, dnhhVar.c, hfdVar, 0);
        }
        return ffcu.a;
    }
}
