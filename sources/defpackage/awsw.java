package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awsw extends awtj {
    private awui a;
    private ConversationIdType b;
    private Instant c;
    private eigd d;

    @Override // defpackage.awtj
    public final awtk a() {
        ConversationIdType conversationIdType;
        Instant instant;
        eigd eigdVar;
        awui awuiVar = this.a;
        if (awuiVar != null && (conversationIdType = this.b) != null && (instant = this.c) != null && (eigdVar = this.d) != null) {
            return new awsx(awuiVar, conversationIdType, instant, eigdVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" sender");
        }
        if (this.b == null) {
            sb.append(" conversationId");
        }
        if (this.c == null) {
            sb.append(" expiry");
        }
        if (this.d == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.awtj
    public final void b(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.b = conversationIdType;
    }

    @Override // defpackage.awtj
    public final void c(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null expiry");
        }
        this.c = instant;
    }

    @Override // defpackage.awtj
    public final void d(awui awuiVar) {
        if (awuiVar == null) {
            throw new NullPointerException("Null sender");
        }
        this.a = awuiVar;
    }

    @Override // defpackage.awtj
    public final void e(eigd eigdVar) {
        if (eigdVar == null) {
            throw new NullPointerException("Null status");
        }
        this.d = eigdVar;
    }
}
