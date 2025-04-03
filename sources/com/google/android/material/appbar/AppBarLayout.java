package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.egyv;
import defpackage.egze;
import defpackage.egzf;
import defpackage.egzg;
import defpackage.egzi;
import defpackage.egzj;
import defpackage.egzk;
import defpackage.egzl;
import defpackage.egzm;
import defpackage.egzv;
import defpackage.egzw;
import defpackage.egzx;
import defpackage.ehaa;
import defpackage.ehdr;
import defpackage.ehfy;
import defpackage.ehiz;
import defpackage.ehjz;
import defpackage.ehmp;
import defpackage.ehmq;
import defpackage.ehop;
import defpackage.ehoq;
import defpackage.ehua;
import defpackage.kks;
import defpackage.kkt;
import defpackage.kkw;
import defpackage.kqp;
import defpackage.kty;
import defpackage.kvd;
import defpackage.kvo;
import defpackage.kxh;
import defpackage.kzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class AppBarLayout extends LinearLayout implements kks {
    public boolean a;
    public int b;
    public kxh c;
    public boolean d;
    public boolean e;
    public final List f;
    public Drawable g;
    public Integer h;
    private int i;
    private int j;
    private int k;
    private int l;
    private List m;
    private boolean n;
    private int o;
    private WeakReference p;
    private final boolean q;
    private ValueAnimator r;
    private ValueAnimator.AnimatorUpdateListener s;
    private final long t;
    private final TimeInterpolator u;
    private int[] v;
    private final float w;
    private Behavior x;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: PG */
    public static class BaseBehavior<T extends AppBarLayout> extends egzv<T> {
        public int a;
        private int c;
        private ValueAnimator d;
        private egzi e;
        private WeakReference f;

        public BaseBehavior() {
        }

        public static final View F(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((kkw) childAt.getLayoutParams()).a instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private final void K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            if (kvo.a(coordinatorLayout) != null) {
                return;
            }
            kvo.p(coordinatorLayout, new egzg(this, appBarLayout, coordinatorLayout));
        }

        private final void L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            int g = appBarLayout.g() + appBarLayout.getPaddingTop();
            int z = z() - g;
            int childCount = appBarLayout.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    i = -1;
                    break;
                }
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                egzm egzmVar = (egzm) childAt.getLayoutParams();
                if (M(egzmVar.a, 32)) {
                    top -= egzmVar.topMargin;
                    bottom += egzmVar.bottomMargin;
                }
                int i2 = -z;
                if (top <= i2 && bottom >= i2) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                View childAt2 = appBarLayout.getChildAt(i);
                egzm egzmVar2 = (egzm) childAt2.getLayoutParams();
                int i3 = egzmVar2.a;
                if ((i3 & 17) == 17) {
                    int i4 = -childAt2.getTop();
                    int i5 = -childAt2.getBottom();
                    if (i == 0 && appBarLayout.getFitsSystemWindows() && childAt2.getFitsSystemWindows()) {
                        i4 -= appBarLayout.g();
                    }
                    if (M(i3, 2)) {
                        i5 += childAt2.getMinimumHeight();
                    } else if (M(i3, 5)) {
                        int minimumHeight = childAt2.getMinimumHeight() + i5;
                        if (z < minimumHeight) {
                            i4 = minimumHeight;
                        } else {
                            i5 = minimumHeight;
                        }
                    }
                    if (M(i3, 32)) {
                        i4 += egzmVar2.topMargin;
                        i5 -= egzmVar2.bottomMargin;
                    }
                    if (z < (i5 + i4) / 2) {
                        i4 = i5;
                    }
                    N(coordinatorLayout, appBarLayout, kqp.b(i4 + g, -appBarLayout.h(), 0));
                }
            }
        }

        private static boolean M(int i, int i2) {
            return (i & i2) == i2;
        }

        private final void N(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            float abs = Math.abs(z() - i);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int z = z();
            if (z == i) {
                ValueAnimator valueAnimator = this.d;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.d.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.d;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.d = valueAnimator3;
                valueAnimator3.setInterpolator(egyv.e);
                this.d.addUpdateListener(new egzf(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.d.setDuration(Math.min(round, 600));
            this.d.setIntValues(z, i);
            this.d.start();
        }

        private static final View O(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof kty) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        private static final void P(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            View view;
            boolean z2;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    view = null;
                    break;
                }
                view = appBarLayout.getChildAt(i3);
                if (abs >= view.getTop() && abs <= view.getBottom()) {
                    break;
                } else {
                    i3++;
                }
            }
            if (view != null) {
                int i4 = ((egzm) view.getLayoutParams()).a;
                if ((i4 & 1) != 0) {
                    int minimumHeight = view.getMinimumHeight();
                    z2 = true;
                    if (i2 > 0) {
                    }
                }
            }
            z2 = false;
            if (appBarLayout.e) {
                z2 = appBarLayout.p(O(coordinatorLayout));
            }
            boolean r = appBarLayout.r(z2);
            if (!z) {
                if (r) {
                    ArrayList a = coordinatorLayout.e.a(appBarLayout);
                    List arrayList = a != null ? new ArrayList(a) : null;
                    if (arrayList == null) {
                        arrayList = Collections.EMPTY_LIST;
                    }
                    int size = arrayList.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        kkt kktVar = ((kkw) ((View) arrayList.get(i5)).getLayoutParams()).a;
                        if (kktVar instanceof ScrollingViewBehavior) {
                            if (((ScrollingViewBehavior) kktVar).d == 0) {
                                return;
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if (appBarLayout.getBackground() != null) {
                appBarLayout.getBackground().jumpToCurrentState();
            }
            if (appBarLayout.getForeground() != null) {
                appBarLayout.getForeground().jumpToCurrentState();
            }
            if (appBarLayout.getStateListAnimator() != null) {
                appBarLayout.getStateListAnimator().jumpToCurrentState();
            }
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ int A(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            int i4;
            int i5;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int z = z();
            int i6 = 0;
            if (i2 == 0 || z < i2 || z > i3) {
                this.a = 0;
            } else {
                int b = kqp.b(i, i2, i3);
                if (z != b) {
                    if (appBarLayout.a) {
                        int abs = Math.abs(b);
                        int childCount = appBarLayout.getChildCount();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i7);
                            egzm egzmVar = (egzm) childAt.getLayoutParams();
                            Interpolator interpolator = egzmVar.c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i7++;
                            } else if (interpolator != null) {
                                int i8 = egzmVar.a;
                                if ((i8 & 1) != 0) {
                                    i5 = childAt.getHeight() + egzmVar.topMargin + egzmVar.bottomMargin;
                                    if ((i8 & 2) != 0) {
                                        i5 -= childAt.getMinimumHeight();
                                    }
                                } else {
                                    i5 = 0;
                                }
                                if (childAt.getFitsSystemWindows()) {
                                    i5 -= appBarLayout.g();
                                }
                                if (i5 > 0) {
                                    float f = i5;
                                    i4 = Integer.signum(b) * (childAt.getTop() + Math.round(f * interpolator.getInterpolation((abs - childAt.getTop()) / f)));
                                }
                            }
                        }
                    }
                    i4 = b;
                    boolean J = J(i4);
                    int i9 = z - b;
                    this.a = b - i4;
                    if (J) {
                        for (int i10 = 0; i10 < appBarLayout.getChildCount(); i10++) {
                            egzm egzmVar2 = (egzm) appBarLayout.getChildAt(i10).getLayoutParams();
                            egzk egzkVar = egzmVar2.b;
                            if (egzkVar != null && (egzmVar2.a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i10);
                                float I = I();
                                egzl egzlVar = (egzl) egzkVar;
                                Rect rect = egzlVar.a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.g());
                                float abs2 = egzlVar.a.top - Math.abs(I);
                                if (abs2 <= 0.0f) {
                                    float a = 1.0f - kqp.a(Math.abs(abs2 / egzlVar.a.height()), 0.0f, 1.0f);
                                    float height = (-abs2) - ((egzlVar.a.height() * 0.3f) * (1.0f - (a * a)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(egzlVar.b);
                                    egzlVar.b.offset(0, (int) (-height));
                                    if (height >= egzlVar.b.height()) {
                                        childAt2.setAlpha(0.0f);
                                    } else {
                                        childAt2.setAlpha(1.0f);
                                    }
                                    childAt2.setClipBounds(egzlVar.b);
                                } else {
                                    childAt2.setClipBounds(null);
                                    childAt2.setTranslationY(0.0f);
                                    childAt2.setAlpha(1.0f);
                                }
                            }
                        }
                    } else if (appBarLayout.a) {
                        coordinatorLayout.b(appBarLayout);
                    }
                    appBarLayout.k(I());
                    P(coordinatorLayout, appBarLayout, b, b < z ? -1 : 1, false);
                    i6 = i9;
                }
            }
            K(coordinatorLayout, appBarLayout);
            return i6;
        }

        final egzi B(Parcelable parcelable, AppBarLayout appBarLayout) {
            int I = I();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int bottom = childAt.getBottom() + I;
                if (childAt.getTop() + I <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = kzu.c;
                    }
                    egzi egziVar = new egzi(parcelable);
                    boolean z = I == 0;
                    egziVar.b = z;
                    egziVar.a = !z && (-I) >= appBarLayout.h();
                    egziVar.e = i;
                    egziVar.g = bottom == childAt.getMinimumHeight() + appBarLayout.g();
                    egziVar.f = bottom / childAt.getHeight();
                    return egziVar;
                }
            }
            return null;
        }

        @Override // defpackage.egzv
        public final /* synthetic */ void C(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            L(coordinatorLayout, appBarLayout);
            if (appBarLayout.e) {
                appBarLayout.r(appBarLayout.p(O(coordinatorLayout)));
            }
        }

        final void D(egzi egziVar, boolean z) {
            if (this.e == null || z) {
                this.e = egziVar;
            }
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ boolean E(View view) {
            WeakReference weakReference = this.f;
            if (weakReference == null) {
                return true;
            }
            View view2 = (View) weakReference.get();
            return (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
        }

        @Override // defpackage.egzy, defpackage.kkt
        public final /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.g(coordinatorLayout, appBarLayout, i);
            int i2 = appBarLayout.b;
            egzi egziVar = this.e;
            if (egziVar == null || (i2 & 8) != 0) {
                if (i2 != 0) {
                    int i3 = i2 & 4;
                    if ((i2 & 2) != 0) {
                        int i4 = -appBarLayout.h();
                        if (i3 != 0) {
                            N(coordinatorLayout, appBarLayout, i4);
                        } else {
                            H(coordinatorLayout, appBarLayout, i4);
                        }
                    } else if ((i2 & 1) != 0) {
                        if (i3 != 0) {
                            N(coordinatorLayout, appBarLayout, 0);
                        } else {
                            H(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (egziVar.a) {
                H(coordinatorLayout, appBarLayout, -appBarLayout.h());
            } else if (egziVar.b) {
                H(coordinatorLayout, appBarLayout, 0);
            } else {
                View childAt = appBarLayout.getChildAt(egziVar.e);
                H(coordinatorLayout, appBarLayout, (-childAt.getBottom()) + (this.e.g ? childAt.getMinimumHeight() + appBarLayout.g() : Math.round(childAt.getHeight() * this.e.f)));
            }
            appBarLayout.b = 0;
            this.e = null;
            J(kqp.b(I(), -appBarLayout.h(), 0));
            P(coordinatorLayout, appBarLayout, I(), 0, true);
            appBarLayout.k(I());
            K(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // defpackage.kkt
        public final /* bridge */ /* synthetic */ boolean n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((kkw) appBarLayout.getLayoutParams()).height != -2) {
                return false;
            }
            coordinatorLayout.m(appBarLayout, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0));
            return true;
        }

        @Override // defpackage.kkt
        public final /* bridge */ /* synthetic */ void q(View view, Parcelable parcelable) {
            if (!(parcelable instanceof egzi)) {
                this.e = null;
            } else {
                D((egzi) parcelable, true);
                Parcelable parcelable2 = this.e.d;
            }
        }

        @Override // defpackage.kkt
        public final /* bridge */ /* synthetic */ Parcelable r(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            egzi B = B(absSavedState, (AppBarLayout) view);
            return B == null ? absSavedState : B;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
        @Override // defpackage.kkt
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void c(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.appbar.AppBarLayout r8, android.view.View r9, int r10, int r11, int[] r12, int r13) {
            /*
                r6 = this;
                if (r11 == 0) goto L25
                if (r11 >= 0) goto Lf
                int r10 = r8.h()
                int r10 = -r10
                int r13 = r8.d()
                int r13 = r13 + r10
                goto L15
            Lf:
                int r10 = r8.h()
                int r10 = -r10
                r13 = 0
            L15:
                r4 = r10
                r5 = r13
                if (r4 == r5) goto L25
                r10 = 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r11
                int r7 = r0.G(r1, r2, r3, r4, r5)
                r12[r10] = r7
                goto L26
            L25:
                r2 = r8
            L26:
                boolean r7 = r2.e
                if (r7 == 0) goto L31
                boolean r7 = r2.p(r9)
                r2.r(r7)
            L31:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.c(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, android.view.View, int, int, int[], int):void");
        }

        @Override // defpackage.kkt
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            CoordinatorLayout coordinatorLayout2;
            AppBarLayout appBarLayout2;
            int i6;
            if (i4 < 0) {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i6 = i4;
                iArr[1] = G(coordinatorLayout2, appBarLayout2, i6, -appBarLayout.e(), 0);
            } else {
                coordinatorLayout2 = coordinatorLayout;
                appBarLayout2 = appBarLayout;
                i6 = i4;
            }
            if (i6 == 0) {
                K(coordinatorLayout2, appBarLayout2);
            }
        }

        @Override // defpackage.kkt
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void e(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            if (this.c == 0 || i == 1) {
                L(coordinatorLayout, appBarLayout);
                if (appBarLayout.e) {
                    appBarLayout.r(appBarLayout.p(view));
                }
            }
            this.f = new WeakReference(view);
        }

        @Override // defpackage.kkt
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public boolean i(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            int i3 = i & 2;
            boolean z = false;
            if (i3 != 0 && (appBarLayout.e || appBarLayout.d || (appBarLayout.h() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight()))) {
                z = true;
            }
            if (z && (valueAnimator = this.d) != null) {
                valueAnimator.cancel();
            }
            this.f = null;
            this.c = i2;
            return z;
        }

        @Override // defpackage.egzv
        public final /* bridge */ /* synthetic */ int x(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            return (-appBarLayout.e()) + appBarLayout.g();
        }

        @Override // defpackage.egzv
        public final /* synthetic */ int y(View view) {
            return ((AppBarLayout) view).h();
        }

        @Override // defpackage.egzv
        public final int z() {
            return I() + this.a;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* compiled from: PG */
    public static class ScrollingViewBehavior extends egzw {
        public ScrollingViewBehavior() {
        }

        static final AppBarLayout w(List list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = (View) list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // defpackage.egzy, defpackage.kkt
        public /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.g(coordinatorLayout, view, i);
            return true;
        }

        @Override // defpackage.kkt
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout w = w(coordinatorLayout.a(view));
            if (w != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = this.a;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    w.n(false, !z);
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.kkt
        public final boolean k(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // defpackage.kkt
        public void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            kkt kktVar = ((kkw) view2.getLayoutParams()).a;
            if (kktVar instanceof BaseBehavior) {
                int bottom = (((view2.getBottom() - view.getTop()) + ((BaseBehavior) kktVar).a) + this.c) - x(view2);
                int[] iArr = kvo.a;
                view.offsetTopAndBottom(bottom);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.e) {
                    appBarLayout.r(appBarLayout.p(view));
                }
            }
        }

        @Override // defpackage.kkt
        public final void m(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                kvo.p(coordinatorLayout, null);
            }
        }

        @Override // defpackage.kkt
        public final /* bridge */ /* synthetic */ boolean n(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
            kxh kxhVar;
            int i4 = view.getLayoutParams().height;
            if (i4 != -1) {
                if (i4 != -2) {
                    return false;
                }
                i4 = -2;
            }
            View v = v(coordinatorLayout.a(view));
            if (v == null) {
                return false;
            }
            int size = View.MeasureSpec.getSize(i3);
            if (size <= 0) {
                size = coordinatorLayout.getHeight();
            } else if (v.getFitsSystemWindows() && (kxhVar = coordinatorLayout.f) != null) {
                size += kxhVar.d() + kxhVar.a();
            }
            int u = size + u(v);
            int measuredHeight = v.getMeasuredHeight();
            if (z()) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                u -= measuredHeight;
            }
            coordinatorLayout.m(view, i, i2, View.MeasureSpec.makeMeasureSpec(u, i4 == -1 ? 1073741824 : Integer.MIN_VALUE));
            return true;
        }

        @Override // defpackage.egzw
        public final float t(View view) {
            int i;
            if (!(view instanceof AppBarLayout)) {
                return 0.0f;
            }
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int h = appBarLayout.h();
            int d = appBarLayout.d();
            kkt kktVar = ((kkw) appBarLayout.getLayoutParams()).a;
            int z = kktVar instanceof BaseBehavior ? ((BaseBehavior) kktVar).z() : 0;
            if ((d == 0 || h + z > d) && (i = h - d) != 0) {
                return (z / i) + 1.0f;
            }
            return 0.0f;
        }

        @Override // defpackage.egzw
        public final int u(View view) {
            return ((AppBarLayout) view).h();
        }

        @Override // defpackage.egzw
        public final /* bridge */ /* synthetic */ View v(List list) {
            return w(list);
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, egzx.f);
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    private final void b() {
        Behavior behavior = this.x;
        egzi egziVar = null;
        if (behavior != null && this.j != -1 && this.b == 0) {
            egziVar = behavior.B(kzu.c, this);
        }
        this.j = -1;
        this.k = -1;
        this.l = -1;
        if (egziVar != null) {
            this.x.D(egziVar, false);
        }
    }

    private final void c(boolean z, boolean z2, boolean z3) {
        this.b = (true != z ? 2 : 1) | (true != z2 ? 0 : 4) | (true == z3 ? 8 : 0);
        requestLayout();
    }

    protected static egzm q(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new egzm((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new egzm((ViewGroup.MarginLayoutParams) layoutParams) : new egzm(layoutParams);
    }

    private final void s(float f, float f2) {
        ValueAnimator valueAnimator = this.r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        this.r = ofFloat;
        ofFloat.setDuration(this.t);
        this.r.setInterpolator(this.u);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.s;
        if (animatorUpdateListener != null) {
            this.r.addUpdateListener(animatorUpdateListener);
        }
        this.r.start();
    }

    private final boolean t() {
        return this.g != null && g() > 0;
    }

    private final boolean u() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                return true;
            }
        }
        return false;
    }

    public kkt a() {
        Behavior behavior = new Behavior();
        this.x = behavior;
        return behavior;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof egzm;
    }

    public final int d() {
        int i;
        int minimumHeight;
        int i2 = this.k;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                egzm egzmVar = (egzm) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = egzmVar.a;
                if ((i4 & 5) != 5) {
                    if (i3 > 0) {
                        break;
                    }
                } else {
                    int i5 = egzmVar.topMargin + egzmVar.bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i = Math.min(i, measuredHeight - g());
                        }
                        i3 += i;
                    }
                    i = i5 + minimumHeight;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - g());
                    }
                    i3 += i;
                }
            }
        }
        int max = Math.max(0, i3);
        this.k = max;
        return max;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (t()) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.i);
            this.g.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.g;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    final int e() {
        int i = this.l;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                egzm egzmVar = (egzm) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + egzmVar.topMargin + egzmVar.bottomMargin;
                int i4 = egzmVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.l = max;
        return max;
    }

    public final int f() {
        int g = g();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight == 0) {
            int childCount = getChildCount();
            minimumHeight = childCount > 0 ? getChildAt(childCount - 1).getMinimumHeight() : 0;
            if (minimumHeight == 0) {
                return getHeight() / 3;
            }
        }
        return minimumHeight + minimumHeight + g;
    }

    final int g() {
        kxh kxhVar = this.c;
        if (kxhVar != null) {
            return kxhVar.d();
        }
        return 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new egzm();
    }

    public final int h() {
        int i = this.j;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                egzm egzmVar = (egzm) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = egzmVar.a;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + egzmVar.topMargin + egzmVar.bottomMargin;
                if (i2 == 0) {
                    if (childAt.getFitsSystemWindows()) {
                        i3 -= g();
                    }
                    i2 = 0;
                }
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
            }
            i2++;
        }
        int max = Math.max(0, i3);
        this.j = max;
        return max;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final egzm generateLayoutParams(AttributeSet attributeSet) {
        return new egzm(getContext(), attributeSet);
    }

    public final void j(egzj egzjVar) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        if (egzjVar == null || this.m.contains(egzjVar)) {
            return;
        }
        this.m.add(egzjVar);
    }

    final void k(int i) {
        this.i = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.m;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                egzj egzjVar = (egzj) this.m.get(i2);
                if (egzjVar != null) {
                    egzjVar.hj(this, i);
                }
            }
        }
    }

    public final void l(egzj egzjVar) {
        List list = this.m;
        if (list != null) {
            list.remove(egzjVar);
        }
    }

    public final void m(boolean z) {
        n(z, isLaidOut());
    }

    public final void n(boolean z, boolean z2) {
        c(z, z2, true);
    }

    public final void o() {
        setWillNotDraw(!t());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ehoq.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final int[] onCreateDrawableState(int i) {
        boolean z;
        if (this.v == null) {
            this.v = new int[4];
        }
        int[] iArr = this.v;
        int length = iArr.length;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 4);
        boolean z2 = this.n;
        boolean z3 = false;
        iArr[0] = true != z2 ? -2130970596 : R.attr.state_liftable;
        if (z2) {
            r3 = this.d ? R.attr.state_lifted : -2130970597;
            z = true;
        } else {
            z = false;
            z3 = true;
        }
        iArr[1] = r3;
        iArr[2] = true != z3 ? R.attr.state_collapsible : -2130970592;
        int i2 = -2130970591;
        if (z && this.d) {
            i2 = R.attr.state_collapsed;
        }
        iArr[3] = i2;
        return mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference weakReference = this.p;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            super.onLayout(r3, r4, r5, r6, r7)
            r3 = r2
            boolean r4 = r2.getFitsSystemWindows()
            if (r4 == 0) goto L26
            boolean r4 = r2.u()
            if (r4 == 0) goto L26
            int r4 = r2.g()
            int r5 = r2.getChildCount()
        L18:
            int r5 = r5 + (-1)
            if (r5 < 0) goto L26
            android.view.View r6 = r2.getChildAt(r5)
            int[] r7 = defpackage.kvo.a
            r6.offsetTopAndBottom(r4)
            goto L18
        L26:
            r2.b()
            r4 = 0
            r3.a = r4
            int r5 = r2.getChildCount()
            r6 = r4
        L31:
            r7 = 1
            if (r6 >= r5) goto L48
            android.view.View r0 = r2.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            egzm r0 = (defpackage.egzm) r0
            android.view.animation.Interpolator r0 = r0.c
            if (r0 == 0) goto L45
            r3.a = r7
            goto L48
        L45:
            int r6 = r6 + 1
            goto L31
        L48:
            android.graphics.drawable.Drawable r5 = r3.g
            if (r5 == 0) goto L57
            int r6 = r2.getWidth()
            int r0 = r2.g()
            r5.setBounds(r4, r4, r6, r0)
        L57:
            boolean r5 = r3.e
            if (r5 != 0) goto L7a
            int r5 = r2.getChildCount()
            r6 = r4
        L60:
            if (r6 >= r5) goto L7b
            android.view.View r0 = r2.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            egzm r0 = (defpackage.egzm) r0
            int r0 = r0.a
            r1 = r0 & 1
            if (r1 != r7) goto L77
            r0 = r0 & 10
            if (r0 == 0) goto L77
            goto L7a
        L77:
            int r6 = r6 + 1
            goto L60
        L7a:
            r4 = r7
        L7b:
            boolean r5 = r3.n
            if (r5 == r4) goto L84
            r3.n = r4
            r2.refreshDrawableState()
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && u()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = kqp.b(getMeasuredHeight() + g(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += g();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        b();
    }

    final boolean p(View view) {
        int i;
        if (this.p == null && (i = this.o) != -1) {
            View findViewById = view != null ? view.findViewById(i) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.o);
            }
            if (findViewById != null) {
                this.p = new WeakReference(findViewById);
            }
        }
        WeakReference weakReference = this.p;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    public final boolean r(boolean z) {
        if (this.d == z) {
            return false;
        }
        this.d = z;
        refreshDrawableState();
        if (getBackground() instanceof ehop) {
            if (this.q) {
                s(true != z ? 1.0f : 0.0f, true == z ? 1.0f : 0.0f);
            } else if (this.e) {
                s(z ? 0.0f : this.w, z ? this.w : 0.0f);
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        ehoq.b(this, f);
    }

    @Override // android.widget.LinearLayout
    public final void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(1);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.g;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new egzm();
    }

    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(ehua.a(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        Throwable th;
        final AppBarLayout appBarLayout;
        this.j = -1;
        this.k = -1;
        this.l = -1;
        this.b = 0;
        this.f = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            int[] iArr = ehaa.a;
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        int[] iArr2 = ehaa.a;
        Context context3 = getContext();
        TypedArray a = ehiz.a(context3, attributeSet, ehaa.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
        try {
            if (a.hasValue(0)) {
                try {
                    setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, a.getResourceId(0, 0)));
                } catch (Throwable th2) {
                    th = th2;
                    a.recycle();
                    throw th;
                }
            }
            a.recycle();
            TypedArray a2 = ehiz.a(context2, attributeSet, egzx.a, i, R.style.Widget_Design_AppBarLayout, new int[0]);
            setBackground(a2.getDrawable(0));
            final ColorStateList c = ehmq.c(context2, a2, 6);
            this.q = c != null;
            final ColorStateList a3 = ehfy.a(getBackground());
            if (a3 != null) {
                final ehop ehopVar = new ehop();
                ehopVar.O(a3);
                if (c != null) {
                    final Integer h = ehdr.h(getContext(), R.attr.colorSurface);
                    appBarLayout = this;
                    appBarLayout.s = new ValueAnimator.AnimatorUpdateListener() { // from class: egzc
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            Integer num;
                            int f = ehdr.f(a3.getDefaultColor(), c.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
                            ColorStateList valueOf = ColorStateList.valueOf(f);
                            ehop ehopVar2 = ehopVar;
                            ehopVar2.O(valueOf);
                            AppBarLayout appBarLayout2 = AppBarLayout.this;
                            if (appBarLayout2.g != null && (num = appBarLayout2.h) != null && num.equals(h)) {
                                appBarLayout2.g.setTint(f);
                            }
                            if (appBarLayout2.f.isEmpty()) {
                                return;
                            }
                            for (egzn egznVar : appBarLayout2.f) {
                                if (ehopVar2.C() != null) {
                                    egznVar.a();
                                }
                            }
                        }
                    };
                    setBackground(ehopVar);
                } else {
                    appBarLayout = this;
                    ehopVar.K(context2);
                    appBarLayout.s = new ValueAnimator.AnimatorUpdateListener() { // from class: egzd
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            ehopVar.N(floatValue);
                            AppBarLayout appBarLayout2 = AppBarLayout.this;
                            Drawable drawable = appBarLayout2.g;
                            if (drawable instanceof ehop) {
                                ((ehop) drawable).N(floatValue);
                            }
                            Iterator it = appBarLayout2.f.iterator();
                            while (it.hasNext()) {
                                ((egzn) it.next()).a();
                            }
                        }
                    };
                    setBackground(ehopVar);
                }
            } else {
                appBarLayout = this;
            }
            appBarLayout.t = ehmp.a(context2, R.attr.motionDurationMedium2, getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
            appBarLayout.u = ehjz.a(context2, R.attr.motionEasingStandardInterpolator, egyv.a);
            if (a2.hasValue(4)) {
                c(a2.getBoolean(4, false), false, false);
            }
            if (a2.hasValue(3)) {
                ehaa.a(this, a2.getDimensionPixelSize(3, 0));
            }
            if (a2.hasValue(2)) {
                setKeyboardNavigationCluster(a2.getBoolean(2, false));
            }
            if (a2.hasValue(1)) {
                setTouchscreenBlocksFocus(a2.getBoolean(1, false));
            }
            appBarLayout.w = getResources().getDimension(R.dimen.design_appbar_elevation);
            appBarLayout.e = a2.getBoolean(5, false);
            appBarLayout.o = a2.getResourceId(7, -1);
            Drawable drawable = a2.getDrawable(8);
            Drawable drawable2 = appBarLayout.g;
            if (drawable2 != drawable) {
                Integer num = null;
                if (drawable2 != null) {
                    drawable2.setCallback(null);
                }
                Drawable mutate = drawable != null ? drawable.mutate() : null;
                appBarLayout.g = mutate;
                if (mutate instanceof ehop) {
                    num = Integer.valueOf(((ehop) mutate).w);
                } else {
                    ColorStateList a4 = ehfy.a(mutate);
                    if (a4 != null) {
                        num = Integer.valueOf(a4.getDefaultColor());
                    }
                }
                appBarLayout.h = num;
                Drawable drawable3 = appBarLayout.g;
                if (drawable3 != null) {
                    if (drawable3.isStateful()) {
                        appBarLayout.g.setState(getDrawableState());
                    }
                    appBarLayout.g.setLayoutDirection(getLayoutDirection());
                    appBarLayout.g.setVisible(getVisibility() == 0, false);
                    appBarLayout.g.setCallback(this);
                }
                o();
                postInvalidateOnAnimation();
            }
            a2.recycle();
            egze egzeVar = new egze(this);
            int[] iArr3 = kvo.a;
            kvd.k(this, egzeVar);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return q(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return q(layoutParams);
    }
}
