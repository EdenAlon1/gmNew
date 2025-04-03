package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cenx {
    public final int a;
    public final int b;
    public final int c;

    public cenx(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cenx)) {
            return false;
        }
        cenx cenxVar = (cenx) obj;
        return this.a == cenxVar.a && this.b == cenxVar.b && this.c == cenxVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "BugleDataCount(messages=" + this.a + ", conversations=" + this.b + ", participants=" + this.c + ")";
    }
}
