package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class bbis extends dtro implements dtrq {
    public long a;
    public int c;
    public boolean d;
    public boolean f;
    public ConversationIdType b = bdgq.a;
    public awwp e = awwp.b(0);

    protected bbis() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "BackupConversationParticipantsTable [_id: %s,\n  conversation_id: %s,\n  participant_id: %s,\n  is_normalized: %s,\n  rcs_group_join_status: %s,\n  is_c2p_only: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bbke.c().intValue();
        contentValues.put("_id", Long.valueOf(this.a));
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.b)));
        }
        contentValues.put("participant_id", Integer.valueOf(this.c));
        contentValues.put("is_normalized", Boolean.valueOf(this.d));
        awwp awwpVar = this.e;
        if (awwpVar == null) {
            contentValues.putNull("rcs_group_join_status");
        } else {
            contentValues.put("rcs_group_join_status", Integer.valueOf(awwpVar.e));
        }
        if (intValue >= 70) {
            contentValues.put("is_c2p_only", Boolean.valueOf(this.f));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bbjt bbjtVar = (bbjt) ((bbjm) dtsuVar);
        aB();
        this.cL = bbjtVar.cU();
        if (bbjtVar.di(0)) {
            this.a = bbjtVar.e();
            fY(0);
        }
        if (bbjtVar.di(1)) {
            this.b = bbjtVar.g();
            fY(1);
        }
        if (bbjtVar.di(2)) {
            this.c = bbjtVar.c();
            fY(2);
        }
        if (bbjtVar.di(3)) {
            this.d = bbjtVar.i();
            fY(3);
        }
        if (bbjtVar.di(4)) {
            this.e = bbjtVar.f();
            fY(4);
        }
        if (bbjtVar.di(5)) {
            this.f = bbjtVar.h();
            fY(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bbis)) {
            return false;
        }
        bbis bbisVar = (bbis) obj;
        return super.aD(bbisVar.cL) && this.a == bbisVar.a && Objects.equals(this.b, bbisVar.b) && this.c == bbisVar.c && this.d == bbisVar.d && this.e == bbisVar.e && this.f == bbisVar.f;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_participants_backup", dtub.m(new String[]{"_id", "conversation_id", "participant_id", "is_normalized", "rcs_group_join_status", "is_c2p_only"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "conversation_participants_backup";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), Boolean.valueOf(this.d), this.e, Boolean.valueOf(this.f), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Long valueOf = Long.valueOf(this.a);
        Object obj = new bbir(this).get();
        Integer valueOf2 = Integer.valueOf(this.c);
        Integer valueOf3 = Integer.valueOf(this.d ? 1 : 0);
        awwp awwpVar = this.e;
        Object[] objArr = {valueOf, obj, valueOf2, valueOf3, awwpVar == null ? 0 : String.valueOf(awwpVar.e), Integer.valueOf(this.f ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj2);
                sb.append('?');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    @Override // defpackage.dtrq
    @Deprecated
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "BackupConversationParticipantsTable -- REDACTED") : a();
    }
}
