package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.video.VideoOverlayView;
import defpackage.crnx;
import defpackage.dcgh;
import defpackage.dche;
import defpackage.dchg;
import defpackage.dchh;
import defpackage.dcia;
import defpackage.ekms;
import defpackage.elay;
import defpackage.elbx;
import defpackage.enru;
import defpackage.le;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GalleryContentItemView extends dcgh implements dcia {
    public dche a;
    public boolean b;
    public elbx c;
    private ImageView o;
    private VideoOverlayView p;

    public GalleryContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = true;
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView, defpackage.dcal
    public final int a() {
        return 1;
    }

    @Override // defpackage.dcia
    public final void i(dche dcheVar) {
        this.a = dcheVar;
    }

    @Override // defpackage.dcia
    public final void j(ekms ekmsVar) {
        dche dcheVar;
        if (this.o == null || this.p == null || (dcheVar = this.a) == null) {
            return;
        }
        if (dcheVar instanceof dchg) {
            ekmsVar.i(((dchg) dcheVar).d).v(this.o);
            Context context = getContext();
            dchg dchgVar = (dchg) this.a;
            long j = dchgVar.b;
            String str = dchgVar.a;
            enru enruVar = crnx.a;
            int i = le.n(str) ? j > 0 ? R.string.mediapicker_gallery_image_item_description : R.string.mediapicker_gallery_image_item_description_no_date : le.A(str) ? j > 0 ? R.string.mediapicker_gallery_video_item_description : R.string.mediapicker_gallery_video_item_description_no_date : le.f(str) ? j > 0 ? R.string.mediapicker_gallery_audio_item_description : R.string.mediapicker_gallery_audio_item_description_no_date : -1;
            String string = i > 0 ? context.getResources().getString(i, Long.valueOf(j * TimeUnit.SECONDS.toMillis(1L))) : null;
            if (!TextUtils.isEmpty(string)) {
                this.o.setContentDescription(string);
            }
        }
        dche dcheVar2 = this.a;
        if (!(dcheVar2 instanceof dchh)) {
            this.p.setVisibility(8);
        } else {
            this.p.e(((dchh) dcheVar2).g);
            this.p.setVisibility(0);
        }
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView, android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.o = (ImageView) findViewById(R.id.gallery_content_async_image);
        this.p = (VideoOverlayView) findViewById(R.id.gallery_content_video_overlay);
        setOnClickListener(new elay(this.c, "GalleryContentItemView::onClick", this.n));
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (true != this.b) {
            i = i2;
        }
        super.onMeasure(i, i);
    }
}
