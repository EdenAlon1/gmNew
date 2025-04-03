package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcv implements mbj {
    private final ltx b;
    private final boolean c;
    private boolean g;
    private lqh h;
    private lqh i;
    private lqh j;
    private float k;
    private float l;
    private float m;
    private float n;
    private lux o;
    private lux p;
    private lux q;
    private final mbp r;
    private mcq s;
    private mbh d = new mct();
    private mbi e = new mcu();
    public mbg a = new mbg() { // from class: mcs
        @Override // defpackage.mbg
        public final void a(lsf lsfVar) {
        }
    };
    private Executor f = erpp.a;

    public mcv(Context context, boolean z, mbp mbpVar) {
        this.c = z;
        this.r = mbpVar;
        lqh lqhVar = lqh.a;
        this.j = lqhVar;
        this.i = lqhVar;
        this.h = lqhVar;
        this.p = lux.b;
        lux luxVar = lux.b;
        this.q = luxVar;
        this.o = luxVar;
        this.s = null;
        try {
            this.b = new ltx(context, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_separable_convolution_es2.glsl");
        } catch (IOException | lty e) {
            throw new lsf(e);
        }
    }

    private final lqh a(lqg lqgVar, lqh lqhVar, lux luxVar) {
        if (luxVar.c == lqhVar.d && luxVar.d == lqhVar.e) {
            return lqhVar;
        }
        lqhVar.a();
        return lqgVar.d(ltz.c(luxVar.c, luxVar.d, this.c), luxVar.c, luxVar.d);
    }

    private final void b(int i, boolean z) {
        int i2 = z ? this.p.c : this.q.d;
        this.b.j();
        this.b.i("uTexSampler", i, 0);
        this.b.h("uIsHorizontal", z ? 1 : 0);
        float f = i2;
        this.b.f("uSourceTexelSize", 1.0f / f);
        this.b.f("uSourceFullSize", f);
        this.b.f("uConvStartTexels", this.m);
        this.b.f("uConvWidthTexels", this.n);
        this.b.f("uFunctionLookupStepSize", this.k);
        this.b.g("uFunctionLookupCenter", new float[]{this.l, 0.5f});
        this.b.i("uFunctionLookupSampler", this.j.b, 1);
        this.b.d();
        GLES20.glDrawArrays(5, 0, 4);
        ltz.m();
    }

    @Override // defpackage.mbj
    public final void c() {
        this.g = false;
        this.d.w();
        this.d.c();
    }

    @Override // defpackage.mbj
    public final void d(lqg lqgVar, lqh lqhVar, long j) {
        float f;
        lti.d(!this.g, "The shader program does not currently accept input frames. Release prior output frames first.");
        try {
            lux luxVar = new lux(lqhVar.d, lqhVar.e);
            mbp mbpVar = this.r;
            float d = mbq.d(luxVar.c, luxVar.d, mbpVar.a, mbpVar.b);
            mbpVar.c = d;
            this.o = new lux(Math.round(luxVar.c * d), Math.round(luxVar.d * mbpVar.c));
            mcq mcqVar = new mcq(Math.min(this.r.c, 1.0f));
            if (!mcqVar.equals(this.s)) {
                int ceil = (int) Math.ceil((lys.a(mcqVar) * 5.0f) + 10.0f);
                float f2 = ceil;
                this.k = 1.0f / (f2 / 5.0f);
                FloatBuffer allocate = FloatBuffer.allocate(ceil);
                float a = mcqVar.a();
                int i = 0;
                int i2 = 0;
                while (i < ceil) {
                    int i3 = i - 5;
                    float f3 = (i3 * 0.2f) + a;
                    if (i3 >= 0 && i <= ceil - 5) {
                        float f4 = f3 * mcqVar.a;
                        if (Math.abs(f4) < 1.0E-5d) {
                            f = 1.0f;
                        } else if (Math.abs(f4) <= 3.0f) {
                            double d2 = f4;
                            double d3 = 3.141592653589793d * d2;
                            f = (float) (((Math.sin(d3) * 3.0d) * Math.sin(d3 / 3.0d)) / ((9.869604401089358d * d2) * d2));
                        }
                        allocate.put(i2, f);
                        i++;
                        i2++;
                    }
                    f = 0.0f;
                    allocate.put(i2, f);
                    i++;
                    i2++;
                }
                this.l = (-(a - 1.1f)) / (f2 * 0.2f);
                this.m = mcqVar.a();
                this.n = lys.a(mcqVar);
                lqh lqhVar2 = this.j;
                if (lqhVar2 == lqh.a || lqhVar2.d != ceil) {
                    lqhVar2.a();
                    this.j = new lqh(ltz.d(), -1, ceil, 1);
                }
                ltz.l(3553, this.j.b, 9729);
                GLES20.glTexImage2D(3553, 0, 33325, ceil, 1, 0, 6403, 5126, allocate);
                ltz.m();
                this.s = mcqVar;
            }
            if (!luxVar.equals(this.p)) {
                this.b.k(ltz.A());
                float[] z = ltz.z();
                this.b.g("uTransformationMatrix", z);
                this.b.g("uTexTransformationMatrix", z);
                lux luxVar2 = new lux(this.o.c, luxVar.d);
                this.q = luxVar2;
                this.i = a(lqgVar, this.i, luxVar2);
                this.h = a(lqgVar, this.h, this.o);
                this.p = luxVar;
            }
            this.g = true;
            lqh lqhVar3 = this.i;
            ltz.u(lqhVar3.c, lqhVar3.d, lqhVar3.e);
            ltz.o();
            b(lqhVar.b, true);
            lqh lqhVar4 = this.h;
            ltz.u(lqhVar4.c, lqhVar4.d, lqhVar4.e);
            ltz.o();
            b(this.i.b, false);
            GLES20.glDrawArrays(5, 0, 4);
            ltz.m();
            this.d.b(lqhVar);
            this.e.x(this.h, j);
        } catch (lty e) {
            this.f.execute(new Runnable() { // from class: mcr
                @Override // java.lang.Runnable
                public final void run() {
                    mcv.this.a.a(lsf.a(e));
                }
            });
        }
    }

    @Override // defpackage.mbj
    public final void e() {
        try {
            this.h.a();
            this.i.a();
            this.j.a();
            this.b.e();
        } catch (lty e) {
            throw new lsf(e);
        }
    }

    @Override // defpackage.mbj
    public final void f(lqh lqhVar) {
        this.g = false;
        this.d.c();
    }

    @Override // defpackage.mbj
    public final void g(Executor executor, mbg mbgVar) {
        this.f = executor;
        this.a = mbgVar;
    }

    @Override // defpackage.mbj
    public final void h(mbh mbhVar) {
        this.d = mbhVar;
        if (this.g) {
            return;
        }
        mbhVar.c();
    }

    @Override // defpackage.mbj
    public final void i(mbi mbiVar) {
        this.e = mbiVar;
    }

    @Override // defpackage.mbj
    public final void j() {
        this.e.a();
    }
}
