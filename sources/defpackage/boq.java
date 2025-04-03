package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public class boq {
    public int a;
    protected int b = -1;
    protected int c = -1;
    protected int d = -1;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected boq(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "glAttachShader"
            java.lang.String r1 = "Could not link program: "
            r7.<init>()
            r2 = -1
            r7.b = r2
            r7.c = r2
            r7.d = r2
            r3 = 35633(0x8b31, float:4.9932E-41)
            int r8 = defpackage.bos.b(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L6d java.lang.IllegalStateException -> L6f
            r3 = 35632(0x8b30, float:4.9931E-41)
            int r9 = defpackage.bos.b(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L67 java.lang.IllegalStateException -> L69
            int r3 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L62 java.lang.IllegalStateException -> L64
            java.lang.String r4 = "glCreateProgram"
            defpackage.bos.f(r4)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            android.opengl.GLES20.glAttachShader(r3, r8)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            defpackage.bos.f(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            android.opengl.GLES20.glAttachShader(r3, r9)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            defpackage.bos.f(r0)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            android.opengl.GLES20.glLinkProgram(r3)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            r0 = 1
            int[] r4 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            r5 = 0
            r6 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r3, r6, r4, r5)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            r4 = r4[r5]     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            if (r4 != r0) goto L48
            r7.a = r3     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            r7.d()
            return
        L48:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            r4.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r3)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            r4.append(r1)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            java.lang.String r1 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
            throw r0     // Catch: java.lang.IllegalArgumentException -> L5e java.lang.IllegalStateException -> L60
        L5e:
            r0 = move-exception
            goto L74
        L60:
            r0 = move-exception
            goto L74
        L62:
            r0 = move-exception
            goto L65
        L64:
            r0 = move-exception
        L65:
            r3 = r2
            goto L74
        L67:
            r9 = move-exception
            goto L6a
        L69:
            r9 = move-exception
        L6a:
            r0 = r9
            r9 = r2
            goto L73
        L6d:
            r8 = move-exception
            goto L70
        L6f:
            r8 = move-exception
        L70:
            r0 = r8
            r8 = r2
            r9 = r8
        L73:
            r3 = r9
        L74:
            if (r8 == r2) goto L79
            android.opengl.GLES20.glDeleteShader(r8)
        L79:
            if (r9 == r2) goto L7e
            android.opengl.GLES20.glDeleteShader(r9)
        L7e:
            if (r3 == r2) goto L83
            android.opengl.GLES20.glDeleteProgram(r3)
        L83:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boq.<init>(java.lang.String, java.lang.String):void");
    }

    public final void a(float f) {
        GLES20.glUniform1f(this.c, 1.0f);
        bos.f("glUniform1f");
    }

    public final void b(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.b, 1, false, fArr, 0);
        bos.f("glUniformMatrix4fv");
    }

    public void c() {
        GLES20.glUseProgram(this.a);
        bos.f("glUseProgram");
        GLES20.glEnableVertexAttribArray(this.d);
        bos.f("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.d, 2, 5126, false, 0, (Buffer) bos.i);
        bos.f("glVertexAttribPointer");
        b(bos.j());
        a(1.0f);
    }

    public final void d() {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.a, "aPosition");
        this.d = glGetAttribLocation;
        bos.i(glGetAttribLocation, "aPosition");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.a, "uTransMatrix");
        this.b = glGetUniformLocation;
        bos.i(glGetUniformLocation, "uTransMatrix");
        int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.a, "uAlphaScale");
        this.c = glGetUniformLocation2;
        bos.i(glGetUniformLocation2, "uAlphaScale");
    }
}
