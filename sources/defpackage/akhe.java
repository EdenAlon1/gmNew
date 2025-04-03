package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akhe implements aosh {
    final /* synthetic */ akhx a;

    public akhe(akhx akhxVar) {
        this.a = akhxVar;
    }

    @Override // defpackage.aosh
    public final aork a(MessageId messageId, ConversationId conversationId, alxj alxjVar, MessagesTable.BindData bindData, alya alyaVar, appj appjVar, apug apugVar, aqcm aqcmVar, boolean z, engw engwVar, ffbr ffbrVar) {
        akhx akhxVar = this.a;
        fbbf fbbfVar = akhxVar.b.fz;
        Context context = (Context) akhxVar.a.q.b();
        aorg aorgVar = new aorg();
        akis akisVar = this.a.a;
        fbbf fbbfVar2 = akisVar.cz;
        akkp akkpVar = akisVar.a;
        return new aork(fbbfVar, context, aorgVar, akkpVar.ru, akkpVar.rv, akkpVar.bM(), messageId, conversationId, alxjVar, bindData, alyaVar, appjVar, apugVar, aqcmVar, z, engwVar, ffbrVar, akkpVar.cD(), (cqoh) fbbfVar2.b());
    }
}
