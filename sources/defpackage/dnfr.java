package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnfr implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ dngn b;

    public dnfr(hho hhoVar, dngn dngnVar) {
        this.a = hhoVar;
        this.b = dngnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        idh a;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwho.a(dnaa.a(dmzz.cs, hfdVar), jii.a(R.string.list_item_actionable_more, hfdVar), null, gft.a(hfdVar).s, hfdVar, 0, 4);
            boolean booleanValue = ((Boolean) this.a.a()).booleanValue();
            hfdVar.v(-1232428829);
            final hho hhoVar = this.a;
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new ffix() { // from class: dnfn
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dngm.e(hho.this, false);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            ffix ffixVar = (ffix) f;
            hfdVar.o();
            if (((Boolean) dooy.b(hfdVar).j.invoke()).booleanValue()) {
                hfdVar.v(449519289);
                a = gft.c(hfdVar).f;
                hfdVar.o();
            } else {
                hfdVar.v(449589194);
                ebe ebeVar = dwht.a;
                a = dwht.a(hfdVar);
                hfdVar.o();
            }
            dwhw.b(booleanValue, ffixVar, null, 0L, null, null, a, 0L, 0.0f, hpx.d(2115182265, new dnfq(this.b, this.a), hfdVar), hfdVar, 48, 48, 1980);
        }
        return ffcu.a;
    }
}
