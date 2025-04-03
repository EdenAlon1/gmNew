package defpackage;

import android.view.View;
import com.google.android.apps.messaging.cloudstore.media.CmsMediaAttachmentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tou implements fbba {
    public static CmsMediaAttachmentView a(View view) {
        if (!(view instanceof CmsMediaAttachmentView)) {
            throw new IllegalStateException(a.I(view, tor.class, "Attempt to inject a View wrapper of type "));
        }
        CmsMediaAttachmentView cmsMediaAttachmentView = (CmsMediaAttachmentView) view;
        cmsMediaAttachmentView.getClass();
        return cmsMediaAttachmentView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
