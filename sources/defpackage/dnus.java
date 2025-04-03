package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnus implements dnux {
    public final String a;
    public final ffix b;

    public dnus(String str, ffix ffixVar) {
        this.a = str;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnus)) {
            return false;
        }
        dnus dnusVar = (dnus) obj;
        return ffkj.e(this.a, dnusVar.a) && ffkj.e(this.b, dnusVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Downloadable(label=" + this.a + ", onDownloadButtonClicked=" + this.b + ")";
    }
}
