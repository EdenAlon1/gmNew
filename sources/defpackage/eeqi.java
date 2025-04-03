package defpackage;

import android.util.Log;
import com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeqi extends Thread {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean i;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private eeqh r;
    private final WeakReference s;
    public final ArrayList j = new ArrayList();
    private boolean q = true;
    private int o = 0;
    private int p = 0;
    public boolean h = true;
    public int g = 1;

    public eeqi(WeakReference weakReference) {
        this.s = weakReference;
    }

    private final void e() {
        GLTextureView gLTextureView;
        if (!this.m || (gLTextureView = (GLTextureView) this.s.get()) == null) {
            return;
        }
        gLTextureView.d.c();
    }

    private final void f() {
        if (this.m) {
            eeqh eeqhVar = this.r;
            if (eeqhVar.f != null) {
                if (((GLTextureView) eeqhVar.a.get()) != null) {
                    EGL10 egl10 = eeqhVar.b;
                    EGLDisplay eGLDisplay = eeqhVar.c;
                    EGLContext eGLContext = eeqhVar.f;
                    if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                        Log.e("DefaultContextFactory", a.E(eGLContext, eGLDisplay, "display:", " context: "));
                        eeqh.d("eglDestroyContex", egl10.eglGetError());
                    }
                }
                eeqhVar.f = null;
            }
            EGLDisplay eGLDisplay2 = eeqhVar.c;
            if (eGLDisplay2 != null) {
                eeqhVar.b.eglTerminate(eGLDisplay2);
                eeqhVar.c = null;
            }
            this.m = false;
            GLTextureView.a.a(this);
        }
    }

    private final void g() {
        if (this.n) {
            this.n = false;
            this.r.b();
        }
    }

    private final boolean h() {
        if (this.c || !this.d || this.l || this.o <= 0 || this.p <= 0) {
            return false;
        }
        return this.h || this.g == 1;
    }

    public final void a(int i, int i2) {
        synchronized (GLTextureView.a) {
            this.o = i;
            this.p = i2;
            this.q = true;
            this.h = true;
            this.i = false;
            GLTextureView.a.notifyAll();
            while (!this.a && !this.c && !this.i && this.m && this.n && h()) {
                try {
                    GLTextureView.a.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void b() {
        synchronized (GLTextureView.a) {
            this.k = true;
            GLTextureView.a.notifyAll();
            while (!this.a) {
                try {
                    GLTextureView.a.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void c(int i) {
        synchronized (GLTextureView.a) {
            this.g = i;
            GLTextureView.a.notifyAll();
        }
    }

    public final boolean d() {
        boolean z;
        synchronized (GLTextureView.a) {
            z = this.a;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f3, code lost:
    
        if (r0 == null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ff, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0202, code lost:
    
        r0 = r6.b.eglCreateWindowSurface(r6.c, r6.e, r0.getSurfaceTexture(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0207, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0208, code lost:
    
        android.util.Log.e("GLTextureView", "eglCreateWindowSurface", r0);
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0214, code lost:
    
        r16 = r2;
        r6.d = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x027e, code lost:
    
        throw new java.lang.RuntimeException("mEglConfig not initialized");
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0286, code lost:
    
        throw new java.lang.RuntimeException("eglDisplay not initialized");
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x028e, code lost:
    
        throw new java.lang.RuntimeException("egl not initialized");
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x028f, code lost:
    
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x004f, code lost:
    
        r2 = com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0051, code lost:
    
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0052, code lost:
    
        e();
        g();
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x005b, code lost:
    
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01cd, code lost:
    
        if (r13 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d8, code lost:
    
        if (r5 == false) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01da, code lost:
    
        r6 = r18.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
    
        if (r6.b == null) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01e2, code lost:
    
        if (r6.c == null) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e6, code lost:
    
        if (r6.e == null) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e8, code lost:
    
        r6.b();
        r0 = (com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView) r6.a.get();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0323 A[Catch: all -> 0x0344, TRY_LEAVE, TryCatch #4 {all -> 0x0344, blocks: (B:7:0x0030, B:8:0x0032, B:201:0x01cf, B:93:0x01da, B:95:0x01e0, B:97:0x01e4, B:99:0x01e8, B:101:0x01f5, B:104:0x0202, B:105:0x0210, B:106:0x0219, B:108:0x021d, B:110:0x0222, B:166:0x0230, B:167:0x025f, B:168:0x0261, B:178:0x0276, B:113:0x023e, B:114:0x0240, B:121:0x0294, B:123:0x02ac, B:125:0x02b6, B:127:0x02c1, B:129:0x02cb, B:130:0x02d0, B:132:0x02da, B:133:0x02df, B:135:0x02ef, B:139:0x02fd, B:140:0x0306, B:149:0x0313, B:152:0x0319, B:154:0x0323, B:164:0x024d, B:181:0x024e, B:183:0x0258, B:187:0x0208, B:188:0x0214, B:190:0x0277, B:191:0x027e, B:193:0x027f, B:194:0x0286, B:196:0x0287, B:197:0x028e, B:240:0x0343, B:143:0x0308, B:144:0x030f, B:10:0x0033, B:237:0x003c, B:90:0x01cc, B:12:0x004a, B:223:0x004e, B:14:0x0061, B:16:0x0067, B:18:0x0072, B:20:0x007d, B:22:0x0087, B:27:0x0091, B:28:0x0094, B:30:0x0098, B:32:0x009d, B:34:0x00a1, B:36:0x00a4, B:38:0x00a8, B:40:0x00ac, B:42:0x00b0, B:43:0x00b3, B:44:0x00bd, B:46:0x00c1, B:48:0x00c5, B:50:0x00cf, B:51:0x00d7, B:53:0x00dd, B:55:0x00e1, B:59:0x00ee, B:61:0x0108, B:63:0x0115, B:65:0x011f, B:66:0x015c, B:68:0x0160, B:72:0x0175, B:74:0x0178, B:76:0x019c, B:78:0x01a0, B:80:0x01a4, B:81:0x01ad, B:86:0x01b1, B:88:0x01b5, B:89:0x01c3, B:84:0x0335, B:204:0x0167, B:205:0x0129, B:208:0x0156, B:210:0x0181, B:211:0x0188, B:213:0x0189, B:214:0x0190, B:216:0x0192, B:217:0x0197, B:218:0x00e9, B:171:0x0263, B:172:0x026c, B:117:0x0242, B:118:0x0249), top: B:6:0x0030, outer: #11, inners: #0, #1, #3, #8, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091 A[Catch: all -> 0x0341, TryCatch #1 {, blocks: (B:10:0x0033, B:237:0x003c, B:90:0x01cc, B:12:0x004a, B:223:0x004e, B:14:0x0061, B:16:0x0067, B:18:0x0072, B:20:0x007d, B:22:0x0087, B:27:0x0091, B:28:0x0094, B:30:0x0098, B:32:0x009d, B:34:0x00a1, B:36:0x00a4, B:38:0x00a8, B:40:0x00ac, B:42:0x00b0, B:43:0x00b3, B:44:0x00bd, B:46:0x00c1, B:48:0x00c5, B:50:0x00cf, B:51:0x00d7, B:53:0x00dd, B:55:0x00e1, B:59:0x00ee, B:61:0x0108, B:63:0x0115, B:65:0x011f, B:66:0x015c, B:68:0x0160, B:72:0x0175, B:74:0x0178, B:76:0x019c, B:78:0x01a0, B:80:0x01a4, B:81:0x01ad, B:86:0x01b1, B:88:0x01b5, B:89:0x01c3, B:84:0x0335, B:204:0x0167, B:205:0x0129, B:208:0x0156, B:210:0x0181, B:211:0x0188, B:213:0x0189, B:214:0x0190, B:216:0x0192, B:217:0x0197, B:218:0x00e9), top: B:9:0x0033, outer: #4, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098 A[Catch: all -> 0x0341, TryCatch #1 {, blocks: (B:10:0x0033, B:237:0x003c, B:90:0x01cc, B:12:0x004a, B:223:0x004e, B:14:0x0061, B:16:0x0067, B:18:0x0072, B:20:0x007d, B:22:0x0087, B:27:0x0091, B:28:0x0094, B:30:0x0098, B:32:0x009d, B:34:0x00a1, B:36:0x00a4, B:38:0x00a8, B:40:0x00ac, B:42:0x00b0, B:43:0x00b3, B:44:0x00bd, B:46:0x00c1, B:48:0x00c5, B:50:0x00cf, B:51:0x00d7, B:53:0x00dd, B:55:0x00e1, B:59:0x00ee, B:61:0x0108, B:63:0x0115, B:65:0x011f, B:66:0x015c, B:68:0x0160, B:72:0x0175, B:74:0x0178, B:76:0x019c, B:78:0x01a0, B:80:0x01a4, B:81:0x01ad, B:86:0x01b1, B:88:0x01b5, B:89:0x01c3, B:84:0x0335, B:204:0x0167, B:205:0x0129, B:208:0x0156, B:210:0x0181, B:211:0x0188, B:213:0x0189, B:214:0x0190, B:216:0x0192, B:217:0x0197, B:218:0x00e9), top: B:9:0x0033, outer: #4, inners: #5 }] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 867
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeqi.run():void");
    }
}
