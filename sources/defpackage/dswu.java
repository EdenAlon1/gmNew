package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dswu {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public dswu(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dswu)) {
            return false;
        }
        dswu dswuVar = (dswu) obj;
        return this.a == dswuVar.a && this.b == dswuVar.b && this.c == dswuVar.c && this.d == dswuVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "ExoPlayerConfiguration(minBufferMs=" + this.a + ", maxBufferMs=" + this.b + ", bufferForPlaybackMs=" + this.c + ", bufferForPlaybackAfterRebufferMs=" + this.d + ")";
    }
}
