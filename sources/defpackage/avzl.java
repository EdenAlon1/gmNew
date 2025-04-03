package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avzl extends ffhv implements ffjm {
    final /* synthetic */ avzn a;
    final /* synthetic */ MessageCoreData b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avzl(ffgu ffguVar, avzn avznVar, MessageCoreData messageCoreData) {
        super(2, ffguVar);
        this.a = avznVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avzl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bdmq bdmqVar = (bdmq) this.a.a.b();
        MessageCoreData messageCoreData = this.b;
        ConversationIdType z = messageCoreData.z();
        MessageIdType B = messageCoreData.B();
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("updateMessageStatus");
        buxrVar.U(7);
        return Boolean.valueOf(bdmqVar.U(z, B, buxrVar));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        avzl avzlVar = new avzl(ffguVar, this.a, this.b);
        avzlVar.c = obj;
        return avzlVar;
    }
}
