package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.receiver.CopyOtpReceiver;
import com.google.android.apps.messaging.shared.receiver.RestoreReceiver;
import com.google.android.apps.messaging.shared.receiver.SendStatusReceiver;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnfb implements cnjt {
    private static final Uri a = Uri.parse("content://buglesmssend");
    private final Context b;
    private final cpdg c;
    private final bbcf d;
    private final bbfd e;

    public cnfb(Context context, cpdg cpdgVar, bbcf bbcfVar, bbfd bbfdVar) {
        this.b = context;
        this.c = cpdgVar;
        this.d = bbcfVar;
        this.e = bbfdVar;
    }

    @Override // defpackage.cnjt
    public final PendingIntent a(String str, Uri uri, int i, int i2, int i3, MessageIdType messageIdType, String str2, long j) {
        Intent intent = new Intent(str, Uri.withAppendedPath(a, messageIdType.b()), this.b, SendStatusReceiver.class);
        intent.putExtra("partCnt", i);
        intent.putExtra("partId", i2);
        intent.putExtra("subId", i3);
        intent.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
        intent.putExtra("message_id", messageIdType.b());
        intent.putExtra("destination", str2);
        intent.putExtra("messageId", j);
        this.c.f(intent);
        return PendingIntent.getBroadcast(this.b, i2, intent, ctie.a);
    }

    @Override // defpackage.cnjt
    public final Intent b(Uri uri, Uri uri2, Bundle bundle, long j) {
        Intent intent = new Intent("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_DOWNLOADED", uri, this.b, SendStatusReceiver.class);
        this.c.f(intent);
        intent.putExtra("content_uri", uri2);
        intent.putExtra("messageId", j);
        intent.putExtras(bundle);
        return intent;
    }

    @Override // defpackage.cnjt
    public final Intent c(Context context, Uri uri, Uri uri2, boolean z, Bundle bundle, long j) {
        Intent intent = new Intent("com.google.android.apps.messaging.shared.receiver.SendStatusReceiver.MMS_SENT", uri, context, SendStatusReceiver.class);
        intent.putExtra("content_uri", uri2);
        intent.putExtra("response_important", z);
        intent.putExtra("messageId", j);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        this.c.f(intent);
        return intent;
    }

    @Override // defpackage.cnjt
    public final Intent d() {
        Intent intent = new Intent("com.lge.bnr.intent.action.REQUEST_MESSAGE").setClass(this.b, RestoreReceiver.class);
        intent.putExtra("BNR_MODE", 2);
        return intent;
    }

    @Override // defpackage.cnjt
    public final PendingIntent e(String str, ConversationIdType conversationIdType, MessageIdType messageIdType) {
        Context context = this.b;
        akuv c = akuv.c(context, CopyOtpReceiver.class, "android.intent.action.VIEW");
        c.f(context.getPackageName());
        Intent a2 = c.a();
        a2.setAction("com.google.android.apps.messaging.copy_otp");
        a2.addCategory(conversationIdType.a());
        a2.putExtra("otp_code", str);
        a2.putExtra("conversation_id", conversationIdType.a());
        a2.putExtra("mapi_conversation_id", new BugleConversationId(conversationIdType));
        a2.putExtra("message_id", messageIdType.b());
        PendingIntent d = eepf.d(this.b, 123, a2, ctie.a(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS));
        d.getClass();
        return d;
    }

    @Override // defpackage.cnjt
    public final PendingIntent f(ConversationIdType conversationIdType) {
        Action f = this.e.f(conversationIdType, bdhb.a, true);
        bbcf bbcfVar = this.d;
        Context context = this.b;
        return bbcfVar.a(context, f, 120, false, bcqc.b(context, conversationIdType));
    }
}
