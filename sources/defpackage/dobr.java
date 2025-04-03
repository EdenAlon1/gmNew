package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dobr {
    public final int a;
    public final int b;

    public dobr(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dobr)) {
            return false;
        }
        dobr dobrVar = (dobr) obj;
        return this.a == dobrVar.a && this.b == dobrVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return "SizeConfigurations(cardWidthDp=" + this.a + ", cardMaxHeightDp=" + this.b + ")";
    }
}
