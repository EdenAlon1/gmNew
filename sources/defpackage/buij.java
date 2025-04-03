package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buij extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new buii(this);
    }

    public final void b(MessageIdType messageIdType) {
        aq(new dtrt("message_send_receive_attempt.message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
    }
}
