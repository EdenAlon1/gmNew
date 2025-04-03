package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhl implements xhm, doxx {
    public final xhi a;
    public final drlx b;
    public final Uri c;
    public final Long d;
    public final doxr e;
    private final Object f;

    public xhl(xhi xhiVar, drlx drlxVar, Uri uri, Long l, doxr doxrVar) {
        drlxVar.getClass();
        uri.getClass();
        doxrVar.getClass();
        this.a = xhiVar;
        this.b = drlxVar;
        this.c = uri;
        this.d = l;
        this.e = doxrVar;
        String uri2 = uri.toString();
        uri2.getClass();
        this.f = uri2;
    }

    @Override // defpackage.xhp
    public final xhi a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhl)) {
            return false;
        }
        xhl xhlVar = (xhl) obj;
        return ffkj.e(this.a, xhlVar.a) && ffkj.e(this.b, xhlVar.b) && ffkj.e(this.c, xhlVar.c) && ffkj.e(this.d, xhlVar.d) && ffkj.e(this.e, xhlVar.e);
    }

    @Override // defpackage.doxx
    public final Object fn() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        Long l = this.d;
        return (((hashCode * 31) + (l == null ? 0 : l.hashCode())) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Unresolved(instanceId=" + this.a + ", mediaType=" + this.b + ", uri=" + cskw.d(this.c) + ", sizeBytes=" + this.d + ", source=" + this.e + ")";
    }
}
