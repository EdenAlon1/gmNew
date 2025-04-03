package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crtq extends csbg {
    private final enhk a;

    public crtq(enhk enhkVar) {
        this.a = enhkVar;
    }

    @Override // defpackage.csbg
    public final enhk a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof csbg) {
            return ennc.m(this.a, ((csbg) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CmsMessageCalculatedObjectData{calculatedPartsData=" + String.valueOf(this.a) + "}";
    }
}
