package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmzx implements dmzt {
    public final String a;
    private final Uri b;
    private final String c;
    private final Integer d;
    private final Integer e;
    private final ffix f;
    private final dmzw g;

    public dmzx(Uri uri, String str, Integer num, Integer num2, ffix ffixVar, String str2, dmzw dmzwVar) {
        this.b = uri;
        this.c = str;
        this.d = num;
        this.e = num2;
        this.f = ffixVar;
        this.a = str2;
        this.g = dmzwVar;
    }

    @Override // defpackage.dmzt
    public final Uri a() {
        return this.b;
    }

    @Override // defpackage.dmzt
    public final Integer b() {
        return this.e;
    }

    @Override // defpackage.dmzt
    public final Integer c() {
        return this.d;
    }

    @Override // defpackage.dmzt
    public final String d() {
        return this.c;
    }

    @Override // defpackage.dmzt
    public final ffix e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmzx)) {
            return false;
        }
        dmzx dmzxVar = (dmzx) obj;
        return ffkj.e(this.b, dmzxVar.b) && ffkj.e(this.c, dmzxVar.c) && ffkj.e(this.d, dmzxVar.d) && ffkj.e(this.e, dmzxVar.e) && ffkj.e(this.f, dmzxVar.f) && ffkj.e(this.a, dmzxVar.a) && ffkj.e(this.g, dmzxVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        Integer num = this.d;
        int hashCode2 = ((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int hashCode3 = (((hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.f.hashCode()) * 31;
        String str = this.a;
        return ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "GalleryVideoUiData(uri=" + this.b + ", contentDescription=" + this.c + ", width=" + this.d + ", height=" + this.e + ", onClick=" + this.f + ", formattedTimeString=" + this.a + ", flags=" + this.g + ")";
    }
}
