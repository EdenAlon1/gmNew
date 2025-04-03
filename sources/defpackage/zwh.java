package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwh implements zsu {
    public final alxr a;
    public final apph b;
    public final boolean c;
    public final String d;
    public final dnwi e;
    private final boolean f;

    public zwh(alxr alxrVar, apph apphVar, boolean z, String str, boolean z2, dnwi dnwiVar) {
        this.a = alxrVar;
        this.b = apphVar;
        this.c = z;
        this.d = str;
        this.f = z2;
        this.e = dnwiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwh)) {
            return false;
        }
        zwh zwhVar = (zwh) obj;
        return ffkj.e(this.a, zwhVar.a) && ffkj.e(this.b, zwhVar.b) && this.c == zwhVar.c && ffkj.e(this.d, zwhVar.d) && this.f == zwhVar.f && ffkj.e(this.e, zwhVar.e);
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + zwg.a(this.c)) * 31) + this.d.hashCode();
        dnwi dnwiVar = this.e;
        return (((hashCode * 31) + zwg.a(this.f)) * 31) + (dnwiVar == null ? 0 : dnwiVar.hashCode());
    }

    public final String toString() {
        return "FileBubbleArgs(message=" + this.a + ", content=" + this.b + ", isHighlighted=" + this.c + ", contentDescription=" + this.d + ", isOutgoing=" + this.f + ", statusUiData=" + this.e + ")";
    }
}
