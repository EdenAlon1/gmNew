package defpackage;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctep {
    public final FloatBuffer a;
    public final float[] c;
    public int d;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final float l;
    public final float m;
    public final boolean n;
    public final String o;
    public final int p;
    private final float[] q;
    public final float[] b = new float[16];
    public int e = -12345;

    public ctep(float f, float f2, boolean z) {
        float[] fArr = {-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
        this.q = fArr;
        float[] fArr2 = new float[16];
        this.c = fArr2;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.a = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        Matrix.setIdentityM(fArr2, 0);
        this.l = f;
        this.m = f2;
        this.n = z;
        this.o = true != z ? "#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uInputTextureWidth;\nuniform float uInputTextureHeight;\nvec4 tempFragColor = vec4(0.0, 0.0, 0.0, 0.0);\nvoid main() {\n  float pixelWidth = 1.0 / uInputTextureWidth;\n  float pixelHeight = 1.0 / uInputTextureHeight;\n  for(int i = -1; i <= 1; i++){\n    for(int j = -1; j <= 1; j++){\n      tempFragColor += texture2D(sTexture, vTextureCoord + vec2(pixelWidth * float(i), pixelHeight * float(j)));\n    }\n  }\n  gl_FragColor = tempFragColor / 9.0;\n}\n" : "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        this.p = true != z ? 9729 : 9728;
    }

    public static final int a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        ((ensz) ((ensz) ctfm.a.i()).h("com/google/android/apps/messaging/shared/util/media/video/TextureRender", "loadShader", 231, "TextureRender.java")).w("Could not compile shader %s: %s", i, GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}
