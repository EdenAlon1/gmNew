package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibc implements icv {
    public final Path a;
    public RectF b;
    private float[] c;
    private Matrix d;

    public ibc() {
        this((byte[]) null);
    }

    @Override // defpackage.icv
    public final int a() {
        return this.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @Override // defpackage.icv
    public final iam b() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new iam(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // defpackage.icv
    public final void c() {
        this.a.close();
    }

    @Override // defpackage.icv
    public final void d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.icv
    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    @Override // defpackage.icv
    public final void f(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    @Override // defpackage.icv
    public final void g(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    @Override // defpackage.icv
    public final void h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.icv
    public final void i(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    @Override // defpackage.icv
    public final void j(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // defpackage.icv
    public final void k() {
        this.a.reset();
    }

    @Override // defpackage.icv
    public final void l() {
        this.a.rewind();
    }

    @Override // defpackage.icv
    public final void m(int i) {
        this.a.setFillType(icw.a(i, 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // defpackage.icv
    public final void n(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Path path = this.a;
        Matrix matrix3 = this.d;
        matrix3.getClass();
        path.transform(matrix3);
    }

    @Override // defpackage.icv
    public final boolean o() {
        return this.a.isConvex();
    }

    @Override // defpackage.icv
    public final void p(icv icvVar, icv icvVar2, int i) {
        this.a.op(((ibc) icvVar).a, ((ibc) icvVar2).a, icx.a(i, 0) ? Path.Op.DIFFERENCE : icx.a(i, 1) ? Path.Op.INTERSECT : icx.a(i, 4) ? Path.Op.REVERSE_DIFFERENCE : icx.a(i, 2) ? Path.Op.UNION : Path.Op.XOR);
    }

    @Override // defpackage.icv
    public final void q(icv icvVar) {
        float intBitsToFloat = Float.intBitsToFloat(0);
        float intBitsToFloat2 = Float.intBitsToFloat(0);
        this.a.addPath(((ibc) icvVar).a, intBitsToFloat, intBitsToFloat2);
    }

    @Override // defpackage.icv
    public final void r(iam iamVar) {
        if (Float.isNaN(iamVar.b) || Float.isNaN(iamVar.c) || Float.isNaN(iamVar.d) || Float.isNaN(iamVar.e)) {
            ibg.a("Invalid rectangle, make sure no value is NaN");
        }
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        rectF.set(iamVar.b, iamVar.c, iamVar.d, iamVar.e);
        Path path = this.a;
        RectF rectF2 = this.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    @Override // defpackage.icv
    public final void s(iao iaoVar) {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        rectF.set(iaoVar.a, iaoVar.b, iaoVar.c, iaoVar.d);
        if (this.c == null) {
            this.c = new float[8];
        }
        float[] fArr = this.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (iaoVar.e >> 32));
        fArr[1] = Float.intBitsToFloat((int) (iaoVar.e & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (iaoVar.f >> 32));
        fArr[3] = Float.intBitsToFloat((int) (iaoVar.f & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (iaoVar.g >> 32));
        fArr[5] = Float.intBitsToFloat((int) (iaoVar.g & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (iaoVar.h >> 32));
        fArr[7] = Float.intBitsToFloat((int) (iaoVar.h & 4294967295L));
        Path path = this.a;
        RectF rectF2 = this.b;
        rectF2.getClass();
        float[] fArr2 = this.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public ibc(Path path) {
        this.a = path;
    }

    public /* synthetic */ ibc(byte[] bArr) {
        this(new Path());
    }
}
