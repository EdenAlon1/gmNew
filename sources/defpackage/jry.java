package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jry {
    private final jsd a;
    private final Object b = null;

    public jry(jsd jsdVar) {
        this.a = jsdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jry)) {
            return false;
        }
        jry jryVar = (jry) obj;
        if (!ffkj.e(this.a, jryVar.a)) {
            return false;
        }
        Object obj2 = jryVar.b;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.a + ", loaderKey=null)";
    }
}
