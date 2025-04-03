package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class qgq implements qgw {
    public final String a;

    public final boolean equals(Object obj) {
        return (obj instanceof qgq) && ffkj.e(this.a, ((qgq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Asset(assetName=" + this.a + ")";
    }
}
