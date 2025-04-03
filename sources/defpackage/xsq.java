package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xsq {
    private final xsp a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public xsq(xsp xspVar, boolean z, boolean z2, boolean z3, boolean z4) {
        xspVar.getClass();
        this.a = xspVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsq)) {
            return false;
        }
        xsq xsqVar = (xsq) obj;
        return this.a == xsqVar.a && this.b == xsqVar.b && this.c == xsqVar.c && this.d == xsqVar.d && this.e == xsqVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.e;
        boolean z2 = this.d;
        return ((((((hashCode + xso.a(this.b)) * 31) + xso.a(this.c)) * 31) + xso.a(z2)) * 31) + xso.a(z);
    }

    public final String toString() {
        return "TopUiDataLoggingContext(chosenType=" + this.a + ", hasSubjectUrgent=" + this.b + ", hasReply=" + this.c + ", hasScheduledSend=" + this.d + ", hasEdit=" + this.e + ")";
    }
}
