package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnva implements ffjm {
    final /* synthetic */ hkx a;
    final /* synthetic */ dnve b;

    public dnva(hkx hkxVar, dnve dnveVar) {
        this.a = hkxVar;
        this.b = dnveVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        huo huoVar;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hvi a = jfw.a(hxe.a(hvi.e, ((Number) this.a.a()).floatValue()), "reactions_bar_popup_content");
            dnve dnveVar = this.b;
            dofg dofgVar = dnveVar.a;
            if (dofgVar.h.a) {
                int i = dnveVar.b.c - 1;
                if (i == 0) {
                    int i2 = huo.a;
                    huoVar = hum.d;
                } else if (i != 2) {
                    int i3 = huo.a;
                    huoVar = hum.f;
                } else {
                    int i4 = huo.a;
                    huoVar = hum.e;
                }
            } else {
                int i5 = huo.a;
                huoVar = hum.e;
            }
            dofe.c(new dofg(dofgVar.a, dofgVar.b, dofgVar.d, huoVar, dofgVar.h, dofgVar.i), a, hfdVar, 0, 0);
        }
        return ffcu.a;
    }
}
