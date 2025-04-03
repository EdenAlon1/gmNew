package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lyz implements mbj {
    private final Context b;
    private lzc c;
    private final lpo d;
    private EGLDisplay h;
    private mbh e = new lyx();
    private mbi f = new lyy();
    public mbg a = new mbg() { // from class: lyv
        @Override // defpackage.mbg
        public final void a(lsf lsfVar) {
            luj.d("DebugViewShaderProgram", "Exception caught by errorListener.", lsfVar);
        }
    };
    private Executor g = erpp.a;

    public lyz(Context context, lpo lpoVar) {
        this.b = context;
        this.d = lpoVar;
    }

    @Override // defpackage.mbj
    public final void c() {
        lzc lzcVar = this.c;
        if (lzcVar != null) {
            lzcVar.c();
        }
        this.e.w();
        this.e.c();
    }

    @Override // defpackage.mbj
    public final void d(lqg lqgVar, lqh lqhVar, long j) {
        try {
            int i = lqhVar.d;
            int i2 = lqhVar.e;
            if (this.h == null) {
                this.h = ltz.h();
            }
            int[] iArr = ltz.a;
            EGL14.eglGetCurrentContext();
            if (this.c == null) {
                Context context = this.b;
                int i3 = engw.d;
                engw engwVar = enou.a;
                lpo lpoVar = this.d;
                this.c = lzc.n(context, engwVar, engwVar, lpoVar, lpoVar.e == 1 ? 2 : 0);
            }
            lti.f(this.c);
            throw null;
        } catch (lsf | lty e) {
            this.g.execute(new Runnable() { // from class: lyw
                @Override // java.lang.Runnable
                public final void run() {
                    lyz.this.a.a(lsf.a(e));
                }
            });
        }
    }

    @Override // defpackage.mbj
    public final void e() {
        lzc lzcVar = this.c;
        if (lzcVar != null) {
            lzcVar.e();
        }
        try {
            ltz.m();
        } catch (lty e) {
            throw new lsf(e);
        }
    }

    @Override // defpackage.mbj
    public final void f(lqh lqhVar) {
        this.e.b(lqhVar);
        this.e.c();
    }

    @Override // defpackage.mbj
    public final void g(Executor executor, mbg mbgVar) {
        this.a = mbgVar;
        this.g = executor;
    }

    @Override // defpackage.mbj
    public final void h(mbh mbhVar) {
        this.e = mbhVar;
        mbhVar.c();
    }

    @Override // defpackage.mbj
    public final void i(mbi mbiVar) {
        this.f = mbiVar;
    }

    @Override // defpackage.mbj
    public final void j() {
        this.f.a();
    }
}
