package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class amzn extends dtro {
    private String b;
    private long[] g;
    private long[] h;
    private String i;
    private String[] j;
    private String[] k;
    private String[] l;
    private long[] m;
    private ConversationIdType a = bdgq.a;
    private byyy c = byyy.NAME_IS_AUTOMATIC;
    private long d = 0;
    private int e = 0;
    private int f = 0;

    protected amzn() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationsWithParticipantsFromConversationToParticipantsQuery [conversations.conversations__id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  conversation_to_participants.conversation_to_participants_rowid: %s,\n  participants.participants__id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_send_destination: %s,\n  participants.participants_comparable_destination: %s,\n  participants.participants_rowid: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), aJ(this.g), aJ(this.h), String.valueOf(this.i), aL(this.j), aL(this.k), aL(this.l), aJ(this.m));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        ankj.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        ankc ankcVar = (ankc) ((ankb) dtsuVar);
        aB();
        this.cL = ankcVar.cU();
        if (ankcVar.di(0)) {
            this.a = ankcVar.d();
            fY(0);
        }
        if (ankcVar.di(1)) {
            this.b = ankcVar.f();
            fY(1);
        }
        if (ankcVar.di(2)) {
            this.c = ankcVar.e();
            fY(2);
        }
        if (ankcVar.di(3)) {
            this.d = ankcVar.getLong(ankcVar.cM(3, ankj.a));
            fY(3);
        }
        if (ankcVar.di(4)) {
            this.e = ankcVar.getInt(ankcVar.cM(4, ankj.a));
            fY(4);
        }
        if (ankcVar.di(5)) {
            this.f = ankcVar.c();
            fY(5);
        }
        if (ankcVar.di(6)) {
            this.g = ankcVar.g();
            fY(6);
        }
        if (ankcVar.di(7)) {
            this.h = dtub.B(null, ankc.ds(ankcVar.getString(ankcVar.cM(7, ankj.a))));
            fY(7);
        }
        if (ankcVar.di(8)) {
            this.i = ankcVar.getString(ankcVar.cM(8, ankj.a));
            fY(8);
        }
        if (ankcVar.di(9)) {
            this.j = ankcVar.i();
            fY(9);
        }
        if (ankcVar.di(10)) {
            this.k = ankcVar.j();
            fY(10);
        }
        if (ankcVar.di(11)) {
            this.l = ankcVar.h();
            fY(11);
        }
        if (ankcVar.di(12)) {
            this.m = dtub.B(null, ankc.ds(ankcVar.getString(ankcVar.cM(12, ankj.a))));
            fY(12);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof amzn)) {
            return false;
        }
        amzn amznVar = (amzn) obj;
        return super.aD(amznVar.cL) && Objects.equals(this.a, amznVar.a) && Objects.equals(this.b, amznVar.b) && this.c == amznVar.c && this.d == amznVar.d && this.e == amznVar.e && this.f == amznVar.f && Arrays.equals(this.g, amznVar.g) && Arrays.equals(this.h, amznVar.h) && Objects.equals(this.i, amznVar.i) && Arrays.equals(this.j, amznVar.j) && Arrays.equals(this.k, amznVar.k) && Arrays.equals(this.l, amznVar.l) && Arrays.equals(this.m, amznVar.m);
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        ConversationIdType conversationIdType = this.a;
        String str = this.b;
        byyy byyyVar = this.c;
        return Objects.hash(dtsqVar2, conversationIdType, str, Integer.valueOf(byyyVar == null ? 0 : byyyVar.ordinal()), Long.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(Arrays.hashCode(this.g)), Integer.valueOf(Arrays.hashCode(this.h)), this.i, Integer.valueOf(Arrays.hashCode(this.j)), Integer.valueOf(Arrays.hashCode(this.k)), Integer.valueOf(Arrays.hashCode(this.l)), Integer.valueOf(Arrays.hashCode(this.m)), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationsWithParticipantsFromConversationToParticipantsQuery -- REDACTED") : a();
    }
}
