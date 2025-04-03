package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.Pair;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehld extends ehlz {
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private float k;
    private int l;
    private float m;
    private boolean n;
    private boolean o;
    private float p;
    private final RectF q;
    private final Pair r;

    public ehld(ehlo ehloVar) {
        super(ehloVar);
        this.q = new RectF();
        this.r = new Pair(new ehly(), new ehly());
    }

    private final int j() {
        ehlo ehloVar = (ehlo) this.a;
        int i = ehloVar.n;
        int i2 = ehloVar.o;
        return i + i2 + i2;
    }

    private final void k(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        Canvas canvas2;
        float f7 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f8 = f % 1.0f;
        if (f8 < 0.0f) {
            f8 += 1.0f;
        }
        if (this.p < 1.0f) {
            float f9 = f8 + f7;
            if (f9 > 1.0f) {
                k(canvas, paint, f8, 1.0f, i, i2, 0, f3, f4, z);
                k(canvas, paint, 1.0f, f9, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.g / this.i);
        float f10 = (-0.99f) + f7;
        if (f10 >= 0.0f) {
            float f11 = ((f10 * degrees) / 180.0f) / 0.01f;
            f7 += f11;
            if (!z) {
                f8 -= f11 / 2.0f;
            }
        }
        float f12 = this.p;
        float a = ehjj.a(1.0f - f12, 1.0f, f8);
        float a2 = ehjj.a(0.0f, f12, f7);
        float degrees2 = (float) Math.toDegrees(i2 / this.i);
        float degrees3 = ((a2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.i));
        if (degrees3 <= 0.0f) {
            return;
        }
        boolean z2 = false;
        if (((ehlo) this.a).b(this.o) && z && f3 > 0.0f) {
            z2 = true;
        }
        float f13 = (a * 360.0f) + degrees2;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f);
        float f14 = this.g;
        float f15 = f14 + f14;
        float f16 = degrees + degrees;
        if (degrees3 < f16) {
            float f17 = degrees3 / f16;
            float f18 = f13 + (degrees * f17);
            ehly ehlyVar = new ehly();
            if (z2) {
                float length = ((f18 / 360.0f) * this.d.getLength()) / 2.0f;
                float f19 = this.h * f3;
                float f20 = this.i;
                if (f20 != this.m || f19 != this.k) {
                    this.k = f19;
                    this.m = f20;
                    g();
                }
                this.d.getPosTan(length, ehlyVar.a, ehlyVar.b);
            } else {
                ehlyVar.d(f18 + 90.0f);
                ehlyVar.a(-this.i);
            }
            paint.setStyle(Paint.Style.FILL);
            m(canvas, paint, ehlyVar, f15, this.f, f17);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.n ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f21 = f13 + degrees;
        float f22 = degrees3 - f16;
        ((ehly) this.r.first).c();
        ((ehly) this.r.second).c();
        if (z2) {
            PathMeasure pathMeasure = this.d;
            Path path = this.c;
            Pair pair = this.r;
            float f23 = f21 / 360.0f;
            float f24 = f22 / 360.0f;
            float f25 = this.h * f3;
            int i4 = this.o ? ((ehlo) this.a).h : ((ehlo) this.a).i;
            float f26 = this.i;
            if (f26 != this.m || f25 != this.k || i4 != this.l) {
                this.k = f25;
                this.l = i4;
                this.m = f26;
                g();
            }
            path.rewind();
            float a3 = kqp.a(f24, 0.0f, 1.0f);
            if (((ehlo) this.a).b(this.o)) {
                f5 = 1.0f;
                float f27 = f4 / ((float) ((this.i * 6.283185307179586d) / this.j));
                f23 += f27;
                f6 = -(f27 * 360.0f);
            } else {
                f5 = 1.0f;
                f6 = 0.0f;
            }
            float f28 = f23 % f5;
            float length2 = (pathMeasure.getLength() * f28) / 2.0f;
            float length3 = ((f28 + a3) * pathMeasure.getLength()) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            ehly ehlyVar2 = (ehly) pair.first;
            ehlyVar2.c();
            pathMeasure.getPosTan(length2, ehlyVar2.a, ehlyVar2.b);
            ehly ehlyVar3 = (ehly) pair.second;
            ehlyVar3.c();
            pathMeasure.getPosTan(length3, ehlyVar3.a, ehlyVar3.b);
            this.e.reset();
            this.e.setRotate(f6);
            ehlyVar2.d(f6);
            ehlyVar3.d(f6);
            path.transform(this.e);
            canvas2 = canvas;
            canvas2.drawPath(this.c, paint);
        } else {
            ((ehly) this.r.first).d(f21 + 90.0f);
            ((ehly) this.r.first).a(-this.i);
            ((ehly) this.r.second).d(f21 + f22 + 90.0f);
            ((ehly) this.r.second).a(-this.i);
            RectF rectF = this.q;
            float f29 = this.i;
            float f30 = -f29;
            rectF.set(f30, f30, f29, f29);
            canvas.drawArc(this.q, f21, f22, false, paint);
            canvas2 = canvas;
        }
        if (this.n || this.g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        l(canvas2, paint, (ehly) this.r.first, f15, this.f);
        l(canvas, paint, (ehly) this.r.second, f15, this.f);
    }

    private final void l(Canvas canvas, Paint paint, ehly ehlyVar, float f, float f2) {
        m(canvas, paint, ehlyVar, f, f2, 1.0f);
    }

    private final void m(Canvas canvas, Paint paint, ehly ehlyVar, float f, float f2, float f3) {
        float min = Math.min(f2, this.f);
        float f4 = -f;
        float f5 = f / 2.0f;
        float min2 = Math.min(f5, (this.g * min) / this.f);
        RectF rectF = new RectF(f4 / 2.0f, (-min) / 2.0f, f5, min / 2.0f);
        canvas.save();
        float[] fArr = ehlyVar.a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(i(ehlyVar.b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    @Override // defpackage.ehlz
    public final int a() {
        return j();
    }

    @Override // defpackage.ehlz
    public final int b() {
        return j();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c3, code lost:
    
        if (r9.f == 3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
    
        if (r9.f == 2) goto L32;
     */
    @Override // defpackage.ehlz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.Canvas r9, android.graphics.Rect r10, float r11, boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehld.c(android.graphics.Canvas, android.graphics.Rect, float, boolean, boolean):void");
    }

    @Override // defpackage.ehlz
    public final void e(Canvas canvas, Paint paint, ehlx ehlxVar, int i) {
        int a = ehdr.a(ehlxVar.c, i);
        canvas.save();
        canvas.rotate(ehlxVar.g);
        this.o = ehlxVar.h;
        float f = ehlxVar.a;
        float f2 = ehlxVar.b;
        int i2 = ehlxVar.d;
        k(canvas, paint, f, f2, a, i2, i2, ehlxVar.e, ehlxVar.f, true);
        canvas.restore();
    }

    @Override // defpackage.ehlz
    public final void f(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int a = ehdr.a(i, i2);
        this.o = false;
        k(canvas, paint, f, f2, a, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.ehlz
    public final void g() {
        this.b.rewind();
        this.b.moveTo(1.0f, 0.0f);
        for (int i = 0; i < 2; i++) {
            this.b.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            this.b.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            this.b.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            this.b.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
        }
        this.e.reset();
        Matrix matrix = this.e;
        float f = this.i;
        matrix.setScale(f, f);
        this.b.transform(this.e);
        if (((ehlo) this.a).b(this.o)) {
            this.d.setPath(this.b, false);
            PathMeasure pathMeasure = this.d;
            Path path = this.b;
            float f2 = this.k;
            path.rewind();
            float length = pathMeasure.getLength();
            int max = Math.max(3, (int) ((length / (this.o ? ((ehlo) this.a).h : ((ehlo) this.a).i)) / 2.0f));
            int i2 = max + max;
            this.j = length / i2;
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < i2; i3++) {
                ehly ehlyVar = new ehly();
                float f3 = i3;
                pathMeasure.getPosTan(this.j * f3, ehlyVar.a, ehlyVar.b);
                ehly ehlyVar2 = new ehly();
                float f4 = this.j;
                pathMeasure.getPosTan((f3 * f4) + (f4 / 2.0f), ehlyVar2.a, ehlyVar2.b);
                arrayList.add(ehlyVar);
                ehlyVar2.a(f2 + f2);
                arrayList.add(ehlyVar2);
            }
            arrayList.add((ehly) arrayList.get(0));
            ehly ehlyVar3 = (ehly) arrayList.get(0);
            float[] fArr = ehlyVar3.a;
            path.moveTo(fArr[0], fArr[1]);
            int i4 = 1;
            while (i4 < arrayList.size()) {
                ehly ehlyVar4 = (ehly) arrayList.get(i4);
                float f5 = this.j / 2.0f;
                ehly ehlyVar5 = new ehly(ehlyVar3);
                ehly ehlyVar6 = new ehly(ehlyVar4);
                float f6 = f5 * 0.48f;
                ehlyVar5.b(f6);
                ehlyVar6.b(-f6);
                float[] fArr2 = ehlyVar5.a;
                float f7 = fArr2[0];
                float f8 = fArr2[1];
                float[] fArr3 = ehlyVar6.a;
                float f9 = fArr3[0];
                float f10 = fArr3[1];
                float[] fArr4 = ehlyVar4.a;
                path.cubicTo(f7, f8, f9, f10, fArr4[0], fArr4[1]);
                i4++;
                ehlyVar3 = ehlyVar4;
            }
        }
        this.d.setPath(this.b, false);
    }

    @Override // defpackage.ehlz
    public final void d(Canvas canvas, Paint paint, int i, int i2) {
    }
}
