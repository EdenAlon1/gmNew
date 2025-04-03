package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kef extends iya implements kei, kud {
    public final Window a;
    public boolean b;
    public boolean c;
    public boolean d;
    private final hho e;
    private boolean f;

    public kef(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.a = window;
        this.e = new hic(keb.a, hla.a);
        int[] iArr = kvo.a;
        kvd.k(this, this);
        kwr.c(this, new kee(this));
    }

    @Override // defpackage.kei
    public final Window a() {
        return this.a;
    }

    public final void b(hfr hfrVar, ffjm ffjmVar) {
        super.i(hfrVar);
        this.e.b(ffjmVar);
        this.f = true;
        e();
    }

    @Override // defpackage.iya
    protected final boolean c() {
        return this.f;
    }

    @Override // defpackage.iya
    public final void d(hfd hfdVar) {
        hfdVar.v(1735448596);
        ((ffjm) this.e.a()).a(hfdVar, 0);
        hfdVar.o();
    }

    @Override // defpackage.kud
    public final kxh ey(View view, kxh kxhVar) {
        if (!this.c) {
            int i = 0;
            View childAt = getChildAt(0);
            int max = Math.max(0, childAt.getLeft());
            int max2 = Math.max(0, childAt.getTop());
            int max3 = Math.max(0, getWidth() - childAt.getRight());
            int max4 = Math.max(0, getHeight() - childAt.getBottom());
            if (max != 0) {
                i = max;
            } else if (max2 == 0) {
                if (max3 != 0) {
                    max2 = 0;
                } else if (max4 != 0) {
                    max2 = 0;
                    max3 = 0;
                }
            }
            return kxhVar.n(i, max2, max3, max4);
        }
        return kxhVar;
    }

    @Override // defpackage.iya
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft2 = getPaddingLeft() + (((i5 - measuredWidth) - paddingLeft) / 2);
        int paddingTop2 = getPaddingTop() + (((i6 - measuredHeight) - paddingTop) / 2);
        childAt.layout(paddingLeft2, paddingTop2, measuredWidth + paddingLeft2, measuredHeight + paddingTop2);
    }

    @Override // defpackage.iya
    public final void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.h(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int i3 = (mode != Integer.MIN_VALUE || this.b || this.c || this.a.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int i4 = size - paddingLeft;
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i3 - paddingTop;
        int i6 = i5 >= 0 ? i5 : 0;
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 != 0) {
            i = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
        }
        if (mode != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        }
        childAt.measure(i, i2);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingLeft);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingLeft;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingTop : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingTop));
        if (this.b || this.c || childAt.getMeasuredHeight() + paddingTop <= size2 || this.a.getAttributes().height != -2) {
            return;
        }
        this.a.setLayout(-1, -1);
    }
}
