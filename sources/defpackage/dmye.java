package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmye implements ffjm {
    final /* synthetic */ dmyg a;

    public dmye(dmyg dmygVar) {
        this.a = dmygVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dmyf.a(this.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
