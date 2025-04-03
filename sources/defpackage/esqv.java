package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqv {
    public final esqu a;
    public final esrb b;
    public final esqr c;
    public final enip d;

    public esqv(esqu esquVar, esrb esrbVar, esqr esqrVar, enip enipVar) {
        this.a = esquVar;
        this.b = esrbVar;
        this.c = esqrVar;
        this.d = enipVar;
        if (enipVar.isEmpty()) {
            throw new IllegalStateException("Check failed.");
        }
        if (!esrbVar.b.a(esqrVar)) {
            throw new IllegalStateException("Check failed.");
        }
        enqu listIterator = enipVar.listIterator();
        listIterator.getClass();
        while (listIterator.hasNext()) {
            esqy esqyVar = (esqy) listIterator.next();
            esrd esrdVar = this.b.b;
            esqx a = esqyVar.a();
            int ordinal = esrdVar.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw null;
                    }
                    if (esqx.b != a && esqx.c != a) {
                        throw new IllegalStateException("Check failed.");
                    }
                } else if (esqx.b != a) {
                    throw new IllegalStateException("Check failed.");
                }
            } else if (esqx.a != a) {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esqv)) {
            return false;
        }
        esqv esqvVar = (esqv) obj;
        return ffkj.e(this.a, esqvVar.a) && ffkj.e(this.b, esqvVar.b) && ffkj.e(this.c, esqvVar.c) && ffkj.e(this.d, esqvVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "GroupInfo(id=" + this.a + ", properties=" + this.b + ", features=" + this.c + ", members=" + this.d + ")";
    }
}
