package defpackage;

import android.view.View;
import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextContext;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eepu implements eept {
    private static final enru a = enru.c("com/google/android/libraries/smartmessaging/expressivetext/impl/ExpressiveTextControllerImpl");
    private final ExpressiveTextContext b;
    private final eepy c;
    private final eeqa d;
    private final eeqb e;

    public eepu(ExpressiveTextContext expressiveTextContext, eepy eepyVar) {
        expressiveTextContext.getClass();
        eepyVar.getClass();
        this.b = expressiveTextContext;
        this.c = eepyVar;
        this.d = new eeqa(expressiveTextContext);
        this.e = new eeqb(expressiveTextContext, eepyVar);
    }

    private final void h() {
        this.b.d();
        ExpressiveTextContext expressiveTextContext = this.b;
        eepy eepyVar = this.c;
        eepyVar.d(expressiveTextContext.c(eepyVar.e));
        ExpressiveTextContext expressiveTextContext2 = this.b;
        eepy eepyVar2 = this.c;
        eepyVar2.b(expressiveTextContext2.b(eepyVar2.f));
        this.b.f(this.c.g);
        Float f = this.c.k;
        if (f != null) {
            this.b.i(f.floatValue());
        }
        this.b.g(this.c);
    }

    @Override // defpackage.eept
    public final /* synthetic */ View.OnTouchListener a() {
        return this.d;
    }

    @Override // defpackage.eept
    public final eeqb b() {
        return this.e;
    }

    @Override // defpackage.eeql
    public final void c() {
        this.b.e();
        eepy eepyVar = this.c;
        eepyVar.d(eepy.a);
        eepyVar.g(1);
        eepyVar.a(-1);
        eepyVar.b(eepy.b);
        eepyVar.f(-1);
        eepyVar.c(0);
        eepyVar.e(0);
        eepyVar.m = "";
        eepyVar.n = 0L;
    }

    @Override // defpackage.eeql
    public final void d(GL10 gl10) {
        gl10.getClass();
        ExpressiveTextContext expressiveTextContext = this.b;
        if (expressiveTextContext.p() && !expressiveTextContext.o(System.currentTimeMillis())) {
            ((enrr) a.j().h("com/google/android/libraries/smartmessaging/expressivetext/impl/ExpressiveTextControllerImpl", "onDrawFrame", 24, "ExpressiveTextControllerImpl.kt")).q("Rendering failed. Releasing context and becoming no-op renderer.");
            this.b.e();
        }
    }

    @Override // defpackage.eeql
    public final void f(GL10 gl10, int i, int i2) {
        gl10.getClass();
        if (!this.b.p()) {
            h();
        }
        this.b.l(i, i2);
        if (this.c.l != null) {
            this.b.k(r3.left, r3.top, r3.width(), r3.height());
        }
    }

    @Override // defpackage.eeql
    public final void g(GL10 gl10, EGLConfig eGLConfig) {
        gl10.getClass();
        eGLConfig.getClass();
        h();
    }

    @Override // defpackage.eeql
    public final void e() {
    }
}
