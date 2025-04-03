package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iau implements ibt {
    public Canvas a = iav.a;
    private Rect b;
    private Rect c;

    public static final Region.Op q(int i) {
        return i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // defpackage.ibt
    public final void a(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, q(i));
    }

    @Override // defpackage.ibt
    public final void b(float[] fArr) {
        if (icn.a(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        iaz.a(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.ibt
    public final void c() {
        ibv.a(this.a, false);
    }

    @Override // defpackage.ibt
    public final void d(long j, float f, ict ictVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), f, ((iba) ictVar).a);
    }

    @Override // defpackage.ibt
    public final void e(long j, long j2, ict ictVar) {
        int i = (int) (4294967295L & j);
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), ((iba) ictVar).a);
    }

    @Override // defpackage.ibt
    public final void f(icv icvVar, ict ictVar) {
        boolean z = icvVar instanceof ibc;
        Canvas canvas = this.a;
        if (!z) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((ibc) icvVar).a, ((iba) ictVar).a);
    }

    @Override // defpackage.ibt
    public final void g(float f, float f2, float f3, float f4, ict ictVar) {
        this.a.drawRect(f, f2, f3, f4, ((iba) ictVar).a);
    }

    @Override // defpackage.ibt
    public final void h(float f, float f2, float f3, float f4, float f5, float f6, ict ictVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, ((iba) ictVar).a);
    }

    @Override // defpackage.ibt
    public final void i() {
        ibv.a(this.a, true);
    }

    @Override // defpackage.ibt
    public final void j() {
        this.a.restore();
    }

    @Override // defpackage.ibt
    public final void k(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.ibt
    public final void l() {
        this.a.save();
    }

    @Override // defpackage.ibt
    public final void m(iam iamVar, ict ictVar) {
        this.a.saveLayer(iamVar.b, iamVar.c, iamVar.d, iamVar.e, ictVar.h(), 31);
    }

    @Override // defpackage.ibt
    public final void n(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.ibt
    public final void o(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.ibt
    public final void p(float f, float f2, float f3, float f4, float f5, float f6, ict ictVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, ((iba) ictVar).a);
    }

    @Override // defpackage.ibt
    public final void r(icv icvVar) {
        this.a.clipPath(((ibc) icvVar).a, q(1));
    }

    @Override // defpackage.ibt
    public final /* synthetic */ void s(iam iamVar) {
        ibs.d(this, iamVar);
    }

    @Override // defpackage.ibt
    public final void t(ich ichVar, ict ictVar) {
        this.a.drawBitmap(iay.a(ichVar), Float.intBitsToFloat(0), Float.intBitsToFloat(0), ((iba) ictVar).a);
    }

    @Override // defpackage.ibt
    public final void u(ich ichVar, long j, long j2, ict ictVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap a = iay.a(ichVar);
        Rect rect = this.b;
        rect.getClass();
        rect.left = kaa.a(0L);
        rect.top = kaa.b(0L);
        rect.right = kaa.a(0L) + ((int) (j >> 32));
        rect.bottom = kaa.b(0L) + ((int) (j & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = kaa.a(0L);
        rect2.top = kaa.b(0L);
        rect2.right = kaa.a(0L) + ((int) (j2 >> 32));
        rect2.bottom = kaa.b(0L) + ((int) (j2 & 4294967295L));
        canvas.drawBitmap(a, rect, rect2, ((iba) ictVar).a);
    }
}
