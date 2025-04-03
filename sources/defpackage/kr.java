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
public final class kr extends nc implements ob {
    public final od a;
    public nb b;
    final /* synthetic */ ks c;
    private final Context f;
    private WeakReference g;

    public kr(ks ksVar, Context context, nb nbVar) {
        this.c = ksVar;
        this.f = context;
        this.b = nbVar;
        od odVar = new od(context);
        odVar.D();
        this.a = odVar;
        odVar.b = this;
    }

    @Override // defpackage.ob
    public final void H(od odVar) {
        if (this.b == null) {
            return;
        }
        g();
        this.c.e.n();
    }

    @Override // defpackage.ob
    public final boolean L(od odVar, MenuItem menuItem) {
        nb nbVar = this.b;
        if (nbVar != null) {
            return nbVar.b(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.nc
    public final Menu a() {
        return this.a;
    }

    @Override // defpackage.nc
    public final MenuInflater b() {
        return new nj(this.f);
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
        return this.c.e.h;
    }

    @Override // defpackage.nc
    public final CharSequence e() {
        return this.c.e.g;
    }

    @Override // defpackage.nc
    public final void f() {
        ks ksVar = this.c;
        if (ksVar.g != this) {
            return;
        }
        if (ks.d(ksVar.l, ksVar.m, false)) {
            this.b.a(this);
        } else {
            ksVar.h = this;
            ksVar.i = this.b;
        }
        this.b = null;
        this.c.a(false);
        ActionBarContextView actionBarContextView = this.c.e;
        if (actionBarContextView.i == null) {
            actionBarContextView.i();
        }
        ks ksVar2 = this.c;
        ksVar2.b.l(ksVar2.o);
        this.c.g = null;
    }

    @Override // defpackage.nc
    public final void g() {
        if (this.c.g != this) {
            return;
        }
        this.a.s();
        try {
            this.b.d(this, this.a);
        } finally {
            this.a.r();
        }
    }

    @Override // defpackage.nc
    public final void h(View view) {
        this.c.e.j(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.nc
    public final void i(int i) {
        j(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.nc
    public final void j(CharSequence charSequence) {
        this.c.e.k(charSequence);
    }

    @Override // defpackage.nc
    public final void k(int i) {
        l(this.c.a.getResources().getString(i));
    }

    @Override // defpackage.nc
    public final void l(CharSequence charSequence) {
        this.c.e.l(charSequence);
    }

    @Override // defpackage.nc
    public final void m(boolean z) {
        this.e = z;
        this.c.e.m(z);
    }

    @Override // defpackage.nc
    public final boolean n() {
        return this.c.e.j;
    }
}
