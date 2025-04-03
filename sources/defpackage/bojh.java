package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bojh extends dtro {
    private ConversationIdType a = bdgq.a;
    private String b;

    protected bojh() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ParticipantsSearchFromConversationToParticipantsSubquery [conversation_to_participants.conversation_to_participants_conversation_id: %s,\n  participants.participants_lookup_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bonn bonnVar = (bonn) dtsuVar;
        aB();
        this.cL = bonnVar.cU();
        if (bonnVar.di(0)) {
            this.a = new ConversationIdType(bonnVar.getLong(bonnVar.cM(0, bons.a)));
            fY(0);
        }
        if (bonnVar.di(1)) {
            this.b = bonnVar.getString(bonnVar.cM(1, bons.a));
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bojh)) {
            return false;
        }
        bojh bojhVar = (bojh) obj;
        return super.aD(bojhVar.cL) && Objects.equals(this.a, bojhVar.a) && Objects.equals(this.b, bojhVar.b);
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ParticipantsSearchFromConversationToParticipantsSubquery -- REDACTED") : a();
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
    }
}
