package defpackage;

import android.graphics.PathMeasure;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibe {
    private final PathMeasure a;

    public ibe(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final float a() {
        return this.a.getLength();
    }

    public final void b(float f, float f2, icv icvVar) {
        if (!(icvVar instanceof ibc)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        this.a.getSegment(f, f2, ((ibc) icvVar).a, true);
    }

    public final void c(icv icvVar) {
        this.a.setPath(((ibc) icvVar).a, false);
    }
}
