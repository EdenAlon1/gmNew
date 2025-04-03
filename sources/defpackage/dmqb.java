package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmqb implements ffjm {
    final /* synthetic */ ebq a;
    final /* synthetic */ dlzq b;
    final /* synthetic */ hkx c;

    public dmqb(ebq ebqVar, dlzq dlzqVar, hkx hkxVar) {
        this.a = ebqVar;
        this.b = dlzqVar;
        this.c = hkxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ebq ebqVar = this.a;
            hkx hkxVar = this.c;
            dmqd.c(ebqVar, dmqd.h(hkxVar), this.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}
