package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class becl extends bfkr {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public ConversationIdType f;
    public Function g;
    public Integer h;
    private boolean i;
    private engw j;
    private byte k;

    @Override // defpackage.bfkr
    public final bfks a() {
        ConversationIdType conversationIdType;
        engw engwVar;
        if (this.k == 1 && (conversationIdType = this.f) != null && (engwVar = this.j) != null) {
            return new becm(this.a, this.b, this.c, this.d, this.e, this.i, conversationIdType, engwVar, this.g, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.k == 0) {
            sb.append(" whereApprovedByParent");
        }
        if (this.f == null) {
            sb.append(" conversationId");
        }
        if (this.j == null) {
            sb.append(" conversationIds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.bfkr
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null conversationIds");
        }
        this.j = engwVar;
    }

    @Override // defpackage.bfkr
    public final void c(boolean z) {
        this.i = z;
        this.k = (byte) 1;
    }
}
