package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kk extends im {
    final sp a;
    final Window.Callback b;
    boolean c;
    final kj d;
    private boolean e;
    private boolean f;
    private final ArrayList g = new ArrayList();
    private final Runnable h = new kf(this);
    private final zd i;

    public kk(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        kg kgVar = new kg(this);
        this.i = kgVar;
        zi ziVar = new zi(toolbar, false);
        this.a = ziVar;
        ksw.h(callback);
        this.b = callback;
        ziVar.e = callback;
        toolbar.x = kgVar;
        ziVar.w(charSequence);
        this.d = new kj(this);
    }

    public final Menu a() {
        if (!this.e) {
            sp spVar = this.a;
            kh khVar = new kh(this);
            ki kiVar = new ki(this);
            Toolbar toolbar = ((zi) spVar).a;
            toolbar.A = khVar;
            toolbar.B = kiVar;
            ActionMenuView actionMenuView = toolbar.a;
            if (actionMenuView != null) {
                actionMenuView.f(khVar, kiVar);
            }
            this.e = true;
        }
        return ((zi) this.a).a.h();
    }

    public final void b(int i, int i2) {
        sp spVar = this.a;
        spVar.k((i & i2) | (((zi) spVar).b & (~i2)));
    }

    @Override // defpackage.im
    public final boolean closeOptionsMenu() {
        return this.a.z();
    }

    @Override // defpackage.im
    public final boolean collapseActionView() {
        if (!this.a.y()) {
            return false;
        }
        this.a.f();
        return true;
    }

    @Override // defpackage.im
    public final void dispatchMenuVisibilityChanged(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            ((il) this.g.get(i)).a();
        }
    }

    @Override // defpackage.im
    public final View getCustomView() {
        return ((zi) this.a).c;
    }

    @Override // defpackage.im
    public final int getDisplayOptions() {
        return ((zi) this.a).b;
    }

    @Override // defpackage.im
    public final Context getThemedContext() {
        return this.a.b();
    }

    @Override // defpackage.im
    public final void hide() {
        this.a.u(8);
    }

    @Override // defpackage.im
    public final boolean invalidateOptionsMenu() {
        ((zi) this.a).a.removeCallbacks(this.h);
        Toolbar toolbar = ((zi) this.a).a;
        int[] iArr = kvo.a;
        toolbar.postOnAnimation(this.h);
        return true;
    }

    @Override // defpackage.im
    public final boolean isShowing() {
        return ((zi) this.a).a.getVisibility() == 0;
    }

    @Override // defpackage.im
    public final void onDestroy() {
        ((zi) this.a).a.removeCallbacks(this.h);
    }

    @Override // defpackage.im
    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        Menu a = a();
        if (a == null) {
            return false;
        }
        a.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return a.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.im
    public final boolean onMenuKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            openOptionsMenu();
        }
        return true;
    }

    @Override // defpackage.im
    public final boolean openOptionsMenu() {
        return this.a.C();
    }

    @Override // defpackage.im
    public final void setBackgroundDrawable(Drawable drawable) {
        ((zi) this.a).a.setBackground(drawable);
    }

    @Override // defpackage.im
    public final void setCustomView(int i) {
        setCustomView(LayoutInflater.from(this.a.b()).inflate(i, (ViewGroup) ((zi) this.a).a, false), new ik(-2, -2));
    }

    @Override // defpackage.im
    public final void setDisplayHomeAsUpEnabled(boolean z) {
        b(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.im
    public final void setDisplayOptions(int i) {
        b(i, -1);
    }

    @Override // defpackage.im
    public final void setDisplayShowCustomEnabled(boolean z) {
        b(true != z ? 0 : 16, 16);
    }

    @Override // defpackage.im
    public final void setDisplayShowHomeEnabled(boolean z) {
        b(2, 2);
    }

    @Override // defpackage.im
    public final void setDisplayShowTitleEnabled(boolean z) {
        b(true != z ? 0 : 8, 8);
    }

    @Override // defpackage.im
    public final void setElevation(float f) {
        Toolbar toolbar = ((zi) this.a).a;
        int[] iArr = kvo.a;
        kvd.j(toolbar, 0.0f);
    }

    @Override // defpackage.im
    public final void setHomeActionContentDescription(int i) {
        this.a.o(i);
    }

    @Override // defpackage.im
    public final void setHomeAsUpIndicator(int i) {
        this.a.q(i);
    }

    @Override // defpackage.im
    public final void setLogo(Drawable drawable) {
        this.a.l(null);
    }

    @Override // defpackage.im
    public final void setSubtitle(CharSequence charSequence) {
        this.a.s(charSequence);
    }

    @Override // defpackage.im
    public final void setTitle(int i) {
        this.a.t(this.a.b().getText(i));
    }

    @Override // defpackage.im
    public final void setWindowTitle(CharSequence charSequence) {
        this.a.w(charSequence);
    }

    @Override // defpackage.im
    public final void show() {
        this.a.u(0);
    }

    @Override // defpackage.im
    public final void setHomeActionContentDescription(CharSequence charSequence) {
        this.a.p(charSequence);
    }

    @Override // defpackage.im
    public final void setHomeAsUpIndicator(Drawable drawable) {
        this.a.r(drawable);
    }

    @Override // defpackage.im
    public final void setTitle(CharSequence charSequence) {
        this.a.t(charSequence);
    }

    @Override // defpackage.im
    public final void setCustomView(View view, ik ikVar) {
        if (view != null) {
            view.setLayoutParams(ikVar);
        }
        this.a.j(view);
    }

    @Override // defpackage.im
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // defpackage.im
    public final void setDefaultDisplayHomeAsUpEnabled(boolean z) {
    }

    @Override // defpackage.im
    public final void setShowHideAnimationEnabled(boolean z) {
    }
}
