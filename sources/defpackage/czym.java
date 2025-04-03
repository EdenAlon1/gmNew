package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.ui.conversationlist.ForwardMessageActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czym implements czzn {
    public final ForwardMessageActivity a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public MessageCoreData e;
    public IncomingDraft f;
    public ComposeRowState g;
    private final ffbr h;
    private final ffbr i;

    public czym(ForwardMessageActivity forwardMessageActivity, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = forwardMessageActivity;
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.b = ffbrVar3;
        this.c = ffbrVar4;
        this.d = ffbrVar5;
    }

    private final void d(int i, ConversationId conversationId, Integer num, bcyl bcylVar, boolean z) {
        if (((ayfg) this.h.b()).y(this.a, i, conversationId, this.g, this.f, num, this.e, bcylVar, z)) {
            return;
        }
        ((ddzb) this.i.b()).k(R.string.attachment_load_failed_dialog_message);
        this.a.setResult(0);
        this.a.finish();
    }

    @Override // defpackage.czzn
    public final int a() {
        return R.string.forward_activity_label;
    }

    @Override // defpackage.czzn
    public final void b(bcrs bcrsVar) {
        d(0, bcrsVar.O(), null, bcrsVar.g(), bcrsVar.W());
    }

    @Override // defpackage.czzn
    public final void c() {
        d(1, InvalidConversationId.a, 2, null, false);
    }
}
