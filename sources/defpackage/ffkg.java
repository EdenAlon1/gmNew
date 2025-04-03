package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffkg extends ffjz implements ffkf, ffmq {
    private final int a;
    private final int b;

    public ffkg(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, 1 == i2);
        this.a = i;
        this.b = 0;
    }

    @Override // defpackage.ffkf
    public final int dR() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ffkg)) {
            if (obj instanceof ffmq) {
                return obj.equals(c());
            }
            return false;
        }
        ffkg ffkgVar = (ffkg) obj;
        if (this.h.equals(ffkgVar.h) && this.i.equals(ffkgVar.i)) {
            int i = ffkgVar.b;
            if (this.a == ffkgVar.a && ffkj.e(this.g, ffkgVar.g) && ffkj.e(e(), ffkgVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ffjz
    protected final void g() {
        int i = fflc.a;
    }

    public final int hashCode() {
        return (((e() == null ? 0 : e().hashCode() * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public final String toString() {
        ffmn c = c();
        if (c != this) {
            return c.toString();
        }
        if ("<init>".equals(this.h)) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + this.h + " (Kotlin reflection is not available)";
    }
}
