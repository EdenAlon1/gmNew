package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class enes implements Comparable, Serializable {
    private static final long serialVersionUID = 0;
    final Comparable b;

    public enes(Comparable comparable) {
        this.b = comparable;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(enes enesVar) {
        if (enesVar == eneq.a) {
            return 1;
        }
        if (enesVar == eneo.a) {
            return -1;
        }
        int b = enop.b(this.b, enesVar.b);
        return b != 0 ? b : Boolean.compare(this instanceof enep, enesVar instanceof enep);
    }

    public Comparable b() {
        return this.b;
    }

    public abstract void c(StringBuilder sb);

    public abstract void d(StringBuilder sb);

    public abstract boolean e(Comparable comparable);

    public final boolean equals(Object obj) {
        if (obj instanceof enes) {
            try {
                if (compareTo((enes) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract int hashCode();
}
