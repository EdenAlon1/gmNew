package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cixy extends cjba {
    public final Uri a;
    public final String b;

    public cixy(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    @Override // defpackage.cjba
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.cjba
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cjba) {
            cjba cjbaVar = (cjba) obj;
            Uri uri = this.a;
            if (uri != null ? uri.equals(cjbaVar.a()) : cjbaVar.a() == null) {
                String str = this.b;
                if (str != null ? str.equals(cjbaVar.b()) : cjbaVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = uri == null ? 0 : uri.hashCode();
        String str = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "Attachment{uri=" + String.valueOf(this.a) + ", contentType=" + this.b + "}";
    }
}
