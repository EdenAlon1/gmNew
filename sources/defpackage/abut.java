package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abut extends abuw {
    private epwn f;
    private ConversationIdType g;
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public Optional d = Optional.empty();
    private Optional h = Optional.empty();
    public Optional e = Optional.empty();

    @Override // defpackage.abuw
    public final abux a() {
        ConversationIdType conversationIdType;
        epwn epwnVar = this.f;
        if (epwnVar != null && (conversationIdType = this.g) != null) {
            return new abuu(epwnVar, conversationIdType, this.a, this.b, this.c, this.d, this.h, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" type");
        }
        if (this.g == null) {
            sb.append(" conversationId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.abuw
    public final void b(epwk epwkVar) {
        this.h = Optional.of(epwkVar);
    }

    @Override // defpackage.abuw
    public final void c(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.g = conversationIdType;
    }

    @Override // defpackage.abuw
    public final void d(epwn epwnVar) {
        if (epwnVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f = epwnVar;
    }
}
