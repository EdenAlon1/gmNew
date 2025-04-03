package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clcq extends ffhr {
    Object a;
    Object b;
    Object c;
    boolean d;
    /* synthetic */ Object e;
    final /* synthetic */ clcv f;
    int g;
    clcv h;
    String i;
    ChatMessage.Type j;
    clbk k;
    ConversationIdType l;
    aoks m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public clcq(clcv clcvVar, ffgu ffguVar) {
        super(ffguVar);
        this.f = clcvVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(null, this);
    }
}
