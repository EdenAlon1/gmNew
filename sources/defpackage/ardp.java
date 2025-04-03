package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ardp implements ardr {
    public final String a;

    public ardp(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ardp) && ffkj.e(this.a, ((ardp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HostAppBelowMinimum(hostPackage=" + this.a + ")";
    }
}
