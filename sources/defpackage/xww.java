package defpackage;

import j$.time.Duration;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xww {
    private final drlk a;
    private final yay b;

    public xww(drlk drlkVar, yay yayVar) {
        this.a = drlkVar;
        this.b = yayVar;
    }

    public final xwv a(xwy xwyVar, List list) {
        Duration duration;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!xwyVar.c) {
            return xwv.a;
        }
        if (list.size() > xwyVar.e) {
            return xwv.b;
        }
        xzb xzbVar = new xzb(drme.c, this.a, Long.valueOf(xwyVar.b));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xhp xhpVar = (xhp) it.next();
            if ((xhq.b(xhpVar) instanceof drlv) && yay.a(xhpVar, xzbVar).a > xwyVar.b) {
                Duration duration2 = xwyVar.f;
                if (!(xhq.b(xhpVar) instanceof drlv)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (xhpVar instanceof xhk) {
                    duration = ((drnl) ((xhk) xhpVar).b).g;
                } else if ((xhpVar instanceof xhl) || (xhpVar instanceof xhj)) {
                    duration = null;
                } else {
                    if (!(xhpVar instanceof xho)) {
                        throw new ffcd();
                    }
                    duration = ((drnl) ((xho) xhpVar).a).g;
                }
                if (duration != null && duration.compareTo(duration2) > 0) {
                    return xwv.c;
                }
            }
        }
        return yay.b(list, new xzb(drme.c, this.a, Long.valueOf(xwyVar.b))).b > xwyVar.b ? list.size() > 1 ? xwv.e : xwv.d : xwv.f;
    }
}
