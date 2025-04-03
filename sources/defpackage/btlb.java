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
public class btlb extends dtro implements dtrq {
    public long a;
    public String c;
    public String d;
    public boolean f;
    public cgiz g;
    public ConversationIdType b = bdgq.a;
    public boolean e = true;
    public long h = 0;
    public long i = 0;

    protected btlb() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "LighterConversationsTable [_id: %s,\n  conversation_id: %s,\n  business_id: %s,\n  lighter_conversation_id_json: %s,\n  read: %s,\n  is_last_message_outgoing: %s,\n  conversation_status: %s,\n  last_action_timestamp: %s,\n  sync_timestamp_ms: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        int intValue = btmu.c().intValue();
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.b)));
        }
        dtub.u(contentValues, "business_id", this.c);
        dtub.u(contentValues, "lighter_conversation_id_json", this.d);
        if (intValue >= 58700) {
            contentValues.put("read", Boolean.valueOf(this.e));
        }
        if (intValue >= 58810) {
            contentValues.put("is_last_message_outgoing", Boolean.valueOf(this.f));
        }
        if (intValue >= 59030) {
            cgiz cgizVar = this.g;
            if (cgizVar == null) {
                contentValues.putNull("conversation_status");
            } else {
                contentValues.put("conversation_status", Integer.valueOf(cgizVar.ordinal()));
            }
        }
        if (intValue >= 59040) {
            contentValues.put("last_action_timestamp", Long.valueOf(this.h));
        }
        if (intValue >= 59100) {
            contentValues.put("sync_timestamp_ms", Long.valueOf(this.i));
        }
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        btmk btmkVar = (btmk) ((btma) dtsuVar);
        aB();
        this.cL = btmkVar.cU();
        if (btmkVar.di(0)) {
            this.a = btmkVar.e();
            fY(0);
        }
        if (btmkVar.di(1)) {
            this.b = btmkVar.h();
            fY(1);
        }
        if (btmkVar.di(2)) {
            this.c = btmkVar.j();
            fY(2);
        }
        if (btmkVar.di(3)) {
            this.d = btmkVar.k();
            fY(3);
        }
        if (btmkVar.di(4)) {
            this.e = btmkVar.m();
            fY(4);
        }
        if (btmkVar.di(5)) {
            this.f = btmkVar.l();
            fY(5);
        }
        if (btmkVar.di(6)) {
            this.g = btmkVar.i();
            fY(6);
        }
        if (btmkVar.di(7)) {
            this.h = btmkVar.f();
            fY(7);
        }
        if (btmkVar.di(8)) {
            this.i = btmkVar.g();
            fY(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btlb)) {
            return false;
        }
        btlb btlbVar = (btlb) obj;
        return super.aD(btlbVar.cL) && this.a == btlbVar.a && Objects.equals(this.b, btlbVar.b) && Objects.equals(this.c, btlbVar.c) && Objects.equals(this.d, btlbVar.d) && this.e == btlbVar.e && this.f == btlbVar.f && this.g == btlbVar.g && this.h == btlbVar.h && this.i == btlbVar.i;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "lighter_conversations_table", dtub.m(new String[]{"conversation_id", "business_id", "lighter_conversation_id_json", "read", "is_last_message_outgoing", "conversation_status", "last_action_timestamp", "sync_timestamp_ms"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "lighter_conversations_table";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        Long valueOf = Long.valueOf(this.a);
        ConversationIdType conversationIdType = this.b;
        String str = this.c;
        String str2 = this.d;
        Boolean valueOf2 = Boolean.valueOf(this.e);
        Boolean valueOf3 = Boolean.valueOf(this.f);
        cgiz cgizVar = this.g;
        return Objects.hash(dtsqVar2, valueOf, conversationIdType, str, str2, valueOf2, valueOf3, Integer.valueOf(cgizVar == null ? 0 : cgizVar.ordinal()), Long.valueOf(this.h), Long.valueOf(this.i), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object obj = new btla(this).get();
        String str = this.c;
        String str2 = this.d;
        Integer valueOf = Integer.valueOf(this.e ? 1 : 0);
        Integer valueOf2 = Integer.valueOf(this.f ? 1 : 0);
        cgiz cgizVar = this.g;
        Object[] objArr = {obj, str, str2, valueOf, valueOf2, cgizVar == null ? 0 : String.valueOf(cgizVar.ordinal()), Long.valueOf(this.h), Long.valueOf(this.i)};
        sb.append('(');
        for (int i = 0; i < 8; i++) {
            Object obj2 = objArr[i];
            if (obj2 instanceof Number) {
                sb.append(String.valueOf(obj2));
            } else {
                if (obj2 instanceof String) {
                    String str3 = (String) obj2;
                    if (str3.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str3));
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "LighterConversationsTable -- REDACTED") : a();
    }
}
