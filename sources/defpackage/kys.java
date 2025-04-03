package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kys implements View.OnTouchListener {
    private static final int f = ViewConfiguration.getTapTimeout();
    final kyq a;
    final View b;
    boolean c;
    boolean d;
    boolean e;
    private final Interpolator g;
    private Runnable h;
    private final float[] i;
    private final float[] j;
    private final int k;
    private final float[] l;
    private final float[] m;
    private final float[] n;
    private boolean o;
    private boolean p;

    public kys(View view) {
        kyq kyqVar = new kyq();
        this.a = kyqVar;
        this.g = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.i = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.j = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.l = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.m = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.n = fArr5;
        this.b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f2 = displayMetrics.density * 1575.0f;
        float f3 = displayMetrics.density * 315.0f;
        float f4 = ((int) (f2 + 0.5f)) / 1000.0f;
        fArr5[0] = f4;
        fArr5[1] = f4;
        float f5 = ((int) (f3 + 0.5f)) / 1000.0f;
        fArr4[0] = f5;
        fArr4[1] = f5;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.k = f;
        kyqVar.a = 500;
        kyqVar.b = 500;
    }

    static float a(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final float f(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.i
            r0 = r0[r4]
            float r0 = r0 * r6
            float[] r1 = r3.j
            r1 = r1[r4]
            r2 = 0
            float r0 = a(r0, r2, r1)
            float r6 = r6 - r5
            float r5 = r3.g(r5, r0)
            float r6 = r3.g(r6, r0)
            float r6 = r6 - r5
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 >= 0) goto L25
            android.view.animation.Interpolator r5 = r3.g
            float r6 = -r6
            float r5 = r5.getInterpolation(r6)
            float r5 = -r5
            goto L2f
        L25:
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 <= 0) goto L38
            android.view.animation.Interpolator r5 = r3.g
            float r5 = r5.getInterpolation(r6)
        L2f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = a(r5, r6, r0)
            goto L39
        L38:
            r5 = r2
        L39:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3e
            return r2
        L3e:
            float[] r0 = r3.l
            r0 = r0[r4]
            float[] r1 = r3.m
            r1 = r1[r4]
            float[] r2 = r3.n
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L53
            float r5 = r5 * r0
            float r4 = a(r5, r1, r4)
            return r4
        L53:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = a(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kys.f(int, float, float, float):float");
    }

    private final float g(float f2, float f3) {
        if (f3 != 0.0f && f2 < f3) {
            if (f2 >= 0.0f) {
                return 1.0f - (f2 / f3);
            }
            if (this.e) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    private final void h() {
        int i = 0;
        if (this.c) {
            this.e = false;
            return;
        }
        kyq kyqVar = this.a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - kyqVar.e);
        int i3 = kyqVar.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        kyqVar.i = i;
        kyqVar.h = kyqVar.a(currentAnimationTimeMillis);
        kyqVar.g = currentAnimationTimeMillis;
    }

    public abstract boolean b(int i);

    final boolean c() {
        kyq kyqVar = this.a;
        float f2 = kyqVar.d;
        float abs = f2 / Math.abs(f2);
        Math.abs(kyqVar.c);
        int i = (int) abs;
        return i != 0 && b(i);
    }

    public abstract void d(int i);

    public final void e(boolean z) {
        if (this.p && !z) {
            h();
        }
        this.p = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0014, code lost:
    
        if (r0 != 3) goto L29;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.p
            r1 = 0
            if (r0 != 0) goto L7
            goto L80
        L7:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r6 = 3
            if (r0 == r6) goto L17
            goto L80
        L17:
            r5.h()
            goto L80
        L1b:
            r5.d = r2
            r5.o = r1
        L1f:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.b
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.f(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.b
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.f(r2, r7, r6, r3)
            kyq r7 = r5.a
            r7.c = r0
            r7.d = r6
            boolean r6 = r5.e
            if (r6 != 0) goto L80
            boolean r6 = r5.c()
            if (r6 == 0) goto L80
            java.lang.Runnable r6 = r5.h
            if (r6 != 0) goto L62
            kyr r6 = new kyr
            r6.<init>(r5)
            r5.h = r6
        L62:
            r5.e = r2
            r5.c = r2
            boolean r6 = r5.o
            if (r6 != 0) goto L79
            int r6 = r5.k
            if (r6 <= 0) goto L79
            android.view.View r7 = r5.b
            java.lang.Runnable r0 = r5.h
            int[] r3 = defpackage.kvo.a
            long r3 = (long) r6
            r7.postOnAnimationDelayed(r0, r3)
            goto L7e
        L79:
            java.lang.Runnable r6 = r5.h
            r6.run()
        L7e:
            r5.o = r2
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kys.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
