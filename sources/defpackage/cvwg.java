package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwg {
    public final String a;
    public final boolean b;
    public final ffix c;

    public cvwg(String str, boolean z, ffix ffixVar) {
        this.a = str;
        this.b = z;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvwg)) {
            return false;
        }
        cvwg cvwgVar = (cvwg) obj;
        return ffkj.e(this.a, cvwgVar.a) && this.b == cvwgVar.b && ffkj.e(this.c, cvwgVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DestinationUiData(displayDestination=" + this.a + ", isSelected=" + this.b + ", onClick=" + this.c + ")";
    }
}
