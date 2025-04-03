package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.ui.DefaultTimeBar;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nvx {
    public final nva a;
    public final View b;
    public final ViewGroup c;
    public final ViewGroup d;
    public final ViewGroup e;
    public final ViewGroup f;
    public final ViewGroup g;
    public final ViewGroup h;
    public final ViewGroup i;
    public final View j;
    public final View k;
    public final AnimatorSet l;
    public final ValueAnimator m;
    public final ValueAnimator n;
    public boolean t;
    public boolean u;
    private final AnimatorSet w;
    private final AnimatorSet x;
    private final AnimatorSet y;
    private final AnimatorSet z;
    public final Runnable o = new Runnable() { // from class: nvg
        @Override // java.lang.Runnable
        public final void run() {
            nvx.this.l();
        }
    };
    private final Runnable A = new Runnable() { // from class: nvj
        @Override // java.lang.Runnable
        public final void run() {
            nvx.this.d();
        }
    };
    public final Runnable p = new Runnable() { // from class: nvk
        @Override // java.lang.Runnable
        public final void run() {
            nvx.this.f();
        }
    };
    private final Runnable B = new Runnable() { // from class: nvl
        @Override // java.lang.Runnable
        public final void run() {
            nvx nvxVar = nvx.this;
            nvxVar.l.start();
            nvxVar.g(nvxVar.p, 2000L);
        }
    };
    private final Runnable C = new Runnable() { // from class: nvm
        @Override // java.lang.Runnable
        public final void run() {
            nvx.this.e();
        }
    };
    public final View.OnLayoutChangeListener q = new View.OnLayoutChangeListener() { // from class: nvn
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final nvx nvxVar = nvx.this;
            nva nvaVar = nvxVar.a;
            int width = (nvaVar.getWidth() - nvaVar.getPaddingLeft()) - nvxVar.a.getPaddingRight();
            nva nvaVar2 = nvxVar.a;
            int height = (nvaVar2.getHeight() - nvaVar2.getPaddingBottom()) - nvxVar.a.getPaddingTop();
            ViewGroup viewGroup = nvxVar.c;
            int b = nvx.b(viewGroup) - (viewGroup != null ? viewGroup.getPaddingLeft() + nvxVar.c.getPaddingRight() : 0);
            ViewGroup viewGroup2 = nvxVar.c;
            int a = nvx.a(viewGroup2) - (viewGroup2 != null ? viewGroup2.getPaddingTop() + nvxVar.c.getPaddingBottom() : 0);
            int max = Math.max(b, nvx.b(nvxVar.i) + nvx.b(nvxVar.k));
            int a2 = nvx.a(nvxVar.d);
            boolean z = width <= max || height <= a + (a2 + a2);
            if (nvxVar.t != z) {
                nvxVar.t = z;
                view.post(new Runnable() { // from class: nvb
                    @Override // java.lang.Runnable
                    public final void run() {
                        nvx nvxVar2 = nvx.this;
                        ViewGroup viewGroup3 = nvxVar2.e;
                        if (viewGroup3 != null) {
                            viewGroup3.setVisibility(true != nvxVar2.t ? 4 : 0);
                        }
                        if (nvxVar2.j != null) {
                            int dimensionPixelSize = nvxVar2.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) nvxVar2.j.getLayoutParams();
                            if (marginLayoutParams != null) {
                                if (true == nvxVar2.t) {
                                    dimensionPixelSize = 0;
                                }
                                marginLayoutParams.bottomMargin = dimensionPixelSize;
                                nvxVar2.j.setLayoutParams(marginLayoutParams);
                            }
                            View view2 = nvxVar2.j;
                            if (view2 instanceof DefaultTimeBar) {
                                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view2;
                                if (nvxVar2.t) {
                                    defaultTimeBar.c(true);
                                } else {
                                    int i9 = nvxVar2.s;
                                    if (i9 == 1) {
                                        defaultTimeBar.c(false);
                                    } else if (i9 != 3) {
                                        if (defaultTimeBar.b.isStarted()) {
                                            defaultTimeBar.b.cancel();
                                        }
                                        defaultTimeBar.d = false;
                                        defaultTimeBar.c = 1.0f;
                                        defaultTimeBar.invalidate(defaultTimeBar.a);
                                    }
                                }
                            }
                        }
                        for (View view3 : nvxVar2.r) {
                            view3.setVisibility((nvxVar2.t && nvx.o(view3)) ? 4 : 0);
                        }
                    }
                });
            }
            int i9 = i3 - i;
            int i10 = i7 - i5;
            if (nvxVar.t || i9 == i10) {
                return;
            }
            view.post(new Runnable() { // from class: nvf
                @Override // java.lang.Runnable
                public final void run() {
                    int i11;
                    nvx nvxVar2 = nvx.this;
                    if (nvxVar2.f == null || nvxVar2.g == null) {
                        return;
                    }
                    nva nvaVar3 = nvxVar2.a;
                    int width2 = (nvaVar3.getWidth() - nvaVar3.getPaddingLeft()) - nvxVar2.a.getPaddingRight();
                    while (true) {
                        if (nvxVar2.g.getChildCount() <= 1) {
                            break;
                        }
                        int childCount = nvxVar2.g.getChildCount() - 2;
                        ViewGroup viewGroup3 = nvxVar2.g;
                        View childAt = viewGroup3.getChildAt(childCount);
                        viewGroup3.removeViewAt(childCount);
                        nvxVar2.f.addView(childAt, 0);
                    }
                    View view2 = nvxVar2.k;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    ViewGroup viewGroup4 = nvxVar2.i;
                    ViewGroup viewGroup5 = nvxVar2.f;
                    int b2 = nvx.b(viewGroup4);
                    int childCount2 = viewGroup5.getChildCount() - 1;
                    for (int i12 = 0; i12 < childCount2; i12++) {
                        b2 += nvx.b(nvxVar2.f.getChildAt(i12));
                    }
                    if (b2 <= width2) {
                        ViewGroup viewGroup6 = nvxVar2.h;
                        if (viewGroup6 == null || viewGroup6.getVisibility() != 0 || nvxVar2.n.isStarted()) {
                            return;
                        }
                        nvxVar2.m.cancel();
                        nvxVar2.n.start();
                        return;
                    }
                    View view3 = nvxVar2.k;
                    if (view3 != null) {
                        view3.setVisibility(0);
                        b2 += nvx.b(nvxVar2.k);
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i13 = 0; i13 < childCount2; i13++) {
                        View childAt2 = nvxVar2.f.getChildAt(i13);
                        b2 -= nvx.b(childAt2);
                        arrayList.add(childAt2);
                        if (b2 <= width2) {
                            break;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    nvxVar2.f.removeViews(0, arrayList.size());
                    for (i11 = 0; i11 < arrayList.size(); i11++) {
                        nvxVar2.g.addView((View) arrayList.get(i11), nvxVar2.g.getChildCount() - 1);
                    }
                }
            });
        }
    };
    public boolean v = true;
    public int s = 0;
    public final List r = new ArrayList();

    public nvx(nva nvaVar) {
        this.a = nvaVar;
        this.b = nvaVar.findViewById(R.id.exo_controls_background);
        this.c = (ViewGroup) nvaVar.findViewById(R.id.exo_center_controls);
        this.e = (ViewGroup) nvaVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) nvaVar.findViewById(R.id.exo_bottom_bar);
        this.d = viewGroup;
        this.i = (ViewGroup) nvaVar.findViewById(R.id.exo_time);
        View findViewById = nvaVar.findViewById(R.id.exo_progress);
        this.j = findViewById;
        this.f = (ViewGroup) nvaVar.findViewById(R.id.exo_basic_controls);
        this.g = (ViewGroup) nvaVar.findViewById(R.id.exo_extra_controls);
        this.h = (ViewGroup) nvaVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = nvaVar.findViewById(R.id.exo_overflow_show);
        this.k = findViewById2;
        View findViewById3 = nvaVar.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener() { // from class: nvc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nvx nvxVar = nvx.this;
                    nvxVar.i();
                    if (view.getId() == R.id.exo_overflow_show) {
                        nvxVar.m.start();
                    } else if (view.getId() == R.id.exo_overflow_hide) {
                        nvxVar.n.start();
                    }
                }
            });
            findViewById3.setOnClickListener(new View.OnClickListener() { // from class: nvc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nvx nvxVar = nvx.this;
                    nvxVar.i();
                    if (view.getId() == R.id.exo_overflow_show) {
                        nvxVar.m.start();
                    } else if (view.getId() == R.id.exo_overflow_hide) {
                        nvxVar.n.start();
                    }
                }
            });
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nvd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nvx nvxVar = nvx.this;
                View view = nvxVar.b;
                if (view != null) {
                    view.setAlpha(floatValue);
                }
                ViewGroup viewGroup2 = nvxVar.c;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(floatValue);
                }
                ViewGroup viewGroup3 = nvxVar.e;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(floatValue);
                }
            }
        });
        ofFloat.addListener(new nvo(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nve
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nvx nvxVar = nvx.this;
                View view = nvxVar.b;
                if (view != null) {
                    view.setAlpha(floatValue);
                }
                ViewGroup viewGroup2 = nvxVar.c;
                if (viewGroup2 != null) {
                    viewGroup2.setAlpha(floatValue);
                }
                ViewGroup viewGroup3 = nvxVar.e;
                if (viewGroup3 != null) {
                    viewGroup3.setAlpha(floatValue);
                }
            }
        });
        ofFloat2.addListener(new nvp(this));
        Resources resources = nvaVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new nvq(this, nvaVar));
        animatorSet.play(ofFloat).with(p(0.0f, dimension, findViewById)).with(p(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.w = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new nvr(this, nvaVar));
        animatorSet2.play(p(dimension, dimension2, findViewById)).with(p(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.x = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new nvs(this, nvaVar));
        animatorSet3.play(ofFloat).with(p(0.0f, dimension2, findViewById)).with(p(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.y = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new nvt(this));
        animatorSet4.play(ofFloat2).with(p(dimension, 0.0f, findViewById)).with(p(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.z = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new nvu(this));
        animatorSet5.play(ofFloat2).with(p(dimension2, 0.0f, findViewById)).with(p(dimension2, 0.0f, viewGroup));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.m = ofFloat3;
        ofFloat3.setDuration(250L);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nvh
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                nvx.this.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat3.addListener(new nvv(this));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.n = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nvi
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                nvx.this.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat4.addListener(new nvw(this));
    }

    public static int a(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static int b(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static final boolean o(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    private static ObjectAnimator p(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    public final void c(float f) {
        if (this.h != null) {
            this.h.setTranslationX((int) (r0.getWidth() * (1.0f - f)));
        }
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f - f);
        }
        ViewGroup viewGroup2 = this.f;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
    }

    public final void d() {
        this.x.start();
    }

    public final void e() {
        k(2);
    }

    public final void f() {
        this.w.start();
    }

    public final void g(Runnable runnable, long j) {
        this.a.postDelayed(runnable, j);
    }

    public final void h() {
        this.a.removeCallbacks(this.C);
        this.a.removeCallbacks(this.A);
        this.a.removeCallbacks(this.B);
        this.a.removeCallbacks(this.p);
    }

    public final void i() {
        if (this.s == 3) {
            return;
        }
        h();
        int i = this.a.H;
        if (i > 0) {
            if (!this.v) {
                g(this.C, i);
            } else if (this.s == 1) {
                g(this.p, 2000L);
            } else {
                g(this.B, i);
            }
        }
    }

    public final void j(View view, boolean z) {
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
            this.r.remove(view);
            return;
        }
        if (this.t && o(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.r.add(view);
    }

    public final void k(int i) {
        int i2 = this.s;
        this.s = i;
        if (i == 2) {
            this.a.setVisibility(8);
        } else if (i2 == 2) {
            this.a.setVisibility(0);
            i2 = 2;
        }
        if (i2 != i) {
            nva nvaVar = this.a;
            Iterator it = nvaVar.b.iterator();
            while (it.hasNext()) {
                nuz nuzVar = (nuz) it.next();
                nvaVar.getVisibility();
                nuzVar.E();
            }
        }
    }

    public final void l() {
        if (!this.v) {
            k(0);
            i();
            return;
        }
        int i = this.s;
        if (i == 1) {
            this.y.start();
        } else if (i == 2) {
            this.z.start();
        } else if (i == 3) {
            this.u = true;
        } else if (i == 4) {
            return;
        }
        i();
    }

    public final boolean m(View view) {
        return view != null && this.r.contains(view);
    }
}
