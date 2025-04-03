package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcqw extends dcry {
    public dcqw(CarouselRecyclerView carouselRecyclerView, dcmx dcmxVar) {
        super(carouselRecyclerView, dcmxVar);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(this.a.getContext()).inflate(R.layout.mode_item_view, viewGroup, false);
        dcqz dcqzVar = new dcqz(inflate);
        inflate.addOnAttachStateChangeListener(dcqzVar);
        return dcqzVar;
    }

    @Override // defpackage.dcry, defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, final int i) {
        dcqz dcqzVar = (dcqz) wrVar;
        View view = dcqzVar.a;
        new cxpy(view, new dcrx(this, i, view), new View[0]);
        dcqzVar.a.post(new Runnable() { // from class: dcru
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        dcqx dcqxVar = (dcqx) (this.d.size() > i ? this.d.get(i) : null);
        if (dcqxVar == null) {
            dcqxVar = new dcqx(dcnb.PHOTO);
        }
        dcqzVar.t.setText(dcqxVar.a.c);
        dcqzVar.t.setContentDescription(dcqzVar.a.getResources().getString(dcqxVar.a.d));
        boolean z = i == this.e;
        dcqzVar.t.setTextColor(z ? dcqzVar.v : dcqzVar.u);
        dcqzVar.C(z ? dcqzVar.x : dcqzVar.y);
        dcqzVar.D(true != z ? 0.0f : 1.0f);
    }

    @Override // defpackage.dcry
    public final int m(View view) {
        csix.k(view instanceof TextView);
        float[] fArr = new float[1];
        TextView textView = (TextView) view;
        textView.getPaint().breakText(textView.getText().toString(), true, Float.MAX_VALUE, fArr);
        return (int) (fArr[0] + view.getPaddingStart() + view.getPaddingEnd());
    }
}
