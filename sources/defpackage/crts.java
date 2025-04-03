package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crts extends csbi {
    private final eyee a;

    public crts(eyee eyeeVar) {
        this.a = eyeeVar;
    }

    @Override // defpackage.csbi
    public final eyee a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof csbi)) {
            return false;
        }
        csbi csbiVar = (csbi) obj;
        eyee eyeeVar = this.a;
        return eyeeVar == null ? csbiVar.a() == null : eyeeVar.equals(csbiVar.a());
    }

    public final int hashCode() {
        eyee eyeeVar = this.a;
        return (eyeeVar == null ? 0 : eyeeVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "CmsMessageCalculatedPartData{thumbnailData=" + String.valueOf(this.a) + "}";
    }
}
