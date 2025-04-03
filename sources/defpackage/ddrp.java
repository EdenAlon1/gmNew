package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddrp extends vt {
    private final float a;
    private final float b;
    private final int c;
    private final ddro d;
    private final RectF e = new RectF();
    private final float[] f = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    private final Paint g;

    public ddrp(int i, float f, float f2, int i2, ddro ddroVar) {
        Paint paint = new Paint(1);
        this.g = paint;
        this.a = f;
        this.b = f2;
        this.c = i2;
        this.d = ddroVar;
        paint.setColor(i);
    }

    private final boolean c(View view, RecyclerView recyclerView) {
        return this.d.a(recyclerView.k(view));
    }

    @Override // defpackage.vt
    public final void a(Rect rect, View view, RecyclerView recyclerView, wo woVar) {
        if (c(view, recyclerView)) {
            rect.set(0, 0, 0, this.c);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    @Override // defpackage.vt
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        boolean z;
        int i;
        canvas.save();
        vk vkVar = recyclerView.n;
        int a = vkVar != null ? vkVar.a() : 0;
        int childCount = recyclerView.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = recyclerView.getChildAt(i2);
            if (c(childAt, recyclerView)) {
                this.e.left = childAt.getLeft();
                this.e.top = childAt.getTop();
                this.e.right = childAt.getRight();
                this.e.bottom = childAt.getBottom();
                if (i2 != 0) {
                    z = false;
                } else if (recyclerView.gp(childAt) == 0) {
                    i2 = 0;
                    z = true;
                } else {
                    i2 = 0;
                    z = false;
                }
                boolean z2 = i2 == childCount + (-1) && recyclerView.gp(childAt) == a + (-1);
                int i3 = 0;
                while (true) {
                    if (i3 >= 4) {
                        break;
                    }
                    this.f[i3] = z ? this.a : this.b;
                    i3++;
                }
                for (i = 4; i < 8; i++) {
                    this.f[i] = z2 ? this.a : this.b;
                }
                Path path = new Path();
                path.addRoundRect(this.e, this.f, Path.Direction.CW);
                canvas.drawPath(path, this.g);
            }
            i2++;
        }
        canvas.restore();
    }
}
