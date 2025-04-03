package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpt {
    public static final kpt a = new kpt(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private kpt(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static kpt b(kpt kptVar, kpt kptVar2) {
        return d(Math.max(kptVar.b, kptVar2.b), Math.max(kptVar.c, kptVar2.c), Math.max(kptVar.d, kptVar2.d), Math.max(kptVar.e, kptVar2.e));
    }

    public static kpt c(Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static kpt d(int i, int i2, int i3, int i4) {
        if (i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return a;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        return new kpt(i, i2, i3, i4);
    }

    public static kpt e(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return d(i, i2, i3, i4);
    }

    public final Insets a() {
        Insets of;
        of = Insets.of(this.b, this.c, this.d, this.e);
        return of;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kpt kptVar = (kpt) obj;
        return this.e == kptVar.e && this.b == kptVar.b && this.d == kptVar.d && this.c == kptVar.c;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
