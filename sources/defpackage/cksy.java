package defpackage;

import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cksy extends ffhv implements ffji {
    final /* synthetic */ ckta a;
    final /* synthetic */ ConversationIdType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cksy(ckta cktaVar, ConversationIdType conversationIdType, ffgu ffguVar) {
        super(1, ffguVar);
        this.a = cktaVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        engw engwVar;
        ffci.b(obj);
        ckta cktaVar = this.a;
        boolean a = ((atzm) cktaVar.h.b()).a();
        final ConversationIdType conversationIdType = this.b;
        if (a) {
            bdmq bdmqVar = (bdmq) cktaVar.d.b();
            buxz a2 = cktj.a();
            a2.m(conversationIdType);
            engwVar = bdmqVar.I(a2, Alert.DURATION_SHOW_INDEFINITELY);
        } else {
            buxz a3 = cktj.a();
            ekzz f = eleg.f("MessageDatabaseOperations#getMessageIdsForConversation");
            try {
                efbd.b();
                buxo e = MessagesTable.e("getMessageIdsForConversation#query");
                e.h(new Function() { // from class: bdmc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buxz buxzVar = (buxz) obj2;
                        cskc cskcVar = bdmq.a;
                        buxzVar.m(ConversationIdType.this);
                        return buxzVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                e.g(a3);
                e.d(new buxl(MessagesTable.c.g, true));
                e.c(MessagesTable.c.a);
                buuo buuoVar = (buuo) e.b().o();
                try {
                    engw v = buuoVar.v();
                    buuoVar.close();
                    f.close();
                    engwVar = v;
                } finally {
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
        ckta cktaVar2 = this.a;
        ConversationIdType conversationIdType2 = this.b;
        engwVar.getClass();
        if (engwVar.isEmpty()) {
            ensk h = ckta.a.h();
            h.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.p, conversationIdType2);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeBackupScheduler", "scheduleBackupWork", 86, "MmsGroupUpgradeBackupScheduler.kt")).q("MmsGroupUpgradeBackupScheduler: No MMS messages in upgraded group, skipping backup.");
        } else {
            List ai = ((atzm) cktaVar2.h.b()).a() ? ffdx.ai(engwVar, (int) ((Number) cktaVar2.g.b()).longValue()) : engwVar;
            ckwy ckwyVar = (ckwy) cktaVar2.e.b();
            ckwv ckwvVar = (ckwv) ckww.a.createBuilder();
            ckwvVar.getClass();
            ckwx.c(conversationIdType2.a(), ckwvVar);
            ckwx.g(ckwvVar);
            ArrayList arrayList = new ArrayList(ffdx.n(ai, 10));
            Iterator it = ai.iterator();
            while (it.hasNext()) {
                arrayList.add(((MessageIdType) it.next()).b());
            }
            ckwx.e(arrayList, ckwvVar);
            ckwx.f(3, ckwvVar);
            ckwx.b(1, ckwvVar);
            enou enouVar = (enou) engwVar;
            ckwx.d(enouVar.c, ckwvVar);
            ckww a4 = ckwx.a(ckwvVar);
            cetp cetpVar = new cetp();
            cetpVar.a = "TELEPHONY";
            ((cevh) ckwyVar.a.b()).a(ceyr.h("backup_upgraded_mms_group", a4, cetpVar.a()));
            ensk h2 = ckta.a.h();
            h2.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar2 = (enrr) h2;
            enrrVar2.Y(csux.p, conversationIdType2);
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/MmsGroupUpgradeBackupScheduler", "scheduleBackupWork", 109, "MmsGroupUpgradeBackupScheduler.kt")).r("MmsGroupUpgradeBackupScheduler: Scheduled backup of %s MMS messages.", enouVar.c);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cksy(this.a, this.b, (ffgu) obj).b(ffcu.a);
    }
}
