package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xzb {
    public final drme a;
    public final drlk b;
    public final Long c;

    public xzb(drme drmeVar, drlk drlkVar, Long l) {
        drmeVar.getClass();
        this.a = drmeVar;
        this.b = drlkVar;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzb)) {
            return false;
        }
        xzb xzbVar = (xzb) obj;
        return this.a == xzbVar.a && ffkj.e(this.b, xzbVar.b) && ffkj.e(this.c, xzbVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Long l = this.c;
        return (hashCode * 31) + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "VariationOptions(quality=" + this.a + ", mediaCapabilities=" + this.b + ", maxAttachmentSizeBytes=" + this.c + ")";
    }
}
