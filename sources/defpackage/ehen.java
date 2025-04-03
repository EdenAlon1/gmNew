package defpackage;

import android.graphics.Canvas;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Calendar;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehen extends vt {
    final /* synthetic */ ehes a;
    private final Calendar b = ehfo.e();
    private final Calendar c = ehfo.e();

    public ehen(ehes ehesVar) {
        this.a = ehesVar;
    }

    @Override // defpackage.vt
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        vk vkVar = recyclerView.n;
        if (vkVar instanceof ehfr) {
            vx vxVar = recyclerView.o;
            if (vxVar instanceof GridLayoutManager) {
                ehfr ehfrVar = (ehfr) vkVar;
                GridLayoutManager gridLayoutManager = (GridLayoutManager) vxVar;
                for (ksr ksrVar : this.a.a.b()) {
                    Object obj = ksrVar.a;
                    if (obj != null && ksrVar.b != null) {
                        this.b.setTimeInMillis(((Long) obj).longValue());
                        this.c.setTimeInMillis(((Long) ksrVar.b).longValue());
                        int m = ehfrVar.m(this.b.get(1));
                        int m2 = ehfrVar.m(this.c.get(1));
                        View U = gridLayoutManager.U(m);
                        View U2 = gridLayoutManager.U(m2);
                        int i = gridLayoutManager.b;
                        int i2 = m / i;
                        int i3 = m2 / i;
                        int i4 = i2;
                        while (i4 <= i3) {
                            View U3 = gridLayoutManager.U(gridLayoutManager.b * i4);
                            if (U3 != null) {
                                int top = U3.getTop() + this.a.d.d.b();
                                int bottom = U3.getBottom() - this.a.d.d.a();
                                int i5 = 0;
                                if (i4 == i2 && U != null) {
                                    i5 = U.getLeft() + (U.getWidth() / 2);
                                }
                                canvas.drawRect(i5, top, (i4 != i3 || U2 == null) ? recyclerView.getWidth() : U2.getLeft() + (U2.getWidth() / 2), bottom, this.a.d.h);
                            }
                            i4++;
                        }
                    }
                }
            }
        }
    }
}
