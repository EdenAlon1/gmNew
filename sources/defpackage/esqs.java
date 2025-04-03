package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqs {
    public static final esqs a = new esqs("");
    public final String b;

    public esqs(String str) {
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof esqs) && ffkj.e(this.b, ((esqs) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "GroupIcon(url=" + this.b + ")";
    }
}
