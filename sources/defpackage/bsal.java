package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsal extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bsak(this);
    }

    public final void b(MessageIdType messageIdType) {
        aq(new dtrt("conversation_suggestions.message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
    }

    public final void c(dtzj dtzjVar) {
        aq(new dtru("conversation_suggestions.message_id", 1, dtzjVar));
    }
}
