package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehoy {
    private final ehpg[] a = new ehpg[4];
    private final Matrix[] b = new Matrix[4];
    private final Matrix[] c = new Matrix[4];
    private final PointF d = new PointF();
    private final Path e = new Path();
    private final Path f = new Path();
    private final ehpg g = new ehpg();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    public ehoy() {
        for (int i = 0; i < 4; i++) {
            this.a[i] = new ehpg();
            this.b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    static final ehoh c(int i, ehow ehowVar) {
        return i != 1 ? i != 2 ? i != 3 ? ehowVar.g : ehowVar.f : ehowVar.i : ehowVar.h;
    }

    private final boolean d(Path path, int i) {
        this.k.reset();
        this.a[i].c(this.b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private static final float e(int i) {
        return ((i + 1) % 4) * 90;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    public final void a(ehow ehowVar, float[] fArr, float f, RectF rectF, ehom ehomVar, Path path) {
        int i;
        char c;
        char c2;
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF, Path.Direction.CW);
        ?? r5 = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            (i2 != 1 ? i2 != 2 ? i2 != 3 ? ehowVar.c : ehowVar.b : ehowVar.e : ehowVar.d).a(this.a[i2], f, (fArr == null ? c(i2, ehowVar) : new ehog(fArr[i2])).a(rectF));
            float e = e(i2);
            this.b[i2].reset();
            PointF pointF = this.d;
            if (i2 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            Matrix matrix = this.b[i2];
            PointF pointF2 = this.d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.b[i2].preRotate(e);
            float[] fArr2 = this.h;
            ehpg ehpgVar = this.a[i2];
            fArr2[0] = ehpgVar.b;
            fArr2[1] = ehpgVar.c;
            this.b[i2].mapPoints(fArr2);
            float e2 = e(i2);
            this.c[i2].reset();
            Matrix matrix2 = this.c[i2];
            float[] fArr3 = this.h;
            matrix2.setTranslate(fArr3[0], fArr3[1]);
            this.c[i2].preRotate(e2);
            i2++;
        }
        int i3 = 0;
        for (i = 4; i3 < i; i = 4) {
            float[] fArr4 = this.h;
            ehpg ehpgVar2 = this.a[i3];
            fArr4[r5] = 0.0f;
            fArr4[1] = ehpgVar2.a;
            this.b[i3].mapPoints(fArr4);
            if (i3 == 0) {
                float[] fArr5 = this.h;
                path.moveTo(fArr5[r5], fArr5[1]);
            } else {
                float[] fArr6 = this.h;
                path.lineTo(fArr6[r5], fArr6[1]);
            }
            this.a[i3].c(this.b[i3], path);
            if (ehomVar != null) {
                ehpg ehpgVar3 = this.a[i3];
                Matrix matrix3 = this.b[i3];
                ehomVar.a.t.set(i3, (boolean) r5);
                ehomVar.a.r[i3] = ehpgVar3.a(matrix3);
            }
            int i4 = i3 + 1;
            float[] fArr7 = this.h;
            ehpg ehpgVar4 = this.a[i3];
            fArr7[r5] = ehpgVar4.b;
            fArr7[1] = ehpgVar4.c;
            this.b[i3].mapPoints(fArr7);
            float[] fArr8 = this.i;
            int i5 = i4 % 4;
            ehpg ehpgVar5 = this.a[i5];
            fArr8[r5] = 0.0f;
            fArr8[1] = ehpgVar5.a;
            this.b[i5].mapPoints(fArr8);
            double d = this.h[r5] - this.i[r5];
            boolean z = r5;
            int i6 = i3;
            float max = Math.max(((float) Math.hypot(d, r12[1] - r9[1])) - 0.001f, 0.0f);
            float[] fArr9 = this.h;
            ehpg ehpgVar6 = this.a[i6];
            fArr9[z ? 1 : 0] = ehpgVar6.b;
            fArr9[1] = ehpgVar6.c;
            this.b[i6].mapPoints(fArr9);
            if (i6 == 1 || i6 == 3) {
                Math.abs(rectF.centerX() - this.h[z ? 1 : 0]);
            } else {
                Math.abs(rectF.centerY() - this.h[1]);
            }
            this.g.e();
            if (i6 != 1) {
                c2 = 2;
                if (i6 != 2) {
                    c = 3;
                    if (i6 != 3) {
                        ehok ehokVar = ehowVar.k;
                    } else {
                        ehok ehokVar2 = ehowVar.j;
                    }
                } else {
                    c = 3;
                    ehok ehokVar3 = ehowVar.m;
                }
            } else {
                c = 3;
                c2 = 2;
                ehok ehokVar4 = ehowVar.l;
            }
            this.g.d(max, 0.0f);
            this.j.reset();
            this.g.c(this.c[i6], this.j);
            if (this.l && (d(this.j, i6) || d(this.j, i5))) {
                Path path2 = this.j;
                path2.op(path2, this.f, Path.Op.DIFFERENCE);
                float[] fArr10 = this.h;
                fArr10[z ? 1 : 0] = 0.0f;
                fArr10[1] = this.g.a;
                this.c[i6].mapPoints(fArr10);
                Path path3 = this.e;
                float[] fArr11 = this.h;
                path3.moveTo(fArr11[z ? 1 : 0], fArr11[1]);
                this.g.c(this.c[i6], this.e);
            } else {
                this.g.c(this.c[i6], path);
            }
            if (ehomVar != null) {
                ehpg ehpgVar7 = this.g;
                Matrix matrix4 = this.c[i6];
                ehomVar.a.t.set(i6 + 4, z);
                ehomVar.a.s[i6] = ehpgVar7.a(matrix4);
            }
            i3 = i4;
            r5 = z ? 1 : 0;
        }
        path.close();
        this.e.close();
        if (this.e.isEmpty()) {
            return;
        }
        path.op(this.e, Path.Op.UNION);
    }

    public final void b(ehow ehowVar, RectF rectF, Path path) {
        a(ehowVar, null, 1.0f, rectF, null, path);
    }
}
