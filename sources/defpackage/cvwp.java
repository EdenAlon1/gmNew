package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwp {
    public final fgdj a;
    public final ffix b;

    public cvwp(fgdj fgdjVar, ffix ffixVar) {
        this.a = fgdjVar;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvwp)) {
            return false;
        }
        cvwp cvwpVar = (cvwp) obj;
        return ffkj.e(this.a, cvwpVar.a) && ffkj.e(this.b, cvwpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DestinationsDialogUiData(destinations=" + this.a + ", onDismiss=" + this.b + ")";
    }
}
