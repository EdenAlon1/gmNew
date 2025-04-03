package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnc {
    public Thread c;
    protected EGLConfig g;
    public Surface i;
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final Map b = new HashMap();
    public EGLDisplay d = EGL14.EGL_NO_DISPLAY;
    protected EGLContext e = EGL14.EGL_NO_CONTEXT;
    protected int[] f = bos.a;
    protected EGLSurface h = EGL14.EGL_NO_SURFACE;
    protected Map j = Collections.EMPTY_MAP;
    protected boq k = null;
    protected bop l = bop.UNKNOWN;
    public int m = -1;

    public static final void i(int i) {
        GLES20.glActiveTexture(33984);
        bos.f("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        bos.f("glBindTexture");
    }

    private final void k(aua auaVar, bot botVar) {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.d = eglGetDisplay;
        if (Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.d, iArr, 0, iArr, 1)) {
            this.d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (botVar != null) {
            ((boi) botVar).b = iArr[0] + "." + iArr[1];
        }
        int i = true != auaVar.a() ? 8 : 10;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.d, new int[]{12324, i, 12323, i, 12322, i, 12321, true != auaVar.a() ? 8 : 2, 12325, 0, 12326, 0, 12352, true != auaVar.a() ? 4 : 64, 12610, true != auaVar.a() ? 1 : -1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, true == auaVar.a() ? 3 : 2, 12344}, 0);
        bos.e("eglCreateContext");
        this.g = eGLConfig;
        this.e = eglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.d, eglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    private final void l() {
        EGLDisplay eGLDisplay = this.d;
        EGLConfig eGLConfig = this.g;
        eGLConfig.getClass();
        int[] iArr = bos.a;
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        bos.e("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface == null) {
            throw new IllegalStateException("surface was null");
        }
        this.h = eglCreatePbufferSurface;
    }

    private final void m() {
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((boq) it.next()).a);
        }
        this.j = Collections.EMPTY_MAP;
        this.k = null;
        if (!Objects.equals(this.d, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglMakeCurrent(this.d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            for (bov bovVar : this.b.values()) {
                if (!Objects.equals(bovVar.c(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.d, bovVar.c())) {
                    int[] iArr = bos.a;
                    try {
                        bos.e("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        avw.d("GLUtils", e.toString(), e);
                    }
                }
            }
            this.b.clear();
            if (!Objects.equals(this.h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.d, this.h);
                this.h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.d, this.e);
                this.e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.d);
            this.d = EGL14.EGL_NO_DISPLAY;
        }
        this.g = null;
        this.m = -1;
        this.l = bop.UNKNOWN;
        this.i = null;
        this.c = null;
    }

    public final bov a(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.d;
            EGLConfig eGLConfig = this.g;
            eGLConfig.getClass();
            int[] iArr = this.f;
            int[] iArr2 = bos.a;
            EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
            bos.e("eglCreateWindowSurface");
            if (eglCreateWindowSurface == null) {
                throw new IllegalStateException("surface was null");
            }
            EGLDisplay eGLDisplay2 = this.d;
            Size size = new Size(bos.c(eGLDisplay2, eglCreateWindowSurface, 12375), bos.c(eGLDisplay2, eglCreateWindowSurface, 12374));
            return new bok(eglCreateWindowSurface, size.getWidth(), size.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e) {
            avw.g("OpenGlRenderer", "Failed to create EGL surface: ".concat(String.valueOf(e.getMessage())), e);
            return null;
        }
    }

    public final bov b(Surface surface) {
        ksw.d(this.b.containsKey(surface), "The surface is not registered.");
        bov bovVar = (bov) this.b.get(surface);
        bovVar.getClass();
        return bovVar;
    }

    public final void c(EGLSurface eGLSurface) {
        ksw.h(this.d);
        ksw.h(this.e);
        if (!EGL14.eglMakeCurrent(this.d, eGLSurface, eGLSurface, this.e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public final void d(Surface surface) {
        bos.h(this.a, true);
        bos.g(this.c);
        if (this.b.containsKey(surface)) {
            return;
        }
        this.b.put(surface, bos.l);
    }

    public final void e() {
        if (this.a.getAndSet(false)) {
            bos.g(this.c);
            m();
        }
    }

    public final void f(Surface surface, boolean z) {
        if (this.i == surface) {
            this.i = null;
            c(this.h);
        }
        bov bovVar = z ? (bov) this.b.remove(surface) : (bov) this.b.put(surface, bos.l);
        if (bovVar == null || bovVar == bos.l) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.d, bovVar.c());
        } catch (RuntimeException e) {
            avw.g("OpenGlRenderer", "Failed to destroy EGL surface: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    public final void g(Surface surface) {
        bos.h(this.a, true);
        bos.g(this.c);
        f(surface, true);
    }

    protected final void h(int i) {
        boq boqVar = (boq) this.j.get(this.l);
        if (boqVar == null) {
            bop bopVar = this.l;
            java.util.Objects.toString(bopVar);
            throw new IllegalStateException("Unable to configure program for input format: ".concat(String.valueOf(bopVar)));
        }
        if (this.k != boqVar) {
            this.k = boqVar;
            boqVar.c();
            Log.d("OpenGlRenderer", "Using program for input format " + this.l + ": " + this.k);
        }
        i(i);
    }

    public final void j(aua auaVar, Map map) {
        Object borVar;
        ksr ksrVar;
        bos.h(this.a, false);
        boi boiVar = new boi();
        String str = "0.0";
        boiVar.a = "0.0";
        boiVar.b = "0.0";
        boiVar.c = "";
        boiVar.d = "";
        try {
            if (auaVar.a()) {
                bos.h(this.a, false);
                try {
                    try {
                        k(auaVar, null);
                        l();
                        c(this.h);
                        String glGetString = GLES20.glGetString(7939);
                        String eglQueryString = EGL14.eglQueryString(this.d, 12373);
                        if (glGetString == null) {
                            glGetString = "";
                        }
                        if (eglQueryString == null) {
                            eglQueryString = "";
                        }
                        ksrVar = new ksr(glGetString, eglQueryString);
                    } catch (IllegalStateException e) {
                        avw.g("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
                        ksrVar = new ksr("", "");
                    }
                    String str2 = (String) ksrVar.a;
                    ksw.h(str2);
                    String str3 = (String) ksrVar.b;
                    ksw.h(str3);
                    if (!str2.contains("GL_EXT_YUV_target")) {
                        avw.f("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                        auaVar = aua.b;
                    }
                    int[] iArr = bos.a;
                    if (auaVar.h == 3) {
                        if (str3.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                            iArr = bos.b;
                        } else {
                            avw.f("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
                        }
                    }
                    this.f = iArr;
                    boiVar.c = str2;
                    boiVar.d = str3;
                } finally {
                    m();
                }
            }
            k(auaVar, boiVar);
            l();
            c(this.h);
            Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
            if (matcher.find()) {
                String group = matcher.group(1);
                ksw.h(group);
                String group2 = matcher.group(2);
                ksw.h(group2);
                str = a.w(group2, group, ".");
            }
            boiVar.a = str;
            HashMap hashMap = new HashMap();
            bop[] values = bop.values();
            int length = values.length;
            for (int i = 0; i < length; i++) {
                bop bopVar = values[i];
                bnf bnfVar = (bnf) map.get(bopVar);
                if (bnfVar != null) {
                    borVar = new bor(auaVar, bnfVar);
                } else {
                    if (bopVar != bop.YUV && bopVar != bop.DEFAULT) {
                        boolean z = bopVar == bop.UNKNOWN;
                        java.util.Objects.toString(bopVar);
                        ksw.d(z, "Unhandled input format: ".concat(String.valueOf(bopVar)));
                        if (auaVar.a()) {
                            borVar = new boo();
                        } else {
                            bnf bnfVar2 = (bnf) map.get(bop.DEFAULT);
                            borVar = bnfVar2 != null ? new bor(auaVar, bnfVar2) : new bor(auaVar, bop.DEFAULT);
                        }
                    }
                    borVar = new bor(auaVar, bopVar);
                }
                Log.d("GLUtils", a.j(borVar, bopVar, "Shader program for input format ", " created: "));
                hashMap.put(bopVar, borVar);
            }
            this.j = hashMap;
            int a = bos.a();
            this.m = a;
            h(a);
            this.c = Thread.currentThread();
            this.a.set(true);
            String str4 = boiVar.a;
            String str5 = boiVar.b;
            String str6 = str4 == null ? " glVersion" : "";
            if (str5 == null) {
                str6 = str6.concat(" eglVersion");
            }
            if (boiVar.c == null) {
                str6 = str6.concat(" glExtensions");
            }
            if (boiVar.d == null) {
                str6 = str6.concat(" eglExtensions");
            }
            if (!str6.isEmpty()) {
                throw new IllegalStateException("Missing required properties:".concat(str6));
            }
        } catch (IllegalArgumentException | IllegalStateException e2) {
            throw e2;
        }
    }
}
