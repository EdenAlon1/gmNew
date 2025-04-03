package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddyn extends ddyq {
    public final Object a;

    public ddyn(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ddyn) && ffkj.e(this.a, ((ddyn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failed(error=" + this.a + ")";
    }
}
