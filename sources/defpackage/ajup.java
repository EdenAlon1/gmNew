package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajup extends ajvg {
    public final String a;

    public ajup(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajup) && ffkj.e(this.a, ((ajup) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImageUri(uri=" + this.a + ")";
    }
}
