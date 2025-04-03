package defpackage;

import android.view.View;
import com.google.android.apps.messaging.cloudstore.media.CmsBrokenMediaAttachmentView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class top implements fbba {
    public static CmsBrokenMediaAttachmentView a(View view) {
        if (!(view instanceof CmsBrokenMediaAttachmentView)) {
            throw new IllegalStateException(a.I(view, tom.class, "Attempt to inject a View wrapper of type "));
        }
        CmsBrokenMediaAttachmentView cmsBrokenMediaAttachmentView = (CmsBrokenMediaAttachmentView) view;
        cmsBrokenMediaAttachmentView.getClass();
        return cmsBrokenMediaAttachmentView;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
