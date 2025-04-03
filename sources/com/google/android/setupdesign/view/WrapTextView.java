package com.google.android.setupdesign.view;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class WrapTextView extends AppCompatTextView {
    public WrapTextView(Context context) {
        super(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            super.onMeasure(r7, r8)
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r1) goto L40
            android.text.Layout r0 = r6.getLayout()
            int r2 = r0.getLineCount()
            r3 = 1
            if (r2 <= r3) goto L40
            r3 = 0
            r4 = 0
        L18:
            if (r3 >= r2) goto L25
            float r5 = r0.getLineWidth(r3)
            float r4 = java.lang.Math.max(r4, r5)
            int r3 = r3 + 1
            goto L18
        L25:
            double r2 = (double) r4
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            int r2 = r6.getTotalPaddingLeft()
            int r0 = r0 + r2
            int r2 = r6.getTotalPaddingRight()
            int r0 = r0 + r2
            int r2 = r6.getMeasuredWidth()
            if (r0 >= r2) goto L40
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            goto L41
        L40:
            r0 = r7
        L41:
            if (r0 == r7) goto L46
            super.onMeasure(r0, r8)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.setupdesign.view.WrapTextView.onMeasure(int, int):void");
    }

    public WrapTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WrapTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
