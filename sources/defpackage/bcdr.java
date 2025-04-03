package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcdr extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bcdq(this);
    }

    public final void b() {
        int intValue = bcds.c().intValue();
        if (intValue < 0) {
            dtub.w(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, intValue);
        }
        aq(new dtrx("parts_backup.text", 6));
    }
}
