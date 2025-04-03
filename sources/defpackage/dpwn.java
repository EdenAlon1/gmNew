package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpwn {
    public final String a;
    public final dpwl b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final ffji f;

    public dpwn(String str, dpwl dpwlVar, boolean z, boolean z2, boolean z3, ffji ffjiVar) {
        this.a = str;
        this.b = dpwlVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = ffjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpwn)) {
            return false;
        }
        dpwn dpwnVar = (dpwn) obj;
        return ffkj.e(this.a, dpwnVar.a) && ffkj.e(this.b, dpwnVar.b) && this.c == dpwnVar.c && this.d == dpwnVar.d && this.e == dpwnVar.e && ffkj.e(this.f, dpwnVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dpwl dpwlVar = this.b;
        return ((((((((hashCode + (dpwlVar == null ? 0 : dpwlVar.hashCode())) * 31) + dpwm.a(this.c)) * 31) + dpwm.a(this.d)) * 31) + dpwm.a(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "EffectUiData(displayName=" + this.a + ", icon=" + this.b + ", isSelected=" + this.c + ", isInitializing=" + this.d + ", isDownloading=" + this.e + ", onSelect=" + this.f + ")";
    }
}
