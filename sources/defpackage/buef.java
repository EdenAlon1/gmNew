package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buef extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new buee(this);
    }

    public final void b(MessageIdType messageIdType) {
        aq(new dtrt("message_reactions.message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
    }

    public final void c(Iterable iterable) {
        engr engrVar = new engr();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(bdhb.a((MessageIdType) it.next())));
        }
        aq(new dtrw("message_reactions.message_id", 3, at(engrVar.g()), true));
    }

    public final void d(Iterable iterable) {
        int intValue = bueg.c().intValue();
        if (intValue < 46020) {
            dtub.w("reacted_message_id", intValue);
        }
        engr engrVar = new engr();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(bdhb.a((MessageIdType) it.next())));
        }
        aq(new dtrw("message_reactions.reacted_message_id", 3, at(engrVar.g()), true));
    }

    public final void e() {
        int intValue = bueg.c().intValue();
        if (intValue < 46020) {
            dtub.w("reacted_message_id", intValue);
        }
        aq(new dtrx("message_reactions.reacted_message_id", 6));
    }
}
