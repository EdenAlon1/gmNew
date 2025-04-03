package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpeq implements bdoa {
    private final cpev a;
    private final ffbr b;

    public cpeq(cpev cpevVar, ffbr ffbrVar) {
        this.a = cpevVar;
        this.b = ffbrVar;
    }

    @Override // defpackage.bdoa
    public final void a(MessageCoreData messageCoreData) {
        fjay aJ = messageCoreData.aJ();
        if (aJ == null) {
            return;
        }
        ecda a = ecda.a(new ecda("ToSent"), cpev.a(messageCoreData.d()));
        cpev cpevVar = this.a;
        String str = aJ.b;
        messageCoreData.cm();
        cpevVar.i(str, a, cpev.g);
        this.a.f(aJ.b, ((Integer) cpev.a.e()).intValue(), cpev.h);
        ayzs ayzsVar = (ayzs) this.b.b();
        MessageIdType B = messageCoreData.B();
        B.getClass();
        if (ayzsVar.f != null) {
            ayzsVar.a();
        }
        ayzsVar.f = B;
        ayzsVar.e.e(ayzs.c);
        ayzsVar.e.e(ayzs.d);
        ayzsVar.e.e(ayzs.a);
        ayzsVar.e.e(ayzs.b);
    }

    @Override // defpackage.bdoa, defpackage.bdnx
    public final ekzz c() {
        return eleg.f("MessageLatencyAnalytics::onProcessSendSuccess");
    }
}
