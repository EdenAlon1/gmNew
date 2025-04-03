package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnic extends dnid {
    public final String a;

    public dnic(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnic) && ffkj.e(this.a, ((dnic) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Emotify(uri=" + this.a + ")";
    }
}
