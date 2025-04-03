package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwt implements zsu {
    public final ufr a;
    public final boolean b;
    public final String c;
    public final alxr d;
    public final boolean e;

    public zwt(ufr ufrVar, boolean z, String str, alxr alxrVar, boolean z2) {
        this.a = ufrVar;
        this.b = z;
        this.c = str;
        this.d = alxrVar;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwt)) {
            return false;
        }
        zwt zwtVar = (zwt) obj;
        return ffkj.e(this.a, zwtVar.a) && this.b == zwtVar.b && ffkj.e(this.c, zwtVar.c) && ffkj.e(this.d, zwtVar.d) && this.e == zwtVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + zws.a(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + zws.a(this.e);
    }

    public final String toString() {
        return "VCardBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ", message=" + this.d + ", isOutgoing=" + this.e + ")";
    }
}
