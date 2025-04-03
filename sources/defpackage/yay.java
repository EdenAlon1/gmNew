package defpackage;

import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yay {
    public static final yax a(xhp xhpVar, xzb xzbVar) {
        xhpVar.getClass();
        if (xhpVar instanceof xho) {
            return c(((xho) xhpVar).a, xzbVar, xhq.d(xhpVar));
        }
        if (xhpVar instanceof xhk) {
            return c(((xhk) xhpVar).b, xzbVar, xhq.d(xhpVar));
        }
        if (!(xhpVar instanceof xhl)) {
            if (xhpVar instanceof xhj) {
                return c(((xhj) xhpVar).b, xzbVar, xhq.d(xhpVar));
            }
            throw new ffcd();
        }
        xhl xhlVar = (xhl) xhpVar;
        Long l = xhlVar.d;
        long longValue = l != null ? l.longValue() : 0L;
        Long l2 = xhlVar.d;
        if (true == xhq.d(xhpVar)) {
            l2 = null;
        }
        return new yax(longValue, l2 != null ? l2.longValue() : 0L);
    }

    public static final yax b(List list, xzb xzbVar) {
        list.getClass();
        ArrayList<yax> arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((xhp) it.next(), xzbVar));
        }
        yax yaxVar = new yax(0L, 0L);
        for (yax yaxVar2 : arrayList) {
            yaxVar2.getClass();
            long j = yaxVar.a;
            long j2 = yaxVar.b;
            yaxVar = new yax(j + yaxVar2.a, j2 + yaxVar2.b);
        }
        return yaxVar;
    }

    private static final yax c(doxs doxsVar, xzb xzbVar, boolean z) {
        Long l;
        if (doxsVar instanceof drli) {
            drlh f = drma.f((drli) doxsVar, xzbVar.b, xzbVar.a, xzbVar.c);
            long a = f.a();
            Long valueOf = Long.valueOf(f.a());
            valueOf.longValue();
            l = true != z ? valueOf : null;
            return new yax(a, l != null ? l.longValue() : 0L);
        }
        if (!(doxsVar instanceof doyc)) {
            if (doxsVar instanceof RichLocation) {
                return new yax(0L, 0L);
            }
            Objects.toString(doxsVar);
            throw new UnsupportedOperationException("Cannot get size metadata for ".concat(doxsVar.toString()));
        }
        doyc doycVar = (doyc) doxsVar;
        long a2 = doycVar.a();
        Long valueOf2 = Long.valueOf(doycVar.a());
        valueOf2.longValue();
        l = true != z ? valueOf2 : null;
        return new yax(a2, l != null ? l.longValue() : 0L);
    }
}
