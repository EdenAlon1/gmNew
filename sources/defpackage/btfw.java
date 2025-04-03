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
public class btfw extends dtro implements dtrq {
    public ConversationIdType a = bdgq.a;
    public azsu b = null;
    public String c;

    protected btfw() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "GeminiConversationIdMappingsTable [conversation_id: %s,\n  my_identity_token: %s,\n  gemini_conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.a)));
        }
        azsu azsuVar = this.b;
        if (azsuVar == null || azsuVar.equals(null)) {
            contentValues.putNull("my_identity_token");
        } else {
            contentValues.put("my_identity_token", azsv.b(this.b));
        }
        dtub.u(contentValues, "gemini_conversation_id", this.c);
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        btgo btgoVar = (btgo) ((btgk) dtsuVar);
        aB();
        this.cL = btgoVar.cU();
        if (btgoVar.di(0)) {
            this.a = btgoVar.e();
            fY(0);
        }
        if (btgoVar.di(1)) {
            this.b = btgoVar.c();
            fY(1);
        }
        if (btgoVar.di(2)) {
            this.c = btgoVar.f();
            fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btfw)) {
            return false;
        }
        btfw btfwVar = (btfw) obj;
        return super.aD(btfwVar.cL) && Objects.equals(this.a, btfwVar.a) && Objects.equals(this.b, btfwVar.b) && Objects.equals(this.c, btfwVar.c);
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "gemini_conversation_id_mappings", dtub.m(new String[]{"conversation_id", "my_identity_token", "gemini_conversation_id"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "gemini_conversation_id_mappings";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, this.b, this.c, null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new btfu(this).get(), new btfv(this).get(), this.c};
        sb.append('(');
        for (int i = 0; i < 3; i++) {
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
        az(2, "gemini_conversation_id");
        return this.c;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "GeminiConversationIdMappingsTable -- REDACTED") : a();
    }
}
