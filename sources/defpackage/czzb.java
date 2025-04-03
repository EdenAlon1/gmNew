package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.ui.conversationlist.ShareIntentActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czzb implements czzn {
    public static final enru a = enru.c("com/google/android/apps/messaging/ui/conversationlist/ShareIntentActivityPeer");
    public final ShareIntentActivity b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final fazb f;
    public final ffbr g;
    public final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;

    @Deprecated
    private MessageCoreData n;
    private ComposeRowState o;

    public czzb(ShareIntentActivity shareIntentActivity, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, fazb fazbVar, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10) {
        this.b = shareIntentActivity;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.i = ffbrVar4;
        this.j = ffbrVar5;
        this.k = ffbrVar6;
        this.f = fazbVar;
        this.g = ffbrVar7;
        this.h = ffbrVar8;
        this.l = ffbrVar9;
        this.m = ffbrVar10;
    }

    @Override // defpackage.czzn
    public final int a() {
        return R.string.share_intent_activity_label;
    }

    @Override // defpackage.czzn
    public final void b(bcrs bcrsVar) {
        e(0, new BugleConversationId(bcrsVar.Q()), null, bcrsVar.g(), bcrsVar.W());
        ((enrr) ((enrr) a.h()).h("com/google/android/apps/messaging/ui/conversationlist/ShareIntentActivityPeer", "onConversationClick", 349, "ShareIntentActivityPeer.java")).q("DRAFTBUG(b/348065860): onConversationClick. Finishing.");
        this.b.finish();
    }

    @Override // defpackage.czzn
    public final void c() {
        e(1, InvalidConversationId.a, 2, null, false);
        ((enrr) ((enrr) a.h()).h("com/google/android/apps/messaging/ui/conversationlist/ShareIntentActivityPeer", "onCreateConversationClick", 361, "ShareIntentActivityPeer.java")).q("DRAFTBUG(b/348065860): onCreateConversationClick. Finishing.");
        this.b.finish();
    }

    public final void d(Intent intent) {
        ComposeRowState a2;
        enru enruVar = a;
        ((enrr) ((enrr) enruVar.h()).h("com/google/android/apps/messaging/ui/conversationlist/ShareIntentActivityPeer", "constructMessageDataForIntent", 264, "ShareIntentActivityPeer.java")).q("DRAFTBUG(b/348065860): constructMessageDataForIntent.");
        if (!((atdn) this.m.b()).a()) {
            MessageCoreData c = ((bdiw) this.i.b()).c(intent);
            this.n = c;
            this.o = null;
            if (c == null) {
                ((ddzb) this.j.b()).k(R.string.attachment_load_failed_dialog_message);
                this.b.setResult(0);
                this.b.finish();
                return;
            }
            return;
        }
        this.n = null;
        try {
            a2 = aygi.a(((bdiw) this.i.b()).b(intent, aygq.a), 0);
            this.o = a2;
            ((enrr) ((enrr) enruVar.h()).h("com/google/android/apps/messaging/ui/conversationlist/ShareIntentActivityPeer", "constructMessageDataForIntent", 273, "ShareIntentActivityPeer.java")).t("DRAFTBUG(b/348065860): constructMessageDataForIntent. composeRowState: %s", this.o);
        } catch (bdiv unused) {
            this.o = null;
            ((ddwn) this.k.b()).a(R.string.attachment_load_failed_dialog_message, false);
            this.b.setResult(0);
            this.b.finish();
        }
    }

    public final void e(int i, ConversationId conversationId, Integer num, bcyl bcylVar, boolean z) {
        ((alse) this.l.b()).a(alrz.a, 0);
        enru enruVar = a;
        ((enrr) ((enrr) enruVar.h()).h("com/google/android/apps/messaging/ui/conversationlist/ShareIntentActivityPeer", "launchConversationActivityForResultForShareIntent", 309, "ShareIntentActivityPeer.java")).t("DRAFTBUG(b/348065860): launchConversationActivityForResultForShareIntent. composeRowState: %s.", this.o);
        if (((ayfg) this.e.b()).y(this.b, i, conversationId, this.o, null, num, this.n, bcylVar, z)) {
            return;
        }
        ((enrr) ((enrr) enruVar.h()).h("com/google/android/apps/messaging/ui/conversationlist/ShareIntentActivityPeer", "launchConversationActivityForResultForShareIntent", 330, "ShareIntentActivityPeer.java")).q("DRAFTBUG(b/348065860): launchConversationActivityForResultForShareIntent. !launched, finishing.");
        ((ddzb) this.j.b()).k(R.string.attachment_load_failed_dialog_message);
        this.b.setResult(0);
        this.b.finish();
    }
}
