package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acga {
    public static final void a(List list, int i, acfj acfjVar, csjk csjkVar) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int a = ((ctwi) it.next()).a();
            if (((csmz) csjkVar.a()).d(i, a) == csod.AVAILABLE) {
                sb.append(a);
                sb.append(" ");
            } else {
                sb2.append(a);
                sb2.append(" ");
            }
        }
        String str = 1 != i ? "[SMS]" : "[MMS]";
        acfo a2 = acfjVar.a();
        a2.I(str);
        a2.A("availableSubIds", sb);
        a2.A("unavailableSubIds", sb2);
        a2.r();
    }
}
