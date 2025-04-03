package defpackage;

import android.content.Context;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exbd extends LinearLayout {
    final /* synthetic */ exbu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exbd(exbu exbuVar, Context context) {
        super(context);
        this.a = exbuVar;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a.r();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        Size size;
        if (this.a.r() && (size = this.a.I) != null) {
            i = View.MeasureSpec.makeMeasureSpec(size.getWidth(), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
