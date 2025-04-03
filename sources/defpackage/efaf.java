package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class efaf extends ea {
    protected final eezc b = new eezc();

    @Override // defpackage.ea
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.b.g(bundle);
        return super.M(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.ea
    public final void aC(boolean z) {
        this.b.h(z);
        super.aC(z);
    }

    @Override // defpackage.ea
    public final boolean aL(MenuItem menuItem) {
        return this.b.L();
    }

    @Override // defpackage.ea
    public boolean aM(MenuItem menuItem) {
        return this.b.O();
    }

    @Override // defpackage.ea
    public final void aS() {
        this.b.Q();
    }

    @Override // defpackage.ea
    public void ae(Bundle bundle) {
        this.b.a(bundle);
        super.ae(bundle);
    }

    @Override // defpackage.ea
    public void af(int i, int i2, Intent intent) {
        super.af(i, i2, intent);
        this.b.J();
    }

    @Override // defpackage.ea
    public void ag(Activity activity) {
        this.b.j();
        super.ag(activity);
    }

    @Override // defpackage.ea
    public void ah(Menu menu, MenuInflater menuInflater) {
        if (this.b.N()) {
            av(true);
        }
    }

    @Override // defpackage.ea
    public void ai() {
        this.b.d();
        super.ai();
    }

    @Override // defpackage.ea
    public void am() {
        this.b.f();
        super.am();
    }

    @Override // defpackage.ea
    public void an(Menu menu) {
        if (this.b.P()) {
            av(true);
        }
    }

    @Override // defpackage.ea
    public void ao() {
        this.b.z();
        super.ao();
    }

    @Override // defpackage.ea
    public void ap(View view, Bundle bundle) {
        this.b.k(bundle);
    }

    @Override // defpackage.ea
    public void h(Bundle bundle) {
        this.b.x(bundle);
        super.h(bundle);
    }

    @Override // defpackage.ea
    public void i() {
        this.b.b();
        super.i();
    }

    @Override // defpackage.ea
    public void j() {
        this.b.c();
        super.j();
    }

    @Override // defpackage.ea
    public void k(Bundle bundle) {
        this.b.A(bundle);
    }

    @Override // defpackage.ea
    public void l() {
        this.b.B();
        super.l();
    }

    @Override // defpackage.ea
    public void m() {
        this.b.C();
        super.m();
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.b.K();
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.ea, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.b.M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.b.y();
        super.onLowMemory();
    }
}
