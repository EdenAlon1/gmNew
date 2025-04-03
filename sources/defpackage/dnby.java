package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnby {
    public final Integer a;
    public final Integer b;

    public dnby(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnby)) {
            return false;
        }
        dnby dnbyVar = (dnby) obj;
        return ffkj.e(this.a, dnbyVar.a) && ffkj.e(this.b, dnbyVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        return (hashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "Size(width=" + this.a + ", height=" + this.b + ")";
    }
}
