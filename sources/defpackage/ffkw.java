package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffkw extends ffjz implements ffmx {
    public ffkw() {
        super(ffjz.f, null, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ffkw) {
            ffkw ffkwVar = (ffkw) obj;
            return e().equals(ffkwVar.e()) && this.h.equals(ffkwVar.h) && this.i.equals(ffkwVar.i) && ffkj.e(this.g, ffkwVar.g);
        }
        if (obj instanceof ffmx) {
            return obj.equals(c());
        }
        return false;
    }

    protected final ffmx h() {
        ffmn c = c();
        if (c != this) {
            return (ffmx) c;
        }
        throw new ffiw();
    }

    public final int hashCode() {
        return (((e().hashCode() * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        ffmn c = c();
        if (c != this) {
            return c.toString();
        }
        return "property " + this.h + " (Kotlin reflection is not available)";
    }

    public ffkw(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, 1 == i);
    }
}
