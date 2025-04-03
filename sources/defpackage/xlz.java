package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xlz {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public xlz(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xlz)) {
            return false;
        }
        xlz xlzVar = (xlz) obj;
        return this.a == xlzVar.a && this.b == xlzVar.b && this.c == xlzVar.c;
    }

    public final int hashCode() {
        return (((xly.a(this.a) * 31) + xly.a(this.b)) * 31) + xly.a(this.c);
    }

    public final String toString() {
        return "TransportDraftData(hasSubject=" + this.a + ", isUrgent=" + this.b + ", hasAttachments=" + this.c + ")";
    }
}
