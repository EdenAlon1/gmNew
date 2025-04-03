package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import com.google.android.apps.messaging.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehci extends vt {
    public List a;
    private final Paint b;

    public ehci() {
        Paint paint = new Paint();
        this.b = paint;
        this.a = DesugarCollections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.vt
    public final void k(Canvas canvas, RecyclerView recyclerView) {
        this.b.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (ehcq ehcqVar : this.a) {
            this.b.setColor(kps.e(-65281, -16776961, ehcqVar.c));
            if (((CarouselLayoutManager) recyclerView.o).g()) {
                canvas.drawLine(ehcqVar.b, ((CarouselLayoutManager) recyclerView.o).w(), ehcqVar.b, ((CarouselLayoutManager) recyclerView.o).l(), this.b);
            } else {
                canvas.drawLine(((CarouselLayoutManager) recyclerView.o).r(), ehcqVar.b, ((CarouselLayoutManager) recyclerView.o).s(), ehcqVar.b, this.b);
            }
        }
    }
}
