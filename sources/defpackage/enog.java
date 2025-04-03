package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enog extends enom implements Serializable {
    private static final long serialVersionUID = 0;
    final enom a;

    public enog(enom enomVar) {
        this.a = enomVar;
    }

    @Override // defpackage.enom
    public final enom a() {
        return this.a.a();
    }

    @Override // defpackage.enom
    public final enom c() {
        return this.a.c().a();
    }

    @Override // defpackage.enom, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return this.a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof enog) {
            return this.a.equals(((enog) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (-921210296);
    }

    public final String toString() {
        return this.a.toString().concat(".nullsLast()");
    }

    @Override // defpackage.enom
    public final enom b() {
        return this;
    }
}
