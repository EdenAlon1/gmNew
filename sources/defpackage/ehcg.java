package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehcg extends ug {
    final /* synthetic */ CarouselLayoutManager f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehcg(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.f = carouselLayoutManager;
    }

    @Override // defpackage.ug
    public final int b(View view, int i) {
        CarouselLayoutManager carouselLayoutManager = this.f;
        if (carouselLayoutManager.d == null || !carouselLayoutManager.g()) {
            return 0;
        }
        return this.f.i(CarouselLayoutManager.bv(view));
    }

    @Override // defpackage.ug
    public final int c(View view, int i) {
        CarouselLayoutManager carouselLayoutManager = this.f;
        if (carouselLayoutManager.d == null || carouselLayoutManager.g()) {
            return 0;
        }
        return this.f.i(CarouselLayoutManager.bv(view));
    }

    @Override // defpackage.wn
    public final PointF m(int i) {
        return this.f.Q(i);
    }
}
