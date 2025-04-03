package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbx {
    public Size a;
    public Rect b;
    public int c;
    public Matrix d;
    public int e;
    public boolean f;
    public boolean g;
    public int h = 2;

    private final Size g() {
        return bix.n(this.c) ? new Size(this.b.height(), this.b.width()) : new Size(this.b.width(), this.b.height());
    }

    public final int a() {
        return !this.g ? this.c : -bhp.b(this.e);
    }

    public final Matrix b(Size size, int i) {
        if (!f()) {
            return null;
        }
        Matrix matrix = new Matrix(this.d);
        matrix.postConcat(c(size, i));
        return matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.graphics.Matrix c(android.util.Size r11, int r12) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbx.c(android.util.Size, int):android.graphics.Matrix");
    }

    public final Matrix d() {
        ksw.c(f());
        RectF rectF = new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight());
        return bix.c(rectF, rectF, a());
    }

    public final RectF e(Size size, int i) {
        ksw.c(f());
        Matrix c = c(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight());
        c.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        return (this.b == null || this.a == null || !(!this.g || this.e != -1)) ? false : true;
    }
}
