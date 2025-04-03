package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnrt extends ffhv implements ffjm {
    final /* synthetic */ cnru a;
    final /* synthetic */ MessageCoreData b;
    final /* synthetic */ bdgr c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnrt(ffgu ffguVar, cnru cnruVar, MessageCoreData messageCoreData, bdgr bdgrVar) {
        super(2, ffguVar);
        this.a = cnruVar;
        this.b = messageCoreData;
        this.c = bdgrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnrt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bdmq bdmqVar = (bdmq) this.a.c.b();
        MessageCoreData messageCoreData = this.b;
        ConversationIdType z = messageCoreData.z();
        MessageIdType B = messageCoreData.B();
        String[] strArr = MessagesTable.a;
        buxr buxrVar = new buxr();
        buxrVar.ap("updateDatagramId");
        buxrVar.J(this.c);
        bdmqVar.U(z, B, buxrVar);
        ensk h = cnru.a.h();
        h.Y(ente.a, "BugleSatellite");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.b, this.b.B());
        enrrVar.Y(csux.Y, this.c);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/satelliteapi/outgoing/SatelliteApiSender$updateDatagramId$lambda$5$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 144, "SatelliteApiSender.kt")).q("Successfully updated outgoing message datagramId.");
        return ckbx.j(-1, 0).a();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnrt cnrtVar = new cnrt(ffguVar, this.a, this.b, this.c);
        cnrtVar.d = obj;
        return cnrtVar;
    }
}
