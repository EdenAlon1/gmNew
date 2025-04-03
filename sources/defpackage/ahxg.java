package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahxg implements ffji {
    final /* synthetic */ xhu a;
    final /* synthetic */ ahxi b;
    final /* synthetic */ ConversationId c;

    public ahxg(xhu xhuVar, ahxi ahxiVar, ConversationId conversationId) {
        this.a = xhuVar;
        this.b = ahxiVar;
        this.c = conversationId;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        yds ydsVar;
        bswp bswpVar = (bswp) obj;
        bswpVar.getClass();
        bswpVar.h(this.a.a);
        ydu yduVar = (ydu) ydv.a.createBuilder();
        yduVar.getClass();
        DesugarCollections.unmodifiableList(((ydv) yduVar.instance).c).getClass();
        ArrayList<xho> arrayList = new ArrayList();
        Iterator it = this.a.b.iterator();
        ahxi ahxiVar = this.b;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            xhp xhpVar = (xhp) it.next();
            xho xhoVar = xhpVar instanceof xho ? (xho) xhpVar : null;
            if (xhoVar != null) {
                arrayList.add(xhoVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (xho xhoVar2 : arrayList) {
            try {
                ydr ydrVar = (ydr) yds.a.createBuilder();
                ydrVar.getClass();
                ydt.c(ahxiVar.b.a(xhoVar2.a), ydrVar);
                Uri uri = xhoVar2.b.c;
                if (uri != null) {
                    ydt.b(uri.toString(), ydrVar);
                }
                ydsVar = ydt.a(ydrVar);
            } catch (dpap e) {
                ConversationId conversationId = this.c;
                ensk i = ahxi.a.i();
                i.Y(ente.a, "BugleMultiShare");
                enrr enrrVar = (enrr) ((enrr) i).g(e);
                enrrVar.Y(csux.q, conversationId);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/multishare/editmessage/bottomcontent/composerow/draft/DraftPersistenceImpl", "trySerialize", 139, "DraftPersistenceImpl.kt")).t("Failed to serialize %s", xhoVar2);
                ydsVar = null;
            }
            if (ydsVar != null) {
                arrayList2.add(ydsVar);
            }
        }
        ydw.b(arrayList2, yduVar);
        bswpVar.b(ydw.a(yduVar));
        bswpVar.g(this.a.c);
        bswpVar.e(this.a.d);
        MessageId messageId = this.a.e;
        bswpVar.f(messageId != null ? messageId.a() : null);
        bswpVar.d(this.a.h);
        return ffcu.a;
    }
}
