package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doxj {
    public final String a;

    public doxj(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof doxj) && ffkj.e(this.a, ((doxj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AccountName(value=" + this.a + ")";
    }
}
