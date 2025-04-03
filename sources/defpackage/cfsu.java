package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfsu extends ffhv implements ffjm {
    final /* synthetic */ cfsv a;
    final /* synthetic */ MessageCoreData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfsu(cfsv cfsvVar, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cfsvVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfsu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bczy bczyVar = (bczy) this.a.h.b();
        MessageCoreData messageCoreData = this.b;
        List L = bczyVar.L(messageCoreData.z());
        L.getClass();
        ArrayList arrayList = new ArrayList();
        enqv it = ((engw) L).iterator();
        while (it.hasNext()) {
            E next = it.next();
            if (((ParticipantsTable.BindData) next).U() != null) {
                arrayList.add(next);
            }
        }
        final aoku aokuVar = null;
        if (arrayList.isEmpty()) {
            enrr enrrVar = (enrr) cfsv.a.j();
            enrrVar.Y(csux.p, messageCoreData.z());
            enrrVar.Y(csux.b, messageCoreData.B());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/emergency/session/EmergencySessionManager", "fetchParticipants", 189, "EmergencySessionManager.kt")).q("Unable to retrieve participants for the conversation.");
            arrayList = null;
        }
        if (arrayList != null) {
            cfsv cfsvVar = this.a;
            MessageCoreData messageCoreData2 = this.b;
            aoku q = ((aolr) cfsvVar.g.b()).q((ParticipantsTable.BindData) ffdx.K(arrayList));
            if (q.e().isEmpty()) {
                enrr enrrVar2 = (enrr) cfsv.a.g();
                enrrVar2.Y(csux.p, messageCoreData2.z());
                enrrVar2.Y(csux.b, messageCoreData2.B());
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/emergency/session/EmergencySessionManager", "fetchMessagingIdentity", 209, "EmergencySessionManager.kt")).q("Messaging identity does not have RCS identifier.");
            } else {
                aokuVar = q;
            }
            if (aokuVar != null) {
                if (aokuVar.w()) {
                    final cfsv cfsvVar2 = this.a;
                    final MessageCoreData messageCoreData3 = this.b;
                    ((dtuu) cfsvVar2.e.b()).d("EmergencySessionManagerImpl.handleEmergencyMessage", new Runnable() { // from class: cfst
                        @Override // java.lang.Runnable
                        public final void run() {
                            long j;
                            MessageCoreData messageCoreData4 = MessageCoreData.this;
                            aplf aplfVar = messageCoreData4.cX() ? aplf.a : aplf.b;
                            aoku aokuVar2 = aokuVar;
                            cfsv cfsvVar3 = cfsvVar2;
                            cfsm cfsmVar = (cfsm) cfsvVar3.f.b();
                            String str = ((awui) aokuVar2.e().get()).d;
                            str.getClass();
                            apkn a = cfsmVar.a(str, aplfVar);
                            if (a != null) {
                                Instant plusMillis = ((cqoh) cfsvVar3.i.b()).f().plusMillis(a.c);
                                plusMillis.getClass();
                                cfsv.f(new apkn(a.a, a.b, a.c, a.d, plusMillis));
                                return;
                            }
                            if (messageCoreData4.cI()) {
                                enrr enrrVar3 = (enrr) cfsv.a.j();
                                enrrVar3.Y(csux.p, messageCoreData4.z());
                                enrrVar3.Y(csux.b, messageCoreData4.B());
                                enrrVar3.Y(csux.E, ((awui) aokuVar2.e().get()).d);
                                ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/emergency/session/EmergencySessionManager", "handleEmergencyMessage$lambda$2", 236, "EmergencySessionManager.kt")).q("Received an incoming emergency message but there are no active emergency sessions.");
                                return;
                            }
                            int ordinal = aplfVar.ordinal();
                            if (ordinal == 0) {
                                j = cfsvVar3.b;
                            } else {
                                if (ordinal != 1) {
                                    throw new ffcd();
                                }
                                j = cfsvVar3.c;
                            }
                            String str2 = ((awui) aokuVar2.e().get()).d;
                            str2.getClass();
                            Instant f = ((cqoh) cfsvVar3.i.b()).f();
                            f.getClass();
                            Instant plusMillis2 = ((cqoh) cfsvVar3.i.b()).f().plusMillis(j);
                            plusMillis2.getClass();
                            cfsv.f(new apkn(str2, aplfVar, j, f, plusMillis2));
                        }
                    });
                    return ffcu.a;
                }
                cfsv cfsvVar3 = this.a;
                MessageCoreData messageCoreData4 = this.b;
                cnq b = cfsvVar3.b();
                ConversationIdType z = messageCoreData4.z();
                z.getClass();
                b.d(z, false);
                enrr enrrVar3 = (enrr) cfsv.a.g();
                enrrVar3.Y(csux.p, this.b.z());
                enrrVar3.Y(csux.b, this.b.B());
                enrrVar3.Y(csux.E, ((awui) aokuVar.e().get()).d);
                ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/emergency/session/EmergencySessionManager$process$1", "invokeSuspend", 169, "EmergencySessionManager.kt")).q("Participant is not an emergency number.");
                return ffcu.a;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cfsu(this.a, this.b, ffguVar);
    }
}
