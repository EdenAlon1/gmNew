package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dste {
    public final Object a;
    public final float b;
    public final Object c;

    public dste(Object obj, float f, Object obj2) {
        this.a = obj;
        this.b = f;
        this.c = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dste)) {
            return false;
        }
        dste dsteVar = (dste) obj;
        return ffkj.e(this.a, dsteVar.a) && Float.compare(this.b, dsteVar.b) == 0 && ffkj.e(this.c, dsteVar.c);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) * 31) + Float.floatToIntBits(this.b);
        Object obj2 = this.c;
        return (hashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "PagingStateSnapshot(current=" + this.a + ", currentOffsetFraction=" + this.b + ", next=" + this.c + ")";
    }
}
