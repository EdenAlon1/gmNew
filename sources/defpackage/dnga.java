package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnga implements ffjm {
    final /* synthetic */ hho a;
    final /* synthetic */ List b;

    public dnga(hho hhoVar, List list) {
        this.a = hhoVar;
        this.b = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        idh a;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwho.a(dnaa.a(dmzz.cs, hfdVar), jii.a(R.string.list_item_actionable_more, hfdVar), null, 0L, hfdVar, 0, 12);
            boolean booleanValue = ((Boolean) this.a.a()).booleanValue();
            hfdVar.v(-1512319485);
            final hho hhoVar = this.a;
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = new ffix() { // from class: dnfw
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        dngm.c(hho.this, false);
                        return ffcu.a;
                    }
                };
                hfdVar.y(f);
            }
            ffix ffixVar = (ffix) f;
            hfdVar.o();
            if (((Boolean) dooy.b(hfdVar).j.invoke()).booleanValue()) {
                hfdVar.v(362835361);
                a = gft.c(hfdVar).f;
                hfdVar.o();
            } else {
                hfdVar.v(362897330);
                ebe ebeVar = dwht.a;
                a = dwht.a(hfdVar);
                hfdVar.o();
            }
            dwhw.b(booleanValue, ffixVar, null, 0L, null, null, a, 0L, 0.0f, hpx.d(-1554769429, new dnfz(this.b, this.a), hfdVar), hfdVar, 48, 48, 1980);
        }
        return ffcu.a;
    }
}
