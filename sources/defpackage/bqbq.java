package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqbq extends dtrr {
    public long a;
    public ConversationIdType b;
    public int c;

    public bqbq() {
        super(bqcp.a().P());
        this.b = bdgq.a;
        this.c = 0;
    }

    public final bqbo a() {
        bqbp bqbpVar = new bqbp();
        bqbpVar.aC(aB());
        bqbpVar.a = this.a;
        bqbpVar.b = this.b;
        bqbpVar.c = this.c;
        bqbpVar.cK = aC();
        return bqbpVar;
    }

    public final void b(int i) {
        aE(2);
        this.c = i;
    }

    public final void c(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }
}
