package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axza {
    public final long a;
    public final long b;

    public axza(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axza)) {
            return false;
        }
        axza axzaVar = (axza) obj;
        return this.a == axzaVar.a && this.b == axzaVar.b;
    }

    public final int hashCode() {
        return (axyz.a(this.a) * 31) + axyz.a(this.b);
    }

    public final String toString() {
        return "Cp2IdWithContactId(cp2Id=" + this.a + ", contactId=" + this.b + ")";
    }
}
