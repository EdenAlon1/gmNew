package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwy {
    public final boolean a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final Duration f;

    public xwy(boolean z, long j, boolean z2, boolean z3, int i, Duration duration) {
        this.a = z;
        this.b = j;
        this.c = z2;
        this.d = z3;
        this.e = i;
        this.f = duration;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwy)) {
            return false;
        }
        xwy xwyVar = (xwy) obj;
        return this.a == xwyVar.a && this.b == xwyVar.b && this.c == xwyVar.c && this.d == xwyVar.d && this.e == xwyVar.e && ffkj.e(this.f, xwyVar.f);
    }

    public final int hashCode() {
        long j = this.b;
        int a = xwx.a(this.a);
        Duration duration = this.f;
        return (((((((((a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + xwx.a(this.c)) * 31) + xwx.a(this.d)) * 31) + this.e) * 31) + duration.hashCode();
    }

    public final String toString() {
        return "AttachmentConstraints(allowMultipleVideos=" + this.a + ", maxMessageSizeBytes=" + this.b + ", mediaAttachmentsSupported=" + this.c + ", locationSharingSupported=" + this.d + ", attachmentCountLimit=" + this.e + ", maxVideoDuration=" + this.f + ")";
    }
}
