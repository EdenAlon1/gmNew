package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xzg implements apph, xze {
    private final String a;
    private final Uri b;
    private final Uri c;
    private final String d;
    private final long e;
    private final awap f;

    public xzg(String str, Uri uri, String str2, long j, awap awapVar) {
        str.getClass();
        this.a = str;
        this.b = uri;
        this.c = null;
        this.d = str2;
        this.e = j;
        this.f = awapVar;
    }

    @Override // defpackage.apph
    public final long a() {
        return this.e;
    }

    @Override // defpackage.appj
    public final String b() {
        return this.a;
    }

    @Override // defpackage.apmq
    public final Uri c() {
        return null;
    }

    @Override // defpackage.apmq
    public final Uri e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzg)) {
            return false;
        }
        xzg xzgVar = (xzg) obj;
        if (!ffkj.e(this.a, xzgVar.a) || !ffkj.e(this.b, xzgVar.b)) {
            return false;
        }
        Uri uri = xzgVar.c;
        return ffkj.e(null, null) && ffkj.e(this.d, xzgVar.d) && this.e == xzgVar.e && ffkj.e(this.f, xzgVar.f);
    }

    @Override // defpackage.apmq
    public final apra fk() {
        return null;
    }

    @Override // defpackage.apmq
    public final awap fl() {
        return this.f;
    }

    @Override // defpackage.apmq
    public final /* synthetic */ boolean fp() {
        return apmp.a(this);
    }

    @Override // defpackage.apph
    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.d.hashCode();
        awap awapVar = this.f;
        int hashCode2 = awapVar == null ? 0 : awapVar.hashCode();
        long j = this.e;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + hashCode2;
    }

    public final String toString() {
        String str = this.d;
        return "MapiFileContent(contentType=" + this.a + ", uri=" + cskw.d(this.b) + ", originalUri=null, fileName=" + ((Object) cskw.c(str)) + ", fileSize=" + this.e + ", processingId=" + this.f + ")";
    }
}
