package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes6.dex */
public final class ffws {
    public static final ffwr a = new ffwr();
    public final Object b;

    public static final Object a(Object obj) {
        if (obj instanceof ffwr) {
            return null;
        }
        return obj;
    }

    public static final Throwable b(Object obj) {
        ffwq ffwqVar = obj instanceof ffwq ? (ffwq) obj : null;
        if (ffwqVar != null) {
            return ffwqVar.a;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return !(obj instanceof ffwr);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ffws) && ffkj.e(this.b, ((ffws) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        return obj instanceof ffwq ? ((ffwq) obj).toString() : a.i(obj, "Value(", ")");
    }
}
