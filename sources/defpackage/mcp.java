package defpackage;

import android.content.Context;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcp implements mbs {
    public final float a = 1.0f;
    public final float b = 1.0f;
    public final float c;
    private final Matrix d;
    private Matrix e;

    public mcp(float f) {
        this.c = f;
        Matrix matrix = new Matrix();
        this.d = matrix;
        matrix.postScale(1.0f, 1.0f);
        matrix.postRotate(f);
    }

    @Override // defpackage.mbd
    public final /* bridge */ /* synthetic */ mbj b(Context context, boolean z) {
        mbj f;
        f = f(context, z);
        return f;
    }

    @Override // defpackage.mbd
    public final boolean c(int i, int i2) {
        lux e = e(i, i2);
        Matrix matrix = this.e;
        lti.g(matrix);
        return matrix.isIdentity() && i == e.c && i2 == e.d;
    }

    @Override // defpackage.mbf
    public final /* synthetic */ int d() {
        return 9729;
    }

    @Override // defpackage.mbf
    public final lux e(int i, int i2) {
        lti.b(i > 0, "inputWidth must be positive");
        lti.b(i2 > 0, "inputHeight must be positive");
        this.e = new Matrix(this.d);
        if (this.d.isIdentity()) {
            return new lux(i, i2);
        }
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        this.e.preScale(f3, 1.0f);
        this.e.postScale(1.0f / f3, 1.0f);
        float[][] fArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}};
        float f4 = Float.MIN_VALUE;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MIN_VALUE;
        for (int i3 = 0; i3 < 4; i3++) {
            float[] fArr2 = fArr[i3];
            this.e.mapPoints(fArr2);
            f5 = Math.min(f5, fArr2[0]);
            f4 = Math.max(f4, fArr2[0]);
            f6 = Math.min(f6, fArr2[1]);
            f7 = Math.max(f7, fArr2[1]);
        }
        float f8 = (f4 - f5) / 2.0f;
        float f9 = (f7 - f6) / 2.0f;
        this.e.postScale(1.0f / f8, 1.0f / f9);
        return new lux(Math.round(f * f8), Math.round(f2 * f9));
    }

    @Override // defpackage.mbf
    public final /* synthetic */ lyi f(Context context, boolean z) {
        return mbe.a(this, context, z);
    }

    @Override // defpackage.mbs
    public final Matrix g() {
        Matrix matrix = this.e;
        lti.h(matrix, "configure must be called first");
        return matrix;
    }

    @Override // defpackage.mbf
    public final /* synthetic */ float[] h() {
        return mbr.a(this);
    }

    @Override // defpackage.lpx
    public final /* synthetic */ void a() {
    }
}
