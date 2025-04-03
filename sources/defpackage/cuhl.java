package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cuhl extends dtrr {
    public MessageIdType a;
    public String b;
    public ConversationIdType c;
    public String d;
    public long e;

    public cuhl() {
        super(cuiq.a().P());
        this.a = bdhb.a;
        this.c = bdgq.a;
    }

    public final cuhh a(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        cuhh cuhhVar = (cuhh) obj;
        cuhhVar.aC(aB());
        cuhhVar.a = this.a;
        cuhhVar.b = this.b;
        cuhhVar.c = this.c;
        cuhhVar.d = this.d;
        cuhhVar.e = this.e;
        cuhhVar.cK = aC();
        return cuhhVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(2);
        this.c = conversationIdType;
    }

    public final void c(String str) {
        aE(3);
        this.d = str;
    }

    public final void d(long j) {
        aE(4);
        this.e = j;
    }

    public final void e(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }

    public final void f(String str) {
        aE(1);
        this.b = str;
    }
}
