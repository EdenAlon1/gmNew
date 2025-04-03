package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hvc extends huw {
    private final String b;
    private final Object c;
    private final Object d;
    private final Object f;

    public hvc(String str, Object obj, Object obj2, Object obj3, ffjn ffjnVar) {
        super(ffjnVar);
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hvc)) {
            return false;
        }
        hvc hvcVar = (hvc) obj;
        return ffkj.e(this.b, hvcVar.b) && ffkj.e(this.c, hvcVar.c) && ffkj.e(this.d, hvcVar.d) && ffkj.e(this.f, hvcVar.f);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f.hashCode();
    }
}
