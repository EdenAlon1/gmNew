package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpep implements bdnz {
    private final cpev a;

    public cpep(cpev cpevVar) {
        this.a = cpevVar;
    }

    @Override // defpackage.bdnz
    public final ekzz a() {
        return eleg.f("MessageLatencyAnalytics::onProcessDeliverSuccess");
    }

    @Override // defpackage.bdnz
    public final void b(MessageCoreData messageCoreData) {
        fjay aJ = messageCoreData.aJ();
        if (aJ == null) {
            return;
        }
        ecda a = ecda.a(new ecda("ToDelivered"), cpev.a(messageCoreData.d()));
        cpev cpevVar = this.a;
        String str = aJ.b;
        messageCoreData.cm();
        cpevVar.i(str, a, cpev.g);
    }
}
