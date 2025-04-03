package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enpg extends enom implements Serializable {
    private static final long serialVersionUID = 0;
    final enom a;

    public enpg(enom enomVar) {
        this.a = enomVar;
    }

    @Override // defpackage.enom
    public final enom c() {
        return this.a;
    }

    @Override // defpackage.enom, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof enpg) {
            return this.a.equals(((enpg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
