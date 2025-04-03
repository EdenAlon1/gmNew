package defpackage;

import android.app.Activity;
import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxy {
    private final dvzc a;

    public dvxy(dvzc dvzcVar) {
        this.a = dvzcVar;
    }

    public static final void g(Activity activity) {
        efbd.c();
        dvxe c = dvxv.c(dvxv.a(activity));
        if (c != null) {
            new dvxx().b(c);
        } else if (Log.isLoggable("GIL", 3)) {
            Log.d("GIL", "Not resetting VE state (no root CVE)");
        }
    }

    @Deprecated
    public final dvwz a(int i) {
        return new dvwz(dvxd.a(i), new emwl() { // from class: dvxw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                throw new UnsupportedOperationException("Do not call attach()");
            }
        }, this.a, this);
    }

    public final dvxe b(View view, dvwz dvwzVar) {
        efbd.c();
        dvxe e = dvwzVar.e(this.a);
        dvxe c = dvxv.c(view);
        if (c == null) {
            dvxv.s(view, e);
            return e;
        }
        if (!c.e()) {
            c.d(e);
            return c;
        }
        if (c.f()) {
            this.a.d(new IllegalStateException("CVE is already impressed and cannot be replaced."));
            return c;
        }
        this.a.d(new IllegalStateException("CVE is already attached and cannot be replaced."));
        return c;
    }

    public final void c(View view) {
        efbd.c();
        dvxe c = dvxv.c(view);
        if (c == null) {
            this.a.d(new NullPointerException("Tried to unbind a view without an associated CVE. This indicates a GIL instrumentation error. Is `ViewVisualElements#unbind` being invoked unconditionally when `ViewVisualElements#bind` is invoked conditionally?"));
        } else {
            c.c();
        }
    }

    public final void d(View view, dvwz dvwzVar) {
        dvxe c = dvxv.c(view);
        if (c == null) {
            b(view, dvwzVar);
            return;
        }
        if (c.a().h != ((dvxr) dvwzVar.a.instance).h) {
            throw new IllegalArgumentException("Disallowed Difference in CVE");
        }
        if (c.a().g != ((dvxr) dvwzVar.a.instance).g) {
            if (Log.isLoggable("GIL", 3)) {
                Log.d("GIL", "Resetting impression for: ".concat(c.toString()));
            }
            new dvyb(c.e.e()).b(c);
            c.b();
            c.d(dvwzVar.e(this.a));
        }
    }

    public final void e(View view, dvwz dvwzVar) {
        if (dvxv.c(view) == null) {
            b(view, dvwzVar);
        }
    }

    public final void f(Activity activity, dvwz dvwzVar) {
        b(dvxv.a(activity), dvwzVar);
    }
}
