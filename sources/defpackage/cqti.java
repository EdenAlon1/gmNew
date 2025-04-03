package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqti extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new cqth(this);
    }

    public final void b(MessageIdType messageIdType) {
        aq(new dtrt("file_transfer.message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
    }

    public final void c(String str) {
        aq(new dtrt("file_transfer.transfer_id", 1, String.valueOf(str)));
    }

    public final void d(cqtk cqtkVar) {
        aq(new dtwe("file_transfer.transfer_type", 1, Integer.valueOf(cqtkVar == null ? 0 : cqtkVar.ordinal())));
    }
}
