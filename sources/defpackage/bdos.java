package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdos extends bdot {
    public final String a;
    public final Uri b;

    public bdos(String str, Uri uri) {
        this.a = str;
        this.b = uri;
    }

    @Override // defpackage.bdot
    public final Uri a() {
        return this.b;
    }

    @Override // defpackage.bdot
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdot) {
            bdot bdotVar = (bdot) obj;
            String str = this.a;
            if (str != null ? str.equals(bdotVar.b()) : bdotVar.b() == null) {
                Uri uri = this.b;
                if (uri != null ? uri.equals(bdotVar.a()) : bdotVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        Uri uri = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        return "MessagePartContent{type=" + this.a + ", uri=" + String.valueOf(this.b) + "}";
    }
}
