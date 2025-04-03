package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coji {
    public final String a;
    public final Integer b;
    public final Integer c;

    public coji(String str, Integer num, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coji)) {
            return false;
        }
        coji cojiVar = (coji) obj;
        return ffkj.e(this.a, cojiVar.a) && ffkj.e(this.b, cojiVar.b) && ffkj.e(this.c, cojiVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "BodyTextWithPackageNameIndices(text=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ")";
    }
}
