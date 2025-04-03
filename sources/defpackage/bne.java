package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bne {
    public static bne i(Bitmap bitmap, bia biaVar, Rect rect, int i, Matrix matrix, bcd bcdVar) {
        return new bmc(bitmap, biaVar, 42, new Size(bitmap.getWidth(), bitmap.getHeight()), rect, i, matrix, bcdVar);
    }

    public static bne j(avr avrVar, bia biaVar, Size size, Rect rect, int i, Matrix matrix, bcd bcdVar) {
        if (bly.d(avrVar.a())) {
            ksw.i(biaVar, "JPEG image must have Exif.");
        }
        return new bmc(avrVar, biaVar, avrVar.a(), size, rect, i, matrix, bcdVar);
    }

    public abstract int a();

    public abstract int b();

    public abstract Matrix c();

    public abstract Rect d();

    public abstract Size e();

    public abstract bcd f();

    public abstract bia g();

    public abstract Object h();
}
