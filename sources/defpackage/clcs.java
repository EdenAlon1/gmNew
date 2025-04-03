package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clcs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ clcv b;
    final /* synthetic */ MessageCoreData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clcs(clcv clcvVar, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = clcvVar;
        this.c = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((clcs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            coww cowwVar = (coww) this.b.o.b();
            MessageCoreData messageCoreData = this.c;
            this.a = 1;
            obj = cowwVar.b(messageCoreData, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            ensk h = clcv.a.h();
            h.Y(ente.a, "BugleDataModel");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.f, this.c.E());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/incoming/IncomingRcsMessageProcessorKt$sendBestEffortDeliveryReport$1", "invokeSuspend", 1390, "IncomingRcsMessageProcessorKt.kt")).q("Best-effort delivery report sent");
        } else {
            ensk j = clcv.a.j();
            j.Y(ente.a, "BugleDataModel");
            enrr enrrVar2 = (enrr) j;
            enrrVar2.Y(csux.f, this.c.E());
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/rcs/incoming/IncomingRcsMessageProcessorKt$sendBestEffortDeliveryReport$1", "invokeSuspend", 1395, "IncomingRcsMessageProcessorKt.kt")).q("Failed to send best-effort delivery report");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new clcs(this.b, this.c, ffguVar);
    }
}
