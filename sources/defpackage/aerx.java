package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aerx extends aesa {
    public final drsq a;

    public aerx(drsq drsqVar) {
        this.a = drsqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aerx) && this.a == ((aerx) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PhotosAppNotReadyPromo(missingRequirement=" + this.a + ")";
    }
}
