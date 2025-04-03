package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hva extends huw {
    private final String b;
    private final Object c;

    public hva(String str, Object obj, ffjn ffjnVar) {
        super(ffjnVar);
        this.b = str;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hva)) {
            return false;
        }
        hva hvaVar = (hva) obj;
        return ffkj.e(this.b, hvaVar.b) && ffkj.e(this.c, hvaVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }
}
