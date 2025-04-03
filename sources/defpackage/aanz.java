package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aanz implements zsu {
    public final alxr a;
    public final boolean b;
    public final appq c;
    public final boolean d;
    public final String e;
    private final boolean f;

    public aanz(alxr alxrVar, boolean z, boolean z2, appq appqVar, boolean z3, String str) {
        this.a = alxrVar;
        this.b = z;
        this.f = z2;
        this.c = appqVar;
        this.d = z3;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aanz)) {
            return false;
        }
        aanz aanzVar = (aanz) obj;
        return ffkj.e(this.a, aanzVar.a) && this.b == aanzVar.b && this.f == aanzVar.f && ffkj.e(this.c, aanzVar.c) && this.d == aanzVar.d && ffkj.e(this.e, aanzVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        appq appqVar = this.c;
        return ((((((((hashCode + aany.a(this.b)) * 31) + aany.a(this.f)) * 31) + appqVar.hashCode()) * 31) + aany.a(this.d)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "VideoBubbleArgs(message=" + this.a + ", isOutgoing=" + this.b + ", hasBottomSheetAction=" + this.f + ", content=" + this.c + ", isHighlighted=" + this.d + ", contentDescription=" + this.e + ")";
    }
}
