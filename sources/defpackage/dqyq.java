package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqyq {
    public final String a;
    public final float b;
    public final boolean c;

    public dqyq(String str, float f, boolean z) {
        this.a = str;
        this.b = f;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqyq)) {
            return false;
        }
        dqyq dqyqVar = (dqyq) obj;
        return ffkj.e(this.a, dqyqVar.a) && Float.compare(this.b, dqyqVar.b) == 0 && this.c == dqyqVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + Float.floatToIntBits(this.b)) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "EmotifyActivityResultInput(uri=" + this.a + ", smallSegmentRatio=" + this.b + ", enableEmotifyActivityEdgeToEdgeDisplay=" + this.c + ")";
    }
}
