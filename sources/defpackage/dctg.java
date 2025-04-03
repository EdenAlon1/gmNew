package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerAddMoreButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dctg implements ellh {
    final /* synthetic */ dcte a;

    public dctg(dcte dcteVar) {
        this.a = dcteVar;
    }

    @Override // defpackage.ellh
    public final /* synthetic */ elli a(ellf ellfVar) {
        MediaViewerAddMoreButtonEvent mediaViewerAddMoreButtonEvent = (MediaViewerAddMoreButtonEvent) ellfVar;
        dcte dcteVar = this.a;
        String a = dcteVar.f ? emxe.a((String) mediaViewerAddMoreButtonEvent.b.orElse(null)) : null;
        if (mediaViewerAddMoreButtonEvent.a.isPresent()) {
            dcteVar.a.setResult(-1, dcteVar.a(((dcux) mediaViewerAddMoreButtonEvent.a.get()).a, ((dcux) mediaViewerAddMoreButtonEvent.a.get()).c, true, false, a));
        } else {
            MediaViewerItem mediaViewerItem = dcteVar.d.H().N;
            dcteVar.a.setResult(-1, dcteVar.a(mediaViewerItem.b(), mediaViewerItem.h(), false, false, a));
        }
        dcteVar.a.finish();
        return elli.a;
    }
}
