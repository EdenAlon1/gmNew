package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvo {
    public final float a;
    public final ffji b;
    public final ffix c;

    public dlvo(float f, ffji ffjiVar, ffix ffixVar) {
        ffjiVar.getClass();
        ffixVar.getClass();
        this.a = f;
        this.b = ffjiVar;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlvo)) {
            return false;
        }
        dlvo dlvoVar = (dlvo) obj;
        return Float.compare(this.a, dlvoVar.a) == 0 && ffkj.e(this.b, dlvoVar.b) && ffkj.e(this.c, dlvoVar.c);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SeekbarUiData(progress=" + this.a + ", onSeek=" + this.b + ", onSeekFinished=" + this.c + ")";
    }
}
