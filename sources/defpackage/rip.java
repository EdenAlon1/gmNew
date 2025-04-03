package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rip implements rix {
    protected final View a;
    private final rio b;

    public rip(View view) {
        rkf.f(view);
        this.a = view;
        this.b = new rio(view);
    }

    protected abstract void b(Drawable drawable);

    @Override // defpackage.rix
    public final rib d() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof rib) {
            return (rib) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // defpackage.rix
    public final void e(riw riwVar) {
        rio rioVar = this.b;
        int b = rioVar.b();
        int a = rioVar.a();
        if (rio.d(b, a)) {
            riwVar.g(b, a);
            return;
        }
        if (!rioVar.c.contains(riwVar)) {
            rioVar.c.add(riwVar);
        }
        if (rioVar.d == null) {
            ViewTreeObserver viewTreeObserver = rioVar.b.getViewTreeObserver();
            rioVar.d = new rin(rioVar);
            viewTreeObserver.addOnPreDrawListener(rioVar.d);
        }
    }

    @Override // defpackage.rix
    public final void f(Drawable drawable) {
        this.b.c();
        b(drawable);
    }

    @Override // defpackage.rix
    public final void g(Drawable drawable) {
        j(drawable);
    }

    @Override // defpackage.rix
    public final void h(riw riwVar) {
        this.b.c.remove(riwVar);
    }

    @Override // defpackage.rix
    public final void i(rib ribVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, ribVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }

    @Override // defpackage.rgu
    public final void m() {
    }

    @Override // defpackage.rgu
    public final void n() {
    }

    @Override // defpackage.rgu
    public final void o() {
    }

    protected void j(Drawable drawable) {
    }
}
