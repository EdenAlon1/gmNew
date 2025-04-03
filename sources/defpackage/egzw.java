package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class egzw extends egzy {
    public final Rect a;
    final Rect b;
    public int c;
    public int d;

    public egzw() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    @Override // defpackage.egzy
    protected final void fK(CoordinatorLayout coordinatorLayout, View view, int i) {
        View v = v(coordinatorLayout.a(view));
        if (v == null) {
            coordinatorLayout.j(view, i);
            this.c = 0;
            return;
        }
        kkw kkwVar = (kkw) view.getLayoutParams();
        Rect rect = this.a;
        rect.set(coordinatorLayout.getPaddingLeft() + kkwVar.leftMargin, v.getBottom() + kkwVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - kkwVar.rightMargin, ((coordinatorLayout.getHeight() + v.getBottom()) - coordinatorLayout.getPaddingBottom()) - kkwVar.bottomMargin);
        kxh kxhVar = coordinatorLayout.f;
        if (kxhVar != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += kxhVar.b();
            rect.right -= kxhVar.c();
        }
        Rect rect2 = this.b;
        int i2 = kkwVar.c;
        if (i2 == 0) {
            i2 = 8388659;
        }
        Gravity.apply(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int x = x(v);
        view.layout(rect2.left, rect2.top - x, rect2.right, rect2.bottom - x);
        this.c = rect2.top - v.getBottom();
    }

    public float t(View view) {
        throw null;
    }

    public int u(View view) {
        throw null;
    }

    public abstract View v(List list);

    public final int x(View view) {
        if (this.d == 0) {
            return 0;
        }
        float t = t(view);
        int i = this.d;
        return kqp.b((int) (t * i), 0, i);
    }

    public boolean z() {
        return false;
    }

    public egzw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
}
