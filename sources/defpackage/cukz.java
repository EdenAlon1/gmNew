package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cukz {
    public final Set a;

    public cukz() {
        this((Set) ffen.a);
    }

    public final int a() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((cukx) it.next()).l;
        }
        return i;
    }

    public final boolean b() {
        Set set = this.a;
        if (set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((cukx) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        Set set = this.a;
        if (set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((cukx) it.next()).c()) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        if (e() || c()) {
            return false;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (!((cukx) it.next()).b()) {
                return false;
            }
        }
        return true;
    }

    public final boolean e() {
        return this.a.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof cukz)) {
            return false;
        }
        return ffkj.e(this.a, ((cukz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cukz(Collection collection) {
        this(ffdx.ar(collection));
        collection.getClass();
    }

    public cukz(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((cukx) obj) != cukx.a) {
                arrayList.add(obj);
            }
        }
        this.a = ffdx.ar(arrayList);
    }
}
