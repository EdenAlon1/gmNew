package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pt extends nq implements ktc {
    public po h;
    public int i;
    pp j;
    public pk k;
    pm l;
    final pq m;
    int n;
    private boolean o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private final SparseBooleanArray t;
    private pl u;

    public pt(Context context) {
        super(context);
        this.t = new SparseBooleanArray();
        this.m = new pq(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [or] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.nq
    public final View b(og ogVar, View view, ViewGroup viewGroup) {
        View actionView = ogVar.getActionView();
        if (actionView == null || ogVar.m()) {
            ActionMenuItemView actionMenuItemView = view instanceof or ? (or) view : (or) this.d.inflate(R.layout.abc_action_menu_item_layout, viewGroup, false);
            actionMenuItemView.f(ogVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.b = (ActionMenuView) this.f;
            if (this.u == null) {
                this.u = new pl(this);
            }
            actionMenuItemView2.c = this.u;
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(true == ogVar.q ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof pw)) {
            actionView.setLayoutParams(ActionMenuView.l(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.nq, defpackage.oq
    public final void c(Context context, od odVar) {
        this.b = context;
        LayoutInflater.from(this.b);
        this.c = odVar;
        Resources resources = context.getResources();
        if (!this.p) {
            this.o = true;
        }
        this.q = context.getResources().getDisplayMetrics().widthPixels / 2;
        this.i = na.a(context);
        int i = this.q;
        if (this.o) {
            if (this.h == null) {
                this.h = new po(this, this.a);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.h.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.h.getMeasuredWidth();
        } else {
            this.h = null;
        }
        this.r = i;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.nq, defpackage.oq
    public final void d(od odVar, boolean z) {
        q();
        op opVar = this.e;
        if (opVar != null) {
            opVar.a(odVar, z);
        }
    }

    @Override // defpackage.oq
    public final Parcelable dF() {
        ps psVar = new ps();
        psVar.a = this.n;
        return psVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq, defpackage.oq
    public final void f(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.f;
        boolean z2 = false;
        if (viewGroup != null) {
            od odVar = this.c;
            if (odVar != null) {
                odVar.k();
                ArrayList f = this.c.f();
                int size = f.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    og ogVar = (og) f.get(i2);
                    if (ogVar.o()) {
                        View childAt = viewGroup.getChildAt(i);
                        og a = childAt instanceof or ? ((or) childAt).a() : null;
                        View b = b(ogVar, childAt, viewGroup);
                        if (ogVar != a) {
                            b.setPressed(false);
                            b.jumpDrawablesToCurrentState();
                        }
                        if (b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b);
                            }
                            ((ViewGroup) this.f).addView(b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.h) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.f).requestLayout();
        od odVar2 = this.c;
        if (odVar2 != null) {
            odVar2.k();
            ArrayList arrayList = odVar2.d;
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                kte kteVar = ((og) arrayList.get(i3)).p;
                if (kteVar != null) {
                    kteVar.setSubUiVisibilityListener(this);
                }
            }
        }
        od odVar3 = this.c;
        ArrayList e = odVar3 != null ? odVar3.e() : null;
        if (this.o && e != null) {
            int size3 = e.size();
            if (size3 == 1) {
                z2 = !((og) e.get(0)).q;
            } else if (size3 > 0) {
                z2 = true;
            }
            if (z2) {
                if (this.h == null) {
                    this.h = new po(this, this.a);
                }
                ViewGroup viewGroup3 = (ViewGroup) this.h.getParent();
                if (viewGroup3 != this.f) {
                    if (viewGroup3 != null) {
                        viewGroup3.removeView(this.h);
                    }
                    ActionMenuView actionMenuView = (ActionMenuView) this.f;
                    po poVar = this.h;
                    pw k = ActionMenuView.k();
                    k.a = true;
                    actionMenuView.addView(poVar, k);
                }
                ((ActionMenuView) this.f).b = this.o;
            }
        }
        po poVar2 = this.h;
        if (poVar2 != null) {
            Object parent = poVar2.getParent();
            Object obj = this.f;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.h);
            }
        }
        ((ActionMenuView) this.f).b = this.o;
    }

    @Override // defpackage.nq, defpackage.oq
    public final boolean g() {
        ArrayList arrayList;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        od odVar = this.c;
        View view = null;
        boolean z4 = false;
        if (odVar != null) {
            arrayList = odVar.f();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i2 = this.i;
        int i3 = this.r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f;
        int i4 = 0;
        boolean z5 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z = true;
            if (i4 >= i) {
                break;
            }
            og ogVar = (og) arrayList.get(i4);
            if (ogVar.r()) {
                i5++;
            } else if (ogVar.q()) {
                i6++;
            } else {
                z5 = true;
            }
            if (this.s && ogVar.q) {
                i2 = 0;
            }
            i4++;
        }
        if (this.o && (z5 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.t;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            og ogVar2 = (og) arrayList.get(i8);
            if (ogVar2.r()) {
                View b = b(ogVar2, view, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int i10 = ogVar2.b;
                if (i10 != 0) {
                    sparseBooleanArray.put(i10, z);
                }
                ogVar2.k(z);
                z2 = z4;
                z3 = z;
            } else if (ogVar2.q()) {
                int i11 = ogVar2.b;
                boolean z6 = sparseBooleanArray.get(i11);
                boolean z7 = ((i7 > 0 || z6) && i3 > 0) ? z : z4;
                if (z7) {
                    View b2 = b(ogVar2, view, viewGroup);
                    b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i9 == 0) {
                        i9 = measuredWidth2;
                    }
                    z7 = i3 + i9 > 0 ? z : false;
                }
                boolean z8 = z7;
                if (z8 && i11 != 0) {
                    sparseBooleanArray.put(i11, z);
                } else if (z6) {
                    sparseBooleanArray.put(i11, false);
                    int i12 = 0;
                    while (i12 < i8) {
                        og ogVar3 = (og) arrayList.get(i12);
                        boolean z9 = z;
                        if (ogVar3.b == i11) {
                            if (ogVar3.o()) {
                                i7++;
                            }
                            ogVar3.k(false);
                        }
                        i12++;
                        z = z9;
                    }
                }
                z3 = z;
                if (z8) {
                    i7--;
                }
                ogVar2.k(z8);
                z2 = false;
            } else {
                z2 = z4;
                z3 = z;
                ogVar2.k(z2);
            }
            i8++;
            z4 = z2;
            z = z3;
            view = null;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nq, defpackage.oq
    public final boolean h(oy oyVar) {
        boolean z = false;
        if (oyVar.hasVisibleItems()) {
            oy oyVar2 = oyVar;
            while (true) {
                od odVar = oyVar2.l;
                if (odVar == this.c) {
                    break;
                }
                oyVar2 = (oy) odVar;
            }
            og ogVar = oyVar2.m;
            ViewGroup viewGroup = (ViewGroup) this.f;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof or) && ((or) childAt).a() == ogVar) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.n = oyVar.m.a;
                int size = oyVar.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    MenuItem item = oyVar.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                pk pkVar = new pk(this, this.b, oyVar, view);
                this.k = pkVar;
                pkVar.d(z);
                this.k.f();
                super.h(oyVar);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ktc
    public final void k(boolean z) {
        if (z) {
            super.h(null);
            return;
        }
        od odVar = this.c;
        if (odVar != null) {
            odVar.i(false);
        }
    }

    public final void l(ActionMenuView actionMenuView) {
        this.f = actionMenuView;
        actionMenuView.a = this.c;
    }

    public final boolean m() {
        Object obj;
        pm pmVar = this.l;
        if (pmVar != null && (obj = this.f) != null) {
            ((View) obj).removeCallbacks(pmVar);
            this.l = null;
            return true;
        }
        pp ppVar = this.j;
        if (ppVar == null) {
            return false;
        }
        ppVar.b();
        return true;
    }

    @Override // defpackage.oq
    public final void n(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof ps) && (i = ((ps) parcelable).a) > 0 && (findItem = this.c.findItem(i)) != null) {
            h((oy) findItem.getSubMenu());
        }
    }

    public final boolean o() {
        pp ppVar = this.j;
        return ppVar != null && ppVar.h();
    }

    public final boolean p() {
        od odVar;
        if (!this.o || o() || (odVar = this.c) == null || this.f == null || this.l != null || odVar.e().isEmpty()) {
            return false;
        }
        this.l = new pm(this, new pp(this, this.b, this.c, this.h));
        ((View) this.f).post(this.l);
        return true;
    }

    public final void q() {
        m();
        t();
    }

    public final void r() {
        this.s = true;
    }

    public final void s() {
        this.o = true;
        this.p = true;
    }

    public final void t() {
        pk pkVar = this.k;
        if (pkVar != null) {
            pkVar.b();
        }
    }
}
