package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpfk {
    public final int a;
    public final int b;

    public cpfk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cpfk)) {
            return false;
        }
        cpfk cpfkVar = (cpfk) obj;
        return this.a == cpfkVar.a && this.b == cpfkVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SuggestionCombinationBounds(min=" + this.a + ", max=" + this.b + ")";
    }
}
