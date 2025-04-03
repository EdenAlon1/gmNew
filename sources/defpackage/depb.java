package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class depb {
    public final int a;
    public final depa b;

    public depb(int i, depa depaVar) {
        this.a = i;
        this.b = depaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof depb)) {
            return false;
        }
        depb depbVar = (depb) obj;
        return this.a == depbVar.a && ffkj.e(this.b, depbVar.b);
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FeatureUiData(description=" + this.a + ", image=" + this.b + ")";
    }
}
