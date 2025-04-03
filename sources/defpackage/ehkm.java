package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ehkm extends ViewGroup implements os {
    public int A;
    public int B;
    public int C;
    public ehow D;
    public ColorStateList E;
    public ehkp F;
    public ehkj G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public final Rect L;
    private final View.OnClickListener N;
    private kst O;
    private final SparseArray P;
    private ColorStateList Q;
    private final ColorStateList R;
    private int S;
    private MenuItem T;
    public final paz b;
    public int c;
    public int d;
    public ehkk[] e;
    public int f;
    public int g;
    public int h;
    public ColorStateList i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public ColorStateList o;
    public int p;
    public final SparseArray q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public int y;
    public int z;
    private static final int[] a = {R.attr.state_checked};
    private static final int[] M = {-16842910};

    public ehkm(Context context) {
        super(context);
        this.P = new SparseArray();
        this.f = -1;
        this.g = -1;
        this.q = new SparseArray();
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.C = 49;
        this.J = 1;
        this.S = 0;
        this.T = null;
        this.K = 7;
        this.L = new Rect();
        this.R = i();
        if (isInEditMode()) {
            this.b = null;
        } else {
            ozh ozhVar = new ozh();
            this.b = ozhVar;
            ozhVar.Q(0);
            ozhVar.H(TextView.class);
            ozhVar.K(ehmp.a(getContext(), com.google.android.apps.messaging.R.attr.motionDurationMedium4, getResources().getInteger(com.google.android.apps.messaging.R.integer.material_motion_duration_long_1)));
            ozhVar.L(ehjz.a(getContext(), com.google.android.apps.messaging.R.attr.motionEasingStandard, egyv.b));
            ozhVar.O(new ehix());
        }
        this.N = new ehkl(this);
        setImportantForAccessibility(1);
    }

    private final ehkh j(int i, og ogVar, boolean z, boolean z2) {
        ehab ehabVar;
        this.F.b = true;
        ogVar.setCheckable(true);
        this.F.b = false;
        kst kstVar = this.O;
        ehkh ehkhVar = kstVar != null ? (ehkh) kstVar.a() : null;
        if (ehkhVar == null) {
            ehkhVar = b(getContext());
        }
        ehkhVar.G(z);
        ehkhVar.D(this.J);
        ehkhVar.v(this.Q);
        ehkhVar.u(this.h);
        ehkhVar.K(this.R);
        ehkhVar.J(this.j);
        ehkhVar.H(this.k);
        ehkhVar.s(this.l);
        ehkhVar.r(this.m);
        ehkhVar.I(this.n);
        ehkhVar.K(this.i);
        int i2 = this.r;
        if (i2 != -1) {
            ehkhVar.A(i2);
        }
        int i3 = this.s;
        if (i3 != -1) {
            ehkhVar.z(i3);
        }
        ehkhVar.F(this.H);
        ehkhVar.C(this.I);
        int i4 = this.t;
        if (i4 != -1) {
            ehkhVar.l(i4);
        }
        int i5 = this.u;
        if (i5 != -1) {
            ehkhVar.t(i5);
        }
        ehkhVar.o(this.w);
        ehkhVar.k(this.x);
        ehkhVar.j(this.y);
        ehkhVar.h(this.z);
        ehkhVar.m(this.A);
        ehkhVar.x(this.C);
        ehkhVar.n = this.L;
        ehkhVar.i(this.B);
        ehkhVar.d(d());
        ehkhVar.g(this.v);
        ehkhVar.w(this.p);
        ehkhVar.B(this.o);
        ehkhVar.E(this.c);
        ehkhVar.y(this.d);
        ehkhVar.m = z2;
        ehkhVar.N();
        ehkhVar.N();
        ehkhVar.f(ogVar);
        int i6 = ogVar.a;
        ehkhVar.setOnTouchListener((View.OnTouchListener) this.P.get(i6));
        ehkhVar.setOnClickListener(this.N);
        int i7 = this.f;
        if (i7 != 0 && i6 == i7) {
            this.g = i;
        }
        int id = ehkhVar.getId();
        if (id != -1 && (ehabVar = (ehab) this.q.get(id)) != null) {
            ehkhVar.p(ehabVar);
        }
        return ehkhVar;
    }

    @Override // defpackage.os
    public final void a(od odVar) {
        this.G = new ehkj(odVar);
    }

    protected abstract ehkh b(Context context);

    public final int c() {
        return Math.min(this.K, this.G.c);
    }

    public final Drawable d() {
        if (this.D == null || this.E == null) {
            return null;
        }
        ehop ehopVar = new ehop(this.D);
        ehopVar.O(this.E);
        return ehopVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        ehkh ehkhVar;
        removeAllViews();
        ehkk[] ehkkVarArr = this.e;
        if (ehkkVarArr != null && this.O != null) {
            for (ehkk ehkkVar : ehkkVarArr) {
                if (ehkkVar instanceof ehkh) {
                    ehkh ehkhVar2 = (ehkh) ehkkVar;
                    this.O.b(ehkhVar2);
                    ehkhVar2.L(ehkhVar2.e);
                    ehkhVar2.f = null;
                    ehkhVar2.g = 0.0f;
                    ehkhVar2.a = false;
                }
            }
        }
        this.F.b = true;
        this.G.c();
        this.F.b = false;
        int i = this.G.b;
        if (i == 0) {
            this.f = 0;
            this.g = 0;
            this.e = null;
            this.O = null;
            return;
        }
        if (this.O == null || this.S != i) {
            this.S = i;
            this.O = new ksv(i);
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.G.a(); i2++) {
            hashSet.add(Integer.valueOf(this.G.b(i2).getItemId()));
        }
        for (int i3 = 0; i3 < this.q.size(); i3++) {
            int keyAt = this.q.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.q.delete(keyAt);
            }
        }
        int a2 = this.G.a();
        this.e = new ehkk[a2];
        boolean h = h(this.c, c());
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < a2; i6++) {
            MenuItem b = this.G.b(i6);
            boolean z = b instanceof ehkb;
            if (z) {
                ehkc ehkcVar = new ehkc(getContext());
                ehkcVar.b();
                ehkcVar.b();
                ehkhVar = ehkcVar;
            } else if (b.hasSubMenu()) {
                if (i5 > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                ehkq ehkqVar = new ehkq(getContext());
                int i7 = this.m;
                if (i7 == 0) {
                    i7 = this.k;
                }
                ehkqVar.a.setTextAppearance(i7);
                ColorStateList colorStateList = ehkqVar.c;
                if (colorStateList != null) {
                    ehkqVar.a.setTextColor(colorStateList);
                }
                ColorStateList colorStateList2 = this.i;
                ehkqVar.c = colorStateList2;
                if (colorStateList2 != null) {
                    ehkqVar.a.setTextColor(colorStateList2);
                }
                ehkqVar.b = true;
                ehkqVar.b();
                ehkqVar.f((og) b);
                i5 = b.getSubMenu().size();
                ehkhVar = ehkqVar;
            } else if (i5 > 0) {
                i5--;
                ehkhVar = j(i6, (og) b, h, true);
            } else {
                og ogVar = (og) b;
                boolean z2 = i4 >= this.K;
                i4++;
                ehkhVar = j(i6, ogVar, h, z2);
            }
            if (!z && b.isCheckable() && this.g == -1) {
                this.g = i6;
            }
            this.e[i6] = ehkhVar;
            addView(ehkhVar);
        }
        int min = Math.min(a2 - 1, this.g);
        this.g = min;
        f(this.e[min].a());
    }

    public final void f(MenuItem menuItem) {
        if (this.T == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.T;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.T.setChecked(false);
        }
        menuItem.setChecked(true);
        this.T = menuItem;
    }

    public final void g(ColorStateList colorStateList) {
        this.Q = colorStateList;
        ehkk[] ehkkVarArr = this.e;
        if (ehkkVarArr != null) {
            for (ehkk ehkkVar : ehkkVarArr) {
                if (ehkkVar instanceof ehkh) {
                    ((ehkh) ehkkVar).v(colorStateList);
                }
            }
        }
    }

    protected final boolean h(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    public final ColorStateList i() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList d = koa.d(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.google.android.apps.messaging.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = d.getDefaultColor();
        int[] iArr = M;
        return new ColorStateList(new int[][]{iArr, a, EMPTY_STATE_SET}, new int[]{d.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new kxu(accessibilityNodeInfo).t(kxs.a(1, c(), 1));
    }
}
