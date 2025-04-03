package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsz implements xta {
    public final xhm a;
    public final String b;

    public xsz(xhm xhmVar, String str) {
        this.a = xhmVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsz)) {
            return false;
        }
        xsz xszVar = (xsz) obj;
        return ffkj.e(this.a, xszVar.a) && ffkj.e(this.b, xszVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Send(draftAttachment=" + this.a + ", textCaption=" + this.b + ")";
    }
}
