package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqeq extends dtrr {
    public long a;
    public ConversationIdType b;
    public aven c;
    public int d;
    public avji e;
    public long f;

    public bqeq() {
        super(bqfx.e());
        this.b = bdgq.a;
        this.c = aven.b(0);
        this.e = avji.b(0);
    }

    public final bqeo a() {
        bqep bqepVar = new bqep();
        bqepVar.aC(aB());
        bqepVar.a = this.a;
        bqepVar.b = this.b;
        bqepVar.c = this.c;
        bqepVar.d = this.d;
        bqepVar.e = this.e;
        bqepVar.f = this.f;
        bqepVar.cK = aC();
        return bqepVar;
    }

    public final void b(aven avenVar) {
        aE(2);
        this.c = avenVar;
    }

    public final void c(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void d(avji avjiVar) {
        int i = this.aB;
        if (i < 59050) {
            dtub.w("conversation_toolstone_state", i);
        }
        aE(4);
        this.e = avjiVar;
    }

    public final void e(long j) {
        int i = this.aB;
        if (i < 59050) {
            dtub.w("conversation_toolstone_timestamp_ms", i);
        }
        aE(5);
        this.f = j;
    }
}
