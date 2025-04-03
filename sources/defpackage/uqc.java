package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Property;
import android.util.StateSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqc extends wc implements View.OnLayoutChangeListener, wb {
    public final RecyclerView a;
    public final ViewGroupOverlay b;
    public final TextView c;
    private final Context f;
    private final cxqh g;
    private final csrh h;
    private final ImageView i;
    private final ImageView j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final boolean t;
    private AnimatorSet w;
    private ObjectAnimator x;
    private final Rect r = new Rect();
    private final Handler s = new Handler();
    private boolean u = false;
    public boolean d = false;
    private boolean v = false;
    public boolean e = false;
    private final Runnable y = new uqa(this);

    public uqc(cxqh cxqhVar, csrh csrhVar, RecyclerView recyclerView, int i) {
        Context context = recyclerView.getContext();
        this.f = context;
        this.a = recyclerView;
        this.g = cxqhVar;
        this.h = csrhVar;
        this.t = 1 == (i ^ 1);
        Resources resources = context.getResources();
        this.k = resources.getDimensionPixelSize(R.dimen.fastscroll_track_width);
        this.l = resources.getDimensionPixelSize(R.dimen.fastscroll_thumb_height);
        this.m = resources.getDimensionPixelSize(R.dimen.fastscroll_preview_height);
        this.n = resources.getDimensionPixelSize(R.dimen.fastscroll_preview_min_width);
        this.o = resources.getDimensionPixelOffset(R.dimen.fastscroll_preview_margin_top);
        this.p = resources.getDimensionPixelOffset(R.dimen.fastscroll_preview_margin_left_right);
        this.q = resources.getDimensionPixelOffset(R.dimen.fastscroll_touch_slop);
        LayoutInflater from = LayoutInflater.from(context);
        ImageView imageView = (ImageView) from.inflate(R.layout.fastscroll_track, (ViewGroup) null);
        this.i = imageView;
        ImageView imageView2 = (ImageView) from.inflate(R.layout.fastscroll_thumb, (ViewGroup) null);
        this.j = imageView2;
        TextView textView = (TextView) from.inflate(R.layout.fastscroll_preview, (ViewGroup) null);
        this.c = textView;
        ViewGroupOverlay overlay = recyclerView.getOverlay();
        this.b = overlay;
        overlay.add(imageView);
        overlay.add(imageView2);
        overlay.add(textView);
    }

    private final void h() {
        if (this.d) {
            this.s.removeCallbacks(this.y);
        }
    }

    private final void i() {
        this.v = false;
        this.j.setPressed(false);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.c, (Property<TextView, Float>) View.ALPHA, 0.0f);
        this.x = ofFloat;
        ofFloat.setDuration(300L);
        this.x.start();
        k();
    }

    private final void k() {
        h();
        this.s.postDelayed(this.y, 1500L);
        this.d = true;
    }

    @Override // defpackage.wc
    public final void a(RecyclerView recyclerView, int i, int i2) {
        g();
    }

    @Override // defpackage.wc
    public final void b(RecyclerView recyclerView, int i) {
        if (i != 1) {
            if (i != 0 || this.v) {
                return;
            }
            k();
            return;
        }
        if (!this.u) {
            RecyclerView recyclerView2 = this.a;
            int computeVerticalScrollRange = recyclerView2.computeVerticalScrollRange();
            int computeVerticalScrollExtent = recyclerView2.computeVerticalScrollExtent();
            if (computeVerticalScrollRange != 0 && computeVerticalScrollExtent != 0 && computeVerticalScrollRange / computeVerticalScrollExtent > 2.0f) {
                AnimatorSet animatorSet = this.w;
                if (animatorSet != null && animatorSet.isRunning()) {
                    this.w.cancel();
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.i, (Property<ImageView, Float>) View.TRANSLATION_X, 0.0f);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.j, (Property<ImageView, Float>) View.TRANSLATION_X, 0.0f);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ofFloat, ofFloat2);
                animatorSet2.setDuration(150L);
                animatorSet2.start();
                this.u = true;
                g();
            }
        }
        h();
    }

    @Override // defpackage.wb
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.v) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    float y = motionEvent.getY();
                    float min = Math.min(Math.max((y - (this.r.top + (this.l / 2))) / (this.r.height() - this.l), 0.0f), 1.0f);
                    if (this.a.n != null) {
                        this.a.ak((int) ((r0.a() - 1) * (1.0f - min)));
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    return;
                }
            }
            i();
        }
    }

    public final void e(boolean z) {
        float f = this.t ? this.k : -this.k;
        if (z) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.i, (Property<ImageView, Float>) View.TRANSLATION_X, f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.j, (Property<ImageView, Float>) View.TRANSLATION_X, f);
            AnimatorSet animatorSet = new AnimatorSet();
            this.w = animatorSet;
            animatorSet.playTogether(ofFloat, ofFloat2);
            this.w.setDuration(300L);
            this.w.start();
        } else {
            this.i.setTranslationX(f);
            this.j.setTranslationX(f);
        }
        this.u = false;
    }

    public final void f() {
        cxqh cxqhVar = this.g;
        Drawable drawable = cxqhVar.a;
        if (drawable == null) {
            drawable = cxqhVar.d.getDrawable(R.drawable.fastscroll_preview_left);
            cxqhVar.a = drawable;
        }
        Drawable drawable2 = cxqhVar.b;
        if (drawable2 == null) {
            drawable2 = cxqhVar.d.getDrawable(R.drawable.fastscroll_preview_right);
            cxqhVar.b = drawable2;
        }
        boolean z = this.t;
        Context context = this.f;
        TextView textView = this.c;
        if (true == z) {
            drawable = drawable2;
        }
        drawable.getClass();
        textView.setBackground(ctap.j(context, drawable, cxqh.b(context)));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, this.g.j(this.f, true));
        stateListDrawable.addState(StateSet.WILD_CARD, this.g.j(this.f, false));
        this.j.setImageDrawable(stateListDrawable);
        ImageView imageView = this.i;
        cxqh cxqhVar2 = this.g;
        Context context2 = this.f;
        int color = context2.getColor(R.color.fastscroll_tint_color);
        if (cxqhVar2.c == null) {
            cxqhVar2.c = cxqhVar2.d.getDrawable(R.drawable.fastscroll_track);
        }
        Drawable drawable3 = cxqhVar2.c;
        drawable3.getClass();
        imageView.setImageDrawable(ctap.j(context2, drawable3, color));
    }

    public final void g() {
        int i;
        int i2;
        int i3;
        int measuredWidth;
        int L;
        wr i4;
        if (this.u) {
            if (this.e) {
                this.b.add(this.i);
                this.b.add(this.j);
                this.b.add(this.c);
                this.e = false;
            }
            int height = this.r.height() - this.l;
            int i5 = this.r.top + (this.l / 2);
            RecyclerView recyclerView = this.a;
            int computeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
            int computeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            float f = 1.0f;
            if (computeVerticalScrollRange != 0 && computeVerticalScrollExtent != 0) {
                f = Math.min(computeVerticalScrollOffset, r3) / (computeVerticalScrollRange - computeVerticalScrollExtent);
            }
            int i6 = i5 + ((int) (height * f));
            this.j.measure(View.MeasureSpec.makeMeasureSpec(this.k, 1073741824), View.MeasureSpec.makeMeasureSpec(this.l, 1073741824));
            if (this.t) {
                i = this.r.right - this.k;
            } else {
                i = this.r.left;
            }
            int height2 = i6 - (this.j.getHeight() / 2);
            if (this.t) {
                i2 = this.r.right;
            } else {
                i2 = this.r.left + this.k;
            }
            this.j.layout(i, height2, i2, this.l + height2);
            if (this.v) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.a.o;
                if (linearLayoutManager != null && (L = linearLayoutManager.L()) != -1 && (i4 = this.a.i(L)) != null) {
                    KeyEvent.Callback callback = i4.a;
                    if (callback instanceof czid) {
                        this.c.setText(this.h.f(((czid) callback).c().i(), true, true, false));
                    }
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.r.width(), Integer.MIN_VALUE);
                int i7 = this.m;
                TextView textView = this.c;
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
                textView.measure(makeMeasureSpec, makeMeasureSpec2);
                if (this.c.getMeasuredWidth() < this.n) {
                    this.c.measure(View.MeasureSpec.makeMeasureSpec(this.n, 1073741824), makeMeasureSpec2);
                }
                int i8 = this.r.top + this.o;
                if (this.t) {
                    measuredWidth = (this.r.right - this.k) - this.p;
                    i3 = measuredWidth - this.c.getMeasuredWidth();
                } else {
                    i3 = this.p + this.r.left + this.k;
                    measuredWidth = this.c.getMeasuredWidth() + i3;
                }
                int measuredHeight = i6 - this.c.getMeasuredHeight();
                if (measuredHeight < i8) {
                    i6 = this.c.getMeasuredHeight() + i8;
                } else {
                    i8 = measuredHeight;
                }
                this.c.layout(i3, i8, measuredWidth, i6);
            }
        }
    }

    @Override // defpackage.wb
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (!this.u) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    return this.v;
                }
                if (actionMasked != 3) {
                    return false;
                }
            }
            if (!this.v) {
                return false;
            }
            i();
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int left = this.j.getLeft() - this.q;
        int right = this.j.getRight() + this.q;
        if (x < left || x > right || y < this.j.getTop() || y > this.j.getBottom()) {
            return false;
        }
        this.v = true;
        this.j.setPressed(true);
        g();
        ObjectAnimator objectAnimator = this.x;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.x.cancel();
        }
        this.c.setAlpha(1.0f);
        h();
        return true;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        if (!this.u) {
            e(false);
        }
        this.r.set(i, i2 + this.a.getPaddingTop(), i3, i4);
        int max = Math.max(0, this.r.height());
        this.i.measure(View.MeasureSpec.makeMeasureSpec(this.k, 1073741824), View.MeasureSpec.makeMeasureSpec(max, 1073741824));
        if (this.t) {
            Rect rect = this.r;
            i9 = rect.right - this.k;
        } else {
            i9 = this.r.left;
        }
        Rect rect2 = this.r;
        boolean z = this.t;
        int i11 = rect2.top;
        if (z) {
            i10 = this.r.right;
        } else {
            Rect rect3 = this.r;
            i10 = rect3.left + this.k;
        }
        this.i.layout(i9, i11, i10, this.r.bottom);
        g();
    }

    @Override // defpackage.wb
    public final void c(boolean z) {
    }
}
