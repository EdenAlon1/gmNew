package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enpk extends enbj {
    final Iterator a;
    final Iterator b;
    final /* synthetic */ Set c;
    final /* synthetic */ Set d;

    public enpk(Set set, Set set2) {
        this.c = set;
        this.d = set2;
        this.a = set.iterator();
        this.b = set2.iterator();
    }

    @Override // defpackage.enbj
    protected final Object a() {
        if (this.a.hasNext()) {
            return this.a.next();
        }
        while (this.b.hasNext()) {
            Iterator it = this.b;
            Set set = this.c;
            Object next = it.next();
            if (!set.contains(next)) {
                return next;
            }
        }
        b();
        return null;
    }
}
