package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fkg {
    public final Object a;
    public final ffjn b;

    public fkg(Object obj, ffjn ffjnVar) {
        this.a = obj;
        this.b = ffjnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkg)) {
            return false;
        }
        fkg fkgVar = (fkg) obj;
        return ffkj.e(this.a, fkgVar.a) && ffkj.e(this.b, fkgVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
