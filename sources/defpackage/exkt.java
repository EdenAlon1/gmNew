package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import com.google.mediapipe.framework.GlSyncToken;
import j$.time.Duration;
import java.nio.Buffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exkt extends exmi implements SurfaceTexture.OnFrameAvailableListener {
    public volatile SurfaceTexture a;
    public volatile SurfaceTexture b;
    public final List c;
    public volatile boolean d;
    public final Queue e;
    public int f;
    public exmh g;
    public final boolean h;
    public long i;
    public long j;
    public boolean k;
    protected int l;
    protected int m;
    private int[] s;
    private final int t;

    public exkt(EGLContext eGLContext) {
        super(eGLContext);
        this.a = null;
        this.b = null;
        this.s = null;
        this.d = false;
        this.e = new ArrayDeque();
        this.f = 0;
        this.g = null;
        this.h = true;
        Duration duration = Duration.ZERO;
        this.i = 0L;
        this.j = 0L;
        this.k = false;
        this.l = 0;
        this.m = 0;
        this.t = 2;
        this.g = new exmh();
        this.c = new ArrayList();
    }

    public static void g(exln exlnVar) {
        GLES20.glDeleteTextures(1, new int[]{exlnVar.b}, 0);
    }

    public static final void h(exln exlnVar) {
        GlSyncToken glSyncToken;
        try {
            if (Log.isLoggable("ExternalTextureConv", 2)) {
                Log.v("ExternalTextureConv", String.format("Waiting for tex: %d width: %d height: %d timestamp: %d", Integer.valueOf(exlnVar.b), Integer.valueOf(exlnVar.c), Integer.valueOf(exlnVar.d), Long.valueOf(exlnVar.e)));
            }
            synchronized (exlnVar) {
                while (exlnVar.f && exlnVar.g == null) {
                    exlnVar.wait();
                }
                glSyncToken = exlnVar.g;
                if (glSyncToken != null) {
                    exlnVar.f = false;
                    exlnVar.g = null;
                } else {
                    glSyncToken = null;
                }
            }
            if (glSyncToken != null) {
                glSyncToken.waitOnGpu();
                glSyncToken.release();
            }
            if (Log.isLoggable("ExternalTextureConv", 2)) {
                Log.v("ExternalTextureConv", String.format("Finished waiting for tex: %d width: %d height: %d timestamp: %d", Integer.valueOf(exlnVar.b), Integer.valueOf(exlnVar.c), Integer.valueOf(exlnVar.d), Long.valueOf(exlnVar.e)));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Log.e("ExternalTextureConv", "thread was unexpectedly interrupted: ".concat(String.valueOf(e.getMessage())));
            throw new RuntimeException(e);
        }
    }

    public final exks a() {
        int i = this.l;
        int i2 = this.m;
        int[] iArr = {0};
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        exmk.c("glTexImage2D");
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        exmk.c("texture setup");
        int i3 = iArr[0];
        Log.d("ExternalTextureConv", String.format("Created output texture: %d width: %d height: %d", Integer.valueOf(i3), Integer.valueOf(this.l), Integer.valueOf(this.m)));
        j(i3, this.l, this.m);
        return new exks(this, i3, this.l, this.m);
    }

    protected final synchronized void b(exks exksVar) {
        this.e.offer(exksVar);
        int i = this.f - 1;
        this.f = i;
        int max = Math.max(this.t - i, 0);
        while (this.e.size() > max) {
            final exks exksVar2 = (exks) this.e.remove();
            this.p.post(new Runnable() { // from class: exkq
                @Override // java.lang.Runnable
                public final void run() {
                    exkt.g(exks.this);
                }
            });
        }
    }

    @Override // defpackage.exmi
    public final void c() {
        super.c();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        exmh exmhVar = this.g;
        HashMap hashMap = new HashMap();
        hashMap.put("position", 1);
        hashMap.put("texture_coordinate", 2);
        int d = exmk.d("#extension GL_OES_EGL_image_external : require\nvarying mediump vec2 sample_coordinate;\nuniform samplerExternalOES video_frame;\n\nvoid main() {\n  gl_FragColor = texture2D(video_frame, sample_coordinate);\n}", hashMap);
        exmhVar.c = d;
        exmhVar.d = GLES20.glGetUniformLocation(d, "video_frame");
        exmhVar.e = GLES20.glGetUniformLocation(exmhVar.c, "texture_transform");
        exmk.c("glGetUniformLocation");
        int[] iArr = new int[1];
        this.s = iArr;
        GLES20.glGenTextures(1, iArr, 0);
        this.b = new SurfaceTexture(this.s[0]);
        f(this.b, 0, 0);
    }

    @Override // defpackage.exmi
    public final void d() {
        f(null, 0, 0);
        while (!this.e.isEmpty()) {
            g((exln) this.e.remove());
        }
        this.b.release();
        int[] iArr = this.s;
        if (iArr != null) {
            GLES20.glDeleteTextures(1, iArr, 0);
        }
        GLES20.glDeleteProgram(this.g.c);
        super.d();
    }

    public final void e(int i, int i2) {
        this.l = i;
        this.m = i2;
    }

    public final void f(SurfaceTexture surfaceTexture, int i, int i2) {
        this.d = false;
        if (this.a != null) {
            this.a.setOnFrameAvailableListener(null);
        }
        this.a = surfaceTexture;
        if (this.a != null) {
            this.a.setOnFrameAvailableListener(this);
        }
        e(i, i2);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(final SurfaceTexture surfaceTexture) {
        this.p.post(new Runnable() { // from class: exkr
            @Override // java.lang.Runnable
            public final void run() {
                exks exksVar;
                SurfaceTexture surfaceTexture2 = surfaceTexture;
                exkt exktVar = exkt.this;
                if (surfaceTexture2 != exktVar.a) {
                    return;
                }
                exktVar.d = true;
                synchronized (exktVar.c) {
                    boolean z = false;
                    for (exky exkyVar : exktVar.c) {
                        synchronized (exktVar) {
                            exksVar = (exks) exktVar.e.poll();
                            exktVar.f++;
                        }
                        if (exksVar == null) {
                            exksVar = exktVar.a();
                        } else {
                            if (exksVar.c == exktVar.l && exksVar.d == exktVar.m) {
                                exkt.h(exksVar);
                            }
                            exkt.h(exksVar);
                            exkt.g(exksVar);
                            exksVar = exktVar.a();
                        }
                        exktVar.j(exksVar.b, exktVar.l, exktVar.m);
                        exmh exmhVar = exktVar.g;
                        SurfaceTexture surfaceTexture3 = exktVar.a;
                        GLES20.glClear(16384);
                        GLES20.glActiveTexture(33984);
                        exmk.c("glActiveTexture");
                        surfaceTexture3.updateTexImage();
                        surfaceTexture3.getTransformMatrix(exmhVar.f);
                        GLES20.glTexParameteri(36197, 10241, 9729);
                        GLES20.glTexParameteri(36197, 10240, 9729);
                        GLES20.glTexParameteri(36197, 10242, 33071);
                        GLES20.glTexParameteri(36197, 10243, 33071);
                        exmk.c("glTexParameteri");
                        GLES20.glUseProgram(exmhVar.c);
                        exmk.c("glUseProgram");
                        GLES20.glUniform1i(exmhVar.d, 0);
                        exmk.c("glUniform1i");
                        GLES20.glUniformMatrix4fv(exmhVar.e, 1, false, exmhVar.f, 0);
                        exmk.c("glUniformMatrix4fv");
                        GLES20.glEnableVertexAttribArray(1);
                        GLES20.glVertexAttribPointer(1, 2, 5126, false, 0, (Buffer) exmh.b);
                        GLES20.glEnableVertexAttribArray(2);
                        GLES20.glVertexAttribPointer(2, 2, 5126, false, 0, (Buffer) exmh.a);
                        exmk.c("program setup");
                        GLES20.glDrawArrays(5, 0, 4);
                        exmk.c("glDrawArrays");
                        GLES20.glBindTexture(36197, 0);
                        exmk.c("glBindTexture");
                        boolean z2 = exmhVar.g;
                        GLES20.glFinish();
                        long timestamp = exktVar.a.getTimestamp() / 1000;
                        if (exktVar.h && exktVar.k) {
                            long j = exktVar.i + timestamp;
                            long j2 = exktVar.j;
                            if (j <= j2) {
                                exktVar.i = (j2 + 1) - timestamp;
                            }
                        }
                        long j3 = timestamp + exktVar.i;
                        exksVar.e = j3;
                        exktVar.j = j3;
                        exktVar.k = true;
                        if (exkyVar != null) {
                            if (Log.isLoggable("ExternalTextureConv", 2)) {
                                Log.v("ExternalTextureConv", String.format("Locking tex: %d width: %d height: %d", Integer.valueOf(exksVar.b), Integer.valueOf(exksVar.c), Integer.valueOf(exksVar.d)));
                            }
                            synchronized (exksVar) {
                                GlSyncToken glSyncToken = exksVar.g;
                                if (glSyncToken != null) {
                                    glSyncToken.release();
                                    exksVar.g = null;
                                }
                                exksVar.f = true;
                            }
                            exkyVar.hI(exksVar);
                        }
                        z = true;
                    }
                    if (!z) {
                        exktVar.a.updateTexImage();
                    }
                }
            }
        });
    }
}
