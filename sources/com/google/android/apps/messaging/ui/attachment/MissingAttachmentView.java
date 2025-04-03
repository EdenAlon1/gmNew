package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import defpackage.bcse;
import defpackage.crii;
import defpackage.cxmf;
import defpackage.cxnw;
import defpackage.cxqh;
import defpackage.emyw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MissingAttachmentView extends cxnw implements crii {
    private MessagePartCoreData a;
    private GradientDrawable b;
    private ImageView c;

    public MissingAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.layout.missing_attachment_view);
        inflate(context, R.layout.missing_attachment_view, this);
    }

    @Override // defpackage.crii
    public final void c() {
        this.a = null;
    }

    @Override // defpackage.crid
    public final void d(boolean z, bcse bcseVar, Drawable drawable, float[] fArr) {
        setSelected(z);
        ImageView imageView = this.c;
        if (imageView != null) {
            LayerDrawable layerDrawable = (LayerDrawable) imageView.getDrawable();
            emyw.e(layerDrawable);
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.file_missing_icon_layer);
            if (findDrawableByLayerId != null) {
                findDrawableByLayerId.setTint(getContext().getColor(R.color.missing_file_icon_color));
            }
        }
        cxmf.b(this, this.a);
        if (this.b == null) {
            this.b = cxqh.o(getContext());
        }
        this.b.setColor(cxqh.c(getContext(), isSelected()));
        this.b.setCornerRadii(fArr);
        setBackground(this.b);
        cxmf.a(this, fArr);
    }

    @Override // defpackage.crii
    public final void g(MessagePartCoreData messagePartCoreData, boolean z, String str, int i) {
        this.a = messagePartCoreData;
        setContentDescription(getContext().getString(R.string.missing_file_or_media_description));
        cxmf.b(this, this.a);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (ImageView) findViewById(R.id.file_missing_icon_imageview);
    }
}
