package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ox extends om implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, oq {
    final ur a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final od f;
    private final oa h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private op o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new ov(this);
    private final View.OnAttachStateChangeListener l = new ow(this);
    private int s = 0;

    public ox(Context context, od odVar, View view, int i, boolean z) {
        this.e = context;
        this.f = odVar;
        this.i = z;
        this.h = new oa(odVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new ur(context, i);
        odVar.h(this, context);
    }

    @Override // defpackage.oq
    public final void d(od odVar, boolean z) {
        if (odVar != this.f) {
            return;
        }
        m();
        op opVar = this.o;
        if (opVar != null) {
            opVar.a(odVar, z);
        }
    }

    @Override // defpackage.oq
    public final Parcelable dF() {
        return null;
    }

    @Override // defpackage.ou
    public final ListView dG() {
        return this.a.e;
    }

    @Override // defpackage.oq
    public final void e(op opVar) {
        this.o = opVar;
    }

    @Override // defpackage.oq
    public final void f(boolean z) {
        this.q = false;
        oa oaVar = this.h;
        if (oaVar != null) {
            oaVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.oq
    public final boolean g() {
        return false;
    }

    @Override // defpackage.oq
    public final boolean h(oy oyVar) {
        if (oyVar.hasVisibleItems()) {
            oo ooVar = new oo(this.e, oyVar, this.c, this.i, this.k);
            ooVar.e(this.o);
            ooVar.d(om.z(oyVar));
            ooVar.c = this.m;
            this.m = null;
            this.f.i(false);
            ur urVar = this.a;
            int i = urVar.g;
            int b = urVar.b();
            if ((Gravity.getAbsoluteGravity(this.s, this.n.getLayoutDirection()) & 7) == 5) {
                i += this.n.getWidth();
            }
            if (!ooVar.h()) {
                if (ooVar.a != null) {
                    ooVar.g(i, b, true, true);
                }
            }
            op opVar = this.o;
            if (opVar != null) {
                opVar.b(oyVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ou
    public final void m() {
        if (x()) {
            this.a.m();
        }
    }

    @Override // defpackage.om
    public final void o(View view) {
        this.n = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        m();
        return true;
    }

    @Override // defpackage.om
    public final void p(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.om
    public final void q(int i) {
        this.s = i;
    }

    @Override // defpackage.om
    public final void r(int i) {
        this.a.g = i;
    }

    @Override // defpackage.om
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.om
    public final void t(boolean z) {
        this.t = z;
    }

    @Override // defpackage.om
    public final void u(int i) {
        this.a.j(i);
    }

    @Override // defpackage.ou
    public final void v() {
        View view;
        if (x()) {
            return;
        }
        if (this.p || (view = this.n) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.c = view;
        this.a.t(this);
        ur urVar = this.a;
        urVar.m = this;
        urVar.y();
        View view2 = this.c;
        ViewTreeObserver viewTreeObserver = this.d;
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        this.d = viewTreeObserver2;
        if (viewTreeObserver == null) {
            viewTreeObserver2.addOnGlobalLayoutListener(this.b);
        }
        view2.addOnAttachStateChangeListener(this.l);
        ur urVar2 = this.a;
        urVar2.l = view2;
        urVar2.j = this.s;
        if (!this.q) {
            this.r = A(this.h, this.e, this.j);
            this.q = true;
        }
        this.a.r(this.r);
        this.a.w();
        this.a.s(this.g);
        this.a.v();
        ti tiVar = this.a.e;
        tiVar.setOnKeyListener(this);
        if (this.t && this.f.e != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) tiVar, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            if (textView != null) {
                textView.setText(this.f.e);
            }
            frameLayout.setEnabled(false);
            tiVar.addHeaderView(frameLayout, null, false);
        }
        this.a.e(this.h);
        this.a.v();
    }

    @Override // defpackage.ou
    public final boolean x() {
        return !this.p && this.a.x();
    }

    @Override // defpackage.om
    public final void l(od odVar) {
    }

    @Override // defpackage.oq
    public final void n(Parcelable parcelable) {
    }
}
