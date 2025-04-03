package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzt implements GLSurfaceView.Renderer {
    private static final float[] a = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
    private static final String[] b = {"y_tex", "u_tex", "v_tex"};
    private static final FloatBuffer c = ltz.k(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
    private final GLSurfaceView d;
    private final int[] e = new int[3];
    private final int[] f = new int[3];
    private final int[] g = new int[3];
    private final int[] h = new int[3];
    private final AtomicReference i = new AtomicReference();
    private ltx j;
    private int k;
    private lyd l;

    public mzt(GLSurfaceView gLSurfaceView) {
        this.d = gLSurfaceView;
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.g;
            this.h[i] = -1;
            iArr[i] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        lyd lydVar = (lyd) this.i.getAndSet(null);
        if (lydVar == null && this.l == null) {
            return;
        }
        if (lydVar != null) {
            if (this.l != null) {
                throw null;
            }
            this.l = lydVar;
        }
        lti.f(this.l);
        GLES20.glUniformMatrix3fv(this.k, 1, false, a, 0);
        throw null;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        try {
            ltx ltxVar = new ltx("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.j = ltxVar;
            GLES20.glVertexAttribPointer(ltxVar.a("in_pos"), 2, 5126, false, 0, (Buffer) c);
            this.f[0] = this.j.a("in_tc_y");
            this.f[1] = this.j.a("in_tc_u");
            this.f[2] = this.j.a("in_tc_v");
            this.k = this.j.c("mColorConversion");
            ltz.m();
            try {
                GLES20.glGenTextures(3, this.e, 0);
                for (int i = 0; i < 3; i++) {
                    GLES20.glUniform1i(this.j.c(b[i]), i);
                    GLES20.glActiveTexture(33984 + i);
                    ltz.l(3553, this.e[i], 9729);
                }
                ltz.m();
            } catch (lty e) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e);
            }
            ltz.m();
        } catch (lty e2) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e2);
        }
    }
}
