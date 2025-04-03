package defpackage;

import android.app.Fragment;
import android.app.assist.AssistContent;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class efac extends iy {
    protected final efak U = new efak();
    private int su;

    private final void B() {
        this.su--;
    }

    private final void C() {
        int i = this.su;
        this.su = i + 1;
        if (i == 0) {
            this.U.w();
        }
    }

    @Override // defpackage.iy, defpackage.hl, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.U.m() || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        this.U.a();
        super.finish();
    }

    @Override // android.app.Activity
    public final void finishAfterTransition() {
        this.U.b();
        super.finishAfterTransition();
    }

    @Override // defpackage.eg
    public void h(ea eaVar) {
        this.U.R();
    }

    @Override // defpackage.iy, defpackage.iz
    public final void hs() {
        int i = 0;
        while (true) {
            efak efakVar = this.U;
            if (i >= efakVar.a.size()) {
                return;
            }
            efaa efaaVar = (efaa) efakVar.a.get(i);
            if (efaaVar instanceof efaj) {
                ((efaj) efaaVar).a();
            }
            i++;
        }
    }

    @Override // defpackage.iy, defpackage.iz
    public final void m(nc ncVar) {
        if (ncVar == null) {
            return;
        }
        int i = 0;
        while (true) {
            efak efakVar = this.U;
            if (i >= efakVar.a.size()) {
                return;
            }
            efaa efaaVar = (efaa) efakVar.a.get(i);
            if (efaaVar instanceof efai) {
                ((efai) efaaVar).a();
            }
            i++;
        }
    }

    @Override // android.app.Activity
    public final void onActivityReenter(int i, Intent intent) {
        this.U.n();
        super.onActivityReenter(i, intent);
    }

    @Override // defpackage.eg, defpackage.abe, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.U.J();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        this.U.c();
        super.onAttachedToWindow();
    }

    @Override // defpackage.abe, android.app.Activity
    public void onBackPressed() {
        if (this.U.l()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.iy, defpackage.abe, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.U.K();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem) {
        return this.U.L() || super.onContextItemSelected(menuItem);
    }

    @Override // defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.U.x(bundle);
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.U.M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return this.U.N() || super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected void onDestroy() {
        this.U.d();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.U.e();
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        this.U.o(consumer);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.U.p() || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.U.q() || super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.U.y();
        super.onLowMemory();
    }

    @Override // defpackage.abe, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.U.r();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.U.O() || super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onPause() {
        this.U.f();
        super.onPause();
    }

    @Override // android.app.Activity
    public void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        this.U.s();
    }

    @Override // defpackage.iy, android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        this.U.g(bundle);
        super.onPostCreate(bundle);
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected void onPostResume() {
        this.U.h();
        super.onPostResume();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.U.P() || super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public void onProvideAssistContent(AssistContent assistContent) {
        this.U.t();
        super.onProvideAssistContent(assistContent);
    }

    @Override // android.app.Activity
    public final void onProvideAssistData(Bundle bundle) {
        this.U.u();
        super.onProvideAssistData(bundle);
    }

    @Override // defpackage.eg, defpackage.abe, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.U.Q();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        this.U.i(bundle);
        super.onRestoreInstanceState(bundle);
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onResume() {
        efal.a(a());
        this.U.z();
        super.onResume();
    }

    @Override // defpackage.abe, defpackage.hl, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.U.A(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected void onStart() {
        efal.a(a());
        this.U.B();
        super.onStart();
    }

    @Override // defpackage.iy, defpackage.eg, android.app.Activity
    protected void onStop() {
        this.U.C();
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onTopResumedActivityChanged(boolean z) {
        this.U.D(z);
        super.onTopResumedActivityChanged(z);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        this.U.j();
        super.onUserInteraction();
    }

    @Override // defpackage.abe, android.app.Activity
    protected final void onUserLeaveHint() {
        this.U.k();
        super.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        this.U.v();
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        C();
        super.startActivity(intent);
        B();
    }

    @Override // defpackage.abe, android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        C();
        super.startActivityForResult(intent, i);
        B();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        C();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        B();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        C();
        super.startActivity(intent, bundle);
        B();
    }

    @Override // defpackage.abe, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        C();
        super.startActivityForResult(intent, i, bundle);
        B();
    }
}
