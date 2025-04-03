package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qsv extends qsr {
    public final Object a;
    private final qsx b;

    public qsv(qsx qsxVar, Object obj) {
        qsxVar.getClass();
        this.b = qsxVar;
        this.a = obj;
        int ordinal = qsxVar.ordinal();
        if (ordinal == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
            throw new ffcd();
        }
    }

    @Override // defpackage.qsr
    public final qsx a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsv)) {
            return false;
        }
        qsv qsvVar = (qsv) obj;
        return this.b == qsvVar.b && ffkj.e(this.a, qsvVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Resource(status=" + this.b + ", resource=" + this.a + ")";
    }
}
