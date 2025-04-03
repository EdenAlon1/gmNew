package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyvi {
    public final boolean a;

    public cyvi(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cyvi) && this.a == ((cyvi) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(disableSharedElementTransitionsInTests=" + this.a + ")";
    }

    public cyvi() {
        this(true);
    }
}
