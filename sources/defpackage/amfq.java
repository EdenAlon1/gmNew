package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amfq extends amky {
    public final String a;
    public final String b;
    private final String c;
    private final Uri d;

    public amfq(String str, String str2, Uri uri, String str3) {
        this.a = str;
        this.c = str2;
        this.d = uri;
        this.b = str3;
    }

    @Override // defpackage.amky
    public final Uri a() {
        return this.d;
    }

    @Override // defpackage.amky
    public final String b() {
        return this.b;
    }

    @Override // defpackage.amky
    public final String c() {
        return this.c;
    }

    @Override // defpackage.amky
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amky) {
            amky amkyVar = (amky) obj;
            String str = this.a;
            if (str != null ? str.equals(amkyVar.d()) : amkyVar.d() == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(amkyVar.c()) : amkyVar.c() == null) {
                    Uri uri = this.d;
                    if (uri != null ? uri.equals(amkyVar.a()) : amkyVar.a() == null) {
                        String str3 = this.b;
                        if (str3 != null ? str3.equals(amkyVar.b()) : amkyVar.b() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.c;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        Uri uri = this.d;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (uri == null ? 0 : uri.hashCode())) * 1000003;
        String str3 = this.b;
        return hashCode3 ^ (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return "DraftSnippet{text=" + this.a + ", subject=" + this.c + ", previewUri=" + String.valueOf(this.d) + ", previewContentType=" + this.b + "}";
    }
}
