package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvxk implements cvxm {
    public final String a;
    public final String b;
    public final ffix c;

    public cvxk(String str, String str2, ffix ffixVar) {
        this.a = str;
        this.b = str2;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvxk)) {
            return false;
        }
        cvxk cvxkVar = (cvxk) obj;
        return ffkj.e(this.a, cvxkVar.a) && ffkj.e(this.b, cvxkVar.b) && ffkj.e(this.c, cvxkVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "BannerEmergencyRowUiData(text=" + this.a + ", buttonText=" + this.b + ", onClick=" + this.c + ")";
    }
}
