package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enpo extends enbj {
    final Iterator a;
    final /* synthetic */ Set b;
    final /* synthetic */ Set c;

    public enpo(Set set, Set set2) {
        this.b = set;
        this.c = set2;
        this.a = set.iterator();
    }

    @Override // defpackage.enbj
    protected final Object a() {
        while (this.a.hasNext()) {
            Iterator it = this.a;
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
