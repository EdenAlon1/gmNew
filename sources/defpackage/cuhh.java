package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cuhh extends dtro implements dtrq {
    public String b;
    public String d;
    public long e;
    public MessageIdType a = bdhb.a;
    public ConversationIdType c = bdgq.a;

    protected cuhh() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "SpamLoggingIdsTable [message_id: %s,\n  message_logging_id: %s,\n  conversation_id: %s,\n  conversation_logging_id: %s,\n  generation_timestamp: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.a)));
        }
        dtub.u(contentValues, "message_logging_id", this.b);
        ConversationIdType conversationIdType = this.c;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.c)));
        }
        dtub.u(contentValues, "conversation_logging_id", this.d);
        contentValues.put("generation_timestamp", Long.valueOf(this.e));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        cuih cuihVar = (cuih) ((cuib) dtsuVar);
        aB();
        this.cL = cuihVar.cU();
        if (cuihVar.di(0)) {
            this.a = cuihVar.f();
            fY(0);
        }
        if (cuihVar.di(1)) {
            this.b = cuihVar.h();
            fY(1);
        }
        if (cuihVar.di(2)) {
            this.c = cuihVar.e();
            fY(2);
        }
        if (cuihVar.di(3)) {
            this.d = cuihVar.g();
            fY(3);
        }
        if (cuihVar.di(4)) {
            this.e = cuihVar.c();
            fY(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cuhh)) {
            return false;
        }
        cuhh cuhhVar = (cuhh) obj;
        return super.aD(cuhhVar.cL) && Objects.equals(this.a, cuhhVar.a) && Objects.equals(this.b, cuhhVar.b) && Objects.equals(this.c, cuhhVar.c) && Objects.equals(this.d, cuhhVar.d) && this.e == cuhhVar.e;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "spam_logging_ids_table", dtub.m(new String[]{"message_id", "message_logging_id", "conversation_id", "conversation_logging_id", "generation_timestamp"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "spam_logging_ids_table";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, this.d, Long.valueOf(this.e), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new cuhf(this).get(), this.b, new cuhg(this).get(), this.d, Long.valueOf(this.e)};
        sb.append('(');
        for (int i = 0; i < 5; i++) {
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

    public final String k() {
        az(3, "conversation_logging_id");
        return this.d;
    }

    public final String l() {
        az(1, "message_logging_id");
        return this.b;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "SpamLoggingIdsTable -- REDACTED") : a();
    }
}
