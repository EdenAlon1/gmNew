package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctkh extends ffhv implements ffjm {
    final /* synthetic */ ctko a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ long c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctkh(ffgu ffguVar, ctko ctkoVar, ConversationIdType conversationIdType, long j) {
        super(2, ffguVar);
        this.a = ctkoVar;
        this.b = conversationIdType;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctkh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bdmq bdmqVar = (bdmq) this.a.a.b();
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestVisibleMessageForConversationBeforeTimestamp");
        long j = this.c;
        try {
            buxz D = bdmq.D(this.b);
            D.T(j);
            MessageCoreData m = bdmqVar.m(new buxs(D));
            f.close();
            return m;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctkh ctkhVar = new ctkh(ffguVar, this.a, this.b, this.c);
        ctkhVar.d = obj;
        return ctkhVar;
    }
}
