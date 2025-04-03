package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apxh extends ffhv implements ffjm {
    final /* synthetic */ cbke a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ apxi c;
    final /* synthetic */ MessageId d;
    final /* synthetic */ apor e;
    final /* synthetic */ String f;
    final /* synthetic */ Uri g;
    final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apxh(cbke cbkeVar, ConversationId conversationId, apxi apxiVar, MessageId messageId, apor aporVar, String str, Uri uri, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cbkeVar;
        this.b = conversationId;
        this.c = apxiVar;
        this.d = messageId;
        this.e = aporVar;
        this.f = str;
        this.g = uri;
        this.h = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apxh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(((BugleMessageId) this.d).c(), apxi.T(this.e));
        ConversationId conversationId = this.b;
        emxf.a(conversationId instanceof RbmConversationId);
        ConversationIdType conversationIdType = ((RbmConversationId) conversationId).a;
        ((cbkm) this.a.a).b(conversationIdType, coreBugleMessageId, this.g, this.h, new cblo[0]);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apxh(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, ffguVar);
    }
}
