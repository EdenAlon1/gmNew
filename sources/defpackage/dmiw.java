package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmiw {
    public final String a;
    private final dmzz b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmiw)) {
            return false;
        }
        dmiw dmiwVar = (dmiw) obj;
        if (!ffkj.e(this.a, dmiwVar.a)) {
            return false;
        }
        dmzz dmzzVar = dmiwVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "CardstoneTitle(title=" + this.a + ", icon=null)";
    }
}
