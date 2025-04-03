package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sko {
    public final Uri a;
    public final float b;
    private final String c;

    public sko(Uri uri, String str, float f) {
        this.a = uri;
        this.c = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sko)) {
            return false;
        }
        sko skoVar = (sko) obj;
        return ffkj.e(this.a, skoVar.a) && ffkj.e(this.c, skoVar.c) && Float.compare(this.b, skoVar.b) == 0;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c.hashCode()) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "SodaProgress(audioUri=" + this.a + ", partialResult=" + this.c + ", progress=" + this.b + ")";
    }
}
