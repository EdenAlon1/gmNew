package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiqg {
    private List a;

    public final List a() {
        List list = this.a;
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public final void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        if (this.a == null) {
            this.a = new ArrayList();
        }
        if (this.a.isEmpty()) {
            this.a.addAll(list);
            return;
        }
        throw null;
    }

    public final void c(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            b(((fipy) it.next()).e());
        }
    }
}
