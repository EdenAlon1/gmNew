package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionsJsonParser;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dijc implements ditw {
    final /* synthetic */ dijk a;

    public dijc(dijk dijkVar) {
        this.a = dijkVar;
    }

    @Override // defpackage.ditw
    public final void a(dkjt dkjtVar, long j, String str) {
        String str2;
        ArrayList<ConversationSuggestion> arrayList;
        if (!dkjtVar.q) {
            dkty.q("Discarding incoming RBM Suggestions for container message id '%s' in a P2P session. This is a violation of the RCS spec by the RCS platform. ", dkjtVar.m);
        }
        dijk dijkVar = this.a;
        String r = dijk.r(dkjtVar);
        if (dktk.e(dkjtVar.h, "application/vnd.gsma.botsuggestion.v1.0+json")) {
            str2 = dkjtVar.m;
            if (TextUtils.isEmpty(str2)) {
                dkty.r(dijk.d, "Ignoring suggested chip list without container message ID: %s", dkjtVar.k);
                return;
            }
            if (dkjtVar.f == null) {
                dkty.r(dijk.d, "Can't parse suggestions, InstantMessage content is null", new Object[0]);
                return;
            }
            arrayList = new ConversationSuggestionsJsonParser().parse(emxe.b(dkjtVar.a()));
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ConversationSuggestion conversationSuggestion = arrayList.get(i);
                conversationSuggestion.setRcsMessageId(r);
                conversationSuggestion.setTargetRcsMessageId(str2);
            }
        } else {
            str2 = null;
            arrayList = null;
        }
        if (Objects.isNull(arrayList) || dkta.a(arrayList) || TextUtils.isEmpty(str2)) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(RcsIntents.EXTRA_CONVERSATION_SUGGESTIONS, arrayList);
        bundle.putString(RcsIntents.EXTRA_USER_ID, str);
        bdhg.h(bundle, RcsIntents.EXTRA_MESSAGE_ID, bdhg.a(r));
        bdhg.h(bundle, RcsIntents.EXTRA_TARGET_RCS_MESSAGE_ID, bdhg.a(str2));
        dkuk.c(dijkVar.h, RcsIntents.ACTION_INCOMING_CONVERSATION_SUGGESTIONS_MESSAGE, bundle, dkuj.IMS_CHAT_SESSION_PROVIDER);
    }
}
