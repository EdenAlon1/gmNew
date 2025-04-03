package defpackage;

import android.net.Uri;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xzd implements apmt, xze {
    private final String a;
    private final Uri b;
    private final Uri c;
    private final Duration d;
    private final apdv e;
    private final dteh f;
    private final awap g;

    public xzd(String str, Uri uri, Duration duration, dteh dtehVar, awap awapVar) {
        str.getClass();
        this.a = str;
        this.b = uri;
        this.c = null;
        this.d = duration;
        this.e = null;
        this.f = dtehVar;
        this.g = awapVar;
    }

    @Override // defpackage.apmt
    public final apdv a() {
        return null;
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
        if (!(obj instanceof xzd)) {
            return false;
        }
        xzd xzdVar = (xzd) obj;
        if (!ffkj.e(this.a, xzdVar.a) || !ffkj.e(this.b, xzdVar.b)) {
            return false;
        }
        Uri uri = xzdVar.c;
        if (!ffkj.e(null, null) || !ffkj.e(this.d, xzdVar.d)) {
            return false;
        }
        apdv apdvVar = xzdVar.e;
        return ffkj.e(null, null) && ffkj.e(this.f, xzdVar.f) && ffkj.e(this.g, xzdVar.g);
    }

    @Override // defpackage.apmq
    public final apra fk() {
        return null;
    }

    @Override // defpackage.apmq
    public final awap fl() {
        return this.g;
    }

    @Override // defpackage.apmq
    public final /* synthetic */ boolean fp() {
        return apmp.a(this);
    }

    @Override // defpackage.apmt
    public final dteh g() {
        return this.f;
    }

    @Override // defpackage.apmt
    public final Duration h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + this.d.hashCode()) * 961) + this.f.hashCode();
        awap awapVar = this.g;
        return (hashCode * 31) + (awapVar == null ? 0 : awapVar.hashCode());
    }

    public final String toString() {
        return "MapiAudioContent(contentType=" + this.a + ", uri=" + cskw.d(this.b) + ", originalUri=null, duration=" + this.d + ", voiceTranscription=null, voiceMetadata=" + this.f + ",processingId=" + this.g + ")";
    }
}
