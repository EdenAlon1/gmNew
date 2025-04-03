package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsaq extends dtro implements dtrq {
    public long a;
    public long c;
    public long e;
    public Instant b = Instant.EPOCH;
    public ConversationIdType d = bdgq.a;
    public awwp f = awwp.UNKNOWN_STATE;
    public bdpy g = bdpy.a;

    protected bsaq() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationToParticipantsAuditLogTable [_id: %s,\n  operation_datetime: %s,\n  operation_type: %s,\n  conversation_id: %s,\n  participant_id: %s,\n  rcs_group_join_status: %s,\n  last_modified_by_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("operation_datetime");
        } else {
            contentValues.put("operation_datetime", Long.valueOf(bdgw.a(instant)));
        }
        contentValues.put("operation_type", Long.valueOf(this.c));
        ConversationIdType conversationIdType = this.d;
        if (conversationIdType == null) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(conversationIdType)));
        }
        contentValues.put("participant_id", Long.valueOf(this.e));
        awwp awwpVar = this.f;
        if (awwpVar == null) {
            contentValues.putNull("rcs_group_join_status");
        } else {
            contentValues.put("rcs_group_join_status", Integer.valueOf(awwpVar.e));
        }
        bdpy bdpyVar = this.g;
        if (bdpyVar == null) {
            contentValues.putNull("last_modified_by_key");
        } else {
            contentValues.put("last_modified_by_key", bdqb.c(bdpyVar));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bsbs bsbsVar = (bsbs) ((bsbk) dtsuVar);
        aB();
        this.cL = bsbsVar.cU();
        if (bsbsVar.di(0)) {
            this.a = bsbsVar.c();
            fY(0);
        }
        if (bsbsVar.di(1)) {
            this.b = bsbsVar.j();
            fY(1);
        }
        if (bsbsVar.di(2)) {
            this.c = bsbsVar.e();
            fY(2);
        }
        if (bsbsVar.di(3)) {
            this.d = bsbsVar.h();
            fY(3);
        }
        if (bsbsVar.di(4)) {
            this.e = bsbsVar.f();
            fY(4);
        }
        if (bsbsVar.di(5)) {
            this.f = bsbsVar.g();
            fY(5);
        }
        if (bsbsVar.di(6)) {
            this.g = bsbsVar.i();
            fY(6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bsaq)) {
            return false;
        }
        bsaq bsaqVar = (bsaq) obj;
        return super.aD(bsaqVar.cL) && this.a == bsaqVar.a && Objects.equals(this.b, bsaqVar.b) && this.c == bsaqVar.c && Objects.equals(this.d, bsaqVar.d) && this.e == bsaqVar.e && this.f == bsaqVar.f && Objects.equals(this.g, bsaqVar.g);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_to_participants_audit_log", dtub.m(new String[]{"operation_datetime", "operation_type", "conversation_id", "participant_id", "rcs_group_join_status", "last_modified_by_key"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "conversation_to_participants_audit_log";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, Long.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, this.g, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Long valueOf = Long.valueOf(bdgw.a(this.b));
        Long valueOf2 = Long.valueOf(this.c);
        Long valueOf3 = Long.valueOf(bdgq.a(this.d));
        Long valueOf4 = Long.valueOf(this.e);
        awwp awwpVar = this.f;
        Object[] objArr = {valueOf, valueOf2, valueOf3, valueOf4, awwpVar == null ? 0 : String.valueOf(awwpVar.e), bdqb.c(this.g)};
        sb.append('(');
        for (int i = 0; i < 6; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj);
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationToParticipantsAuditLogTable -- REDACTED") : a();
    }
}
