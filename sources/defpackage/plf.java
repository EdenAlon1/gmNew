package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class plf {
    public static final plf a = new plf("expandContainers", 0.0f);
    public static final plf b = ple.a(0.5f);
    public static final plf c = new plf("hinge", -1.0f);
    public final float d;
    private final String e;

    public plf(String str, float f) {
        this.e = str;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof plf)) {
            return false;
        }
        plf plfVar = (plf) obj;
        return this.d == plfVar.d && ffkj.e(this.e, plfVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (Float.floatToIntBits(this.d) * 31);
    }

    public final String toString() {
        return this.e;
    }
}
