package defpackage;

import android.opengl.GLES20;
import java.nio.Buffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bor extends boq {
    private int e;
    private int f;
    private int g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bor(defpackage.aua r3, defpackage.bnf r4) {
        /*
            r2 = this;
            java.lang.String r0 = "sTexture"
            boolean r3 = r3.a()
            if (r3 == 0) goto Lb
            java.lang.String r3 = defpackage.bos.d
            goto Ld
        Lb:
            java.lang.String r3 = defpackage.bos.c
        Ld:
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L54
            java.lang.String r1 = "vTextureCoord"
            boolean r1 = r4.contains(r1)     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L54
            boolean r1 = r4.contains(r0)     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto L54
            r2.<init>(r3, r4)
            r3 = -1
            r2.e = r3
            r2.f = r3
            r2.g = r3
            super.d()
            int r3 = r2.a
            int r3 = android.opengl.GLES20.glGetUniformLocation(r3, r0)
            r2.e = r3
            defpackage.bos.i(r3, r0)
            int r3 = r2.a
            java.lang.String r4 = "aTextureCoord"
            int r3 = android.opengl.GLES20.glGetAttribLocation(r3, r4)
            r2.g = r3
            defpackage.bos.i(r3, r4)
            int r3 = r2.a
            java.lang.String r4 = "uTexMatrix"
            int r3 = android.opengl.GLES20.glGetUniformLocation(r3, r4)
            r2.f = r3
            defpackage.bos.i(r3, r4)
            return
        L54:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = "Invalid fragment shader"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L5c
            throw r3     // Catch: java.lang.Throwable -> L5c
        L5c:
            r3 = move-exception
            boolean r4 = r3 instanceof java.lang.IllegalArgumentException
            if (r4 == 0) goto L62
            throw r3
        L62:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unable retrieve fragment shader source"
            r4.<init>(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bor.<init>(aua, bnf):void");
    }

    @Override // defpackage.boq
    public final void c() {
        super.c();
        GLES20.glUniform1i(this.e, 0);
        GLES20.glEnableVertexAttribArray(this.g);
        bos.f("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.g, 2, 5126, false, 0, (Buffer) bos.k);
        bos.f("glVertexAttribPointer");
    }

    public final void e(float[] fArr) {
        GLES20.glUniformMatrix4fv(this.f, 1, false, fArr, 0);
        bos.f("glUniformMatrix4fv");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bor(defpackage.aua r4, defpackage.bop r5) {
        /*
            r3 = this;
            boolean r0 = r4.a()
            if (r0 == 0) goto L27
            bop r0 = defpackage.bop.UNKNOWN
            if (r5 == r0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            java.util.Objects.toString(r5)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "No default sampler shader available for"
            java.lang.String r1 = r2.concat(r1)
            defpackage.ksw.b(r0, r1)
            bop r0 = defpackage.bop.YUV
            if (r5 != r0) goto L24
            bnf r5 = defpackage.bos.g
            goto L29
        L24:
            bnf r5 = defpackage.bos.f
            goto L29
        L27:
            bnf r5 = defpackage.bos.e
        L29:
            r3.<init>(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bor.<init>(aua, bop):void");
    }
}
