package com.google.android.setupdesign;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.logging.MetricKey;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.view.BottomScrollView;
import defpackage.einu;
import defpackage.eioo;
import defpackage.eioq;
import defpackage.eios;
import defpackage.eipb;
import defpackage.eipi;
import defpackage.eipl;
import defpackage.eipn;
import defpackage.eips;
import defpackage.eipu;
import defpackage.eipv;
import defpackage.eipw;
import defpackage.eipy;
import defpackage.eiqi;
import defpackage.eiqk;
import defpackage.eiqm;
import defpackage.eiqn;
import defpackage.eiqp;
import defpackage.eiqq;
import defpackage.eiqr;
import defpackage.eiqs;
import defpackage.eiqt;
import defpackage.eiqu;
import defpackage.eiqv;
import defpackage.eiqw;
import defpackage.eiqx;
import defpackage.eiqy;
import defpackage.eiqz;
import defpackage.pgx;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class GlifLayout extends einu {
    public static final /* synthetic */ int f = 0;
    private static final eipn g = new eipn(GlifLayout.class);
    private ColorStateList h;
    private boolean i;
    private boolean j;
    private ColorStateList k;

    public GlifLayout(Context context) {
        this(context, 0, 0);
    }

    private final void q(AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        int a;
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eipy.h, i, 0);
        this.j = e() && obtainStyledAttributes.getBoolean(4, false);
        k(eiqm.class, new eiqm(this, attributeSet, i));
        k(eiqi.class, new eiqi(this, attributeSet, i));
        k(eiqn.class, new eiqn(this, attributeSet, i));
        k(eiqq.class, new eiqq(this));
        k(eiqr.class, new eiqr(this, attributeSet, i));
        k(eiqp.class, new eiqp(this));
        k(eiqk.class, new eiqk(this));
        k(eiqs.class, new eiqs());
        ScrollView l = l();
        if (l != null) {
            new eiqt(l);
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(2);
        if (colorStateList != null) {
            this.h = colorStateList;
            r();
            ProgressBar a2 = ((eiqr) i(eiqr.class)).a();
            if (a2 != null) {
                a2.setIndeterminateTintList(colorStateList);
                a2.setProgressBackgroundTintList(colorStateList);
            }
        }
        if (p() && !f()) {
            getRootView().setBackgroundColor(eios.h(getContext()).c(getContext(), eioq.CONFIG_LAYOUT_BACKGROUND_COLOR));
        }
        View g2 = g(R.id.sud_layout_content);
        if (g2 != null) {
            if (e()) {
                eiqw.a(g2);
            }
            if (!(this instanceof eipw)) {
                Context context = g2.getContext();
                boolean s = eios.h(context).s(eioq.CONFIG_CONTENT_PADDING_TOP);
                if (e() && s && (a = (int) eios.h(context).a(context, eioq.CONFIG_CONTENT_PADDING_TOP)) != g2.getPaddingTop()) {
                    g2.setPadding(g2.getPaddingStart(), a, g2.getPaddingEnd(), g2.getPaddingBottom());
                }
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sud_glif_land_middle_horizontal_spacing);
        if (e() && eios.h(getContext()).s(eioq.CONFIG_LAND_MIDDLE_HORIZONTAL_SPACING)) {
            dimensionPixelSize = (int) eios.h(getContext()).a(getContext(), eioq.CONFIG_LAND_MIDDLE_HORIZONTAL_SPACING);
        }
        View g3 = g(R.id.sud_landscape_header_area);
        if (g3 != null) {
            if (e() && eios.h(getContext()).s(eioq.CONFIG_LAYOUT_MARGIN_END)) {
                i3 = (int) eios.h(getContext()).a(getContext(), eioq.CONFIG_LAYOUT_MARGIN_END);
            } else {
                TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(new int[]{R.attr.sudMarginEnd});
                int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
                obtainStyledAttributes2.recycle();
                i3 = dimensionPixelSize2;
            }
            g3.setPadding(g3.getPaddingStart(), g3.getPaddingTop(), (dimensionPixelSize / 2) - i3, g3.getPaddingBottom());
        }
        View g4 = g(R.id.sud_landscape_content_area);
        if (g4 != null) {
            if (e() && eios.h(getContext()).s(eioq.CONFIG_LAYOUT_MARGIN_START)) {
                i2 = (int) eios.h(getContext()).a(getContext(), eioq.CONFIG_LAYOUT_MARGIN_START);
            } else {
                TypedArray obtainStyledAttributes3 = getContext().obtainStyledAttributes(new int[]{R.attr.sudMarginStart});
                int dimensionPixelSize3 = obtainStyledAttributes3.getDimensionPixelSize(0, 0);
                obtainStyledAttributes3.recycle();
                i2 = dimensionPixelSize3;
            }
            g4.setPadding(g3 != null ? (dimensionPixelSize / 2) - i2 : 0, g4.getPaddingTop(), g4.getPaddingEnd(), g4.getPaddingBottom());
        }
        if (eios.r(getContext())) {
            View g5 = g(R.id.sud_header_scroll_view);
            if (g5 != null) {
                g5.setFocusable(false);
            }
            View g6 = g(R.id.sud_scroll_view);
            if (g6 != null) {
                g6.setFocusable(false);
            }
        }
        this.k = obtainStyledAttributes.getColorStateList(0);
        r();
        this.i = obtainStyledAttributes.getBoolean(1, true);
        r();
        int resourceId = obtainStyledAttributes.getResourceId(3, 0);
        if (resourceId != 0) {
            ViewStub viewStub = (ViewStub) g(R.id.sud_layout_sticky_header);
            viewStub.setLayoutResource(resourceId);
            viewStub.inflate();
        }
        if (eios.q(getContext())) {
            m();
        }
        if (eios.q(getContext())) {
            final Activity e = eios.e(getContext());
            final eiqk eiqkVar = (eiqk) i(eiqk.class);
            if (eiqkVar != null) {
                Button a3 = eiqkVar.a();
                if (a3 != null) {
                    a3.setVisibility(0);
                    eiqkVar.b().setVisibility(0);
                }
                final View.OnClickListener onClickListener = new View.OnClickListener() { // from class: eipt
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i4 = GlifLayout.f;
                        e.onBackPressed();
                    }
                };
                Button a4 = eiqkVar.a();
                if (a4 != null) {
                    a4.setOnClickListener(new View.OnClickListener() { // from class: eiqj
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            onClickListener.onClick(view);
                            eiqk.this.c++;
                        }
                    });
                }
            } else {
                g.f("FloatingBackButtonMixin button is null");
            }
        } else {
            g.a("isGlifExpressiveEnabled is false");
        }
        obtainStyledAttributes.recycle();
    }

    private final void r() {
        int defaultColor;
        if (g(R.id.suc_layout_status) != null) {
            ColorStateList colorStateList = this.k;
            if (colorStateList != null) {
                defaultColor = colorStateList.getDefaultColor();
            } else {
                ColorStateList colorStateList2 = this.h;
                defaultColor = colorStateList2 != null ? colorStateList2.getDefaultColor() : 0;
            }
            ((eipi) i(eipi.class)).a(this.i ? new eipv(defaultColor) : new ColorDrawable(defaultColor));
        }
    }

    @Override // defpackage.einu, com.google.android.setupcompat.internal.TemplateLayout
    protected View a(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            Context context = getContext();
            boolean n = eios.n(context);
            boolean b = pgx.a(context).b(eios.e(context));
            g.c("isEmbeddedActivityOnePaneEnabled = " + n + "; isActivityEmbedded = " + b);
            if (n && b) {
                i = o() ? R.layout.sud_glif_expressive_embedded_template : R.layout.sud_glif_embedded_template;
            } else if (o()) {
                i = R.layout.sud_glif_expressive_template;
            } else {
                Context context2 = getContext();
                int i2 = eipl.a;
                i = (Build.VERSION.SDK_INT < 34 || !eios.p(context2)) ? R.layout.sud_glif_template : R.layout.sud_glif_template_two_pane;
            }
        }
        return h(layoutInflater, R.style.SudThemeGlif_Light, i);
    }

    @Override // defpackage.einu, com.google.android.setupcompat.internal.TemplateLayout
    protected ViewGroup b(int i) {
        if (i == 0) {
            i = R.id.sud_layout_content;
        }
        return super.b(i);
    }

    public final ScrollView l() {
        View g2 = g(R.id.sud_scroll_view);
        if (g2 instanceof ScrollView) {
            return (ScrollView) g2;
        }
        return null;
    }

    protected void m() {
        ScrollView l = l();
        if (l instanceof BottomScrollView) {
            ((BottomScrollView) l).a = new eipu(this);
        }
    }

    public final void n(boolean z) {
        LinearLayout linearLayout;
        eipb eipbVar = (eipb) i(eipb.class);
        if (eipbVar == null || (linearLayout = eipbVar.g) == null) {
            return;
        }
        if (z) {
            linearLayout.setBackgroundColor(0);
            return;
        }
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(R.attr.sudFooterBackgroundColor, typedValue, true);
        linearLayout.setBackgroundColor(typedValue.data);
    }

    protected final boolean o() {
        return eios.q(getContext()) && Build.VERSION.SDK_INT >= 35;
    }

    @Override // defpackage.einu, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        PersistableBundle persistableBundle;
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 29 && eips.a(this.a.getIntent()) && eios.q(getContext())) {
            eiqk eiqkVar = (eiqk) i(eiqk.class);
            if (eiqkVar != null) {
                persistableBundle = new PersistableBundle();
                persistableBundle.putInt("BackButton_onClickCount", eiqkVar.c);
            } else {
                persistableBundle = PersistableBundle.EMPTY;
            }
            CustomEvent b = CustomEvent.b(MetricKey.b("SetupDesignMetrics", this.a), persistableBundle);
            eioo.a(getContext(), b);
            g.c("SetupDesignMetrics=".concat(CustomEvent.a(b).toString()));
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        String j;
        int i;
        ViewGroup.LayoutParams layoutParams;
        int dimension;
        super.onFinishInflate();
        eiqn eiqnVar = (eiqn) i(eiqn.class);
        if (eiqx.c(eiqnVar.a)) {
            ImageView b = eiqnVar.b();
            FrameLayout a = eiqnVar.a();
            if (b != null && a != null) {
                Context context = b.getContext();
                int a2 = eiqx.a(context);
                if (a2 != 0 && !eios.q(context) && (b.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) b.getLayoutParams();
                    layoutParams2.gravity = a2;
                    b.setLayoutParams(layoutParams2);
                }
                if (eios.h(context).s(eioq.CONFIG_ICON_SIZE)) {
                    b.getViewTreeObserver().addOnPreDrawListener(new eiqu(b));
                    ViewGroup.LayoutParams layoutParams3 = b.getLayoutParams();
                    layoutParams3.height = (int) eios.h(context).a(context, eioq.CONFIG_ICON_SIZE);
                    layoutParams3.width = -2;
                    b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    Drawable drawable = b.getDrawable();
                    if (drawable != null) {
                        int intrinsicWidth = drawable.getIntrinsicWidth();
                        int intrinsicHeight = drawable.getIntrinsicHeight();
                        if (intrinsicWidth > intrinsicHeight + intrinsicHeight && layoutParams3.height > (dimension = (int) context.getResources().getDimension(R.dimen.sud_horizontal_icon_height))) {
                            i = layoutParams3.height - dimension;
                            layoutParams3.height = dimension;
                            layoutParams = a.getLayoutParams();
                            if (eios.h(context).s(eioq.CONFIG_ICON_MARGIN_TOP) && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, ((int) eios.h(context).a(context, eioq.CONFIG_ICON_MARGIN_TOP)) + i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                            }
                        }
                    }
                }
                i = 0;
                layoutParams = a.getLayoutParams();
                if (eios.h(context).s(eioq.CONFIG_ICON_MARGIN_TOP)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, ((int) eios.h(context).a(context, eioq.CONFIG_ICON_MARGIN_TOP)) + i, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                }
            }
        }
        eiqm eiqmVar = (eiqm) i(eiqm.class);
        TextView textView = (TextView) eiqmVar.a.g(R.id.suc_layout_title);
        if (eiqx.c(eiqmVar.a)) {
            Context context2 = eiqmVar.a.getContext();
            View g2 = eiqmVar.a.g(R.id.sud_layout_header);
            eiqw.a(g2);
            if (textView != null) {
                eiqz.a(textView, new eiqy(eioq.CONFIG_HEADER_TEXT_COLOR, null, eioq.CONFIG_HEADER_TEXT_SIZE, eioq.CONFIG_HEADER_FONT_FAMILY, eioq.CONFIG_HEADER_FONT_WEIGHT, null, eioq.CONFIG_HEADER_TEXT_MARGIN_TOP, eioq.CONFIG_HEADER_TEXT_MARGIN_BOTTOM, eiqx.a(textView.getContext())));
            }
            ViewGroup viewGroup = (ViewGroup) g2;
            if (viewGroup != null) {
                Context context3 = viewGroup.getContext();
                viewGroup.setBackgroundColor(eios.h(context3).c(context3, eioq.CONFIG_HEADER_AREA_BACKGROUND_COLOR));
                if (eios.h(context3).s(eioq.CONFIG_HEADER_CONTAINER_MARGIN_BOTTOM)) {
                    ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
                    if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
                        marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, (int) eios.h(context3).a(context3, eioq.CONFIG_HEADER_CONTAINER_MARGIN_BOTTOM));
                        viewGroup.setLayoutParams(layoutParams4);
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 28 && eios.q(context2) && eios.h(context2).s(eioq.CONFIG_HEADER_FONT_VARIATION_SETTINGS) && (j = eios.h(context2).j(context2, eioq.CONFIG_HEADER_FONT_VARIATION_SETTINGS)) != null && !j.isEmpty()) {
                textView.setFontVariationSettings(j);
            }
        }
        eiqmVar.c();
        if (eiqmVar.b) {
            eiqmVar.b(textView);
        }
        eiqi eiqiVar = (eiqi) i(eiqi.class);
        TextView textView2 = (TextView) eiqiVar.a.g(R.id.sud_layout_subtitle);
        if (textView2 != null && eiqx.c(eiqiVar.a)) {
            eiqz.a(textView2, new eiqy(eioq.CONFIG_DESCRIPTION_TEXT_COLOR, eioq.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, eioq.CONFIG_DESCRIPTION_TEXT_SIZE, eioq.CONFIG_DESCRIPTION_FONT_FAMILY, eioq.CONFIG_DESCRIPTION_FONT_WEIGHT, eioq.CONFIG_DESCRIPTION_LINK_FONT_FAMILY, eioq.CONFIG_DESCRIPTION_TEXT_MARGIN_TOP, eioq.CONFIG_DESCRIPTION_TEXT_MARGIN_BOTTOM, eiqx.a(textView2.getContext())));
        }
        eiqr eiqrVar = (eiqr) i(eiqr.class);
        ProgressBar a3 = eiqrVar.a();
        if (eiqrVar.b && a3 != null) {
            if (((GlifLayout) eiqrVar.a).p()) {
                Context context4 = a3.getContext();
                ViewGroup.LayoutParams layoutParams5 = a3.getLayoutParams();
                if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5;
                    int i2 = marginLayoutParams4.topMargin;
                    if (eios.h(context4).s(eioq.CONFIG_PROGRESS_BAR_MARGIN_TOP)) {
                        i2 = (int) eios.h(context4).b(context4, eioq.CONFIG_PROGRESS_BAR_MARGIN_TOP, context4.getResources().getDimension(R.dimen.sud_progress_bar_margin_top));
                    }
                    int i3 = marginLayoutParams4.bottomMargin;
                    if (eios.h(context4).s(eioq.CONFIG_PROGRESS_BAR_MARGIN_BOTTOM)) {
                        i3 = (int) eios.h(context4).b(context4, eioq.CONFIG_PROGRESS_BAR_MARGIN_BOTTOM, context4.getResources().getDimension(R.dimen.sud_progress_bar_margin_bottom));
                    }
                    if (i2 != marginLayoutParams4.topMargin || i3 != marginLayoutParams4.bottomMargin) {
                        marginLayoutParams4.setMargins(marginLayoutParams4.leftMargin, i2, marginLayoutParams4.rightMargin, i3);
                    }
                }
            } else {
                Context context5 = a3.getContext();
                ViewGroup.LayoutParams layoutParams6 = a3.getLayoutParams();
                if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams6;
                    marginLayoutParams5.setMargins(marginLayoutParams5.leftMargin, (int) context5.getResources().getDimension(R.dimen.sud_progress_bar_margin_top), marginLayoutParams5.rightMargin, (int) context5.getResources().getDimension(R.dimen.sud_progress_bar_margin_bottom));
                }
            }
        }
        eiqq eiqqVar = (eiqq) i(eiqq.class);
        if (eiqx.c(eiqqVar.a)) {
            ImageView imageView = (ImageView) eiqqVar.a.g(R.id.sud_account_avatar);
            TextView textView3 = (TextView) eiqqVar.a.g(R.id.sud_account_name);
            LinearLayout linearLayout = (LinearLayout) eiqqVar.a.g(R.id.sud_layout_profile);
            eiqw.a(eiqqVar.a.g(R.id.sud_layout_header));
            if (imageView != null && textView3 != null) {
                Context context6 = imageView.getContext();
                ViewGroup.LayoutParams layoutParams7 = imageView.getLayoutParams();
                if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams7;
                    marginLayoutParams6.setMargins(marginLayoutParams6.leftMargin, marginLayoutParams6.topMargin, (int) eios.h(context6).a(context6, eioq.CONFIG_ACCOUNT_AVATAR_MARGIN_END), marginLayoutParams6.bottomMargin);
                }
                imageView.setMaxHeight((int) eios.h(context6).b(context6, eioq.CONFIG_ACCOUNT_AVATAR_SIZE, context6.getResources().getDimension(R.dimen.sud_account_avatar_max_height)));
                textView3.setTextSize(0, (int) eios.h(context6).b(context6, eioq.CONFIG_ACCOUNT_NAME_TEXT_SIZE, context6.getResources().getDimension(R.dimen.sud_account_name_text_size)));
                Typeface create = Typeface.create(eios.h(context6).j(context6, eioq.CONFIG_ACCOUNT_NAME_FONT_FAMILY), 0);
                if (create != null) {
                    textView3.setTypeface(create);
                }
                linearLayout.setGravity(eiqx.a(linearLayout.getContext()));
            }
        }
        eiqk eiqkVar = (eiqk) i(eiqk.class);
        if (eiqx.c(eiqkVar.a) && eiqkVar.b() != null) {
            eiqw.a(eiqkVar.b());
            FrameLayout b2 = eiqkVar.b();
            if (b2 != null) {
                Context context7 = b2.getContext();
                ViewGroup.LayoutParams layoutParams8 = b2.getLayoutParams();
                int dimension2 = (int) context7.getResources().getDimension(R.dimen.sud_glif_expressive_back_button_height);
                int a4 = eiqv.a(context7, eioq.CONFIG_ICON_SIZE, 0);
                int i4 = a4 > dimension2 ? a4 - dimension2 : 0;
                ViewGroup.MarginLayoutParams marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams8;
                int a5 = eiqv.a(context7, eioq.CONFIG_ICON_MARGIN_TOP, marginLayoutParams7.topMargin);
                if (i4 != 0) {
                    a5 += i4 / 2;
                }
                if (a5 != marginLayoutParams7.topMargin) {
                    FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams9.setMargins(marginLayoutParams7.leftMargin, a5, marginLayoutParams7.rightMargin, marginLayoutParams7.bottomMargin);
                    b2.setLayoutParams(layoutParams9);
                }
            }
        }
        TextView textView4 = (TextView) g(R.id.sud_layout_description);
        if (textView4 != null) {
            if (this.j) {
                eiqz.a(textView4, new eiqy(eioq.CONFIG_DESCRIPTION_TEXT_COLOR, eioq.CONFIG_DESCRIPTION_LINK_TEXT_COLOR, eioq.CONFIG_DESCRIPTION_TEXT_SIZE, eioq.CONFIG_DESCRIPTION_FONT_FAMILY, eioq.CONFIG_DESCRIPTION_FONT_WEIGHT, eioq.CONFIG_DESCRIPTION_LINK_FONT_FAMILY, null, null, eiqx.a(textView4.getContext())));
            } else if (e()) {
                eiqy eiqyVar = new eiqy(null, null, null, null, null, null, null, null, eiqx.a(textView4.getContext()));
                eiqz.b(textView4, eiqyVar);
                textView4.setGravity(eiqyVar.i);
            }
        }
    }

    public final boolean p() {
        if (this.j) {
            return true;
        }
        return e() && eios.v(getContext());
    }

    public GlifLayout(Context context, int i) {
        this(context, i, 0);
    }

    public GlifLayout(Context context, int i, int i2) {
        super(context, i, i2);
        this.i = true;
        this.j = false;
        q(null, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = true;
        this.j = false;
        q(attributeSet, R.attr.sudLayoutTheme);
    }

    public GlifLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = true;
        this.j = false;
        q(attributeSet, i);
    }
}
