package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jox implements jlg {
    public final String a;

    public final boolean equals(Object obj) {
        return (obj instanceof jox) && ffkj.e(this.a, ((jox) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringAnnotation(value=" + this.a + ')';
    }
}
