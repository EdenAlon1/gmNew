package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btfn extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new btfm(this);
    }

    public final void b(MessageIdType messageIdType) {
        aq(new dtrt("flagged_messages.flagged_message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
    }

    public final void c(Iterable iterable) {
        engr engrVar = new engr();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(bdhb.a((MessageIdType) it.next())));
        }
        aq(new dtrw("flagged_messages.flagged_message_id", 3, at(engrVar.g()), true));
    }

    public final void d(byyx byyxVar) {
        aq(new dtwe("flagged_messages.flagging_reason", 1, Integer.valueOf(byyxVar == null ? 0 : byyxVar.ordinal())));
    }
}
