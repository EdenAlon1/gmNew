package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctjw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctko b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ long d;
    final /* synthetic */ eooi e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctjw(ffgu ffguVar, ctko ctkoVar, ConversationIdType conversationIdType, long j, eooi eooiVar) {
        super(2, ffguVar);
        this.b = ctkoVar;
        this.c = conversationIdType;
        this.d = j;
        this.e = eooiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctjw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            bdmq bdmqVar = (bdmq) this.b.a.b();
            ConversationIdType conversationIdType = this.c;
            long j = this.d;
            ekzz f = eleg.f("MessageDatabaseOperations#getLatestMessageForConversationBeforeTimestamp");
            try {
                String[] strArr = MessagesTable.a;
                buxz buxzVar = new buxz();
                buxzVar.m(conversationIdType);
                buxzVar.T(j);
                MessageCoreData m = bdmqVar.m(new buxs(buxzVar));
                f.close();
                if (m != null) {
                    ctko ctkoVar = this.b;
                    this.a = 1;
                    if (ctkoVar.n(m, this) == ffhhVar) {
                        return ffhhVar;
                    }
                }
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctjw ctjwVar = new ctjw(ffguVar, this.b, this.c, this.d, this.e);
        ctjwVar.f = obj;
        return ctjwVar;
    }
}
