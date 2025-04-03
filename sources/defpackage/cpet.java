package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpet implements bdnt {
    final cpev a;

    public cpet(cpev cpevVar) {
        this.a = cpevVar;
    }

    @Override // defpackage.bdnt
    public final void c(MessageCoreData messageCoreData) {
        this.a.o(messageCoreData.E().f(), new ecda("ToFileDownloaded"), cpeu.TACHYGRAM_MESSAGE_ARRIVED);
    }
}
