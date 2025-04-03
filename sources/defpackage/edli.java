package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edli extends edpe {
    public final String a;
    public final Long b;
    public final Integer c;

    public edli(String str, Long l, Integer num) {
        if (str == null) {
            throw new NullPointerException("Null currencyCode");
        }
        this.a = str;
        this.b = l;
        this.c = num;
    }

    @Override // defpackage.edpe
    public final Integer a() {
        return this.c;
    }

    @Override // defpackage.edpe
    public final Long b() {
        return this.b;
    }

    @Override // defpackage.edpe
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edpe) {
            edpe edpeVar = (edpe) obj;
            if (this.a.equals(edpeVar.c()) && this.b.equals(edpeVar.b()) && this.c.equals(edpeVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Money{currencyCode=" + this.a + ", units=" + this.b + ", nanos=" + this.c + "}";
    }
}
