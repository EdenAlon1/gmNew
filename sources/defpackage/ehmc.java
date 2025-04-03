package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehmc extends ehlz {
    final Pair f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private int m;
    private boolean n;
    private boolean o;
    private float p;

    public ehmc(ehmk ehmkVar) {
        super(ehmkVar);
        this.g = 300.0f;
        this.f = new Pair(new ehly(), new ehly());
    }

    private final void j(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        float f7;
        float f8;
        Canvas canvas2;
        float f9 = 1.0f - this.p;
        float a = ehjj.a(f9, 1.0f, kqp.a(f, 0.0f, 1.0f));
        float f10 = this.g;
        float f11 = a * f10;
        float a2 = ehjj.a(f9, 1.0f, kqp.a(f2, 0.0f, 1.0f));
        float f12 = this.i;
        float f13 = this.j;
        float a3 = (f10 * a2) - ((int) ((i3 * (1.0f - kqp.a(a2, 0.99f, 1.0f))) / 0.01f));
        int a4 = (int) (f11 + ((int) ((i2 * kqp.a(a, 0.0f, 0.01f)) / 0.01f)));
        int i4 = (int) a3;
        if (f12 != f13) {
            float max = Math.max(f12, f13);
            float f14 = this.g;
            float f15 = max / f14;
            float f16 = this.i;
            float f17 = this.j;
            f5 = ehjj.a(f16, f17, kqp.a(a4 / f14, 0.0f, f15) / f15);
            f6 = ehjj.a(f16, f17, kqp.a((f14 - i4) / f14, 0.0f, f15) / f15);
        } else {
            f5 = f12;
            f6 = f5;
        }
        float f18 = -this.g;
        boolean z2 = ((ehmk) this.a).b(this.o) && z && f3 > 0.0f;
        if (a4 <= i4) {
            float f19 = f18 / 2.0f;
            float f20 = a4 + f5;
            float f21 = i4 - f6;
            float f22 = f5 + f5;
            boolean z3 = z2;
            float f23 = f6 + f6;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.h);
            ((ehly) this.f.first).c();
            ((ehly) this.f.second).c();
            ((ehly) this.f.first).f(f20 + f19);
            ((ehly) this.f.second).f(f19 + f21);
            if (a4 == 0 && f21 + f6 < f20 + f5) {
                l(canvas, paint, (ehly) this.f.first, f22, this.h, f5, (ehly) this.f.second, f23, this.h, f6, true);
                return;
            }
            if (f20 - f5 > f21 - f6) {
                l(canvas, paint, (ehly) this.f.second, f23, this.h, f6, (ehly) this.f.first, f22, this.h, f5, false);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.n ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z3) {
                PathMeasure pathMeasure = this.d;
                Path path = this.c;
                Pair pair = this.f;
                float f24 = this.g;
                float f25 = f20 / f24;
                float f26 = f21 / f24;
                int i5 = this.o ? ((ehmk) this.a).h : ((ehmk) this.a).i;
                if (i5 != this.m) {
                    this.m = i5;
                    g();
                }
                path.rewind();
                float f27 = (-this.g) / 2.0f;
                boolean b = ((ehmk) this.a).b(this.o);
                if (b) {
                    float f28 = this.g;
                    float f29 = this.l;
                    float f30 = f28 / f29;
                    float f31 = f4 / f30;
                    f27 -= f29 * f4;
                    float f32 = f30 / (f30 + 1.0f);
                    f26 = (f26 + f31) * f32;
                    f25 = (f25 + f31) * f32;
                }
                float length = f25 * pathMeasure.getLength();
                float length2 = f26 * pathMeasure.getLength();
                pathMeasure.getSegment(length, length2, path, true);
                ehly ehlyVar = (ehly) pair.first;
                ehlyVar.c();
                f7 = f23;
                f8 = f21;
                pathMeasure.getPosTan(length, ehlyVar.a, ehlyVar.b);
                ehly ehlyVar2 = (ehly) pair.second;
                ehlyVar2.c();
                pathMeasure.getPosTan(length2, ehlyVar2.a, ehlyVar2.b);
                this.e.reset();
                this.e.setTranslate(f27, 0.0f);
                ehlyVar.f(f27);
                ehlyVar2.f(f27);
                if (b) {
                    float f33 = this.k * f3;
                    this.e.postScale(1.0f, f33);
                    ehlyVar.e(f33);
                    ehlyVar2.e(f33);
                }
                path.transform(this.e);
                canvas2 = canvas;
                canvas2.drawPath(this.c, paint);
            } else {
                canvas.drawLine(((ehly) this.f.first).a[0], ((ehly) this.f.first).a[1], ((ehly) this.f.second).a[0], ((ehly) this.f.second).a[1], paint);
                canvas2 = canvas;
                f7 = f23;
                f8 = f21;
            }
            if (this.n) {
                return;
            }
            if (f20 > 0.0f && f5 > 0.0f) {
                k(canvas2, paint, (ehly) this.f.first, f22, this.h, f5);
            }
            if (f8 >= this.g || f6 <= 0.0f) {
                return;
            }
            k(canvas, paint, (ehly) this.f.second, f7, this.h, f6);
        }
    }

    private final void k(Canvas canvas, Paint paint, ehly ehlyVar, float f, float f2, float f3) {
        l(canvas, paint, ehlyVar, f, f2, f3, null, 0.0f, 0.0f, 0.0f, false);
    }

    private final void l(Canvas canvas, Paint paint, ehly ehlyVar, float f, float f2, float f3, ehly ehlyVar2, float f4, float f5, float f6, boolean z) {
        char c;
        float f7;
        float f8;
        float min = Math.min(f2, this.h);
        float f9 = -min;
        float f10 = min / 2.0f;
        float f11 = (-f) / 2.0f;
        float f12 = f9 / 2.0f;
        float f13 = f / 2.0f;
        RectF rectF = new RectF(f11, f12, f13, f10);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (ehlyVar2 != null) {
            float min2 = Math.min(f5, this.h);
            float min3 = Math.min(f4 / 2.0f, (f6 * min2) / this.h);
            RectF rectF2 = new RectF();
            if (z) {
                c = 0;
                float f14 = (ehlyVar2.a[0] - min3) - (ehlyVar.a[0] - f3);
                if (f14 > 0.0f) {
                    ehlyVar2.f((-f14) / 2.0f);
                    f8 = f4 + f14;
                } else {
                    f8 = f4;
                }
                rectF2.set(0.0f, f12, f13, f10);
            } else {
                c = 0;
                float f15 = (ehlyVar2.a[0] + min3) - (ehlyVar.a[0] + f3);
                if (f15 < 0.0f) {
                    ehlyVar2.f((-f15) / 2.0f);
                    f7 = f4 - f15;
                } else {
                    f7 = f4;
                }
                rectF2.set(f11, f12, 0.0f, f10);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-min2) / 2.0f, f8 / 2.0f, min2 / 2.0f);
            float[] fArr = ehlyVar2.a;
            canvas.translate(fArr[c], fArr[1]);
            canvas.rotate(i(ehlyVar2.b));
            Path path = new Path();
            path.addRoundRect(rectF3, min3, min3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-i(ehlyVar2.b));
            float[] fArr2 = ehlyVar2.a;
            canvas.translate(-fArr2[c], -fArr2[1]);
            float[] fArr3 = ehlyVar.a;
            canvas.translate(fArr3[c], fArr3[1]);
            canvas.rotate(i(ehlyVar.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = ehlyVar.a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(i(ehlyVar.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }

    @Override // defpackage.ehlz
    public final int a() {
        ehmk ehmkVar = (ehmk) this.a;
        int i = ehmkVar.a;
        int i2 = ehmkVar.j;
        return i + i2 + i2;
    }

    @Override // defpackage.ehlz
    public final int b() {
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00db, code lost:
    
        if (((defpackage.ehmk) r8.a).f == 3) goto L34;
     */
    @Override // defpackage.ehlz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.Canvas r9, android.graphics.Rect r10, float r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehmc.c(android.graphics.Canvas, android.graphics.Rect, float, boolean, boolean):void");
    }

    @Override // defpackage.ehlz
    public final void d(Canvas canvas, Paint paint, int i, int i2) {
        int a = ehdr.a(i, i2);
        this.o = false;
        if (((ehmk) this.a).p <= 0 || a == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(a);
        ehly ehlyVar = new ehly(new float[]{(this.g / 2.0f) - (this.h / 2.0f), 0.0f}, new float[]{1.0f, 0.0f});
        float f = ((ehmk) this.a).p;
        k(canvas, paint, ehlyVar, f, f, (this.i * f) / this.h);
    }

    @Override // defpackage.ehlz
    public final void e(Canvas canvas, Paint paint, ehlx ehlxVar, int i) {
        int a = ehdr.a(ehlxVar.c, i);
        this.o = ehlxVar.h;
        float f = ehlxVar.a;
        float f2 = ehlxVar.b;
        int i2 = ehlxVar.d;
        j(canvas, paint, f, f2, a, i2, i2, ehlxVar.e, ehlxVar.f, true);
    }

    @Override // defpackage.ehlz
    public final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int a = ehdr.a(i, i2);
        this.o = false;
        j(canvas, paint, f, f2, a, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.ehlz
    public final void g() {
        this.b.rewind();
        if (((ehmk) this.a).b(this.o)) {
            int i = this.o ? ((ehmk) this.a).h : ((ehmk) this.a).i;
            float f = this.g;
            int i2 = (int) (f / i);
            this.l = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 + i3;
                float f2 = i4 + 1;
                this.b.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = i4 + 2;
                this.b.cubicTo(f2 + 0.48f, 1.0f, f3 - 0.48f, 0.0f, f3, 0.0f);
            }
            this.e.reset();
            this.e.setScale(this.l / 2.0f, -2.0f);
            this.e.postTranslate(0.0f, 1.0f);
            this.b.transform(this.e);
        } else {
            this.b.lineTo(this.g, 0.0f);
        }
        this.d.setPath(this.b, false);
    }
}
