package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Slide;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;
import j$.util.OptionalInt;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyag extends cxyq {
    public static final entd a = entd.c("BugleBanners");
    public cyah A;
    public cyah B;
    public cyah C;
    public cyah D;
    public int E;
    public int F;
    private final aw G;
    private final aw H;
    private ViewGroup I;
    private int J;
    private boolean K;
    private boolean L;
    public final elbx b;
    public final eler c;
    public final ffbr d;
    public final Context e;
    public final ConstraintLayout f;
    public final cyaf g;
    public ConstraintLayout h;
    public LinearLayout i;
    public IllustrationViewStub j;
    public IllustrationViewStub k;
    public ImageView l;
    public Button m;
    public Button n;
    public TextView o;
    public TextView p;
    public TextView q;
    public int r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public cxyp y;
    public cyah z;

    /* compiled from: PG */
    public final class a implements ellf {
    }

    public cyag(elbx elbxVar, eler elerVar, ffbr ffbrVar, Context context) {
        aw awVar = new aw();
        this.G = awVar;
        aw awVar2 = new aw();
        this.H = awVar2;
        this.E = 1;
        this.F = 1;
        this.J = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = false;
        this.K = false;
        this.v = true;
        this.w = true;
        this.x = true;
        this.L = false;
        this.b = elbxVar;
        this.c = elerVar;
        this.d = ffbrVar;
        this.e = context;
        ConstraintLayout constraintLayout = new ConstraintLayout(context);
        this.f = constraintLayout;
        constraintLayout.setClipToPadding(false);
        constraintLayout.setClipChildren(false);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        cyaf cyafVar = new cyaf(this, context);
        this.g = cyafVar;
        cyafVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ColorStateList valueOf = ColorStateList.valueOf(ehdr.d(context, R.attr.colorOutlineVariant, "FullBannerUiController"));
        ehca ehcaVar = cyafVar.t;
        if (ehcaVar.o != valueOf) {
            ehcaVar.o = valueOf;
            ehcaVar.k();
        }
        cyafVar.invalidate();
        cyafVar.setId(R.id.banner_card_id);
        constraintLayout.addView(cyafVar);
        awVar.e(constraintLayout);
        awVar.n(-2);
        awVar.o(0);
        int dimension = (int) context.getResources().getDimension(R.dimen.banner2o_full_outside_margin);
        awVar.f(R.id.banner_card_id, 7, 0, 7, dimension);
        awVar.f(R.id.banner_card_id, 3, 0, 3, dimension);
        awVar.f(R.id.banner_card_id, 4, 0, 4, dimension);
        awVar.f(R.id.banner_card_id, 6, 0, 6, dimension);
        awVar.b(constraintLayout);
        awVar2.e(constraintLayout);
        awVar2.n((int) context.getResources().getDimension(R.dimen.banner2o_chip_height));
        awVar2.o((int) context.getResources().getDimension(R.dimen.banner2o_chip_width));
        int dimension2 = (int) context.getResources().getDimension(R.dimen.banner2o_chip_outside_margin);
        awVar2.f(R.id.banner_card_id, 7, 0, 7, dimension2);
        awVar2.f(R.id.banner_card_id, 3, 0, 3, dimension2);
        awVar2.d(R.id.banner_card_id, 6);
        ((Integer) ((cfup) cxys.a.get()).e()).intValue();
    }

    private final Slide H(int i, int i2) {
        Slide slide = new Slide();
        slide.setDuration(i2);
        slide.setSlideEdge(i);
        slide.addTarget(this.g);
        slide.setInterpolator(new OvershootInterpolator());
        return slide;
    }

    private final void I() {
        this.E = 2;
        this.h.setVisibility(8);
        this.i.setVisibility(0);
        this.H.b(this.f);
        this.g.gw(this.e.getResources().getDimension(R.dimen.banner2o_chip_corner_radius));
        this.j.setScaleX(0.0f);
        this.j.setScaleY(0.0f);
        this.k.setScaleX(1.0f);
        this.k.setScaleY(1.0f);
    }

    private final void J() {
        this.E = 1;
        this.h.setVisibility(0);
        this.i.setVisibility(8);
        this.G.b(this.f);
        this.g.gw(this.e.getResources().getDimension(R.dimen.banner2o_full_corner_radius));
        this.j.setScaleX(1.0f);
        this.j.setScaleY(1.0f);
        this.k.setScaleX(0.0f);
        this.k.setScaleY(0.0f);
    }

    private final void K() {
        int dimension = (int) this.e.getResources().getDimension(R.dimen.banner2o_full_body_to_end_margin);
        if (this.o.getVisibility() == 8) {
            dimension = this.D == null ? 0 : (int) this.e.getResources().getDimension(R.dimen.banner2o_full_body_and_close_only_end_margin);
        }
        if (dimension == this.p.getPaddingEnd()) {
            return;
        }
        TextView textView = this.p;
        textView.setPadding(textView.getPaddingStart(), this.p.getPaddingTop(), dimension, this.p.getPaddingBottom());
        this.p.requestLayout();
    }

    private final void L(cxyp cxypVar, boolean z) {
        int i = cyaf.j;
        this.g.g();
        if (z) {
            Slide H = H(48, 500);
            H.addListener(new eleq(this.c, new cxzx(this, cxypVar), "FullBannerUiController: Slide out top transition"));
            ViewGroup viewGroup = this.I;
            viewGroup.getClass();
            TransitionManager.beginDelayedTransition(viewGroup, H);
            l(false);
            return;
        }
        this.r++;
        if (cxypVar != null) {
            cxypVar.b();
        }
        l(false);
        int i2 = this.r - 1;
        this.r = i2;
        if (i2 != 0 || cxypVar == null) {
            return;
        }
        cxypVar.a(this);
    }

    public final boolean A() {
        return this.J > 0 || this.r > 0 || this.s > 0;
    }

    public final void C() {
        this.K = true;
    }

    public final void D(int i, OptionalInt optionalInt) {
        IllustrationViewStub illustrationViewStub = this.j;
        illustrationViewStub.b = i;
        illustrationViewStub.f();
        IllustrationViewStub illustrationViewStub2 = this.k;
        illustrationViewStub2.b = i;
        illustrationViewStub2.f();
        optionalInt.ifPresent(new IntConsumer() { // from class: cxzu
            @Override // java.util.function.IntConsumer
            public final void accept(int i2) {
                cyag cyagVar = cyag.this;
                cyagVar.j.d(i2);
                cyagVar.k.d(i2);
            }

            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        });
        this.j.c();
        this.k.c();
    }

    public final void E() {
        this.n.setEnabled(false);
    }

    public final void F() {
        this.w = false;
    }

    public final void G() {
        this.J++;
    }

    @Override // defpackage.cxyq
    public final void a(ViewGroup viewGroup) {
        e(viewGroup, -1);
    }

    @Override // defpackage.cxyq
    public final void b() {
        ViewGroup viewGroup = (ViewGroup) this.f.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f);
        }
        this.I = null;
    }

    @Override // defpackage.cxyq
    public final void c(cxyp cxypVar, boolean z) {
        if (this.E == 2) {
            L(cxypVar, z);
            return;
        }
        if (!this.K) {
            L(cxypVar, z);
            return;
        }
        cyaf cyafVar = this.g;
        int i = cyaf.j;
        cyafVar.g();
        if (z) {
            Slide H = H(8388613, 500);
            H.addListener(new eleq(this.c, new cxzy(this, cxypVar), "FullBannerUiController: Slide out side transition"));
            ViewGroup viewGroup = this.I;
            viewGroup.getClass();
            TransitionManager.beginDelayedTransition(viewGroup, H);
            l(false);
            return;
        }
        this.s++;
        cxypVar.b();
        this.u = true;
        l(false);
        this.s--;
        if (this.r == 0) {
            cxypVar.a(this);
        }
    }

    @Override // defpackage.cxyq
    public final void d(cxyp cxypVar, boolean z) {
        L(null, false);
        int i = cyaf.j;
        this.g.g();
        if (z) {
            Slide H = H(48, 333);
            H.addListener(new eleq(this.c, new cxzw(this, cxypVar), "FullBannerUiController: Slide in top transition"));
            ViewGroup viewGroup = this.I;
            viewGroup.getClass();
            TransitionManager.beginDelayedTransition(viewGroup, H);
            l(true);
            return;
        }
        this.r++;
        cxypVar.b();
        l(true);
        int i2 = this.r - 1;
        this.r = i2;
        if (i2 == 0) {
            cxypVar.a(this);
        }
    }

    final void e(ViewGroup viewGroup, int i) {
        this.I = viewGroup;
        viewGroup.addView(this.f, i);
    }

    public final void f(boolean z) {
        g(null, z);
    }

    public final void g(cxyp cxypVar, boolean z) {
        if (this.E == 2 || this.t || this.s > 0 || this.u || !this.v) {
            return;
        }
        ((akzt) this.d.b()).c("Bugle.Banners2o.Collapsed.Count");
        if (!z) {
            j(cxypVar);
            I();
            i(cxypVar);
            return;
        }
        cyjt cyjtVar = new cyjt();
        cyjtVar.setDuration(166L);
        View view = this.j.e;
        view.getClass();
        cyjtVar.addTarget(view);
        Fade fade = new Fade(2);
        fade.setStartDelay(83L);
        fade.setDuration(83L);
        fade.addTarget(this.h);
        cyjs cyjsVar = new cyjs();
        cyjsVar.setStartDelay(83L);
        cyjsVar.setDuration(333L);
        cyjsVar.addTarget(this.g);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setStartDelay(83L);
        changeBounds.setDuration(333L);
        changeBounds.addTarget(this.f);
        changeBounds.addTarget(this.g);
        Fade fade2 = new Fade(1);
        fade2.setStartDelay(333L);
        fade2.setDuration(83L);
        fade2.addTarget(this.i);
        cyjt cyjtVar2 = new cyjt();
        cyjtVar2.setStartDelay(333L);
        cyjtVar2.setDuration(166L);
        View view2 = this.k.e;
        view2.getClass();
        cyjtVar2.addTarget(view2);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(fade);
        transitionSet.addTransition(changeBounds);
        transitionSet.addTransition(fade2);
        transitionSet.addTransition(cyjsVar);
        transitionSet.addTransition(cyjtVar);
        transitionSet.addTransition(cyjtVar2);
        transitionSet.addListener((Transition.TransitionListener) new eleq(this.c, new cxzz(this, cxypVar), "FullBannerUiController: Collapse transition"));
        TransitionManager.beginDelayedTransition(this.f, transitionSet);
        I();
    }

    public final void h(cxyp cxypVar, boolean z) {
        if (this.E == 1 || this.t || this.s > 0 || this.u) {
            return;
        }
        ((akzt) this.d.b()).c("Bugle.Banners2o.Expanded.Count");
        if (!z) {
            G();
            J();
            k(cxypVar);
            return;
        }
        cyjt cyjtVar = new cyjt();
        cyjtVar.setDuration(166L);
        View view = this.k.e;
        view.getClass();
        cyjtVar.addTarget(view);
        Fade fade = new Fade(2);
        fade.setStartDelay(83L);
        fade.setDuration(83L);
        fade.addTarget(this.i);
        cyjs cyjsVar = new cyjs();
        cyjsVar.setStartDelay(83L);
        cyjsVar.setDuration(333L);
        cyjsVar.addTarget(this.g);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.setStartDelay(83L);
        changeBounds.setDuration(333L);
        changeBounds.addTarget(this.f);
        changeBounds.addTarget(this.g);
        Fade fade2 = new Fade(1);
        fade2.setStartDelay(333L);
        fade2.setDuration(83L);
        fade2.addTarget(this.h);
        cyjt cyjtVar2 = new cyjt();
        cyjtVar2.setStartDelay(333L);
        cyjtVar2.setDuration(166L);
        View view2 = this.j.e;
        view2.getClass();
        cyjtVar2.addTarget(view2);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(fade);
        transitionSet.addTransition(changeBounds);
        transitionSet.addTransition(fade2);
        transitionSet.addTransition(cyjsVar);
        transitionSet.addTransition(cyjtVar2);
        transitionSet.addTransition(cyjtVar);
        transitionSet.addListener((Transition.TransitionListener) new eleq(this.c, new cyaa(this, cxypVar), "FullBannerUiController: Expand transition"));
        TransitionManager.beginDelayedTransition(this.f, transitionSet);
        J();
    }

    public final void i(cxyp cxypVar) {
        int i = this.J - 1;
        this.J = i;
        if (i == 0 && cxypVar != null) {
            cxypVar.a(this);
        }
    }

    public final void j(cxyp cxypVar) {
        this.J++;
        if (cxypVar != null) {
            cxypVar.b();
        }
    }

    public final void k(cxyp cxypVar) {
        int i = this.J - 1;
        this.J = i;
        if (i == 0 && cxypVar != null) {
            cxypVar.a(this);
        }
    }

    public final void l(boolean z) {
        if (z) {
            this.F = 1;
            this.g.setVisibility(0);
        } else {
            this.F = 2;
            this.g.setVisibility(4);
        }
    }

    public final void m(CharSequence charSequence) {
        n(charSequence, this.L);
    }

    public final void n(CharSequence charSequence, boolean z) {
        this.p.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
        this.p.setText(charSequence);
        this.L = z;
        this.p.setSingleLine(z);
        this.p.setEllipsize(z ? TextUtils.TruncateAt.END : null);
        K();
    }

    final void o(int i) {
        this.f.setVisibility(i);
    }

    public final void p(String str) {
        this.g.setContentDescription(str);
    }

    final void q(String str) {
        this.q.setVisibility(true != emxe.c(str) ? 0 : 8);
        this.q.setText(str);
    }

    public final void r(boolean z) {
        this.m.setEnabled(z);
    }

    public final void s(String str) {
        this.m.setVisibility(true != emxe.c(str) ? 0 : 8);
        this.m.setText(str);
        int dimension = (int) this.e.getResources().getDimension(R.dimen.banner2o_full_bottom_padding);
        if (this.m.getVisibility() == 8) {
            dimension = (int) this.e.getResources().getDimension(R.dimen.banner2o_full_bottom_padding_no_buttons);
        }
        if (dimension == this.h.getPaddingBottom()) {
            return;
        }
        ConstraintLayout constraintLayout = this.h;
        constraintLayout.setPadding(constraintLayout.getPaddingStart(), this.h.getPaddingTop(), this.h.getPaddingEnd(), dimension);
        this.h.requestLayout();
    }

    public final void t(int i, int i2) {
        D(i, OptionalInt.of(i2));
    }

    public final void u(cyah cyahVar) {
        this.l.setVisibility(0);
        this.D = cyahVar;
        this.l.setOnClickListener(new elay(this.b, "FullBannerUiController: Close clicked", new View.OnClickListener() { // from class: cxzs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cyag cyagVar = cyag.this;
                ((akzt) cyagVar.d.b()).c("Bugle.Banners2o.CloseButtonClicked.Count");
                cyah cyahVar2 = cyagVar.D;
                if (cyahVar2 != null) {
                    cyahVar2.f(cyagVar);
                }
                ((ensz) ((ensz) cyag.a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/FullBannerUiController", "setOnCloseClickListener", 378, "FullBannerUiController.java")).q("Banner close button clicked");
            }
        }));
        K();
    }

    public final void v(cyah cyahVar) {
        this.A = cyahVar;
        this.m.setOnClickListener(new elay(this.b, "FullBannerUiController: End button clicked", new View.OnClickListener() { // from class: cxzv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cyag cyagVar = cyag.this;
                ((akzt) cyagVar.d.b()).c("Bugle.Banners2o.EndButtonClicked.Count");
                cyah cyahVar2 = cyagVar.A;
                if (cyahVar2 != null) {
                    cyahVar2.f(cyagVar);
                }
                ((ensz) ((ensz) cyag.a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/FullBannerUiController", "setOnEndButtonClickListener", 342, "FullBannerUiController.java")).q("Banner end button clicked");
            }
        }));
    }

    public final void w(cyah cyahVar) {
        this.B = cyahVar;
        this.n.setOnClickListener(new elay(this.b, "FullBannerUiController: Start button clicked", new View.OnClickListener() { // from class: cxzt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cyag cyagVar = cyag.this;
                ((akzt) cyagVar.d.b()).c("Bugle.Banners2o.StartButtonClicked.Count");
                cyah cyahVar2 = cyagVar.B;
                if (cyahVar2 != null) {
                    cyahVar2.f(cyagVar);
                }
                ((ensz) ((ensz) cyag.a.h()).h("com/google/android/apps/messaging/ui/conversation/banners2o/FullBannerUiController", "setOnStartButtonClickListener", 359, "FullBannerUiController.java")).q("Banner start button clicked");
            }
        }));
    }

    public final void x(String str) {
        this.n.setVisibility(true != emxe.c(str) ? 0 : 8);
        this.n.setText(str);
    }

    public final void y(CharSequence charSequence) {
        this.o.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
        this.o.setText(charSequence);
        K();
    }

    public final void z(int i) {
        this.o.setTextColor(i);
    }
}
