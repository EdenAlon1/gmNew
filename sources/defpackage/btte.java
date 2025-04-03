package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btte extends duav {
    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bttd(this);
    }

    public final void b(int i) {
        aq(new dtwe("messages_annotations.annotation_type", 1, Integer.valueOf(i)));
    }

    public final void c() {
        aq(new dtwe("messages_annotations.annotation_type", 2, 8));
    }

    public final void d(String str) {
        aq(new dtrt("messages_annotations._id", 1, String.valueOf(str)));
    }

    public final void e(MessageIdType messageIdType) {
        int intValue = bttf.d().intValue();
        if (intValue < 20040) {
            dtub.w("message_id", intValue);
        }
        aq(new dtrt("messages_annotations.message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
    }

    public final void f(dtzj dtzjVar) {
        int intValue = bttf.d().intValue();
        if (intValue < 20040) {
            dtub.w("message_id", intValue);
        }
        aq(new dtru("messages_annotations.message_id", 1, dtzjVar));
    }

    public final void g(dtzj dtzjVar) {
        int intValue = bttf.d().intValue();
        if (intValue < 20040) {
            dtub.w("message_id", intValue);
        }
        aq(new dtru("messages_annotations.message_id", 3, dtzjVar));
    }
}
