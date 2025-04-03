package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frw extends View {
    public fsh b;
    public Boolean c;
    public Runnable d;
    public ffix e;
    private Long g;
    private static final int[] f = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] a = new int[0];

    public frw(Context context) {
        super(context);
    }

    public final void a() {
        this.e = null;
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.d;
            runnable2.getClass();
            runnable2.run();
        } else {
            fsh fshVar = this.b;
            if (fshVar != null) {
                fshVar.setState(a);
            }
        }
        fsh fshVar2 = this.b;
        if (fshVar2 == null) {
            return;
        }
        fshVar2.setVisible(false, false);
        unscheduleDrawable(fshVar2);
    }

    public final void b(long j, int i, long j2, float f2) {
        long f3;
        fsh fshVar = this.b;
        if (fshVar == null) {
            return;
        }
        Integer num = fshVar.b;
        if (num == null || num.intValue() != i) {
            fshVar.b = Integer.valueOf(i);
            fshVar.setRadius(i);
        }
        if (Build.VERSION.SDK_INT < 28) {
            f2 += f2;
        }
        f3 = iby.f(ibw.d(j2), ibw.c(j2), ibw.b(j2), ffmk.d(f2, 1.0f), ibw.f(j2));
        ibw ibwVar = fshVar.a;
        if (ibwVar == null || !ffcp.a(ibwVar.i, f3)) {
            fshVar.a = new ibw(f3);
            fshVar.setColor(ColorStateList.valueOf(iby.b(f3)));
        }
        Rect rect = new Rect(0, 0, ffln.b(iar.c(j)), ffln.b(iar.a(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        fshVar.setBounds(rect);
    }

    public final void c(boolean z) {
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.g;
        long longValue = currentAnimationTimeMillis - (l != null ? l.longValue() : 0L);
        if (z) {
            iArr = f;
        } else {
            if (longValue < 5) {
                Runnable runnable2 = new Runnable() { // from class: frv
                    @Override // java.lang.Runnable
                    public final void run() {
                        frw frwVar = frw.this;
                        fsh fshVar = frwVar.b;
                        if (fshVar != null) {
                            fshVar.setState(frw.a);
                        }
                        frwVar.d = null;
                    }
                };
                this.d = runnable2;
                postDelayed(runnable2, 50L);
                this.g = Long.valueOf(currentAnimationTimeMillis);
            }
            iArr = a;
        }
        fsh fshVar = this.b;
        if (fshVar != null) {
            fshVar.setState(iArr);
        }
        this.g = Long.valueOf(currentAnimationTimeMillis);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            a();
        }
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        ffix ffixVar = this.e;
        if (ffixVar != null) {
            ffixVar.invoke();
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
