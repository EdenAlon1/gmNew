package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsx implements xta {
    public final xhm a;
    public final String b;

    public xsx(xhm xhmVar, String str) {
        this.a = xhmVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsx)) {
            return false;
        }
        xsx xsxVar = (xsx) obj;
        return ffkj.e(this.a, xsxVar.a) && ffkj.e(this.b, xsxVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Add(draftAttachment=" + this.a + ", textCaption=" + this.b + ")";
    }
}
