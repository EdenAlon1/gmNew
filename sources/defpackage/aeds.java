package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeds extends vt {
    private final int a;
    private final RectF b = new RectF();
    private final float[] c;

    public aeds(int i, float f) {
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.c = fArr;
        this.a = i;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f;
        fArr[3] = f;
    }

    @Override // defpackage.vt
    public final void k(Canvas canvas, RecyclerView recyclerView) {
        canvas.save();
        this.b.left = 0.0f;
        this.b.top = 0.0f;
        this.b.right = recyclerView.getWidth();
        this.b.bottom = recyclerView.getHeight();
        Path path = new Path();
        path.addRoundRect(this.b, this.c, Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
        canvas.drawColor(this.a);
        canvas.restore();
    }
}
