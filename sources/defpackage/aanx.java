package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aanx implements doms {
    public final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final ffix f;

    public aanx(String str, String str2, String str3, String str4, String str5, ffix ffixVar) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.a = str4;
        this.e = str5;
        this.f = ffixVar;
    }

    @Override // defpackage.doms
    public final ffix a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aanx)) {
            return false;
        }
        aanx aanxVar = (aanx) obj;
        return ffkj.e(this.b, aanxVar.b) && ffkj.e(this.c, aanxVar.c) && ffkj.e(this.d, aanxVar.d) && ffkj.e(this.a, aanxVar.a) && ffkj.e(this.e, aanxVar.e) && ffkj.e(this.f, aanxVar.f);
    }

    public final int hashCode() {
        return (((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.a.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "YoutubePreviewUiData(name=" + this.b + ", description=" + this.c + ", source=" + this.d + ", videoId=" + this.a + ", imageContentDescription=" + this.e + ", onClick=" + this.f + ")";
    }
}
