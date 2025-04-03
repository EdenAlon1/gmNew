package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxd implements zsu {
    public final apmt a;
    public final boolean b;
    public final String c;
    public final alxr d;
    public final zwb e;
    public final boolean f;
    public final boolean g;
    public final dnwi h;

    public zxd(apmt apmtVar, boolean z, String str, alxr alxrVar, zwb zwbVar, boolean z2, boolean z3, dnwi dnwiVar) {
        this.a = apmtVar;
        this.b = z;
        this.c = str;
        this.d = alxrVar;
        this.e = zwbVar;
        this.f = z2;
        this.g = z3;
        this.h = dnwiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxd)) {
            return false;
        }
        zxd zxdVar = (zxd) obj;
        return ffkj.e(this.a, zxdVar.a) && this.b == zxdVar.b && ffkj.e(this.c, zxdVar.c) && ffkj.e(this.d, zxdVar.d) && ffkj.e(this.e, zxdVar.e) && this.f == zxdVar.f && this.g == zxdVar.g && ffkj.e(this.h, zxdVar.h);
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + zxc.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        zwb zwbVar = this.e;
        int hashCode2 = ((((((hashCode * 31) + (zwbVar == null ? 0 : zwbVar.hashCode())) * 31) + zxc.a(this.f)) * 31) + zxc.a(this.g)) * 31;
        dnwi dnwiVar = this.h;
        return hashCode2 + (dnwiVar != null ? dnwiVar.hashCode() : 0);
    }

    public final String toString() {
        return "AudioBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ", message=" + this.d + ", searchData=" + this.e + ", isRichType=" + this.f + ", isOutgoing=" + this.g + ", statusUiData=" + this.h + ")";
    }
}
