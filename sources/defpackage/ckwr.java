package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckwr extends ffhv implements ffji {
    final /* synthetic */ ckwt a;
    final /* synthetic */ ceuw b;
    final /* synthetic */ ckww c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckwr(ckwt ckwtVar, ceuw ceuwVar, ckww ckwwVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = ckwtVar;
        this.b = ceuwVar;
        this.c = ckwwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        final bseh bsehVar;
        int i;
        ffci.b(obj);
        ckww ckwwVar = this.c;
        ConversationIdType b = bdgq.b(ckwwVar.b);
        final ckwt ckwtVar = this.a;
        if (ckwwVar.e == 1) {
            cktw cktwVar = (cktw) ckwtVar.i.b();
            eqbb eqbbVar = (eqbb) eqbp.b.createBuilder();
            eqbbVar.getClass();
            equi.b(((akvz) cktwVar.a.b()).b(b), eqbbVar);
            equi.c(6, eqbbVar);
            equi.g(eqbbVar);
            cktwVar.a(equi.a(eqbbVar));
        }
        ensk e = ckwt.a.e();
        e.Y(ente.a, "BugleGroupManagement");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, b);
        enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "logStart", 148, "BackupUpgradedMmsGroupHandler.kt");
        int b2 = ckwu.b(ckwwVar.d);
        if (b2 == 0) {
            b2 = 1;
        }
        enrrVar2.B("BackupUpgradedMmsGroupHandler: Backing up %s batch #%s...", ckwu.a(b2), ckwwVar.e);
        if (b.b()) {
            return ckwtVar.l(b, 2, ckwwVar);
        }
        bseh r = ((bczy) ckwtVar.d.b()).r(b);
        int i2 = r == null ? 3 : !byyr.d(r.k()) ? 4 : r.ac() == null ? 5 : 0;
        if (i2 != 0) {
            return ckwtVar.l(b, i2, ckwwVar);
        }
        int b3 = ckwu.b(ckwwVar.d);
        if (b3 == 0) {
            b3 = 1;
        }
        if (b3 - 2 != 1) {
            return ckwtVar.l(b, 1, ckwwVar);
        }
        eygr eygrVar = ckwwVar.c;
        eygrVar.getClass();
        int longValue = (int) ((Number) ckwtVar.j.b()).longValue();
        ffcf ffcfVar = new ffcf(ffdx.Z(eygrVar, longValue), ffdx.aj(eygrVar, longValue));
        List list = (List) ffcfVar.a;
        List list2 = (List) ffcfVar.b;
        if (((atzm) ckwtVar.k.b()).a()) {
            eygr eygrVar2 = ckwwVar.c;
            if (eygrVar2.size() == 0) {
                list = ffel.a;
                list2 = eygrVar2;
            } else {
                eygr eygrVar3 = ckwwVar.c;
                eygrVar3.getClass();
                long j = bdhb.b((String) ffdx.P(eygrVar3)).a;
                bdmq bdmqVar = (bdmq) ckwtVar.f.b();
                buxz a = cktj.a();
                a.m(r.C());
                a.w(j);
                engw I = bdmqVar.I(a, (int) ((Number) ckwtVar.j.b()).longValue());
                I.getClass();
                ArrayList arrayList = new ArrayList(ffdx.n(I, 10));
                enqv it = I.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MessageIdType) it.next()).b());
                }
                list = arrayList;
                list2 = eygrVar2;
            }
        }
        bdmq bdmqVar2 = (bdmq) ckwtVar.f.b();
        ArrayList arrayList2 = new ArrayList(ffdx.n(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(bdhb.b((String) it2.next()));
        }
        engw<MessageCoreData> K = bdmqVar2.K(arrayList2);
        K.getClass();
        if (!K.isEmpty()) {
            for (MessageCoreData messageCoreData : K) {
                if (!messageCoreData.cP() || messageCoreData.u() == null || messageCoreData.di()) {
                    ConversationIdType C = r.C();
                    C.getClass();
                    return ckwtVar.l(C, 6, ckwwVar);
                }
            }
        }
        final ceuw ceuwVar = this.b;
        ffoh ffohVar = new ffoh(new ffoi(ffdx.as(K), new ffji() { // from class: ckwq
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                ((MessageCoreData) obj2).getClass();
                return Boolean.valueOf(!ceuw.this.b());
            }
        }));
        int i3 = 0;
        while (ffohVar.hasNext()) {
            final MessageCoreData messageCoreData2 = (MessageCoreData) ffohVar.next();
            final Uri u = messageCoreData2.u();
            if (u == null) {
                throw new IllegalStateException("Required value was null.");
            }
            final String a2 = cker.a(messageCoreData2, r.ac(), r);
            emyl emylVar = ckey.a;
            if (ckbe.a(a2)) {
                if (ffkj.e(a2, messageCoreData2.av())) {
                    bsehVar = r;
                    i = i3;
                } else {
                    bsehVar = r;
                    i = i3;
                    Object a3 = ((dtuu) ckwtVar.g.b()).a("BackupUpgradedMmsGroupHandler#backupMmsMessageToTelephony", new dtus() { // from class: ckwp
                        @Override // defpackage.dtus
                        public final Object a(cbwn cbwnVar) {
                            ckwt ckwtVar2 = ckwt.this;
                            bdmq bdmqVar3 = (bdmq) ckwtVar2.f.b();
                            MessageCoreData messageCoreData3 = messageCoreData2;
                            ConversationIdType C2 = bsehVar.C();
                            MessageIdType B = messageCoreData3.B();
                            String[] strArr = MessagesTable.a;
                            buxr buxrVar = new buxr();
                            String str = a2;
                            buxrVar.u(str);
                            bdmqVar3.U(C2, B, buxrVar);
                            if (!((coxk) ckwtVar2.e.b()).Y(u, str)) {
                                cbwnVar.a(false);
                            }
                            return true;
                        }
                    });
                    a3.getClass();
                    if (((Boolean) a3).booleanValue()) {
                    }
                }
                i3 = i + 1;
                if (i3 < 0) {
                    ffdx.k();
                }
                r = bsehVar;
            } else {
                bsehVar = r;
                i = i3;
            }
            i3 = i;
            r = bsehVar;
        }
        bseh bsehVar2 = r;
        int i4 = i3;
        int size = K.size();
        if (ceuwVar.b()) {
            ConversationIdType C2 = bsehVar2.C();
            C2.getClass();
            if (!ceuwVar.c()) {
                return ckwtVar.l(C2, 7, ckwwVar);
            }
            ensk e2 = ckwt.a.e();
            e2.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar3 = (enrr) e2;
            enrrVar3.Y(csux.p, C2);
            enrr enrrVar4 = (enrr) enrrVar3.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "onCancelledExecution", 277, "BackupUpgradedMmsGroupHandler.kt");
            int b4 = ckwu.b(ckwwVar.d);
            enrrVar4.t("BackupUpgradedMmsGroupHandler: %s execution is cancelled. Scheduling for retry...", ckwu.a(b4 == 0 ? 1 : b4));
            return ceyt.m();
        }
        if (i4 == size) {
            ConversationIdType C3 = bsehVar2.C();
            C3.getClass();
            return ckwtVar.k(C3, ckwwVar, list);
        }
        if (ceuwVar.c()) {
            ConversationIdType C4 = bsehVar2.C();
            C4.getClass();
            ensk e3 = ckwt.a.e();
            e3.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar5 = (enrr) e3;
            enrrVar5.Y(csux.p, C4);
            enrr enrrVar6 = (enrr) enrrVar5.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "retry", 356, "BackupUpgradedMmsGroupHandler.kt");
            int b5 = ckwu.b(ckwwVar.d);
            enrrVar6.t("BackupUpgradedMmsGroupHandler: %s batch failed for some messages. Scheduling for retry...", ckwu.a(b5 == 0 ? 1 : b5));
            return ceyt.m();
        }
        ConversationIdType C5 = bsehVar2.C();
        C5.getClass();
        ensk j2 = ckwt.a.j();
        j2.Y(ente.a, "BugleGroupManagement");
        enrr enrrVar7 = (enrr) j2;
        enrrVar7.Y(csux.p, C5);
        enrr enrrVar8 = (enrr) enrrVar7.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "giveUpOnCurrentBatch", 371, "BackupUpgradedMmsGroupHandler.kt");
        int b6 = ckwu.b(ckwwVar.d);
        enrrVar8.t("BackupUpgradedMmsGroupHandler: Exhausted all retries for a %s backup batch. Giving up on this batch...", ckwu.a(b6 == 0 ? 1 : b6));
        return ckwtVar.k(C5, ckwwVar, list);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ckwr(this.a, this.b, this.c, (ffgu) obj).b(ffcu.a);
    }
}
