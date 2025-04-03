package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drud {
    public final String a;

    public drud(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drud) && ffkj.e(this.a, ((drud) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequestId(value=" + this.a + ")";
    }
}
