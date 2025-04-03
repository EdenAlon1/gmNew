package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tn extends vt implements wb {
    private static final int[] r = {R.attr.state_pressed};
    private static final int[] s = new int[0];
    private final Runnable D;
    private final wc E;
    public final int a;
    final StateListDrawable b;
    final Drawable c;
    int d;
    int e;
    float f;
    int g;
    int h;
    float i;
    public RecyclerView l;
    final ValueAnimator p;
    int q;
    private final int t;
    private final int u;
    private final int v;
    private final StateListDrawable w;
    private final Drawable x;
    private final int y;
    private final int z;
    public int j = 0;
    public int k = 0;
    public boolean m = false;
    public boolean n = false;
    public int o = 0;
    private int A = 0;
    private final int[] B = new int[2];
    private final int[] C = new int[2];

    public tn(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.p = ofFloat;
        this.q = 0;
        this.D = new tj(this);
        tk tkVar = new tk(this);
        this.E = tkVar;
        this.b = stateListDrawable;
        this.c = drawable;
        this.w = stateListDrawable2;
        this.x = drawable2;
        this.u = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.v = Math.max(i, drawable.getIntrinsicWidth());
        this.y = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.z = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.t = i3;
        stateListDrawable.setAlpha(PrivateKeyType.INVALID);
        drawable.setAlpha(PrivateKeyType.INVALID);
        ofFloat.addListener(new tl(this));
        ofFloat.addUpdateListener(new tm(this));
        RecyclerView recyclerView2 = this.l;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.ae(this);
            this.l.ah(this);
            this.l.ai(tkVar);
            l();
        }
        this.l = recyclerView;
        if (recyclerView != null) {
            recyclerView.w(this);
            this.l.y(this);
            this.l.z(tkVar);
        }
    }

    private final void l() {
        this.l.removeCallbacks(this.D);
    }

    private final void m(int i) {
        l();
        this.l.postDelayed(this.D, i);
    }

    private final boolean n() {
        return this.l.getLayoutDirection() == 1;
    }

    private static final int o(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // defpackage.wb
    public final void d(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.o == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean i = i(motionEvent.getX(), motionEvent.getY());
            boolean h = h(motionEvent.getX(), motionEvent.getY());
            if (i) {
                if (!h) {
                    this.A = 2;
                    this.f = (int) motionEvent.getY();
                    f(2);
                    return;
                }
            } else if (!h) {
                return;
            }
            this.A = 1;
            this.i = (int) motionEvent.getX();
            f(2);
            return;
        }
        if (motionEvent.getAction() == 1 && this.o == 2) {
            this.f = 0.0f;
            this.i = 0.0f;
            f(1);
            this.A = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.o == 2) {
            g();
            if (this.A == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.C;
                int i2 = this.t;
                iArr[0] = i2;
                int i3 = this.j - i2;
                iArr[1] = i3;
                float max = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.h - max) >= 2.0f) {
                    int o = o(this.i, max, iArr, this.l.computeHorizontalScrollRange(), this.l.computeHorizontalScrollOffset(), this.j);
                    if (o != 0) {
                        this.l.scrollBy(o, 0);
                    }
                    this.i = max;
                }
            }
            if (this.A == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.B;
                int i4 = this.t;
                iArr2[0] = i4;
                int i5 = this.k - i4;
                iArr2[1] = i5;
                float max2 = Math.max(i4, Math.min(i5, y));
                if (Math.abs(this.e - max2) >= 2.0f) {
                    int o2 = o(this.f, max2, iArr2, this.l.computeVerticalScrollRange(), this.l.computeVerticalScrollOffset(), this.k);
                    if (o2 != 0) {
                        this.l.scrollBy(0, o2);
                    }
                    this.f = max2;
                }
            }
        }
    }

    final void e() {
        this.l.invalidate();
    }

    final void f(int i) {
        if (i == 2 && this.o != 2) {
            this.b.setState(r);
            l();
        }
        if (i == 0) {
            e();
        } else {
            g();
        }
        if (this.o == 2 && i != 2) {
            this.b.setState(s);
            m(1200);
        } else if (i == 1) {
            m(1500);
        }
        this.o = i;
    }

    public final void g() {
        int i = this.q;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.p.cancel();
            }
        }
        this.q = 1;
        ValueAnimator valueAnimator = this.p;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.p.setDuration(500L);
        this.p.setStartDelay(0L);
        this.p.start();
    }

    final boolean h(float f, float f2) {
        if (f2 < this.k - this.y) {
            return false;
        }
        int i = this.h;
        int i2 = this.g / 2;
        return f >= ((float) (i - i2)) && f <= ((float) (i + i2));
    }

    final boolean i(float f, float f2) {
        if (n()) {
            if (f > this.u) {
                return false;
            }
        } else if (f < this.j - this.u) {
            return false;
        }
        int i = this.e;
        int i2 = this.d / 2;
        return f2 >= ((float) (i - i2)) && f2 <= ((float) (i + i2));
    }

    @Override // defpackage.wb
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.o;
        if (i != 1) {
            return i == 2;
        }
        boolean i2 = i(motionEvent.getX(), motionEvent.getY());
        boolean h = h(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (i2) {
            if (!h) {
                this.A = 2;
                this.f = (int) motionEvent.getY();
                f(2);
                return true;
            }
        } else if (!h) {
            return false;
        }
        this.A = 1;
        this.i = (int) motionEvent.getX();
        f(2);
        return true;
    }

    @Override // defpackage.vt
    public final void k(Canvas canvas, RecyclerView recyclerView) {
        if (this.j != this.l.getWidth() || this.k != this.l.getHeight()) {
            this.j = this.l.getWidth();
            this.k = this.l.getHeight();
            f(0);
            return;
        }
        if (this.q != 0) {
            if (this.m) {
                int i = this.j;
                int i2 = this.u;
                int i3 = i - i2;
                int i4 = this.e;
                int i5 = this.d;
                int i6 = i4 - (i5 / 2);
                this.b.setBounds(0, 0, i2, i5);
                this.c.setBounds(0, 0, this.v, this.k);
                float f = i6;
                float f2 = -i6;
                if (n()) {
                    this.c.draw(canvas);
                    canvas.translate(this.u, f);
                    canvas.scale(-1.0f, 1.0f);
                    this.b.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-this.u, f2);
                } else {
                    canvas.translate(i3, 0.0f);
                    this.c.draw(canvas);
                    canvas.translate(0.0f, f);
                    this.b.draw(canvas);
                    canvas.translate(-i3, f2);
                }
            }
            if (this.n) {
                int i7 = this.k;
                int i8 = this.y;
                int i9 = this.h;
                int i10 = this.g;
                this.w.setBounds(0, 0, i10, i8);
                this.x.setBounds(0, 0, this.j, this.z);
                canvas.translate(0.0f, i7 - i8);
                this.x.draw(canvas);
                canvas.translate(i9 - (i10 / 2), 0.0f);
                this.w.draw(canvas);
                canvas.translate(-r3, -r8);
            }
        }
    }

    @Override // defpackage.wb
    public final void c(boolean z) {
    }
}
