package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bufv extends duak {
    public bufv() {
        super("message_replies");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bufu b() {
        ah();
        return new bufu(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(MessageIdType messageIdType) {
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            this.a.putNull("replied_to_message_id");
        } else {
            this.a.put("replied_to_message_id", Long.valueOf(bdhb.a(messageIdType)));
        }
    }
}
