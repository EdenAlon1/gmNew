package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eodz {
    public static final eodz a = new eodz("about:invalid#zGuavaz");
    public final String b;

    public eodz(String str) {
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eodz) {
            return this.b.equals(((eodz) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 18288376;
    }

    public final String toString() {
        return "SafeUrl{" + this.b + "}";
    }
}
