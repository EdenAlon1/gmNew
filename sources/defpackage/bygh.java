package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bygh extends dtro {
    private long a;
    private ConversationIdType b = bdgq.a;

    protected bygh() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "UpdateConversationSuggestionsFromConversationIdSelection [conversation_suggestions.conversation_suggestions__id: %s,\n  messages.messages_conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bymw bymwVar = (bymw) dtsuVar;
        aB();
        this.cL = bymwVar.cU();
        if (bymwVar.di(0)) {
            this.a = bymwVar.getLong(bymwVar.cM(0, bynb.a));
            fY(0);
        }
        if (bymwVar.di(1)) {
            this.b = new ConversationIdType(bymwVar.getLong(bymwVar.cM(1, bynb.a)));
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bygh)) {
            return false;
        }
        bygh byghVar = (bygh) obj;
        return super.aD(byghVar.cL) && this.a == byghVar.a && Objects.equals(this.b, byghVar.b);
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "UpdateConversationSuggestionsFromConversationIdSelection -- REDACTED") : a();
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
    }
}
