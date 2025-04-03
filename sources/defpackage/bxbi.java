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
/* loaded from: classes7.dex */
public class bxbi extends dtro implements dtrq {
    public String a;
    public MessageIdType b = bdhb.a;
    public ConversationIdType c = bdgq.a;
    public long d = 0;
    public byzf e = byzf.SET;

    protected bxbi() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "RemindersTable [_id: %s,\n  message_id: %s,\n  conversation_id: %s,\n  trigger_time: %s,\n  status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = bxct.e().intValue();
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bdhb.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bdhb.a(this.b)));
        }
        if (intValue >= 35070) {
            ConversationIdType conversationIdType = this.c;
            if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
                contentValues.putNull("conversation_id");
            } else {
                contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.c)));
            }
        }
        contentValues.put("trigger_time", Long.valueOf(this.d));
        byzf byzfVar = this.e;
        if (byzfVar == null) {
            contentValues.putNull("status");
        } else {
            contentValues.put("status", Integer.valueOf(byzfVar.ordinal()));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bxcg bxcgVar = (bxcg) ((bxca) dtsuVar);
        aB();
        this.cL = bxcgVar.cU();
        if (bxcgVar.di(0)) {
            this.a = bxcgVar.i();
            fY(0);
        }
        if (bxcgVar.di(1)) {
            this.b = bxcgVar.e();
            fY(1);
        }
        if (bxcgVar.di(2)) {
            this.c = bxcgVar.g();
            fY(2);
        }
        if (bxcgVar.di(3)) {
            this.d = bxcgVar.c();
            fY(3);
        }
        if (bxcgVar.di(4)) {
            this.e = bxcgVar.h();
            fY(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bxbi)) {
            return false;
        }
        bxbi bxbiVar = (bxbi) obj;
        return super.aD(bxbiVar.cL) && Objects.equals(this.a, bxbiVar.a) && Objects.equals(this.b, bxbiVar.b) && Objects.equals(this.c, bxbiVar.c) && this.d == bxbiVar.d && this.e == bxbiVar.e;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "reminders", dtub.m(new String[]{"message_id", "conversation_id", "trigger_time", "status"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "reminders";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        String str = this.a;
        MessageIdType messageIdType = this.b;
        ConversationIdType conversationIdType = this.c;
        Long valueOf = Long.valueOf(this.d);
        byzf byzfVar = this.e;
        return Objects.hash(dtsqVar2, str, messageIdType, conversationIdType, valueOf, Integer.valueOf(byzfVar == null ? 0 : byzfVar.ordinal()), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new bxbg(this).get();
        Object obj2 = new bxbh(this).get();
        Long valueOf = Long.valueOf(this.d);
        byzf byzfVar = this.e;
        Object[] objArr = {obj, obj2, valueOf, byzfVar == null ? 0 : String.valueOf(byzfVar.ordinal())};
        sb.append('(');
        for (int i = 0; i < 4; i++) {
            Object obj3 = objArr[i];
            if (obj3 instanceof Number) {
                sb.append(String.valueOf(obj3));
            } else {
                if (obj3 instanceof String) {
                    String str = (String) obj3;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj3);
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
        az(3, "trigger_time");
        return this.d;
    }

    public final ConversationIdType l() {
        az(2, "conversation_id");
        return this.c;
    }

    public final MessageIdType m() {
        az(1, "message_id");
        return this.b;
    }

    public final String n() {
        az(0, "_id");
        return this.a;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "RemindersTable -- REDACTED") : a();
    }
}
