package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Pair;
import com.google.mediapipe.framework.TextureFrame;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exkv implements GLSurfaceView.Renderer {
    private int f;
    private int g;
    private int h;
    private int i;
    private final Pair l;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public int d = 36197;
    private final float[] j = new float[16];
    public final AtomicReference e = new AtomicReference();
    private final AtomicBoolean k = new AtomicBoolean();

    public exkv() {
        Float valueOf = Float.valueOf(0.5f);
        this.l = new Pair(valueOf, valueOf);
    }

    private final boolean a() {
        return this.d == 36197;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        TextureFrame textureFrame = null;
        TextureFrame textureFrame2 = (TextureFrame) this.e.getAndSet(null);
        GLES20.glClear(16384);
        exmk.c("glClear");
        if (textureFrame2 != null) {
            GLES20.glActiveTexture(33984);
            exmk.c("glActiveTexture");
            GLES20.glBindTexture(this.d, textureFrame2.getTextureName());
            exmk.c("glBindTexture");
            GLES20.glTexParameteri(this.d, 10241, 9729);
            GLES20.glTexParameteri(this.d, 10240, 9729);
            GLES20.glTexParameteri(this.d, 10242, 33071);
            GLES20.glTexParameteri(this.d, 10243, 33071);
            exmk.c("texture setup");
            GLES20.glUseProgram(this.c);
            GLES20.glUniform1i(this.h, 0);
            GLES20.glUniformMatrix4fv(this.i, 1, false, this.j, 0);
            exmk.c("glUniformMatrix4fv");
            GLES20.glEnableVertexAttribArray(1);
            GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, (Buffer) exme.a);
            int i = this.a;
            float f = i > 0 ? this.f / i : 1.0f;
            int i2 = this.b;
            float f2 = i2 > 0 ? this.g / i2 : 1.0f;
            float max = Math.max(f, f2);
            float f3 = f2 / max;
            Pair pair = this.l;
            float floatValue = ((Float) pair.first).floatValue();
            float floatValue2 = ((Float) pair.second).floatValue();
            float f4 = (((1.0f - (f / max)) * 0.5f) - 0.5f) + floatValue;
            float f5 = ((r2 + r6) - 0.5f) + floatValue;
            float f6 = (((1.0f - f3) * 0.5f) - 0.5f) + floatValue2;
            float f7 = ((r4 + f3) - 0.5f) + floatValue2;
            float[] fArr = {f4, f5, f6, f7};
            float f8 = fArr[0];
            float f9 = fArr[1];
            float f10 = fArr[2];
            FloatBuffer b = exmk.b(f8, f10, f9, f10, f8, f7, f9, f7);
            GLES20.glEnableVertexAttribArray(2);
            GLES20.glVertexAttribPointer(2, 2, 5126, false, 0, (Buffer) b);
            exmk.c("program setup");
            GLES20.glDrawArrays(5, 0, 4);
            exmk.c("glDrawArrays");
            this.k.getAndSet(false);
            GLES20.glBindTexture(this.d, 0);
            exmk.c("unbind surfaceTexture");
            textureFrame = textureFrame2;
        }
        GLES20.glFlush();
        if (textureFrame != null) {
            textureFrame.release();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        this.f = i;
        this.g = i2;
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Matrix.setIdentityM(this.j, 0);
        HashMap hashMap = new HashMap();
        hashMap.put("position", 1);
        hashMap.put("texture_coordinate", 2);
        Log.d("DemoRenderer", "external texture: " + a());
        int d = exmk.d(true != a() ? "varying mediump vec2 sample_coordinate;\nuniform sampler2D video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}" : "#extension GL_OES_EGL_image_external : require\nvarying mediump vec2 sample_coordinate;\nuniform samplerExternalOES video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}", hashMap);
        this.c = d;
        this.h = GLES20.glGetUniformLocation(d, "video_frame");
        this.i = GLES20.glGetUniformLocation(this.c, "texture_transform");
        exmk.c("glGetUniformLocation");
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
    }
}
