package defpackage;

import android.content.Context;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ne extends nc implements ob {
    public final od a;
    private final Context b;
    private final ActionBarContextView c;
    private final nb f;
    private WeakReference g;
    private boolean h;

    public ne(Context context, ActionBarContextView actionBarContextView, nb nbVar) {
        this.b = context;
        this.c = actionBarContextView;
        this.f = nbVar;
        od odVar = new od(actionBarContextView.getContext());
        odVar.D();
        this.a = odVar;
        odVar.b = this;
    }

    @Override // defpackage.ob
    public final void H(od odVar) {
        g();
        this.c.n();
    }

    @Override // defpackage.ob
    public final boolean L(od odVar, MenuItem menuItem) {
        return this.f.b(this, menuItem);
    }

    @Override // defpackage.nc
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.nc
    public final MenuInflater b() {
        return new nj(this.c.getContext());
    }

    @Override // defpackage.nc
    public final View c() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.nc
    public final CharSequence d() {
        return this.c.h;
    }

    @Override // defpackage.nc
    public final CharSequence e() {
        return this.c.g;
    }

    @Override // defpackage.nc
    public final void f() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f.a(this);
    }

    @Override // defpackage.nc
    public final void g() {
        this.f.d(this, this.a);
    }

    @Override // defpackage.nc
    public final void h(View view) {
        this.c.j(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.nc
    public final void i(int i) {
        j(this.b.getString(i));
    }

    @Override // defpackage.nc
    public final void j(CharSequence charSequence) {
        this.c.k(charSequence);
    }

    @Override // defpackage.nc
    public final void k(int i) {
        l(this.b.getString(i));
    }

    @Override // defpackage.nc
    public final void l(CharSequence charSequence) {
        this.c.l(charSequence);
    }

    @Override // defpackage.nc
    public final void m(boolean z) {
        this.e = z;
        this.c.m(z);
    }

    @Override // defpackage.nc
    public final boolean n() {
        return this.c.j;
    }
}
