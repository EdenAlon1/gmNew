package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagp {
    public final alxr a;
    public final dnor b;
    public final aawt c;
    public final apyd d;
    public final boolean e;

    public aagp(alxr alxrVar, dnor dnorVar, aawt aawtVar, apyd apydVar, boolean z) {
        alxrVar.getClass();
        dnorVar.getClass();
        this.a = alxrVar;
        this.b = dnorVar;
        this.c = aawtVar;
        this.d = apydVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aagp)) {
            return false;
        }
        aagp aagpVar = (aagp) obj;
        return ffkj.e(this.a, aagpVar.a) && this.b == aagpVar.b && ffkj.e(this.c, aagpVar.c) && ffkj.e(this.d, aagpVar.d) && this.e == aagpVar.e;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        apyd apydVar = this.d;
        return (((hashCode * 31) + (apydVar == null ? 0 : apydVar.hashCode())) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "ReactionsBarArgs(message=" + this.a + ", horizontalAlignment=" + this.b + ", selectionData=" + this.c + ", existingReactions=" + this.d + ", isLatestIncoming=" + this.e + ")";
    }
}
