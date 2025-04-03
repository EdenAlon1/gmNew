package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczw implements xik {
    private final ffbr a;
    private final ffbr b;

    public aczw(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    @Override // defpackage.xik
    public final void a(xhu xhuVar) {
        if (ctjd.d()) {
            adao adaoVar = (adao) this.a.b();
            List<xhp> list = xhuVar.b;
            ArrayList arrayList = new ArrayList();
            for (xhp xhpVar : list) {
                xho xhoVar = xhpVar instanceof xho ? (xho) xhpVar : null;
                if (xhoVar != null) {
                    arrayList.add(xhoVar);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((xho) obj).a instanceof dqzc) {
                    arrayList2.add(obj);
                }
            }
            adaoVar.c = arrayList2.size();
            ((drau) this.b.b()).d();
        }
    }
}
