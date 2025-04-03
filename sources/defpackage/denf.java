package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class denf {
    public final boolean a;
    public final boolean b;

    public denf(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof denf)) {
            return false;
        }
        denf denfVar = (denf) obj;
        return this.a == denfVar.a && this.b == denfVar.b;
    }

    public final int hashCode() {
        return (dene.a(this.a) * 31) + dene.a(this.b);
    }

    public final String toString() {
        return "Flags(useProfilePrimitive=" + this.a + ", fixPreferencePadding=" + this.b + ")";
    }

    public denf() {
        this(false, false);
    }
}
