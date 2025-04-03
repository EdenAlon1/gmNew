package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.research.xeno.effect.InputFrameSource;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bof implements bnv {
    public final awz a;
    public final ksp b;
    private final Executor c;

    public bof(atd atdVar) {
        awz a = atdVar.a();
        a.getClass();
        this.a = a;
        this.c = atdVar.b;
        this.b = atdVar.c;
    }

    @Override // defpackage.awz
    public final void a(final axt axtVar) {
        this.c.execute(new Runnable() { // from class: bod
            @Override // java.lang.Runnable
            public final void run() {
                bof bofVar = bof.this;
                axt axtVar2 = axtVar;
                try {
                    awz awzVar = bofVar.a;
                    ((fafl) awzVar).g = axtVar2.c.getWidth();
                    ((fafl) awzVar).h = axtVar2.c.getHeight();
                    Log.i(fafl.a, String.format("onInputSurface requested width %d, height %d", Integer.valueOf(((fafl) awzVar).g), Integer.valueOf(((fafl) awzVar).h)));
                    ((fafl) awzVar).c.a.e(((fafl) awzVar).h, ((fafl) awzVar).g);
                    exkt exktVar = ((fafl) awzVar).c.a;
                    SurfaceTexture surfaceTexture = exktVar.a != null ? exktVar.a : exktVar.b;
                    surfaceTexture.setDefaultBufferSize(((fafl) awzVar).g, ((fafl) awzVar).h);
                    axtVar2.b(new Surface(surfaceTexture), bjm.a(), new ksp() { // from class: fafh
                        @Override // defpackage.ksp
                        public final void accept(Object obj) {
                            String str = fafl.a;
                            ((axq) obj).b().release();
                        }
                    });
                    ((fafl) awzVar).c(InputFrameSource.BACK_CAMERA);
                } catch (awm e) {
                    avw.d("SurfaceProcessor", "Failed to setup SurfaceProcessor input.", e);
                    bofVar.b.accept(e);
                }
            }
        });
    }

    @Override // defpackage.awz
    public final void b(final awy awyVar) {
        this.c.execute(new Runnable() { // from class: boe
            @Override // java.lang.Runnable
            public final void run() {
                bof bofVar = bof.this;
                awy awyVar2 = awyVar;
                try {
                    awz awzVar = bofVar.a;
                    int width = awyVar2.b().getWidth();
                    int height = awyVar2.b().getHeight();
                    Log.i(fafl.a, String.format("onOutputSurface requested width %d, height %d", Integer.valueOf(width), Integer.valueOf(height)));
                    final fafl faflVar = (fafl) awzVar;
                    Surface c = awyVar2.c(bjm.a(), new ksp() { // from class: fafi
                        @Override // defpackage.ksp
                        public final void accept(Object obj) {
                            fafl faflVar2 = fafl.this;
                            awx awxVar = (awx) obj;
                            fafk fafkVar = faflVar2.f;
                            if (fafkVar != null) {
                                faflVar2.d.h.remove(fafkVar);
                                faflVar2.f.l();
                                try {
                                    faflVar2.f.join();
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                    Log.e(fafl.a, "Xeno Render thread was unexpectedly interrupted: ".concat(String.valueOf(e.getMessage())));
                                    throw new IllegalStateException(e);
                                }
                            }
                            awxVar.a().close();
                        }
                    });
                    ((fafl) awzVar).e = new exkv();
                    exkv exkvVar = ((fafl) awzVar).e;
                    if (exkvVar.c != 0) {
                        throw new IllegalStateException("setTextureTarget must be called before the surface is created");
                    }
                    exkvVar.d = 3553;
                    ((fafl) awzVar).f = new fafk(((fafl) awzVar).b.c, c, exkvVar, width, height);
                    ((fafl) awzVar).f.setName("XenoRenderThread");
                    ((fafl) awzVar).f.start();
                    try {
                        if (!((fafl) awzVar).f.k()) {
                            Log.e(fafl.a, "RenderThread startup failed.");
                        }
                    } catch (InterruptedException e) {
                        Log.e(fafl.a, "RenderThread exception ".concat(e.toString()));
                    }
                    faem faemVar = ((fafl) awzVar).d;
                    fafk fafkVar = ((fafl) awzVar).f;
                    faemVar.h.clear();
                    if (fafkVar != null) {
                        faemVar.h.add(fafkVar);
                    }
                } catch (awm e2) {
                    avw.d("SurfaceProcessor", "Failed to setup SurfaceProcessor output.", e2);
                    bofVar.b.accept(e2);
                }
            }
        });
    }

    @Override // defpackage.bnv
    public final ListenableFuture c(int i, int i2) {
        return new bkk(new Exception("Snapshot not supported by external SurfaceProcessor"));
    }

    @Override // defpackage.bnv
    public final void g() {
    }
}
