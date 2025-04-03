package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emqo {
    public Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;

    public emqo(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = num5;
        this.f = num6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emqo)) {
            return false;
        }
        emqo emqoVar = (emqo) obj;
        return ffkj.e(this.a, emqoVar.a) && ffkj.e(this.b, emqoVar.b) && ffkj.e(this.c, emqoVar.c) && ffkj.e(this.d, emqoVar.d) && ffkj.e(this.e, emqoVar.e) && ffkj.e(this.f, emqoVar.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        int hashCode2 = num2 == null ? 0 : num2.hashCode();
        int i = hashCode * 31;
        Integer num3 = this.c;
        int hashCode3 = (((((((i + hashCode2) * 31) + (num3 == null ? 0 : num3.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Integer num4 = this.f;
        return hashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "DateTimeData(year=" + this.a + ", month=" + this.b + ", day=" + this.c + ", minute=" + this.d + ", second=" + this.e + ", hour=" + this.f + ")";
    }
}
