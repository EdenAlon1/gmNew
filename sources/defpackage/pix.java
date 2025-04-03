package defpackage;

import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pix {
    public final pgm a;
    public final pmd b;
    private final Configuration c;
    private final float d;

    public pix(pgm pgmVar, pmd pmdVar, Configuration configuration, float f) {
        this.a = pgmVar;
        this.b = pmdVar;
        this.c = configuration;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pix)) {
            return false;
        }
        pix pixVar = (pix) obj;
        return ffkj.e(this.a, pixVar.a) && ffkj.e(this.b, pixVar.b) && ffkj.e(this.c, pixVar.c) && Float.compare(this.d, pixVar.d) == 0;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + Float.floatToIntBits(this.d);
    }

    public final String toString() {
        return "ParentContainerInfo(windowBounds=" + this.a + ", windowLayoutInfo=" + this.b + ", configuration=" + this.c + ", density=" + this.d + ')';
    }
}
