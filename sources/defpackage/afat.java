package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afat extends afce {
    private final String a;
    private final String b;
    private final Uri c;

    public afat(String str, String str2, Uri uri) {
        if (str == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = str;
        this.b = str2;
        this.c = uri;
    }

    @Override // defpackage.afce
    public final Uri a() {
        return this.c;
    }

    @Override // defpackage.afce
    public final String b() {
        return this.a;
    }

    @Override // defpackage.afce
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof afce) {
            afce afceVar = (afce) obj;
            if (this.a.equals(afceVar.b()) && ((str = this.b) != null ? str.equals(afceVar.c()) : afceVar.c() == null) && ((uri = this.c) != null ? uri.equals(afceVar.a()) : afceVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        int hashCode2 = ((hashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Uri uri = this.c;
        return hashCode2 ^ (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "MessagePartUpdateParams{messageId=" + this.a + ", previewContentType=" + this.b + ", previewContentUri=" + String.valueOf(this.c) + "}";
    }
}
