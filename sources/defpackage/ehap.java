package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehap extends laa {
    final /* synthetic */ SwipeDismissBehavior a;
    private int b;
    private int c = -1;

    public ehap(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.laa
    public final int a(View view) {
        return view.getWidth();
    }

    @Override // defpackage.laa
    public final void b(View view, int i) {
        this.c = i;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            this.a.b = true;
            parent.requestDisallowInterceptTouchEvent(true);
            this.a.b = false;
        }
    }

    @Override // defpackage.laa
    public final void c(int i) {
        ehqs ehqsVar = this.a.f;
        if (ehqsVar != null) {
            if (i != 0) {
                ehrf.a().e(ehqsVar.a.u);
            } else {
                ehrf.a().f(ehqsVar.a.u);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0046, code lost:
    
        if (java.lang.Math.abs(r7.getLeft() - r6.b) >= java.lang.Math.round(r7.getWidth() * 0.5f)) goto L22;
     */
    @Override // defpackage.laa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r7, float r8, float r9) {
        /*
            r6 = this;
            r9 = -1
            r6.c = r9
            r9 = 0
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            int r1 = r7.getWidth()
            r2 = 1
            if (r0 == 0) goto L2f
            int r3 = r7.getLayoutDirection()
            com.google.android.material.behavior.SwipeDismissBehavior r4 = r6.a
            int r4 = r4.c
            r5 = 2
            if (r4 != r5) goto L19
            goto L48
        L19:
            if (r4 != 0) goto L25
            if (r3 != r2) goto L22
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 < 0) goto L48
            goto L5c
        L22:
            if (r0 <= 0) goto L5c
            goto L48
        L25:
            if (r3 != r2) goto L2a
            if (r0 <= 0) goto L5c
            goto L48
        L2a:
            int r0 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r0 >= 0) goto L5c
            goto L48
        L2f:
            int r0 = r7.getLeft()
            int r3 = r6.b
            int r0 = r0 - r3
            int r3 = r7.getWidth()
            float r3 = (float) r3
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            int r3 = java.lang.Math.round(r3)
            int r0 = java.lang.Math.abs(r0)
            if (r0 < r3) goto L5c
        L48:
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 < 0) goto L57
            int r8 = r7.getLeft()
            int r9 = r6.b
            if (r8 >= r9) goto L55
            goto L57
        L55:
            int r9 = r9 + r1
            goto L5f
        L57:
            int r8 = r6.b
            int r9 = r8 - r1
            goto L5f
        L5c:
            int r9 = r6.b
            r2 = 0
        L5f:
            com.google.android.material.behavior.SwipeDismissBehavior r8 = r6.a
            lab r8 = r8.a
            int r0 = r7.getTop()
            boolean r8 = r8.h(r9, r0)
            if (r8 == 0) goto L78
            com.google.android.material.behavior.SwipeDismissBehavior r8 = r6.a
            ehar r9 = new ehar
            r9.<init>(r8, r7, r2)
            r7.postOnAnimation(r9)
            return
        L78:
            if (r2 == 0) goto L83
            com.google.android.material.behavior.SwipeDismissBehavior r8 = r6.a
            ehqs r8 = r8.f
            if (r8 == 0) goto L83
            r8.a(r7)
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehap.d(android.view.View, float, float):void");
    }

    @Override // defpackage.laa
    public final boolean e(View view, int i) {
        int i2 = this.c;
        return (i2 == -1 || i2 == i) && this.a.t(view);
    }

    @Override // defpackage.laa
    public final int f(View view, int i) {
        int width;
        int width2;
        int width3;
        int layoutDirection = view.getLayoutDirection();
        int i2 = this.a.c;
        if (i2 == 0) {
            if (layoutDirection == 1) {
                width = this.b - view.getWidth();
                width2 = this.b;
            } else {
                width = this.b;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.b - view.getWidth();
            width2 = view.getWidth() + this.b;
        } else if (layoutDirection == 1) {
            width = this.b;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.b - view.getWidth();
            width2 = this.b;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.laa
    public final int g(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.laa
    public final void i(View view, int i, int i2) {
        float width = view.getWidth() * this.a.d;
        float width2 = view.getWidth() * this.a.e;
        float abs = Math.abs(i - this.b);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.u(1.0f - ((abs - width) / (width2 - width))));
        }
    }
}
