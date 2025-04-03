package defpackage;

import android.app.Fragment;
import android.app.assist.AssistContent;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.ActionMode;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class efag extends eg {
    private int n;
    protected final efak o = new efak();

    private final void j() {
        this.n--;
    }

    private final void k() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.o.w();
        }
    }

    @Override // defpackage.hl, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.o.m() || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void finish() {
        this.o.a();
        super.finish();
    }

    @Override // android.app.Activity
    public final void finishAfterTransition() {
        this.o.b();
        super.finishAfterTransition();
    }

    @Override // defpackage.eg
    public final void h(ea eaVar) {
        this.o.R();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        efak efakVar = this.o;
        for (int i = 0; i < efakVar.a.size(); i++) {
            efaa efaaVar = (efaa) efakVar.a.get(i);
            if (efaaVar instanceof eexo) {
                ((eexo) efaaVar).a();
            }
        }
        super.onActionModeFinished(actionMode);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        efak efakVar = this.o;
        for (int i = 0; i < efakVar.a.size(); i++) {
            efaa efaaVar = (efaa) efakVar.a.get(i);
            if (efaaVar instanceof eexp) {
                ((eexp) efaaVar).a();
            }
        }
        super.onActionModeStarted(actionMode);
    }

    @Override // android.app.Activity
    public final void onActivityReenter(int i, Intent intent) {
        this.o.n();
        super.onActivityReenter(i, intent);
    }

    @Override // defpackage.eg, defpackage.abe, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.o.J();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        this.o.c();
        super.onAttachedToWindow();
    }

    @Override // defpackage.abe, android.app.Activity
    public void onBackPressed() {
        if (this.o.l()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.abe, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.o.K();
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem) {
        return this.o.L() || super.onContextItemSelected(menuItem);
    }

    @Override // defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.o.x(bundle);
        super.onCreate(bundle);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.o.M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        return this.o.N() || super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onDestroy() {
        this.o.d();
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.o.e();
        super.onDetachedFromWindow();
    }

    @Override // android.app.Activity
    public void onGetDirectActions(CancellationSignal cancellationSignal, Consumer consumer) {
        this.o.o(consumer);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.o.p() || super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.o.q() || super.onKeyUp(i, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.o.y();
        super.onLowMemory();
    }

    @Override // defpackage.abe, android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.o.r();
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return this.o.O() || super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onPause() {
        this.o.f();
        super.onPause();
    }

    @Override // android.app.Activity
    public void onPerformDirectAction(String str, Bundle bundle, CancellationSignal cancellationSignal, Consumer consumer) {
        this.o.s();
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        this.o.g(bundle);
        super.onPostCreate(bundle);
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onPostResume() {
        this.o.h();
        super.onPostResume();
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        return this.o.P() || super.onPrepareOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        this.o.t();
        super.onProvideAssistContent(assistContent);
    }

    @Override // android.app.Activity
    public final void onProvideAssistData(Bundle bundle) {
        this.o.u();
        super.onProvideAssistData(bundle);
    }

    @Override // defpackage.eg, defpackage.abe, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.o.Q();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        this.o.i(bundle);
        super.onRestoreInstanceState(bundle);
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onResume() {
        efal.a(a());
        this.o.z();
        super.onResume();
    }

    @Override // defpackage.abe, defpackage.hl, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.o.A(bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onStart() {
        efal.a(a());
        this.o.B();
        super.onStart();
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onStop() {
        this.o.C();
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onTopResumedActivityChanged(boolean z) {
        this.o.D(z);
        super.onTopResumedActivityChanged(z);
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        this.o.j();
        super.onUserInteraction();
    }

    @Override // defpackage.abe, android.app.Activity
    protected final void onUserLeaveHint() {
        this.o.k();
        super.onUserLeaveHint();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        this.o.v();
        super.onWindowFocusChanged(z);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        k();
        super.startActivity(intent);
        j();
    }

    @Override // defpackage.abe, android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        k();
        super.startActivityForResult(intent, i);
        j();
    }

    @Override // android.app.Activity
    public final void startActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        k();
        super.startActivityFromFragment(fragment, intent, i, bundle);
        j();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent, Bundle bundle) {
        k();
        super.startActivity(intent, bundle);
        j();
    }

    @Override // defpackage.abe, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        k();
        super.startActivityForResult(intent, i, bundle);
        j();
    }
}
