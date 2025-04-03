package defpackage;

/* compiled from: PG */
@ffbs
/* loaded from: classes.dex */
public final class jpr implements jlg {
    public final String a;

    public jpr(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jpr) && ffkj.e(this.a, ((jpr) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UrlAnnotation(url=" + this.a + ')';
    }
}
