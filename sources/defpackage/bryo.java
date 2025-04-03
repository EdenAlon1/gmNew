package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bryo extends dtro implements dtrq {
    public long a;
    public MessageIdType b = bdhb.a;
    public int c = 0;
    public String d;
    public String e;
    public String f;
    public bdhg g;
    public bdhg h;
    public boolean i;
    public long j;

    protected bryo() {
        bdhg bdhgVar = bdhg.a;
        this.g = bdhgVar;
        this.h = bdhgVar;
        this.i = false;
        this.j = 0L;
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationSuggestionsTable [_id: %s,\n  message_id: %s,\n  conversation_suggestion_type: %s,\n  properties: %s,\n  post_back_data: %s,\n  post_back_encoding: %s,\n  rcs_message_id: %s,\n  target_rcs_message_id: %s,\n  read: %s,\n  received_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bsam.c().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
        }
        contentValues.put("conversation_suggestion_type", Integer.valueOf(this.c));
        dtub.u(contentValues, "properties", this.d);
        dtub.u(contentValues, "post_back_data", this.e);
        dtub.u(contentValues, "post_back_encoding", this.f);
        if (intValue >= 11001) {
            bdhg bdhgVar = this.g;
            if (bdhgVar == null) {
                contentValues.putNull("rcs_message_id");
            } else {
                contentValues.put("rcs_message_id", bdhg.d(bdhgVar));
            }
        }
        if (intValue >= 12000) {
            bdhg bdhgVar2 = this.h;
            if (bdhgVar2 == null) {
                contentValues.putNull("target_rcs_message_id");
            } else {
                contentValues.put("target_rcs_message_id", bdhg.d(bdhgVar2));
            }
        }
        if (intValue >= 12000) {
            contentValues.put("read", Boolean.valueOf(this.i));
        }
        if (intValue >= 12000) {
            contentValues.put("received_timestamp", Long.valueOf(this.j));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bsaa bsaaVar = (bsaa) ((brzp) dtsuVar);
        aB();
        this.cL = bsaaVar.cU();
        if (bsaaVar.di(0)) {
            this.a = bsaaVar.e();
            fY(0);
        }
        if (bsaaVar.di(1)) {
            this.b = bsaaVar.g();
            fY(1);
        }
        if (bsaaVar.di(2)) {
            this.c = bsaaVar.c();
            fY(2);
        }
        if (bsaaVar.di(3)) {
            this.d = bsaaVar.l();
            fY(3);
        }
        if (bsaaVar.di(4)) {
            this.e = bsaaVar.j();
            fY(4);
        }
        if (bsaaVar.di(5)) {
            this.f = bsaaVar.k();
            fY(5);
        }
        if (bsaaVar.di(6)) {
            this.g = bsaaVar.h();
            fY(6);
        }
        if (bsaaVar.di(7)) {
            this.h = bsaaVar.i();
            fY(7);
        }
        if (bsaaVar.di(8)) {
            this.i = bsaaVar.m();
            fY(8);
        }
        if (bsaaVar.di(9)) {
            this.j = bsaaVar.f();
            fY(9);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bryo)) {
            return false;
        }
        bryo bryoVar = (bryo) obj;
        return super.aD(bryoVar.cL) && this.a == bryoVar.a && Objects.equals(this.b, bryoVar.b) && this.c == bryoVar.c && Objects.equals(this.d, bryoVar.d) && Objects.equals(this.e, bryoVar.e) && Objects.equals(this.f, bryoVar.f) && Objects.equals(this.g, bryoVar.g) && Objects.equals(this.h, bryoVar.h) && this.i == bryoVar.i && this.j == bryoVar.j;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_suggestions", dtub.m(new String[]{"message_id", "conversation_suggestion_type", "properties", "post_back_data", "post_back_encoding", "rcs_message_id", "target_rcs_message_id", "read", "received_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "conversation_suggestions";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new bryn(this).get(), Integer.valueOf(this.c), this.d, this.e, this.f, bdhg.d(this.g), bdhg.d(this.h), Integer.valueOf(this.i ? 1 : 0), Long.valueOf(this.j)};
        sb.append('(');
        for (int i = 0; i < 9; i++) {
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

    public final int k() {
        az(2, "conversation_suggestion_type");
        return this.c;
    }

    public final MessageIdType l() {
        az(1, "message_id");
        return this.b;
    }

    public final bdhg m() {
        az(6, "rcs_message_id");
        return this.g;
    }

    public final bdhg n() {
        az(7, "target_rcs_message_id");
        return this.h;
    }

    public final String o() {
        az(4, "post_back_data");
        return this.e;
    }

    public final String q() {
        az(5, "post_back_encoding");
        return this.f;
    }

    public final String r() {
        az(3, "properties");
        return this.d;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationSuggestionsTable -- REDACTED") : a();
    }
}
