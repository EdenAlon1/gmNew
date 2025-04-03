package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hvb extends huw {
    private final String b;
    private final Object c;
    private final Object d;

    public hvb(String str, Object obj, Object obj2, ffjn ffjnVar) {
        super(ffjnVar);
        this.b = str;
        this.c = obj;
        this.d = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hvb)) {
            return false;
        }
        hvb hvbVar = (hvb) obj;
        return ffkj.e(this.b, hvbVar.b) && ffkj.e(this.c, hvbVar.c) && ffkj.e(this.d, hvbVar.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Object obj = this.c;
        int hashCode2 = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Object obj2 = this.d;
        return hashCode2 + (obj2 != null ? obj2.hashCode() : 0);
    }
}
