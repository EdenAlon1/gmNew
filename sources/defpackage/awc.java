package defpackage;

import android.graphics.PointF;
import android.util.Rational;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class awc {
    public Rational a = null;

    protected abstract PointF a(float f, float f2);

    public final awb b(float f, float f2, float f3) {
        PointF a = a(f, f2);
        return new awb(a.x, a.y, f3, this.a);
    }
}
