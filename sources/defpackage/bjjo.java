package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bjjo extends dtro {
    public long a;
    private ConversationIdType b = bdgq.a;
    private awwp c = awwp.UNKNOWN_STATE;
    private String d;
    private String e;

    protected bjjo() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationToParticipantsRcsGroupJoinStatusQuery [conversation_to_participants.conversation_to_participants_conversation_id: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  conversation_to_participants.conversation_to_participants_rcs_group_join_status: %s,\n  participants.participants__id: %s,\n  participants.participants_normalized_destination: %s\n]\n", String.valueOf(this.b), String.valueOf(this.a), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bjns bjnsVar = (bjns) dtsuVar;
        aB();
        this.cL = bjnsVar.cU();
        if (bjnsVar.di(0)) {
            this.b = new ConversationIdType(bjnsVar.getLong(bjnsVar.cM(0, bjnz.a)));
            fY(0);
        }
        if (bjnsVar.di(1)) {
            this.a = bjnsVar.getLong(bjnsVar.cM(1, bjnz.a));
            fY(1);
        }
        if (bjnsVar.di(2)) {
            this.c = awwp.b(bjnsVar.getInt(bjnsVar.cM(2, bjnz.a)));
            fY(2);
        }
        if (bjnsVar.di(3)) {
            this.d = bjnsVar.getString(bjnsVar.cM(3, bjnz.a));
            fY(3);
        }
        if (bjnsVar.di(4)) {
            this.e = cuxd.a(bjnsVar.getString(bjnsVar.cM(4, bjnz.a)));
            fY(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bjjo)) {
            return false;
        }
        bjjo bjjoVar = (bjjo) obj;
        return super.aD(bjjoVar.cL) && Objects.equals(this.b, bjjoVar.b) && this.a == bjjoVar.a && this.c == bjjoVar.c && Objects.equals(this.d, bjjoVar.d) && Objects.equals(this.e, bjjoVar.e);
    }

    public final awwp f() {
        az(2, "rcs_group_join_status");
        return this.c;
    }

    public final String g() {
        az(4, "normalized_destination");
        return this.e;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.b, Long.valueOf(this.a), this.c, this.d, this.e, null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationToParticipantsRcsGroupJoinStatusQuery -- REDACTED") : a();
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
    }
}
