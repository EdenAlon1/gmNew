package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardMediaDownloadOverlayView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czpl implements View.OnClickListener {
    final /* synthetic */ RichCardMediaDownloadOverlayView a;

    public czpl(RichCardMediaDownloadOverlayView richCardMediaDownloadOverlayView) {
        this.a = richCardMediaDownloadOverlayView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RichCardMediaDownloadOverlayView richCardMediaDownloadOverlayView = this.a;
        if (richCardMediaDownloadOverlayView.a == null) {
            csix.c("A click event happened, but RichCardMediaTransferHost was not set for this view.");
            return;
        }
        int d = richCardMediaDownloadOverlayView.d();
        int i = d - 1;
        if (d == 0) {
            throw null;
        }
        if (i != 1) {
            if (i == 2) {
                this.a.a.m();
                return;
            } else if (i != 3) {
                return;
            }
        }
        this.a.a.n();
    }
}
