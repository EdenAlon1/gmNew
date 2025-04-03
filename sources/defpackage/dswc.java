package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes4.dex */
public final class dswc {
    public static final ffmf b = new ffmf(0.0f, 1.0f);
    public final float a;

    public static void a(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException(f + " is an invalid playback progress. Should be between 0 and 1.");
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dswc) && Float.compare(this.a, ((dswc) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "MediaPlaybackProgress(value=" + this.a + ")";
    }
}
