package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfmi extends cfmk {
    private final espg a;

    public cfmi(espg espgVar) {
        espgVar.getClass();
        this.a = espgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfmi) && ffkj.e(this.a, ((cfmi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Mls(fileMetadata=" + this.a + ")";
    }
}
