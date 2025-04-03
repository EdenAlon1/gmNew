package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmzs implements dmzt {
    private final Uri a;
    private final String b;
    private final Integer c;
    private final Integer d;
    private final ffix e;

    public dmzs(Uri uri, String str, Integer num, Integer num2, ffix ffixVar) {
        this.a = uri;
        this.b = str;
        this.c = num;
        this.d = num2;
        this.e = ffixVar;
    }

    @Override // defpackage.dmzt
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.dmzt
    public final Integer b() {
        return this.d;
    }

    @Override // defpackage.dmzt
    public final Integer c() {
        return this.c;
    }

    @Override // defpackage.dmzt
    public final String d() {
        return this.b;
    }

    @Override // defpackage.dmzt
    public final ffix e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmzs)) {
            return false;
        }
        dmzs dmzsVar = (dmzs) obj;
        return ffkj.e(this.a, dmzsVar.a) && ffkj.e(this.b, dmzsVar.b) && ffkj.e(this.c, dmzsVar.c) && ffkj.e(this.d, dmzsVar.d) && ffkj.e(this.e, dmzsVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Integer num = this.c;
        int hashCode2 = ((hashCode * 31) + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "GalleryImageUiData(uri=" + this.a + ", contentDescription=" + this.b + ", width=" + this.c + ", height=" + this.d + ", onClick=" + this.e + ")";
    }
}
