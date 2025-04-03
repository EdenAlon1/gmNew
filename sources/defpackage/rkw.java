package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rkw {
    public List a = null;

    public final void a(rkw rkwVar) {
        List list = rkwVar.a;
        if (list == null) {
            return;
        }
        if (this.a == null) {
            this.a = new ArrayList(list.size());
        }
        Iterator it = rkwVar.a.iterator();
        while (it.hasNext()) {
            this.a.add((rkv) it.next());
        }
    }

    public final String toString() {
        if (this.a == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            sb.append(((rkv) it.next()).toString());
            sb.append('\n');
        }
        return sb.toString();
    }
}
