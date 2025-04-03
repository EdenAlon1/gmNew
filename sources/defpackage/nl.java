package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nl {
    kwe b;
    public boolean c;
    private Interpolator e;
    private long d = -1;
    private final kwf f = new nk(this);
    public final ArrayList a = new ArrayList();

    public final void a() {
        if (this.c) {
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((kwd) arrayList.get(i)).a();
            }
            this.c = false;
        }
    }

    public final void b() {
        View view;
        if (this.c) {
            return;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kwd kwdVar = (kwd) arrayList.get(i);
            long j = this.d;
            if (j >= 0) {
                kwdVar.c(j);
            }
            Interpolator interpolator = this.e;
            if (interpolator != null && (view = (View) kwdVar.a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.b != null) {
                kwdVar.d(this.f);
            }
            View view2 = (View) kwdVar.a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.c = true;
    }

    public final void c(kwd kwdVar) {
        if (this.c) {
            return;
        }
        this.a.add(kwdVar);
    }

    public final void d() {
        if (this.c) {
            return;
        }
        this.d = 250L;
    }

    public final void e(Interpolator interpolator) {
        if (this.c) {
            return;
        }
        this.e = interpolator;
    }

    public final void f(kwe kweVar) {
        if (this.c) {
            return;
        }
        this.b = kweVar;
    }
}
