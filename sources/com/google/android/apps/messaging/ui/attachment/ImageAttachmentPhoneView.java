package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;
import defpackage.criq;
import defpackage.csix;
import defpackage.ctap;
import defpackage.cxny;
import defpackage.cxoa;
import defpackage.koa;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ImageAttachmentPhoneView extends criq {
    private cxny j;

    public ImageAttachmentPhoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflate(context, R.layout.image_attachment_view, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cxoa.a);
        this.a = (RoundedImageView) findViewById(R.id.image_attachment_rounded_view);
        this.b = obtainStyledAttributes.getBoolean(0, false);
        this.e = obtainStyledAttributes.getBoolean(2, false);
        this.c = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        ColorStateList d = koa.d(getContext(), R.color.message_image_selected_tint_selector);
        d.getClass();
        this.d = d.getDefaultColor();
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.criq
    protected final void h(RoundedImageView roundedImageView, MessagePartCoreData messagePartCoreData) {
        int c = messagePartCoreData.c();
        int b = messagePartCoreData.b();
        if (c <= 0 || b <= 0) {
            boolean bo = messagePartCoreData.bo();
            csix.k(bo);
            if (bo) {
                cxny cxnyVar = this.j;
                if (cxnyVar != null) {
                    cxnyVar.cancel(true);
                }
                cxny cxnyVar2 = new cxny(this, messagePartCoreData);
                this.j = cxnyVar2;
                cxnyVar2.e(new Void[0]);
                return;
            }
            return;
        }
        Resources resources = getResources();
        int q = roundedImageView.q();
        if (q == -1 || q == Integer.MAX_VALUE) {
            q = resources.getDimensionPixelSize(R.dimen.image_attachment_fallback_width);
        }
        int p = roundedImageView.p();
        if (p == -1 || p == Integer.MAX_VALUE) {
            p = resources.getDimensionPixelSize(R.dimen.image_attachment_fallback_height);
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.conversation_message_photo_min_height);
        Point point = new Point(c, b);
        ctap.l(point, q, p, dimensionPixelSize);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = point.x;
        layoutParams.height = point.y;
    }

    @Override // defpackage.criq, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cxny cxnyVar = this.j;
        if (cxnyVar != null) {
            cxnyVar.cancel(true);
            this.j = null;
        }
    }
}
