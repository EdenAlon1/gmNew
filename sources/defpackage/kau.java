package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kau {
    public static final Void a(String str) {
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void c(String str) {
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }

    public static /* synthetic */ String d(List list, CharSequence charSequence, ffji ffjiVar, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((i & 2) != 0 ? "" : null);
        int size = list.size();
        char c = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            char c2 = (i & 8) != 0 ? (char) 65535 : (char) 0;
            if (i2 >= size) {
                c = c2;
                break;
            }
            Object obj = list.get(i2);
            i3++;
            if (i3 > 1) {
                sb.append(1 != (i & 1) ? charSequence : ", ");
            }
            if (c2 >= 0 && i3 > 0) {
                break;
            }
            ffji ffjiVar2 = (i & 32) != 0 ? null : ffjiVar;
            if (ffjiVar2 != null) {
                sb.append((CharSequence) ffjiVar2.invoke(obj));
            } else if (obj == null || (obj instanceof CharSequence)) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
            i2++;
        }
        if (c >= 0 && i3 > 0) {
            sb.append((CharSequence) ((i & 16) != 0 ? "..." : null));
        }
        sb.append((CharSequence) ((i & 4) == 0 ? null : ""));
        return sb.toString();
    }
}
