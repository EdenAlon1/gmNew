package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aimq implements aihs {
    public final afh a;
    public final String b;

    public aimq(afh afhVar, String str) {
        this.a = afhVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aimq)) {
            return false;
        }
        aimq aimqVar = (aimq) obj;
        return ffkj.e(this.a, aimqVar.a) && ffkj.e(this.b, aimqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "RbmWebviewCustomTab(customTabsIntent=" + this.a + ", webUri=" + this.b + ")";
    }
}
