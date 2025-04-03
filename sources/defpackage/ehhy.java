package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehhy extends ViewGroup {
    public int c;
    public int d;
    public boolean e;
    public int f;

    public ehhy(Context context) {
        this(context, null);
    }

    private static int a(int i, int i2, int i3) {
        return i2 != Integer.MIN_VALUE ? i2 != 1073741824 ? i3 : i : Math.min(i3, i);
    }

    private final void b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ehil.a, 0, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z2;
        int i7 = 0;
        if (getChildCount() == 0) {
            this.f = 0;
            return;
        }
        boolean z3 = true;
        this.f = 1;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z4 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i8 = i3 - i;
        int i9 = 0;
        int i10 = paddingRight;
        int i11 = paddingTop;
        while (i9 < getChildCount()) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
                z2 = z3;
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.getMarginStart();
                    i5 = marginLayoutParams.getMarginEnd();
                } else {
                    i5 = i7;
                    i6 = i5;
                }
                z2 = z3;
                int i12 = i8 - paddingLeft;
                int measuredWidth = i10 + i6 + childAt.getMeasuredWidth();
                if (!this.e && measuredWidth > i12) {
                    i11 = paddingTop + this.c;
                    this.f++;
                    i10 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f - 1));
                int i13 = i10 + i6;
                int measuredWidth2 = childAt.getMeasuredWidth() + i13;
                int measuredHeight = childAt.getMeasuredHeight() + i11;
                if (z4) {
                    childAt.layout(i12 - measuredWidth2, i11, (i12 - i10) - i6, measuredHeight);
                } else {
                    childAt.layout(i13, i11, measuredWidth2, measuredHeight);
                }
                i10 += i6 + i5 + childAt.getMeasuredWidth() + this.d;
                paddingTop = measuredHeight;
            }
            i9++;
            z3 = z2;
            i7 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r20, int r21) {
        /*
            r19 = this;
            r0 = r19
            int r1 = android.view.View.MeasureSpec.getSize(r20)
            int r2 = android.view.View.MeasureSpec.getMode(r20)
            int r3 = android.view.View.MeasureSpec.getSize(r21)
            int r4 = android.view.View.MeasureSpec.getMode(r21)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r5) goto L20
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 != r5) goto L1c
            r2 = r5
            goto L20
        L1c:
            r5 = 2147483647(0x7fffffff, float:NaN)
            goto L21
        L20:
            r5 = r1
        L21:
            int r6 = r0.getPaddingLeft()
            int r7 = r0.getPaddingTop()
            int r8 = r0.getPaddingRight()
            int r5 = r5 - r8
            r9 = r7
            r10 = 0
            r11 = 0
        L31:
            int r12 = r0.getChildCount()
            if (r10 >= r12) goto La5
            android.view.View r12 = r0.getChildAt(r10)
            int r13 = r12.getVisibility()
            r14 = 8
            if (r13 == r14) goto L9c
            r13 = r20
            r14 = r21
            r0.measureChild(r12, r13, r14)
            android.view.ViewGroup$LayoutParams r15 = r12.getLayoutParams()
            boolean r8 = r15 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r8 == 0) goto L59
            android.view.ViewGroup$MarginLayoutParams r15 = (android.view.ViewGroup.MarginLayoutParams) r15
            int r8 = r15.leftMargin
            int r15 = r15.rightMargin
            goto L5b
        L59:
            r8 = 0
            r15 = 0
        L5b:
            int r16 = r6 + r8
            int r17 = r12.getMeasuredWidth()
            r18 = r6
            int r6 = r16 + r17
            if (r6 <= r5) goto L73
            boolean r6 = r0.e
            if (r6 != 0) goto L73
            int r6 = r0.getPaddingLeft()
            int r9 = r0.c
            int r9 = r9 + r7
            goto L75
        L73:
            r6 = r18
        L75:
            int r7 = r6 + r8
            int r16 = r12.getMeasuredWidth()
            int r7 = r7 + r16
            int r16 = r12.getMeasuredHeight()
            int r16 = r9 + r16
            if (r7 <= r11) goto L86
            r11 = r7
        L86:
            int r8 = r8 + r15
            int r7 = r12.getMeasuredWidth()
            int r8 = r8 + r7
            int r7 = r0.d
            int r8 = r8 + r7
            int r7 = r0.getChildCount()
            int r7 = r7 + (-1)
            int r6 = r6 + r8
            if (r10 != r7) goto L99
            int r11 = r11 + r15
        L99:
            r7 = r16
            goto La2
        L9c:
            r13 = r20
            r14 = r21
            r18 = r6
        La2:
            int r10 = r10 + 1
            goto L31
        La5:
            int r5 = r0.getPaddingRight()
            int r11 = r11 + r5
            int r5 = r0.getPaddingBottom()
            int r7 = r7 + r5
            int r1 = a(r1, r2, r11)
            int r2 = a(r3, r4, r7)
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehhy.onMeasure(int, int):void");
    }

    public ehhy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ehhy(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = false;
        b(context, attributeSet);
    }

    public ehhy(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.e = false;
        b(context, attributeSet);
    }
}
