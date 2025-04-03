package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeqa extends aeqe {
    public final drsq a;

    public aeqa(drsq drsqVar) {
        this.a = drsqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aeqa) && this.a == ((aeqa) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PhotosAppNotReady(missingRequirement=" + this.a + ")";
    }
}
