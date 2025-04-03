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
public class brti extends dtro implements dtrq {
    public String a;
    public long c;
    public String d;
    public long f;
    public boolean g;
    public Instant b = Instant.EPOCH;
    public ConversationIdType e = bdgq.a;
    public awwp h = awwp.UNKNOWN_STATE;
    public bdpy i = bdpy.a;

    protected brti() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationParticipantsAuditLogTable [_id: %s,\n  operation_datetime: %s,\n  operation_type: %s,\n  conversation_participants_id: %s,\n  conversation_id: %s,\n  participant_id: %s,\n  is_normalized: %s,\n  rcs_group_join_status: %s,\n  last_modified_by_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = brux.c().intValue();
        Instant instant = this.b;
        if (instant == null) {
            contentValues.putNull("operation_datetime");
        } else {
            contentValues.put("operation_datetime", Long.valueOf(bdgw.a(instant)));
        }
        contentValues.put("operation_type", Long.valueOf(this.c));
        dtub.u(contentValues, "conversation_participants_id", this.d);
        ConversationIdType conversationIdType = this.e;
        if (conversationIdType == null) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(conversationIdType)));
        }
        contentValues.put("participant_id", Long.valueOf(this.f));
        contentValues.put("is_normalized", Boolean.valueOf(this.g));
        awwp awwpVar = this.h;
        if (awwpVar == null) {
            contentValues.putNull("rcs_group_join_status");
        } else {
            contentValues.put("rcs_group_join_status", Integer.valueOf(awwpVar.e));
        }
        if (intValue >= 59440) {
            bdpy bdpyVar = this.i;
            if (bdpyVar == null) {
                contentValues.putNull("last_modified_by_key");
            } else {
                contentValues.put("last_modified_by_key", bdqb.c(bdpyVar));
            }
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bruq bruqVar = (bruq) ((brug) dtsuVar);
        aB();
        this.cL = bruqVar.cU();
        if (bruqVar.di(0)) {
            this.a = bruqVar.k();
            fY(0);
        }
        if (bruqVar.di(1)) {
            this.b = bruqVar.i();
            fY(1);
        }
        if (bruqVar.di(2)) {
            this.c = bruqVar.c();
            fY(2);
        }
        if (bruqVar.di(3)) {
            this.d = bruqVar.j();
            fY(3);
        }
        if (bruqVar.di(4)) {
            this.e = bruqVar.g();
            fY(4);
        }
        if (bruqVar.di(5)) {
            this.f = bruqVar.e();
            fY(5);
        }
        if (bruqVar.di(6)) {
            this.g = bruqVar.l();
            fY(6);
        }
        if (bruqVar.di(7)) {
            this.h = bruqVar.f();
            fY(7);
        }
        if (bruqVar.di(8)) {
            this.i = bruqVar.h();
            fY(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brti)) {
            return false;
        }
        brti brtiVar = (brti) obj;
        return super.aD(brtiVar.cL) && Objects.equals(this.a, brtiVar.a) && Objects.equals(this.b, brtiVar.b) && this.c == brtiVar.c && Objects.equals(this.d, brtiVar.d) && Objects.equals(this.e, brtiVar.e) && this.f == brtiVar.f && this.g == brtiVar.g && this.h == brtiVar.h && Objects.equals(this.i, brtiVar.i);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_participants_audit_log", dtub.m(new String[]{"operation_datetime", "operation_type", "conversation_participants_id", "conversation_id", "participant_id", "is_normalized", "rcs_group_join_status", "last_modified_by_key"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "conversation_participants_audit_log";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, Long.valueOf(this.c), this.d, this.e, Long.valueOf(this.f), Boolean.valueOf(this.g), this.h, this.i, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Long valueOf = Long.valueOf(bdgw.a(this.b));
        Long valueOf2 = Long.valueOf(this.c);
        String str = this.d;
        Long valueOf3 = Long.valueOf(bdgq.a(this.e));
        Long valueOf4 = Long.valueOf(this.f);
        Integer valueOf5 = Integer.valueOf(this.g ? 1 : 0);
        awwp awwpVar = this.h;
        Object[] objArr = {valueOf, valueOf2, str, valueOf3, valueOf4, valueOf5, awwpVar == null ? 0 : String.valueOf(awwpVar.e), bdqb.c(this.i)};
        sb.append('(');
        for (int i = 0; i < 8; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (str2.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str2));
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

    public final long k() {
        az(5, "participant_id");
        return this.f;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationParticipantsAuditLogTable -- REDACTED") : a();
    }
}
