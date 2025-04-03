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
public class efam extends ehbo {
    protected final eezc ap = new eezc();

    @Override // defpackage.ea
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ap.g(bundle);
        return super.M(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.ea
    public final void aC(boolean z) {
        this.ap.h(z);
        super.aC(z);
    }

    @Override // defpackage.ea
    public final boolean aL(MenuItem menuItem) {
        return this.ap.L();
    }

    @Override // defpackage.ea
    public boolean aM(MenuItem menuItem) {
        return this.ap.O();
    }

    @Override // defpackage.ea
    public final void aS() {
        this.ap.Q();
    }

    @Override // defpackage.ea
    public void ae(Bundle bundle) {
        this.ap.a(bundle);
        super.ae(bundle);
    }

    @Override // defpackage.ea
    public void af(int i, int i2, Intent intent) {
        this.ap.J();
        super.af(i, i2, intent);
    }

    @Override // defpackage.ea
    public void ag(Activity activity) {
        this.ap.j();
        super.ag(activity);
    }

    @Override // defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        if (this.ap.N()) {
            av(true);
        }
    }

    @Override // defpackage.ea
    public void ai() {
        this.ap.d();
        super.ai();
    }

    @Override // defpackage.ea
    public void am() {
        this.ap.f();
        super.am();
    }

    @Override // defpackage.ea
    public final void an(Menu menu) {
        if (this.ap.P()) {
            av(true);
        }
    }

    @Override // defpackage.ea
    public void ao() {
        efal.a(I());
        this.ap.z();
        super.ao();
    }

    @Override // defpackage.ea
    public void ap(View view, Bundle bundle) {
        this.ap.k(bundle);
    }

    @Override // defpackage.dn, defpackage.ea
    public void h(Bundle bundle) {
        this.ap.x(bundle);
        super.h(bundle);
    }

    @Override // defpackage.dn, defpackage.ea
    public void i() {
        this.ap.b();
        super.i();
    }

    @Override // defpackage.dn, defpackage.ea
    public void j() {
        this.ap.c();
        super.j();
    }

    @Override // defpackage.dn, defpackage.ea
    public void k(Bundle bundle) {
        this.ap.A(bundle);
        super.k(bundle);
    }

    @Override // defpackage.dn, defpackage.ea
    public void l() {
        efal.a(I());
        this.ap.B();
        super.l();
    }

    @Override // defpackage.dn, defpackage.ea
    public void m() {
        this.ap.C();
        super.m();
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.ap.K();
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.ea, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.ap.M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.ap.y();
        super.onLowMemory();
    }
}
