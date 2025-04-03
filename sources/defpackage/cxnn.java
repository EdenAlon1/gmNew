package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxnn implements fbba {
    public static AttachmentsContainer a(View view) {
        if (!(view instanceof AttachmentsContainer)) {
            throw new IllegalStateException(a.I(view, cxnk.class, "Attempt to inject a View wrapper of type "));
        }
        AttachmentsContainer attachmentsContainer = (AttachmentsContainer) view;
        attachmentsContainer.getClass();
        return attachmentsContainer;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
