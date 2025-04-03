package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.common.LockableNestedScrollView;
import com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView;
import com.google.android.material.card.MaterialCardView;
import com.google.common.util.concurrent.ListenableFuture;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebrp extends FrameLayout implements ebwc {
    private static final Property B = Property.of(View.class, Float.class, "alpha");
    private static final Property C = Property.of(ehop.class, Integer.class, "alpha");
    private static final Interpolator D = new PathInterpolator(0.54f, 0.01f, 0.61f, 0.99f);
    public static final String a = "ebrp";
    public ebsh A;
    private boolean E;
    private int F;
    private final boolean G;
    private final boolean H;
    private final float I;
    private final float J;
    private final int K;
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    private final View P;
    private final ViewGroup Q;
    private final ViewGroup R;
    private final LockableNestedScrollView S;
    private final View T;
    private final OverScrollControlledNestedScrollView U;
    private final View V;
    private final View W;
    private final View aa;
    private final View ab;
    private final View ac;
    private final ehop ad;
    private final ehop ae;
    private final ehop af;
    private final emxc ag;
    private final FrameLayout ah;
    private final ehfz ai;
    private final TextView aj;
    private final Rect ak;
    private final boolean al;
    private emxc am;
    private int an;
    public boolean b;
    public boolean c;
    public boolean d;
    public ebrs e;
    public final ebpo f;
    public final View g;
    public final RecyclerView h;
    public final RecyclerView i;
    public final SelectedAccountView j;
    public final Button k;
    public final ViewGroup l;
    public final MaterialCardView m;
    public final ViewGroup n;
    public final abo o;
    public final TextView p;
    public Button q;
    public Button r;
    public eboz s;
    public eboz t;
    public Runnable u;
    public ebsg v;
    public ebse w;
    public acd x;
    public AnimatorSet y;
    public final eays z;

    public ebrp(Context context, boolean z, ebsp ebspVar) {
        super(z ? ebspVar.f(context) : new ContextThemeWrapper(context, ebspVar.d()), null, 0);
        this.o = new ebrc(this);
        this.ak = new Rect();
        this.am = emux.a;
        this.an = 0;
        this.z = new ebrl(this);
        setId(R.id.express_sign_in_layout_internal);
        this.G = z;
        if (!ebos.c(getContext())) {
            throw new IllegalStateException("ExpressSignInLayout has to be used with a Google Material theme");
        }
        LayoutInflater.from(getContext()).inflate(R.layout.express_sign_in_layout, this);
        boolean g = eboq.g(getContext());
        this.al = g;
        emxc b = ebspVar.b(getContext());
        this.ag = b;
        this.ai = new ehfz(getContext());
        Context context2 = getContext();
        ebpi ebpiVar = new ebpi(ebnr.c(context2, R.attr.ogContentContainerPaddingTop), ebnr.c(context2, R.attr.ogContainerExternalHorizontalSpacing), ebnr.c(context2, R.attr.ogContainerInternalAdditionalHorizontalSpacing), ebnr.a(context2, R.attr.ogDialogCornerRadius), ebnr.b(context2, R.attr.ogImportantBoxBackgroundColor), ebnr.c(context2, R.attr.ogImportantBoxCornerRadius), ebnr.c(context2, R.attr.ogImportantBoxMarginTop), ebnr.c(context2, R.attr.ogDialogMarginBottom), ebnr.c(context2, R.attr.ogLegalDisclaimerBottomPadding), ebnr.c(context2, R.attr.ogLegalDisclaimerTopPadding), ebnr.c(context2, R.attr.ogSelectedAccountViewMarginVertical));
        this.f = ebpiVar;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.N = getResources().getColor(true != g ? R.color.og_elevation_shadow_color_dark : R.color.og_elevation_shadow_color_light);
        this.I = ebos.a(displayMetrics, true != g ? 5 : 8);
        float a2 = ebos.a(displayMetrics, true != g ? 3 : 8);
        this.J = a2;
        this.K = ebos.b(displayMetrics, 20);
        this.L = ebos.b(displayMetrics, 8);
        this.M = ebos.b(displayMetrics, 6);
        boolean g2 = ebspVar.g();
        this.H = g2;
        this.g = findViewById(R.id.scrim_view);
        View findViewById = findViewById(R.id.fake_scrim_view);
        this.P = findViewById;
        SelectedAccountView selectedAccountView = (SelectedAccountView) findViewById(R.id.selected_account);
        this.j = selectedAccountView;
        this.m = (MaterialCardView) findViewById(R.id.important_box_card_view);
        selectedAccountView.l(150L);
        Interpolator interpolator = D;
        selectedAccountView.m(interpolator);
        this.h = (RecyclerView) findViewById(R.id.accounts_list);
        this.i = (RecyclerView) findViewById(R.id.account_management_actions_list);
        View findViewById2 = findViewById(R.id.og_selected_account_to_account_management_divider);
        this.ac = findViewById2;
        int m = g2 ? 0 : eazq.m(getContext()) + ebpiVar.c;
        this.O = m;
        I(m);
        this.k = (Button) findViewById(R.id.sign_in_button);
        this.q = (Button) findViewById(R.id.continue_as_button);
        this.r = (Button) findViewById(R.id.secondary_action_button);
        this.Q = (ViewGroup) findViewById(R.id.main_container);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content_container);
        this.R = viewGroup;
        LockableNestedScrollView lockableNestedScrollView = (LockableNestedScrollView) findViewById(R.id.scrollable_container);
        this.S = lockableNestedScrollView;
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.footer_container);
        this.l = viewGroup2;
        this.T = findViewById(R.id.header_container);
        View findViewById3 = findViewById(R.id.selected_account_container);
        this.V = findViewById3;
        this.W = findViewById(R.id.selected_account_top_inset_spacing);
        this.aa = findViewById(R.id.accounts_content_container);
        this.n = (ViewGroup) findViewById(R.id.progress_container);
        TextView textView = (TextView) findViewById(R.id.choose_an_account_a11y);
        this.aj = textView;
        this.p = (TextView) findViewById(R.id.disclaimer_text);
        OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = (OverScrollControlledNestedScrollView) findViewById(R.id.og_account_management_container);
        this.U = overScrollControlledNestedScrollView;
        View findViewById4 = findViewById(R.id.account_management_list_container);
        this.ab = findViewById4;
        ehop C2 = C();
        C2.N(a2);
        C2.fy(D(ebpiVar.l(), true));
        if (!ebpiVar.l()) {
            C2.Z();
        }
        this.ae = C2;
        lockableNestedScrollView.setBackgroundDrawable(C2);
        viewGroup.setLayoutTransition(x());
        ViewGroup viewGroup3 = (ViewGroup) findViewById4.getParent();
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(0, interpolator);
        layoutTransition.setAnimator(2, null);
        layoutTransition.setAnimator(3, ValueAnimator.ofInt(0));
        O(layoutTransition);
        viewGroup3.setLayoutTransition(layoutTransition);
        ((ViewGroup) findViewById3).setLayoutTransition(x());
        ehop C3 = C();
        this.ad = C3;
        C3.fy(D(false, true));
        findViewById3.setBackgroundDrawable(C3);
        if (b.g()) {
            C3.setAlpha(0);
            findViewById2.setBackgroundColor(((Integer) b.c()).intValue());
        }
        ehop C4 = C();
        this.af = C4;
        C4.Z();
        viewGroup2.setBackgroundDrawable(C4);
        C3.Q(a2);
        C4.Q(a2);
        overScrollControlledNestedScrollView.g = new ebqr(this);
        overScrollControlledNestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: ebqs
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ebrp.this.r();
            }
        });
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.ah = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
        findViewById.setVisibility(true != z ? 8 : 0);
        findViewById(R.id.esi_custom_header_separator).setVisibility(true != g2 ? 0 : 8);
        eavn.a(textView);
        kvo.r(textView, getResources().getString(R.string.og_account_picker_dialog_a11y));
        if (N()) {
            ebpb.a(this);
        }
    }

    private static ObjectAnimator A(boolean z, View view, int i) {
        if (z) {
            ObjectAnimator duration = y(view).setDuration(150L);
            duration.addListener(new ebra(view));
            return duration;
        }
        ObjectAnimator duration2 = z(view).setDuration(150L);
        duration2.addListener(new ebrb(view));
        return duration2;
    }

    private final View B() {
        return this.G ? this.P : this.g;
    }

    private final ehop C() {
        ehop E = ehop.E(getContext());
        E.Y();
        E.R(this.N);
        if (this.ag.g()) {
            E.O(ColorStateList.valueOf(((Integer) this.ag.c()).intValue()));
        }
        return E;
    }

    private final ehow D(boolean z, boolean z2) {
        ehou ehouVar = new ehou();
        if (z2) {
            ehouVar.j(((ebpi) this.f).d);
            ehouVar.k(((ebpi) this.f).d);
        }
        if (z) {
            ebpo ebpoVar = this.f;
            ehouVar.a(ehoq.a(0));
            ehouVar.b(((ebpi) ebpoVar).d);
            ebpo ebpoVar2 = this.f;
            ehouVar.c(ehoq.a(0));
            ehouVar.d(((ebpi) ebpoVar2).d);
        }
        return new ehow(ehouVar);
    }

    private final void E() {
        this.m.setVisibility(8);
        this.k.setVisibility(0);
        this.q.setVisibility(8);
        K(false, false);
        k(false);
        P();
        M(true);
    }

    private final void F() {
        this.m.setVisibility(0);
        this.k.setVisibility(8);
        this.q.setVisibility(0);
        K(this.b, true);
        P();
        M(false);
    }

    private final void G(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
        if (this.ae.w() > 0.0f) {
            engr engrVar = new engr();
            ehop ehopVar = this.ad;
            Object[] objArr = new Animator[2];
            int i = true != z ? 0 : PrivateKeyType.INVALID;
            objArr[0] = ObjectAnimator.ofInt(ehopVar, (Property<ehop, Integer>) C, 255 - i, i).setDuration(150L);
            final MaterialCardView materialCardView = this.m;
            float f = ((ebpi) this.f).f;
            float f2 = true != z ? f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f - f2, f2);
            ofFloat.setDuration(150L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ebqi
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    String str = ebrp.a;
                    MaterialCardView.this.gw(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            objArr[1] = ofFloat;
            engrVar.i(objArr);
            if (!this.f.l()) {
                final ehop ehopVar2 = this.ae;
                final ehop ehopVar3 = this.ad;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(true != z ? 1.0f : 0.0f);
                ofFloat2.setDuration(100L);
                ofFloat2.setStartDelay(true != z ? 0L : 50L);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ebqq
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        String str = ebrp.a;
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        ehop.this.P(floatValue);
                        ehopVar3.P(floatValue);
                    }
                });
                engrVar.h(ofFloat2);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(engrVar.g());
            animatorSet.addListener(new ebrn(this, z));
            animatorSet.start();
        }
        if (((ViewGroup.MarginLayoutParams) this.Q.getLayoutParams()).topMargin == 0) {
            this.W.setVisibility(true != z ? 8 : 0);
            ebpb.b(this, z, this.al);
        }
        ViewGroup viewGroup = this.R;
        int i2 = true != z ? -2 : -1;
        viewGroup.getLayoutParams().height = i2;
        this.S.getLayoutParams().height = i2;
        this.S.h = !z;
        View view = this.T;
        int i3 = true != z ? 0 : 8;
        view.setVisibility(i3);
        if (this.ag.g()) {
            this.ac.setVisibility(i3);
        }
        ((ViewGroup.MarginLayoutParams) this.m.getLayoutParams()).topMargin = z ? 0 : ((ebpi) this.f).g;
        I(z ? 0 : this.O);
        n(this.R, z ? 0 : ((ebpi) this.f).a);
    }

    private static void H(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i);
        view.setLayoutParams(marginLayoutParams);
    }

    private final void I(int i) {
        if (this.H) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.ac.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        marginLayoutParams.setMarginStart(i);
        this.ac.setLayoutParams(marginLayoutParams);
    }

    private final void J() {
        if (this.m.getVisibility() == 0) {
            E();
        } else {
            F();
        }
    }

    private final void K(boolean z, boolean z2) {
        this.aj.setVisibility(true != (ebow.a(getContext()) && !z && z2) ? 8 : 0);
    }

    private final void L(float f, ehop ehopVar, View view) {
        if (this.ab.getVisibility() == 8) {
            f = 0.0f;
        }
        float f2 = this.I;
        int[] iArr = kvo.a;
        float f3 = f2 * f;
        kvd.j(view, f3);
        if (this.ag.g()) {
            ehopVar.O(ColorStateList.valueOf(this.ai.a(((Integer) this.ag.c()).intValue(), f)));
        } else {
            ehopVar.N(f3);
        }
    }

    private final void M(boolean z) {
        this.af.fy(D(this.f.l(), z));
    }

    private final boolean N() {
        return !this.f.l();
    }

    private static void O(LayoutTransition layoutTransition) {
        layoutTransition.setStartDelay(1, 0L);
    }

    private final void P() {
        this.p.setVisibility(8);
        findViewById(R.id.disclaimer_separator).setVisibility(8);
        findViewById(R.id.footer_bottom_padding).setVisibility(0);
    }

    static ezoo a() {
        ezon ezonVar = (ezon) ezoo.a.createBuilder();
        ezonVar.copyOnWrite();
        ezoo ezooVar = (ezoo) ezonVar.instance;
        ezooVar.d = 9;
        ezooVar.b |= 2;
        ezonVar.copyOnWrite();
        ezoo ezooVar2 = (ezoo) ezonVar.instance;
        ezooVar2.f = 2;
        ezooVar2.b |= 32;
        ezonVar.copyOnWrite();
        ezoo ezooVar3 = (ezoo) ezonVar.instance;
        ezooVar3.e = 3;
        ezooVar3.b |= 8;
        return (ezoo) ezonVar.build();
    }

    public static void m(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static void n(View view, int i) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void o(RecyclerView recyclerView, vk vkVar) {
        recyclerView.getContext();
        recyclerView.ap(new LinearLayoutManager());
        ebov.a(recyclerView, vkVar);
    }

    private final int v() {
        this.l.measure(0, 0);
        m(this.aa, this.l.getMeasuredHeight());
        this.R.measure(0, 0);
        return this.R.getMeasuredHeight() + ((ebpi) this.f).h;
    }

    private static AnimatorSet w(Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.addListener(animatorListener);
        return animatorSet;
    }

    private static LayoutTransition x() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        Interpolator interpolator = D;
        layoutTransition.setInterpolator(2, interpolator);
        layoutTransition.setInterpolator(3, interpolator);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(0, interpolator);
        layoutTransition.setInterpolator(4, interpolator);
        layoutTransition.enableTransitionType(4);
        O(layoutTransition);
        return layoutTransition;
    }

    private static ObjectAnimator y(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) B, 0.0f, 1.0f);
    }

    private static ObjectAnimator z(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) B, 1.0f, 0.0f);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int childCount = getChildCount();
        if (childCount == 0) {
            emxf.m(view.getId() == R.id.express_sign_in_internal_view, "express_sign_in_internal_view must be added first");
            super.addView(view, -1, layoutParams);
        } else {
            emxf.m(childCount == 1, "ExpressSignInLayoutInternal must contain a single content view.");
            this.ah.addView(view, 0, layoutParams);
            FrameLayout frameLayout = this.ah;
            super.addView(frameLayout, 0, frameLayout.getLayoutParams());
        }
    }

    @Override // defpackage.ebwc
    public final void b(ebvw ebvwVar) {
        ebvwVar.b(this.j, 90572);
        ebvwVar.b(B(), 90573);
        ebvwVar.b(this.h, 90574);
        ebvwVar.b(this.q, 90570);
        ebvwVar.b(this.k, 90771);
        ebvwVar.b(this.r, 90571);
    }

    public final void c() {
        ebse ebseVar = this.w;
        if (ebseVar != null) {
            ebseVar.b().run();
        }
        d();
    }

    public final void d() {
        Runnable runnable = this.u;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void f(eazq eazqVar, ebpf ebpfVar) {
        boolean z = eazqVar.a() + ebpfVar.a() > 0 && this.d;
        this.j.n(z ? 1 : 3);
        this.j.setOnClickListener(z ? new View.OnClickListener() { // from class: ebqk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ebrp ebrpVar = ebrp.this;
                ((ebpl) ebrpVar.e).e.f(new dvxf(5), view);
                ebrpVar.u(true != ebrpVar.b ? 44 : 45);
                ebrpVar.l(!ebrpVar.b);
            }
        } : null);
        this.j.setClickable(z);
        if (z) {
            return;
        }
        l(false);
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(Rect rect) {
        super.fitSystemWindows(rect);
        return N();
    }

    public final void g(ebry ebryVar, Object obj) {
        efbd.c();
        u(obj == null ? 31 : 52);
        u(38);
        ListenableFuture a2 = ((ebpn) ebryVar).a.a(emxc.i(obj));
        efbd.c();
        AnimatorSet w = w(new ebrh(this));
        w.playTogether(y(this.n), z(this.m), z(this.l));
        this.y = w;
        w.start();
        erqt.r(a2, new ebro(this), erpp.a);
    }

    public final void h(boolean z) {
        efbd.c();
        ebrm ebrmVar = new ebrm(this);
        if (!z) {
            ebrmVar.onAnimationStart(null);
            ebrmVar.onAnimationEnd(null);
        } else {
            AnimatorSet w = w(ebrmVar);
            w.playTogether(z(this.n), y(this.m), y(this.l));
            w.start();
        }
    }

    @Override // defpackage.ebwc
    public final void ho(ebvw ebvwVar) {
        ebvwVar.e(this.j);
        ebvwVar.e(B());
        ebvwVar.e(this.h);
        ebvwVar.e(this.q);
        ebvwVar.e(this.k);
        ebvwVar.e(this.r);
    }

    final void i() {
        int[] iArr = kvo.a;
        if (isAttachedToWindow()) {
            ((ebpl) this.e).e.f(new dvxf(5), B());
        }
    }

    public final void j(View view) {
        u(11);
        ((ebph) ((ebpl) this.e).f).d.onClick(view);
    }

    public final void k(boolean z) {
        this.b = z;
        this.ab.setVisibility(true != z ? 8 : 0);
        this.j.e(z);
        ((ViewGroup.MarginLayoutParams) this.j.getLayoutParams()).bottomMargin = z ? ((ebpi) this.f).k : 0;
        this.j.requestLayout();
        if (!this.H) {
            n(this.l, z ? this.L : 0);
        }
        View findViewById = findViewById(R.id.disclaimer_separator);
        ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).topMargin = this.M;
        findViewById.requestLayout();
        if (!this.G) {
            A(z, this.g, 150).start();
        }
        ebrs ebrsVar = this.e;
        K(z, (ebrsVar == null || ((ebpl) ebrsVar).b.b().isEmpty()) ? false : true);
        if (ebow.a(getContext())) {
            G(z);
            this.ah.setVisibility(true != z ? 0 : 4);
        }
        if (z) {
            this.x.gE().b(this.x, this.o);
            return;
        }
        this.o.f();
        G(false);
        this.h.ak(0);
    }

    public final void l(boolean z) {
        if (this.b != z) {
            k(z);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        Rect rect = new Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        if (N()) {
            this.ak.set(rect);
            this.Q.setPadding(rect.left, this.Q.getPaddingTop(), rect.right, this.Q.getPaddingBottom());
            this.ah.setPadding(rect.left, rect.top, rect.right, this.ah.getPaddingBottom());
            this.W.getLayoutParams().height = rect.top;
            m(this.l, rect.bottom);
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.ah.getLayoutParams().height = 0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        eboz ebozVar = this.s;
        if (ebozVar != null) {
            ebozVar.b(this.l.getMeasuredWidth());
        }
        eboz ebozVar2 = this.t;
        if (ebozVar2 != null) {
            ebozVar2.b(this.l.getMeasuredWidth());
        }
        int measuredHeight = this.l.getVisibility() == 8 ? 0 : this.l.getMeasuredHeight();
        if (this.aa.getPaddingBottom() != measuredHeight) {
            m(this.aa, measuredHeight);
            super.onMeasure(i, i2);
        }
        if (this.b) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.Q.getLayoutParams();
            if (this.R.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + this.ak.top + this.ak.bottom >= getHeight() && getHeight() > 0 && this.T.getVisibility() == 0) {
                G(true);
                super.onMeasure(i, i2);
            }
        }
        FrameLayout frameLayout = this.ah;
        int[] iArr = kvo.a;
        if (frameLayout.isAttachedToWindow()) {
            if (this.an == 0) {
                J();
                int v = v();
                J();
                this.an = Math.max(v, v());
            }
            int measuredHeight2 = this.R.getMeasuredHeight();
            if (!this.b && measuredHeight2 > this.an) {
                this.an = measuredHeight2;
            }
            int measuredHeight3 = getMeasuredHeight();
            int i3 = measuredHeight3 - this.an;
            if (!this.am.g() || (!this.b && (((Integer) this.am.c()).intValue() > i3 || measuredHeight3 != this.F))) {
                this.am = emxc.j(Integer.valueOf(i3));
                final FrameLayout frameLayout2 = this.ah;
                frameLayout2.getLayoutParams().height = i3;
                frameLayout2.getClass();
                frameLayout2.post(new Runnable() { // from class: ebqm
                    @Override // java.lang.Runnable
                    public final void run() {
                        frameLayout2.requestLayout();
                    }
                });
            }
            this.F = measuredHeight3;
        }
    }

    public final void p(View.OnClickListener onClickListener, engw engwVar) {
        this.c = true;
        this.s.a(engwVar);
        this.r.setOnClickListener(onClickListener);
        this.r.setVisibility(0);
    }

    public final void q(engw engwVar, Object obj) {
        if (engwVar.isEmpty()) {
            E();
            return;
        }
        if (obj != null) {
            this.j.k(obj);
            F();
            String f = ((ebph) ((ebpl) this.e).f).a.f(obj);
            eboz ebozVar = this.t;
            emxc j = emxe.b(f).trim().isEmpty() ? emux.a : emxc.j(f);
            Context context = getContext();
            engr engrVar = new engr();
            if (j.g()) {
                engrVar.h(context.getResources().getString(R.string.og_continue_as, j.c()));
            }
            engrVar.h(context.getResources().getString(R.string.og_continue));
            ebozVar.a(engrVar.g());
        }
    }

    public final void r() {
        L(Math.min(1.0f, this.U.getScrollY() / this.K), this.ad, this.V);
        float scrollY = this.U.getScrollY();
        float measuredHeight = this.U.getChildAt(0).getMeasuredHeight() - this.U.getMeasuredHeight();
        L(scrollY >= measuredHeight ? 0.0f : Math.min((measuredHeight - scrollY) / this.K, 1.0f), this.af, this.l);
    }

    public final void s(boolean z) {
        this.m.gu(z ? 0 : ((ebpi) this.f).e);
        this.ab.setBackgroundColor(z ? ((ebpi) this.f).e : 0);
    }

    public final void t(boolean z) {
        H(this.m, z ? 0 : ((ebpi) this.f).b);
        H(this.ab, z ? ((ebpi) this.f).b : 0);
        SelectedAccountView selectedAccountView = this.j;
        ebpo ebpoVar = this.f;
        int i = ((ebpi) ebpoVar).c + (z ? ((ebpi) ebpoVar).b : 0);
        selectedAccountView.setPadding(i, selectedAccountView.getPaddingTop(), i, selectedAccountView.getPaddingBottom());
    }

    public final void u(int i) {
        ezon ezonVar = (ezon) a().toBuilder();
        ezonVar.copyOnWrite();
        ezoo ezooVar = (ezoo) ezonVar.instance;
        ezooVar.c = i - 1;
        ezooVar.b |= 1;
        ezoo ezooVar2 = (ezoo) ezonVar.build();
        ebpl ebplVar = (ebpl) this.e;
        ebplVar.d.a(ebplVar.b.a(), ezooVar2);
    }
}
