package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coje {
    public final boolean a;
    public final String b;

    public coje(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof coje)) {
            return false;
        }
        coje cojeVar = (coje) obj;
        return this.a == cojeVar.a && ffkj.e(this.b, cojeVar.b);
    }

    public final int hashCode() {
        String str = this.b;
        return ((true != this.a ? 1237 : 1231) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ScreenDetectionResult(isProbablyActive=" + this.a + ", packageName=" + this.b + ")";
    }

    public /* synthetic */ coje() {
        this(false, null);
    }
}
