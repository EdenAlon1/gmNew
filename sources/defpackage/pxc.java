package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pxc {
    public final String a;
    public final Long b;

    public pxc(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxc)) {
            return false;
        }
        pxc pxcVar = (pxc) obj;
        return ffkj.e(this.a, pxcVar.a) && ffkj.e(this.b, pxcVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
