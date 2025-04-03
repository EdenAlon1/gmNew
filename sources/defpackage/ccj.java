package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccj extends awc {
    static final PointF b = new PointF(2.0f, 2.0f);
    public final cbx c;
    public Rect d = null;
    public Matrix e;

    public ccj(cbx cbxVar) {
        this.c = cbxVar;
    }

    @Override // defpackage.awc
    protected final PointF a(float f, float f2) {
        float[] fArr = {f, f2};
        synchronized (this) {
            Matrix matrix = this.e;
            if (matrix == null) {
                return b;
            }
            matrix.mapPoints(fArr);
            return new PointF(fArr[0], fArr[1]);
        }
    }
}
