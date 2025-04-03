package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhn {
    public final xhi a;
    public final awap b;
    public final Uri c;
    public final emyg d;
    public final ffss e;
    private final boolean f;

    public xhn(xhi xhiVar, awap awapVar, Uri uri, emyg emygVar, ffss ffssVar) {
        this.a = xhiVar;
        this.b = awapVar;
        this.c = uri;
        this.d = emygVar;
        this.e = ffssVar;
        this.f = false;
    }

    public static /* synthetic */ xhn a(xhn xhnVar, awap awapVar, Uri uri, emyg emygVar, int i) {
        xhi xhiVar = (i & 1) != 0 ? xhnVar.a : null;
        if ((i & 2) != 0) {
            awapVar = xhnVar.b;
        }
        awap awapVar2 = awapVar;
        if ((i & 4) != 0) {
            uri = xhnVar.c;
        }
        Uri uri2 = uri;
        if ((i & 8) != 0) {
            emygVar = xhnVar.d;
        }
        ffss ffssVar = xhnVar.e;
        xhiVar.getClass();
        return new xhn(xhiVar, awapVar2, uri2, emygVar, ffssVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xhn)) {
            return false;
        }
        xhn xhnVar = (xhn) obj;
        if (!ffkj.e(this.a, xhnVar.a) || !ffkj.e(this.b, xhnVar.b) || !ffkj.e(this.c, xhnVar.c) || !ffkj.e(this.d, xhnVar.d) || !ffkj.e(this.e, xhnVar.e)) {
            return false;
        }
        boolean z = xhnVar.f;
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        awap awapVar = this.b;
        int hashCode2 = (hashCode + (awapVar == null ? 0 : awapVar.hashCode())) * 31;
        Uri uri = this.c;
        int hashCode3 = (hashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        emyg emygVar = this.d;
        int hashCode4 = (hashCode3 + (emygVar == null ? 0 : emygVar.hashCode())) * 31;
        ffss ffssVar = this.e;
        return ((hashCode4 + (ffssVar != null ? ffssVar.hashCode() : 0)) * 31) + 1237;
    }

    public final String toString() {
        Uri uri = this.c;
        String d = uri != null ? cskw.d(uri) : null;
        awap awapVar = this.b;
        return "Metadata(instanceId=" + this.a + ", processingId=" + awapVar + ", copy=" + d + ", draftLatencyStopwatch=" + this.d + ", deferredSpatulaVerdict=" + this.e + ", userWarnedAboutSensitiveContent=false)";
    }

    public /* synthetic */ xhn(xhi xhiVar, Uri uri, emyg emygVar, ffss ffssVar, int i) {
        this(xhiVar, (awap) null, (i & 4) != 0 ? null : uri, (i & 8) != 0 ? null : emygVar, (i & 16) != 0 ? null : ffssVar);
    }
}
