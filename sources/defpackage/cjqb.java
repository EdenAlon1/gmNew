package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import j$.util.Optional;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjqb extends ffhv implements ffjm {
    final /* synthetic */ cjqc a;
    final /* synthetic */ cjpb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjqb(cjqc cjqcVar, cjpb cjpbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cjqcVar;
        this.b = cjpbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjqb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bdmq bdmqVar = (bdmq) this.a.c.b();
        UUID uuid = this.b.b;
        ekzz f = eleg.f("MessageDatabaseOperations#readMessageDataByPersistenceId");
        try {
            String[] strArr = MessagesTable.a;
            buxz buxzVar = new buxz();
            buxzVar.C(Optional.of(uuid));
            MessageCoreData A = bdmqVar.A(new buxs(buxzVar));
            f.close();
            if (A != null) {
                ensk h = cjqc.a.h();
                h.Y(ente.a, "SmsToBugleDbWriter");
                ((enrr) h.h("com/google/android/apps/messaging/shared/pipeline/sms/receive/SmsToBugleDbWriter$execute$2", "invokeSuspend", 45, "SmsToBugleDbWriter.kt")).t("Message already exists with persistence ID %s. Skipping BugleDb insertion.", this.b.b);
                cjpb cjpbVar = this.b;
                return cjpb.a(cjpbVar, cjov.a(cjpbVar.e, null, A.B(), 63));
            }
            cjqc cjqcVar = this.a;
            cjpb cjpbVar2 = this.b;
            ParticipantsTable.BindData bindData = ((bacf) cjqcVar.b.c(cjpbVar2.f.getAsString("address"), cjpbVar2.c.e.b)).b;
            cjpb cjpbVar3 = this.b;
            long a = cjpbVar3.d.b.a();
            Instant instant = cjpbVar3.c.d;
            cjoq cjoqVar = cjpbVar3.d;
            ConversationIdType conversationIdType = cjoqVar.a;
            boolean z = cjoqVar.c;
            long epochMilli = instant.toEpochMilli();
            cjov cjovVar = cjpbVar3.e;
            byyt byytVar = cjovVar.e;
            boolean z2 = cjovVar.c;
            byzi byziVar = byzi.VERIFICATION_NA;
            long j = cjpbVar3.a;
            basy a2 = this.a.b.a(new bacc(cjpbVar3.c.e.b, cjpbVar3.f, bindData, a, conversationIdType, z, epochMilli, cjovVar.f, cjovVar.a, false, byytVar, z2, byziVar, j, cjpbVar3.c.e.f, cjpbVar3.e.b, cjpbVar3.b));
            cjpb cjpbVar4 = this.b;
            return cjpb.a(cjpbVar4, cjov.a(cjpbVar4.e, null, a2 != null ? ((bacd) a2).a : null, 63));
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjqb(this.a, this.b, ffguVar);
    }
}
