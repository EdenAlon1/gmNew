package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class plm {
    private final pgm a;
    private final pll b;
    private final plk c;

    public plm(pgm pgmVar, pll pllVar, plk plkVar) {
        this.a = pgmVar;
        this.b = pllVar;
        this.c = plkVar;
        if (pgmVar.b() == 0 && pgmVar.a() == 0) {
            throw new IllegalArgumentException("Bounds must be non zero");
        }
        if (pgmVar.b != 0 && pgmVar.c != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final Rect a() {
        return this.a.c();
    }

    public final plj b() {
        pgm pgmVar = this.a;
        return pgmVar.b() > pgmVar.a() ? plj.b : plj.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ffkj.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        plm plmVar = (plm) obj;
        return ffkj.e(this.a, plmVar.a) && ffkj.e(this.b, plmVar.b) && ffkj.e(this.c, plmVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "plm { " + this.a + ", type=" + this.b + ", state=" + this.c + " }";
    }
}
