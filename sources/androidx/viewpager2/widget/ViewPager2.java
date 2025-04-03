package androidx.viewpager2.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.kvo;
import defpackage.kxs;
import defpackage.kxu;
import defpackage.pdd;
import defpackage.pds;
import defpackage.pdv;
import defpackage.pdw;
import defpackage.pdx;
import defpackage.pdy;
import defpackage.pdz;
import defpackage.pea;
import defpackage.peb;
import defpackage.pec;
import defpackage.ped;
import defpackage.pee;
import defpackage.peg;
import defpackage.peh;
import defpackage.pek;
import defpackage.pel;
import defpackage.pem;
import defpackage.pen;
import defpackage.pep;
import defpackage.peq;
import defpackage.va;
import defpackage.vk;
import defpackage.vm;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ViewPager2 extends ViewGroup {
    public final pdv a;
    public int b;
    public boolean c;
    public final vm d;
    LinearLayoutManager e;
    public RecyclerView f;
    public pdz g;
    public final boolean h;
    public final int i;
    public pee j;
    private final Rect k;
    private final Rect l;
    private int m;
    private Parcelable n;
    private va o;
    private pdv p;
    private pdw q;
    private pdx r;

    public ViewPager2(Context context) {
        super(context);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new pdv();
        this.c = false;
        this.d = new pea(this);
        this.m = -1;
        this.h = true;
        this.i = -1;
        j(context, null);
    }

    private final void j(Context context, AttributeSet attributeSet) {
        this.j = new pel(this);
        pen penVar = new pen(this, context);
        this.f = penVar;
        penVar.setId(View.generateViewId());
        this.f.setDescendantFocusability(131072);
        peg pegVar = new peg(this);
        this.e = pegVar;
        this.f.ap(pegVar);
        RecyclerView recyclerView = this.f;
        recyclerView.G = ViewConfiguration.get(recyclerView.getContext()).getScaledPagingTouchSlop();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pdd.a);
        kvo.o(this, context, pdd.a, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            this.e.ad(obtainStyledAttributes.getInt(0, 0));
            ((pel) this.j).c();
            obtainStyledAttributes.recycle();
            this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            this.f.x(new ped());
            this.g = new pdz(this);
            pdz pdzVar = this.g;
            RecyclerView recyclerView2 = this.f;
            this.q = new pdw(pdzVar);
            pem pemVar = new pem(this);
            this.o = pemVar;
            pemVar.f(recyclerView2);
            this.f.z(this.g);
            this.f.setOverScrollMode(getOverScrollMode());
            pdv pdvVar = new pdv();
            this.p = pdvVar;
            this.g.a = pdvVar;
            peb pebVar = new peb(this);
            pec pecVar = new pec(this);
            pdvVar.c(pebVar);
            this.p.c(pecVar);
            pee peeVar = this.j;
            this.f.setImportantForAccessibility(2);
            pel pelVar = (pel) peeVar;
            pelVar.a = new pek(pelVar);
            if (pelVar.b.getImportantForAccessibility() == 0) {
                pelVar.b.setImportantForAccessibility(1);
            }
            this.p.c(this.a);
            pdx pdxVar = new pdx();
            this.r = pdxVar;
            this.p.c(pdxVar);
            RecyclerView recyclerView3 = this.f;
            attachViewToParent(recyclerView3, 0, recyclerView3.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final int a() {
        return this.e.k == 1 ? 1 : 0;
    }

    public final int b() {
        return this.g.c;
    }

    public final vk c() {
        return this.f.n;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f.canScrollVertically(i);
    }

    public final void d(peh pehVar) {
        this.a.c(pehVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof pep) {
            int i = ((pep) parcelable).a;
            sparseArray.put(this.f.getId(), (Parcelable) sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e() {
        vk c;
        if (this.m == -1 || (c = c()) == 0) {
            return;
        }
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            if (c instanceof pds) {
                ((pds) c).I(parcelable);
            }
            this.n = null;
        }
        int max = Math.max(0, Math.min(this.m, c.a() - 1));
        this.b = max;
        this.m = -1;
        this.f.ak(max);
        ((pel) this.j).c();
    }

    public final void f() {
        va vaVar = this.o;
        if (vaVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View b = vaVar.b(this.e);
        if (b == null) {
            return;
        }
        int bv = LinearLayoutManager.bv(b);
        if (bv != this.b && b() == 0) {
            this.p.b(bv);
        }
        this.c = false;
    }

    public final boolean g() {
        return this.e.aw() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public final void h() {
        pdz pdzVar = this.q.a;
    }

    public final void i(int i) {
        int i2;
        vk c = c();
        if (c == null) {
            if (this.m != -1) {
                this.m = Math.max(i, 0);
                return;
            }
            return;
        }
        if (c.a() > 0) {
            int min = Math.min(Math.max(i, 0), c.a() - 1);
            if ((min == this.b && this.g.f()) || min == (i2 = this.b)) {
                return;
            }
            this.b = min;
            ((pel) this.j).c();
            double d = i2;
            if (!this.g.f()) {
                pdz pdzVar = this.g;
                pdzVar.e();
                pdy pdyVar = pdzVar.d;
                d = pdyVar.a + pdyVar.b;
            }
            pdz pdzVar2 = this.g;
            pdzVar2.b = 2;
            int i3 = pdzVar2.e;
            pdzVar2.e = min;
            pdzVar2.d(2);
            if (i3 != min) {
                pdzVar2.c(min);
            }
            double d2 = min;
            if (Math.abs(d2 - d) <= 3.0d) {
                this.f.au(min);
                return;
            }
            this.f.ak(d2 > d ? min - 3 : min + 3);
            RecyclerView recyclerView = this.f;
            recyclerView.post(new peq(min, recyclerView));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int a;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        pee peeVar = this.j;
        kxu kxuVar = new kxu(accessibilityNodeInfo);
        pel pelVar = (pel) peeVar;
        if (pelVar.b.c() == null) {
            i = 0;
            i2 = 0;
        } else if (pelVar.b.a() == 1) {
            i = pelVar.b.c().a();
            i2 = 1;
        } else {
            i2 = pelVar.b.c().a();
            i = 1;
        }
        kxuVar.t(kxs.a(i, i2, 0));
        vk c = pelVar.b.c();
        if (c == null || (a = c.a()) == 0) {
            return;
        }
        ViewPager2 viewPager2 = pelVar.b;
        if (viewPager2.h) {
            if (viewPager2.b > 0) {
                kxuVar.h(8192);
            }
            if (pelVar.b.b < a - 1) {
                kxuVar.h(4096);
            }
            kxuVar.N(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f.getMeasuredWidth();
        int measuredHeight = this.f.getMeasuredHeight();
        this.k.left = getPaddingLeft();
        this.k.right = (i3 - i) - getPaddingRight();
        this.k.top = getPaddingTop();
        this.k.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.k, this.l);
        Rect rect = this.l;
        this.f.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.c) {
            f();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.f, i, i2);
        int measuredWidth = this.f.getMeasuredWidth();
        int measuredHeight = this.f.getMeasuredHeight();
        int measuredState = this.f.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof pep)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        pep pepVar = (pep) parcelable;
        super.onRestoreInstanceState(pepVar.getSuperState());
        this.m = pepVar.b;
        this.n = pepVar.c;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        pep pepVar = new pep(super.onSaveInstanceState());
        pepVar.a = this.f.getId();
        int i = this.m;
        if (i == -1) {
            i = this.b;
        }
        pepVar.b = i;
        Parcelable parcelable = this.n;
        if (parcelable != null) {
            pepVar.c = parcelable;
            return pepVar;
        }
        Object obj = this.f.n;
        if (obj instanceof pds) {
            pepVar.c = ((pds) obj).m();
        }
        return pepVar;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" does not support direct child views"));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!this.j.a(i)) {
            return super.performAccessibilityAction(i, bundle);
        }
        pee peeVar = this.j;
        if (!peeVar.a(i)) {
            throw new IllegalStateException();
        }
        pel pelVar = (pel) peeVar;
        pelVar.b(pelVar.b.b + (i == 8192 ? -1 : 1));
        return true;
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        ((pel) this.j).c();
    }

    @Override // android.view.View
    public final void setOverScrollMode(int i) {
        RecyclerView recyclerView = this.f;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(i);
        }
        super.setOverScrollMode(i);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new pdv();
        this.c = false;
        this.d = new pea(this);
        this.m = -1;
        this.h = true;
        this.i = -1;
        j(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new pdv();
        this.c = false;
        this.d = new pea(this);
        this.m = -1;
        this.h = true;
        this.i = -1;
        j(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.k = new Rect();
        this.l = new Rect();
        this.a = new pdv();
        this.c = false;
        this.d = new pea(this);
        this.m = -1;
        this.h = true;
        this.i = -1;
        j(context, attributeSet);
    }
}
