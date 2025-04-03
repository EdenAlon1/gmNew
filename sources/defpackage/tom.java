package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.cloudstore.media.CmsBrokenMediaAttachmentView;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tom implements crii {
    private final CmsBrokenMediaAttachmentView a;
    private GradientDrawable b;
    private final ImageView c;

    public tom(CmsBrokenMediaAttachmentView cmsBrokenMediaAttachmentView) {
        this.a = cmsBrokenMediaAttachmentView;
        View.inflate(cmsBrokenMediaAttachmentView.getContext(), R.layout.cms_broken_media_attachment_view, cmsBrokenMediaAttachmentView);
        this.c = (ImageView) cmsBrokenMediaAttachmentView.findViewById(R.id.cms_broken_media_icon_imageview);
    }

    @Override // defpackage.crid
    public final void d(boolean z, bcse bcseVar, Drawable drawable, float[] fArr) {
        this.a.setSelected(z);
        Drawable drawable2 = this.c.getDrawable();
        drawable2.getClass();
        Drawable findDrawableByLayerId = ((LayerDrawable) drawable2).findDrawableByLayerId(R.id.cms_broken_media_icon_layer);
        if (findDrawableByLayerId != null) {
            findDrawableByLayerId.setTint(this.a.getContext().getColor(R.color.google_white));
        }
        if (this.b == null) {
            this.b = cxqh.o(this.a.getContext());
        }
        GradientDrawable gradientDrawable = this.b;
        if (gradientDrawable != null) {
            CmsBrokenMediaAttachmentView cmsBrokenMediaAttachmentView = this.a;
            gradientDrawable.setColor(cxqh.c(cmsBrokenMediaAttachmentView.getContext(), cmsBrokenMediaAttachmentView.isSelected()));
        }
        GradientDrawable gradientDrawable2 = this.b;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setCornerRadii(fArr);
        }
        this.a.setBackground(this.b);
    }

    @Override // defpackage.crii
    public final void c() {
    }

    @Override // defpackage.crii
    public final void g(MessagePartCoreData messagePartCoreData, boolean z, String str, int i) {
    }
}
