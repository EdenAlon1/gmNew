package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brxi extends dtrr {
    public long a;
    public ConversationIdType b;
    public boolean c;

    public brxi() {
        super(bryh.b());
        this.b = bdgq.a;
    }

    public final brxg a() {
        brxh brxhVar = new brxh();
        brxhVar.aC(aB());
        brxhVar.a = this.a;
        brxhVar.b = this.b;
        brxhVar.c = this.c;
        brxhVar.cK = aC();
        return brxhVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void c(boolean z) {
        aE(2);
        this.c = z;
    }
}
