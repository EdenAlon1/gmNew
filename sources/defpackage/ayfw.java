package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayfw extends aygb {
    private ConversationIdType a;
    private long b;
    private eoko c;
    private SuperSortLabel d;
    private boolean e;
    private byte f;

    @Override // defpackage.aygb
    public final aygc a() {
        ConversationIdType conversationIdType;
        eoko eokoVar;
        SuperSortLabel superSortLabel;
        if (this.f == 3 && (conversationIdType = this.a) != null && (eokoVar = this.c) != null && (superSortLabel = this.d) != null) {
            return new ayfx(conversationIdType, this.b, eokoVar, superSortLabel, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" conversationId");
        }
        if ((this.f & 1) == 0) {
            sb.append(" deleteTimestamp");
        }
        if (this.c == null) {
            sb.append(" origin");
        }
        if (this.d == null) {
            sb.append(" filter");
        }
        if ((this.f & 2) == 0) {
            sb.append(" onlyIfEmpty");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.aygb
    public final void b(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.a = conversationIdType;
    }

    @Override // defpackage.aygb
    public final void c(long j) {
        this.b = j;
        this.f = (byte) (this.f | 1);
    }

    @Override // defpackage.aygb
    public final void d(SuperSortLabel superSortLabel) {
        if (superSortLabel == null) {
            throw new NullPointerException("Null filter");
        }
        this.d = superSortLabel;
    }

    @Override // defpackage.aygb
    public final void e(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 2);
    }

    @Override // defpackage.aygb
    public final void f(eoko eokoVar) {
        if (eokoVar == null) {
            throw new NullPointerException("Null origin");
        }
        this.c = eokoVar;
    }
}
