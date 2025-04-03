package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdt {
    public final Object a;
    public final ffjn b;

    public gdt(Object obj, ffjn ffjnVar) {
        this.a = obj;
        this.b = ffjnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdt)) {
            return false;
        }
        gdt gdtVar = (gdt) obj;
        return ffkj.e(this.a, gdtVar.a) && ffkj.e(this.b, gdtVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
