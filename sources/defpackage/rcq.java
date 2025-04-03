package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rcq implements qty {
    @Override // defpackage.qty
    public final qwv b(Context context, qwv qwvVar, int i, int i2) {
        if (!rkh.p(i, i2)) {
            throw new IllegalArgumentException(a.x(i2, i, "Cannot apply transformation on width: ", " or height: ", " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        qxf qxfVar = qpt.b(context).a;
        Bitmap bitmap = (Bitmap) qwvVar.c();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap c = c(qxfVar, bitmap, i, i2);
        return bitmap.equals(c) ? qwvVar : rcp.f(c, qxfVar);
    }

    protected abstract Bitmap c(qxf qxfVar, Bitmap bitmap, int i, int i2);
}
