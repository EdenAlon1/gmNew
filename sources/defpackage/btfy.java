package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btfy extends dtrr {
    public ConversationIdType a;
    public azsu b;
    public String c;

    public btfy() {
        super(btgy.a().P());
        this.a = bdgq.a;
        this.b = null;
    }

    public final btfw a() {
        btfx btfxVar = new btfx();
        btfxVar.aC(aB());
        btfxVar.a = this.a;
        btfxVar.b = this.b;
        btfxVar.c = this.c;
        btfxVar.cK = aC();
        return btfxVar;
    }

    public final void b(ConversationIdType conversationIdType) {
        aE(0);
        this.a = conversationIdType;
    }

    public final void c(String str) {
        aE(2);
        this.c = str;
    }

    public final void d(azsu azsuVar) {
        aE(1);
        this.b = azsuVar;
    }
}
