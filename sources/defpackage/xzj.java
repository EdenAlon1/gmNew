package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xzj implements appq, xze {
    public final boolean a;
    public final boolean b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final Size f;
    private final String g;
    private final Instant h;
    private final awap i;
    private final int j;

    public xzj(String str, Uri uri, Uri uri2, Size size, String str2, Instant instant, boolean z, boolean z2, awap awapVar, int i) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        this.c = str;
        this.d = uri;
        this.e = uri2;
        this.f = size;
        this.g = str2;
        this.h = instant;
        this.a = z;
        this.b = z2;
        this.i = awapVar;
        this.j = i;
    }

    @Override // defpackage.appq
    public final long a() {
        return this.h.toEpochMilli();
    }

    @Override // defpackage.appj
    public final String b() {
        return this.c;
    }

    @Override // defpackage.apmq
    public final Uri c() {
        return this.e;
    }

    @Override // defpackage.appq
    public final /* bridge */ /* synthetic */ Uri d() {
        return null;
    }

    @Override // defpackage.apmq
    public final Uri e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzj)) {
            return false;
        }
        xzj xzjVar = (xzj) obj;
        return ffkj.e(this.c, xzjVar.c) && ffkj.e(this.d, xzjVar.d) && ffkj.e(this.e, xzjVar.e) && ffkj.e(this.f, xzjVar.f) && ffkj.e(this.g, xzjVar.g) && ffkj.e(this.h, xzjVar.h) && this.a == xzjVar.a && this.b == xzjVar.b && ffkj.e(this.i, xzjVar.i) && this.j == xzjVar.j;
    }

    @Override // defpackage.apqd
    public final Size f() {
        return this.f;
    }

    @Override // defpackage.apmq
    public final apra fk() {
        return null;
    }

    @Override // defpackage.apmq
    public final awap fl() {
        return this.i;
    }

    @Override // defpackage.apmq
    public final /* synthetic */ boolean fp() {
        return apmp.a(this);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        Uri uri = this.e;
        int hashCode2 = ((((hashCode * 31) + (uri == null ? 0 : uri.hashCode())) * 31) + this.f.hashCode()) * 31;
        String str = this.g;
        int hashCode3 = (((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.h.hashCode()) * 31) + xzi.a(this.a)) * 31) + xzi.a(this.b)) * 31;
        awap awapVar = this.i;
        return ((hashCode3 + (awapVar != null ? awapVar.hashCode() : 0)) * 31) + this.j;
    }

    @Override // defpackage.appq
    public final Optional j() {
        return Optional.empty();
    }

    @Override // defpackage.apqd
    public final String k() {
        return this.g;
    }

    @Override // defpackage.appq
    public final boolean l() {
        return this.a;
    }

    @Override // defpackage.appq
    public final boolean m() {
        return this.b;
    }

    @Override // defpackage.appq
    public final int n() {
        return this.j;
    }

    public final String toString() {
        Uri uri = this.e;
        String d = cskw.d(this.d);
        String d2 = uri != null ? cskw.d(uri) : null;
        Size size = this.f;
        String str = this.g;
        CharSequence c = str != null ? cskw.c(str) : null;
        return "MapiImageContent(contentType=" + this.c + ", uri=" + d + ", originalUri=" + d2 + ", size=" + size + ", caption=" + ((Object) c) + ", mediaModifiedTimestamp=" + this.h + ", isResizable=" + this.a + ", saveToExternalStorage=" + this.b + "(), processingId=" + this.i + ")";
    }
}
