package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bxbk extends dtrr {
    public String a;
    public MessageIdType b;
    public ConversationIdType c;
    public long d;
    public byzf e;

    public bxbk() {
        super(bxct.g());
        this.b = bdhb.a;
        this.c = bdgq.a;
        this.d = 0L;
        this.e = byzf.SET;
    }

    public final bxbi a() {
        bxbj bxbjVar = new bxbj();
        bxbjVar.aC(aB());
        bxbjVar.a = this.a;
        bxbjVar.b = this.b;
        bxbjVar.c = this.c;
        bxbjVar.d = this.d;
        bxbjVar.e = this.e;
        bxbjVar.cK = aC();
        return bxbjVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        int i = this.aB;
        if (i < 35070) {
            dtub.w("conversation_id", i);
        }
        aE(2);
        this.c = conversationIdType;
    }

    public final void c(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void d(long j) {
        aE(3);
        this.d = j;
    }
}
