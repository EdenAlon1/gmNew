package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvw {
    public final String a;
    public final String b;
    public final dpwl c;
    public final boolean d;
    public final boolean e;

    public dpvw(String str, String str2, dpwl dpwlVar, boolean z, boolean z2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = dpwlVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean a(dpvw dpvwVar) {
        return ffkj.e(this.a, dpvwVar != null ? dpvwVar.a : null) && ffkj.e(this.b, dpvwVar.b) && ffkj.e(this.c, dpvwVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpvw)) {
            return false;
        }
        dpvw dpvwVar = (dpvw) obj;
        return ffkj.e(this.a, dpvwVar.a) && ffkj.e(this.b, dpvwVar.b) && ffkj.e(this.c, dpvwVar.c) && this.d == dpvwVar.d && this.e == dpvwVar.e;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dpwl dpwlVar = this.c;
        return (((((hashCode * 31) + (dpwlVar == null ? 0 : dpwlVar.hashCode())) * 31) + dpvv.a(this.d)) * 31) + dpvv.a(this.e);
    }

    public final String toString() {
        return "CameraEffect(effectId=" + this.a + ", displayName=" + this.b + ", icon=" + this.c + ", isSelected=" + this.d + ", isDownloading=" + this.e + ")";
    }

    public /* synthetic */ dpvw(String str, String str2, dpwl dpwlVar) {
        this(str, str2, dpwlVar, false, false);
    }
}
