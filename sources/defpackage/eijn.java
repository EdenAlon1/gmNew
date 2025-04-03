package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eijn implements eiko {
    public static final ContentType a;

    static {
        eifc d = ContentType.d();
        d.f(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        d.e("plain");
        a = d.g();
    }

    @Override // defpackage.eiko
    public final /* bridge */ /* synthetic */ eihn a(eijp eijpVar) {
        eidy eidyVar = new eidy();
        eidyVar.b(eijpVar.b());
        eidyVar.c(eijpVar.a());
        return eidyVar.a();
    }

    @Override // defpackage.eiko
    public final /* bridge */ /* synthetic */ eijp b(eihn eihnVar) {
        ChatMessage chatMessage = (ChatMessage) eihnVar;
        eijj eijjVar = new eijj();
        eijjVar.b(chatMessage.b());
        eijjVar.c(chatMessage.a());
        return eijjVar.a();
    }
}
