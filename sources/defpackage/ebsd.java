package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebsd extends ebsl {
    private final ebsk a;

    public ebsd(ebsk ebskVar) {
        this.a = ebskVar;
    }

    @Override // defpackage.ebsl
    public final ebsk a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebsl) {
            return equals(((ebsl) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LogoViewFeature{logoViewInflater=" + toString() + "}";
    }
}
