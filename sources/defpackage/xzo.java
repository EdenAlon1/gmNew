package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xzo implements appq, xze {
    public final boolean a;
    public final boolean b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final Size f;
    private final String g;
    private final Duration h;
    private final Instant i;
    private final awap j;

    public xzo(String str, Uri uri, Uri uri2, Size size, Duration duration, Instant instant, boolean z, boolean z2, awap awapVar) {
        str.getClass();
        this.c = str;
        this.d = uri;
        this.e = uri2;
        this.f = size;
        this.g = null;
        this.h = duration;
        this.i = instant;
        this.a = z;
        this.b = z2;
        this.j = awapVar;
    }

    @Override // defpackage.appq
    public final long a() {
        return this.i.toEpochMilli();
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
    public final Uri d() {
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
        if (!(obj instanceof xzo)) {
            return false;
        }
        xzo xzoVar = (xzo) obj;
        if (!ffkj.e(this.c, xzoVar.c) || !ffkj.e(this.d, xzoVar.d) || !ffkj.e(this.e, xzoVar.e) || !ffkj.e(this.f, xzoVar.f)) {
            return false;
        }
        String str = xzoVar.g;
        return ffkj.e(null, null) && ffkj.e(this.h, xzoVar.h) && ffkj.e(this.i, xzoVar.i) && this.a == xzoVar.a && this.b == xzoVar.b && ffkj.e(this.j, xzoVar.j);
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
        return this.j;
    }

    @Override // defpackage.apmq
    public final /* synthetic */ boolean fp() {
        return apmp.a(this);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        Uri uri = this.e;
        int hashCode2 = ((((((((((((hashCode * 31) + (uri == null ? 0 : uri.hashCode())) * 31) + this.f.hashCode()) * 961) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + xzn.a(this.a)) * 31) + xzn.a(this.b)) * 31;
        awap awapVar = this.j;
        return hashCode2 + (awapVar != null ? awapVar.hashCode() : 0);
    }

    @Override // defpackage.appq
    public final Optional j() {
        return Optional.ofNullable(Long.valueOf(this.h.toMillis()));
    }

    @Override // defpackage.apqd
    public final String k() {
        return null;
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
        return 0;
    }

    public final String toString() {
        Uri uri = this.e;
        String d = cskw.d(this.d);
        String d2 = uri != null ? cskw.d(uri) : null;
        return "MapiVideoContent(contentType=" + this.c + ", uri=" + d + ", originalUri=" + d2 + ", size=" + this.f + ", caption=null, duration=" + this.h + ", mediaModifiedTimestamp=" + this.i + ", isResizable=" + this.a + ", saveToExternalStorage=" + this.b + ",processingId=" + this.j + ")";
    }
}
