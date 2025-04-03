package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiod implements aihu {
    public final Uri a;
    public final long b;
    public final int c;
    public final int d;

    public aiod(Uri uri, long j, int i, int i2) {
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aiod)) {
            return false;
        }
        aiod aiodVar = (aiod) obj;
        return ffkj.e(this.a, aiodVar.a) && this.b == aiodVar.b && this.c == aiodVar.c && this.d == aiodVar.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        long j = this.b;
        return ((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "VideoTrimmer(uri=" + this.a + ", maxOutputFileKb=" + this.b + ", outputWidthPx=" + this.c + ", outputHeightPx=" + this.d + ")";
    }
}
