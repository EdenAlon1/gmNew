package defpackage;

import com.google.android.apps.messaging.ui.conversation.suggestions.common.ConversationSuggestionStickerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cztv implements rif {
    final /* synthetic */ ConversationSuggestionStickerView a;

    public cztv(ConversationSuggestionStickerView conversationSuggestionStickerView) {
        this.a = conversationSuggestionStickerView;
    }

    @Override // defpackage.rif
    public final boolean a(qwp qwpVar, Object obj, rix rixVar, boolean z) {
        csjb e = ConversationSuggestionStickerView.a.e();
        e.I("Problem loading sticker suggestion.");
        if (qwpVar == null) {
            e.r();
        } else {
            e.s(qwpVar);
        }
        this.a.setVisibility(8);
        return true;
    }

    @Override // defpackage.rif
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2, rix rixVar, qsy qsyVar, boolean z) {
        ConversationSuggestionStickerView.a.q("Sticker suggestion loaded successfully.");
        return false;
    }
}
