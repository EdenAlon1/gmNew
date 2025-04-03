package defpackage;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
@ffbs
/* loaded from: classes.dex */
public final class jwf implements jvn {
    public final View a;
    public boolean b;
    public ffji c;
    public ffji d;
    public jvu e;
    public juw f;
    public final List g;
    public final ffbz h;
    public final jug i;
    public final hne j;
    public Runnable k;
    public final juy l;
    private final Executor m;
    private Rect n;

    public jwf(View view, ike ikeVar) {
        juy juyVar = new juy(view);
        final Choreographer choreographer = Choreographer.getInstance();
        Executor executor = new Executor() { // from class: jwh
            @Override // java.util.concurrent.Executor
            public final void execute(final Runnable runnable) {
                choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: jwg
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) {
                        runnable.run();
                    }
                });
            }
        };
        this.a = view;
        this.l = juyVar;
        this.m = executor;
        this.c = jwb.a;
        this.d = jwc.a;
        this.e = new jvu("", jpm.a, 4);
        this.f = juw.a;
        this.g = new ArrayList();
        this.h = ffca.b(3, new jvz(this));
        this.i = new jug(ikeVar, juyVar);
        this.j = new hne(new jvy[16]);
    }

    private final void e(jvy jvyVar) {
        this.j.n(jvyVar);
        if (this.k == null) {
            Runnable runnable = new Runnable() { // from class: jvx
                @Override // java.lang.Runnable
                public final void run() {
                    View findFocus;
                    jwf jwfVar = jwf.this;
                    jwfVar.k = null;
                    if (!jwfVar.a.isFocused() && (findFocus = jwfVar.a.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                        jwfVar.j.g();
                        return;
                    }
                    fflb fflbVar = new fflb();
                    fflb fflbVar2 = new fflb();
                    hne hneVar = jwfVar.j;
                    Object[] objArr = hneVar.a;
                    int i = hneVar.b;
                    for (int i2 = 0; i2 < i; i2++) {
                        jvy jvyVar2 = (jvy) objArr[i2];
                        int ordinal = jvyVar2.ordinal();
                        if (ordinal == 0) {
                            fflbVar.a = true;
                            fflbVar2.a = true;
                        } else if (ordinal == 1) {
                            fflbVar.a = false;
                            fflbVar2.a = false;
                        } else if ((ordinal == 2 || ordinal == 3) && !ffkj.e(fflbVar.a, false)) {
                            fflbVar2.a = Boolean.valueOf(jvyVar2 == jvy.c);
                        }
                    }
                    jwfVar.j.g();
                    if (ffkj.e(fflbVar.a, true)) {
                        jwfVar.a();
                    }
                    Boolean bool = (Boolean) fflbVar2.a;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            jwfVar.l.b.b();
                        } else {
                            jwfVar.l.b.a();
                        }
                    }
                    if (ffkj.e(fflbVar.a, false)) {
                        jwfVar.a();
                    }
                }
            };
            this.m.execute(runnable);
            this.k = runnable;
        }
    }

    public final void a() {
        juy juyVar = this.l;
        juyVar.a().restartInput(juyVar.a);
    }

    @Override // defpackage.jvn
    @ffbs
    public final void b(iam iamVar) {
        Rect rect;
        float f = iamVar.e;
        this.n = new Rect(ffln.b(iamVar.b), ffln.b(iamVar.c), ffln.b(iamVar.d), ffln.b(f));
        if (!this.g.isEmpty() || (rect = this.n) == null) {
            return;
        }
        this.a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // defpackage.jvn
    public final void c() {
        e(jvy.a);
    }

    @Override // defpackage.jvn
    public final void d(jvu jvuVar, juw juwVar, ffji ffjiVar, ffji ffjiVar2) {
        this.b = true;
        this.e = jvuVar;
        this.f = juwVar;
        this.c = ffjiVar;
        this.d = ffjiVar2;
        e(jvy.a);
    }

    @Override // defpackage.jvn
    public final void f() {
        this.b = false;
        this.c = jwd.a;
        this.d = jwe.a;
        this.n = null;
        e(jvy.b);
    }

    @Override // defpackage.jvn
    public final void g(jvu jvuVar, jvu jvuVar2) {
        boolean z = true;
        if (jpm.h(this.e.c, jvuVar2.c) && ffkj.e(this.e.d, jvuVar2.d)) {
            z = false;
        }
        this.e = jvuVar2;
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            jvo jvoVar = (jvo) ((WeakReference) this.g.get(i)).get();
            if (jvoVar != null) {
                jvoVar.a = jvuVar2;
            }
        }
        jug jugVar = this.i;
        synchronized (jugVar.a) {
            jugVar.h = null;
            jugVar.j = null;
            jugVar.i = null;
            jugVar.k = jue.a;
            jugVar.l = null;
            jugVar.m = null;
        }
        if (ffkj.e(jvuVar, jvuVar2)) {
            if (z) {
                juy juyVar = this.l;
                int d = jpm.d(jvuVar2.c);
                int c = jpm.c(jvuVar2.c);
                jpm jpmVar = this.e.d;
                int d2 = jpmVar != null ? jpm.d(jpmVar.b) : -1;
                jpm jpmVar2 = this.e.d;
                juyVar.b(d, c, d2, jpmVar2 != null ? jpm.c(jpmVar2.b) : -1);
                return;
            }
            return;
        }
        if (jvuVar != null && (!ffkj.e(jvuVar.a(), jvuVar2.a()) || (jpm.h(jvuVar.c, jvuVar2.c) && !ffkj.e(jvuVar.d, jvuVar2.d)))) {
            a();
            return;
        }
        int size2 = this.g.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jvo jvoVar2 = (jvo) ((WeakReference) this.g.get(i2)).get();
            if (jvoVar2 != null) {
                jvu jvuVar3 = this.e;
                juy juyVar2 = this.l;
                if (jvoVar2.d) {
                    jvoVar2.a = jvuVar3;
                    if (jvoVar2.c) {
                        juyVar2.a().updateExtractedText(juyVar2.a, jvoVar2.b, juz.a(jvuVar3));
                    }
                    jpm jpmVar3 = jvuVar3.d;
                    int d3 = jpmVar3 != null ? jpm.d(jpmVar3.b) : -1;
                    jpm jpmVar4 = jvuVar3.d;
                    juyVar2.b(jpm.d(jvuVar3.c), jpm.c(jvuVar3.c), d3, jpmVar4 != null ? jpm.c(jpmVar4.b) : -1);
                }
            }
        }
    }

    @Override // defpackage.jvn
    public final void h(jvu jvuVar, jvj jvjVar, jpg jpgVar, ffji ffjiVar, iam iamVar, iam iamVar2) {
        jug jugVar = this.i;
        synchronized (jugVar.a) {
            jugVar.h = jvuVar;
            jugVar.j = jvjVar;
            jugVar.i = jpgVar;
            jugVar.k = ffjiVar;
            jugVar.l = iamVar;
            jugVar.m = iamVar2;
            if (jugVar.c || jugVar.b) {
                jugVar.a();
            }
        }
    }

    @Override // defpackage.jvn
    public final void i() {
        e(jvy.d);
    }

    @Override // defpackage.jvn
    public final void j() {
        e(jvy.c);
    }
}
