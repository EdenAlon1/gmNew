package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqv implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1 || !jqj.c(layout, lineForOffset)) {
            return;
        }
        float a = jqx.a(layout, lineForOffset, paint) + jqx.b(layout, lineForOffset, paint);
        if (a == 0.0f) {
            return;
        }
        canvas.getClass();
        canvas.translate(a, 0.0f);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
