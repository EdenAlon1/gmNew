package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmcj {
    public final String a;
    public final ffix b;

    public dmcj(String str, ffix ffixVar) {
        this.a = str;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmcj)) {
            return false;
        }
        dmcj dmcjVar = (dmcj) obj;
        return ffkj.e(this.a, dmcjVar.a) && ffkj.e(this.b, dmcjVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BannerButtonData(text=" + this.a + ", onClick=" + this.b + ")";
    }
}
