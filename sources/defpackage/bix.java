package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bix {
    public static final RectF a = new RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    public static int a(Matrix matrix) {
        matrix.getValues(new float[9]);
        return b((int) Math.round(Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
    }

    public static int b(int i) {
        return ((i % 360) + 360) % 360;
    }

    public static Matrix c(RectF rectF, RectF rectF2, int i) {
        return d(rectF, rectF2, i, false);
    }

    public static Matrix d(RectF rectF, RectF rectF2, int i, boolean z) {
        Matrix matrix = new Matrix();
        RectF rectF3 = a;
        matrix.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
        matrix.postRotate(i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF2, Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static Matrix e(Matrix matrix, Rect rect) {
        Matrix matrix2 = new Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    public static Rect f(Size size) {
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public static RectF g(Size size) {
        return new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
    }

    public static Size h(Rect rect, int i) {
        return k(i(rect), i);
    }

    public static Size i(Rect rect) {
        return new Size(rect.width(), rect.height());
    }

    public static Size j(Size size) {
        return new Size(size.getHeight(), size.getWidth());
    }

    public static Size k(Size size, int i) {
        int i2 = i % 90;
        ksw.b(i2 == 0, a.h(i, "Invalid rotation degrees: "));
        return n(b(i)) ? j(size) : size;
    }

    public static String l(Rect rect) {
        return String.format(Locale.US, "%s(%dx%d)", rect, Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    public static boolean m(Rect rect, Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static boolean n(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new IllegalArgumentException(a.h(i, "Invalid rotation degrees: "));
    }

    public static boolean o(Size size, boolean z, Size size2) {
        float width;
        float f;
        if (z) {
            f = size.getWidth() / size.getHeight();
            width = f;
        } else {
            float width2 = size.getWidth() + 1.0f;
            float height = size.getHeight() - 1.0f;
            width = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
            f = width2 / height;
        }
        return f >= (((float) size2.getWidth()) + (-1.0f)) / (((float) size2.getHeight()) + 1.0f) && (((float) size2.getWidth()) + 1.0f) / (((float) size2.getHeight()) + (-1.0f)) >= width;
    }
}
