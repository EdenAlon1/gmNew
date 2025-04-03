package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evqb extends evql {
    public final String a;
    public final Integer b;

    public evqb(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    @Override // defpackage.evql
    public final Integer a() {
        return this.b;
    }

    @Override // defpackage.evql
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof evql) {
            evql evqlVar = (evql) obj;
            if (this.a.equals(evqlVar.b()) && ((num = this.b) != null ? num.equals(evqlVar.a()) : evqlVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        Integer num = this.b;
        return (hashCode * 1000003) ^ (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "PhoneContext{rawContext=" + this.a + ", countryCode=" + this.b + "}";
    }
}
