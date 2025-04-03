package defpackage;

import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.BaselineLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehkh extends FrameLayout implements ehkk {
    private static final int[] o = {R.attr.state_checked};
    private static final ehkg p = new ehkg();
    private float A;
    private int B;
    private boolean C;
    private final LinearLayout D;
    private final FrameLayout E;
    private final BaselineLayout F;
    private final TextView G;
    private final TextView H;
    private final BaselineLayout I;
    private final TextView J;
    private final TextView K;
    private BaselineLayout L;
    private int M;
    private int N;
    private int O;
    private int P;
    private ColorStateList Q;
    private boolean R;
    private ColorStateList S;
    private Drawable T;
    private Drawable U;
    private ValueAnimator V;
    private boolean W;
    public boolean a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private boolean af;
    private boolean ag;
    Drawable b;
    public final LinearLayout c;
    public final View d;
    public final ImageView e;
    public og f;
    public float g;
    public int h;
    public int i;
    public int j;
    public ehab k;
    public int l;
    public boolean m;
    public Rect n;
    private ColorStateList q;
    private int r;
    private int s;
    private int t;
    private int u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    public ehkh(Context context) {
        super(context);
        this.a = false;
        this.M = 0;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.R = false;
        this.g = 0.0f;
        this.W = false;
        this.h = 0;
        this.aa = 0;
        this.i = -2;
        this.ab = 0;
        this.j = 0;
        this.ac = 0;
        this.ad = 0;
        this.ae = 49;
        this.m = false;
        this.af = false;
        this.ag = false;
        this.n = new Rect();
        LayoutInflater.from(context).inflate(com.google.android.apps.messaging.R.layout.design_bottom_navigation_item, (ViewGroup) this, true);
        this.D = (LinearLayout) findViewById(com.google.android.apps.messaging.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.google.android.apps.messaging.R.id.navigation_bar_item_inner_content_container);
        this.c = linearLayout;
        this.d = findViewById(com.google.android.apps.messaging.R.id.navigation_bar_item_active_indicator_view);
        this.E = (FrameLayout) findViewById(com.google.android.apps.messaging.R.id.navigation_bar_item_icon_container);
        this.e = (ImageView) findViewById(com.google.android.apps.messaging.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(com.google.android.apps.messaging.R.id.navigation_bar_item_labels_group);
        this.F = baselineLayout;
        TextView textView = (TextView) findViewById(com.google.android.apps.messaging.R.id.navigation_bar_item_small_label_view);
        this.G = textView;
        TextView textView2 = (TextView) findViewById(com.google.android.apps.messaging.R.id.navigation_bar_item_large_label_view);
        this.H = textView2;
        float dimension = getResources().getDimension(com.google.android.apps.messaging.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(com.google.android.apps.messaging.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext());
        this.I = baselineLayout2;
        baselineLayout2.setVisibility(8);
        baselineLayout2.setDuplicateParentStateEnabled(true);
        baselineLayout2.a = this.af;
        TextView textView3 = new TextView(getContext());
        this.J = textView3;
        textView3.setMaxLines(1);
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setDuplicateParentStateEnabled(true);
        textView3.setIncludeFontPadding(false);
        textView3.setGravity(16);
        textView3.setTextSize(dimension);
        TextView textView4 = new TextView(getContext());
        this.K = textView4;
        textView4.setMaxLines(1);
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        textView4.setDuplicateParentStateEnabled(true);
        textView4.setVisibility(4);
        textView4.setIncludeFontPadding(false);
        textView4.setGravity(16);
        textView4.setTextSize(dimension2);
        baselineLayout2.addView(textView3);
        baselineLayout2.addView(textView4);
        this.L = baselineLayout;
        setBackgroundResource(com.google.android.apps.messaging.R.drawable.mtrl_navigation_bar_item_background);
        this.r = getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.design_bottom_navigation_margin);
        this.s = baselineLayout.getPaddingBottom();
        this.t = 0;
        this.u = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        textView3.setImportantForAccessibility(2);
        textView4.setImportantForAccessibility(2);
        setFocusable(true);
        P();
        this.ab = getResources().getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ehkd
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ehkh ehkhVar = ehkh.this;
                if (ehkhVar.e.getVisibility() == 0) {
                    ImageView imageView = ehkhVar.e;
                    if (ehkhVar.O()) {
                        ehaf.a(ehkhVar.k, imageView);
                    }
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ehkhVar.c.getLayoutParams();
                int i9 = (i3 - i) + layoutParams.rightMargin + layoutParams.leftMargin;
                int i10 = (i4 - i2) + layoutParams.topMargin + layoutParams.bottomMargin;
                boolean z = true;
                if (ehkhVar.l == 1 && ehkhVar.i == -2) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ehkhVar.d.getLayoutParams();
                    if (ehkhVar.i != -2 || ehkhVar.d.getMeasuredWidth() == i9) {
                        z = false;
                    } else {
                        int i11 = ehkhVar.h;
                        int measuredWidth = ehkhVar.getMeasuredWidth();
                        int i12 = ehkhVar.j;
                        layoutParams2.width = Math.max(i9, Math.min(i11, measuredWidth - (i12 + i12)));
                    }
                    if (ehkhVar.d.getMeasuredHeight() < i10) {
                        layoutParams2.height = i10;
                    } else if (!z) {
                        return;
                    }
                    ehkhVar.d.setLayoutParams(layoutParams2);
                }
            }
        });
    }

    private final void P() {
        TextView textView = this.H;
        float textSize = this.G.getTextSize();
        float textSize2 = textView.getTextSize();
        this.v = textSize - textSize2;
        this.w = textSize2 / textSize;
        this.x = textSize / textSize2;
        TextView textView2 = this.K;
        float textSize3 = this.J.getTextSize();
        float textSize4 = textView2.getTextSize();
        this.y = textSize3 - textSize4;
        this.z = textSize4 / textSize3;
        this.A = textSize3 / textSize4;
    }

    private final void Q() {
        og ogVar = this.f;
        if (ogVar != null) {
            q(ogVar.isChecked());
        }
    }

    private final void R() {
        Drawable drawable = this.b;
        boolean z = true;
        RippleDrawable rippleDrawable = null;
        if (this.q != null) {
            Drawable b = b();
            if (this.W && b() != null && b != null) {
                rippleDrawable = new RippleDrawable(ehmx.b(this.q), null, b);
                z = false;
            } else if (drawable == null) {
                drawable = new RippleDrawable(ehmx.a(this.q), null, null);
            }
        }
        this.E.setPadding(0, 0, 0, 0);
        this.E.setForeground(rippleDrawable);
        setBackground(drawable);
        setDefaultFocusHighlightEnabled(z);
    }

    private final void S() {
        int i = this.e.getLayoutParams().width > 0 ? this.u : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.I.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i : 0;
        }
    }

    private final void T(View view, View view2, float f, float f2) {
        W(this.D, this.l == 0 ? (int) (this.r + f2) : 0, 0, this.ae);
        W(this.c, this.l == 0 ? 0 : this.n.top, this.l == 0 ? 0 : this.n.bottom, this.l == 0 ? 17 : 8388627);
        ab(this.F, this.s);
        this.L.setVisibility(0);
        X(view, 1.0f, 1.0f, 0);
        X(view2, f, f, 4);
    }

    private final void U() {
        int i = this.r;
        W(this.D, i, i, this.l == 0 ? 17 : this.ae);
        W(this.c, 0, 0, 17);
        ab(this.F, 0);
        this.L.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void V(android.widget.TextView r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r4.ag
            if (r0 != 0) goto L57
            r5.setTextAppearance(r6)
            android.content.Context r0 = r5.getContext()
            r1 = 0
            if (r6 != 0) goto L10
        Le:
            r6 = r1
            goto L50
        L10:
            int[] r2 = defpackage.ehmr.b
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            boolean r3 = r6.getValue(r1, r2)
            r6.recycle()
            if (r3 != 0) goto L25
            goto Le
        L25:
            int r6 = r2.getComplexUnit()
            r3 = 2
            if (r6 != r3) goto L42
            int r6 = r2.data
            float r6 = android.util.TypedValue.complexToFloat(r6)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r6 = r6 * r0
            int r6 = java.lang.Math.round(r6)
            goto L50
        L42:
            int r6 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r6 = android.util.TypedValue.complexToDimensionPixelSize(r6, r0)
        L50:
            if (r6 == 0) goto L56
            float r6 = (float) r6
            r5.setTextSize(r1, r6)
        L56:
            return
        L57:
            r5.setTextAppearance(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehkh.V(android.widget.TextView, int):void");
    }

    private static void W(View view, int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private static void X(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private final void Y() {
        TextView textView = this.H;
        textView.setTypeface(textView.getTypeface(), this.R ? 1 : 0);
        TextView textView2 = this.K;
        textView2.setTypeface(textView2.getTypeface(), this.R ? 1 : 0);
    }

    private final void Z(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        V(textView, i);
        P();
        textView.setMinimumHeight(ehmq.h(textView.getContext(), i));
        ColorStateList colorStateList = this.Q;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        Y();
    }

    private final void aa(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        V(textView, i);
        P();
        textView.setMinimumHeight(ehmq.h(textView.getContext(), i));
        ColorStateList colorStateList = this.Q;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    private static void ab(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    private static final void ac(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    public final void A(int i) {
        if (this.r != i) {
            this.r = i;
            Q();
        }
    }

    public final void B(ColorStateList colorStateList) {
        this.q = colorStateList;
        R();
    }

    public final void C(boolean z) {
        this.ag = z;
        H(this.M);
        J(this.N);
        r(this.O);
        s(this.P);
    }

    public final void D(int i) {
        this.G.setMaxLines(i);
        this.H.setMaxLines(i);
        this.J.setMaxLines(i);
        this.K.setMaxLines(i);
        if (Build.VERSION.SDK_INT > 34) {
            this.G.setGravity(17);
            this.H.setGravity(17);
        } else if (i > 1) {
            this.G.setEllipsize(null);
            this.H.setEllipsize(null);
            this.G.setGravity(17);
            this.H.setGravity(17);
        } else {
            this.G.setGravity(16);
            this.H.setGravity(16);
        }
        requestLayout();
    }

    public final void E(int i) {
        if (this.B != i) {
            this.B = i;
            M(getWidth());
            Q();
        }
    }

    public final void F(boolean z) {
        this.af = z;
        this.F.a = z;
        this.G.setIncludeFontPadding(z);
        this.H.setIncludeFontPadding(z);
        this.I.a = z;
        this.J.setIncludeFontPadding(z);
        this.K.setIncludeFontPadding(z);
        requestLayout();
    }

    public final void G(boolean z) {
        if (this.C != z) {
            this.C = z;
            Q();
        }
    }

    public final void H(int i) {
        this.M = i;
        Z(this.H, i);
    }

    public final void I(boolean z) {
        this.R = z;
        H(this.M);
        r(this.O);
        Y();
    }

    public final void J(int i) {
        this.N = i;
        aa(this.G, i);
    }

    public final void K(ColorStateList colorStateList) {
        this.Q = colorStateList;
        if (colorStateList != null) {
            this.G.setTextColor(colorStateList);
            this.H.setTextColor(colorStateList);
            this.J.setTextColor(colorStateList);
            this.K.setTextColor(colorStateList);
        }
    }

    public final void L(View view) {
        if (O()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ehab ehabVar = this.k;
                if (ehabVar != null) {
                    if (ehabVar.c() != null) {
                        ehabVar.c().setForeground(null);
                    } else {
                        view.getOverlay().remove(ehabVar);
                    }
                }
            }
            this.k = null;
        }
    }

    public final void M(int i) {
        if (i > 0 || getVisibility() != 0) {
            int i2 = this.h;
            int i3 = this.j;
            int min = Math.min(i2, i - (i3 + i3));
            int i4 = this.aa;
            if (this.l == 1) {
                int i5 = this.ac;
                int i6 = i - (i5 + i5);
                int i7 = this.i;
                if (i7 != -1) {
                    i6 = i7 == -2 ? this.D.getMeasuredWidth() : Math.min(i7, i6);
                }
                min = i6;
                i4 = Math.max(this.ab, this.c.getMeasuredHeight());
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            layoutParams.height = i4;
            layoutParams.width = Math.max(0, min);
            this.d.setLayoutParams(layoutParams);
        }
    }

    public final void N() {
        og ogVar = this.f;
        if (ogVar != null) {
            int i = 8;
            if (ogVar.isVisible() && !this.m) {
                i = 0;
            }
            setVisibility(i);
        }
    }

    public final boolean O() {
        return this.k != null;
    }

    @Override // defpackage.or
    public final og a() {
        return this.f;
    }

    public final Drawable b() {
        return this.d.getBackground();
    }

    @Override // defpackage.ehkk
    public final void c() {
        N();
    }

    public final void d(Drawable drawable) {
        this.d.setBackground(drawable);
        R();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.W) {
            this.E.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // defpackage.or
    public final boolean e() {
        return false;
    }

    @Override // defpackage.or
    public final void f(og ogVar) {
        this.f = ogVar;
        ogVar.isCheckable();
        refreshDrawableState();
        q(ogVar.isChecked());
        setEnabled(ogVar.isEnabled());
        Drawable icon = ogVar.getIcon();
        if (icon != this.T) {
            this.T = icon;
            if (icon != null) {
                Drawable.ConstantState constantState = icon.getConstantState();
                if (constantState != null) {
                    icon = constantState.newDrawable();
                }
                icon = icon.mutate();
                this.U = icon;
                ColorStateList colorStateList = this.S;
                if (colorStateList != null) {
                    icon.setTintList(colorStateList);
                }
            }
            this.e.setImageDrawable(icon);
        }
        CharSequence charSequence = ogVar.e;
        this.G.setText(charSequence);
        this.H.setText(charSequence);
        this.J.setText(charSequence);
        this.K.setText(charSequence);
        og ogVar2 = this.f;
        if (ogVar2 == null || TextUtils.isEmpty(ogVar2.m)) {
            setContentDescription(charSequence);
        }
        og ogVar3 = this.f;
        if (ogVar3 != null && !TextUtils.isEmpty(ogVar3.n)) {
            charSequence = this.f.n;
        }
        setTooltipText(charSequence);
        setId(ogVar.a);
        if (!TextUtils.isEmpty(ogVar.m)) {
            setContentDescription(ogVar.m);
        }
        setTooltipText(!TextUtils.isEmpty(ogVar.n) ? ogVar.n : ogVar.e);
        N();
        this.a = true;
    }

    public final void g(boolean z) {
        this.W = z;
        R();
        this.d.setVisibility(true != z ? 8 : 0);
        requestLayout();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.D.getLayoutParams();
        return this.D.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        if (this.l == 1) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.c.getLayoutParams();
            return this.c.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.F.getLayoutParams();
        int measuredWidth = layoutParams2.leftMargin + this.F.getMeasuredWidth() + layoutParams2.rightMargin;
        ehab ehabVar = this.k;
        int minimumWidth = ehabVar == null ? 0 : ehabVar.getMinimumWidth() - this.k.b.g();
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) this.E.getLayoutParams();
        return Math.max(Math.max(minimumWidth, layoutParams3.leftMargin) + this.e.getMeasuredWidth() + Math.max(minimumWidth, layoutParams3.rightMargin), measuredWidth);
    }

    public final void h(int i) {
        this.ab = i;
        M(getWidth());
    }

    public final void i(int i) {
        this.ac = i;
        if (this.l == 1) {
            setPadding(i, 0, i, 0);
        }
        M(getWidth());
    }

    public final void j(int i) {
        this.i = i;
        M(getWidth());
    }

    public final void k(int i) {
        this.aa = i;
        M(getWidth());
    }

    public final void l(int i) {
        if (this.t != i) {
            this.t = i;
            ((LinearLayout.LayoutParams) this.F.getLayoutParams()).topMargin = i;
            if (this.I.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.I.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public final void m(int i) {
        this.j = i;
        M(getWidth());
    }

    public final void n(float f, float f2) {
        TimeInterpolator timeInterpolator = egyv.a;
        View view = this.d;
        view.setScaleX((0.6f * f) + 0.4f);
        view.setScaleY(1.0f);
        view.setAlpha(egyv.a(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        this.g = f;
    }

    public final void o(int i) {
        this.h = i;
        M(getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        og ogVar = this.f;
        if (ogVar != null && ogVar.isCheckable() && ogVar.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, o);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ehab ehabVar = this.k;
        if (ehabVar != null && ehabVar.isVisible()) {
            og ogVar = this.f;
            CharSequence charSequence = ogVar.e;
            if (!TextUtils.isEmpty(ogVar.m)) {
                charSequence = this.f.m;
            }
            String valueOf = String.valueOf(charSequence);
            ehab ehabVar2 = this.k;
            Object obj = null;
            if (ehabVar2.isVisible()) {
                if (ehabVar2.i()) {
                    obj = ehabVar2.b.b.o;
                    if (obj == null) {
                        obj = ehabVar2.d();
                    }
                } else if (!ehabVar2.h()) {
                    obj = ehabVar2.b.b.p;
                } else if (ehabVar2.b.f() != 0 && (context = (Context) ehabVar2.a.get()) != null) {
                    if (ehabVar2.c != -2) {
                        int b = ehabVar2.b();
                        int i = ehabVar2.c;
                        if (b > i) {
                            obj = context.getString(ehabVar2.b.b.r, Integer.valueOf(i));
                        }
                    }
                    obj = context.getResources().getQuantityString(ehabVar2.b.f(), ehabVar2.b(), Integer.valueOf(ehabVar2.b()));
                }
            }
            accessibilityNodeInfo.setContentDescription(valueOf + ", " + String.valueOf(obj));
        }
        kxu kxuVar = new kxu(accessibilityNodeInfo);
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i2 = 0;
        for (int i3 = 0; i3 < indexOfChild; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if ((childAt instanceof ehkh) && childAt.getVisibility() == 0) {
                i2++;
            }
        }
        kxuVar.u(kxt.a(0, 1, i2, 1, isSelected()));
        if (isSelected()) {
            kxuVar.s(false);
            kxuVar.ae(kxr.a);
        }
        kxuVar.L(getResources().getString(com.google.android.apps.messaging.R.string.item_view_role_description));
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new ehke(this, i));
    }

    final void p(ehab ehabVar) {
        if (this.k == ehabVar) {
            return;
        }
        if (O() && this.e != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            L(this.e);
        }
        this.k = ehabVar;
        int i = this.ad;
        ehae ehaeVar = ehabVar.b;
        if (ehaeVar.l != i) {
            ehaeVar.l = i;
            ehabVar.g();
        }
        ImageView imageView = this.e;
        if (imageView == null || !O()) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        ehab ehabVar2 = this.k;
        ehaf.a(ehabVar2, imageView);
        if (ehabVar2.c() != null) {
            ehabVar2.c().setForeground(ehabVar2);
        } else {
            imageView.getOverlay().add(ehabVar2);
        }
    }

    public final void q(boolean z) {
        ac(this.H);
        ac(this.G);
        ac(this.K);
        ac(this.J);
        boolean z2 = this.W;
        float f = true != z ? 0.0f : 1.0f;
        if (z2 && this.a && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.V = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.g, f);
            this.V = ofFloat;
            ofFloat.addUpdateListener(new ehkf(this, f));
            this.V.setInterpolator(ehjz.a(getContext(), com.google.android.apps.messaging.R.attr.motionEasingEmphasizedInterpolator, egyv.b));
            this.V.setDuration(ehmp.a(getContext(), com.google.android.apps.messaging.R.attr.motionDurationLong2, getResources().getInteger(com.google.android.apps.messaging.R.integer.material_motion_duration_long_1)));
            this.V.start();
        } else {
            n(f, f);
        }
        TextView textView = this.H;
        TextView textView2 = this.G;
        float f2 = this.v;
        float f3 = this.w;
        float f4 = this.x;
        if (this.l == 1) {
            textView = this.K;
            textView2 = this.J;
            f2 = this.y;
            f3 = this.z;
            f4 = this.A;
        }
        int i = this.B;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        U();
                    }
                } else if (z) {
                    T(textView, textView2, f3, f2);
                    z = true;
                } else {
                    T(textView2, textView, f4, 0.0f);
                    z = false;
                }
            } else if (z) {
                T(textView, textView2, f3, 0.0f);
                z = true;
            } else {
                U();
                z = false;
            }
        } else if (this.C) {
            if (z) {
                T(textView, textView2, f3, 0.0f);
                z = true;
            } else {
                U();
                z = false;
            }
        } else if (z) {
            T(textView, textView2, f3, f2);
            z = true;
        } else {
            T(textView2, textView, f4, 0.0f);
            z = false;
        }
        refreshDrawableState();
        setSelected(z);
    }

    public final void r(int i) {
        this.O = i;
        if (i == 0) {
            i = this.M;
        }
        Z(this.K, i);
    }

    public final void s(int i) {
        this.P = i;
        if (i == 0) {
            i = this.N;
        }
        aa(this.J, i);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.G.setEnabled(z);
        this.H.setEnabled(z);
        this.J.setEnabled(z);
        this.K.setEnabled(z);
        this.e.setEnabled(z);
    }

    public final void t(int i) {
        if (this.u != i) {
            this.u = i;
            S();
            requestLayout();
        }
    }

    public final void u(int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.e.setLayoutParams(layoutParams);
        S();
    }

    public final void v(ColorStateList colorStateList) {
        Drawable drawable;
        this.S = colorStateList;
        if (this.f == null || (drawable = this.U) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.U.invalidateSelf();
    }

    public final void w(int i) {
        Drawable drawable = i == 0 ? null : getContext().getDrawable(i);
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.b = drawable;
        R();
    }

    public final void x(int i) {
        this.ae = i;
        requestLayout();
    }

    public final void y(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.l != i) {
            this.l = i;
            this.ad = 0;
            this.L = this.F;
            int i8 = 8;
            if (i == 1) {
                if (this.I.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    this.c.addView(this.I, layoutParams);
                    S();
                }
                i2 = this.n.left;
                int i9 = this.n.right;
                int i10 = this.n.top;
                int i11 = this.n.bottom;
                this.ad = 1;
                int i12 = this.ac;
                this.L = this.I;
                i6 = i11;
                i5 = i10;
                i4 = i9;
                i3 = i12;
                i7 = 0;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 8;
                i8 = 0;
            }
            this.F.setVisibility(i8);
            this.I.setVisibility(i7);
            ((FrameLayout.LayoutParams) this.D.getLayoutParams()).gravity = this.ae;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
            layoutParams2.leftMargin = i2;
            layoutParams2.rightMargin = i4;
            layoutParams2.topMargin = i5;
            layoutParams2.bottomMargin = i6;
            setPadding(i3, 0, i3, 0);
            M(getWidth());
            R();
        }
    }

    public final void z(int i) {
        if (this.s != i) {
            this.s = i;
            Q();
        }
    }
}
