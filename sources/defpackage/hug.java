package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hug {
    public final int a;
    public final Integer b;

    public hug(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hug)) {
            return false;
        }
        hug hugVar = (hug) obj;
        return this.a == hugVar.a && ffkj.e(this.b, hugVar.b);
    }

    public final int hashCode() {
        Integer num = this.b;
        return (this.a * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ObjectLocation(group=" + this.a + ", dataOffset=" + this.b + ')';
    }
}
