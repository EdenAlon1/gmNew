package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.csix;
import defpackage.czou;
import defpackage.czpl;
import defpackage.czpm;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RichCardMediaDownloadOverlayView extends czou {
    public czpm a;
    protected final ImageView b;
    private final ProgressBar c;
    private final TextView d;
    private final LinearLayout e;
    private final Drawable f;
    private final Drawable g;

    public RichCardMediaDownloadOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable = getResources().getDrawable(R.drawable.rich_card_download_progress_background);
        this.f = drawable;
        this.g = getResources().getDrawable(R.drawable.rich_card_download_progress_retry_background);
        inflate(context, R.layout.rich_card_media_download_overlay_view, this);
        this.b = (ImageView) findViewById(R.id.rich_card_media_download_status_icon);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.rich_card_media_download_progress_bar);
        this.c = progressBar;
        this.d = (TextView) findViewById(R.id.rich_card_media_size);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.media_download_container);
        this.e = linearLayout;
        linearLayout.setBackground(drawable);
        progressBar.setMax(100);
        setOnClickListener(new czpl(this));
    }

    private final void e() {
        if (this.e.getPaddingStart() == 0 && this.e.getPaddingEnd() == 0) {
            return;
        }
        LinearLayout linearLayout = this.e;
        linearLayout.setPaddingRelative(0, linearLayout.getPaddingTop(), 0, linearLayout.getPaddingBottom());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 != 4) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cb, code lost:
    
        if (r4 != 4) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaDownloadOverlayView.c():void");
    }

    public final int d() {
        czpm czpmVar = this.a;
        if (czpmVar != null) {
            return czpmVar.s();
        }
        csix.c("A download status was requested but the RichCardMediaTransferHost has not been set for this view.");
        return 5;
    }
}
