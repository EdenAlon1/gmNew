package defpackage;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwpu extends ActionMode {
    public CharSequence a;
    public View b;
    public final ActionMode.Callback c;
    final /* synthetic */ cwpv d;
    private CharSequence e;

    public cwpu(cwpv cwpvVar, ActionMode.Callback callback) {
        this.d = cwpvVar;
        this.c = callback;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.d.p = null;
        this.c.onDestroyActionMode(this);
        this.d.o();
        this.d.Z();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b;
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return this.d.q;
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.d.getMenuInflater();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.e;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.a;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.d.Z();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b = view;
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.e = charSequence;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.e = this.d.getResources().getString(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.a = this.d.getResources().getString(i);
    }
}
