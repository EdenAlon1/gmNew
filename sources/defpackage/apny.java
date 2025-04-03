package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apny implements apor {
    public final Long a;
    public final appq b;
    public final appq c;
    public final long d;

    public apny(Long l, appq appqVar, appq appqVar2, long j) {
        this.a = l;
        this.b = appqVar;
        this.c = appqVar2;
        this.d = j;
    }

    @Override // defpackage.apor
    public final Long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof apny)) {
            return false;
        }
        apny apnyVar = (apny) obj;
        return ffkj.e(this.a, apnyVar.a) && ffkj.e(this.b, apnyVar.b) && ffkj.e(this.c, apnyVar.c) && this.d == apnyVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        appq appqVar = this.b;
        int hashCode2 = (((hashCode + (appqVar == null ? 0 : appqVar.hashCode())) * 31) + this.c.hashCode()) * 31;
        long j = this.d;
        return hashCode2 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "BugleMediaRichCardAttachmentContent(targetFileSize=" + this.a + ", thumbnailContent=" + this.b + ", mediaContent=" + this.c + ", partId=" + this.d + ")";
    }
}
