package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azol {
    public final Set a;
    private final boolean b;

    public azol(Set set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azol)) {
            return false;
        }
        azol azolVar = (azol) obj;
        return ffkj.e(this.a, azolVar.a) && this.b == azolVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "MyIdentitiesUpdateResult(tokens=" + this.a + ", hasChanges=" + this.b + ")";
    }
}
