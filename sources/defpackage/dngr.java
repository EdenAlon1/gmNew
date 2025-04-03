package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngr implements dngx {
    public final String a;

    public dngr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dngr) && ffkj.e(this.a, ((dngr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InlineHeader(text=" + this.a + ")";
    }
}
