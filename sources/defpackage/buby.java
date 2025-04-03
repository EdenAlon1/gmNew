package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buby extends duak {
    public buby() {
        super("message_photos_sharing");
    }

    @Override // defpackage.duak
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bubx b() {
        ah();
        return new bubx(this.c, this.a, this.b, this.d.g(), this.e.g());
    }

    public final void c(MessageIdType messageIdType) {
        String[] strArr = bucb.a;
        buca bucaVar = new buca();
        bucaVar.aq(new dtrt("message_photos_sharing.message_id", 1, Long.valueOf(bdhb.a(messageIdType))));
        aj(new bubz(bucaVar), "message_photos_sharing-buildAndUpdateForMessageId");
    }
}
