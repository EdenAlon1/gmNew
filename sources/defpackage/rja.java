package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class rja extends rik {
    protected final View a;
    public final riz b;

    public rja(View view) {
        rkf.f(view);
        this.a = view;
        this.b = new riz(view);
    }

    @Override // defpackage.rik, defpackage.rix
    public final rib d() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof rib) {
            return (rib) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.rix
    public final void e(riw riwVar) {
        riz rizVar = this.b;
        int b = rizVar.b();
        int a = rizVar.a();
        if (riz.d(b, a)) {
            riwVar.g(b, a);
            return;
        }
        if (!rizVar.c.contains(riwVar)) {
            rizVar.c.add(riwVar);
        }
        if (rizVar.e == null) {
            ViewTreeObserver viewTreeObserver = rizVar.b.getViewTreeObserver();
            rizVar.e = new riy(rizVar);
            viewTreeObserver.addOnPreDrawListener(rizVar.e);
        }
    }

    @Override // defpackage.rix
    public final void h(riw riwVar) {
        this.b.c.remove(riwVar);
    }

    @Override // defpackage.rik, defpackage.rix
    public final void i(rib ribVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, ribVar);
    }

    public final void l() {
        this.b.d = true;
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }
}
