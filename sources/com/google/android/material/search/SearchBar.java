package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.egzm;
import defpackage.ehaa;
import defpackage.ehdr;
import defpackage.ehiz;
import defpackage.ehjb;
import defpackage.ehmy;
import defpackage.ehna;
import defpackage.ehnb;
import defpackage.ehop;
import defpackage.ehoq;
import defpackage.ehow;
import defpackage.ehua;
import defpackage.ku;
import defpackage.od;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SearchBar extends Toolbar {
    public final ehnb D;
    public View E;
    public int F;
    public ehop G;
    private final TextView H;
    private final boolean I;
    private final boolean J;
    private final Drawable K;
    private final boolean L;
    private final boolean M;
    private Integer N;
    private Drawable O;
    private boolean P;

    /* compiled from: PG */
    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        private boolean e;

        public ScrollingViewBehavior() {
            this.e = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.egzy, defpackage.kkt
        public /* bridge */ /* synthetic */ boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            super.g(coordinatorLayout, view, i);
            return true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.kkt
        public final void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.l(coordinatorLayout, view, view2);
            if (this.e || !(view2 instanceof AppBarLayout)) {
                return;
            }
            this.e = true;
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            appBarLayout.setBackgroundColor(0);
            ehaa.a(appBarLayout, 0.0f);
        }

        @Override // defpackage.egzw
        public final boolean z() {
            return true;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.e = false;
        }
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    private final void L() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        ImageButton b = ehjb.b(this);
        int width = (b == null || !b.isClickable()) ? 0 : z ? getWidth() - b.getLeft() : b.getRight();
        ActionMenuView a = ehjb.a(this);
        int right = a != null ? z ? a.getRight() : getWidth() - a.getLeft() : 0;
        int i = true != z ? width : right;
        if (true != z) {
            width = right;
        }
        setHandwritingBoundsOffsets(-i, 0.0f, -width, 0.0f);
    }

    private final void M(boolean z) {
        ImageButton b = ehjb.b(this);
        if (b == null) {
            return;
        }
        boolean z2 = !z;
        b.setClickable(z2);
        b.setFocusable(z2);
        Drawable background = b.getBackground();
        if (background != null) {
            this.O = background;
        }
        b.setBackgroundDrawable(z ? null : this.O);
        L();
    }

    private static final int N(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    protected int F() {
        return R.dimen.m3_searchbar_margin_vertical;
    }

    protected int G() {
        return R.drawable.ic_search_black_24;
    }

    public final float H() {
        return this.G.w();
    }

    public final CharSequence I() {
        return this.H.getHint();
    }

    public final CharSequence J() {
        return this.H.getText();
    }

    public final void K(CharSequence charSequence) {
        this.H.setText(charSequence);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.I && this.E == null && !(view instanceof ActionMenuView)) {
            this.E = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.support.v7.widget.Toolbar
    public final void o(int i) {
        Menu h = h();
        boolean z = h instanceof od;
        if (z) {
            ((od) h).s();
        }
        super.o(i);
        this.F = i;
        if (z) {
            ((od) h).r();
        }
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ehoq.d(this, this.G);
        if (this.J && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(F());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = N(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = N(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = N(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = N(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
        if (getLayoutParams() instanceof egzm) {
            egzm egzmVar = (egzm) getLayoutParams();
            if (this.P) {
                if (egzmVar.a == 0) {
                    egzmVar.a = 53;
                }
            } else if (egzmVar.a == 53) {
                egzmVar.a = 0;
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence J = J();
        boolean isEmpty = TextUtils.isEmpty(J);
        accessibilityNodeInfo.setHintText(I());
        accessibilityNodeInfo.setShowingHintText(isEmpty);
        if (isEmpty) {
            J = I();
        }
        accessibilityNodeInfo.setText(J);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.E;
        if (view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i5 = measuredWidth + measuredWidth2;
            int measuredHeight = this.E.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i6 = measuredHeight + measuredHeight2;
            View view2 = this.E;
            if (getLayoutDirection() == 1) {
                view2.layout(getMeasuredWidth() - i5, measuredHeight2, getMeasuredWidth() - measuredWidth2, i6);
            } else {
                view2.layout(measuredWidth2, measuredHeight2, i5, i6);
            }
        }
        L();
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.E;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ehna)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ehna ehnaVar = (ehna) parcelable;
        super.onRestoreInstanceState(ehnaVar.d);
        K(ehnaVar.a);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final Parcelable onSaveInstanceState() {
        ehna ehnaVar = new ehna(super.onSaveInstanceState());
        CharSequence J = J();
        ehnaVar.a = J == null ? null : J.toString();
        return ehnaVar;
    }

    @Override // android.support.v7.widget.Toolbar
    public final void s(Drawable drawable) {
        int b;
        if (this.L && drawable != null) {
            Integer num = this.N;
            if (num != null) {
                b = num.intValue();
            } else {
                b = ehdr.b(this, drawable == this.K ? R.attr.colorOnSurfaceVariant : R.attr.colorOnSurface);
            }
            drawable = drawable.mutate();
            drawable.setTint(b);
        }
        super.s(drawable);
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        ehop ehopVar = this.G;
        if (ehopVar != null) {
            ehopVar.N(f);
        }
    }

    @Override // android.support.v7.widget.Toolbar
    public final void t(View.OnClickListener onClickListener) {
        if (this.M) {
            return;
        }
        super.t(onClickListener);
        M(false);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchBarStyle);
    }

    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        super(ehua.a(context, attributeSet, i, R.style.Widget_Material3_SearchBar), attributeSet, i);
        this.F = -1;
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE) == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                    throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
                }
            } else {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
        }
        Drawable a = ku.a(context2, G());
        this.K = a;
        this.D = new ehnb();
        TypedArray a2 = ehiz.a(context2, attributeSet, ehmy.a, i, R.style.Widget_Material3_SearchBar, new int[0]);
        ehow ehowVar = new ehow(ehow.h(context2, attributeSet, i, R.style.Widget_Material3_SearchBar));
        int color = a2.getColor(3, 0);
        float dimension = a2.getDimension(6, 0.0f);
        this.J = a2.getBoolean(4, true);
        this.P = a2.getBoolean(5, true);
        boolean z = a2.getBoolean(8, false);
        this.M = a2.getBoolean(7, false);
        this.L = a2.getBoolean(12, true);
        if (a2.hasValue(9)) {
            this.N = Integer.valueOf(a2.getColor(9, -1));
        }
        int resourceId = a2.getResourceId(0, -1);
        String string = a2.getString(1);
        String string2 = a2.getString(2);
        float dimension2 = a2.getDimension(11, -1.0f);
        int color2 = a2.getColor(10, 0);
        a2.recycle();
        if (!z) {
            s(e() != null ? e() : a);
            M(true);
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_bar, this);
        this.I = true;
        TextView textView = (TextView) findViewById(R.id.open_search_bar_text_view);
        this.H = textView;
        setElevation(dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
        }
        K(string);
        textView.setHint(string2);
        if (e() == null) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMarginStart(getResources().getDimensionPixelSize(R.dimen.m3_searchbar_text_margin_start_no_navigation_icon));
        }
        ehop ehopVar = new ehop(ehowVar);
        this.G = ehopVar;
        ehopVar.K(getContext());
        this.G.N(dimension);
        if (dimension2 >= 0.0f) {
            this.G.T(dimension2, color2);
        }
        int b = ehdr.b(this, R.attr.colorControlHighlight);
        this.G.O(ColorStateList.valueOf(color));
        ColorStateList valueOf = ColorStateList.valueOf(b);
        ehop ehopVar2 = this.G;
        setBackground(new RippleDrawable(valueOf, ehopVar2, ehopVar2));
    }

    @Override // android.support.v7.widget.Toolbar
    public final void v(CharSequence charSequence) {
    }

    @Override // android.support.v7.widget.Toolbar
    public final void x(CharSequence charSequence) {
    }
}
