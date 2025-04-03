package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerCloseButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerOpenInChatButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerSaveButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerShareButtonEvent;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddnz implements ddny {
    private final altk a;

    public ddnz(altk altkVar) {
        this.a = altkVar;
    }

    @Override // defpackage.ddny
    public final void a(eg egVar, int i) {
        fr a = egVar.a();
        if (i == 5) {
            if (a.h("LocationBottomSheetDialogFragment") == null) {
                new ddso().t(a, "LocationBottomSheetDialogFragment");
            }
        } else {
            if (i != 4) {
                throw new UnsupportedOperationException(a.h(i, "Unknown result type "));
            }
            if (a.h("LinkBottomSheetDialogFragment") == null) {
                new ddry().t(a, "LinkBottomSheetDialogFragment");
            }
        }
    }

    @Override // defpackage.ddny
    public final void b(eg egVar, ConversationIdType conversationIdType, String str, boolean z, int i, String str2) {
        if (egVar.a().h("SearchDetails") == null) {
            dcuf dcufVar = new dcuf();
            dcufVar.a = conversationIdType;
            dcufVar.b = str;
            dcufVar.c = z;
            dcufVar.d = i;
            dcufVar.g = str2;
            dctk e = MediaViewerButton.e();
            e.e(R.string.action_jump_to_chat);
            e.b(R.string.action_jump_to_chat);
            e.c(new MediaViewerOpenInChatButtonEvent());
            dcufVar.h = e.a();
            dctk e2 = MediaViewerButton.e();
            e2.b(R.string.media_viewer_save_media_description);
            e2.d(R.drawable.quantum_ic_save_alt_white_24);
            e2.c(new MediaViewerSaveButtonEvent());
            MediaViewerButton a = e2.a();
            dctk e3 = MediaViewerButton.e();
            e3.b(R.string.media_viewer_share_media_description);
            e3.d(R.drawable.quantum_gm_ic_share_white_24);
            e3.c(new MediaViewerShareButtonEvent());
            dcufVar.i = new ArrayList(engw.s(a, e3.a()));
            dctk e4 = MediaViewerButton.e();
            e4.b(R.string.discard);
            e4.c(new MediaViewerCloseButtonEvent());
            dcufVar.j = e4.a();
            dcufVar.b(4);
            dcufVar.l = 3;
            dctl a2 = dcufVar.a();
            cg cgVar = new cg(egVar.a());
            cgVar.x(R.id.zero_state_fragment_container, a2, "SearchDetails");
            cgVar.v(null);
            cgVar.j();
            egVar.a().an();
            this.a.T(5);
        }
    }
}
