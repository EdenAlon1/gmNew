package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxc {
    public final String a;
    public final Uri b;
    public final String c;
    public final ffjm d;
    private final ffbr e;

    public sxc(String str, Uri uri, ffbr ffbrVar, String str2, ffjm ffjmVar) {
        this.a = str;
        this.b = uri;
        this.e = ffbrVar;
        this.c = str2;
        this.d = ffjmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxc)) {
            return false;
        }
        sxc sxcVar = (sxc) obj;
        return ffkj.e(this.a, sxcVar.a) && ffkj.e(this.b, sxcVar.b) && ffkj.e(this.e, sxcVar.e) && ffkj.e(this.c, sxcVar.c) && ffkj.e(this.d, sxcVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        Uri uri = this.b;
        return (((((((hashCode * 31) + (uri != null ? uri.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "BlockedParticipantListItemUiData(normalizedDestination=" + this.a + ", avatarUri=" + this.b + ", imageManagerProvider=" + this.e + ", displayName=" + this.c + ", unblockAction=" + this.d + ")";
    }
}
