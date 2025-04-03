package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyj {
    public static final xyi a = new xyi();
    public final drme b;
    public final drlk c;
    public final Long d;
    public final boolean e;

    public xyj() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyj)) {
            return false;
        }
        xyj xyjVar = (xyj) obj;
        return this.b == xyjVar.b && ffkj.e(this.c, xyjVar.c) && ffkj.e(this.d, xyjVar.d) && this.e == xyjVar.e;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        Long l = this.d;
        return (((hashCode * 31) + (l == null ? 0 : l.hashCode())) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "ConvertOptions(quality=" + this.b + ", capabilities=" + this.c + ", maxAttachmentSizeBytes=" + this.d + ", download=" + this.e + ")";
    }

    public xyj(xzb xzbVar, boolean z) {
        this(xzbVar.a, xzbVar.b, xzbVar.c, z);
    }

    public xyj(drme drmeVar, drlk drlkVar, Long l, boolean z) {
        drmeVar.getClass();
        this.b = drmeVar;
        this.c = drlkVar;
        this.d = l;
        this.e = z;
    }

    public /* synthetic */ xyj(byte[] bArr) {
        this(drme.d, new drlk(null, 7), null, false);
    }
}
