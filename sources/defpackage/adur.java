package defpackage;

import android.text.SpannableString;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adur extends aduw {
    private engr a;
    private engw b;
    private SpannableString c;
    private ConversationIdType d;

    @Override // defpackage.aduw
    public final aduy a() {
        ConversationIdType conversationIdType;
        engr engrVar = this.a;
        if (engrVar != null) {
            this.b = engrVar.g();
        } else if (this.b == null) {
            int i = engw.d;
            this.b = enou.a;
        }
        SpannableString spannableString = this.c;
        if (spannableString != null && (conversationIdType = this.d) != null) {
            return new adus(this.b, spannableString, conversationIdType);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" conversationName");
        }
        if (this.d == null) {
            sb.append(" conversationId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.aduw
    public final engr b() {
        if (this.a == null) {
            if (this.b == null) {
                int i = engw.d;
                this.a = new engr();
            } else {
                int i2 = engw.d;
                engr engrVar = new engr();
                this.a = engrVar;
                engrVar.j(this.b);
                this.b = null;
            }
        }
        return this.a;
    }

    @Override // defpackage.aduw
    public final void c(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.d = conversationIdType;
    }

    @Override // defpackage.aduw
    public final void d(SpannableString spannableString) {
        if (spannableString == null) {
            throw new NullPointerException("Null conversationName");
        }
        this.c = spannableString;
    }
}
