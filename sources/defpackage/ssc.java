package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssc {
    public final String a;
    public final ffix b;

    public ssc(String str, ffix ffixVar) {
        this.a = str;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssc)) {
            return false;
        }
        ssc sscVar = (ssc) obj;
        return ffkj.e(this.a, sscVar.a) && ffkj.e(this.b, sscVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "FullBannerButton(text=" + this.a + ", callback=" + this.b + ")";
    }
}
