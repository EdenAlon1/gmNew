package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqrc extends ffhv implements ffjm {
    final /* synthetic */ aqre a;
    final /* synthetic */ engw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqrc(aqre aqreVar, engw engwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqreVar;
        this.b = engwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqrc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ensk e = aqre.a.e();
        e.Y(ente.a, "BugleRecipientSync");
        ((enrr) e.h("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactSyncListenerImpl$onRecipientsChangedFromContacts$1", "invokeSuspend", 46, "RecipientContactSyncListenerImpl.kt")).q("Starting onRecipientsChangedFromContacts");
        engw<ParticipantsTable.BindData> engwVar = this.b;
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        for (ParticipantsTable.BindData bindData : engwVar) {
            aqre aqreVar = this.a;
            ((azzu) aqreVar.d.b()).b(bindData.S(), bindData);
            arrayList.add(ffcu.a);
        }
        aqre aqreVar2 = this.a;
        engw engwVar2 = this.b;
        bczy bczyVar = (bczy) aqreVar2.e.b();
        ArrayList arrayList2 = new ArrayList(ffdx.n(engwVar2, 10));
        Iterator<E> it = engwVar2.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ParticipantsTable.BindData) it.next()).S());
        }
        bczyVar.S(new ArrayList(arrayList2));
        ensk e2 = aqre.a.e();
        e2.Y(ente.a, "BugleRecipientSync");
        ((enrr) e2.h("com/google/android/apps/messaging/shared/api/messaging/recipient/sync/RecipientContactSyncListenerImpl$onRecipientsChangedFromContacts$1", "invokeSuspend", 49, "RecipientContactSyncListenerImpl.kt")).q("Finished onRecipientsChangedFromContacts");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqrc(this.a, this.b, ffguVar);
    }
}
