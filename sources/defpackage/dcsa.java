package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcsa extends vt {
    @Override // defpackage.vt
    public final void a(Rect rect, View view, RecyclerView recyclerView, wo woVar) {
        super.a(rect, view, recyclerView, woVar);
        vk vkVar = recyclerView.n;
        dcry dcryVar = vkVar instanceof dcry ? (dcry) vkVar : null;
        if (dcryVar == null) {
            return;
        }
        int gp = recyclerView.gp(view);
        if (gp == 0 || gp == dcryVar.a() - 1) {
            vy vyVar = (vy) view.getLayoutParams();
            int m = dcryVar.m(view);
            CarouselRecyclerView carouselRecyclerView = (CarouselRecyclerView) recyclerView;
            int i = carouselRecyclerView.af;
            if (i == 0) {
                i = carouselRecyclerView.getWidth();
                carouselRecyclerView.af = i;
            }
            int layoutDirection = carouselRecyclerView.getLayoutDirection();
            if (gp != 0) {
                if (gp == dcryVar.a() - 1) {
                    int marginEnd = (i / 2) - ((m / 2) + vyVar.getMarginEnd());
                    if (layoutDirection == 1) {
                        rect.left = marginEnd;
                        return;
                    } else {
                        rect.right = marginEnd;
                        return;
                    }
                }
                return;
            }
            int marginStart = (i / 2) - ((m / 2) + vyVar.getMarginStart());
            if (layoutDirection == 1) {
                rect.right = marginStart;
            } else {
                rect.left = marginStart;
            }
            if (carouselRecyclerView.ac) {
                return;
            }
            carouselRecyclerView.ac = true;
            vk vkVar2 = carouselRecyclerView.n;
            if (vkVar2 instanceof dcry) {
            }
        }
    }
}
