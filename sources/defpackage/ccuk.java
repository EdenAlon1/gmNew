package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccuk {
    private final Object a;
    private final String b;

    public ccuk(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccuk)) {
            return false;
        }
        ccuk ccukVar = (ccuk) obj;
        return ffkj.e(this.a, ccukVar.a) && ffkj.e(this.b, ccukVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MergeWithExistingCmsEntity(localRow=" + this.a + ", cmsId=" + this.b + ")";
    }
}
