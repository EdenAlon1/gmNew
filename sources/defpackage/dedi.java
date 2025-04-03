package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedi extends dedl {
    private final Uri a;
    private final long b;
    private final int c;
    private final int d;

    public dedi(Uri uri, long j, int i, int i2) {
        if (uri == null) {
            throw new NullPointerException("Null videoUri");
        }
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.dedl
    public final int a() {
        return this.d;
    }

    @Override // defpackage.dedl
    public final int b() {
        return this.c;
    }

    @Override // defpackage.dedl
    public final long c() {
        return this.b;
    }

    @Override // defpackage.dedl
    public final Uri d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dedl) {
            dedl dedlVar = (dedl) obj;
            if (this.a.equals(dedlVar.d()) && this.b == dedlVar.c() && this.c == dedlVar.b() && this.d == dedlVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "VideoAttachmentNeedsTrimmingEvent{videoUri=" + this.a.toString() + ", outputFileSizeKb=" + this.b + ", width=" + this.c + ", height=" + this.d + "}";
    }
}
