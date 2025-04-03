package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmdr implements ffjm {
    final /* synthetic */ dmdt a;
    final /* synthetic */ dmck b;

    public dmdr(dmdt dmdtVar, dmck dmckVar) {
        this.a = dmdtVar;
        this.b = dmckVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            cqn.a(this.a, null, null, null, "banner_card_content_anim", null, hpx.d(1779423906, new dmdq(this.b), hfdVar), hfdVar, 1597440, 46);
        }
        return ffcu.a;
    }
}
