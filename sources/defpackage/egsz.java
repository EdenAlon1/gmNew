package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egsz implements egte {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Object e;
    public final ewke f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final String j;

    public egsz(String str, String str2, String str3, String str4, Object obj, ewke ewkeVar, boolean z, boolean z2, boolean z3, String str5) {
        str5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = obj;
        this.f = ewkeVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egsz)) {
            return false;
        }
        egsz egszVar = (egsz) obj;
        return ffkj.e(this.a, egszVar.a) && ffkj.e(this.b, egszVar.b) && ffkj.e(this.c, egszVar.c) && ffkj.e(this.d, egszVar.d) && ffkj.e(this.e, egszVar.e) && this.f == egszVar.f && this.g == egszVar.g && this.h == egszVar.h && this.i == egszVar.i && ffkj.e(this.j, egszVar.j);
    }

    public final int hashCode() {
        int hashCode = (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
        String str = this.j;
        boolean z = this.i;
        return (((((((hashCode * 31) + egsy.a(this.g)) * 31) + egsy.a(this.h)) * 31) + egsy.a(z)) * 31) + str.hashCode();
    }

    public final String toString() {
        return "ProcessingPhoto(mediaKey=" + this.a + ", photoUrl=" + this.b + ", accountName=" + this.c + ", name=" + this.d + ", avatarGlideModel=" + this.e + ", infoMessage=" + this.f + ", hasAnyGooglePhotos=" + this.g + ", locked=" + this.h + ", isDefaultPhoto=" + this.i + ", photoSource=" + this.j + ")";
    }
}
