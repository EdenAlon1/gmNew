package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nx extends om implements View.OnKeyListener, PopupWindow.OnDismissListener, oq {
    public final Handler a;
    View d;
    ViewTreeObserver e;
    boolean f;
    private final Context h;
    private final int i;
    private final int j;
    private final boolean k;
    private View q;
    private boolean s;
    private boolean t;
    private int u;
    private int v;
    private boolean x;
    private op y;
    private PopupWindow.OnDismissListener z;
    private final List l = new ArrayList();
    public final List b = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener c = new ns(this);
    private final View.OnAttachStateChangeListener m = new nt(this);
    private final up n = new nv(this);
    private int o = 0;
    private int p = 0;
    private boolean w = false;
    private int r = B();

    public nx(Context context, View view, int i, boolean z) {
        this.h = context;
        this.q = view;
        this.j = i;
        this.k = z;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.a = new Handler();
    }

    private final int B() {
        return this.q.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void C(defpackage.od r17) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nx.C(od):void");
    }

    @Override // defpackage.oq
    public final void d(od odVar, boolean z) {
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (odVar == ((nw) this.b.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < this.b.size()) {
            ((nw) this.b.get(i2)).b.i(false);
        }
        nw nwVar = (nw) this.b.remove(i);
        nwVar.b.m(this);
        if (this.f) {
            nwVar.a.r.setExitTransition(null);
            nwVar.a.r.setAnimationStyle(0);
        }
        nwVar.a.m();
        int size2 = this.b.size();
        if (size2 > 0) {
            this.r = ((nw) this.b.get(size2 - 1)).c;
        } else {
            this.r = B();
        }
        if (size2 != 0) {
            if (z) {
                ((nw) this.b.get(0)).b.i(false);
                return;
            }
            return;
        }
        m();
        op opVar = this.y;
        if (opVar != null) {
            opVar.a(odVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.e.removeGlobalOnLayoutListener(this.c);
            }
            this.e = null;
        }
        this.d.removeOnAttachStateChangeListener(this.m);
        this.z.onDismiss();
    }

    @Override // defpackage.oq
    public final Parcelable dF() {
        return null;
    }

    @Override // defpackage.ou
    public final ListView dG() {
        if (this.b.isEmpty()) {
            return null;
        }
        return ((nw) this.b.get(r0.size() - 1)).a();
    }

    @Override // defpackage.oq
    public final void e(op opVar) {
        this.y = opVar;
    }

    @Override // defpackage.oq
    public final void f(boolean z) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            y(((nw) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // defpackage.oq
    public final boolean g() {
        return false;
    }

    @Override // defpackage.oq
    public final boolean h(oy oyVar) {
        for (nw nwVar : this.b) {
            if (oyVar == nwVar.b) {
                nwVar.a().requestFocus();
                return true;
            }
        }
        if (!oyVar.hasVisibleItems()) {
            return false;
        }
        l(oyVar);
        op opVar = this.y;
        if (opVar != null) {
            opVar.b(oyVar);
        }
        return true;
    }

    @Override // defpackage.om
    public final void l(od odVar) {
        odVar.h(this, this.h);
        if (x()) {
            C(odVar);
        } else {
            this.l.add(odVar);
        }
    }

    @Override // defpackage.ou
    public final void m() {
        int size = this.b.size();
        if (size <= 0) {
            return;
        }
        nw[] nwVarArr = (nw[]) this.b.toArray(new nw[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            nw nwVar = nwVarArr[size];
            if (nwVar.a.x()) {
                nwVar.a.m();
            }
        }
    }

    @Override // defpackage.om
    public final void o(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = Gravity.getAbsoluteGravity(this.o, view.getLayoutDirection());
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        nw nwVar;
        int size = this.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                nwVar = null;
                break;
            }
            nwVar = (nw) this.b.get(i);
            if (!nwVar.a.x()) {
                break;
            } else {
                i++;
            }
        }
        if (nwVar != null) {
            nwVar.b.i(false);
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
        this.w = z;
    }

    @Override // defpackage.om
    public final void q(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = Gravity.getAbsoluteGravity(i, this.q.getLayoutDirection());
        }
    }

    @Override // defpackage.om
    public final void r(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // defpackage.om
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // defpackage.om
    public final void t(boolean z) {
        this.x = z;
    }

    @Override // defpackage.om
    public final void u(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // defpackage.ou
    public final void v() {
        if (x()) {
            return;
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            C((od) it.next());
        }
        this.l.clear();
        View view = this.q;
        this.d = view;
        if (view != null) {
            ViewTreeObserver viewTreeObserver = this.e;
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            this.e = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.c);
            }
            this.d.addOnAttachStateChangeListener(this.m);
        }
    }

    @Override // defpackage.om
    protected final boolean w() {
        return false;
    }

    @Override // defpackage.ou
    public final boolean x() {
        return this.b.size() > 0 && ((nw) this.b.get(0)).a.x();
    }

    @Override // defpackage.oq
    public final void n(Parcelable parcelable) {
    }
}
