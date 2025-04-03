package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class brvg extends dtro<brwa, brwo, brwp, brvg, brvz> implements dtrq<Long> {
    public String a;
    public long c;
    public ConversationIdType b = bdgq.a;
    public boolean d = false;
    public awwp e = awwp.UNKNOWN_STATE;
    public bdpy f = bdqb.b();

    protected brvg() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationParticipantsTable [_id: %s,\n  conversation_id: %s,\n  participant_id: %s,\n  is_normalized: %s,\n  rcs_group_join_status: %s,\n  last_modified_by_key: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = brww.d().intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.b)));
        }
        dtub.t(contentValues, "participant_id", this.c);
        if (intValue >= 58090) {
            contentValues.put("is_normalized", Boolean.valueOf(this.d));
        }
        if (intValue >= 58570) {
            awwp awwpVar = this.e;
            if (awwpVar == null) {
                contentValues.putNull("rcs_group_join_status");
            } else {
                contentValues.put("rcs_group_join_status", Integer.valueOf(awwpVar.e));
            }
        }
        if (intValue >= 59440) {
            bdpy bdpyVar = this.f;
            if (bdpyVar == null) {
                contentValues.putNull("last_modified_by_key");
            } else {
                contentValues.put("last_modified_by_key", bdqb.c(bdpyVar));
            }
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        brwh brwhVar = (brwh) ((brwa) dtsuVar);
        aB();
        this.cL = brwhVar.cU();
        if (brwhVar.di(0)) {
            this.a = brwhVar.i();
            super.fY(0);
        }
        if (brwhVar.di(1)) {
            this.b = brwhVar.g();
            super.fY(1);
        }
        if (brwhVar.di(2)) {
            this.c = brwhVar.e();
            super.fY(2);
        }
        if (brwhVar.di(3)) {
            this.d = brwhVar.j();
            super.fY(3);
        }
        if (brwhVar.di(4)) {
            this.e = brwhVar.f();
            super.fY(4);
        }
        if (brwhVar.di(5)) {
            this.f = brwhVar.h();
            super.fY(5);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brvg)) {
            return false;
        }
        brvg brvgVar = (brvg) obj;
        return super.aD(brvgVar.cL) && Objects.equals(this.a, brvgVar.a) && Objects.equals(this.b, brvgVar.b) && this.c == brvgVar.c && this.d == brvgVar.d && this.e == brvgVar.e && Objects.equals(this.f, brvgVar.f);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_participants", dtub.m(new String[]{"conversation_id", "participant_id", "is_normalized", "rcs_group_join_status", "last_modified_by_key"}));
    }

    @Override // defpackage.dtro
    public final void fY(int i) {
        super.fY(0);
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "conversation_participants";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, Long.valueOf(this.c), Boolean.valueOf(this.d), this.e, this.f, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new brvf(this).get();
        Long valueOf = Long.valueOf(this.c);
        Integer valueOf2 = Integer.valueOf(this.d ? 1 : 0);
        awwp awwpVar = this.e;
        Object[] objArr = {obj, valueOf, valueOf2, awwpVar == null ? 0 : String.valueOf(awwpVar.e), bdqb.c(this.f)};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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

    public final long k() {
        az(2, "participant_id");
        return this.c;
    }

    public final ConversationIdType l() {
        az(1, "conversation_id");
        return this.b;
    }

    public final /* synthetic */ void m(final Long l) {
        if (l.longValue() >= 0) {
            this.a = (String) new dtuj() { // from class: brvc
                @Override // defpackage.dtuj
                public final Object a() {
                    return String.valueOf(l);
                }
            }.a();
            super.fY(0);
        }
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationParticipantsTable -- REDACTED") : a();
    }
}
