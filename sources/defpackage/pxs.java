package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pxs {
    public final String a;
    public final int b;

    public pxs(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxs)) {
            return false;
        }
        pxs pxsVar = (pxs) obj;
        return ffkj.e(this.a, pxsVar.a) && this.b == pxsVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}
