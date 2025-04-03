package defpackage;

import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import android.view.Surface;
import java.nio.Buffer;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nbj implements GLSurfaceView.Renderer, nbl, nax {
    final /* synthetic */ nbk a;
    private final nbg b;
    private final float[] e;
    private final float[] f;
    private final float[] g;
    private float h;
    private float i;
    private final float[] c = new float[16];
    private final float[] d = new float[16];
    private final float[] j = new float[16];
    private final float[] k = new float[16];

    public nbj(nbk nbkVar, nbg nbgVar) {
        this.a = nbkVar;
        float[] fArr = new float[16];
        this.e = fArr;
        float[] fArr2 = new float[16];
        this.f = fArr2;
        float[] fArr3 = new float[16];
        this.g = fArr3;
        this.b = nbgVar;
        ltz.w(fArr);
        ltz.w(fArr2);
        ltz.w(fArr3);
        this.i = 3.1415927f;
    }

    private final void c() {
        Matrix.setRotateM(this.f, 0, -this.h, (float) Math.cos(this.i), (float) Math.sin(this.i), 0.0f);
    }

    @Override // defpackage.nax
    public final synchronized void a(float[] fArr, float f) {
        System.arraycopy(fArr, 0, this.e, 0, 16);
        this.i = -f;
        c();
    }

    @Override // defpackage.nbl
    public final synchronized void b(PointF pointF) {
        this.h = pointF.y;
        c();
        Matrix.setRotateM(this.g, 0, -pointF.x, 0.0f, 1.0f, 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            Matrix.multiplyMM(this.k, 0, this.e, 0, this.g, 0);
            Matrix.multiplyMM(this.j, 0, this.f, 0, this.k, 0);
        }
        Matrix.multiplyMM(this.d, 0, this.c, 0, this.j, 0);
        nbg nbgVar = this.b;
        float[] fArr = this.d;
        GLES20.glClear(16384);
        try {
            ltz.m();
        } catch (lty e) {
            luj.d("SceneRenderer", "Failed to draw a frame", e);
        }
        if (nbgVar.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = nbgVar.j;
            lti.f(surfaceTexture);
            surfaceTexture.updateTexImage();
            try {
                ltz.m();
            } catch (lty e2) {
                luj.d("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (nbgVar.b.compareAndSet(true, false)) {
                ltz.w(nbgVar.g);
            }
            long timestamp = nbgVar.j.getTimestamp();
            Long l = (Long) nbgVar.e.b(timestamp);
            if (l != null) {
                naw nawVar = nbgVar.d;
                float[] fArr2 = nbgVar.g;
                float[] fArr3 = (float[]) nawVar.c.d(l.longValue());
                if (fArr3 != null) {
                    float[] fArr4 = nawVar.b;
                    float f = fArr3[0];
                    float f2 = -fArr3[1];
                    float f3 = -fArr3[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        ltz.w(fArr4);
                    }
                    if (!nawVar.d) {
                        naw.a(nawVar.a, nawVar.b);
                        nawVar.d = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, nawVar.a, 0, nawVar.b, 0);
                }
            }
            nbb nbbVar = (nbb) nbgVar.f.d(timestamp);
            if (nbbVar != null) {
                nbe nbeVar = nbgVar.c;
                if (nbe.a(nbbVar)) {
                    nbeVar.d = nbbVar.c;
                    nbeVar.e = new nbd(nbbVar.a.b());
                    if (!nbbVar.d) {
                        new nbd(nbbVar.b.b());
                    }
                }
            }
        }
        Matrix.multiplyMM(nbgVar.h, 0, fArr, 0, nbgVar.g, 0);
        nbe nbeVar2 = nbgVar.c;
        int i = nbgVar.i;
        float[] fArr5 = nbgVar.h;
        nbd nbdVar = nbeVar2.e;
        if (nbdVar == null) {
            return;
        }
        int i2 = nbeVar2.d;
        GLES20.glUniformMatrix3fv(nbeVar2.h, 1, false, i2 == 1 ? nbe.b : i2 == 2 ? nbe.c : nbe.a, 0);
        GLES20.glUniformMatrix4fv(nbeVar2.g, 1, false, fArr5, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(nbeVar2.k, 0);
        try {
            ltz.m();
        } catch (lty e3) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e3);
        }
        GLES20.glVertexAttribPointer(nbeVar2.i, 3, 5126, false, 12, (Buffer) nbdVar.b);
        try {
            ltz.m();
        } catch (lty e4) {
            Log.e("ProjectionRenderer", "Failed to load position data", e4);
        }
        GLES20.glVertexAttribPointer(nbeVar2.j, 2, 5126, false, 8, (Buffer) nbdVar.c);
        try {
            ltz.m();
        } catch (lty e5) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e5);
        }
        GLES20.glDrawArrays(nbdVar.d, 0, nbdVar.a);
        try {
            ltz.m();
        } catch (lty e6) {
            Log.e("ProjectionRenderer", "Failed to render", e6);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        float f;
        GLES20.glViewport(0, 0, i, i2);
        float f2 = i / i2;
        if (f2 > 1.0f) {
            double degrees = Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / f2));
            f = (float) (degrees + degrees);
        } else {
            f = 90.0f;
        }
        Matrix.perspectiveM(this.c, 0, f, f2, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        final nbg nbgVar = this.b;
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            ltz.m();
            nbe nbeVar = nbgVar.c;
            try {
                nbeVar.f = new ltx("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
                nbeVar.g = nbeVar.f.c("uMvpMatrix");
                nbeVar.h = nbeVar.f.c("uTexMatrix");
                nbeVar.i = nbeVar.f.a("aPosition");
                nbeVar.j = nbeVar.f.a("aTexCoords");
                nbeVar.k = nbeVar.f.c("uTexture");
            } catch (lty e) {
                Log.e("ProjectionRenderer", "Failed to initialize the program", e);
            }
            ltz.m();
            nbgVar.i = ltz.a();
        } catch (lty e2) {
            luj.d("SceneRenderer", "Failed to initialize the renderer", e2);
        }
        final nbk nbkVar = this.a;
        nbgVar.j = new SurfaceTexture(nbgVar.i);
        nbgVar.j.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: nbf
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                nbg.this.a.set(true);
            }
        });
        final SurfaceTexture surfaceTexture = nbgVar.j;
        nbkVar.b.post(new Runnable() { // from class: nbi
            @Override // java.lang.Runnable
            public final void run() {
                nbk nbkVar2 = nbk.this;
                SurfaceTexture surfaceTexture2 = nbkVar2.d;
                Surface surface = nbkVar2.e;
                SurfaceTexture surfaceTexture3 = surfaceTexture;
                Surface surface2 = new Surface(surfaceTexture3);
                nbkVar2.d = surfaceTexture3;
                nbkVar2.e = surface2;
                Iterator it = nbkVar2.a.iterator();
                while (it.hasNext()) {
                    ((mgi) it.next()).a(surface2);
                }
                nbk.a(surfaceTexture2, surface);
            }
        });
    }
}
