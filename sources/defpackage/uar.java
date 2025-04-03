package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uar implements ekob {
    public final errl a;
    public final ames b;
    private final Context c;
    private final amet d;
    private final ffbr e;

    public uar(Context context, errl errlVar, ames amesVar, amet ametVar, ffbr ffbrVar) {
        this.c = context;
        this.a = errlVar;
        this.b = amesVar;
        this.d = ametVar;
        this.e = ffbrVar;
    }

    public final eknx a(ConversationId conversationId, MessageIdType messageIdType) {
        Intent l = ((ayfg) this.e.b()).l(this.c, conversationId, null, false, false);
        l.putExtra("message_id", messageIdType.b());
        return eknx.b(l);
    }

    @Override // defpackage.ekob
    public final eknz b(ekoa ekoaVar) {
        Intent intent = ekoaVar.a;
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        if ((!"https".equals(data.getScheme()) && !"http".equals(data.getScheme())) || !"messages.google.com".equals(data.getHost()) || !"/conversation".equals(data.getPath())) {
            return null;
        }
        Uri uri = (Uri) intent.getParcelableExtra("sms_uri");
        return uri != null ? new uao(this, uri) : new uaq(this, bdgq.b(intent.getStringExtra("conversation_id")), this.d.a(intent), bdhb.b(intent.getStringExtra("message_id")));
    }
}
