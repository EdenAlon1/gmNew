package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffes<T> {
    public final int a;
    public final Object b;

    public ffes(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ffes)) {
            return false;
        }
        ffes ffesVar = (ffes) obj;
        return this.a == ffesVar.a && ffkj.e(this.b, ffesVar.b);
    }

    public final int hashCode() {
        Object obj = this.b;
        return (this.a * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ")";
    }
}
