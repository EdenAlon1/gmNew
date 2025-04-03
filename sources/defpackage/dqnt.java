package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqnt {
    public static final void a(int i, StringBuilder sb) {
        sb.append(Character.toChars(i));
    }

    public static final void b(List list, StringBuilder sb) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            dqql dqqlVar = dqof.c;
            a(intValue, sb);
        }
    }
}
