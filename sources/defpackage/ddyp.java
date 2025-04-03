package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddyp extends ddyq {
    public final Object a;

    public ddyp(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ddyp) && ffkj.e(this.a, ((ddyp) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Ready(data=" + this.a + ")";
    }
}
