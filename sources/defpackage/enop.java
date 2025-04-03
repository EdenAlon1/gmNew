package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class enop extends enoq implements Serializable, emxg {
    public static final enop a = new enop(eneq.a, eneo.a);
    private static final long serialVersionUID = 0;
    public final enes b;
    public final enes c;

    public enop(enes enesVar, enes enesVar2) {
        this.b = enesVar;
        this.c = enesVar2;
        if (enesVar.compareTo(enesVar2) > 0 || enesVar == eneo.a || enesVar2 == eneq.a) {
            throw new IllegalArgumentException("Invalid range: ".concat(i(enesVar, enesVar2)));
        }
    }

    static int b(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static enop c(Comparable comparable, Comparable comparable2) {
        return new enop(new ener(comparable), new enep(comparable2));
    }

    public static enop d(Comparable comparable, Comparable comparable2) {
        return new enop(new ener(comparable), new ener(comparable2));
    }

    private static String i(enes enesVar, enes enesVar2) {
        StringBuilder sb = new StringBuilder(16);
        enesVar.c(sb);
        sb.append("..");
        enesVar2.d(sb);
        return sb.toString();
    }

    public final enop e(enop enopVar) {
        int compareTo = this.b.compareTo(enopVar.b);
        int compareTo2 = this.c.compareTo(enopVar.c);
        if (compareTo >= 0 && compareTo2 <= 0) {
            return this;
        }
        if (compareTo <= 0 && compareTo2 >= 0) {
            return enopVar;
        }
        enes enesVar = compareTo >= 0 ? this.b : enopVar.b;
        enes enesVar2 = compareTo2 <= 0 ? this.c : enopVar.c;
        emxf.i(enesVar.compareTo(enesVar2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, enopVar);
        return new enop(enesVar, enesVar2);
    }

    @Override // defpackage.emxg
    public final boolean equals(Object obj) {
        if (obj instanceof enop) {
            enop enopVar = (enop) obj;
            if (this.b.equals(enopVar.b) && this.c.equals(enopVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.emxg
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean a(Comparable comparable) {
        comparable.getClass();
        return this.b.e(comparable) && !this.c.e(comparable);
    }

    public final boolean g(enop enopVar) {
        return this.b.compareTo(enopVar.c) <= 0 && enopVar.b.compareTo(this.c) <= 0;
    }

    public final boolean h() {
        return this.b.equals(this.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    Object readResolve() {
        enop enopVar = a;
        return equals(enopVar) ? enopVar : this;
    }

    public final String toString() {
        return i(this.b, this.c);
    }
}
