package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwvx extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bwvw(this);
    }

    public final void b(MessageIdType messageIdType) {
        aq(new dtrt("read_reports.message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
    }

    public final void c(long j) {
        aq(new dtwe("read_reports.participant_id", 1, Long.valueOf(j)));
    }
}
