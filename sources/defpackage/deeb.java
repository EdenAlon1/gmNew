package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deeb {
    public static final entd a = entd.c("BugleConversation");
    public final bcwc b;
    public final ddzb c;
    public final bcpt d = new bcpt();
    private final Context e;
    private final bdiw f;
    private final ayfg g;
    private final bbfh h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;

    public deeb(Context context, bdiw bdiwVar, ayfg ayfgVar, bcwc bcwcVar, ffbr ffbrVar, ffbr ffbrVar2, bbfh bbfhVar, ddzb ddzbVar, ffbr ffbrVar3) {
        this.e = context;
        this.f = bdiwVar;
        this.g = ayfgVar;
        this.b = bcwcVar;
        this.h = bbfhVar;
        this.j = ffbrVar2;
        this.i = ffbrVar;
        this.c = ddzbVar;
        this.k = ffbrVar3;
    }

    public final void a(Intent intent, ConversationIdType conversationIdType, boolean z, boolean z2, boolean z3, boolean z4) {
        bseh r = ((bczy) this.i.b()).r(conversationIdType);
        ConversationId a2 = ((ames) this.j.b()).a(conversationIdType, r == null ? null : r.aa(), r != null && r.am());
        intent.putExtra("conversation_id", conversationIdType.a());
        intent.putExtra("mapi_conversation_id", a2);
        intent.setAction("android.intent.action.SENDTO");
        if (z3) {
            try {
                ArrayList arrayList = new ArrayList();
                if (intent.getBooleanExtra("SEND_MULTIPLE", false)) {
                    intent.setAction("android.intent.action.SEND_MULTIPLE");
                    arrayList = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                } else {
                    Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                    if (uri != null) {
                        arrayList.add(uri);
                    }
                }
                intent.putParcelableArrayListExtra("message_parts", this.f.e(arrayList, intent.getType()));
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Internal error. Failed to extract data from intent.", e);
            }
        }
        if (!z2) {
            this.h.b(intent);
            if (z) {
                this.g.D(this.e, a2, ((atdn) this.k.b()).a() ? new bdix(null) : new bdja(null), z4, intent.getExtras());
                return;
            }
            return;
        }
        bdiz d = this.f.d(intent, aygq.l);
        if (d.c() && !z4) {
            throw new RuntimeException("Internal error. Failed to extract data from intent.");
        }
        this.g.D(this.e, a2, d, z4, intent.getExtras());
    }
}
