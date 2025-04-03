package defpackage;

import android.util.Log;
import android.view.Surface;
import com.google.mediapipe.framework.TextureFrame;
import javax.microedition.khronos.egl.EGLSurface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fafk extends exmi implements exky {
    public final exkv a;
    private final Surface b;
    private final int c;
    private final int d;

    public fafk(Object obj, Surface surface, exkv exkvVar, int i, int i2) {
        super(obj);
        this.b = surface;
        this.a = exkvVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.exmi
    public final void c() {
        super.c();
        this.a.onSurfaceCreated(null, null);
        this.a.onSurfaceChanged(null, this.c, this.d);
    }

    @Override // defpackage.exky
    public final void hI(final TextureFrame textureFrame) {
        this.p.post(new Runnable() { // from class: fafj
            @Override // java.lang.Runnable
            public final void run() {
                fafk fafkVar = fafk.this;
                exkv exkvVar = fafkVar.a;
                TextureFrame textureFrame2 = textureFrame;
                int width = textureFrame2.getWidth();
                int height = textureFrame2.getHeight();
                exkvVar.a = width;
                exkvVar.b = height;
                TextureFrame textureFrame3 = (TextureFrame) exkvVar.e.getAndSet(textureFrame2);
                if (textureFrame3 != null && textureFrame3 != textureFrame2) {
                    textureFrame3.release();
                }
                fafkVar.a.onDrawFrame(null);
                if (fafkVar.n.a.eglSwapBuffers(fafkVar.n.b, fafkVar.o)) {
                    return;
                }
                Log.e(fafl.a, "Egl error for eglSwapBuffers(): " + fafkVar.n.a.eglGetError());
            }
        });
    }

    @Override // defpackage.exmi
    protected final EGLSurface i() {
        return this.n.a(this.b);
    }
}
