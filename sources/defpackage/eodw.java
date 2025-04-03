package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eodw {
    public final String a;

    public eodw(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eodw) {
            return this.a.equals(((eodw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 867184553;
    }

    public final String toString() {
        return "SafeHtml{" + this.a + "}";
    }
}
