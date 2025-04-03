package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pme {
    private final pgm a;
    private final float b;

    public pme(pgm pgmVar, float f) {
        this.a = pgmVar;
        this.b = f;
    }

    public final Rect a() {
        return this.a.c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ffkj.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        pme pmeVar = (pme) obj;
        return ffkj.e(this.a, pmeVar.a) && this.b == pmeVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public pme(Rect rect, float f) {
        this(new pgm(rect), f);
    }
}
