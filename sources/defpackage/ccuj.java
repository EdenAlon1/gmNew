package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccuj {
    public final Exception a;
    private final Object b;

    public ccuj(Object obj, Exception exc) {
        this.b = obj;
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccuj)) {
            return false;
        }
        ccuj ccujVar = (ccuj) obj;
        return ffkj.e(this.b, ccujVar.b) && ffkj.e(this.a, ccujVar.a);
    }

    public final int hashCode() {
        Object obj = this.b;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Failure(localRow=" + this.b + ", exception=" + this.a + ")";
    }
}
