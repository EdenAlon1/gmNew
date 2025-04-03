package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ViewStubCompat;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jr extends nm {
    public boolean a;
    public boolean b;
    final /* synthetic */ jz c;
    public kj d;
    private boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(jz jzVar, Window.Callback callback) {
        super(callback);
        this.c = jzVar;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f = true;
            callback.onContentChanged();
        } finally {
            this.f = false;
        }
    }

    @Override // defpackage.nm, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.a ? this.e.dispatchKeyEvent(keyEvent) : this.c.J(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.nm, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyShortcutEvent(keyEvent)) {
            jz jzVar = this.c;
            int keyCode = keyEvent.getKeyCode();
            im b = jzVar.b();
            if (b == null || !b.onKeyShortcut(keyCode, keyEvent)) {
                jx jxVar = jzVar.F;
                if (jxVar == null || !jzVar.Q(jxVar, keyEvent.getKeyCode(), keyEvent)) {
                    if (jzVar.F == null) {
                        jx P = jzVar.P(0);
                        jzVar.M(P, keyEvent);
                        boolean Q = jzVar.Q(P, keyEvent.getKeyCode(), keyEvent);
                        P.k = false;
                        if (!Q) {
                        }
                    }
                    return false;
                }
                jx jxVar2 = jzVar.F;
                if (jxVar2 != null) {
                    jxVar2.l = true;
                }
            }
        }
        return true;
    }

    @Override // defpackage.nm, android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f) {
            this.e.onContentChanged();
        }
    }

    @Override // defpackage.nm, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            if (!(menu instanceof od)) {
                return false;
            }
            i = 0;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // defpackage.nm, android.view.Window.Callback
    public final View onCreatePanelView(int i) {
        View view;
        kj kjVar = this.d;
        if (kjVar != null) {
            if (i == 0) {
                view = new View(kjVar.a.a.b());
                i = 0;
            } else {
                view = null;
            }
            if (view != null) {
                return view;
            }
        }
        return super.onCreatePanelView(i);
    }

    @Override // defpackage.nm, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        im b;
        super.onMenuOpened(i, menu);
        if (i == 108 && (b = this.c.b()) != null) {
            b.dispatchMenuVisibilityChanged(true);
        }
        return true;
    }

    @Override // defpackage.nm, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        if (this.b) {
            this.e.onPanelClosed(i, menu);
            return;
        }
        super.onPanelClosed(i, menu);
        jz jzVar = this.c;
        if (i == 108) {
            im b = jzVar.b();
            if (b != null) {
                b.dispatchMenuVisibilityChanged(false);
                return;
            }
            return;
        }
        if (i == 0) {
            jx P = jzVar.P(0);
            if (P.m) {
                jzVar.C(P, false);
            }
        }
    }

    @Override // defpackage.nm, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        od odVar = menu instanceof od ? (od) menu : null;
        if (i == 0) {
            if (odVar == null) {
                return false;
            }
            i = 0;
        }
        if (odVar != null) {
            odVar.k = true;
        }
        kj kjVar = this.d;
        if (kjVar != null && i == 0) {
            kk kkVar = kjVar.a;
            if (!kkVar.c) {
                kkVar.a.n();
                kjVar.a.c = true;
            }
            i = 0;
        }
        boolean onPreparePanel = super.onPreparePanel(i, view, menu);
        if (odVar != null) {
            odVar.k = false;
        }
        return onPreparePanel;
    }

    @Override // defpackage.nm, android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i) {
        od odVar = this.c.P(0).h;
        if (odVar != null) {
            super.onProvideKeyboardShortcuts(list, odVar, i);
        } else {
            super.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    @Override // defpackage.nm, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // defpackage.nm, android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        iz izVar;
        Context context;
        iz izVar2;
        jz jzVar = this.c;
        if (!jzVar.w || i != 0) {
            return super.onWindowStartingActionMode(callback, i);
        }
        nf nfVar = new nf(jzVar.k, callback);
        jz jzVar2 = this.c;
        nc ncVar = jzVar2.r;
        if (ncVar != null) {
            ncVar.f();
        }
        jo joVar = new jo(jzVar2, nfVar);
        im b = jzVar2.b();
        if (b != null) {
            jzVar2.r = b.startActionMode(joVar);
            if (jzVar2.r != null && (izVar2 = jzVar2.n) != null) {
                izVar2.hs();
            }
        }
        if (jzVar2.r == null) {
            jzVar2.E();
            nc ncVar2 = jzVar2.r;
            if (ncVar2 != null) {
                ncVar2.f();
            }
            if (jzVar2.s == null) {
                if (jzVar2.D) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = jzVar2.k.getTheme();
                    theme.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme newTheme = jzVar2.k.getResources().newTheme();
                        newTheme.setTo(theme);
                        newTheme.applyStyle(typedValue.resourceId, true);
                        context = new aeo(jzVar2.k, 0);
                        context.getTheme().setTo(newTheme);
                    } else {
                        context = jzVar2.k;
                    }
                    jzVar2.s = new ActionBarContextView(context);
                    jzVar2.t = new PopupWindow(context, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    jzVar2.t.setWindowLayoutType(2);
                    jzVar2.t.setContentView(jzVar2.s);
                    jzVar2.t.setWidth(-1);
                    context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true);
                    jzVar2.s.e = TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
                    jzVar2.t.setHeight(-2);
                    jzVar2.u = new jj(jzVar2);
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) jzVar2.y.findViewById(R.id.action_mode_bar_stub);
                    if (viewStubCompat != null) {
                        viewStubCompat.a = LayoutInflater.from(jzVar2.u());
                        jzVar2.s = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (jzVar2.s != null) {
                jzVar2.E();
                jzVar2.s.i();
                ne neVar = new ne(jzVar2.s.getContext(), jzVar2.s, joVar);
                if (joVar.c(neVar, neVar.a)) {
                    neVar.g();
                    jzVar2.s.h(neVar);
                    jzVar2.r = neVar;
                    if (jzVar2.N()) {
                        jzVar2.s.setAlpha(0.0f);
                        kwd e = kvo.e(jzVar2.s);
                        e.b(1.0f);
                        jzVar2.v = e;
                        jzVar2.v.d(new jk(jzVar2));
                    } else {
                        jzVar2.s.setAlpha(1.0f);
                        jzVar2.s.setVisibility(0);
                        if (jzVar2.s.getParent() instanceof View) {
                            View view = (View) jzVar2.s.getParent();
                            int[] iArr = kvo.a;
                            kvb.c(view);
                        }
                    }
                    if (jzVar2.t != null) {
                        jzVar2.l.getDecorView().post(jzVar2.u);
                    }
                } else {
                    jzVar2.r = null;
                }
            }
            if (jzVar2.r != null && (izVar = jzVar2.n) != null) {
                izVar.hs();
            }
            jzVar2.I();
        }
        jzVar2.I();
        nc ncVar3 = jzVar2.r;
        if (ncVar3 != null) {
            return nfVar.e(ncVar3);
        }
        return null;
    }
}
