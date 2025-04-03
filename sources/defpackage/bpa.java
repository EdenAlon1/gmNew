package defpackage;

import android.graphics.Rect;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpa {
    public final Rect a;
    public final Size b;
    public final Size c;

    public bpa(Rect rect, Size size, Size size2) {
        rect.getClass();
        size.getClass();
        size2.getClass();
        this.a = rect;
        this.b = size;
        this.c = size2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpa)) {
            return false;
        }
        bpa bpaVar = (bpa) obj;
        return ffkj.e(this.a, bpaVar.a) && ffkj.e(this.b, bpaVar.b) && ffkj.e(this.c, bpaVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PreferredChildSize(cropRectBeforeScaling=" + this.a + ", childSizeToScale=" + this.b + ", originalSelectedChildSize=" + this.c + ')';
    }
}
