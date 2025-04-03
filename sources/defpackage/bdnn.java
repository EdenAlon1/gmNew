package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdnn {
    public final String a;

    public bdnn(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdnn) && ffkj.e(this.a, ((bdnn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Caption(content=" + this.a + ")";
    }
}
