package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evkq extends evkt implements Iterable {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.evkt
    public final String a() {
        int size = this.a.size();
        if (size == 1) {
            return ((evkt) this.a.get(0)).a();
        }
        throw new IllegalStateException(a.h(size, "Array must have size 1, but has size "));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof evkq) && ((evkq) obj).a.equals(this.a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<evkt> iterator() {
        return this.a.iterator();
    }
}
