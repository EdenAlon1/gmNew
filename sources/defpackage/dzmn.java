package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzmn extends dzov {
    public final int a;
    public final dzou b;

    public dzmn(int i, dzou dzouVar) {
        this.a = i;
        this.b = dzouVar;
    }

    @Override // defpackage.dzov
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dzov
    public final dzou b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzov) {
            dzov dzovVar = (dzov) obj;
            if (this.a == dzovVar.a() && this.b.equals(dzovVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CloudAnnotation{type=" + this.a + ", metadata=" + this.b.toString() + "}";
    }
}
