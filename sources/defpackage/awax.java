package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awax extends ffhv implements ffjm {
    final /* synthetic */ awbc a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awax(ffgu ffguVar, awbc awbcVar, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.a = awbcVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awax) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bdmq bdmqVar = (bdmq) this.a.b.b();
        MessageCoreData messageCoreData = this.b;
        ConversationIdType z = messageCoreData.z();
        MessageIdType B = messageCoreData.B();
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("updateMessageSelfId");
        buxrVar.U(4);
        return Boolean.valueOf(bdmqVar.U(z, B, buxrVar));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        awax awaxVar = new awax(ffguVar, this.a, this.b);
        awaxVar.c = obj;
        return awaxVar;
    }
}
