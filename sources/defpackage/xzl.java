package defpackage;

import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xzl implements apps, xze {
    private final Uri a;
    private final String b;
    private final double c;
    private final double d;

    public xzl(Uri uri, String str, double d, double d2) {
        this.a = uri;
        this.b = str;
        this.c = d;
        this.d = d2;
    }

    @Override // defpackage.apps
    public final double a() {
        return this.c;
    }

    @Override // defpackage.appj
    public final String b() {
        return "application/vnd.gsma.rcspushlocation+xml";
    }

    @Override // defpackage.apmq
    public final Uri c() {
        return null;
    }

    @Override // defpackage.apmq
    public final Uri e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzl)) {
            return false;
        }
        xzl xzlVar = (xzl) obj;
        return ffkj.e(this.a, xzlVar.a) && ffkj.e(this.b, xzlVar.b) && Double.compare(this.c, xzlVar.c) == 0 && Double.compare(this.d, xzlVar.d) == 0;
    }

    @Override // defpackage.apqd
    public final Size f() {
        return new Size(800, 400);
    }

    @Override // defpackage.apmq
    public final apra fk() {
        return null;
    }

    @Override // defpackage.apmq
    public final /* synthetic */ awap fl() {
        return null;
    }

    @Override // defpackage.apmq
    public final /* synthetic */ boolean fp() {
        return apmp.a(this);
    }

    @Override // defpackage.apps
    public final double h() {
        return this.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + xzk.a(this.c)) * 31) + xzk.a(this.d);
    }

    @Override // defpackage.apqd
    public final /* bridge */ /* synthetic */ String k() {
        return null;
    }

    @Override // defpackage.apps
    public final String m() {
        return this.b;
    }

    public final String toString() {
        double d = this.d;
        String str = this.b;
        return "MapiRichLocationContent(uri=" + cskw.d(this.a) + ", captionText=" + ((Object) cskw.c(str)) + ", longitude=" + ((Object) cskw.c(String.valueOf(d))) + ", latitude=" + ((Object) cskw.c(String.valueOf(this.c))) + ")";
    }
}
