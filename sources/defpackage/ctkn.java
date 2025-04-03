package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctkn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctko b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ long d;
    final /* synthetic */ MessageCoreData e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctkn(ctko ctkoVar, ConversationIdType conversationIdType, long j, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ctkoVar;
        this.c = conversationIdType;
        this.d = j;
        this.e = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctkn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        final MessageCoreData messageCoreData = this.e;
        ffji ffjiVar = new ffji() { // from class: ctkm
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                ArrayList arrayList = ((MessageData) MessageCoreData.this).i;
                Uri uri = (Uri) obj2;
                boolean z = false;
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (ffkj.e(((MessagePartCoreData) it.next()).v(), uri)) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        };
        ctko ctkoVar = this.b;
        ConversationIdType conversationIdType = this.c;
        long j = this.d;
        this.a = 1;
        if (ctkoVar.q(conversationIdType, ffjiVar, j, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ctkn(this.b, this.c, this.d, this.e, ffguVar);
    }
}
