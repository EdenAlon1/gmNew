package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azfj {
    public final azfn a;
    public final Set b;

    public azfj(azfn azfnVar, Set set) {
        this.a = azfnVar;
        this.b = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azfj)) {
            return false;
        }
        azfj azfjVar = (azfj) obj;
        return ffkj.e(this.a, azfjVar.a) && ffkj.e(this.b, azfjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GroupData(details=" + this.a + ", members=" + this.b + ")";
    }
}
