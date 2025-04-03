package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iy extends eg implements iz, knw {
    private je sv;

    public iy() {
        U().b("androidx:appcompat", new iw(this));
        y(new ix(this));
    }

    private final void fb() {
        lmz.b(getWindow().getDecorView(), this);
        lna.b(getWindow().getDecorView(), this);
        oxa.b(getWindow().getDecorView(), this);
        aci.a(getWindow().getDecorView(), this);
    }

    @Override // defpackage.abe, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        fb();
        l().d(view, layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a8, code lost:
    
        if (r5 != null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b9, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void attachBaseContext(final android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        im k = k();
        if (getWindow().hasFeature(0)) {
            if (k == null || !k.closeOptionsMenu()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // defpackage.hl, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        im k = k();
        if (keyCode == 82 && k != null && k.onMenuKeyEvent(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        return l().c(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        jz jzVar = (jz) l();
        if (jzVar.p == null) {
            jzVar.G();
            im imVar = jzVar.o;
            jzVar.p = new nj(imVar != null ? imVar.getThemedContext() : jzVar.k);
        }
        return jzVar.p;
    }

    public boolean hq() {
        Intent a = klr.a(this);
        if (a == null) {
            return false;
        }
        if (!shouldUpRecreateTask(a)) {
            navigateUpTo(a);
            return true;
        }
        knx knxVar = new knx(this);
        Intent j = j();
        if (j == null) {
            j = klr.a(this);
        }
        if (j != null) {
            ComponentName component = j.getComponent();
            if (component == null) {
                component = j.resolveActivity(knxVar.a.getPackageManager());
            }
            knxVar.f(component);
            knxVar.d(j);
        }
        knxVar.b();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public final jl hr() {
        return new jl((jz) l());
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        l().f();
    }

    @Override // defpackage.knw
    public final Intent j() {
        return klr.a(this);
    }

    public im k() {
        return l().b();
    }

    public final je l() {
        if (this.sv == null) {
            int i = je.b;
            this.sv = new jz(this, null, this, this);
        }
        return this.sv;
    }

    public void n(Toolbar toolbar) {
        jz jzVar = (jz) l();
        if (jzVar.j instanceof Activity) {
            im b = jzVar.b();
            if (b instanceof ks) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            jzVar.p = null;
            if (b != null) {
                b.onDestroy();
            }
            jzVar.o = null;
            if (toolbar != null) {
                kk kkVar = new kk(toolbar, jzVar.z(), jzVar.m);
                jzVar.o = kkVar;
                jzVar.m.d = kkVar.d;
                if (!toolbar.C) {
                    toolbar.C = true;
                    toolbar.z();
                }
            } else {
                jzVar.m.d = null;
            }
            jzVar.f();
        }
    }

    public final void o() {
        l().f();
    }

    @Override // defpackage.abe, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        im b;
        super.onConfigurationChanged(configuration);
        jz jzVar = (jz) l();
        if (jzVar.A && jzVar.x && (b = jzVar.b()) != null) {
            b.onConfigurationChanged(configuration);
        }
        qu.d().e(jzVar.k);
        jzVar.I = new Configuration(jzVar.k.getResources().getConfiguration());
        jzVar.R(false, false);
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        l().g();
    }

    @Override // defpackage.eg, defpackage.abe, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        im k = k();
        if (menuItem.getItemId() != 16908332 || k == null || (k.getDisplayOptions() & 4) == 0) {
            return false;
        }
        return hq();
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((jz) l()).F();
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        im b = ((jz) l()).b();
        if (b != null) {
            b.setShowHideAnimationEnabled(true);
        }
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onStart() {
        super.onStart();
        ((jz) l()).R(true, false);
    }

    @Override // defpackage.eg, android.app.Activity
    protected void onStop() {
        super.onStop();
        l().h();
    }

    @Override // android.app.Activity
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        l().n(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        im k = k();
        if (getWindow().hasFeature(0)) {
            if (k == null || !k.openOptionsMenu()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // defpackage.abe, android.app.Activity
    public void setContentView(int i) {
        fb();
        l().j(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((jz) l()).J = i;
    }

    @Override // defpackage.abe, android.app.Activity
    public final void setContentView(View view) {
        fb();
        l().k(view);
    }

    @Override // defpackage.abe, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        fb();
        l().l(view, layoutParams);
    }

    public void hs() {
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    protected void r() {
    }

    protected void s() {
    }

    public void m(nc ncVar) {
    }
}
