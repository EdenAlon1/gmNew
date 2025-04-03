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
public class bthd extends dtro implements dtrq {
    public ConversationIdType a = bdgq.a;
    public boolean b;

    protected bthd() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "GeminiTable [conversation_id: %s,\n  desired_gemini_state: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.a;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.a)));
        }
        contentValues.put("desired_gemini_state", Boolean.valueOf(this.b));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        bthr bthrVar = (bthr) ((btho) dtsuVar);
        aB();
        this.cL = bthrVar.cU();
        if (bthrVar.di(0)) {
            this.a = bthrVar.c();
            fY(0);
        }
        if (bthrVar.di(1)) {
            this.b = bthrVar.e();
            fY(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bthd)) {
            return false;
        }
        bthd bthdVar = (bthd) obj;
        return super.aD(bthdVar.cL) && Objects.equals(this.a, bthdVar.a) && this.b == bthdVar.b;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "gemini", dtub.m(new String[]{"conversation_id", "desired_gemini_state"}));
    }

    @Override // defpackage.dtrq
    public final String g() {
        return null;
    }

    @Override // defpackage.dtrq
    public final String h() {
        return "gemini";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, this.a, Boolean.valueOf(this.b), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new bthc(this).get(), Integer.valueOf(this.b ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 2; i++) {
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
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "GeminiTable -- REDACTED") : a();
    }
}
