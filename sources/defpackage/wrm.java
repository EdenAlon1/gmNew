package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class wrm extends ffkh implements ffjn {
    public wrm(Object obj) {
        super(3, obj, wrn.class, "addPeople", "addPeople(Ljava/util/List;Lcom/google/android/apps/messaging/shared/api/messaging/ConversationProperties;Lcom/google/android/apps/messaging/shared/api/messaging/ComposeConstraints;)V", 0);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        List list = (List) obj;
        alxj alxjVar = (alxj) obj2;
        alxg alxgVar = (alxg) obj3;
        list.getClass();
        alxjVar.getClass();
        alxgVar.getClass();
        wrn wrnVar = (wrn) this.g;
        twk.e((twk) wrnVar.f.b(), 16, -1, 3, 8);
        amfx amfxVar = (amfx) alxjVar;
        vyz vyzVar = (vyz) wrnVar.e.b();
        alxi b = amfxVar.b();
        alxi alxiVar = alxi.GROUP;
        int a = vyzVar.a(b == alxiVar, alxgVar.e().g, amfxVar.o(), amfxVar.A());
        aigz aigzVar = wrnVar.c;
        ConversationId conversationId = wrnVar.b;
        aqux f = alxjVar.f();
        aigzVar.h(new aiiw(conversationId, list, f != null ? f.g() : null, a));
        return ffcu.a;
    }
}
