package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xzm implements apqd, xze {
    private final String a;
    private final Uri b;
    private final Uri c;
    private final Size d;
    private final String e;
    private final awap f;

    public xzm(String str, Uri uri, Size size, awap awapVar) {
        str.getClass();
        uri.getClass();
        this.a = str;
        this.b = uri;
        this.c = null;
        this.d = size;
        this.e = null;
        this.f = awapVar;
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
        if (!(obj instanceof xzm)) {
            return false;
        }
        xzm xzmVar = (xzm) obj;
        if (!ffkj.e(this.a, xzmVar.a) || !ffkj.e(this.b, xzmVar.b)) {
            return false;
        }
        Uri uri = xzmVar.c;
        if (!ffkj.e(null, null) || !ffkj.e(this.d, xzmVar.d)) {
            return false;
        }
        String str = xzmVar.e;
        return ffkj.e(null, null) && ffkj.e(this.f, xzmVar.f);
    }

    @Override // defpackage.apqd
    public final Size f() {
        return this.d;
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

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.d.hashCode();
        awap awapVar = this.f;
        return (hashCode * 961) + (awapVar == null ? 0 : awapVar.hashCode());
    }

    @Override // defpackage.apqd
    public final String k() {
        return null;
    }

    public final String toString() {
        return "MapiStickerContent(contentType=" + this.a + ", uri=" + cskw.d(this.b) + ", originalUri=null, size=" + this.d + ", caption=null)";
    }
}
