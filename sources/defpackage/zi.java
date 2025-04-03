package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zi implements sp {
    public final Toolbar a;
    public int b;
    public View c;
    CharSequence d;
    public Window.Callback e;
    boolean f;
    private Drawable g;
    private Drawable h;
    private Drawable i;
    private boolean j;
    private CharSequence k;
    private CharSequence l;
    private pt m;
    private int n;
    private Drawable o;

    public zi(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.d = toolbar.s;
        this.k = toolbar.t;
        this.j = this.d != null;
        this.i = toolbar.e();
        yt l = yt.l(toolbar.getContext(), null, kt.a, R.attr.actionBarStyle, 0);
        int i = 15;
        this.o = l.h(15);
        if (z) {
            CharSequence m = l.m(27);
            if (!TextUtils.isEmpty(m)) {
                t(m);
            }
            CharSequence m2 = l.m(25);
            if (!TextUtils.isEmpty(m2)) {
                s(m2);
            }
            Drawable h = l.h(20);
            if (h != null) {
                l(h);
            }
            Drawable h2 = l.h(17);
            if (h2 != null) {
                this.g = h2;
                K();
            }
            if (this.i == null && (drawable = this.o) != null) {
                r(drawable);
            }
            k(l.c(10, 0));
            int f = l.f(9, 0);
            if (f != 0) {
                j(LayoutInflater.from(toolbar.getContext()).inflate(f, (ViewGroup) toolbar, false));
                k(this.b | 16);
            }
            int e = l.e(13, 0);
            if (e > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = e;
                toolbar.setLayoutParams(layoutParams);
            }
            int a = l.a(7, -1);
            int a2 = l.a(3, -1);
            if (a >= 0 || a2 >= 0) {
                int max = Math.max(a, 0);
                int max2 = Math.max(a2, 0);
                toolbar.m();
                toolbar.r.a(max, max2);
            }
            int f2 = l.f(28, 0);
            if (f2 != 0) {
                Context context = toolbar.getContext();
                toolbar.k = f2;
                TextView textView = toolbar.b;
                if (textView != null) {
                    textView.setTextAppearance(context, f2);
                }
            }
            int f3 = l.f(26, 0);
            if (f3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.l = f3;
                TextView textView2 = toolbar.c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, f3);
                }
            }
            int f4 = l.f(22, 0);
            if (f4 != 0) {
                toolbar.u(f4);
            }
        } else {
            if (toolbar.e() != null) {
                this.o = toolbar.e();
            } else {
                i = 11;
            }
            this.b = i;
        }
        l.o();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.j())) {
                o(this.n);
            }
        }
        this.l = toolbar.j();
        toolbar.t(new zg(this));
    }

    private final void H(CharSequence charSequence) {
        this.d = charSequence;
        if ((this.b & 8) != 0) {
            this.a.x(charSequence);
            if (this.j) {
                kvo.r(this.a.getRootView(), charSequence);
            }
        }
    }

    private final void I() {
        if ((this.b & 4) != 0) {
            if (!TextUtils.isEmpty(this.l)) {
                this.a.q(this.l);
                return;
            }
            Toolbar toolbar = this.a;
            int i = this.n;
            toolbar.q(i != 0 ? toolbar.getContext().getText(i) : null);
        }
    }

    private final void J() {
        if ((this.b & 4) == 0) {
            this.a.s(null);
            return;
        }
        Toolbar toolbar = this.a;
        Drawable drawable = this.i;
        if (drawable == null) {
            drawable = this.o;
        }
        toolbar.s(drawable);
    }

    private final void K() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.h) == null) {
            drawable = this.g;
        }
        this.a.p(drawable);
    }

    @Override // defpackage.sp
    public final boolean A() {
        pt ptVar;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (ptVar = actionMenuView.c) == null) {
            return false;
        }
        return ptVar.l != null || ptVar.o();
    }

    @Override // defpackage.sp
    public final boolean B() {
        return this.a.C();
    }

    @Override // defpackage.sp
    public final boolean C() {
        return this.a.D();
    }

    @Override // defpackage.sp
    public final void G() {
        this.a.requestLayout();
    }

    @Override // defpackage.sp
    public final int a() {
        return this.b;
    }

    @Override // defpackage.sp
    public final Context b() {
        return this.a.getContext();
    }

    @Override // defpackage.sp
    public final View c() {
        return this.c;
    }

    @Override // defpackage.sp
    public final ViewGroup d() {
        return this.a;
    }

    @Override // defpackage.sp
    public final kwd e(int i, long j) {
        float f = i == 0 ? 1.0f : 0.0f;
        kwd e = kvo.e(this.a);
        e.b(f);
        e.c(j);
        e.d(new zh(this, i));
        return e;
    }

    @Override // defpackage.sp
    public final void f() {
        this.a.l();
    }

    @Override // defpackage.sp
    public final void g() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.e();
        }
    }

    @Override // defpackage.sp
    public final void h() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.sp
    public final void i() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.sp
    public final void j(View view) {
        View view2 = this.c;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.c = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    @Override // defpackage.sp
    public final void k(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    I();
                }
                J();
            }
            if ((i2 & 3) != 0) {
                K();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.x(this.d);
                    this.a.v(this.k);
                } else {
                    this.a.x(null);
                    this.a.v(null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.a.addView(view);
            } else {
                this.a.removeView(view);
            }
        }
    }

    @Override // defpackage.sp
    public final void l(Drawable drawable) {
        this.h = drawable;
        K();
    }

    @Override // defpackage.sp
    public final void m(Menu menu, op opVar) {
        pt ptVar = this.m;
        if (ptVar == null) {
            pt ptVar2 = new pt(this.a.getContext());
            this.m = ptVar2;
            ptVar2.g = R.id.action_menu_presenter;
            ptVar = ptVar2;
        }
        ptVar.e = opVar;
        Toolbar toolbar = this.a;
        if (menu == null && toolbar.a == null) {
            return;
        }
        toolbar.n();
        od odVar = toolbar.a.a;
        if (odVar == menu) {
            return;
        }
        if (odVar != null) {
            odVar.m(toolbar.y);
            odVar.m(toolbar.z);
        }
        if (toolbar.z == null) {
            toolbar.z = new zb(toolbar);
        }
        ptVar.r();
        if (menu != null) {
            od odVar2 = (od) menu;
            odVar2.h(ptVar, toolbar.i);
            odVar2.h(toolbar.z, toolbar.i);
        } else {
            ptVar.c(toolbar.i, null);
            toolbar.z.c(toolbar.i, null);
            ptVar.f(true);
            toolbar.z.f(true);
        }
        toolbar.a.g(toolbar.j);
        toolbar.a.h(ptVar);
        toolbar.y = ptVar;
        toolbar.z();
    }

    @Override // defpackage.sp
    public final void n() {
        this.f = true;
    }

    @Override // defpackage.sp
    public final void o(int i) {
        p(i == 0 ? null : b().getString(i));
    }

    @Override // defpackage.sp
    public final void p(CharSequence charSequence) {
        this.l = charSequence;
        I();
    }

    @Override // defpackage.sp
    public final void q(int i) {
        r(i != 0 ? ku.a(b(), i) : null);
    }

    @Override // defpackage.sp
    public final void r(Drawable drawable) {
        this.i = drawable;
        J();
    }

    @Override // defpackage.sp
    public final void s(CharSequence charSequence) {
        this.k = charSequence;
        if ((this.b & 8) != 0) {
            this.a.v(charSequence);
        }
    }

    @Override // defpackage.sp
    public final void t(CharSequence charSequence) {
        this.j = true;
        H(charSequence);
    }

    @Override // defpackage.sp
    public final void u(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.sp
    public final void v(Window.Callback callback) {
        this.e = callback;
    }

    @Override // defpackage.sp
    public final void w(CharSequence charSequence) {
        if (this.j) {
            return;
        }
        H(charSequence);
    }

    @Override // defpackage.sp
    public final boolean x() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.b;
    }

    @Override // defpackage.sp
    public final boolean y() {
        return this.a.A();
    }

    @Override // defpackage.sp
    public final boolean z() {
        return this.a.B();
    }

    @Override // defpackage.sp
    public final void D() {
    }

    @Override // defpackage.sp
    public final void E() {
    }

    @Override // defpackage.sp
    public final void F() {
    }
}
