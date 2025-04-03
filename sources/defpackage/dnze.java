package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnze implements ffjn {
    final /* synthetic */ dnlz a;
    final /* synthetic */ int b;

    public dnze(dnlz dnlzVar, int i) {
        this.a = dnlzVar;
        this.b = i;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        ((crw) obj).getClass();
        hvi j = eba.j(hvi.e, 52.0f, 0.0f, 0.0f, 0.0f, 14);
        ArrayList arrayList = new ArrayList();
        dnlz dnlzVar = this.a;
        Iterator it = dnlzVar.d.iterator();
        while (it.hasNext()) {
            ffdx.w(arrayList, ((dnld) it.next()).a);
        }
        dlur.e(new dluu(dnlzVar.a, arrayList, 4), j, gft.a(hfdVar).q, jpo.y(gft.d(hfdVar).k, 0L, 0L, null, null, null, null, 0L, null, this.b, 0, 0L, null, null, 0, 16744447), null, 0L, null, false, null, hfdVar, 48, 496);
        return ffcu.a;
    }
}
