package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oo {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final od e;
    private final boolean f;
    private final int g;
    private boolean h;
    private op i;
    private om j;
    private final PopupWindow.OnDismissListener k;

    public oo(Context context, od odVar, View view, boolean z) {
        this(context, odVar, view, z, R.attr.actionOverflowMenuStyle);
    }

    public final om a() {
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            om nxVar = Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new nx(this.d, this.a, this.g, this.f) : new ox(this.d, this.e, this.a, this.g, this.f);
            nxVar.l(this.e);
            nxVar.s(this.k);
            nxVar.o(this.a);
            nxVar.e(this.i);
            nxVar.p(this.h);
            nxVar.q(this.b);
            this.j = nxVar;
        }
        return this.j;
    }

    public final void b() {
        if (h()) {
            this.j.m();
        }
    }

    protected void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        om omVar = this.j;
        if (omVar != null) {
            omVar.p(z);
        }
    }

    public final void e(op opVar) {
        this.i = opVar;
        om omVar = this.j;
        if (omVar != null) {
            omVar.e(opVar);
        }
    }

    public final void f() {
        if (!i()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void g(int i, int i2, boolean z, boolean z2) {
        om a = a();
        a.t(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, this.a.getLayoutDirection()) & 7) == 5) {
                i -= this.a.getWidth();
            }
            a.r(i);
            a.u(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i4 = i + i3;
            a.g = new Rect(i - i3, i2 - i3, i4, i2 + i3);
        }
        a.v();
    }

    public final boolean h() {
        om omVar = this.j;
        return omVar != null && omVar.x();
    }

    public final boolean i() {
        if (h()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        g(0, 0, false, false);
        return true;
    }

    public oo(Context context, od odVar, View view, boolean z, int i) {
        this.b = 8388611;
        this.k = new on(this);
        this.d = context;
        this.e = odVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }
}
