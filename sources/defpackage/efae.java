package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
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
public class efae extends dn {
    protected final eezc ah = new eezc();

    @Override // defpackage.ea
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ah.g(bundle);
        return super.M(layoutInflater, viewGroup, bundle);
    }

    @Override // defpackage.ea
    public final void aC(boolean z) {
        this.ah.h(z);
        super.aC(z);
    }

    @Override // defpackage.ea
    public final boolean aL(MenuItem menuItem) {
        return this.ah.L();
    }

    @Override // defpackage.ea
    public boolean aM(MenuItem menuItem) {
        return this.ah.O();
    }

    @Override // defpackage.ea
    public final void aS() {
        this.ah.Q();
    }

    @Override // defpackage.ea
    public void ae(Bundle bundle) {
        this.ah.a(bundle);
        super.ae(bundle);
    }

    @Override // defpackage.ea
    public void af(int i, int i2, Intent intent) {
        super.af(i, i2, intent);
        this.ah.J();
    }

    @Override // defpackage.ea
    public void ag(Activity activity) {
        this.ah.j();
        super.ag(activity);
    }

    @Override // defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        if (this.ah.N()) {
            av(true);
        }
    }

    @Override // defpackage.ea
    public void ai() {
        this.ah.d();
        super.ai();
    }

    @Override // defpackage.ea
    public void am() {
        this.ah.f();
        super.am();
    }

    @Override // defpackage.ea
    public final void an(Menu menu) {
        if (this.ah.P()) {
            av(true);
        }
    }

    @Override // defpackage.ea
    public void ao() {
        efal.a(I());
        this.ah.z();
        super.ao();
    }

    @Override // defpackage.ea
    public void ap(View view, Bundle bundle) {
        this.ah.k(bundle);
    }

    @Override // defpackage.dn, defpackage.ea
    public void h(Bundle bundle) {
        this.ah.x(bundle);
        super.h(bundle);
    }

    @Override // defpackage.dn
    public void hw() {
        this.ah.e();
        super.hw();
    }

    @Override // defpackage.dn, defpackage.ea
    public void i() {
        this.ah.b();
        super.i();
    }

    @Override // defpackage.dn, defpackage.ea
    public void j() {
        this.ah.c();
        super.j();
    }

    @Override // defpackage.dn, defpackage.ea
    public void k(Bundle bundle) {
        this.ah.A(bundle);
        super.k(bundle);
    }

    @Override // defpackage.dn, defpackage.ea
    public void l() {
        efal.a(I());
        this.ah.B();
        super.l();
    }

    @Override // defpackage.dn, defpackage.ea
    public void m() {
        this.ah.C();
        super.m();
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.ah.K();
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.ea, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.ah.M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.ah.e();
        super.onDismiss(dialogInterface);
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.ah.y();
        super.onLowMemory();
    }
}
