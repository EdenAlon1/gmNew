package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aljb implements bdns, bdod {
    private final alja a;

    public aljb(alja aljaVar) {
        this.a = aljaVar;
    }

    @Override // defpackage.bdod
    public final void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        messageCoreData.getClass();
        messageIdType.getClass();
        if (messageCoreData.cP()) {
            alja aljaVar = this.a;
            ConversationIdType z = messageCoreData.z();
            z.getClass();
            SelfIdentityId v = messageCoreData.v();
            v.getClass();
            aljaVar.c(z, v, 2);
        }
    }

    @Override // defpackage.bdns
    public final void gc(MessageCoreData messageCoreData) {
        if (messageCoreData.cP()) {
            alja aljaVar = this.a;
            ConversationIdType z = messageCoreData.z();
            z.getClass();
            SelfIdentityId v = messageCoreData.v();
            v.getClass();
            aljaVar.c(z, v, 3);
        }
    }

    @Override // defpackage.bdod
    public final boolean j() {
        return true;
    }

    @Override // defpackage.bdns
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.bdns
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, ffgu ffguVar) {
        return messageCoreData;
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, ffgu ffguVar) {
        return messageCoreData;
    }
}
