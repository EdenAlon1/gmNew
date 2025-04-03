package defpackage;

import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrq {
    public final Surface a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    public lrq(Surface surface, int i, int i2, int i3, boolean z) {
        boolean z2 = true;
        if (i3 != 0 && i3 != 90 && i3 != 180) {
            if (i3 == 270) {
                i3 = 270;
            } else {
                z2 = false;
            }
        }
        lti.b(z2, "orientationDegrees must be 0, 90, 180, or 270");
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lrq)) {
            return false;
        }
        lrq lrqVar = (lrq) obj;
        return this.b == lrqVar.b && this.c == lrqVar.c && this.d == lrqVar.d && this.e == lrqVar.e && this.a.equals(lrqVar.a);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + (this.e ? 1 : 0);
    }
}
