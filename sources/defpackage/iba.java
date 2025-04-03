package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iba implements ict {
    public Paint a;
    public int b;
    public Shader c;
    public ibx d;

    public iba(Paint paint) {
        this.a = paint;
        this.b = 3;
    }

    @Override // defpackage.ict
    public final float a() {
        return this.a.getAlpha() / 255.0f;
    }

    @Override // defpackage.ict
    public final float b() {
        return this.a.getStrokeMiter();
    }

    @Override // defpackage.ict
    public final float c() {
        return this.a.getStrokeWidth();
    }

    @Override // defpackage.ict
    public final int d() {
        return !this.a.isFilterBitmap() ? 0 : 1;
    }

    @Override // defpackage.ict
    public final int e() {
        int i;
        Paint.Cap strokeCap = this.a.getStrokeCap();
        if (strokeCap == null || (i = ibb.a[strokeCap.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    @Override // defpackage.ict
    public final int f() {
        int i;
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        if (strokeJoin == null || (i = ibb.b[strokeJoin.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    @Override // defpackage.ict
    public final long g() {
        return iby.c(this.a.getColor());
    }

    @Override // defpackage.ict
    public final Paint h() {
        return this.a;
    }

    @Override // defpackage.ict
    public final void i(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    @Override // defpackage.ict
    public final void j(int i) {
        if (ibk.b(this.b, i)) {
            return;
        }
        this.b = i;
        Paint paint = this.a;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(iat.a(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(iat.b(i)));
        }
    }

    @Override // defpackage.ict
    public final void k(long j) {
        this.a.setColor(iby.b(j));
    }

    @Override // defpackage.ict
    public final void l(ibx ibxVar) {
        this.d = ibxVar;
        this.a.setColorFilter(ibxVar != null ? ibxVar.b : null);
    }

    @Override // defpackage.ict
    public final void m(int i) {
        this.a.setFilterBitmap(!icd.a(i, 0));
    }

    @Override // defpackage.ict
    public final void n(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    @Override // defpackage.ict
    public final void o(int i) {
        Paint.Cap cap;
        boolean a = idm.a(i, 2);
        Paint paint = this.a;
        if (a) {
            cap = Paint.Cap.SQUARE;
        } else if (idm.a(i, 1)) {
            cap = Paint.Cap.ROUND;
        } else {
            idm.a(i, 0);
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    @Override // defpackage.ict
    public final void p(int i) {
        Paint.Join join;
        boolean a = idn.a(i, 0);
        Paint paint = this.a;
        if (!a) {
            if (idn.a(i, 2)) {
                join = Paint.Join.BEVEL;
            } else if (idn.a(i, 1)) {
                join = Paint.Join.ROUND;
            }
            paint.setStrokeJoin(join);
        }
        join = Paint.Join.MITER;
        paint.setStrokeJoin(join);
    }

    @Override // defpackage.ict
    public final void q(float f) {
        this.a.setStrokeMiter(f);
    }

    @Override // defpackage.ict
    public final void r(float f) {
        this.a.setStrokeWidth(f);
    }

    @Override // defpackage.ict
    public final void s(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    @Override // defpackage.ict
    public final void t() {
        this.a.setPathEffect(null);
    }

    public iba() {
        this(new Paint(7));
    }
}
