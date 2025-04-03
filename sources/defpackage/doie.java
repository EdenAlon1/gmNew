package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doie {
    public final char a;
    public final int b;

    public doie(char c, int i) {
        this.a = c;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doie)) {
            return false;
        }
        doie doieVar = (doie) obj;
        return this.a == doieVar.a && this.b == doieVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "Character(iconChar=" + this.a + ", iconTint=" + this.b + ")";
    }
}
