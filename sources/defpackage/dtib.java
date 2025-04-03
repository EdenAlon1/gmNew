package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtib {
    public final ffix a;
    public final int b;
    public final int c;

    public dtib(ffix ffixVar, int i, int i2) {
        this.a = ffixVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtib)) {
            return false;
        }
        dtib dtibVar = (dtib) obj;
        return ffkj.e(this.a, dtibVar.a) && this.b == dtibVar.b && this.c == dtibVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "PlayPauseButtonData(onClick=" + this.a + ", iconResId=" + this.b + ", contentDescriptionId=" + this.c + ")";
    }
}
