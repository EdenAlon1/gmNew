package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcrw extends wk {
    final /* synthetic */ dcry a;

    public dcrw(dcry dcryVar) {
        this.a = dcryVar;
    }

    @Override // defpackage.wk, defpackage.wb
    public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 1 || this.a.a.getVisibility() != 0) {
            return false;
        }
        dcry dcryVar = this.a;
        CarouselRecyclerView carouselRecyclerView = dcryVar.a;
        int i = carouselRecyclerView.F;
        if (i != 0 && i != 1) {
            return false;
        }
        dcryVar.G(carouselRecyclerView.a());
        return false;
    }
}
