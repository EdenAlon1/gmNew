package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejsu extends ejsy {
    public final Object a;

    public ejsu(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ejsu) && ffkj.e(this.a, ((ejsu) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Read(response=" + this.a + ")";
    }
}
