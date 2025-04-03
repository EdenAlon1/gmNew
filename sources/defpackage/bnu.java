package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bnu implements awy {
    public final ListenableFuture a;
    public kfb b;
    private final Surface d;
    private final int e;
    private final Size f;
    private final aww g;
    private final float[] i;
    private final float[] j;
    private final float[] k;
    private final float[] l;
    private ksp m;
    private Executor n;
    private final Object c = new Object();
    private boolean o = false;
    private boolean p = false;
    private final aww h = null;

    public bnu(Surface surface, int i, Size size, aww awwVar, aww awwVar2) {
        float[] fArr = new float[16];
        this.i = fArr;
        float[] fArr2 = new float[16];
        this.j = fArr2;
        float[] fArr3 = new float[16];
        this.k = fArr3;
        float[] fArr4 = new float[16];
        this.l = fArr4;
        this.d = surface;
        this.e = i;
        this.f = size;
        this.g = awwVar;
        g(fArr, fArr3, awwVar);
        g(fArr2, fArr4, null);
        this.a = kfg.a(new kfd() { // from class: bns
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                bnu.this.b = kfbVar;
                return "SurfaceOutputImpl close future complete";
            }
        });
    }

    private static void g(float[] fArr, float[] fArr2, aww awwVar) {
        Matrix.setIdentityM(fArr, 0);
        if (awwVar == null) {
            return;
        }
        bir.b(fArr);
        asw aswVar = (asw) awwVar;
        bir.a(fArr, aswVar.d);
        if (aswVar.e) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size size = aswVar.a;
        Size k = bix.k(size, aswVar.d);
        android.graphics.Matrix d = bix.d(bix.g(size), bix.g(k), aswVar.d, aswVar.e);
        RectF rectF = new RectF(aswVar.b);
        d.mapRect(rectF);
        float width = rectF.left / k.getWidth();
        float height = (k.getHeight() - rectF.height()) - rectF.top;
        float height2 = k.getHeight();
        float width2 = rectF.width() / k.getWidth();
        float height3 = rectF.height() / k.getHeight();
        Matrix.translateM(fArr, 0, width, height / height2, 0.0f);
        Matrix.scaleM(fArr, 0, width2, height3, 1.0f);
        bct bctVar = aswVar.c;
        Matrix.setIdentityM(fArr2, 0);
        bir.b(fArr2);
        if (bctVar != null) {
            ksw.d(bctVar.H(), "Camera has no transform.");
            bir.a(fArr2, bctVar.c().b());
            if (bctVar.I()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // defpackage.awy
    public final int a() {
        return this.e;
    }

    @Override // defpackage.awy
    public final Size b() {
        return this.f;
    }

    @Override // defpackage.awy
    public final Surface c(Executor executor, ksp kspVar) {
        boolean z;
        synchronized (this.c) {
            this.n = executor;
            this.m = kspVar;
            z = this.o;
        }
        if (z) {
            e();
        }
        return this.d;
    }

    @Override // defpackage.awy, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.c) {
            if (!this.p) {
                this.p = true;
            }
        }
        this.b.b(null);
    }

    @Override // defpackage.awy
    public final void d(float[] fArr, float[] fArr2) {
        f(fArr, fArr2);
    }

    public final void e() {
        Executor executor;
        ksp kspVar;
        final AtomicReference atomicReference = new AtomicReference();
        synchronized (this.c) {
            executor = null;
            if (this.n != null && (kspVar = this.m) != null) {
                if (!this.p) {
                    atomicReference.set(kspVar);
                    executor = this.n;
                    this.o = false;
                }
            }
            this.o = true;
        }
        if (executor != null) {
            try {
                executor.execute(new Runnable() { // from class: bnt
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((ksp) atomicReference.get()).accept(new asx(bnu.this));
                    }
                });
            } catch (RejectedExecutionException e) {
                avw.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
            }
        }
    }

    public final void f(float[] fArr, float[] fArr2) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, this.i, 0);
    }
}
