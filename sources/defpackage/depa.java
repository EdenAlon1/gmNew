package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class depa {
    public final int a;
    public final boolean b;

    public depa(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof depa)) {
            return false;
        }
        depa depaVar = (depa) obj;
        return this.a == depaVar.a && this.b == depaVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "FeatureImage(painter=" + this.a + ", tint=" + this.b + ")";
    }
}
