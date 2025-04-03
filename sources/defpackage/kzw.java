package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kzw extends ktb {
    private static final Rect f = new Rect(Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public final AccessibilityManager a;
    public final View b;
    private kzv k;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = Integer.MIN_VALUE;

    public kzw(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.b = view;
        this.a = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.ktb
    public final kxx a(View view) {
        if (this.k == null) {
            this.k = new kzv(this);
        }
        return this.k;
    }

    @Override // defpackage.ktb
    public void c(View view, kxu kxuVar) {
        super.c(view, kxuVar);
        m(kxuVar);
    }

    final kxu j(int i) {
        if (i == -1) {
            kxu kxuVar = new kxu(AccessibilityNodeInfo.obtain(this.b));
            View view = this.b;
            int[] iArr = kvo.a;
            view.onInitializeAccessibilityNodeInfo(kxuVar.a);
            ArrayList arrayList = new ArrayList();
            k(arrayList);
            if (kxuVar.a.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                kxuVar.j(this.b, ((Integer) arrayList.get(i2)).intValue());
            }
            return kxuVar;
        }
        kxu b = kxu.b();
        b.x(true);
        b.z(true);
        b.r("android.view.View");
        Rect rect = f;
        b.n(rect);
        b.o(rect);
        b.J(this.b);
        n(i, b);
        if (b.e() == null && b.d() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        b.k(this.h);
        b.l(this.g);
        if (this.h.equals(rect) && this.g.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = b.a.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        b.H(this.b.getContext().getPackageName());
        b.P(this.b, i);
        if (this.c == i) {
            b.m(true);
            b.h(128);
        } else {
            b.m(false);
            b.h(64);
        }
        boolean z = this.d == i;
        if (z) {
            b.h(2);
        } else if (b.aa()) {
            b.h(1);
        }
        b.A(z);
        this.b.getLocationOnScreen(this.j);
        if (this.g.equals(rect)) {
            Rect rect2 = this.h;
            b.n(rect2);
            Rect rect3 = new Rect();
            rect3.set(rect2);
            if (b.b != -1) {
                kxu b2 = kxu.b();
                Rect rect4 = new Rect();
                for (int i3 = b.b; i3 != -1; i3 = b2.b) {
                    b2.K(this.b, -1);
                    b2.n(f);
                    n(i3, b2);
                    b2.k(rect4);
                    rect3.offset(rect4.left, rect4.top);
                }
            }
            this.b.getLocationOnScreen(this.j);
            rect3.offset(this.j[0] - this.b.getScrollX(), this.j[1] - this.b.getScrollY());
            b.o(rect3);
            b.l(this.g);
        }
        if (this.b.getLocalVisibleRect(this.i)) {
            this.i.offset(this.j[0] - this.b.getScrollX(), this.j[1] - this.b.getScrollY());
            if (this.g.intersect(this.i)) {
                b.o(this.g);
                Rect rect5 = this.g;
                if (rect5 != null && !rect5.isEmpty() && this.b.getWindowVisibility() == 0) {
                    Object parent = this.b.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            b.W(true);
                        }
                    }
                }
            }
        }
        return b;
    }

    protected abstract void k(List list);

    protected abstract void n(int i, kxu kxuVar);

    public final void p(int i) {
        int i2 = this.e;
        if (i2 == i) {
            return;
        }
        this.e = i;
        t(i, 128);
        t(i2, 256);
    }

    public final boolean q(int i) {
        if (this.c != i) {
            return false;
        }
        this.c = Integer.MIN_VALUE;
        this.b.invalidate();
        t(i, 65536);
        return true;
    }

    public final boolean r(int i) {
        if (this.d != i) {
            return false;
        }
        this.d = Integer.MIN_VALUE;
        o(i, false);
        t(i, 8);
        return true;
    }

    public abstract boolean s(int i, int i2);

    public final void t(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.a.isEnabled() || (parent = this.b.getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            kxu j = j(i);
            obtain.getText().add(j.e());
            obtain.setContentDescription(j.d());
            obtain.setScrollable(j.ad());
            obtain.setPassword(j.ac());
            obtain.setEnabled(j.Z());
            obtain.setChecked(j.X());
            l(i, obtain);
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(j.c());
            obtain.setSource(this.b, i);
            obtain.setPackageName(this.b.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            this.b.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(this.b, obtain);
    }

    protected void m(kxu kxuVar) {
    }

    protected void l(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected void o(int i, boolean z) {
    }
}
