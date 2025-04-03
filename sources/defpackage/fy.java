package defpackage;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class fy extends pco {
    private final fr a;
    private gg b = null;
    private ea c = null;
    private boolean d;

    @Deprecated
    public fy(fr frVar) {
        this.a = frVar;
    }

    private static String m(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }

    @Override // defpackage.pco
    public final Parcelable a() {
        return null;
    }

    public abstract ea b(int i);

    @Override // defpackage.pco
    public final Object c(ViewGroup viewGroup, int i) {
        if (this.b == null) {
            this.b = new cg(this.a);
        }
        long j = i;
        ea h = this.a.h(m(viewGroup.getId(), j));
        if (h != null) {
            this.b.r(new gf(7, h));
        } else {
            h = b(i);
            this.b.t(viewGroup.getId(), h, m(viewGroup.getId(), j));
        }
        if (h != this.c) {
            h.ax(false);
            h.aC(false);
        }
        return h;
    }

    @Override // defpackage.pco
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        ea eaVar = (ea) obj;
        if (this.b == null) {
            this.b = new cg(this.a);
        }
        gg ggVar = this.b;
        fr frVar = eaVar.B;
        if (frVar != null && frVar != ((cg) ggVar).a) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + eaVar.toString() + " is already attached to a FragmentManager.");
        }
        ggVar.r(new gf(6, eaVar));
        if (eaVar.equals(this.c)) {
            this.c = null;
        }
    }

    @Override // defpackage.pco
    public void f(ViewGroup viewGroup, int i, Object obj) {
        ea eaVar = (ea) obj;
        ea eaVar2 = this.c;
        if (eaVar != eaVar2) {
            if (eaVar2 != null) {
                eaVar2.ax(false);
                this.c.aC(false);
            }
            eaVar.ax(true);
            eaVar.aC(true);
            this.c = eaVar;
        }
    }

    @Override // defpackage.pco
    public final void g(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException(a.i(this, "ViewPager with adapter ", " requires a view id"));
        }
    }

    @Override // defpackage.pco
    public final boolean h(View view, Object obj) {
        return ((ea) obj).Q == view;
    }

    @Override // defpackage.pco
    public final void i() {
        gg ggVar = this.b;
        if (ggVar != null) {
            if (!this.d) {
                try {
                    this.d = true;
                    ggVar.d();
                } finally {
                    this.d = false;
                }
            }
            this.b = null;
        }
    }

    @Override // defpackage.pco
    public final void e(Parcelable parcelable, ClassLoader classLoader) {
    }
}
