package defpackage;

import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dctf implements ellh {
    final /* synthetic */ dcte a;

    public dctf(dcte dcteVar) {
        this.a = dcteVar;
    }

    @Override // defpackage.ellh
    public final /* synthetic */ elli a(ellf ellfVar) {
        MediaViewerPrimaryButtonEvent mediaViewerPrimaryButtonEvent = (MediaViewerPrimaryButtonEvent) ellfVar;
        dcte dcteVar = this.a;
        String a = dcteVar.f ? emxe.a((String) mediaViewerPrimaryButtonEvent.b.orElse(null)) : null;
        if (mediaViewerPrimaryButtonEvent.a.isPresent()) {
            dcteVar.a.setResult(-1, dcteVar.a(((dcux) mediaViewerPrimaryButtonEvent.a.get()).a, ((dcux) mediaViewerPrimaryButtonEvent.a.get()).c, true, dcteVar.f && dcteVar.g, a));
        } else {
            MediaViewerItem mediaViewerItem = dcteVar.d.H().N;
            dcteVar.a.setResult(-1, dcteVar.a(mediaViewerItem.b(), mediaViewerItem.h(), false, dcteVar.f && dcteVar.g, a));
        }
        dcteVar.a.finish();
        return elli.a;
    }
}
