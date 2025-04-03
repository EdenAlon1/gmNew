package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltx {
    public final Map a;
    public boolean b;
    private final int c;
    private final ltv[] d;
    private final ltw[] e;
    private final Map f;

    public ltx(Context context, String str, String str2) {
        this(lvf.O(context, str), lvf.O(context, str2));
    }

    public static int b(byte[] bArr) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static void l(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        ltz.n(iArr[0] == 1, GLES20.glGetShaderInfoLog(glCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        ltz.m();
    }

    public final int a(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.c, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        ltz.m();
        return glGetAttribLocation;
    }

    public final int c(String str) {
        return GLES20.glGetUniformLocation(this.c, str);
    }

    public final void d() {
        int i = 0;
        while (true) {
            ltv[] ltvVarArr = this.d;
            if (i >= ltvVarArr.length) {
                for (ltw ltwVar : this.e) {
                    boolean z = this.b;
                    int i2 = ltwVar.c;
                    if (i2 == 5124) {
                        GLES20.glUniform1iv(ltwVar.b, 1, ltwVar.e, 0);
                        ltz.m();
                    } else if (i2 == 5126) {
                        GLES20.glUniform1fv(ltwVar.b, 1, ltwVar.d, 0);
                        ltz.m();
                    } else if (i2 == 35678 || i2 == 35815 || i2 == 36198) {
                        if (ltwVar.f == 0) {
                            throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                        }
                        GLES20.glActiveTexture(ltwVar.g + 33984);
                        ltz.m();
                        int i3 = ltwVar.c;
                        int i4 = i3 == 35678 ? 3553 : 36197;
                        int i5 = ltwVar.f;
                        int i6 = 9729;
                        if (i3 != 35678 && z) {
                            i6 = 9728;
                        }
                        ltz.l(i4, i5, i6);
                        if (ltwVar.c == 35678) {
                            if (ltwVar.h == 9987) {
                                GLES20.glGenerateMipmap(3553);
                                ltz.m();
                            }
                            GLES20.glTexParameteri(3553, 10241, ltwVar.h);
                            ltz.m();
                        }
                        GLES20.glUniform1i(ltwVar.b, ltwVar.g);
                        ltz.m();
                    } else {
                        switch (i2) {
                            case 35664:
                                GLES20.glUniform2fv(ltwVar.b, 1, ltwVar.d, 0);
                                ltz.m();
                                break;
                            case 35665:
                                GLES20.glUniform3fv(ltwVar.b, 1, ltwVar.d, 0);
                                ltz.m();
                                break;
                            case 35666:
                                GLES20.glUniform4fv(ltwVar.b, 1, ltwVar.d, 0);
                                ltz.m();
                                break;
                            case 35667:
                                GLES20.glUniform2iv(ltwVar.b, 1, ltwVar.e, 0);
                                ltz.m();
                                break;
                            case 35668:
                                GLES20.glUniform3iv(ltwVar.b, 1, ltwVar.e, 0);
                                ltz.m();
                                break;
                            case 35669:
                                GLES20.glUniform4iv(ltwVar.b, 1, ltwVar.e, 0);
                                ltz.m();
                                break;
                            default:
                                switch (i2) {
                                    case 35675:
                                        GLES20.glUniformMatrix3fv(ltwVar.b, 1, false, ltwVar.d, 0);
                                        ltz.m();
                                        break;
                                    case 35676:
                                        GLES20.glUniformMatrix4fv(ltwVar.b, 1, false, ltwVar.d, 0);
                                        ltz.m();
                                        break;
                                    default:
                                        throw new IllegalStateException(a.h(i2, "Unexpected uniform type: "));
                                }
                        }
                    }
                }
                return;
            }
            ltv ltvVar = ltvVarArr[i];
            Buffer buffer = ltvVar.c;
            if (buffer == null) {
                throw new NullPointerException("call setBuffer before bind");
            }
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(ltvVar.b, ltvVar.d, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(ltvVar.b);
            ltz.m();
            i++;
        }
    }

    public final void e() {
        GLES20.glDeleteProgram(this.c);
        ltz.m();
    }

    public final void f(String str, float f) {
        ltw ltwVar = (ltw) this.a.get(str);
        lti.f(ltwVar);
        ltwVar.d[0] = f;
    }

    public final void g(String str, float[] fArr) {
        ltw ltwVar = (ltw) this.a.get(str);
        lti.f(ltwVar);
        ltwVar.a(fArr);
    }

    public final void h(String str, int i) {
        ltw ltwVar = (ltw) this.a.get(str);
        lti.f(ltwVar);
        ltwVar.e[0] = i;
    }

    public final void i(String str, int i, int i2) {
        ltw ltwVar = (ltw) this.a.get(str);
        lti.f(ltwVar);
        ltwVar.b(i, i2);
    }

    public final void j() {
        GLES20.glUseProgram(this.c);
        ltz.m();
    }

    public final void k(float[] fArr) {
        ltv ltvVar = (ltv) this.f.get("aFramePosition");
        lti.f(ltvVar);
        ltvVar.c = ltz.k(fArr);
        ltvVar.d = 4;
    }

    public ltx(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        this.c = glCreateProgram;
        ltz.m();
        l(glCreateProgram, 35633, str);
        l(glCreateProgram, 35632, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        ltz.n(iArr[0] == 1, "Unable to link shader program: \n".concat(String.valueOf(GLES20.glGetProgramInfoLog(glCreateProgram))));
        GLES20.glUseProgram(glCreateProgram);
        this.f = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.d = new ltv[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            int i2 = this.c;
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(i2, 35722, iArr3, 0);
            int i3 = iArr3[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveAttrib(i2, i, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str3 = new String(bArr, 0, b(bArr));
            ltv ltvVar = new ltv(str3, GLES20.glGetAttribLocation(i2, str3));
            this.d[i] = ltvVar;
            this.f.put(ltvVar.a, ltvVar);
        }
        this.a = new HashMap();
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.c, 35718, iArr4, 0);
        this.e = new ltw[iArr4[0]];
        for (int i4 = 0; i4 < iArr4[0]; i4++) {
            int i5 = this.c;
            int[] iArr5 = new int[1];
            GLES20.glGetProgramiv(i5, 35719, iArr5, 0);
            int[] iArr6 = new int[1];
            int i6 = iArr5[0];
            byte[] bArr2 = new byte[i6];
            GLES20.glGetActiveUniform(i5, i4, i6, new int[1], 0, new int[1], 0, iArr6, 0, bArr2, 0);
            String str4 = new String(bArr2, 0, b(bArr2));
            ltw ltwVar = new ltw(str4, GLES20.glGetUniformLocation(i5, str4), iArr6[0]);
            this.e[i4] = ltwVar;
            this.a.put(ltwVar.a, ltwVar);
        }
        ltz.m();
    }
}
