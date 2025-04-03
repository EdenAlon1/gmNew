package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aali implements zsu {
    public final alxr a;
    public final boolean b;
    public final String c;
    public final apod d;

    public aali(alxr alxrVar, apod apodVar, boolean z, String str) {
        this.a = alxrVar;
        this.d = apodVar;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aali)) {
            return false;
        }
        aali aaliVar = (aali) obj;
        return ffkj.e(this.a, aaliVar.a) && ffkj.e(this.d, aaliVar.d) && this.b == aaliVar.b && ffkj.e(this.c, aaliVar.c);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.d.hashCode()) * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RichCardCarouselBubbleArgs(message=" + this.a + ", content=" + this.d + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ")";
    }
}
