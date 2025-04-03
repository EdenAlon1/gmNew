package defpackage;

import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jex {
    private final ffjm a;
    private Matrix b;
    private boolean e;
    private boolean f;
    private final float[] c = icm.e();
    private final float[] d = icm.e();
    private boolean g = true;
    private boolean h = true;

    public jex(ffjm ffjmVar) {
        this.a = ffjmVar;
    }

    public final long a(Object obj, long j) {
        return !this.h ? icm.a(h(obj), j) : j;
    }

    public final long b(Object obj, long j) {
        float[] g = g(obj);
        if (g == null) {
            return 9187343241974906880L;
        }
        return this.h ? j : icm.a(g, j);
    }

    public final void c() {
        this.e = true;
        this.f = true;
    }

    public final void d(Object obj, iah iahVar) {
        float[] h = h(obj);
        if (this.h) {
            return;
        }
        icm.b(h, iahVar);
    }

    public final void e(Object obj, iah iahVar) {
        float[] g = g(obj);
        if (g == null) {
            iahVar.b(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            if (this.h) {
                return;
            }
            icm.b(g, iahVar);
        }
    }

    public final void f() {
        this.e = false;
        this.f = false;
        this.h = true;
        this.g = true;
        icm.c(this.c);
        icm.c(this.d);
    }

    public final float[] g(Object obj) {
        float[] fArr = this.d;
        if (this.f) {
            this.g = jev.a(h(obj), fArr);
            this.f = false;
        }
        if (this.g) {
            return fArr;
        }
        return null;
    }

    public final float[] h(Object obj) {
        float[] fArr = this.c;
        if (!this.e) {
            return fArr;
        }
        Matrix matrix = this.b;
        if (matrix == null) {
            matrix = new Matrix();
            this.b = matrix;
        }
        this.a.a(obj, matrix);
        iaz.b(fArr, matrix);
        this.e = false;
        this.h = icn.a(fArr);
        return fArr;
    }
}
