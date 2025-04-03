package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvng {
    public static efkl a(String str, Collection collection) {
        Iterator it = collection.iterator();
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        if (it.hasNext()) {
            sb.append("account NOT IN(?");
            arrayList.add((String) it.next());
            while (it.hasNext()) {
                sb.append(", ?");
                arrayList.add((String) it.next());
            }
            sb.append(")");
        }
        return efkm.a(str, sb, arrayList);
    }
}
