package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlka {
    public final dlkc a;

    public dlka(dlkc dlkcVar) {
        this.a = dlkcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlka) && ffkj.e(this.a, ((dlka) obj).a);
    }

    public final int hashCode() {
        return this.a.a;
    }

    public final String toString() {
        return "ClassificationResult(verdict=" + this.a + ")";
    }
}
