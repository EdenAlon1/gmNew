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
public class brxg extends dtro implements dtrq {
    public long a;
    public ConversationIdType b = bdgq.a;
    public boolean c;

    protected brxg() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationPinTable [_id: %s,\n  conversation_id: %s,\n  pin_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(bdgq.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(bdgq.a(this.b)));
        }
        contentValues.put("pin_status", Boolean.valueOf(this.c));
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        brxx brxxVar = (brxx) ((brxt) dtsuVar);
        aB();
        this.cL = brxxVar.cU();
        if (brxxVar.di(0)) {
            this.a = brxxVar.e();
            super.fY(0);
        }
        if (brxxVar.di(1)) {
            this.b = brxxVar.f();
            super.fY(1);
        }
        if (brxxVar.di(2)) {
            this.c = brxxVar.g();
            super.fY(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof brxg)) {
            return false;
        }
        brxg brxgVar = (brxg) obj;
        return super.aD(brxgVar.cL) && this.a == brxgVar.a && Objects.equals(this.b, brxgVar.b) && this.c == brxgVar.c;
    }

    @Override // defpackage.dtrq
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_pin", dtub.m(new String[]{"conversation_id", "pin_status"}));
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
        return "conversation_pin";
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        return Objects.hash((dtsqVar == null || dtsqVar.b()) ? null : this.cL, Long.valueOf(this.a), this.b, Boolean.valueOf(this.c), null);
    }

    @Override // defpackage.dtrq
    public final void i(StringBuilder sb, List list) {
        Object[] objArr = {new brxf(this).get(), Integer.valueOf(this.c ? 1 : 0)};
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

    public final ConversationIdType k() {
        az(1, "conversation_id");
        return this.b;
    }

    public final /* synthetic */ void l(Long l) {
        if (l.longValue() >= 0) {
            this.a = new brxc(l).a.longValue();
            super.fY(0);
        }
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationPinTable -- REDACTED") : a();
    }
}
