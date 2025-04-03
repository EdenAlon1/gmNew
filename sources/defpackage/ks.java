package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ks extends im implements ph {
    private static final Interpolator s = new AccelerateInterpolator();
    private static final Interpolator t = new DecelerateInterpolator();
    private boolean A;
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    sp d;
    ActionBarContextView e;
    View f;
    kr g;
    nc h;
    nb i;
    public int j;
    public boolean k;
    boolean l;
    public boolean m;
    public nl n;
    boolean o;
    final kwe p;
    final kwe q;
    final kq r;
    private Context u;
    private boolean v;
    private boolean w;
    private final ArrayList x;
    private boolean y;
    private boolean z;

    public ks(Activity activity, boolean z) {
        new ArrayList();
        this.x = new ArrayList();
        this.j = 0;
        this.k = true;
        this.z = true;
        this.p = new ko(this);
        this.q = new kp(this);
        this.r = new kq(this);
        View decorView = activity.getWindow().getDecorView();
        e(decorView);
        if (z) {
            return;
        }
        this.f = decorView.findViewById(R.id.content);
    }

    static boolean d(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    private final void e(View view) {
        sp g;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.google.android.apps.messaging.R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((ks) actionBarOverlayLayout.h).j = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    int[] iArr = kvo.a;
                    kvb.c(actionBarOverlayLayout);
                }
            }
        }
        KeyEvent.Callback findViewById = view.findViewById(com.google.android.apps.messaging.R.id.action_bar);
        if (findViewById instanceof sp) {
            g = (sp) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
                sb.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(sb.toString());
            }
            g = ((Toolbar) findViewById).g();
        }
        this.d = g;
        this.e = (ActionBarContextView) view.findViewById(com.google.android.apps.messaging.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.google.android.apps.messaging.R.id.action_bar_container);
        this.c = actionBarContainer;
        sp spVar = this.d;
        if (spVar == null || this.e == null || actionBarContainer == null) {
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        this.a = spVar.b();
        if ((this.d.a() & 4) != 0) {
            this.v = true;
        }
        Context context = this.a;
        int i2 = context.getApplicationInfo().targetSdkVersion;
        this.d.F();
        f(na.b(context));
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, kt.a, com.google.android.apps.messaging.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
            if (!actionBarOverlayLayout2.d) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.o = true;
            actionBarOverlayLayout2.l(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private final void f(boolean z) {
        if (z) {
            this.d.E();
        } else {
            this.d.E();
        }
        this.d.D();
        this.d.G();
        this.b.e = false;
    }

    public final void a(boolean z) {
        kwd e;
        kwd b;
        if (z) {
            if (!this.y) {
                this.y = true;
                c(false);
            }
        } else if (this.y) {
            this.y = false;
            c(false);
        }
        if (!this.c.isLaidOut()) {
            if (z) {
                this.d.u(4);
                this.e.setVisibility(0);
                return;
            } else {
                this.d.u(0);
                this.e.setVisibility(8);
                return;
            }
        }
        if (z) {
            b = this.d.e(4, 100L);
            e = this.e.b(0, 200L);
        } else {
            e = this.d.e(0, 200L);
            b = this.e.b(8, 100L);
        }
        nl nlVar = new nl();
        nlVar.a.add(b);
        View view = (View) b.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) e.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        nlVar.a.add(e);
        nlVar.b();
    }

    public final void b(int i, int i2) {
        int a = this.d.a();
        if ((i2 & 4) != 0) {
            this.v = true;
        }
        this.d.k((i & i2) | ((~i2) & a));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r6) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks.c(boolean):void");
    }

    @Override // defpackage.im
    public final boolean collapseActionView() {
        sp spVar = this.d;
        if (spVar == null || !spVar.y()) {
            return false;
        }
        spVar.f();
        return true;
    }

    @Override // defpackage.im
    public final void dispatchMenuVisibilityChanged(boolean z) {
        if (z == this.w) {
            return;
        }
        this.w = z;
        int size = this.x.size();
        for (int i = 0; i < size; i++) {
            ((il) this.x.get(i)).a();
        }
    }

    @Override // defpackage.im
    public final View getCustomView() {
        return this.d.c();
    }

    @Override // defpackage.im
    public final int getDisplayOptions() {
        return this.d.a();
    }

    @Override // defpackage.im
    public final Context getThemedContext() {
        if (this.u == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.google.android.apps.messaging.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.u = new ContextThemeWrapper(this.a, i);
            } else {
                this.u = this.a;
            }
        }
        return this.u;
    }

    @Override // defpackage.im
    public final void hide() {
        if (this.l) {
            return;
        }
        this.l = true;
        c(false);
    }

    @Override // defpackage.im
    public final boolean isShowing() {
        int height = this.c.getHeight();
        if (this.z) {
            return height == 0 || this.b.a() < height;
        }
        return false;
    }

    @Override // defpackage.im
    public final void onConfigurationChanged(Configuration configuration) {
        f(na.b(this.a));
    }

    @Override // defpackage.im
    public final boolean onKeyShortcut(int i, KeyEvent keyEvent) {
        kr krVar = this.g;
        if (krVar == null) {
            return false;
        }
        int deviceId = keyEvent != null ? keyEvent.getDeviceId() : -1;
        od odVar = krVar.a;
        odVar.setQwertyMode(KeyCharacterMap.load(deviceId).getKeyboardType() != 1);
        return odVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.im
    public final void setBackgroundDrawable(Drawable drawable) {
        ActionBarContainer actionBarContainer = this.c;
        Drawable drawable2 = actionBarContainer.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            actionBarContainer.unscheduleDrawable(actionBarContainer.b);
        }
        actionBarContainer.b = drawable;
        drawable.setCallback(actionBarContainer);
        boolean z = false;
        if (actionBarContainer.a != null) {
            drawable.setBounds(0, 0, actionBarContainer.getMeasuredWidth(), actionBarContainer.getMeasuredHeight());
        }
        if (!actionBarContainer.e ? !(actionBarContainer.b != null || actionBarContainer.c != null) : actionBarContainer.d == null) {
            z = true;
        }
        actionBarContainer.setWillNotDraw(z);
        actionBarContainer.invalidate();
        actionBarContainer.invalidateOutline();
    }

    @Override // defpackage.im
    public final void setCustomView(int i) {
        this.d.j(LayoutInflater.from(getThemedContext()).inflate(i, this.d.d(), false));
    }

    @Override // defpackage.im
    public final void setDefaultDisplayHomeAsUpEnabled(boolean z) {
        if (this.v) {
            return;
        }
        setDisplayHomeAsUpEnabled(z);
    }

    @Override // defpackage.im
    public final void setDisplayHomeAsUpEnabled(boolean z) {
        b(true != z ? 0 : 4, 4);
    }

    @Override // defpackage.im
    public final void setDisplayOptions(int i) {
        if ((i & 4) != 0) {
            this.v = true;
        }
        this.d.k(i);
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
        ActionBarContainer actionBarContainer = this.c;
        int[] iArr = kvo.a;
        kvd.j(actionBarContainer, f);
    }

    @Override // defpackage.im
    public final void setHomeActionContentDescription(int i) {
        this.d.o(i);
    }

    @Override // defpackage.im
    public final void setHomeAsUpIndicator(int i) {
        this.d.q(i);
    }

    @Override // defpackage.im
    public final void setLogo(Drawable drawable) {
        this.d.l(null);
    }

    @Override // defpackage.im
    public final void setShowHideAnimationEnabled(boolean z) {
        nl nlVar;
        this.A = z;
        if (z || (nlVar = this.n) == null) {
            return;
        }
        nlVar.a();
    }

    @Override // defpackage.im
    public final void setSubtitle(CharSequence charSequence) {
        this.d.s(charSequence);
    }

    @Override // defpackage.im
    public final void setTitle(int i) {
        setTitle(this.a.getString(i));
    }

    @Override // defpackage.im
    public final void setWindowTitle(CharSequence charSequence) {
        this.d.w(charSequence);
    }

    @Override // defpackage.im
    public final void show() {
        if (this.l) {
            this.l = false;
            c(false);
        }
    }

    @Override // defpackage.im
    public final nc startActionMode(nb nbVar) {
        kr krVar = this.g;
        if (krVar != null) {
            krVar.f();
        }
        this.b.l(false);
        this.e.i();
        kr krVar2 = new kr(this, this.e.getContext(), nbVar);
        krVar2.a.s();
        try {
            if (!krVar2.b.c(krVar2, krVar2.a)) {
                return null;
            }
            this.g = krVar2;
            krVar2.g();
            this.e.h(krVar2);
            a(true);
            return krVar2;
        } finally {
            krVar2.a.r();
        }
    }

    @Override // defpackage.im
    public final void setHomeActionContentDescription(CharSequence charSequence) {
        this.d.p(charSequence);
    }

    @Override // defpackage.im
    public final void setHomeAsUpIndicator(Drawable drawable) {
        this.d.r(drawable);
    }

    @Override // defpackage.im
    public final void setTitle(CharSequence charSequence) {
        this.d.t(charSequence);
    }

    @Override // defpackage.im
    public final void setCustomView(View view, ik ikVar) {
        view.setLayoutParams(ikVar);
        this.d.j(view);
    }

    public ks(Dialog dialog) {
        new ArrayList();
        this.x = new ArrayList();
        this.j = 0;
        this.k = true;
        this.z = true;
        this.p = new ko(this);
        this.q = new kp(this);
        this.r = new kq(this);
        e(dialog.getWindow().getDecorView());
    }
}
