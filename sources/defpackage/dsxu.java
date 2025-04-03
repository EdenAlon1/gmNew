package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxu implements dsyi {
    static final /* synthetic */ ffmx[] a;
    public final ernh b;
    public final RendererContainer c;
    public final ffix d;
    public final dswz e;
    public final ffix f;
    public final ffix g;
    public boolean h = true;
    public final Duration i;
    public final int j;
    public final int k;
    public final int l;
    public final View.OnTouchListener m;
    public final View.OnTouchListener n;
    public Instant o;
    public float p;
    public float q;
    public boolean r;
    private final View s;
    private Animator t;
    private final ViewConfiguration u;
    private final int v;
    private final ffbz w;
    private VelocityTracker x;
    private final ffls y;

    static {
        ffko ffkoVar = new ffko(dsxu.class, "isAttached", "isAttached()Z", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
    }

    public dsxu(ernh ernhVar, RendererContainer rendererContainer, ffix ffixVar, dswz dswzVar, ffix ffixVar2, ffix ffixVar3, View view) {
        this.b = ernhVar;
        this.c = rendererContainer;
        this.d = ffixVar;
        this.e = dswzVar;
        this.f = ffixVar2;
        this.g = ffixVar3;
        this.s = view;
        Duration ofMillis = Duration.ofMillis(ViewConfiguration.getLongPressTimeout());
        ofMillis.getClass();
        this.i = ofMillis;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(rendererContainer.getContext());
        this.u = viewConfiguration;
        int scaledMinimumFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.j = scaledMinimumFlingVelocity;
        this.v = scaledMinimumFlingVelocity * 4;
        this.k = viewConfiguration.getScaledMaximumFlingVelocity();
        this.l = viewConfiguration.getScaledTouchSlop();
        this.w = ffca.a(new ffix() { // from class: dsxn
            @Override // defpackage.ffix
            public final Object invoke() {
                return Long.valueOf(dsxu.this.c.getContext().getResources().getInteger(R.integer.short_animation_ms));
            }
        });
        this.m = new View.OnTouchListener() { // from class: dsxo
            /* JADX WARN: Type inference failed for: r10v2, types: [dsyj, java.lang.Object] */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                motionEvent.getClass();
                dsxu dsxuVar = dsxu.this;
                if (dsxuVar.h) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0) {
                        if (actionMasked == 2 && !dsxuVar.r) {
                            int rawY = (int) (motionEvent.getRawY() - dsxuVar.p);
                            boolean z = Math.abs(rawY) > dsxuVar.l;
                            if (!z) {
                                Instant instant = dsxuVar.o;
                                Instant instant2 = null;
                                if (instant == null) {
                                    ffkj.c("dragStartInstant");
                                    instant = null;
                                }
                                if (instant.isAfter(Instant.EPOCH)) {
                                    Instant a2 = dsxuVar.b.a();
                                    Instant instant3 = dsxuVar.o;
                                    if (instant3 == null) {
                                        ffkj.c("dragStartInstant");
                                    } else {
                                        instant2 = instant3;
                                    }
                                    if (a2.isAfter(instant2.plus(dsxuVar.i))) {
                                        dsxuVar.r = true;
                                    }
                                }
                            }
                            dsxuVar.c().addMovement(motionEvent);
                            if (z && dsxuVar.i(rawY)) {
                                return true;
                            }
                        }
                        return false;
                    }
                    dsxuVar.r = false;
                    dsxuVar.o = dsxuVar.b.a();
                    dsxuVar.p = motionEvent.getRawY();
                    dsxuVar.q = motionEvent.getRawY();
                    dsxuVar.c().addMovement(motionEvent);
                    ?? invoke = dsxuVar.d.invoke();
                    if (invoke == 0) {
                        return false;
                    }
                    invoke.c().a(dsxuVar);
                }
                return false;
            }
        };
        this.n = new View.OnTouchListener() { // from class: dsxp
            /* JADX WARN: Type inference failed for: r2v20, types: [dsyj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v12, types: [dsyj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v14, types: [dsyj, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r8v9, types: [dsyj, java.lang.Object] */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                motionEvent.getClass();
                dsxu dsxuVar = dsxu.this;
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        dsxuVar.c().addMovement(motionEvent);
                        float rawY = motionEvent.getRawY() - dsxuVar.q;
                        if (!dsxuVar.h) {
                            return false;
                        }
                        int i = (int) rawY;
                        if (!dsxuVar.i(i)) {
                            ?? invoke = dsxuVar.d.invoke();
                            if (invoke == 0 || ((i <= 0 || invoke.h()) && (i >= 0 || invoke.g()))) {
                                return false;
                            }
                            invoke.j(-i);
                        }
                        dsxuVar.q = motionEvent.getRawY();
                        return true;
                    }
                    if (actionMasked != 3) {
                        return false;
                    }
                }
                VelocityTracker c = dsxuVar.c();
                c.addMovement(motionEvent);
                c.computeCurrentVelocity(1000, dsxuVar.k);
                int yVelocity = (int) c.getYVelocity();
                float rawY2 = motionEvent.getRawY() - dsxuVar.p;
                if (Math.abs(yVelocity) > dsxuVar.j) {
                    int intValue = ((Number) dsxuVar.e.a.invoke()).intValue();
                    int intValue2 = ((Number) dsxuVar.f.invoke()).intValue();
                    int f = ffmk.f(((Number) dsxuVar.g.invoke()).intValue(), intValue2);
                    if (rawY2 >= 0.0f) {
                        ?? invoke2 = dsxuVar.d.invoke();
                        if (invoke2 == 0 || invoke2.a() != 0) {
                            ?? invoke3 = dsxuVar.d.invoke();
                            if (invoke3 != 0) {
                                invoke3.d(-yVelocity);
                            }
                        } else {
                            dsxuVar.d(intValue, intValue2, new DecelerateInterpolator());
                        }
                    } else if (intValue != f) {
                        dsxuVar.d(intValue, f, new DecelerateInterpolator());
                    }
                } else {
                    int intValue3 = ((Number) dsxuVar.e.a.invoke()).intValue();
                    int intValue4 = ((Number) dsxuVar.f.invoke()).intValue();
                    int f2 = ffmk.f(((Number) dsxuVar.g.invoke()).intValue(), intValue4);
                    if (f2 - intValue3 < intValue3 - intValue4) {
                        intValue4 = f2;
                    }
                    dsxuVar.d(intValue3, intValue4, new DecelerateInterpolator());
                }
                ?? invoke4 = dsxuVar.d.invoke();
                if (invoke4 != 0) {
                    invoke4.e();
                }
                dsxuVar.e();
                return true;
            }
        };
        this.q = -1.0f;
        this.y = new dsxr(false, this);
    }

    @Override // defpackage.dsyi
    public final void a(int i, float f) {
        if (this.h && i == 0) {
            float abs = Math.abs(f);
            int i2 = this.v;
            int intValue = ((Number) this.e.a.invoke()).intValue();
            int intValue2 = ((Number) this.f.invoke()).intValue();
            int f2 = ffmk.f(((Number) this.g.invoke()).intValue(), intValue2);
            if (abs >= i2) {
                if (f > 0.0f) {
                    intValue2 = f2;
                }
                d(intValue, intValue2, new DecelerateInterpolator());
            }
            g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [dsyj, java.lang.Object] */
    @Override // defpackage.dsyi
    public final void b(int i) {
        ?? invoke = this.d.invoke();
        if (invoke != 0) {
            h(invoke);
        }
    }

    public final VelocityTracker c() {
        VelocityTracker velocityTracker = this.x;
        if (velocityTracker != null) {
            return velocityTracker;
        }
        VelocityTracker obtain = VelocityTracker.obtain();
        obtain.clear();
        this.x = obtain;
        obtain.getClass();
        return obtain;
    }

    public final void d(int i, int i2, Interpolator interpolator) {
        Animator animator = this.t;
        if (animator != null) {
            animator.cancel();
        }
        ((Number) this.f.invoke()).intValue();
        ((Number) this.g.invoke()).intValue();
        if (i != i2) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
            ofInt.setDuration(((Number) this.w.a()).longValue());
            ofInt.setInterpolator(interpolator);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dsxm
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    valueAnimator.getClass();
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    animatedValue.getClass();
                    Integer num = (Integer) animatedValue;
                    num.intValue();
                    dsxu dsxuVar = dsxu.this;
                    dsxuVar.e.b.invoke(num);
                    dsxuVar.d.invoke();
                }
            });
            ofInt.addListener(new dsxq(this));
            ofInt.start();
            this.t = ofInt;
        }
    }

    public final void e() {
        VelocityTracker velocityTracker = this.x;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.x = null;
        this.q = -1.0f;
    }

    public final void f(boolean z) {
        this.y.d(a[0], Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dsyj, java.lang.Object] */
    public final void g() {
        Object obj;
        ?? invoke = this.d.invoke();
        if (invoke != 0) {
            dsyc c = invoke.c();
            if (c.b.remove(this) && c.b.isEmpty() && (obj = c.c) != null) {
                c.a.invoke(obj);
                c.c = null;
            }
        }
    }

    public final void h(dsyj dsyjVar) {
        int a2 = dsyjVar.a();
        View b = dsyjVar.b();
        if (b != null) {
            View view = this.s;
            if (view == null) {
                view = b;
            }
            if (view.getWidth() <= 0 || view.getHeight() <= 0) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(new dsxt(view, b, a2));
                return;
            } else {
                view.getWidth();
                b.setElevation(ffmk.g(a2 >> 3, view.getHeight()));
                return;
            }
        }
        View view2 = this.s;
        if (view2 != null) {
            if (view2.getWidth() <= 0 || view2.getHeight() <= 0) {
                view2.getViewTreeObserver().addOnGlobalLayoutListener(new dsxs(view2, a2));
                return;
            }
            view2.getWidth();
            view2.setTranslationY(-view2.getHeight());
            view2.setElevation(ffmk.g(a2 >> 3, r1));
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [dsyj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dsyj, java.lang.Object] */
    public final boolean i(int i) {
        if (i > 0) {
            ?? invoke = this.d.invoke();
            Integer valueOf = invoke != 0 ? Integer.valueOf(invoke.a()) : null;
            if (valueOf == null || valueOf.intValue() != 0) {
                return false;
            }
            if (!invoke.i(i)) {
                int intValue = ((Number) this.e.a.invoke()).intValue();
                int intValue2 = ((Number) this.f.invoke()).intValue();
                if (intValue <= intValue2) {
                    return false;
                }
                int i2 = intValue - i;
                this.e.b.invoke(Integer.valueOf(Math.max(i2, intValue2)));
            }
            return true;
        }
        int intValue3 = ((Number) this.e.a.invoke()).intValue();
        int intValue4 = ((Number) this.g.invoke()).intValue();
        ?? invoke2 = this.d.invoke();
        if (invoke2 != 0 && invoke2.g()) {
            return false;
        }
        this.d.invoke();
        if (intValue3 >= intValue4) {
            return false;
        }
        int i3 = intValue3 - i;
        this.e.b.invoke(Integer.valueOf(Math.min(i3, intValue4)));
        if (this.d.invoke() != null) {
            ((Number) this.f.invoke()).intValue();
        }
        return true;
    }
}
