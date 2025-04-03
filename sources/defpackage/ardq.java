package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ardq implements ardr {
    public final String a;

    public ardq(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ardq) && ffkj.e(this.a, ((ardq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HostAppNotFound(hostPackage=" + this.a + ")";
    }
}
