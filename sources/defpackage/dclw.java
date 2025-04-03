package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dclw extends dcqc {
    public final Uri a;
    private final int b;
    private final int c;
    private final long d;
    private final String e;

    public dclw(Uri uri, int i, int i2, long j, String str) {
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = str;
    }

    @Override // defpackage.dcqc
    public final int a() {
        return this.c;
    }

    @Override // defpackage.dcqc
    public final int b() {
        return this.b;
    }

    @Override // defpackage.dcqc
    public final long c() {
        return this.d;
    }

    @Override // defpackage.dcqc
    public final Uri d() {
        return this.a;
    }

    @Override // defpackage.dcqc
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dcqc) {
            dcqc dcqcVar = (dcqc) obj;
            if (this.a.equals(dcqcVar.d()) && this.b == dcqcVar.b() && this.c == dcqcVar.a() && this.d == dcqcVar.c() && this.e.equals(dcqcVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.d;
        return (((((((hashCode * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "MediaResult{uri=" + this.a.toString() + ", width=" + this.b + ", height=" + this.c + ", durationMillis=" + this.d + ", contentType=" + this.e + "}";
    }
}
