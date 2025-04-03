package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akdj {
    public final Object a;
    public final Exception b;

    public akdj(Object obj, Exception exc) {
        this.a = obj;
        this.b = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akdj)) {
            return false;
        }
        akdj akdjVar = (akdj) obj;
        return ffkj.e(this.a, akdjVar.a) && ffkj.e(this.b, akdjVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Exception exc = this.b;
        return (hashCode * 31) + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        return "D2DTargetApiResult(response=" + this.a + ", exception=" + this.b + ")";
    }

    public /* synthetic */ akdj(Object obj) {
        this(obj, null);
    }
}
