package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btry extends dtrr {
    public String a;
    public ConversationIdType b;
    public MessageIdType c;
    public int d;
    public fbuk e;

    public btry() {
        super(bttf.h());
        this.b = bdgq.a;
        this.c = bdhb.a;
        this.d = 0;
    }

    public final btrw a() {
        btrx btrxVar = new btrx();
        btrxVar.aC(aB());
        btrxVar.a = this.a;
        btrxVar.b = this.b;
        btrxVar.c = this.c;
        btrxVar.d = this.d;
        btrxVar.e = this.e;
        btrxVar.cK = aC();
        return btrxVar;
    }

    public final void b(fbuk fbukVar) {
        aE(4);
        this.e = fbukVar;
    }

    public final void c(int i) {
        aE(3);
        this.d = i;
    }

    public final void d(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void e(MessageIdType messageIdType) {
        int i = this.aB;
        if (i < 20040) {
            dtub.w("message_id", i);
        }
        aE(2);
        this.c = messageIdType;
    }
}
