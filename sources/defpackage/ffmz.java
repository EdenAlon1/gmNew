package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffmz extends ffcz {
    private final Iterator a;
    private final HashSet b = new HashSet();

    public ffmz(Iterator it) {
        this.a = it;
    }

    @Override // defpackage.ffcz
    protected final void a() {
        while (this.a.hasNext()) {
            Iterator it = this.a;
            HashSet hashSet = this.b;
            Object next = it.next();
            if (hashSet.add(next)) {
                c(next);
                return;
            }
        }
        b();
    }
}
