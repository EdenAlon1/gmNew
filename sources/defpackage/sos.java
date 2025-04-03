package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sos {
    public final Object a;
    public final Exception b;

    public sos(Object obj, Exception exc) {
        this.a = obj;
        this.b = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sos)) {
            return false;
        }
        sos sosVar = (sos) obj;
        return ffkj.e(this.a, sosVar.a) && ffkj.e(this.b, sosVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Exception exc = this.b;
        return (hashCode * 31) + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        return "D2DSourceApiResult(response=" + this.a + ", exception=" + this.b + ")";
    }

    public /* synthetic */ sos(Object obj) {
        this(obj, null);
    }
}
