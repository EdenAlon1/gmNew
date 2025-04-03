package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.apps.messaging.R;
import defpackage.ik;
import defpackage.kt;
import defpackage.ktt;
import defpackage.ktv;
import defpackage.ku;
import defpackage.kvo;
import defpackage.nj;
import defpackage.ob;
import defpackage.od;
import defpackage.og;
import defpackage.op;
import defpackage.po;
import defpackage.pt;
import defpackage.sp;
import defpackage.wy;
import defpackage.yt;
import defpackage.yw;
import defpackage.yx;
import defpackage.yy;
import defpackage.zb;
import defpackage.zc;
import defpackage.zd;
import defpackage.zf;
import defpackage.zi;
import defpackage.zu;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements ktt {
    public op A;
    public ob B;
    public boolean C;
    private ImageButton D;
    private int E;
    private int F;
    private int G;
    private int H;
    private ColorStateList I;
    private ColorStateList J;
    private boolean K;
    private boolean L;
    private final ArrayList M;
    private final int[] N;
    private zi O;
    private OnBackInvokedCallback P;
    private OnBackInvokedDispatcher Q;
    private final Runnable R;
    private final yw S;
    public ActionMenuView a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public Drawable e;
    public CharSequence f;
    public ImageButton g;
    public View h;
    public Context i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public wy r;
    public CharSequence s;
    public CharSequence t;
    public final ArrayList u;
    public final ktv v;
    public ArrayList w;
    public zd x;
    public pt y;
    public zb z;

    public Toolbar(Context context) {
        this(context, null);
    }

    protected static final zc E(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof zc ? new zc((zc) layoutParams) : layoutParams instanceof ik ? new zc((ik) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new zc((ViewGroup.MarginLayoutParams) layoutParams) : new zc(layoutParams);
    }

    private final int F(int i) {
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : layoutDirection == 1 ? 5 : 3;
    }

    private final int G(View view, int i) {
        zc zcVar = (zc) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = zcVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.H & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - zcVar.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i4 < zcVar.topMargin) {
            i4 = zcVar.topMargin;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            if (i5 < zcVar.bottomMargin) {
                i4 = Math.max(0, i4 - (zcVar.bottomMargin - i5));
            }
        }
        return paddingTop + i4;
    }

    private final int H(View view, int i, int[] iArr, int i2) {
        zc zcVar = (zc) view.getLayoutParams();
        int i3 = zcVar.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int G = G(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, G, max + measuredWidth, view.getMeasuredHeight() + G);
        return max + measuredWidth + zcVar.rightMargin;
    }

    private final int I(View view, int i, int[] iArr, int i2) {
        zc zcVar = (zc) view.getLayoutParams();
        int i3 = zcVar.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int G = G(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, G, max, view.getMeasuredHeight() + G);
        return max - (measuredWidth + zcVar.leftMargin);
    }

    private final int J(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private final void K(List list, int i) {
        int layoutDirection = getLayoutDirection();
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (layoutDirection != 1) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                zc zcVar = (zc) childAt.getLayoutParams();
                if (zcVar.b == 0 && Q(childAt) && F(zcVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        while (true) {
            childCount--;
            if (childCount < 0) {
                return;
            }
            View childAt2 = getChildAt(childCount);
            zc zcVar2 = (zc) childAt2.getLayoutParams();
            if (zcVar2.b == 0 && Q(childAt2) && F(zcVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    private final void L(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        zc zcVar = layoutParams == null ? new zc() : !checkLayoutParams(layoutParams) ? E(layoutParams) : (zc) layoutParams;
        zcVar.b = 1;
        if (!z || this.h == null) {
            addView(view, zcVar);
        } else {
            view.setLayoutParams(zcVar);
            this.u.add(view);
        }
    }

    private final void M() {
        if (this.d == null) {
            this.d = new AppCompatImageView(getContext());
        }
    }

    private final void N() {
        n();
        ActionMenuView actionMenuView = this.a;
        if (actionMenuView.a == null) {
            Menu d = actionMenuView.d();
            if (this.z == null) {
                this.z = new zb(this);
            }
            this.a.c.r();
            ((od) d).h(this.z, this.i);
            z();
        }
    }

    private final void O() {
        if (this.D == null) {
            this.D = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            zc zcVar = new zc();
            zcVar.a = (this.m & 112) | 8388611;
            this.D.setLayoutParams(zcVar);
        }
    }

    private final boolean P(View view) {
        return view.getParent() == this || this.u.contains(view);
    }

    private final boolean Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static final int R(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    private static final int S(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private final void T(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean A() {
        zb zbVar = this.z;
        return (zbVar == null || zbVar.b == null) ? false : true;
    }

    public final boolean B() {
        pt ptVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (ptVar = actionMenuView.c) == null || !ptVar.m()) ? false : true;
    }

    public final boolean C() {
        ActionMenuView actionMenuView = this.a;
        return actionMenuView != null && actionMenuView.j();
    }

    public final boolean D() {
        pt ptVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (ptVar = actionMenuView.c) == null || !ptVar.p()) ? false : true;
    }

    public final int b() {
        wy wyVar = this.r;
        if (wyVar != null) {
            return wyVar.g ? wyVar.b : wyVar.a;
        }
        return 0;
    }

    public final int c() {
        od odVar;
        ActionMenuView actionMenuView = this.a;
        return (actionMenuView == null || (odVar = actionMenuView.a) == null || !odVar.hasVisibleItems()) ? hy() : Math.max(hy(), Math.max(this.G, 0));
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof zc);
    }

    public final int d() {
        return e() != null ? Math.max(b(), Math.max(this.F, 0)) : b();
    }

    public final Drawable e() {
        ImageButton imageButton = this.D;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public final Drawable f() {
        N();
        ActionMenuView actionMenuView = this.a;
        actionMenuView.d();
        po poVar = actionMenuView.c.h;
        if (poVar != null) {
            return poVar.getDrawable();
        }
        return null;
    }

    public final sp g() {
        if (this.O == null) {
            this.O = new zi(this, true);
        }
        return this.O;
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new zc();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new zc(getContext(), attributeSet);
    }

    public final Menu h() {
        N();
        return this.a.d();
    }

    public final int hy() {
        wy wyVar = this.r;
        if (wyVar != null) {
            return wyVar.g ? wyVar.a : wyVar.b;
        }
        return 0;
    }

    public final MenuInflater i() {
        return new nj(getContext());
    }

    public final CharSequence j() {
        ImageButton imageButton = this.D;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        Menu h = h();
        for (int i = 0; i < h.size(); i++) {
            arrayList.add(h.getItem(i));
        }
        return arrayList;
    }

    public final void l() {
        zb zbVar = this.z;
        og ogVar = zbVar == null ? null : zbVar.b;
        if (ogVar != null) {
            ogVar.collapseActionView();
        }
    }

    public final void m() {
        if (this.r == null) {
            this.r = new wy();
        }
    }

    public final void n() {
        if (this.a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.a = actionMenuView;
            actionMenuView.g(this.j);
            ActionMenuView actionMenuView2 = this.a;
            actionMenuView2.e = this.S;
            actionMenuView2.f(this.A, new yy(this));
            zc zcVar = new zc();
            zcVar.a = (this.m & 112) | 8388613;
            this.a.setLayoutParams(zcVar);
            L(this.a, false);
        }
    }

    public void o(int i) {
        i().inflate(i, h());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        z();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.R);
        z();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.L = false;
            actionMasked = 9;
        }
        if (!this.L) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.L = true;
                }
                if (i != 10 || i == 3) {
                    this.L = false;
                }
                return true;
            }
        }
        i = actionMasked;
        if (i != 10) {
        }
        this.L = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02c0 A[LOOP:0: B:45:0x02be->B:46:0x02c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02de A[LOOP:1: B:49:0x02dc->B:50:0x02de, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0305 A[LOOP:2: B:53:0x0303->B:54:0x0305, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0355 A[LOOP:3: B:62:0x0353->B:63:0x0355, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0241  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean a = zu.a(this);
        int i9 = !a ? 1 : 0;
        int i10 = 0;
        if (Q(this.D)) {
            T(this.D, i, 0, i2, this.E);
            i3 = this.D.getMeasuredWidth() + R(this.D);
            i4 = Math.max(0, this.D.getMeasuredHeight() + S(this.D));
            i5 = View.combineMeasuredStates(0, this.D.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (Q(this.g)) {
            T(this.g, i, 0, i2, this.E);
            i3 = this.g.getMeasuredWidth() + R(this.g);
            i4 = Math.max(i4, this.g.getMeasuredHeight() + S(this.g));
            i5 = View.combineMeasuredStates(i5, this.g.getMeasuredState());
        }
        int[] iArr = this.N;
        int d = d();
        int max = Math.max(d, i3);
        iArr[a ? 1 : 0] = Math.max(0, d - i3);
        if (Q(this.a)) {
            T(this.a, i, max, i2, this.E);
            i6 = this.a.getMeasuredWidth() + R(this.a);
            i4 = Math.max(i4, this.a.getMeasuredHeight() + S(this.a));
            i5 = View.combineMeasuredStates(i5, this.a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int c = c();
        int max2 = max + Math.max(c, i6);
        iArr[i9] = Math.max(0, c - i6);
        if (Q(this.h)) {
            max2 += J(this.h, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.h.getMeasuredHeight() + S(this.h));
            i5 = View.combineMeasuredStates(i5, this.h.getMeasuredState());
        }
        if (Q(this.d)) {
            max2 += J(this.d, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.d.getMeasuredHeight() + S(this.d));
            i5 = View.combineMeasuredStates(i5, this.d.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((zc) childAt.getLayoutParams()).b == 0 && Q(childAt)) {
                max2 += J(childAt, i, max2, i2, 0, iArr);
                int max3 = Math.max(i4, childAt.getMeasuredHeight() + S(childAt));
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
                i4 = max3;
            } else {
                max2 = max2;
            }
        }
        int i12 = max2;
        int i13 = this.p + this.q;
        int i14 = this.n + this.o;
        if (Q(this.b)) {
            J(this.b, i, i12 + i14, i2, i13, iArr);
            i10 = this.b.getMeasuredWidth() + R(this.b);
            int measuredHeight = this.b.getMeasuredHeight() + S(this.b);
            i7 = View.combineMeasuredStates(i5, this.b.getMeasuredState());
            i8 = measuredHeight;
        } else {
            i7 = i5;
            i8 = 0;
        }
        if (Q(this.c)) {
            i10 = Math.max(i10, J(this.c, i, i12 + i14, i2, i13 + i8, iArr));
            i8 += this.c.getMeasuredHeight() + S(this.c);
            i7 = View.combineMeasuredStates(i7, this.c.getMeasuredState());
        }
        int max4 = Math.max(i4, i8);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i12 + i10 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & i7), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i7 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof zf)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        zf zfVar = (zf) parcelable;
        super.onRestoreInstanceState(zfVar.d);
        ActionMenuView actionMenuView = this.a;
        od odVar = actionMenuView != null ? actionMenuView.a : null;
        int i = zfVar.a;
        if (i != 0 && this.z != null && odVar != null && (findItem = odVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (zfVar.b) {
            removeCallbacks(this.R);
            post(this.R);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m();
        wy wyVar = this.r;
        boolean z = wyVar.g;
        boolean z2 = i == 1;
        if (z2 == z) {
            return;
        }
        wyVar.g = z2;
        if (!wyVar.h) {
            wyVar.a = wyVar.e;
            wyVar.b = wyVar.f;
            return;
        }
        if (z2) {
            int i2 = wyVar.d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = wyVar.e;
            }
            wyVar.a = i2;
            int i3 = wyVar.c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = wyVar.f;
            }
            wyVar.b = i3;
            return;
        }
        int i4 = wyVar.c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = wyVar.e;
        }
        wyVar.a = i4;
        int i5 = wyVar.d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = wyVar.f;
        }
        wyVar.b = i5;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        og ogVar;
        zf zfVar = new zf(super.onSaveInstanceState());
        zb zbVar = this.z;
        if (zbVar != null && (ogVar = zbVar.b) != null) {
            zfVar.a = ogVar.a;
        }
        zfVar.b = C();
        return zfVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = false;
            actionMasked = 0;
        }
        if (!this.K) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.K = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.K = false;
        }
        return true;
    }

    public final void p(Drawable drawable) {
        if (drawable != null) {
            M();
            if (!P(this.d)) {
                L(this.d, true);
            }
        } else {
            ImageView imageView = this.d;
            if (imageView != null && P(imageView)) {
                removeView(this.d);
                this.u.remove(this.d);
            }
        }
        ImageView imageView2 = this.d;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public final void q(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            O();
        }
        ImageButton imageButton = this.D;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.D.setTooltipText(charSequence);
        }
    }

    public final void r(int i) {
        s(ku.a(getContext(), i));
    }

    public void s(Drawable drawable) {
        if (drawable != null) {
            O();
            if (!P(this.D)) {
                L(this.D, true);
            }
        } else {
            ImageButton imageButton = this.D;
            if (imageButton != null && P(imageButton)) {
                removeView(this.D);
                this.u.remove(this.D);
            }
        }
        ImageButton imageButton2 = this.D;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void t(View.OnClickListener onClickListener) {
        O();
        this.D.setOnClickListener(onClickListener);
    }

    public final void u(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void v(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.c;
            if (textView != null && P(textView)) {
                removeView(this.c);
                this.u.remove(this.c);
            }
        } else {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.J;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!P(this.c)) {
                L(this.c, true);
            }
        }
        TextView textView2 = this.c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.t = charSequence;
    }

    public final void w(int i) {
        x(getContext().getText(i));
    }

    public void x(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.b;
            if (textView != null && P(textView)) {
                removeView(this.b);
                this.u.remove(this.b);
            }
        } else {
            if (this.b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.k;
                if (i != 0) {
                    this.b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.I;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
            }
            if (!P(this.b)) {
                L(this.b, true);
            }
        }
        TextView textView2 = this.b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.s = charSequence;
    }

    public final void y(ColorStateList colorStateList) {
        this.I = colorStateList;
        TextView textView = this.b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final void z() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            findOnBackInvokedDispatcher = findOnBackInvokedDispatcher();
            if (!A() || findOnBackInvokedDispatcher == null || !isAttachedToWindow() || !this.C) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.Q;
                if (onBackInvokedDispatcher != null) {
                    onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.P);
                    this.Q = null;
                    return;
                }
                return;
            }
            if (this.Q == null) {
                if (this.P == null) {
                    final Runnable runnable = new Runnable() { // from class: yu
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.l();
                        }
                    };
                    this.P = new OnBackInvokedCallback() { // from class: za
                        public final void onBackInvoked() {
                            runnable.run();
                        }
                    };
                }
                findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, this.P);
                this.Q = findOnBackInvokedDispatcher;
            }
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return E(layoutParams);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = 8388627;
        this.M = new ArrayList();
        this.u = new ArrayList();
        this.N = new int[2];
        this.v = new ktv(new Runnable() { // from class: yv
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar toolbar = Toolbar.this;
                ArrayList arrayList = toolbar.w;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    toolbar.h().removeItem(((MenuItem) arrayList.get(i2)).getItemId());
                }
                Menu h = toolbar.h();
                ArrayList k = toolbar.k();
                toolbar.v.a(h, toolbar.i());
                ArrayList k2 = toolbar.k();
                k2.removeAll(k);
                toolbar.w = k2;
            }
        });
        this.w = new ArrayList();
        this.S = new yw(this);
        this.R = new yx(this);
        yt l = yt.l(getContext(), attributeSet, kt.A, i, 0);
        kvo.o(this, context, kt.A, attributeSet, l.b, i, 0);
        this.k = l.f(28, 0);
        this.l = l.f(19, 0);
        this.H = l.d(0, this.H);
        this.m = l.d(2, 48);
        int a = l.a(22, 0);
        a = l.q(27) ? l.a(27, a) : a;
        this.q = a;
        this.p = a;
        this.o = a;
        this.n = a;
        int a2 = l.a(25, -1);
        if (a2 >= 0) {
            this.n = a2;
        }
        int a3 = l.a(24, -1);
        if (a3 >= 0) {
            this.o = a3;
        }
        int a4 = l.a(26, -1);
        if (a4 >= 0) {
            this.p = a4;
        }
        int a5 = l.a(23, -1);
        if (a5 >= 0) {
            this.q = a5;
        }
        this.E = l.b(13, -1);
        int a6 = l.a(9, Integer.MIN_VALUE);
        int a7 = l.a(5, Integer.MIN_VALUE);
        int b = l.b(7, 0);
        int b2 = l.b(8, 0);
        m();
        wy wyVar = this.r;
        wyVar.h = false;
        if (b != Integer.MIN_VALUE) {
            wyVar.e = b;
            wyVar.a = b;
        }
        if (b2 != Integer.MIN_VALUE) {
            wyVar.f = b2;
            wyVar.b = b2;
        }
        if (a6 != Integer.MIN_VALUE || a7 != Integer.MIN_VALUE) {
            wyVar.a(a6, a7);
        }
        this.F = l.a(10, Integer.MIN_VALUE);
        this.G = l.a(6, Integer.MIN_VALUE);
        this.e = l.h(4);
        this.f = l.m(3);
        CharSequence m = l.m(21);
        if (!TextUtils.isEmpty(m)) {
            x(m);
        }
        CharSequence m2 = l.m(18);
        if (!TextUtils.isEmpty(m2)) {
            v(m2);
        }
        this.i = getContext();
        u(l.f(17, 0));
        Drawable h = l.h(16);
        if (h != null) {
            s(h);
        }
        CharSequence m3 = l.m(15);
        if (!TextUtils.isEmpty(m3)) {
            q(m3);
        }
        Drawable h2 = l.h(11);
        if (h2 != null) {
            p(h2);
        }
        CharSequence m4 = l.m(12);
        if (!TextUtils.isEmpty(m4)) {
            if (!TextUtils.isEmpty(m4)) {
                M();
            }
            ImageView imageView = this.d;
            if (imageView != null) {
                imageView.setContentDescription(m4);
            }
        }
        if (l.q(29)) {
            y(l.g(29));
        }
        if (l.q(20)) {
            ColorStateList g = l.g(20);
            this.J = g;
            TextView textView = this.c;
            if (textView != null) {
                textView.setTextColor(g);
            }
        }
        if (l.q(14)) {
            o(l.f(14, 0));
        }
        l.o();
    }
}
