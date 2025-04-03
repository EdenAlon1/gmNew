package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azch {
    public final azcr a;
    public final azcg b;
    public final String c;

    public azch(azcr azcrVar, azcg azcgVar, String str) {
        azcgVar.getClass();
        str.getClass();
        this.a = azcrVar;
        this.b = azcgVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azch)) {
            return false;
        }
        azch azchVar = (azch) obj;
        return ffkj.e(this.a, azchVar.a) && this.b == azchVar.b && ffkj.e(this.c, azchVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Destination(token=" + this.a + ", type=" + this.b + ", address=" + this.c + ")";
    }
}
