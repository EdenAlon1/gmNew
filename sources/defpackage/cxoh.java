package defpackage;

import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxoh implements crjb {
    final /* synthetic */ VCardAttachmentView a;

    public cxoh(VCardAttachmentView vCardAttachmentView) {
        this.a = vCardAttachmentView;
    }

    @Override // defpackage.crjb
    public final void c(bcyw bcywVar) {
        if (bcywVar instanceof bcyd) {
            bcyd bcydVar = (bcyd) bcywVar;
            if (bcydVar.q()) {
                VCardAttachmentView vCardAttachmentView = this.a;
                vCardAttachmentView.a.c(vCardAttachmentView.getContext(), bcydVar.o());
            }
        }
    }

    @Override // defpackage.crjb
    public final void d() {
    }
}
