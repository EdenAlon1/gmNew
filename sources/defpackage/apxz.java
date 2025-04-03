package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apxz {
    public final String a;
    public final Uri b;
    public final aqux c;
    public final fjay d;
    public final String e;
    public final bdhg f;
    private final boolean g;

    public /* synthetic */ apxz(String str, Uri uri, boolean z, aqux aquxVar, fjay fjayVar, String str2, bdhg bdhgVar, int i) {
        str.getClass();
        uri.getClass();
        this.a = str;
        this.b = uri;
        this.g = ((i & 4) == 0) & z;
        this.c = (i & 8) != 0 ? null : aquxVar;
        this.d = (i & 16) != 0 ? null : fjayVar;
        this.e = (i & 32) != 0 ? null : str2;
        this.f = (i & 64) != 0 ? null : bdhgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apxz)) {
            return false;
        }
        apxz apxzVar = (apxz) obj;
        return ffkj.e(this.a, apxzVar.a) && ffkj.e(this.b, apxzVar.b) && this.g == apxzVar.g && ffkj.e(this.c, apxzVar.c) && ffkj.e(this.d, apxzVar.d) && ffkj.e(this.e, apxzVar.e) && ffkj.e(this.f, apxzVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        aqux aquxVar = this.c;
        int hashCode2 = ((((hashCode * 31) + (true != this.g ? 1237 : 1231)) * 31) + (aquxVar == null ? 0 : aquxVar.hashCode())) * 31;
        fjay fjayVar = this.d;
        int hashCode3 = (hashCode2 + (fjayVar == null ? 0 : fjayVar.hashCode())) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        bdhg bdhgVar = this.f;
        return hashCode4 + (bdhgVar != null ? bdhgVar.hashCode() : 0);
    }

    public final String toString() {
        return "DefaultReactionMetadata(reactorName=" + this.a + ", reactorAvatar=" + this.b + ", isFromIos=" + this.g + ", selfIdentity=" + this.c + ", traceId=" + this.d + ", reactorProfileName=" + this.e + ", rcsMessageId=" + this.f + ")";
    }
}
