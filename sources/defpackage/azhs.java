package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azhs {
    private final azfh a;
    private final azfh b;

    public azhs(azfh azfhVar, azfh azfhVar2) {
        azfhVar2.getClass();
        this.a = azfhVar;
        this.b = azfhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azhs)) {
            return false;
        }
        azhs azhsVar = (azhs) obj;
        return ffkj.e(this.a, azhsVar.a) && ffkj.e(this.b, azhsVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GroupUpdateResult(before=" + this.a + ", after=" + this.b + ")";
    }
}
