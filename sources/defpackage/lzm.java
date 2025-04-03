package defpackage;

import android.content.Context;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Pair;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzm implements mdl {
    public final lqg a;
    public final lzj b;
    public final mdt c;
    public EGLDisplay e;
    public EGLSurface f;
    private final mbk g;
    private boolean i;
    private lpo l;
    private final mce n;
    private int m = -1;
    private final SparseArray h = new SparseArray();
    public final mdk d = new mdk(false, 1);
    private final lul j = new lul(1);
    private final lul k = new lul(1);

    public lzm(Context context, lqg lqgVar, ExecutorService executorService, final mce mceVar, mbk mbkVar) {
        this.n = mceVar;
        this.g = mbkVar;
        this.a = lqgVar;
        this.b = new lzj(context);
        mdt mdtVar = new mdt(executorService, false, new mdr() { // from class: lzg
            @Override // defpackage.mdr
            public final void a(lsf lsfVar) {
                mce.this.a.a(lsfVar);
            }
        });
        this.c = mdtVar;
        mdtVar.d(new mds() { // from class: lzh
            @Override // defpackage.mds
            public final void a() {
                lzm lzmVar = lzm.this;
                lzmVar.e = ltz.h();
                lzmVar.f = ltz.j(lzmVar.a.a(lzmVar.e, 2, ltz.a), lzmVar.e);
            }
        });
    }

    private final synchronized engw g() {
        if (this.d.a() == 0) {
            int i = engw.d;
            return enou.a;
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (((lzl) this.h.valueAt(i2)).a.isEmpty()) {
                int i3 = engw.d;
                return enou.a;
            }
        }
        engr engrVar = new engr();
        lzk lzkVar = (lzk) ((lzl) this.h.get(this.m)).a.element();
        engrVar.h(lzkVar);
        for (int i4 = 0; i4 < this.h.size(); i4++) {
            if (this.h.keyAt(i4) != this.m) {
                lzl lzlVar = (lzl) this.h.valueAt(i4);
                if (lzlVar.a.size() == 1 && !lzlVar.b) {
                    int i5 = engw.d;
                    return enou.a;
                }
                Iterator it = lzlVar.a.iterator();
                lzk lzkVar2 = null;
                long j = Long.MAX_VALUE;
                while (it.hasNext()) {
                    lzk lzkVar3 = (lzk) it.next();
                    long j2 = lzkVar3.c;
                    long abs = Math.abs(j2 - lzkVar.c);
                    if (abs < j) {
                        lzkVar2 = lzkVar3;
                    }
                    if (abs < j) {
                        j = abs;
                    }
                    if (j2 > lzkVar.c || (!it.hasNext() && lzlVar.b)) {
                        lti.f(lzkVar2);
                        engrVar.h(lzkVar2);
                        break;
                    }
                }
            }
        }
        engw g = engrVar.g();
        if (((enou) g).c == this.h.size()) {
            return g;
        }
        return enou.a;
    }

    private final synchronized void h() {
        for (int i = 0; i < this.h.size(); i++) {
            if (this.h.keyAt(i) != this.m) {
                i((lzl) this.h.valueAt(i));
            }
        }
    }

    private final synchronized void i(lzl lzlVar) {
        lzl lzlVar2 = (lzl) this.h.get(this.m);
        if (lzlVar2.a.isEmpty() && lzlVar2.b) {
            j(lzlVar, lzlVar.a.size());
            return;
        }
        lzk lzkVar = (lzk) lzlVar2.a.peek();
        final long j = lzkVar != null ? lzkVar.c : -9223372036854775807L;
        j(lzlVar, Math.max(enjk.b(enjk.d(lzlVar.a, new emxg() { // from class: lzi
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return ((lzk) obj).c <= j;
            }
        })) - 1, 0));
    }

    private final synchronized void j(lzl lzlVar, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            lzk lzkVar = (lzk) lzlVar.a.remove();
            mbl mblVar = lzkVar.a;
            final long j = lzkVar.c;
            final max maxVar = (max) mblVar;
            ((max) mblVar).f.d(new mds() { // from class: mav
                @Override // defpackage.mds
                public final void a() {
                    max maxVar2 = max.this;
                    lti.c(maxVar2.m != null);
                    while (true) {
                        mdk mdkVar = maxVar2.j;
                        if (mdkVar.a() >= mdkVar.c) {
                            return;
                        }
                        if (maxVar2.k.a() > j) {
                            return;
                        }
                        maxVar2.j.f();
                        maxVar2.k.b();
                        ltz.p(maxVar2.l.b());
                        maxVar2.p.c();
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void a() {
        engw g = g();
        if (!g.isEmpty()) {
            lzk lzkVar = (lzk) g.get(this.m);
            engr engrVar = new engr();
            for (int i = 0; i < ((enou) g).c; i++) {
                lqh lqhVar = ((lzk) g.get(i)).b;
                engrVar.h(new lux(lqhVar.d, lqhVar.e));
            }
            lux luxVar = (lux) engrVar.g().get(0);
            this.d.d(this.a, luxVar.c, luxVar.d);
            mdk mdkVar = this.d;
            long j = lzkVar.c;
            lul lulVar = this.j;
            lqh b = mdkVar.b();
            lulVar.c(j);
            lzj lzjVar = this.b;
            if (lzjVar.c == null) {
                try {
                    lzjVar.c = new ltx(lzjVar.a, "shaders/vertex_shader_transformation_es2.glsl", "shaders/fragment_shader_alpha_scale_es2.glsl");
                    lzjVar.c.k(ltz.A());
                    lzjVar.c.g("uTexTransformationMatrix", ltz.z());
                } catch (IOException e) {
                    throw new lsf(e);
                }
            }
            ltz.u(b.c, b.d, b.e);
            lzjVar.b.j = new lux(b.d, b.e);
            ltz.o();
            ltx ltxVar = lzjVar.c;
            lti.f(ltxVar);
            ltxVar.j();
            int i2 = 3042;
            GLES20.glEnable(3042);
            boolean z = true;
            GLES20.glBlendFuncSeparate(770, 771, 1, 771);
            ltz.m();
            int i3 = ((enou) g).c - 1;
            while (i3 >= 0) {
                lzk lzkVar2 = (lzk) g.get(i3);
                ltx ltxVar2 = lzjVar.c;
                lti.f(ltxVar2);
                lqh lqhVar2 = lzkVar2.b;
                ltxVar2.i("uTexSampler", lqhVar2.b, 0);
                mck mckVar = lzjVar.b;
                lux luxVar2 = new lux(lqhVar2.d, lqhVar2.e);
                lrf lrfVar = lzkVar2.d;
                ltz.w(mckVar.b);
                ltz.w(mckVar.a);
                ltz.w(mckVar.e);
                ltz.w(mckVar.c);
                ltz.w(mckVar.d);
                ltz.w(mckVar.f);
                ltz.w(mckVar.g);
                ltz.w(mckVar.h);
                ltz.w(mckVar.i);
                Pair pair = lrf.a;
                int i4 = i2;
                boolean z2 = z;
                Matrix.translateM(mckVar.a, 0, ((Float) pair.first).floatValue(), ((Float) pair.second).floatValue(), 0.0f);
                lti.g(mckVar.j);
                float f = luxVar2.d / r12.d;
                Matrix.scaleM(mckVar.b, 0, luxVar2.c / mckVar.j.c, f, 1.0f);
                Pair pair2 = lrf.c;
                Matrix.scaleM(mckVar.c, 0, ((Float) pair2.first).floatValue(), ((Float) pair2.second).floatValue(), 1.0f);
                Matrix.invertM(mckVar.d, 0, mckVar.c, 0);
                Pair pair3 = lrf.b;
                Matrix.translateM(mckVar.e, 0, -((Float) pair3.first).floatValue(), -((Float) pair3.second).floatValue(), 0.0f);
                Matrix.rotateM(mckVar.f, 0, 0.0f, 0.0f, 0.0f, 1.0f);
                Matrix.scaleM(mckVar.g, 0, luxVar2.d / luxVar2.c, 1.0f, 1.0f);
                Matrix.invertM(mckVar.h, 0, mckVar.g, 0);
                float[] fArr = mckVar.a;
                float[] fArr2 = mckVar.i;
                Matrix.multiplyMM(fArr2, 0, fArr2, 0, fArr, 0);
                float[] fArr3 = mckVar.b;
                float[] fArr4 = mckVar.i;
                Matrix.multiplyMM(fArr4, 0, fArr4, 0, fArr3, 0);
                float[] fArr5 = mckVar.c;
                float[] fArr6 = mckVar.i;
                Matrix.multiplyMM(fArr6, 0, fArr6, 0, fArr5, 0);
                float[] fArr7 = mckVar.i;
                Matrix.multiplyMM(fArr7, 0, fArr7, 0, mckVar.e, 0);
                float[] fArr8 = mckVar.i;
                Matrix.multiplyMM(fArr8, 0, fArr8, 0, mckVar.d, 0);
                float[] fArr9 = mckVar.i;
                Matrix.multiplyMM(fArr9, 0, fArr9, 0, mckVar.g, 0);
                float[] fArr10 = mckVar.i;
                Matrix.multiplyMM(fArr10, 0, fArr10, 0, mckVar.f, 0);
                float[] fArr11 = mckVar.i;
                Matrix.multiplyMM(fArr11, 0, fArr11, 0, mckVar.h, 0);
                float[] fArr12 = mckVar.i;
                Matrix.multiplyMM(fArr12, 0, fArr12, 0, mckVar.c, 0);
                ltxVar2.g("uTransformationMatrix", mckVar.i);
                lrf lrfVar2 = lzkVar2.d;
                ltxVar2.f("uAlphaScale", 1.0f);
                ltxVar2.d();
                GLES20.glDrawArrays(5, 0, 4);
                ltz.m();
                i3--;
                i2 = i4;
                z = z2;
            }
            boolean z3 = z;
            GLES20.glDisable(i2);
            ltz.m();
            this.k.c(ltz.e());
            mcj mcjVar = ((mbw) this.g).a;
            lti.g(mcjVar.k);
            lti.c(!mcjVar.o);
            int i5 = lyt.a;
            mcjVar.i.add(new mcg(b, j));
            mcjVar.j.put(b.b, new mch(this, j));
            if (mcjVar.m) {
                mcjVar.b();
            } else {
                lsi lsiVar = mcjVar.k;
                lti.f(lsiVar);
                lqb lqbVar = new lqb();
                lqbVar.A = mcjVar.b;
                lqbVar.t = b.d;
                lqbVar.u = b.e;
                lsiVar.c(3, new lqc(lqbVar), mcjVar.f, 0L);
                mcjVar.m = z3;
            }
            lzl lzlVar = (lzl) this.h.get(this.m);
            j(lzlVar, 1);
            h();
            if (this.i && lzlVar.a.isEmpty()) {
                this.n.a();
            }
        }
    }

    @Override // defpackage.mdl
    public final synchronized void b(int i, mbl mblVar, lqh lqhVar, lpo lpoVar, long j) {
        lti.c(lvf.T(this.h, i));
        lzl lzlVar = (lzl) this.h.get(i);
        lti.c(!lzlVar.b);
        if (this.l == null) {
            this.l = lpoVar;
        }
        lti.d(this.l.equals(lpoVar), "Mixing different ColorInfos is not supported.");
        lzlVar.a.add(new lzk(mblVar, lqhVar, j, new lsc()));
        if (i == this.m) {
            h();
        } else {
            i(lzlVar);
        }
        this.c.d(new lzf(this));
    }

    @Override // defpackage.mdl
    public final synchronized void c(int i) {
        lti.c(!lvf.T(this.h, i));
        this.h.put(i, new lzl());
        if (this.m == -1) {
            this.m = i;
        }
    }

    @Override // defpackage.mdl
    public final synchronized void d() {
        try {
            this.c.c(new mds() { // from class: lze
                @Override // defpackage.mds
                public final void a() {
                    lzm lzmVar = lzm.this;
                    try {
                        try {
                            ltx ltxVar = lzmVar.b.c;
                            if (ltxVar != null) {
                                ltxVar.e();
                            }
                        } catch (lty e) {
                            luj.d("CompositorGlProgram", "Error releasing GL Program", e);
                        }
                        lzmVar.d.c();
                        ltz.s(lzmVar.e, lzmVar.f);
                    } catch (lty e2) {
                        luj.d("DefaultVideoCompositor", "Error releasing GL resources", e2);
                    }
                }
            });
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IllegalStateException(e);
        }
    }

    public final synchronized void e(long j) {
        while (true) {
            mdk mdkVar = this.d;
            if (mdkVar.a() >= mdkVar.c || this.j.a() > j) {
                break;
            }
            this.d.f();
            this.j.b();
            ltz.p(this.k.b());
        }
        a();
    }

    @Override // defpackage.mdl
    public final synchronized void f(int i) {
        lti.c(lvf.T(this.h, i));
        boolean z = false;
        lti.c(this.m != -1);
        ((lzl) this.h.get(i)).b = true;
        int i2 = 0;
        while (true) {
            if (i2 >= this.h.size()) {
                z = true;
                break;
            } else if (!((lzl) this.h.valueAt(i2)).b) {
                break;
            } else {
                i2++;
            }
        }
        this.i = z;
        if (((lzl) this.h.get(this.m)).a.isEmpty()) {
            if (i == this.m) {
                h();
            }
            if (z) {
                this.n.a();
                return;
            }
        }
        if (i == this.m || ((lzl) this.h.get(i)).a.size() != 1) {
            return;
        }
        this.c.d(new lzf(this));
    }
}
