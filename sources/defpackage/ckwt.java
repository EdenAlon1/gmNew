package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwt extends ceut {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler");
    public static final ecda b = new ecda("BackupUpgradedMmsGroupHandlerTimer");
    public static final ecda c = new ecda("BackupUpgradedMmsGroupHandlerMemory");
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    private final ffsk l;
    private final ffbr m;

    public ckwt(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ckwy ckwyVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ckwyVar.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        this.l = ffskVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.m = ffbrVar7;
        this.j = ffbrVar8;
        this.k = ffbrVar9;
    }

    private final int m(final ConversationIdType conversationIdType) {
        bdmq bdmqVar = (bdmq) this.f.b();
        buxo e = MessagesTable.e("getSuccessfullyBackedUpMessagesToTelephonyCount#query");
        e.h(new Function() { // from class: ckwo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.m(ConversationIdType.this);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        e.g(cktj.a());
        int i = 0;
        e.c(MessagesTable.c.s);
        engw J = bdmqVar.J(e.b());
        J.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : J) {
            String av = ((MessageCoreData) obj).av();
            emyl emylVar = ckey.a;
            if (ckbe.a(av)) {
                arrayList.add(obj);
            }
        }
        ArrayList<ckex> arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ckey.c(((MessageCoreData) it.next()).av()));
        }
        if (arrayList2.isEmpty()) {
            return 0;
        }
        for (ckex ckexVar : arrayList2) {
            if (ckexVar != null && ckexVar.e().isPresent() && (((ckbn) ckexVar.e().get()).b & 1) != 0 && (i = i + 1) < 0) {
                ffdx.k();
            }
        }
        return i;
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        l.b(cevc.WORKMANAGER_ONLY);
        l.c((int) ((Number) this.m.b()).longValue());
        l.f(poa.EXPONENTIAL);
        return l.h();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("BackupUpgradedMmsGroupHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        eyhz parserForType = ckww.a.getParserForType();
        parserForType.getClass();
        return parserForType;
    }

    @Override // defpackage.ceut
    public final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        elfl c2;
        ckww ckwwVar = (ckww) eyhsVar;
        ckwwVar.getClass();
        c2 = axol.c(this.l, ffhe.a, ffsm.a, new ckws(this, ceuwVar, ckwwVar, null));
        return c2;
    }

    public final ceyt k(ConversationIdType conversationIdType, ckww ckwwVar, List list) {
        if (!list.isEmpty()) {
            ckwv ckwvVar = (ckwv) ckww.a.createBuilder();
            ckwvVar.getClass();
            ckwx.c(conversationIdType.a(), ckwvVar);
            int b2 = ckwu.b(ckwwVar.d);
            if (b2 == 0) {
                b2 = 1;
            }
            ckwx.f(b2, ckwvVar);
            ckwx.g(ckwvVar);
            ckwx.e(list, ckwvVar);
            ckwx.d(ckwwVar.f, ckwvVar);
            ckwx.b(ckwwVar.e + 1, ckwvVar);
            ckww a2 = ckwx.a(ckwvVar);
            cetp cetpVar = new cetp();
            int b3 = ckwu.b(ckwwVar.d);
            cetpVar.a = ckwu.a(b3 != 0 ? b3 : 1);
            return ceyt.j(engw.r(ceyr.h("backup_upgraded_mms_group", a2, cetpVar.a())));
        }
        int m = m(conversationIdType);
        if (m < ckwwVar.f) {
            ((cktw) this.i.b()).c(conversationIdType, 8, ckwwVar.f, m);
            ensk j = a.j();
            j.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar = (enrr) j;
            enrrVar.Y(csux.p, conversationIdType);
            enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "onBackupCompleted", 318, "BackupUpgradedMmsGroupHandler.kt");
            int b4 = ckwu.b(ckwwVar.d);
            enrrVar2.t("BackupUpgradedMmsGroupHandler: Finished backing up upgraded MMS group to %s, but not all messages were backed up", ckwu.a(b4 != 0 ? b4 : 1));
            return ceyt.k();
        }
        cktw cktwVar = (cktw) this.i.b();
        eqbb eqbbVar = (eqbb) eqbp.b.createBuilder();
        eqbbVar.getClass();
        equi.b(((akvz) cktwVar.a.b()).b(conversationIdType), eqbbVar);
        equi.c(7, eqbbVar);
        equi.g(eqbbVar);
        cktwVar.a(equi.a(eqbbVar));
        ensk h = a.h();
        h.Y(ente.a, "BugleGroupManagement");
        enrr enrrVar3 = (enrr) h;
        enrrVar3.Y(csux.p, conversationIdType);
        enrr enrrVar4 = (enrr) enrrVar3.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "onBackupCompleted", 301, "BackupUpgradedMmsGroupHandler.kt");
        int b5 = ckwu.b(ckwwVar.d);
        enrrVar4.t("BackupUpgradedMmsGroupHandler: Finished backing up upgraded MMS group to %s", ckwu.a(b5 != 0 ? b5 : 1));
        return ceyt.i();
    }

    public final ceyt l(ConversationIdType conversationIdType, int i, ckww ckwwVar) {
        String str;
        ensk j = a.j();
        j.Y(ente.a, "BugleGroupManagement");
        enrr enrrVar = (enrr) j;
        enrrVar.Y(csux.p, conversationIdType);
        enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/backup/BackupUpgradedMmsGroupHandler", "onBackupFailed", 386, "BackupUpgradedMmsGroupHandler.kt");
        int b2 = ckwu.b(ckwwVar.d);
        if (b2 == 0) {
            b2 = 1;
        }
        switch (i) {
            case 1:
                str = "UNKNOWN_MMS_GROUP_CONVERSATION_BACKUP_FAILURE_REASON";
                break;
            case 2:
                str = "INVALID_PARAMETERS_MISSING_CONVERSATION_ID";
                break;
            case 3:
                str = "INVALID_PARAMETERS_UNKNOWN_CONVERSATION";
                break;
            case 4:
                str = "INVALID_PARAMETERS_CONVERSATION_NOT_RCS_GROUP";
                break;
            case 5:
                str = "INVALID_PARAMETERS_GROUP_WITHOUT_CONFERENCE_URI";
                break;
            case 6:
                str = "INVALID_PARAMETERS_NOT_ALL_MESSAGES_MMS";
                break;
            default:
                str = "CANCELLED_EXECUTION";
                break;
        }
        enrrVar2.D("BackupUpgradedMmsGroupHandler: %s Backup failed with %s reason", ckwu.a(b2), str);
        ((cktw) this.i.b()).c(conversationIdType, i, ckwwVar.f, m(conversationIdType));
        return ceyt.k();
    }
}
