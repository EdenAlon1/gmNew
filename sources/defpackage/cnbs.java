package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnbs {
    public static final cnbt a(ConversationIdType conversationIdType, MessageIdType messageIdType, cmrl cmrlVar, cmrs cmrsVar, cmrm cmrmVar, cmry cmryVar) {
        conversationIdType.getClass();
        messageIdType.getClass();
        cmrlVar.getClass();
        cmrsVar.getClass();
        cmrmVar.getClass();
        cnbe cnbeVar = (cnbe) cnbf.a.createBuilder();
        String a = conversationIdType.a();
        cnbeVar.copyOnWrite();
        cnbf cnbfVar = (cnbf) cnbeVar.instance;
        a.getClass();
        cnbfVar.c = a;
        String b = messageIdType.b();
        cnbeVar.copyOnWrite();
        cnbf cnbfVar2 = (cnbf) cnbeVar.instance;
        b.getClass();
        cnbfVar2.d = b;
        cnbeVar.copyOnWrite();
        cnbf cnbfVar3 = (cnbf) cnbeVar.instance;
        cmrlVar.getClass();
        cnbfVar3.e = cmrlVar;
        cnbfVar3.b |= 1;
        cnbeVar.copyOnWrite();
        cnbf cnbfVar4 = (cnbf) cnbeVar.instance;
        cmrsVar.getClass();
        cnbfVar4.f = cmrsVar;
        cnbfVar4.b |= 2;
        cnbeVar.copyOnWrite();
        ((cnbf) cnbeVar.instance).g = cmrmVar.a();
        if (cmryVar != null) {
            cnbeVar.copyOnWrite();
            cnbf cnbfVar5 = (cnbf) cnbeVar.instance;
            cnbfVar5.h = cmryVar;
            cnbfVar5.b |= 4;
        }
        return new cnbt((cnbf) cnbeVar.build());
    }
}
