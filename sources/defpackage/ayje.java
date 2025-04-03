package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ayje extends dtrr {
    public long a;
    public long b;
    public String c;
    public ConversationIdType d;

    public ayje() {
        super(aykg.a().P());
        this.d = bdgq.a;
    }

    public final ayjc a() {
        ayjd ayjdVar = new ayjd();
        ayjdVar.aC(aB());
        ayjdVar.a = this.a;
        ayjdVar.b = this.b;
        ayjdVar.c = this.c;
        ayjdVar.d = this.d;
        ayjdVar.cK = aC();
        return ayjdVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(3);
        this.d = conversationIdType;
    }

    public final void c(String str) {
        aE(2);
        this.c = str;
    }

    public final void d(long j) {
        aE(1);
        this.b = j;
    }
}
