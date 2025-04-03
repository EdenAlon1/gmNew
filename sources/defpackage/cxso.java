package defpackage;

import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxso implements View.OnLayoutChangeListener {
    final /* synthetic */ ImageView a;

    public cxso(ImageView imageView) {
        this.a = imageView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i3 - i != 0) {
            RippleDrawable rippleDrawable = (RippleDrawable) this.a.getForeground();
            if (rippleDrawable != null) {
                ImageView imageView = this.a;
                int paddingLeft = imageView.getPaddingLeft();
                int paddingTop = imageView.getPaddingTop();
                int width = imageView.getWidth() - imageView.getPaddingRight();
                ImageView imageView2 = this.a;
                rippleDrawable.setHotspotBounds(paddingLeft, paddingTop, width, imageView2.getHeight() - imageView2.getPaddingBottom());
            }
            this.a.removeOnLayoutChangeListener(this);
        }
    }
}
