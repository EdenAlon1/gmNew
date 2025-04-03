package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ckvo extends ffhv implements ffjm {
    final /* synthetic */ ckwi a;
    final /* synthetic */ List b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckvo(ckwi ckwiVar, List list, ConversationIdType conversationIdType, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ckwiVar;
        this.b = list;
        this.c = conversationIdType;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ckvo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final List list = this.b;
        final ckwi ckwiVar = this.a;
        final ConversationIdType conversationIdType = this.c;
        final int i = this.d;
        ckwiVar.k.a("RepairForkedMmsGroupSynclet#fixConversationParticipants", new dtus() { // from class: ckvn
            @Override // defpackage.dtus
            public final Object a(cbwn cbwnVar) {
                ckwi ckwiVar2;
                List list2 = list;
                ArrayList arrayList = new ArrayList(ffdx.n(list2, 10));
                Iterator it = list2.iterator();
                while (true) {
                    ckwiVar2 = ckwiVar;
                    if (!it.hasNext()) {
                        break;
                    }
                    ParticipantsTable.BindData a = bdqu.h((aoku) it.next(), null, i).a();
                    ((bdrr) ckwiVar2.h.b()).i(a);
                    arrayList.add(a);
                }
                ConversationIdType conversationIdType2 = conversationIdType;
                List L = ((bczy) ckwiVar2.f.b()).L(conversationIdType2);
                L.getClass();
                List i2 = ckwi.i(arrayList, L);
                List i3 = ckwi.i(L, arrayList);
                ensk h = ckwi.a.h();
                h.Y(ente.a, "BugleGroupManagement");
                ((enrr) h.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet$fixConversationParticipants$2", "invokeSuspend$lambda$2", 398, "RepairForkedMmsGroupSynclet.kt")).u("Add %d, remove %d participants.", i2.size(), i3.size());
                if (!i2.isEmpty() && !((bczy) ckwiVar2.f.b()).ao(i2, conversationIdType2)) {
                    ensk i4 = ckwi.a.i();
                    i4.Y(ente.a, "BugleGroupManagement");
                    ((enrr) i4.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet$fixConversationParticipants$2", "invokeSuspend$lambda$2", 411, "RepairForkedMmsGroupSynclet.kt")).q("Failed to add participants.");
                    cbwnVar.a(null);
                    return ffcu.a;
                }
                if (i3.isEmpty() || ((bczy) ckwiVar2.f.b()).at(i3, conversationIdType2)) {
                    ((bczy) ckwiVar2.f.b()).P(conversationIdType2);
                    return ffcu.a;
                }
                ensk i5 = ckwi.a.i();
                i5.Y(ente.a, "BugleGroupManagement");
                ((enrr) i5.h("com/google/android/apps/messaging/shared/rcs/groups/mmsgroupupgrade/RepairForkedMmsGroupSynclet$fixConversationParticipants$2", "invokeSuspend$lambda$2", 427, "RepairForkedMmsGroupSynclet.kt")).q("Failed to remove participants.");
                cbwnVar.a(null);
                return ffcu.a;
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ckvo(this.a, this.b, this.c, this.d, ffguVar);
    }
}
