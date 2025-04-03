package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cper implements bdnu {
    private final cpev a;

    public cper(cpev cpevVar) {
        this.a = cpevVar;
    }

    @Override // defpackage.bdnu
    public final void d(MessageCoreData messageCoreData) {
        if (((Boolean) cpev.l.e()).booleanValue()) {
            ecda ecdaVar = new ecda("ToMessageStoredInDbRcs");
            String f = messageCoreData.E().f();
            cpev cpevVar = this.a;
            messageCoreData.cm();
            cpevVar.i(f, ecdaVar, cpev.i);
        }
    }

    @Override // defpackage.bdnu
    public final void e(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdnu
    public final void k(MessageCoreData messageCoreData) {
    }
}
