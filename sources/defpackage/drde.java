package defpackage;

import android.graphics.Bitmap;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drde {
    public final Duration a;
    public final Bitmap b;

    public drde(Duration duration, Bitmap bitmap) {
        this.a = duration;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drde)) {
            return false;
        }
        drde drdeVar = (drde) obj;
        return ffkj.e(this.a, drdeVar.a) && ffkj.e(this.b, drdeVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GifFrame(presentationTime=" + this.a + ", bitmap=" + this.b + ")";
    }
}
