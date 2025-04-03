package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class aykk extends dtro {
    private ConversationIdType a = bdgq.a;
    private int b = 0;
    private boolean c = false;
    private long[] d;
    private long[] e;
    private String f;
    private String[] g;
    private String[] h;
    private long[] i;

    protected aykk() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationsWithParticipantsFromConversationToParticipantsQuery [conversations.conversations__id: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  conversation_to_participants.conversation_to_participants_rowid: %s,\n  participants.participants__id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_send_destination: %s,\n  participants.participants_rowid: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), aJ(this.d), aJ(this.e), String.valueOf(this.f), aL(this.g), aL(this.h), aJ(this.i));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        ayvg.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        ayuz ayuzVar = (ayuz) ((ayuy) dtsuVar);
        aB();
        this.cL = ayuzVar.cU();
        if (ayuzVar.di(0)) {
            this.a = ayuzVar.c();
            fY(0);
        }
        if (ayuzVar.di(1)) {
            this.b = ayuzVar.getInt(ayuzVar.cM(1, ayvg.a));
            fY(1);
        }
        if (ayuzVar.di(2)) {
            this.c = ayuzVar.getInt(ayuzVar.cM(2, ayvg.a)) == 1;
            fY(2);
        }
        if (ayuzVar.di(3)) {
            this.d = dtub.B(null, ayuz.ds(ayuzVar.getString(ayuzVar.cM(3, ayvg.a))));
            fY(3);
        }
        if (ayuzVar.di(4)) {
            this.e = dtub.B(null, ayuz.ds(ayuzVar.getString(ayuzVar.cM(4, ayvg.a))));
            fY(4);
        }
        if (ayuzVar.di(5)) {
            this.f = ayuzVar.getString(ayuzVar.cM(5, ayvg.a));
            fY(5);
        }
        if (ayuzVar.di(6)) {
            this.g = ayuzVar.d();
            fY(6);
        }
        if (ayuzVar.di(7)) {
            this.h = ayuzVar.e();
            fY(7);
        }
        if (ayuzVar.di(8)) {
            this.i = dtub.B(null, ayuz.ds(ayuzVar.getString(ayuzVar.cM(8, ayvg.a))));
            fY(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aykk)) {
            return false;
        }
        aykk aykkVar = (aykk) obj;
        return super.aD(aykkVar.cL) && Objects.equals(this.a, aykkVar.a) && this.b == aykkVar.b && this.c == aykkVar.c && Arrays.equals(this.d, aykkVar.d) && Arrays.equals(this.e, aykkVar.e) && Objects.equals(this.f, aykkVar.f) && Arrays.equals(this.g, aykkVar.g) && Arrays.equals(this.h, aykkVar.h) && Arrays.equals(this.i, aykkVar.i);
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.d)), Integer.valueOf(Arrays.hashCode(this.e)), this.f, Integer.valueOf(Arrays.hashCode(this.g)), Integer.valueOf(Arrays.hashCode(this.h)), Integer.valueOf(Arrays.hashCode(this.i)), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationsWithParticipantsFromConversationToParticipantsQuery -- REDACTED") : a();
    }
}
