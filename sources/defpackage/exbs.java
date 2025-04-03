package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class exbs extends ListView {
    private final exbu a;

    public exbs(exbu exbuVar) {
        super(exbuVar.a);
        this.a = exbuVar;
        setScrollBarDefaultDelayBeforeFade(ViewConfiguration.getScrollDefaultDelay() * 3);
        setScrollIndicators(3);
    }

    @Override // android.view.View
    protected final boolean awakenScrollBars() {
        return super.awakenScrollBars();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a.r()) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.a.H.getHeight() - this.a.G.getHeight(), 1073741824));
    }
}
