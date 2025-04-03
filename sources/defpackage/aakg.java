package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aakg implements zsu {
    public final alxr a;
    public final appr b;
    public final boolean c;
    public final String d;

    public aakg(alxr alxrVar, appr apprVar, boolean z, String str) {
        apprVar.getClass();
        this.a = alxrVar;
        this.b = apprVar;
        this.c = z;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aakg)) {
            return false;
        }
        aakg aakgVar = (aakg) obj;
        return ffkj.e(this.a, aakgVar.a) && ffkj.e(this.b, aakgVar.b) && this.c == aakgVar.c && ffkj.e(this.d, aakgVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RichCardBubbleArgs(message=" + this.a + ", content=" + this.b + ", isHighlighted=" + this.c + ", contentDescription=" + this.d + ")";
    }
}
