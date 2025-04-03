package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class criw {
    public final List a;
    public final criy b;
    public final boolean c;
    public final boolean d;
    public final cjia e;
    public final String f;

    public criw(List list, criy criyVar, boolean z, boolean z2, cjia cjiaVar, String str) {
        this.a = list;
        this.b = criyVar;
        this.c = z;
        this.d = z2;
        this.e = cjiaVar;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof criw)) {
            return false;
        }
        criw criwVar = (criw) obj;
        return ffkj.e(this.a, criwVar.a) && ffkj.e(this.b, criwVar.b) && this.c == criwVar.c && this.d == criwVar.d && ffkj.e(this.e, criwVar.e) && ffkj.e(this.f, criwVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        cjia cjiaVar = this.e;
        int a = ((((((hashCode * 31) + criv.a(this.c)) * 31) + criv.a(this.d)) * 31) + (cjiaVar == null ? 0 : cjiaVar.hashCode())) * 31;
        String str = this.f;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "MessageAttachmentsParams(attachments=" + this.a + ", attachmentClickListener=" + this.b + ", isIncoming=" + this.c + ", isSenderRbmBot=" + this.d + ", googlePhotosSharingState=" + this.e + ", searchFilter=" + this.f + ")";
    }
}
